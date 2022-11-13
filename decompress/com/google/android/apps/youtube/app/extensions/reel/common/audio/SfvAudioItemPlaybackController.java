// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.common.audio;

import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.player.ui.PlayerView;

public final class SfvAudioItemPlaybackController implements aua
{
    public static final long a;
    public static final aoej b;
    public final abpq c;
    public final abpl d;
    public final asid e;
    public final PlayerView f;
    public final abjg g;
    public final zmf h;
    public final Executor i;
    public final Executor j;
    public final xao k;
    public aezp l;
    public aezp m;
    public SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand n;
    public aoej o;
    public xan p;
    public final vwa q;
    private final abpu r;
    private final atke s;
    private final asiq t;
    private final Set u;
    private final wyv v;
    private final atke w;
    private final ibx x;
    
    static {
        final long n = a = TimeUnit.SECONDS.toMillis(15L);
        final ahaz builder = ((ahbh)aoej.a).createBuilder();
        builder.copyOnWrite();
        final aoej aoej = (aoej)builder.instance;
        aoej.b |= 0x1;
        aoej.c = 0L;
        final ahan b2 = ahey.b(n);
        builder.copyOnWrite();
        final aoej aoej2 = (aoej)builder.instance;
        b2.getClass();
        aoej2.d = b2;
        aoej2.b |= 0x2;
        b = (aoej)builder.build();
    }
    
    public SfvAudioItemPlaybackController(final Context context, final abpu r, final atke s, final asid e, final vwa q, final zmf h, final Executor i, final Executor j, final xao k, final wyv v, final atke w, final byte[] array) {
        this.t = new asiq();
        this.x = new ibx(this, 1);
        this.u = new HashSet();
        final aeyo a = aeyo.a;
        this.l = (aezp)a;
        this.m = (aezp)a;
        this.r = r;
        this.c = r.n();
        this.d = r.m();
        this.s = s;
        this.e = e;
        this.q = q;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.v = v;
        this.w = w;
        this.f = new PlayerView(context);
        final gvf gvf = new gvf();
        final abjh a2 = abjh.a;
        final abjh a3 = abjh.a;
        this.g = new abjg((zdk)gvf, (zdk)a2, (zdk)a3, (zdk)a3);
    }
    
    public static final aoej l(final aoej aoej) {
        final ahaz builder = ((ahbh)aoej).toBuilder();
        if ((aoej.b & 0x2) == 0x0) {
            final ahan b = ahey.b(SfvAudioItemPlaybackController.a);
            builder.copyOnWrite();
            final aoej aoej2 = (aoej)builder.instance;
            b.getClass();
            aoej2.d = b;
            aoej2.b |= 0x2;
        }
        return (aoej)builder.build();
    }
    
    public final aoej g(final List list) {
        final ahan b = ahey.b(SfvAudioItemPlaybackController.a);
        while (true) {
            for (final aobg aobg : list) {
                final int b2 = aobg.b;
                if ((b2 & 0x1) != 0x0) {
                    final long c = aobg.c;
                    ahan d = b;
                    long c2 = c;
                    if ((b2 & 0x2) != 0x0) {
                        if ((d = aobg.d) == null) {
                            d = ahan.a;
                        }
                        c2 = c;
                    }
                    final ahaz builder = ((ahbh)aoej.a).createBuilder();
                    builder.copyOnWrite();
                    final aoej aoej = (aoej)builder.instance;
                    aoej.b |= 0x1;
                    aoej.c = c2;
                    builder.copyOnWrite();
                    final aoej aoej2 = (aoej)builder.instance;
                    d.getClass();
                    aoej2.d = d;
                    aoej2.b |= 0x2;
                    return (aoej)builder.build();
                }
            }
            long c2 = 0L;
            ahan d = b;
            continue;
        }
    }
    
    public final ashc h(final aezp aezp, final aezp aezp2, final aobh aobh) {
        final String h = vgl.h(186, "sfv_currently_playing_audio_item_key");
        final vdq b = ((vdr)this.s.a()).b();
        if (aezp2.h()) {
            h.getClass();
            adkp.R(h.isEmpty() ^ true, "key cannot be empty");
            final ahaz builder = ((ahbh)aobf.a).createBuilder();
            builder.copyOnWrite();
            final aobf aobf = (aobf)builder.instance;
            aobf.b |= 0x1;
            aobf.c = h;
            final aobc aobc = new aobc(builder);
            final String d = (String)aezp.c();
            final ahaz a = aobc.a;
            a.copyOnWrite();
            final aobf aobf2 = (aobf)a.instance;
            aobf2.b |= 0x2;
            aobf2.d = d;
            final ahaz a2 = aobc.a;
            a2.copyOnWrite();
            final aobf aobf3 = (aobf)a2.instance;
            aobf3.e = aobh.f;
            aobf3.b |= 0x4;
            final String f = (String)aezp2.c();
            final ahaz a3 = aobc.a;
            a3.copyOnWrite();
            final aobf aobf4 = (aobf)a3.instance;
            aobf4.b |= 0x8;
            aobf4.f = f;
            final veb e = ((vdw)b).e();
            ((vfw)e).j((vfk)aobc);
            return ((vfw)e).b();
        }
        final veb e2 = ((vdw)b).e();
        ((vfw)e2).g(h);
        return ((vfw)e2).b();
    }
    
    public final void i(final ahab ahab, final aoej aoej) {
        final xan p2 = this.p;
        if (p2 != null) {
            p2.c("aft");
        }
        final wyw pf = this.v.pF();
        final wyt wyt = new wyt(ahab);
        alhi alhi;
        if (aoej == null) {
            alhi = null;
        }
        else {
            final ahaz builder = ((ahbh)alhi.a).createBuilder();
            final ahaz builder2 = ((ahbh)alij.a).createBuilder();
            final ahaz builder3 = ((ahbh)alhy.a).createBuilder();
            final ahaz builder4 = ((ahbh)alie.a).createBuilder();
            final long c = aoej.c;
            builder4.copyOnWrite();
            final alie alie = (alie)builder4.instance;
            alie.b |= 0x1;
            alie.c = c;
            final alie c2 = (alie)builder4.build();
            builder3.copyOnWrite();
            final alhy alhy = (alhy)builder3.instance;
            c2.getClass();
            alhy.c = c2;
            alhy.b |= 0x1;
            final alhy f = (alhy)builder3.build();
            builder2.copyOnWrite();
            final alij alij = (alij)builder2.instance;
            f.getClass();
            alij.f = f;
            alij.b |= 0x10;
            final alij d = (alij)builder2.build();
            builder.copyOnWrite();
            final alhi alhi2 = (alhi)builder.instance;
            d.getClass();
            alhi2.D = d;
            alhi2.c |= 0x40000;
            alhi = (alhi)builder.build();
        }
        pf.J(3, (wzz)wyt, alhi);
    }
    
    public final void j() {
        this.c.a();
    }
    
    public final void k() {
        if (this.c.f()) {
            this.c.aj(27);
        }
    }
    
    public final void lW(final aun aun) {
        if (this.u.isEmpty()) {
            this.t.f(this.x.lX(this.r));
        }
        this.u.add(aun);
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
        this.j();
        this.u.remove(aun);
        if (this.u.isEmpty()) {
            this.t.b();
        }
        final aeyo a = aeyo.a;
        this.h((aezp)a, (aezp)a, aobh.a).W((asjg)gex.h, (asjm)gpg.m);
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
        if (this.u.isEmpty()) {
            ansd ansd;
            if ((ansd = ((vaf)this.w.a()).b().A) == null) {
                ansd = ansd.a;
            }
            if (!ansd.c || this.l.h()) {
                this.c.t();
            }
        }
        final aeyo a = aeyo.a;
        this.l = (aezp)a;
        this.m = (aezp)a;
        this.n = null;
    }
}
