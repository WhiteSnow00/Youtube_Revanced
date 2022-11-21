// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

public final class e implements thj
{
    final Map a;
    public int b;
    private final atnb c;
    private final Map d;
    private int e;
    private final aefs f;
    
    public e(final atnb c, final aefs f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.e = 0;
        this.b = -1;
        this.c = c;
        this.f = f;
        this.d = new HashMap();
        this.a = new HashMap();
    }
    
    public static void g(final int n) {
        final zng a = zng.a;
        final znf d = znf.d;
        final StringBuilder sb = new StringBuilder("InteractionLogger with ID ");
        sb.append(n);
        sb.append(" doesn't exist.");
        znh.c(a, d, sb.toString(), new Throwable());
    }
    
    public final int a(final int n) {
        synchronized (this) {
            final int n2 = this.e++;
            final Map a = this.a;
            final Integer value = n;
            aasq aasq = a.get(value);
            if (aasq == null) {
                aasq = new aasq(this.f.cw());
                aasq.a = 1;
                this.a.put(value, aasq);
            }
            else {
                ++aasq.a;
            }
            this.d.put(n2, new d(this.c, n, (String)aasq.b));
            return n2;
        }
    }
    
    public final Optional b() {
        return this.c(this.b);
    }
    
    final Optional c(final int n) {
        return Optional.ofNullable((Object)this.d.get(n));
    }
    
    public final void d(final int n, final akpm akpm) {
        synchronized (this) {
            final Optional c = this.c(n);
            if (c.isEmpty()) {
                g(n);
                return;
            }
            final d d = (d)c.get();
            if (d.b.a) {
                final b b = new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.a, akpm.e.I());
                if (!d.j(b)) {
                    d.b.a(b, null);
                }
            }
        }
    }
    
    final void f(final aapf aapf) {
        synchronized (this) {
            final Optional b = this.b();
            if (b.isEmpty()) {
                g(this.b);
                return;
            }
            final d d = (d)b.get();
            final abli a = abli.a;
            final int ordinal = aapf.c().ordinal();
            if (ordinal != 3) {
                if (ordinal == 4) {
                    d.d(aapf.b(), Optional.ofNullable((Object)aapf.d()));
                    final WatchNextResponseModel a2 = aapf.a();
                    if (!d.c.a) {
                        znh.b(zng.b, znf.d, "handleWatchNextResponse called without any EmbedWatchPage logged");
                        return;
                    }
                    if (a2 == null) {
                        znh.b(zng.b, znf.d, "handleWatchNextResponse called wtih an empty watchNextResponse");
                        return;
                    }
                    final b b2 = new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.a, a2.d());
                    if (!d.j(b2)) {
                        d.i(b2);
                    }
                }
                return;
            }
            d.d(aapf.b(), Optional.ofNullable((Object)aapf.d()));
        }
    }
    
    final void h(final aapp aapp) {
        synchronized (this) {
            final Optional b = this.b();
            if (b.isEmpty()) {
                g(this.b);
                return;
            }
            final d d = (d)b.get();
            d.h = Optional.ofNullable((Object)aapp.e());
            if (!com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.d.k(d.h)) {
                d.c();
            }
        }
    }
    
    public final void i(final xbg xbg) {
        synchronized (this) {
            final Optional b = this.b();
            if (b.isEmpty()) {
                g(this.b);
                return;
            }
            ((d)b.get()).i(new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.b, xbg));
        }
    }
    
    public final void j(final byte[] array) {
        synchronized (this) {
            final Optional b = this.b();
            if (b.isEmpty()) {
                g(this.b);
                return;
            }
            ((d)b.get()).i(new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.b, array));
        }
    }
    
    public final void k(final int n, final xbg xbg) {
        synchronized (this) {
            final Optional c = this.c(n);
            if (c.isEmpty()) {
                g(n);
                return;
            }
            ((d)c.get()).e(new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.b, xbg));
        }
    }
    
    public final void l(final int n, final byte[] array) {
        synchronized (this) {
            final Optional c = this.c(n);
            if (c.isEmpty()) {
                g(n);
                return;
            }
            ((d)c.get()).e(new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.b, array));
        }
    }
    
    public final void m(final int n, final Optional optional, final boolean b) {
        synchronized (this) {
            final Optional c = this.c(n);
            if (c.isEmpty()) {
                g(n);
                return;
            }
            final d d = (d)c.get();
            if (!d.a.a) {
                znh.b(zng.b, znf.d, "logNewApiVideoLoad before logNewEmbedPage");
                return;
            }
            d.g = Optional.empty();
            d.c();
            d.b.c();
            d.c.c();
            d.i = null;
            if (b) {
                d.f(optional);
                return;
            }
            final c a = d.a;
            if (!a.a) {
                znh.b(zng.b, znf.d, "logNewEmbedPreviewPage called before logNewEmbedPage");
                return;
            }
            d.i = d.b;
            a.d(optional);
            d.b();
            d.b.b(xbf.b(32594), optional, d.a(null));
            d.h = Optional.empty();
            final b b2 = new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.a, xbf.c(28572));
            if (!d.j(b2)) {
                d.e(b2);
            }
            d.h(xbf.c(28572));
        }
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.h((aapp)o);
            }
            else {
                this.f((aapf)o);
            }
        }
        else {
            array = new Class[] { aapf.class, aapp.class };
        }
        return array;
    }
    
    public final void n(final int n) {
        synchronized (this) {
            final Optional c = this.c(n);
            if (c.isEmpty()) {
                g(n);
                return;
            }
            final d d = (d)c.get();
            final c a = d.a;
            if (a.a) {
                znh.b(zng.b, znf.d, "logNewEmbedPage called more than once");
                return;
            }
            (d.i = a).b(xbf.b(16623), Optional.empty(), d.a(null));
        }
    }
    
    public final void o(final int n, final Optional optional) {
        synchronized (this) {
            final Optional c = this.c(n);
            if (c.isEmpty()) {
                g(n);
                return;
            }
            ((d)c.get()).g(optional, null);
        }
    }
    
    public final void p(final xbg xbg) {
        synchronized (this) {
            final Optional b = this.b();
            if (b.isEmpty()) {
                g(this.b);
                return;
            }
            final d d = (d)b.get();
            final b b2 = new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.c, xbg);
            if (!d.j(b2)) {
                d.i(b2);
            }
        }
    }
    
    public final void q(final byte[] array) {
        synchronized (this) {
            final Optional b = this.b();
            if (b.isEmpty()) {
                g(this.b);
                return;
            }
            final d d = (d)b.get();
            final b b2 = new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.c, array);
            if (!d.j(b2)) {
                d.i(b2);
            }
        }
    }
    
    public final void r(final int n, final xbg xbg) {
        synchronized (this) {
            final Optional c = this.c(n);
            if (c.isEmpty()) {
                g(n);
                return;
            }
            ((d)c.get()).h(xbg);
        }
    }
    
    public final void s(final int n, final byte[] array) {
        synchronized (this) {
            final Optional c = this.c(n);
            if (c.isEmpty()) {
                g(n);
                return;
            }
            final d d = (d)c.get();
            final b b = new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.c, array);
            if (!d.j(b)) {
                d.e(b);
            }
        }
    }
    
    public final void t(int d) {
        synchronized (this) {
            final Optional c = this.c(d);
            if (c.isEmpty()) {
                return;
            }
            final d d2 = (d)c.get();
            this.d.remove(d);
            final aasq aasq = this.a.get(d2.d);
            if (aasq == null) {
                final zng b = zng.b;
                final znf d3 = znf.d;
                d = d2.d;
                final StringBuilder sb = new StringBuilder("Activity identifier ");
                sb.append(d);
                sb.append(" doesn't have associated embedded playback host nonce.");
                znh.b(b, d3, sb.toString());
                return;
            }
            d = aasq.a - 1;
            if ((aasq.a = d) == 0) {
                this.a.remove(d2.d);
            }
        }
    }
    
    public final void u(final int n, final aisc aisc) {
        synchronized (this) {
            this.m(n, Optional.of((Object)aisc), true);
        }
    }
}
