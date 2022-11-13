// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.service;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class AccountsChangedReceiver extends BroadcastReceiver
{
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            ttr.l("AccountsChangedReceiver: null intent received. Ignoring.");
            return;
        }
        AccountsChangedJobIntentService.a(context, (Class)AccountsChangedJobIntentService.class, intent);
    }
}
