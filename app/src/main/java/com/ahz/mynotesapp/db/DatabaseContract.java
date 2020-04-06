package com.ahz.mynotesapp.db;

import android.provider.BaseColumns;

public class DatabaseContract {

    public static final class NoteColumns implements BaseColumns{
        public static String TABLE_NAME = "note";
        // Note title
        public static String TITLE = "title";
        // Note Description
        public static String DESCRIPTION = "description";
        // Note Date
        public static String DATE = "date";
    }
}
