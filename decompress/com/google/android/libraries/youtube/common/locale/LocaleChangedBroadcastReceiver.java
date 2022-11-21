// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.locale;

import android.os.Bundle;
import android.content.Intent;
import android.content.Context;

public final class LocaleChangedBroadcastReceiver extends tiy
{
    public tdu a;
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a(context);
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            if (!this.a.d("locale_update_runner", 1L, true, 0, false, (Bundle)null, (yrd)null, false)) {
                tut.b("Error scheduling locale update service");
            }
            return;
        }
        tut.b("Received a malicious intent with unexpected action.");
    }
}
