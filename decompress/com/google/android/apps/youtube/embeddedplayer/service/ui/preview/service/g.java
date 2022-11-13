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
    
    public g(final aehq a, final int b) {
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
    
    public g(final ltt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final lys a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final lzw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mar a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mcm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mct a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mla a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mle a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mlp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public g(final mls a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        String s = "due to no playlist being set.";
        switch (b) {
            default: {
                final Object a = this.a;
                final mof a2 = mls.a;
                final mls mls = (mls)a;
                a2.a("transfer with type = %d has timed out", new Object[] { mls.e });
                mls.b(101);
                return;
            }
            case 19: {
                ((mlp)this.a).u();
                return;
            }
            case 18: {
                ((mlp)this.a).v();
                return;
            }
            case 17: {
                final mle mle = (mle)this.a;
                if (!mle.g.isEmpty()) {
                    long n;
                    if (!mle.h.equals(mle.g)) {
                        n = 86400000L;
                    }
                    else {
                        n = 172800000L;
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    final long i = mle.i;
                    if (i == 0L || currentTimeMillis - i >= n) {
                        final ahaz builder = afqx.a.createBuilder();
                        final String a3 = mle.a;
                        builder.copyOnWrite();
                        final afqx afqx = (afqx)builder.instance;
                        a3.getClass();
                        afqx.b |= 0x2;
                        afqx.d = a3;
                        final String d = mle.d;
                        builder.copyOnWrite();
                        final afqx afqx2 = (afqx)builder.instance;
                        d.getClass();
                        afqx2.b |= 0x1;
                        afqx2.c = d;
                        final afqx c = (afqx)builder.build();
                        final ArrayList list = new ArrayList();
                        list.addAll(mle.g);
                        final ahaz builder2 = afqw.a.createBuilder();
                        builder2.copyOnWrite();
                        final afqw afqw = (afqw)builder2.instance;
                        final ahbp d2 = afqw.d;
                        if (!d2.c()) {
                            afqw.d = ahbh.mutableCopy(d2);
                        }
                        final Iterator iterator = list.iterator();
                        while (iterator.hasNext()) {
                            afqw.d.g(((afqv)iterator.next()).ad);
                        }
                        builder2.copyOnWrite();
                        final afqw afqw2 = (afqw)builder2.instance;
                        c.getClass();
                        afqw2.c = c;
                        afqw2.b |= 0x1;
                        final afqw afqw3 = (afqw)builder2.build();
                        final afqz b2 = afra.b();
                        ((ahaz)b2).copyOnWrite();
                        afra.h((afra)b2.instance, afqw3);
                        mle.b.a((afra)((ahaz)b2).build(), 243);
                        final SharedPreferences$Editor edit = mle.c.edit();
                        if (!mle.h.equals(mle.g)) {
                            mle.h.clear();
                            mle.h.addAll(mle.g);
                            final Iterator iterator2 = mle.h.iterator();
                            while (iterator2.hasNext()) {
                                final String h = mle.h((afqv)iterator2.next());
                                final String d3 = mle.d(h);
                                final String c2 = mle.c("feature_usage_timestamp_reported_feature_", h);
                                if (!TextUtils.equals((CharSequence)d3, (CharSequence)c2)) {
                                    final long long1 = mle.c.getLong(d3, 0L);
                                    edit.remove(d3);
                                    if (long1 == 0L) {
                                        continue;
                                    }
                                    edit.putLong(c2, long1);
                                }
                            }
                        }
                        mle.i = currentTimeMillis;
                        edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    }
                }
                return;
            }
            case 16: {
                final mla mla = (mla)this.a;
                final mlb e = mla.e;
                if (e != null) {
                    mla.b.a(mla.c.b(e), 223);
                }
                mla.g();
                return;
            }
            case 15: {
                mft.i((String)this.a);
                return;
            }
            case 14: {
                final mcj a4 = ((mct)this.a).a;
                if (a4 != null) {
                    try {
                        a4.a();
                    }
                    catch (final RemoteException ex) {
                        mgj.f("Could not notify onAdFailedToLoad event.", (Throwable)ex);
                    }
                }
                return;
            }
            case 13: {
                final mcj a5 = ((mcm)this.a).a.a;
                if (a5 != null) {
                    try {
                        a5.a();
                    }
                    catch (final RemoteException ex2) {
                        mgj.f("Could not notify onAdFailedToLoad event.", (Throwable)ex2);
                    }
                }
                return;
            }
            case 12: {
                final Object a6 = this.a;
                try {
                    ((mar)a6).a.e();
                }
                catch (final IllegalStateException ex3) {
                    mfy.a(((mar)a6).getContext()).c((Throwable)ex3, "BaseAdView.resume");
                }
            }
            case 11: {
                final Object a7 = this.a;
                try {
                    ((mar)a7).a.b();
                }
                catch (final IllegalStateException ex4) {
                    mfy.a(((mar)a7).getContext()).c((Throwable)ex4, "BaseAdView.destroy");
                }
            }
            case 10: {
                final Object a8 = this.a;
                try {
                    ((mar)a8).a.d();
                }
                catch (final IllegalStateException ex5) {
                    mfy.a(((mar)a8).getContext()).c((Throwable)ex5, "BaseAdView.pause");
                }
            }
            case 9: {
                ((lzw)this.a).d();
                return;
            }
            case 8: {
                ((lzw)this.a).c();
                return;
            }
            case 7: {
                ((lys)this.a).i(true);
                return;
            }
            case 6: {
                final mcb l = ((ltt)this.a).l;
                if (l.c != null) {
                    l.c = null;
                }
                return;
            }
            case 5: {
                final c c3 = (c)this.a;
                final angr c4 = c3.c;
                if (c4 != null && (c4.c & 0x4) != 0x0) {
                    c3.j.j(c4.g.I());
                }
                return;
            }
            case 4: {
                ((c)this.a).c();
                return;
            }
            case 3: {
                ((aehq)this.a).b.a = null;
                System.gc();
                return;
            }
            case 2: {
                final Object d4 = ((e)this.a).d;
                if (d4 == null) {
                    afse.p("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.");
                    return;
                }
                ((a)d4).e();
                return;
            }
            case 1: {
                final Object d5 = ((e)this.a).d;
                if (d5 != null) {
                    final a a9 = (a)d5;
                    if (a9.j()) {
                        a9.f();
                        return;
                    }
                }
                if (d5 instanceof b) {
                    s = "as already at the end of the playlist.";
                }
                afse.p("Ignoring call to next() on YouTubeThumbnailView ".concat(s));
                return;
            }
            case 0: {
                final Object d6 = ((e)this.a).d;
                if (d6 != null) {
                    final a a10 = (a)d6;
                    if (a10.k()) {
                        a10.g();
                        return;
                    }
                }
                if (d6 instanceof b) {
                    s = "as already at the start of the playlist.";
                }
                afse.p("Ignoring call to previous() on YouTubeThumbnailView ".concat(s));
            }
        }
    }
}
