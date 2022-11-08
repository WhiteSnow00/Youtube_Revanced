// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.notifications.scheduled.impl.workmanager;

import java.util.Iterator;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.Bundle;
import androidx.work.WorkerParameters;
import android.content.Context;
import androidx.work.Worker;

public final class ChimeScheduledTaskWorker extends Worker
{
    private final Context b;
    
    public ChimeScheduledTaskWorker(final Context b, final WorkerParameters workerParameters) {
        super(b, workerParameters);
        this.b = b;
    }
    
    @Override
    public final ckx c() {
        pnv a;
        try {
            a = pnu.a(this.b);
        }
        catch (final IllegalStateException ex) {
            pqw.i("ChimeWorker", (Throwable)ex, "Failed to get ChimeComponent for ChimeScheduledTaskWorker", new Object[0]);
            a = null;
        }
        if (a == null) {
            return ckx.a();
        }
        a.yx();
        psb.c(this.b);
        a.yy();
        try {
            final cmh ln = this.ln();
            final String b = ln.b("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
            Bundle bundle = null;
            Label_0153: {
                if (ln == null) {
                    bundle = new Bundle();
                }
                else {
                    final byte[] d = ln.d("notifications.scheduled.impl.workmanager.extraskey");
                    if (d != null) {
                        final int length = d.length;
                        if (length != 0) {
                            final Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(d, 0, length);
                            obtain.setDataPosition(0);
                            bundle = new Bundle();
                            bundle.readFromParcel(obtain);
                            obtain.recycle();
                            break Label_0153;
                        }
                    }
                    bundle = new Bundle();
                }
            }
            bundle.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
            final phq yw = a.yW();
            if (arjn.d()) {
                ((qbo)yw.a).h(agtv.h).i();
            }
            psy psy = null;
            Label_0269: {
                if (!TextUtils.isEmpty((CharSequence)b)) {
                    for (final psy psy : yw.b) {
                        if (b.equals(psy.c())) {
                            break Label_0269;
                        }
                    }
                }
                psy = null;
            }
            pli pli;
            if (psy == null) {
                pqw.d("ScheduledTaskWorkerHandler", "ChimeTask NOT found. key: '%s'", new Object[] { b });
                pli = pli.a((Throwable)new Exception("ChimeTask NOT found."));
            }
            else {
                pqw.g("ScheduledTaskWorkerHandler", "Starting task execution. Job key: '%s'", new Object[] { b });
                pli = psy.b(bundle);
            }
            final int c = pli.c;
            final int n = c - 1;
            if (c == 0) {
                throw null;
            }
            if (n == 0) {
                pqw.g("ChimeWorker", "Work finished with SUCCESS code. Job key: '%s'", new Object[] { b });
                return ckx.c();
            }
            if (n == 1) {
                pqw.e("ChimeWorker", pli.b, "Work finished with TRANSIENT_FAILURE. Job key: '%s'", new Object[] { agmj.a((Object)b) });
                return ckx.b();
            }
            if (n != 2) {
                return ckx.c();
            }
            pqw.e("ChimeWorker", pli.b, "Work finished with PERMANENT_FAILURE. Job key: '%s'", new Object[] { agmj.a((Object)b) });
            return ckx.a();
        }
        finally {
            while (true) {}
        }
    }
}
