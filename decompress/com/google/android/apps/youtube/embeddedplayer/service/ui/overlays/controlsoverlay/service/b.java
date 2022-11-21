// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.m;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.a;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;

public final class b implements abqx, thj
{
    final c a;
    
    public b(final c a) {
        this.a = a;
    }
    
    private final void c() {
        final c a = this.a;
        if (a.r) {
            if (a.q) {
                anix anix;
                if ((anix = a.o.j) == null) {
                    anix = anix.a;
                }
                ajph a2;
                if (anix.b == 149559471) {
                    a2 = (ajph)anix.c;
                }
                else {
                    a2 = ajph.a;
                }
                final c a3 = this.a;
                a3.e.a(a2, a3.d);
                anxb anxb;
                if ((anxb = a2.e) == null) {
                    anxb = anxb.a;
                }
                anxb anxb2;
                if ((anxb2 = ((ajpg)((ahcu)anxb).rx((ahci)ajpi.c)).c) == null) {
                    anxb2 = anxb.a;
                }
                final aooo aooo = (aooo)((ahcu)anxb2).rx((ahci)SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
                final c a4 = this.a;
                a4.g.b(aooo, a4.f, a4.i, a4.h);
                final c a5 = this.a;
                final a k = a5.k;
                anij anij;
                if ((anij = a5.o.g) == null) {
                    anij = anij.a;
                }
                aies a6;
                if (anij.b == 65153809) {
                    a6 = (aies)anij.c;
                }
                else {
                    a6 = aies.a;
                }
                k.b(a6, this.a.j);
                final c a7 = this.a;
                final anis o = a7.o;
                final String s = a7.s;
                final String t = a7.t;
                anit anit;
                if ((anit = o.f) == null) {
                    anit = anit.a;
                }
                if ((anit.b & 0x1) != 0x0) {
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.a m = this.a.m;
                    anit anit2;
                    if ((anit2 = o.f) == null) {
                        anit2 = anit.a;
                    }
                    aies aies;
                    if ((aies = anit2.c) == null) {
                        aies = aies.a;
                    }
                    m.c(aies, this.a.l, s, t, false, -1);
                }
            }
        }
    }
    
    private final void d() {
        final c a = this.a;
        a.u.e(2131427613, a.p != null);
    }
    
    public final void a(final aapf aapf) {
        final WatchNextResponseModel a = aapf.a();
        if (!aapf.c().b(abli.e)) {
            this.a.q = false;
        }
        if (aapf.c() != abli.e || a == null) {
            this.a.p = null;
            this.d();
            return;
        }
        final c a2 = this.a;
        alfx alfx;
        if ((alfx = a.a.g) == null) {
            alfx = alfx.a;
        }
        anis a3;
        if (alfx.b == 78882851) {
            a3 = (anis)alfx.c;
        }
        else {
            a3 = anis.a;
        }
        a2.o = a3;
        this.a.q = true;
        this.c();
        final c a4 = this.a;
        final anis o = a4.o;
        if ((o.b & 0x400000) != 0x0) {
            aiet aiet;
            if ((aiet = o.q) == null) {
                aiet = aiet.a;
            }
            aies p;
            if ((p = aiet.c) == null) {
                p = aies.a;
            }
            a4.p = p;
            this.d();
            return;
        }
        a4.p = null;
        this.d();
    }
    
    public final void b(final aapp aapp) {
        final PlayerResponseModel b = aapp.b();
        if (!aapp.c().c(abll.i)) {
            this.a.r = false;
        }
        if (aapp.c() != abll.c || b == null) {
            if (aapp.c() == abll.i) {
                if (b != null) {
                    this.a.s = b.K();
                    this.a.t = b.J();
                }
                final c a = this.a;
                a.r = true;
                a.a.rc(false);
                this.c();
            }
            return;
        }
        akzc akzc;
        if ((akzc = b.z().D) == null) {
            akzc = akzc.a;
        }
        angq angq;
        if ((angq = akzc.c) == null) {
            angq = angq.a;
        }
        if ((angq.b & 0x20) != 0x0) {
            final h a2 = this.a.a;
            angq angq2;
            if ((angq2 = akzc.c) == null) {
                angq2 = angq.a;
            }
            a2.rc(angq2.h);
            return;
        }
        this.a.a.rc(false);
    }
    
    public final asln[] lX(final abqz abqz) {
        return new asln[] { ((aske)abqz.p().a).an(new d(this, 6), (asmi)m.g), abqz.P().an(new d(this, 7), (asmi)m.g) };
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
                this.b((aapp)o);
            }
            else {
                this.a((aapf)o);
            }
        }
        else {
            array = new Class[] { aapf.class, aapp.class };
        }
        return array;
    }
}
