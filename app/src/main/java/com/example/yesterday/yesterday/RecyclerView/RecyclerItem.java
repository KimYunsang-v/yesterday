package com.example.yesterday.yesterday.RecyclerView;

import android.os.Parcel;
import android.os.Parcelable;

public class RecyclerItem  implements Parcelable {

    String userID;
    String food;
    int count;
    String startDate;
    String endDate;
    int favorite;

    //count 랑 favorite DB에는 int로  정의 되어있음

    public RecyclerItem(String userID,String food,int count,String startDate,String endDate,int favorite){
        this.userID = userID;
        this.food = food;
        this.count = count;
        this.startDate = startDate;
        this.endDate = endDate;
        this.favorite = favorite;
    }
    //Fragment 간 리스트 전달 하기 위함
    protected RecyclerItem(Parcel in) {
        userID = in.readString();
        food = in.readString();
        count = in.readInt();
        startDate = in.readString();
        endDate = in.readString();
        favorite = in.readInt();
    }

    //Fragment 간 리스트 전달 하기 위함
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userID);
        dest.writeString(food);
        dest.writeInt(count);
        dest.writeString(startDate);
        dest.writeString(endDate);
        dest.writeInt(favorite);
    }

    //Fragment 간 리스트 전달 하기 위함
    @Override
    public int describeContents() {
        return 0;
    }

    //Fragment 간 리스트 전달 하기 위함
    public static final Creator<RecyclerItem> CREATOR = new Creator<RecyclerItem>() {
        @Override
        public RecyclerItem createFromParcel(Parcel in) {
            return new RecyclerItem(in);
        }

        @Override
        public RecyclerItem[] newArray(int size) {
            return new RecyclerItem[size];
        }
    };

    public void setUserID(String userID){ this.userID =userID; }
    public String getUserID(){ return userID; }

    public void setFood(String food){ this.food = food; }
    public String getFood(){ return food; }

    public void setCount(int count){ this.count = count; }
    public int getCount(){ return count; }

    public void setStartDate(String startDate){ this.startDate = startDate; }
    public String getStartDate(){ return startDate; }

    public void setEndDate(String endDate){ this.endDate = endDate; }
    public String getEndDate(){ return endDate; }

    public void setFavorite(int favorite){ this.favorite = favorite; }
    public int getFavorite(){ return favorite; }

}
