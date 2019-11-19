package io.turntabl.springgettingstarted;

public class HumanBean {
    public String fname;
    public String lname;
    public HumanBean bestFriend;


    public HumanBean(){}

    public String getFName(){return this.fname;}

    public void setFName(String fname){this.fname = fname;}

    public String getLName(){return this.lname;}

    public void setLName(String lname){this.lname = lname;}

    public HumanBean getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(HumanBean bestFriend) {
        this.bestFriend = bestFriend;
    }
}
