package ru.netology.domain;

public class Date {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Calendar cal = Calendar.getInstance();
    System.out.println (dateFormat.format(cal.getTime()));
        }


