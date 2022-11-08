// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.m;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.n;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.a;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;

public final class b implements abnq, tec
{
    final /* synthetic */ c a;
    
    public b(final c a) {
        this.a = a;
    }
    
    private final void c() {
        final c a = this.a;
        if (a.r) {
            if (a.q) {
                anem anem;
                if ((anem = a.o.j) == null) {
                    anem = anem.a;
                }
                ajld a2;
                if (anem.b == 149559471) {
                    a2 = (ajld)anem.c;
                }
                else {
                    a2 = ajld.a;
                }
                final c a3 = this.a;
                a3.e.a(a2, a3.d);
                anss anss;
                if ((anss = a2.e) == null) {
                    anss = anss.a;
                }
                anss anss2;
                if ((anss2 = ((ajlc)((agzd)anss).rr((agyr)ajle.c)).c) == null) {
                    anss2 = anss.a;
                }
                final aokb aokb = (aokb)((agzd)anss2).rr((agyr)SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
                final c a4 = this.a;
                a4.g.b(aokb, a4.f, a4.i, a4.h);
                final c a5 = this.a;
                final a k = a5.k;
                andy andy;
                if ((andy = a5.o.g) == null) {
                    andy = andy.a;
                }
                aibb a6;
                if (andy.b == 65153809) {
                    a6 = (aibb)andy.c;
                }
                else {
                    a6 = aibb.a;
                }
                k.b(a6, this.a.j);
                final c a7 = this.a;
                final aneh o = a7.o;
                final String s = a7.s;
                final String t = a7.t;
                anei anei;
                if ((anei = o.f) == null) {
                    anei = anei.a;
                }
                if ((anei.b & 0x1) != 0x0) {
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.a m = this.a.m;
                    anei anei2;
                    if ((anei2 = o.f) == null) {
                        anei2 = anei.a;
                    }
                    aibb aibb;
                    if ((aibb = anei2.c) == null) {
                        aibb = aibb.a;
                    }
                    m.c(aibb, this.a.l, s, t, false, -1);
                }
            }
        }
    }
    
    private final void d() {
        final c a = this.a;
        a.u.e(2131427613, a.p != null);
    }
    
    public final void a(final aalo aalo) {
        final WatchNextResponseModel a = aalo.a();
        if (!aalo.c().b(abij.e)) {
            this.a.q = false;
        }
        if (aalo.c() != abij.e || a == null) {
            this.a.p = null;
            this.d();
            return;
        }
        final c a2 = this.a;
        albu albu;
        if ((albu = a.a.g) == null) {
            albu = albu.a;
        }
        aneh a3;
        if (albu.b == 78882851) {
            a3 = (aneh)albu.c;
        }
        else {
            a3 = aneh.a;
        }
        a2.o = a3;
        this.a.q = true;
        this.c();
        final c a4 = this.a;
        final aneh o = a4.o;
        if ((o.b & 0x400000) != 0x0) {
            aibc aibc;
            if ((aibc = o.q) == null) {
                aibc = aibc.a;
            }
            aibb p;
            if ((p = aibc.c) == null) {
                p = aibb.a;
            }
            a4.p = p;
            this.d();
            return;
        }
        a4.p = null;
        this.d();
    }
    
    public final void b(final aaly aaly) {
        final PlayerResponseModel b = aaly.b();
        if (!aaly.c().c(abim.i)) {
            this.a.r = false;
        }
        if (aaly.c() != abim.c || b == null) {
            if (aaly.c() == abim.i) {
                if (b != null) {
                    this.a.s = b.K();
                    this.a.t = b.J();
                }
                final c a = this.a;
                a.r = true;
                a.a.qX(false);
                this.c();
            }
            return;
        }
        akuy akuy;
        if ((akuy = b.z().D) == null) {
            akuy = akuy.a;
        }
        ancf ancf;
        if ((ancf = akuy.c) == null) {
            ancf = ancf.a;
        }
        if ((ancf.b & 0x20) != 0x0) {
            final h a2 = this.a.a;
            ancf ancf2;
            if ((ancf2 = akuy.c) == null) {
                ancf2 = ancf.a;
            }
            a2.qX(ancf2.h);
            return;
        }
        this.a.a.qX(false);
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().a).am((asix)new n(this, 19), (asix)m.h), abns.Q().am((asix)new n(this, 20), (asix)m.h) };
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
                this.b((aaly)o);
            }
            else {
                this.a((aalo)o);
            }
        }
        else {
            array = new Class[] { aalo.class, aaly.class };
        }
        return array;
    }
}
