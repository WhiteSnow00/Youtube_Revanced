// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.n;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.a;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;

public final class b implements abps, tgg
{
    final c a;
    
    public b(final c a) {
        this.a = a;
    }
    
    private final void c() {
        final c a = this.a;
        if (a.r) {
            if (a.q) {
                angq angq;
                if ((angq = a.o.j) == null) {
                    angq = angq.a;
                }
                ajni a2;
                if (angq.b == 149559471) {
                    a2 = (ajni)angq.c;
                }
                else {
                    a2 = ajni.a;
                }
                final c a3 = this.a;
                a3.e.a(a2, a3.d);
                anuv anuv;
                if ((anuv = a2.e) == null) {
                    anuv = anuv.a;
                }
                anuv anuv2;
                if ((anuv2 = ((ajnh)anuv.rx((ahaq)ajnj.c)).c) == null) {
                    anuv2 = anuv.a;
                }
                final aome aome = (aome)anuv2.rx((ahaq)SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
                final c a4 = this.a;
                a4.g.b(aome, a4.f, a4.i, a4.h);
                final c a5 = this.a;
                final a k = a5.k;
                angc angc;
                if ((angc = a5.o.g) == null) {
                    angc = angc.a;
                }
                aicz a6;
                if (angc.b == 65153809) {
                    a6 = (aicz)angc.c;
                }
                else {
                    a6 = aicz.a;
                }
                k.b(a6, this.a.j);
                final c a7 = this.a;
                final angl o = a7.o;
                final String s = a7.s;
                final String t = a7.t;
                angm angm;
                if ((angm = o.f) == null) {
                    angm = angm.a;
                }
                if ((angm.b & 0x1) != 0x0) {
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.a m = this.a.m;
                    angm angm2;
                    if ((angm2 = o.f) == null) {
                        angm2 = angm.a;
                    }
                    aicz aicz;
                    if ((aicz = angm2.c) == null) {
                        aicz = aicz.a;
                    }
                    m.c(aicz, this.a.l, s, t, false, -1);
                }
            }
        }
    }
    
    private final void d() {
        final c a = this.a;
        a.u.h(2131427613, a.p != null);
    }
    
    public final void a(final aani aani) {
        final WatchNextResponseModel a = aani.a();
        if (!aani.c().b(abkb.e)) {
            this.a.q = false;
        }
        if (aani.c() != abkb.e || a == null) {
            this.a.p = null;
            this.d();
            return;
        }
        final c a2 = this.a;
        aldx aldx;
        if ((aldx = a.a.g) == null) {
            aldx = aldx.a;
        }
        angl a3;
        if (aldx.b == 78882851) {
            a3 = (angl)aldx.c;
        }
        else {
            a3 = angl.a;
        }
        a2.o = a3;
        this.a.q = true;
        this.c();
        final c a4 = this.a;
        final angl o = a4.o;
        if ((o.b & 0x400000) != 0x0) {
            aida aida;
            if ((aida = o.q) == null) {
                aida = aida.a;
            }
            aicz p;
            if ((p = aida.c) == null) {
                p = aicz.a;
            }
            a4.p = p;
            this.d();
            return;
        }
        a4.p = null;
        this.d();
    }
    
    public final void b(final aans aans) {
        final PlayerResponseModel b = aans.b();
        if (!aans.c().c(abke.i)) {
            this.a.r = false;
        }
        if (aans.c() != abke.c || b == null) {
            if (aans.c() == abke.i) {
                if (b != null) {
                    this.a.s = b.K();
                    this.a.t = b.J();
                }
                final c a = this.a;
                a.r = true;
                a.a.rd(false);
                this.c();
            }
            return;
        }
        akxc akxc;
        if ((akxc = b.z().D) == null) {
            akxc = akxc.a;
        }
        anej anej;
        if ((anej = akxc.c) == null) {
            anej = anej.a;
        }
        if ((anej.b & 0x20) != 0x0) {
            final h a2 = this.a.a;
            anej anej2;
            if ((anej2 = akxc.c) == null) {
                anej2 = anej.a;
            }
            a2.rd(anej2.h);
            return;
        }
        this.a.a.rd(false);
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().a).an((asjm)new e(this, 2), (asjm)n.g), abpu.P().an((asjm)new e(this, 3), (asjm)n.g) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.b((aans)o);
            }
            else {
                this.a((aani)o);
            }
        }
        else {
            array = new Class[] { aani.class, aans.class };
        }
        return array;
    }
}
