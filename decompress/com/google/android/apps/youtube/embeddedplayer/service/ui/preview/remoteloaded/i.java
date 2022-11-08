// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e;

public final class i implements Runnable
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public i(final b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public i(final lsp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public i(final mbh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public i(final mbo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        String s = "due to no playlist being set.";
        switch (b) {
            default: {
                ((mkk)this.a).v();
                return;
            }
            case 19: {
                final mjz mjz = (mjz)this.a;
                if (!mjz.g.isEmpty()) {
                    long n;
                    if (!mjz.h.equals(mjz.g)) {
                        n = 86400000L;
                    }
                    else {
                        n = 172800000L;
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    final long i = mjz.i;
                    if (i == 0L || currentTimeMillis - i >= n) {
                        final agza builder = ((agzi)afow.a).createBuilder();
                        final String a = mjz.a;
                        builder.copyOnWrite();
                        final afow afow = (afow)builder.instance;
                        a.getClass();
                        afow.b |= 0x2;
                        afow.d = a;
                        final String d = mjz.d;
                        builder.copyOnWrite();
                        final afow afow2 = (afow)builder.instance;
                        d.getClass();
                        afow2.b |= 0x1;
                        afow2.c = d;
                        final afow c = (afow)builder.build();
                        final ArrayList list = new ArrayList();
                        list.addAll(mjz.g);
                        final agza builder2 = ((agzi)afov.a).createBuilder();
                        builder2.copyOnWrite();
                        final afov afov = (afov)builder2.instance;
                        final agzq d2 = afov.d;
                        if (!d2.c()) {
                            afov.d = agzi.mutableCopy(d2);
                        }
                        final Iterator iterator = list.iterator();
                        while (iterator.hasNext()) {
                            afov.d.g(((afou)iterator.next()).ad);
                        }
                        builder2.copyOnWrite();
                        final afov afov2 = (afov)builder2.instance;
                        c.getClass();
                        afov2.c = c;
                        afov2.b |= 0x1;
                        final afov afov3 = (afov)builder2.build();
                        final afoy b2 = afoz.b();
                        b2.copyOnWrite();
                        afoz.h((afoz)b2.instance, afov3);
                        mjz.b.a((afoz)b2.build(), 243);
                        final SharedPreferences$Editor edit = mjz.c.edit();
                        if (!mjz.h.equals(mjz.g)) {
                            mjz.h.clear();
                            mjz.h.addAll(mjz.g);
                            final Iterator iterator2 = mjz.h.iterator();
                            while (iterator2.hasNext()) {
                                final String h = mjz.h((afou)iterator2.next());
                                final String d3 = mjz.d(h);
                                final String c2 = mjz.c("feature_usage_timestamp_reported_feature_", h);
                                if (!TextUtils.equals((CharSequence)d3, (CharSequence)c2)) {
                                    final long long1 = mjz.c.getLong(d3, 0L);
                                    edit.remove(d3);
                                    if (long1 == 0L) {
                                        continue;
                                    }
                                    edit.putLong(c2, long1);
                                }
                            }
                        }
                        mjz.i = currentTimeMillis;
                        edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    }
                }
                return;
            }
            case 18: {
                final mjv mjv = (mjv)this.a;
                final mjw e = mjv.e;
                if (e != null) {
                    mjv.b.a(mjv.c.b(e), 223);
                }
                mjv.g();
                return;
            }
            case 17: {
                meo.h((String)this.a);
                return;
            }
            case 16: {
                final mbe a2 = ((mbo)this.a).a;
                if (a2 != null) {
                    try {
                        a2.a();
                    }
                    catch (final RemoteException ex) {
                        mfe.f("Could not notify onAdFailedToLoad event.", (Throwable)ex);
                    }
                }
                return;
            }
            case 15: {
                final mbe a3 = ((mbh)this.a).a.a;
                if (a3 != null) {
                    try {
                        a3.a();
                    }
                    catch (final RemoteException ex2) {
                        mfe.f("Could not notify onAdFailedToLoad event.", (Throwable)ex2);
                    }
                }
                return;
            }
            case 14: {
                final Object a4 = this.a;
                try {
                    ((lzm)a4).a.e();
                }
                catch (final IllegalStateException ex3) {
                    met.a(((lzm)a4).getContext()).c((Throwable)ex3, "BaseAdView.resume");
                }
            }
            case 13: {
                final Object a5 = this.a;
                try {
                    ((lzm)a5).a.b();
                }
                catch (final IllegalStateException ex4) {
                    met.a(((lzm)a5).getContext()).c((Throwable)ex4, "BaseAdView.destroy");
                }
            }
            case 12: {
                final Object a6 = this.a;
                try {
                    ((lzm)a6).a.d();
                }
                catch (final IllegalStateException ex5) {
                    met.a(((lzm)a6).getContext()).c((Throwable)ex5, "BaseAdView.pause");
                }
            }
            case 11: {
                ((lyr)this.a).d();
                return;
            }
            case 10: {
                ((lyr)this.a).c();
                return;
            }
            case 9: {
                ((lxn)this.a).i(true);
                return;
            }
            case 8: {
                final maw l = ((lsp)this.a).l;
                if (l.c != null) {
                    l.c = null;
                }
                return;
            }
            case 7: {
                final c c3 = (c)this.a;
                final anen c4 = c3.c;
                if (c4 != null && (c4.c & 0x4) != 0x0) {
                    c3.j.j(c4.g.I());
                }
                return;
            }
            case 6: {
                ((c)this.a).c();
                return;
            }
            case 5: {
                ((aefp)this.a).b.a = null;
                System.gc();
                return;
            }
            case 4: {
                final Object d4 = ((e)this.a).d;
                if (d4 == null) {
                    afqg.s("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.");
                    return;
                }
                ((a)d4).e();
                return;
            }
            case 3: {
                final Object d5 = ((e)this.a).d;
                if (d5 != null) {
                    final a a7 = (a)d5;
                    if (a7.k()) {
                        a7.g();
                        return;
                    }
                }
                if (d5 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.b) {
                    s = "as already at the start of the playlist.";
                }
                afqg.s("Ignoring call to previous() on YouTubeThumbnailView ".concat(s));
                return;
            }
            case 2: {
                final Object d6 = ((e)this.a).d;
                if (d6 != null) {
                    final a a8 = (a)d6;
                    if (a8.j()) {
                        a8.f();
                        return;
                    }
                }
                if (d6 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.b) {
                    s = "as already at the end of the playlist.";
                }
                afqg.s("Ignoring call to next() on YouTubeThumbnailView ".concat(s));
                return;
            }
            case 1: {
                ((b)this.a).a.mk();
                return;
            }
            case 0: {
                ((b)this.a).a.m();
            }
        }
    }
}
