// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.Parcelable;
import java.util.List;
import java.util.HashSet;
import android.app.ApplicationExitInfo;
import android.app.ActivityManager;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Process;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

public final class FuturesMixinViewModel extends avp implements aeml
{
    public final Executor a;
    public final aemg b;
    public final Set c;
    public final int d;
    public boolean e;
    private final Context f;
    
    public FuturesMixinViewModel(final avi avi, final Context f, final Executor a) {
        this.b = new aemg("FuturesMixinRF");
        int i = 0;
        this.e = false;
        this.a = a;
        this.f = f;
        this.d = Process.myPid();
        final Bundle bundle = (Bundle)avi.a("future_saved_state");
        if (bundle != null) {
            final int int1 = bundle.getInt("last_process_id");
            Object o = null;
            Label_0137: {
                if (Build$VERSION.SDK_INT >= 30) {
                    final ActivityManager activityManager = (ActivityManager)f.getSystemService("activity");
                    if (activityManager != null) {
                        final List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(f.getPackageName(), int1, 1);
                        if (!historicalProcessExitReasons.isEmpty()) {
                            o = aezp.k((Object)historicalProcessExitReasons.get(0).getReason());
                            break Label_0137;
                        }
                    }
                }
                o = aeyo.a;
            }
            final Parcelable[] parcelableArray = bundle.getParcelableArray("future_wrappers");
            final int length = parcelableArray.length;
            this.c = new HashSet(length);
            while (i < length) {
                final ParcelableFuture parcelableFuture = (ParcelableFuture)parcelableArray[i];
                if (parcelableFuture.c.h()) {
                    final int intValue = (int)parcelableFuture.c.c();
                    if (intValue != 1) {
                        Exception ex;
                        if (intValue == 2) {
                            final StringBuilder sb = new StringBuilder("ParcelableFuture was Parceled by a lifecycle change before it completed.");
                            if (((aezp)o).h()) {
                                sb.append(" process exit reason code: ");
                                sb.append(((aezp)o).c());
                            }
                            ex = new aemm(sb.toString());
                        }
                        else {
                            final StringBuilder sb2 = new StringBuilder("ParcelableFuture read in unexpected value for hasResult: ");
                            sb2.append(intValue);
                            ex = new IllegalStateException(sb2.toString());
                        }
                        parcelableFuture.b(ex);
                    }
                }
                this.c.add(parcelableFuture);
                ++i;
            }
        }
        else {
            this.c = new HashSet(1);
        }
        this.b.d(bundle);
        avi.b("future_saved_state", (cgh)new cb(this, 16));
    }
}
