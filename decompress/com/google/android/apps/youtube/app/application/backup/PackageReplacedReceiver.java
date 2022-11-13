// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application.backup;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class PackageReplacedReceiver extends BroadcastReceiver
{
    public final void onReceive(final Context context, final Intent intent) {
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            YouTubeBackupAgent.d(context);
        }
    }
}
