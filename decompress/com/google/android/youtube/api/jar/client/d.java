// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.youtube.api.jar.client;

import java.util.List;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.PowerManager$WakeLock;

public final class d implements Runnable
{
    public final Object a;
    private final int b;
    
    public d(final aefm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final aegt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final aejw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final aelm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final aeok a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final aeoq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final aeoy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final aerz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final PowerManager$WakeLock a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final f a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final ListenableFuture a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public d(final Throwable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        boolean b2 = true;
        final int n = 0;
        final int n2 = 0;
        int i = 0;
        switch (b) {
            default: {
                ((aerz)this.a).a = null;
                return;
            }
            case 19: {
                aerc.i((ListenableFuture)this.a);
                return;
            }
            case 18: {
                aerc.k((ListenableFuture)this.a);
                return;
            }
            case 17: {
                final Object a = this.a;
                if (aeux.r()) {
                    ((aeoy)a).c(false);
                    return;
                }
                final aesy a2 = ((aetv)((aeoy)a).f.a()).a("StartupAfterPackageReplacedUnlock");
                try {
                    ((aeoy)a).c(false);
                    a2.close();
                    return;
                }
                finally {
                    try {
                        a2.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        agpc.al(t, t2);
                    }
                }
            }
            case 16: {
                ((aeoq)this.a).a();
                return;
            }
            case 15: {
                final aeok aeok = (aeok)this.a;
                aeok.g = 3;
                final Iterator iterator = aeok.f.iterator();
                while (iterator.hasNext()) {
                    ((ListenableFuture)iterator.next()).cancel(false);
                }
                aeok.f = null;
                return;
            }
            case 14: {
                final Object a3 = this.a;
                qdt.h();
                final aeok aeok2 = (aeok)a3;
                if (aeok2.g != 1) {
                    b2 = false;
                }
                adkp.R(b2, "Duplicate or leaked callback task.");
                final afel d = afeq.d();
                aeok2.g = 2;
                for (final acqb acqb : aeok2.e) {
                    qdt.h();
                    final Object a4 = acqb.a;
                    a4.getClass();
                    adkp.R(((aeol)a4).c.h(), "Isolation failure in updateToPublish(). The state to publish has gone missing. Please report this error as a P1 bug at go/tiktok-bug.");
                    final aeol aeol = (aeol)acqb.a;
                    acqb.a = aeol.a((aeop)aeol.c.c());
                    d.h((Object)new aeoj((aenx)((afee)((afig)aeok2.a).e).get((Object)acqb), (aeop)((aeol)acqb.a).d.c()));
                }
                aeok2.e.clear();
                for (afeq g = d.g(); i < ((afih)g).c; ++i) {
                    final aeoj aeoj = (aeoj)((List)g).get(i);
                    try {
                        aeok.a(aeoj.a, aeoj.b);
                    }
                    finally {
                        final Throwable t3;
                        aeok2.b.execute(aeun.h((Runnable)new d(t3, 12)));
                    }
                }
                return;
            }
            case 13: {
                final aeok aeok3 = (aeok)this.a;
                final afke k = ((afev)aeok3.a).r().k();
                while (k.hasNext()) {
                    final Map.Entry<aenx, V> entry = k.next();
                    final aenx aenx = entry.getKey();
                    final acqb acqb2 = (acqb)entry.getValue();
                    final aeom aeom = new aeom(aenx, 1);
                    final aeoi aeoi = new aeoi(aeok3, acqb2, 1, (byte[])null, (byte[])null, (byte[])null);
                    qdt.h();
                    final Object a5 = acqb2.a;
                    a5.getClass();
                    final aeol aeol2 = (aeol)a5;
                    final aezp c = aeol2.c;
                    if (c.h()) {
                        acqb2.a = aeol2.a((aeop)c.c());
                    }
                    final aeol aeol3 = (aeol)acqb2.a;
                    final aezp d2 = aeol3.d;
                    final aezp b3 = aeol3.b;
                    if (d2.h()) {
                        ((afaa)aeom).a((Object)d2.c());
                    }
                    if (b3.h()) {
                        ((afaa)aeoi).a((Object)b3.c());
                    }
                }
                return;
            }
            case 12: {
                throw (Throwable)this.a;
            }
            case 11: {
                final aeok aeok4 = (aeok)this.a;
                final afke j = aeok4.a.f().k();
                while (j.hasNext()) {
                    aeok4.d((acqb)j.next());
                }
                return;
            }
            case 10: {
                ((PowerManager$WakeLock)this.a).release();
                return;
            }
            case 9: {
                final aelm aelm = (aelm)this.a;
                final String[] databaseList = aelm.b.databaseList();
                for (int length = databaseList.length, l = n; l < length; ++l) {
                    final String s = databaseList[l];
                    if (s.startsWith("SqliteKeyValueCache:") && s.endsWith(":Singleton") && !s.endsWith("-wal") && !s.endsWith("-shm")) {
                        if (aelm.b.deleteDatabase(s)) {
                            ((afki)((afki)((afkg)aelm.a).f()).j("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "lambda$wipeLegacy$0", 64, "OrphanCacheSingletonSynclet.java")).t("Removed orphaned cache file: %s", (Object)s);
                        }
                        else {
                            ((afki)((afki)((afkg)aelm.a).g()).j("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "lambda$wipeLegacy$0", 66, "OrphanCacheSingletonSynclet.java")).t("Failed to remove orphaned cache file: %s", (Object)s);
                        }
                    }
                }
                return;
            }
            case 8: {
                final Object a6 = this.a;
                int n3 = n2;
                while (true) {
                    final aejw aejw = (aejw)a6;
                    if (n3 >= aejw.b) {
                        break;
                    }
                    ((ListenableFuture)aejw.a.get(n3)).cancel(true);
                    ++n3;
                }
                return;
            }
            case 7: {
                ((aegt)this.a).f();
                return;
            }
            case 6: {
                final RemoteEmbeddedPlayer a7 = ((f)this.a).a;
                a7.a = false;
                a7.R();
                return;
            }
            case 5: {
                ((f)this.a).a.T();
                return;
            }
            case 4: {
                ((f)this.a).a.P();
                return;
            }
            case 3: {
                final RemoteEmbeddedPlayer a8 = ((f)this.a).a;
                a8.f = -1L;
                a8.g = -1L;
                return;
            }
            case 2: {
                ((f)this.a).a.U();
                return;
            }
            case 1: {
                final View peekDecorView = ((aefm)this.a).b.peekDecorView();
                if (peekDecorView != null) {
                    aefn.a(peekDecorView);
                    return;
                }
                final aefm aefm = (aefm)this.a;
                if (--aefm.c >= 0) {
                    aefm.a.post(aefm.d);
                    return;
                }
                aefn.a.i("Cannot get decor view of window: ".concat(String.valueOf(String.valueOf(((aefm)this.a).b))));
                return;
            }
            case 0: {
                ((f)this.a).a.O();
            }
        }
    }
}
