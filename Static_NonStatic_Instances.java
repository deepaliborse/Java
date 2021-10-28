package com.company;

// static and nonstatic instance fields


class Static_NonStatic_Instances
{
    int id = assignId();

    static int nextId=1;

    static int assignId()
    { int r = nextId;
        nextId++;
        return r;
    }

    public static void main(String args[])
    {
        System.out.println(Static_NonStatic_Instances.nextId);

        Static_NonStatic_Instances e1=new Static_NonStatic_Instances();
        System.out.println(e1.id);

        Static_NonStatic_Instances e2=new Static_NonStatic_Instances();
        System.out.println(e2.id);
    }
}
