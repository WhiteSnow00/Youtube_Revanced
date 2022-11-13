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
    public aelx a;
    
    protected final void dump(FileDescriptor a, final PrintWriter printWriter, final String[] array) {
        final aelx a2 = this.a;
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
        ((aely)agpc.am((Context)this, (Class)aely.class)).wD(this);
    }
    
    public final int onStartCommand(final Intent intent, int n, final int e) {
        final aelx a = this.a;
        final Object a2 = a.a;
        monitorenter(a2);
        Label_0042: {
            if (intent != null) {
                break Label_0042;
            }
            try {
                if (a.d == aelw.a) {
                    this.stopSelf(e);
                }
                monitorexit(a2);
                return 2;
                Label_0275: {
                    aelv f = null;
                Label_0202:
                    while (true) {
                    Block_8_Outer:
                        while (true) {
                            while (true) {
                                aelv aelv = null;
                                final aelv f2;
                                Block_7: {
                                    while (true) {
                                        final Iterator iterator;
                                        aelv = (aelv)iterator.next();
                                        iftrue(Label_0247:)(f == null);
                                        break Block_7;
                                        this.startForeground(174344743, (Notification)intent.getParcelableExtra("fallback_notification"));
                                        final aelw d = a.d;
                                        adkp.T(d == aelw.c, "Destroyed in wrong state %s", d);
                                        a.d = aelw.a;
                                        a.c.stopForeground(true);
                                        a.f = null;
                                        a.c.stopSelf(a.e);
                                        a.c = null;
                                        break Label_0275;
                                        iftrue(Label_0253:)(!iterator.hasNext());
                                        continue Block_8_Outer;
                                    }
                                    n = f2.b;
                                    Label_0247: {
                                        f = aelv;
                                    }
                                    continue Label_0202;
                                }
                                n = aelv.b;
                                iftrue(Label_0202:)(f2 != aelv);
                                continue;
                            }
                            a.c = this;
                            a.e = e;
                            a.d = aelw.c;
                            iftrue(Label_0163:)(!a.b.isEmpty());
                            continue Block_8_Outer;
                        }
                        Label_0163: {
                            final aelv f2 = a.f;
                        }
                        adkp.R(a.b.isEmpty() ^ true, "Can't select a best notification if thare are none");
                        final Iterator iterator = a.b.values().iterator();
                        f = null;
                        continue Label_0202;
                    }
                    Label_0253: {
                        a.f = f;
                    }
                    final Notification a3 = a.f.a;
                    this.startForeground(174344743, (Notification)null);
                }
                monitorexit(a2);
                return 2;
            }
            finally {
                monitorexit(a2);
                while (true) {}
            }
        }
    }
}
