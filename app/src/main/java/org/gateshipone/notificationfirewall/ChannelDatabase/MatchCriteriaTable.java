/*
 * Copyright (C) 2018 Team Gateship-One
 * (Hendrik Borghorst & Frederik Luetkes)
 *
 * The AUTHORS.md file contains a detailed contributors list:
 * <https://github.com/gateship-one/FIXME/blob/master/AUTHORS.md>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.gateshipone.notificationfirewall.ChannelDatabase;

import android.database.sqlite.SQLiteDatabase;

public class MatchCriteriaTable {
    /**
     * Table name of the SQL table inside a database
     */
    public static final String SQL_TABLE_NAME = "match_criteria";

    /**
     * Column descriptions
     */
    public static final String COLUMN_MATCH_ID = "id";

    public static final String COLUMN_MATCH_NAME = "name";

    /**
     * Value text to match the notification with
     */
    public static final String COLUMN_MATCH_VALUE = "value";

    /**
     * Can be used for later contains, begins, ends with types
     */
    public static final String COLUMN_MATCH_TYPE = "type";
    public static final String COLUMN_MATCH_CREATION_DATE = "creation_date";

    /**
     * Can be used for android.title, android.text or other extras
     */
    public static final String COLUMN_MATCH_NOTIFICATION_EXTRA_NAME = "extra_name";

    /**
     * Each match criteria can only be attached to one channel
     */
    public static final String COLUMN_MATCH_NOTIFICATION_CHANNEL_ID = "channel_id";

    public static final String COLUMN_MATCH_ENABLED = "enabled";


    /**
     * Projection string array used for queries on this table
     */
    public static final String[] PROJECTION_MATCH_CRITERIA = {COLUMN_MATCH_ID, COLUMN_MATCH_NAME,
            COLUMN_MATCH_VALUE, COLUMN_MATCH_TYPE, COLUMN_MATCH_CREATION_DATE, COLUMN_MATCH_NOTIFICATION_EXTRA_NAME,
            COLUMN_MATCH_NOTIFICATION_CHANNEL_ID,COLUMN_MATCH_ENABLED};



    /**
     * String to initially create the table
     */
    public static final String DATABASE_CREATE = "create table if not exists " +  SQL_TABLE_NAME + " (" +
            COLUMN_MATCH_NAME + " text," + COLUMN_MATCH_VALUE + " text," +
            COLUMN_MATCH_TYPE + " text," + COLUMN_MATCH_CREATION_DATE + " text," +
            COLUMN_MATCH_NOTIFICATION_EXTRA_NAME + " text," +
            COLUMN_MATCH_NOTIFICATION_CHANNEL_ID + " integer," +
            COLUMN_MATCH_ENABLED + " text," +
            COLUMN_MATCH_ID  + " integer PRIMARY KEY " + " );";

    /**
     * Creates the inital database table.
     * @param database Database to use for table creation.
     */
    public static void onCreate(SQLiteDatabase database) {
        /*
         * Create table in the given database here.
         */
        database.execSQL(DATABASE_CREATE);
    }
}
