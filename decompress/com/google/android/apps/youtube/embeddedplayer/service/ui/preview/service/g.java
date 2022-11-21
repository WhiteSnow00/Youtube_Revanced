// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.c;

public final class g implements Runnable
{
    public final Object a;
    private final int b;
    
    public g(final aejj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final e a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final c a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final luh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final lzg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mak a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mbf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mda a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mdh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mlo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mls a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mmd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mmg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mnv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mpa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final Object a2 = mpa.a;
                monitorenter(a2);
                try {
                    if (((mpa)a).b == -1L) {
                        monitorexit(a2);
                        return;
                    }
                    ((mpa)a).d(15);
                    monitorexit(a2);
                    return;
                }
                finally {
                    monitorexit(a2);
                    while (true) {}
                }
                break;
            }
            case 19: {
                ((mnv)this.a).c(false);
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final mou a4 = mmg.a;
                final mmg mmg = (mmg)a3;
                a4.a("transfer with type = %d has timed out", new Object[] { mmg.e });
                mmg.b(101);
                return;
            }
            case 17: {
                ((mmd)this.a).y();
                return;
            }
            case 16: {
                ((mmd)this.a).z();
                return;
            }
            case 15: {
                final mls mls = (mls)this.a;
                if (!mls.g.isEmpty()) {
                    long n;
                    if (!mls.h.equals(mls.g)) {
                        n = 86400000L;
                    }
                    else {
                        n = 172800000L;
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    final long i = mls.i;
                    if (i == 0L || currentTimeMillis - i >= n) {
                        final ahcr builder = ((ahcz)afsm.a).createBuilder();
                        final String a5 = mls.a;
                        builder.copyOnWrite();
                        final afsm afsm = (afsm)builder.instance;
                        a5.getClass();
                        afsm.b |= 0x2;
                        afsm.d = a5;
                        final String d = mls.d;
                        builder.copyOnWrite();
                        final afsm afsm2 = (afsm)builder.instance;
                        d.getClass();
                        afsm2.b |= 0x1;
                        afsm2.c = d;
                        final afsm c = (afsm)builder.build();
                        final ArrayList list = new ArrayList();
                        list.addAll(mls.g);
                        final ahcr builder2 = ((ahcz)afsl.a).createBuilder();
                        builder2.copyOnWrite();
                        final afsl afsl = (afsl)builder2.instance;
                        final ahdh d2 = afsl.d;
                        if (!d2.c()) {
                            afsl.d = ahcz.mutableCopy(d2);
                        }
                        final Iterator iterator = list.iterator();
                        while (iterator.hasNext()) {
                            afsl.d.g(((afsk)iterator.next()).ad);
                        }
                        builder2.copyOnWrite();
                        final afsl afsl2 = (afsl)builder2.instance;
                        c.getClass();
                        afsl2.c = c;
                        afsl2.b |= 0x1;
                        final afsl afsl3 = (afsl)builder2.build();
                        final afso b = afsp.b();
                        ((ahcr)b).copyOnWrite();
                        afsp.h((afsp)b.instance, afsl3);
                        mls.b.a((afsp)((ahcr)b).build(), 243);
                        final SharedPreferences$Editor edit = mls.c.edit();
                        if (!mls.h.equals(mls.g)) {
                            mls.h.clear();
                            mls.h.addAll(mls.g);
                            final Iterator iterator2 = mls.h.iterator();
                            while (iterator2.hasNext()) {
                                final String h = mls.h((afsk)iterator2.next());
                                final String d3 = mls.d(h);
                                final String c2 = mls.c("feature_usage_timestamp_reported_feature_", h);
                                if (!TextUtils.equals((CharSequence)d3, (CharSequence)c2)) {
                                    final long long1 = mls.c.getLong(d3, 0L);
                                    edit.remove(d3);
                                    if (long1 == 0L) {
                                        continue;
                                    }
                                    edit.putLong(c2, long1);
                                }
                            }
                        }
                        mls.i = currentTimeMillis;
                        edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    }
                }
                return;
            }
            case 14: {
                final mlo mlo = (mlo)this.a;
                final mlp e = mlo.e;
                if (e != null) {
                    mlo.b.a(mlo.c.b(e), 223);
                }
                mlo.g();
                return;
            }
            case 13: {
                mgh.d((String)this.a);
                return;
            }
            case 12: {
                final mcx a6 = ((mdh)this.a).a;
                if (a6 != null) {
                    try {
                        a6.a();
                    }
                    catch (final RemoteException ex) {
                        mgx.f("Could not notify onAdFailedToLoad event.", (Throwable)ex);
                    }
                }
                return;
            }
            case 11: {
                final mcx a7 = ((mda)this.a).a.a;
                if (a7 != null) {
                    try {
                        a7.a();
                    }
                    catch (final RemoteException ex2) {
                        mgx.f("Could not notify onAdFailedToLoad event.", (Throwable)ex2);
                    }
                }
                return;
            }
            case 10: {
                final Object a8 = this.a;
                try {
                    ((mbf)a8).a.e();
                }
                catch (final IllegalStateException ex3) {
                    mgm.a(((mbf)a8).getContext()).c((Throwable)ex3, "BaseAdView.resume");
                }
            }
            case 9: {
                final Object a9 = this.a;
                try {
                    ((mbf)a9).a.b();
                }
                catch (final IllegalStateException ex4) {
                    mgm.a(((mbf)a9).getContext()).c((Throwable)ex4, "BaseAdView.destroy");
                }
            }
            case 8: {
                final Object a10 = this.a;
                try {
                    ((mbf)a10).a.d();
                }
                catch (final IllegalStateException ex5) {
                    mgm.a(((mbf)a10).getContext()).c((Throwable)ex5, "BaseAdView.pause");
                }
            }
            case 7: {
                ((mak)this.a).d();
                return;
            }
            case 6: {
                ((mak)this.a).c();
                return;
            }
            case 5: {
                ((lzg)this.a).i(true);
                return;
            }
            case 4: {
                final mcp l = ((luh)this.a).l;
                if (l.c != null) {
                    l.c = null;
                }
                return;
            }
            case 3: {
                final c c3 = (c)this.a;
                final aniy c4 = c3.c;
                if (c4 != null && (c4.c & 0x4) != 0x0) {
                    c3.j.j(c4.g.I());
                }
                return;
            }
            case 2: {
                ((c)this.a).c();
                return;
            }
            case 1: {
                final Object d4 = ((e)this.a).d;
                if (d4 == null) {
                    aftr.l("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.");
                    return;
                }
                ((a)d4).e();
                return;
            }
            case 0: {
                ((aejj)this.a).b.a = null;
                System.gc();
            }
        }
    }
}
