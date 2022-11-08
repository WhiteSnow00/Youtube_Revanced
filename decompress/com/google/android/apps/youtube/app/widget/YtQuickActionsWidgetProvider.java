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

public final class YtQuickActionsWidgetProvider extends nqc
{
    static PendingIntent a(final Context context, final Uri uri) {
        final Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setClassName(context.getPackageName(), "com.google.android.youtube.UrlActivity");
        intent.putExtra("Setdata", "IamNotNoise");
        final ClipData a = qjs.a;
        final PendingIntent b = qjs.b(context, intent, 201326592);
        b.getClass();
        return b;
    }
    
    static RemoteViews b(final AppWidgetManager appWidgetManager, final Context context, final int n) {
        return nrw.m(context, appWidgetManager, n, (atml)new lmw(context.getResources().getDimensionPixelSize(2131170399), context));
    }
    
    public static RemoteViews d(final Context context, final int n, final int n2) {
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), n2);
        if (n > context.getResources().getDimensionPixelSize(2131170388)) {
            remoteViews.setViewVisibility(2131427929, 0);
        }
        else {
            remoteViews.setViewVisibility(2131427929, 8);
        }
        remoteViews.setOnClickPendingIntent(2131432484, a(context, lkn.d()));
        remoteViews.setOnClickPendingIntent(2131432487, a(context, lkn.e()));
        remoteViews.setOnClickPendingIntent(2131432482, a(context, lkn.c().build()));
        remoteViews.setOnClickPendingIntent(2131432485, a(context, lkn.c().appendPath("shorts").build()));
        remoteViews.setOnClickPendingIntent(2131432486, a(context, lkn.c().appendPath("feed").appendPath("subscriptions").build()));
        remoteViews.setOnClickPendingIntent(2131432483, a(context, lkn.c().appendPath("feed").appendPath("library").build()));
        return remoteViews;
    }
    
    public final nqg c() {
        return nqg.N;
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
