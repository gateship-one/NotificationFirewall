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

public class ChannelsTable {
    /**
     * Table name of the SQL table inside a database
     */
    public static final String SQL_TABLE_NAME = "notification_channels";

    /**
     * Column descriptions
     */
    public static final String COLUMN_CHANNEL_ID = "id";

    public static final String COLUMN_CHANNEL_NAME = "name";
    public static final String COLUMN_CHANNEL_INTERNAL_NAME = "id";
    public static final String COLUMN_CHANNEL_CREATION_DATE = "creation_date";
    public static final String COLUMN_CHANNEL_ENABLED = "enabled";

    /**
     * Projection string array used for queries on this table
     */
    public static final String[] PROJECTION_NOTIFICATION_CHANNELS = {COLUMN_CHANNEL_ID, COLUMN_CHANNEL_NAME,
            COLUMN_CHANNEL_INTERNAL_NAME, COLUMN_CHANNEL_CREATION_DATE, COLUMN_CHANNEL_ENABLED};



    /**
     * String to initially create the table
     */
    public static final String DATABASE_CREATE = "create table if not exists " +  SQL_TABLE_NAME + " (" +
        COLUMN_CHANNEL_NAME + " text," + COLUMN_CHANNEL_INTERNAL_NAME + " text," +
        COLUMN_CHANNEL_INTERNAL_NAME + " text," + COLUMN_CHANNEL_CREATION_DATE + " text," +
        COLUMN_CHANNEL_ID  + " integer PRIMARY KEY " + " );";

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
