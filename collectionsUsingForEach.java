package com.zoho;

import java.util.ArrayList;
import java.util.Scanner;

class UserInfo{
    int id;
    String name;
    int age;
    long number;

    public UserInfo(int id,String name,int age, long number){
        this.id=id;
        this.name=name;
        this.age=age;
        this.number=number;
    }
}

public class collectionsUsingForEach {
    public static void main(String[] args) {

                UserInfo user1= new UserInfo(1,"Rishi",23,9876546781L);
                UserInfo user2 = new UserInfo(2,"Sunil",22,9867463245L);
                UserInfo user3=new UserInfo(3,"Mohan",24,9565342678L);

                ArrayList<UserInfo> userInfos = new ArrayList<>();
                userInfos.add(user1);
                userInfos.add(user2);
                userInfos.add(user3);

                Scanner sc =new Scanner(System.in);
                System.out.println("Enter the id number form 1 to 3 : ");

                int idNumber=sc.nextInt();

                for(UserInfo a: userInfos){
                    if(a.id==idNumber)
                        System.out.println(a.id + " " + a.name + " " + a.age + " " + a.number);
                }
    }
}
