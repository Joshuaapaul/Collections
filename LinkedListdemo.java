package com.LinkedListDemo;


import java.util.*;

public class LinkedListdemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> info = new LinkedList<>();
        Student s1 = new Student(1,"joshua",24,"male");
        Student s2 = new Student(2,"paul",20,"male");
        Student s3 = new Student(3,"kailash",20,"male");
        Student s4 = new Student(4,"parthiban",23,"male");
        Student s5 = new Student(5,"Rakesh",22, "male");
        info.add(s1);
        info.add(s2);
        info.add(0,s3);  //adding the object in the 0 index.
        info.add(s4);
        info.add(s5);
        info.remove(2);  // removing 3rd element.

        /*for(Student s : info){
            //if(s.getId()==3)
            System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getGender());  //printing all elements of list.
        }*/

        /*Student data = info.get(1);
        System.out.println(data.getId()+" "+data.getName()+" "+data.getAge()+" "+data.getGender());*/  //specific student info.

        LinkedList<Student> info1 = new LinkedList<Student>(info);  //adding list to another list.

        /*Collections.sort(info1, new Comparator<Student>() {      //sort by name of students in list.
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        //Collections.shuffle(info1);    //Shuffle the list.
        //Collections.reverse(info1);    //reverse the list.

        /*for(Student s : info1){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getGender());
        }*/

       List<Student> info2 = info1.subList(0,2);  // Extract portion of list.


        Collections.swap(info,3,0);    // Swapping to elements.

        for(Student s : info){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getGender());
        }

        //type casting cloned list to the Student class from object class.
        List<Student> info5 = (List<Student>) info.clone();  // clone the list.















    }
}
