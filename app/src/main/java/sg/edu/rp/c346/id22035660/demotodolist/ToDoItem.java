package sg.edu.rp.c346.id22035660.demotodolist;

import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH)
                + "/" + date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {
        // Complete the code here
            if (day == Calendar.SUNDAY) {
                return "Sunday";
            } else if (day == Calendar.MONDAY) {
                return "Monday";
            } else if (day == Calendar.TUESDAY) {
                return "Tuesday";
            } else if (day == Calendar.WEDNESDAY) {
                return "Wednesday";
            } else if (day == Calendar.THURSDAY) {
                return "Thursday";
            } else if (day == Calendar.FRIDAY) {
                return "Friday";
            } else if (day == Calendar.SATURDAY) {
                return "Saturday";
            } else {
                return "Unknown Day";
            }

        }
    }

