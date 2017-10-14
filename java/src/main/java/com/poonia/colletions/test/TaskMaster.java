package com.poonia.colletions.test;

import java.util.TimerTask;

public class TaskMaster extends TimerTask{

       String strObject;

       public TaskMaster(String strObject){

           this.strObject = strObject;

       }

       public void run(){

           System.out.println("Inside Run task-" + strObject);

       }
}
