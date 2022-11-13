import com.google.protos.youtube.api.innertube.SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.creation.music.AutoValue_ShortsCreationSelectedTrack;
import com.google.protos.youtube.api.innertube.GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcq implements ubi
{
    public final abll a;
    public final ativ b;
    public final hci c;
    public final Context d;
    public final ubu e;
    final long f;
    public final wyv g;
    public boolean h;
    public final boolean i;
    public final boolean j;
    public ubk k;
    public final vai l;
    public final aujg m;
    public pvh n;
    private final abmg o;
    private final Executor p;
    private final ynp q;
    private final Executor r;
    private final azf s;
    private final zmf t;
    private final vwa u;
    private final eg v;
    
    public hcq(final Context d, final abll a, final abmg o, final ynp q, final Executor p20, final hci c, final Executor r, final fzw fzw, final wyv g, final vwa u, final zmf t, final aujg m, final vai l, final ubu e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = ativ.aE();
        this.s = (azf)new hco(this);
        this.a = a;
        this.o = o;
        this.q = q;
        this.p = p20;
        this.c = c;
        this.r = r;
        this.d = d;
        final tjb tjb = (tjb)((atke)fzw.b).a();
        tjb.getClass();
        final gxp gxp = (gxp)((atke)fzw.a).a();
        gxp.getClass();
        this.v = new eg(tjb, gxp, (ubl)this);
        this.g = g;
        this.u = u;
        this.t = t;
        this.m = m;
        this.l = l;
        this.e = e;
        this.i = m.bx();
        this.j = m.bB();
        this.f = m.bn();
    }
    
    private final void u(final abmi abmi, final aiqj aiqj) {
        final ListenableFuture q = afwm.q((Callable)new exo(this, abmi, 15), this.p);
        final ListenableFuture j = this.u.i(this.t.c()).j(aiqj, this.p);
        teu.k(afwm.L(new ListenableFuture[] { q, j }).j((Callable)new hcm(this, j, q), this.p), this.p, (tes)new fcf(this, 17), (tet)new esc(this, 18));
    }
    
    private final void v(final String b, final String c, final aiqj aiqj) {
        this.g.pF().D((wzz)new wyt(xaa.c(123970)));
        final pvh n = this.n;
        if (n != null) {
            n.G();
        }
        final hcp hcp = new hcp(this);
        final abmi d = this.o.d();
        d.c = c;
        d.b = b;
        d.x(abjv.d.i);
        ((vkk)d).j(ahab.b);
        if (aiqj != null && ((ahbc)aiqj).ry((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand)) {
            this.u(d, aiqj);
            return;
        }
        this.p.execute((Runnable)new gpd(this, d, (zpe)hcp, 5));
    }
    
    private final void w() {
        if (this.k == null) {
            return;
        }
        this.g.pF().D((wzz)new wyt(xaa.c(123970)));
        final pvh n = this.n;
        if (n != null) {
            n.G();
        }
        final hcp hcp = new hcp(this);
        final abmi d = this.o.d();
        d.b = ((AutoValue_ShortsCreationSelectedTrack)this.k.a()).c;
        d.x(abjv.d.i);
        final String f = ((AutoValue_ShortsCreationSelectedTrack)this.k.a()).f;
        if (f != null) {
            d.c = f;
        }
        ((vkk)d).j(ahab.b);
        final aiqj g = ((AutoValue_ShortsCreationSelectedTrack)this.k.a()).g;
        if (g != null && ((ahbc)g).ry((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand)) {
            this.u(d, g);
            return;
        }
        this.p.execute((Runnable)new gpd(this, d, (zpe)hcp, 4));
    }
    
    public final ShortsCreationSelectedTrack a() {
        if (this.b.aG() != null && ((aezp)this.b.aG()).h()) {
            return (ShortsCreationSelectedTrack)((aezp)this.b.aG()).c();
        }
        return null;
    }
    
    public final asht b() {
        return ((ashi)this.b).ai();
    }
    
    public final void c() {
        this.b.tu((Object)aeyo.a);
        if (this.i) {
            this.k = ShortsCreationSelectedTrack.r();
        }
        final pvh n = this.n;
        if (n != null) {
            n.F();
        }
    }
    
    public final void d() {
        this.r.execute(new gxo(this, 16));
    }
    
    public final void e() {
        final hci c = this.c;
        if (!c.e) {
            final bei bei = new bei(c.a);
            bei.b((bfc)c.i);
            c.j = bei.a();
            if (!c.k.bq()) {
                bbx.b(c.j);
            }
            c.h(true);
            c.j.s(c.b);
            c.j.I(c.c);
            c.e = true;
        }
        final hci c2 = this.c;
        final azf s = this.s;
        final bej j = c2.j;
        if (j != null) {
            j.s(s);
        }
        if (this.a() != null && this.a().d() != null && !this.c.d) {
            this.r.execute(new gwk(this, this.a().d(), 13));
        }
    }
    
    public final void f(final long n) {
        if (this.c.e) {
            this.r.execute((Runnable)new gtp(this, n, 4));
        }
    }
    
    public final void g(final long n) {
        this.q(n, (aezp)aeyo.a);
    }
    
    public final void h(final Bundle bundle) {
        if (bundle != null && bundle.containsKey("shorts_selected_audio_track")) {
            final ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack)bundle.getParcelable("shorts_selected_audio_track");
            if (shortsCreationSelectedTrack != null) {
                this.b.tu((Object)aezp.k((Object)shortsCreationSelectedTrack));
            }
        }
    }
    
    public final void i(final Bundle bundle) {
        final ShortsCreationSelectedTrack a = this.a();
        if (a != null) {
            bundle.putParcelable("shorts_selected_audio_track", (Parcelable)a);
        }
    }
    
    public final void j(final long n) {
        final ShortsCreationSelectedTrack a = this.a();
        if (a != null) {
            final ativ b = this.b;
            final ubk e = a.e();
            e.e(true);
            e.h(n);
            b.tu((Object)aezp.k((Object)e.a()));
            this.f(n);
        }
    }
    
    public final void k() {
        this.n = null;
        final hci c = this.c;
        final azf s = this.s;
        final bej j = c.j;
        if (j != null) {
            j.w(s);
        }
    }
    
    public final void l() {
        final hci c = this.c;
        if (c.e) {
            c.g = 0L;
            c.d = false;
            c.h = 0L;
            final bej j = c.j;
            if (j != null) {
                j.D();
            }
        }
        this.c();
    }
    
    public final void m(final PlayerResponseModel playerResponseModel) {
        yfu j = null;
        Label_0047: {
            try {
                if (playerResponseModel.n() != null) {
                    j = this.q.j(playerResponseModel.n(), playerResponseModel.m(), true);
                    break Label_0047;
                }
            }
            catch (final yfw yfw) {
                ttr.d("SCMusicController: Missing stream", (Throwable)yfw);
            }
            j = null;
        }
        Object o = null;
        Label_0205: {
            if (j != null) {
                final FormatStreamModel[] c = j.c;
                if (c != null) {
                    final int length = c.length;
                    if (length != 0) {
                        for (final FormatStreamModel formatStreamModel : c) {
                            if (formatStreamModel.f() == 3 && !formatStreamModel.d.toString().isEmpty()) {
                                o = aezp.k((Object)formatStreamModel.d);
                                break Label_0205;
                            }
                        }
                        ttr.l("[Shorts Creation][Music] Medium quality stream not found, using the first available stream. ");
                        if (!j.c[0].d.toString().isEmpty()) {
                            o = aezp.k((Object)j.c[0].d);
                            break Label_0205;
                        }
                        this.d();
                        o = aeyo.a;
                        break Label_0205;
                    }
                }
            }
            if (j != null) {
                ttr.b("[Shorts Creation][Music] No usable audio streams found in response");
            }
            this.d();
            o = aeyo.a;
        }
        if (((aezp)o).h()) {
            final eg v = this.v;
            final long e = playerResponseModel.n().e;
            akxm akxm;
            if ((akxm = playerResponseModel.z().h) == null) {
                akxm = akxm.b;
            }
            while (true) {
                for (final amhu amhu : akxm.g) {
                    if (amhu.b == 1) {
                        final String b = ((amht)amhu.c).b;
                        final Object d = v.d;
                        final gxp gxp = (gxp)v.c;
                        gxp.g = gxp.a.b(almx.aY);
                        ((tjb)d).a((tlv)new hct(v, b, (dbe)new hcs(v, e, (byte[])null), e, null));
                        this.r.execute(new gwk(this, (aezp)o, 14));
                        return;
                    }
                }
                ((ubl)v.b).g(e);
                continue;
            }
        }
        ttr.b("SCMusicController: Streaming url not found");
    }
    
    public final void n(final SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand) {
        this.h = false;
        if (this.i) {
            this.k = ShortsCreationSelectedTrack.s(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand).e();
            if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 0x8) == 0x0) {
                this.f(((AutoValue_ShortsCreationSelectedTrack)this.k.a()).d);
            }
            this.w();
            return;
        }
        this.b.tu((Object)aezp.k((Object)ShortsCreationSelectedTrack.s(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand)));
        if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 0x8) == 0x0) {
            this.f(tpe.bL(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand));
        }
        final String c = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.c;
        final String d = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.d;
        aiqj aiqj;
        if ((aiqj = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.g) == null) {
            aiqj = aiqj.a;
        }
        this.v(c, d, aiqj);
    }
    
    public final void o(final aoep aoep) {
        this.h = false;
        if (this.i) {
            this.c();
            this.k = ShortsCreationSelectedTrack.t(aoep).e();
            if ((aoep.b & 0x10) != 0x0 && !this.j) {
                this.f(((AutoValue_ShortsCreationSelectedTrack)this.k.a()).d);
                this.h = true;
            }
            this.w();
            return;
        }
        this.b.tu((Object)aezp.k((Object)ShortsCreationSelectedTrack.t(aoep)));
        if ((aoep.b & 0x10) != 0x0 && !this.j) {
            this.f(tpe.bN(aoep));
            this.h = true;
        }
        final String c = aoep.c;
        final String g = aoep.g;
        aiqj aiqj;
        if ((aiqj = aoep.h) == null) {
            aiqj = aiqj.a;
        }
        this.v(c, g, aiqj);
    }
    
    public final void p(final arbc arbc, final boolean b) {
        this.h = true;
        if (this.i) {
            if (b) {
                this.c();
            }
            final ubk e = ShortsCreationSelectedTrack.u(arbc).e();
            this.k = e;
            this.b.tu((Object)aezp.k((Object)e.a()));
            this.f(((AutoValue_ShortsCreationSelectedTrack)this.k.a()).d);
            this.w();
            return;
        }
        this.b.tu((Object)aezp.k((Object)ShortsCreationSelectedTrack.u(arbc)));
        this.f(tpe.bO(arbc));
        final String c = arbc.c;
        final String f = arbc.f;
        aiqj aiqj;
        if ((aiqj = arbc.g) == null) {
            aiqj = aiqj.a;
        }
        this.v(c, f, aiqj);
    }
    
    public final void q(final long n, final aezp aezp) {
        this.r.execute(new hcn(this, n, aezp, 0));
    }
    
    public final boolean r(final ShortsCreationSelectedTrack shortsCreationSelectedTrack) {
        return shortsCreationSelectedTrack.f().h();
    }
    
    public final void s() {
        if (this.a() != null) {
            final ativ b = this.b;
            final ubk e = this.a().e();
            e.d(true);
            b.tu((Object)aezp.k((Object)e.a()));
        }
    }
    
    public final void t(final pvh n) {
        this.n = n;
    }
}
