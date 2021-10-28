package com.company;




//Program getter and setter methods

class Student2
{
    private int sno;
    private String name;

    //accessor method
    public int getSno()
    {
        return sno;
    }
    public String getName()
    {
        return name;
    }

    //mutator methods
    public void setNo(int sno)
    {
        this.sno=sno;
    }

    public void setName(String name)
    {
        this.name=name;
    }


    void methodA()
    {
        System.out.println(sno+" "+name);
    }
}

class HostelStudent extends Student2
{
    int roomno;

    public void setRoomno(int roomno)
    {
        this.roomno=roomno;
    }

    public int getRoomno()
    {
        return roomno;
    }

    public void methodB()

    {
        System.out.println(roomno);
    }
}
class Inheritance_Getter_Setter
{
    public static void main(String args[])
    {
        Student2 s1=new Student2();
        s1.setNo(101);
        s1.setName("Neha");
//s1.methodA();
        System.out.println(s1.getSno());
        System.out.println(s1.getName());

        HostelStudent hs=new HostelStudent();
        hs.setNo(102);
        hs.setName("Karthik");
        hs.setRoomno(345);
        System.out.println(hs.getSno());
        System.out.println(hs.getName());
        System.out.println(hs.getRoomno());

        int num=hs.getSno();
        System.out.println(num);

//hs.methodA();
//hs.methodB();

    }
}
