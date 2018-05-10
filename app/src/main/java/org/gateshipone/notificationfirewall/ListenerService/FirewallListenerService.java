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

package org.gateshipone.notificationfirewall.ListenerService;

import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class FirewallListenerService extends NotificationListenerService {
    private static final String TAG = FirewallListenerService.class.getSimpleName();
    private boolean mListenerConnected;

    @Override
    public void onListenerConnected() {
        mListenerConnected = true;
    }


    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        // FIXME remove me for privacy reasons
        Log.v(TAG,"onNotificationPosted: " + sbn.getPackageName() + ": " + sbn.toString());

        Bundle extras = sbn.getNotification().extras;

        if (extras != null) {
            if(extras.containsKey("android.title")) {
                Log.v(TAG,"android.title: " + extras.getString("android.title"));
            }

            if(extras.containsKey("android.text")) {
                Log.v(TAG,"android.text: " + extras.getString("android.text"));
            }
        }
    }
}
