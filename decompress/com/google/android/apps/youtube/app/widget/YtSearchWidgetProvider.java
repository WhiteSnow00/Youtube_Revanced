// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.widget;

import android.os.Bundle;
import android.widget.RemoteViews;
import android.appwidget.AppWidgetManager;
import android.content.ClipData;
import android.content.Intent;
import android.app.PendingIntent;
import android.net.Uri;
import android.content.Context;

public final class YtSearchWidgetProvider extends nqc
{
    public static PendingIntent a(final Context context, final Uri uri) {
        final Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setClassName(context.getPackageName(), "com.google.android.youtube.UrlActivity");
        intent.putExtra("Setdata", "IamNotNoise");
        final ClipData a = qjs.a;
        final PendingIntent b = qjs.b(context, intent, 201326592);
        b.getClass();
        return b;
    }
    
    static RemoteViews b(final AppWidgetManager appWidgetManager, final Context context, final int n) {
        return nrw.m(context, appWidgetManager, n, (atml)new lmx(context));
    }
    
    public final nqg c() {
        return nqg.O;
    }
    
    public final void onAppWidgetOptionsChanged(final Context context, final AppWidgetManager appWidgetManager, final int n, final Bundle bundle) {
        appWidgetManager.updateAppWidget(n, b(appWidgetManager, context, n));
        super.onAppWidgetOptionsChanged(context, appWidgetManager, n, bundle);
    }
    
    public final void onUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] array) {
        super.onUpdate(context, appWidgetManager, array);
        for (final int n : array) {
            appWidgetManager.updateAppWidget(n, b(appWidgetManager, context, n));
        }
    }
}
