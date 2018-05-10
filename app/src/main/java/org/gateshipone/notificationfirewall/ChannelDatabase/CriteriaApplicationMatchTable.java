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

public class CriteriaApplicationMatchTable {
    /**
     * Table name of the SQL table inside a database
     */
    public static final String SQL_TABLE_NAME = "criteria_app_match";

    /**
     * Column descriptions
     */
    public static final String COLUMN_APP_MATCH_ID = "id";

    public static final String COLUMN_APP_MATCH_NAME = "name";

    /**
     * Value text to match the notification with
     */
    public static final String COLUMN_APP_MATCH_PACKAGE = "package";

    public static final String COLUMN_APP_MATCH_CREATION_DATE = "creation_date";

    /**
     * Each package match criteria can only be attached to one match criteria
     */
    public static final String COLUMN_APP_MATCH_CRITERIA_ID = "criteria_id";

    public static final String COLUMN_APP_MATCH_ENABLED = "enabled";


    /**
     * Projection string array used for queries on this table
     */
    public static final String[] PROJECTION_APP_MATCH = {COLUMN_APP_MATCH_ID, COLUMN_APP_MATCH_NAME,
            COLUMN_APP_MATCH_PACKAGE, COLUMN_APP_MATCH_CRITERIA_ID, COLUMN_APP_MATCH_CREATION_DATE, COLUMN_APP_MATCH_ENABLED};



    /**
     * String to initially create the table
     */
    public static final String DATABASE_CREATE = "create table if not exists " +  SQL_TABLE_NAME + " (" +
            COLUMN_APP_MATCH_NAME + " text," + COLUMN_APP_MATCH_PACKAGE + " text," +
            COLUMN_APP_MATCH_CRITERIA_ID + " integer," + COLUMN_APP_MATCH_CREATION_DATE + " text," +
            COLUMN_APP_MATCH_ENABLED + " text," +
            COLUMN_APP_MATCH_ID  + " integer PRIMARY KEY " + " );";

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
