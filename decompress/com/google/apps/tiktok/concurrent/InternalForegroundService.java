// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.concurrent;

import android.app.Notification;
import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.app.Service;

public final class InternalForegroundService extends Service
{
    public aejw a;
    
    protected final void dump(FileDescriptor a, final PrintWriter printWriter, final String[] array) {
        final aejw a2 = this.a;
        a = (FileDescriptor)a2.a;
        monitorenter(a);
        try {
            final Iterator iterator = a2.b.entrySet().iterator();
            while (iterator.hasNext()) {
                printWriter.println(iterator.next().toString());
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final IBinder onBind(final Intent intent) {
        return null;
    }
    
    public final void onCreate() {
        super.onCreate();
        ((aejx)ahbz.az((Context)this, (Class)aejx.class)).wE(this);
    }
    
    public final int onStartCommand(final Intent intent, int n, final int e) {
        final aejw a = this.a;
        final Object a2 = a.a;
        monitorenter(a2);
        Label_0042: {
            if (intent != null) {
                break Label_0042;
            }
            try {
                if (a.d == aejv.a) {
                    this.stopSelf(e);
                }
                monitorexit(a2);
                return 2;
                aeju aeju = null;
                aeju f = null;
                aeju f2;
                Iterator iterator = null;
                aejv d;
                Notification a3;
                Block_6_Outer:Block_4_Outer:
                while (true) {
                    while (true) {
                        Label_0202: {
                        Label_0247_Outer:
                            while (true) {
                                n = aeju.b;
                                iftrue(Label_0202:)(f != aeju);
                                while (true) {
                                    Block_8: {
                                        break Block_8;
                                        f2 = aeju;
                                        break Label_0202;
                                        monitorexit(a2);
                                        return 2;
                                    }
                                    n = f.b;
                                    continue Block_6_Outer;
                                }
                                aeju = (aeju)iterator.next();
                                iftrue(Label_0247:)(f2 == null);
                                continue Label_0247_Outer;
                            }
                            Label_0163: {
                                f = a.f;
                            }
                            agot.E(a.b.isEmpty() ^ true, (Object)"Can't select a best notification if thare are none");
                            iterator = a.b.values().iterator();
                            f2 = null;
                        }
                        iftrue(Label_0253:)(!iterator.hasNext());
                        continue Block_4_Outer;
                    }
                    while (true) {
                        this.startForeground(174344743, (Notification)intent.getParcelableExtra("fallback_notification"));
                        d = a.d;
                        agot.G(d == aejv.c, "Destroyed in wrong state %s", (Object)d);
                        a.d = aejv.a;
                        a.c.stopForeground(true);
                        a.f = null;
                        a.c.stopSelf(a.e);
                        a.c = null;
                        continue Block_6_Outer;
                        a.c = this;
                        a.e = e;
                        a.d = aejv.c;
                        iftrue(Label_0163:)(!a.b.isEmpty());
                        continue;
                    }
                    Label_0253: {
                        a.f = f2;
                    }
                    a3 = a.f.a;
                    this.startForeground(174344743, (Notification)null);
                    continue Block_6_Outer;
                }
            }
            finally {
                monitorexit(a2);
                while (true) {}
            }
        }
    }
}
