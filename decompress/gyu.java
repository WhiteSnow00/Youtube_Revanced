import com.google.android.libraries.blocks.runtime.BaseClient;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import android.net.Uri;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.List;
import com.google.android.libraries.blocks.runtime.ReaderProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamReader;
import java.util.function.Consumer;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.creation.editor.volume.Volumes;
import java.util.Map;
import java.util.Set;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyu implements txz, azf
{
    public long a;
    public long b;
    public final oby c;
    public final Context d;
    public boolean e;
    bej f;
    public long g;
    public final atjs h;
    public boolean i;
    public EditableVideo j;
    public final Set k;
    public rcp l;
    public aezp m;
    public boolean n;
    final Map o;
    public uly p;
    public final aujg q;
    private final atjs r;
    private bsf s;
    private Volumes t;
    
    public gyu(final Context d, final oby c, aujg aujg, final atke atke, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = -9223372036854775807L;
        this.b = 0L;
        this.e = false;
        this.k = agqs.ai();
        this.m = (aezp)aeyo.a;
        this.o = agpi.I(5);
        this.t = Volumes.b();
        this.d = d;
        this.c = c;
        this.r = atjs.e();
        this.h = atjs.e();
        this.q = aujg;
        if (aujg.bC()) {
            aujg = (aujg)atke.a();
            this.l = (rcp)aujg;
            try {
                aujg.getClass();
                try {
                    final obq j = ((rcp)aujg).j;
                    final ahao a = ahao.a;
                    j.p();
                    final aqsk aqsk = (aqsk)((BaseClient)j).c(27285591, (MessageLite)a, aqsk.a.getParserForType());
                    if ((aqsk.b & 0x1) != 0x0) {
                        aqrs aqrs;
                        if ((aqrs = aqsk.c) == null) {
                            aqrs = aqrs.c();
                        }
                        final amfw a2 = aqrs.a();
                        ((rcp)aujg).f.ifPresent((Consumer)new llh(a2, 17));
                        aqrs aqrs2;
                        if ((aqrs2 = aqsk.c) == null) {
                            aqrs2 = aqrs.c();
                        }
                        throw new atzi(aqrs2.d(), (Throwable)null, a2.a());
                    }
                    final obq i = ((rcp)aujg).j;
                    final ahao a3 = ahao.a;
                    i.p();
                    ((rcp)aujg).i = new RuntimeStreamReader(((BaseClient)i).nativeCallReadableStream(((BaseClient)i).a, 1700378535, ((MessageLite)a3).toByteArray()), aqrt.a());
                    final RuntimeStreamReader k = ((rcp)aujg).i;
                    k.nativeSetReader(k.a, (ReaderProxy)k.b);
                    ((rcp)aujg).i.b.a = (Consumer)new llh((rcp)aujg, 18);
                    final rcp l = this.l;
                    l.getClass();
                    l.b = true;
                }
                catch (final RuntimeException ex) {
                    final amfu h = amfu.h;
                    ((rcp)aujg).f.ifPresent((Consumer)new llh(h, 14));
                    throw new atzi(ex.getMessage(), (Throwable)ex, h);
                }
            }
            catch (final atzi atzi) {
                ttr.b("VideoPlaybackC: Failed to initialize MEAudioPlayer");
                zlm.c(zll.b, zlk.f, "[ShortsCreation][Android][Edit]Failed to initialize MEAudioPlayer", (Throwable)atzi);
            }
        }
    }
    
    private final Object al(final aezf aezf, final Object o) {
        final bej f = this.f;
        if (f == null) {
            return o;
        }
        return aezf.apply((Object)f);
    }
    
    private final void am() {
        if (this.s == null) {
            this.s = (bsf)new qza(this, 1);
        }
        final bej f = this.f;
        if (f != null) {
            f.P(this.s);
        }
    }
    
    private final void an(final apoy apoy, final float n) {
        if (this.o.containsKey(apoy)) {
            final List list = this.o.get(apoy);
            if (list != null) {
                for (final atzh atzh : list) {
                    final rcp l = this.l;
                    l.getClass();
                    l.d((Callable)new rcm(l, atzh, n));
                }
            }
        }
    }
    
    public final void A() {
    }
    
    public final void B() {
    }
    
    public final void C() {
    }
    
    public final void D() {
    }
    
    public final void E() {
    }
    
    public final void F() {
    }
    
    public final long G() {
        return (long)this.al((aezf)new ggp(this, 12), 0L);
    }
    
    public final long H() {
        long n;
        if ((n = this.a) == -9223372036854775807L) {
            n = (long)this.al((aezf)glc.l, 0L);
        }
        return n;
    }
    
    public final long I() {
        return (long)this.al((aezf)glc.m, 0L);
    }
    
    public final long J() {
        return (long)this.al((aezf)glc.l, 0L);
    }
    
    public final bfq K(final bfp bfp) {
        final bej f = this.f;
        if (f == null) {
            return null;
        }
        return f.b(bfp);
    }
    
    public final aezp L() {
        return this.m;
    }
    
    public final asht M() {
        return (asht)this.r;
    }
    
    public final asht N() {
        return (asht)this.h;
    }
    
    public final void O(final txy txy) {
        this.k.add(txy);
        this.am();
    }
    
    public final void P(final azf azf) {
        this.Q((ttg)new goe(azf, 17));
    }
    
    public final void Q(final ttg ttg) {
        final bej f = this.f;
        if (f != null) {
            ttg.a((Object)f);
        }
    }
    
    public final void R() {
        final bej f = this.f;
        if (f != null) {
            final bsf s = this.s;
            if (s != null) {
                f.K(s);
            }
        }
        this.m = (aezp)aeyo.a;
        final bej f2 = this.f;
        if (f2 != null) {
            f2.w((azf)this);
            this.f.v();
            this.f = null;
            final rcp l = this.l;
            if (l != null) {
                l.b();
                this.o.clear();
            }
        }
    }
    
    public final void S(final boolean n) {
        this.n = n;
        final rcp l = this.l;
        Object o;
        if (l != null && n) {
            o = new tzs(this.d, (bfd)new tzr(l));
        }
        else {
            o = new bee(this.d);
        }
        final Context d = this.d;
        this.f = new bei(d, (bfu)o, (bnw)new bnj(d), (brb)new bqv(this.d), (bfc)new beb(), (bre)brg.i(d), (bga)new bgt(bad.a)).a();
        if (!this.q.bq()) {
            final bej f = this.f;
            if (f != null) {
                bbx.b(f);
            }
        }
        final bej f2 = this.f;
        if (f2 != null) {
            f2.s((azf)this);
        }
        this.i = false;
    }
    
    public final void T() {
        if (this.l != null && this.n) {
            for (final apoy apoy : apoy.values()) {
                if (apoy != apoy.a) {
                    this.an(apoy, 0.0f);
                }
            }
            return;
        }
        ttr.m("VideoPlaybackC: ", "mute() is only supported for me player.");
    }
    
    public final void U() {
        final bej f = this.f;
        boolean e = false;
        if (f != null) {
            e = e;
            if (!f.E()) {
                e = true;
            }
        }
        this.e = e;
        this.W();
        this.Q((ttg)etg.q);
    }
    
    public final void V() {
        final rcp l = this.l;
        if (l != null && this.n) {
            l.g();
        }
    }
    
    public final void W() {
        this.Q((ttg)new goe(this, 20));
    }
    
    public final void X() {
        this.Q((ttg)new goe(this, 16));
    }
    
    public final void Y(final txy txy) {
        this.k.remove(txy);
    }
    
    public final void Z(final azf azf) {
        this.Q((ttg)new goe(azf, 19));
    }
    
    public final void a(final azh azh, final aze aze) {
        if (aze.a.c(7) && azh.g()) {
            final rcp l = this.l;
            if (l != null && this.n) {
                l.d((Callable)new pzd(l, 16));
            }
        }
    }
    
    public final void aa() {
        if (!this.e) {
            this.X();
        }
    }
    
    public final void ab(final long n) {
        this.Q((ttg)new zhg(this, n, 1));
    }
    
    public final void ac(final long a, final Runnable runnable) {
        if (this.c.d() - this.b > 50L) {
            final bej f = this.f;
            if (f != null && f.k() == 3) {
                if (runnable != null) {
                    runnable.run();
                }
                this.ab(a);
                this.a = -9223372036854775807L;
                return;
            }
        }
        this.h.tu((Object)a);
        this.a = a;
    }
    
    public final void ad(final int n) {
        this.Q((ttg)new hlp(this, n, 1));
    }
    
    public final void ae(final SurfaceTexture surfaceTexture) {
        this.Q((ttg)new goe(new Surface(surfaceTexture), 18));
    }
    
    public final void af(final Volumes t) {
        if (this.l != null && this.n) {
            this.t = t;
            for (final apoy apoy : apoy.values()) {
                if (apoy != apoy.a) {
                    this.an(apoy, t.a(apoy));
                }
            }
            return;
        }
        ttr.m("VideoPlaybackC: ", "setVolumes is only supported for me player.");
    }
    
    public final void ag() {
        if (this.l != null && this.n) {
            this.af(this.t);
            return;
        }
        ttr.m("VideoPlaybackC: ", "unmute() is only supported for me player.");
    }
    
    public final boolean ah() {
        return (boolean)this.al((aezf)glc.n, false);
    }
    
    public final void ai(final uly p2, final EditableVideo j) {
        this.p = p2;
        this.j = j;
        this.am();
    }
    
    public final void aj(final Uri uri, final long n, final EditableVideo editableVideo, final aezp aezp, final afeq afeq) {
        if (this.f == null) {
            ttr.b("ExoPlayer null while attempting to load video");
            return;
        }
        if (uri != null) {
            if (n != 0L) {
                if (aezp.h() && ((ShortsCreationSelectedTrack)aezp.c()).d() == null) {
                    return;
                }
                this.m = aezp.k((Object)uri);
                final Context d = this.d;
                final bbs bbs = new bbs(d, bax.T(d, "VideoMPEG"));
                Object b;
                final bor bor = (bor)(b = new boq((bbk)bbs).b(ayu.b(uri)));
                if (editableVideo != null) {
                    b = new bmz((bny)bor, editableVideo.n(), editableVideo.l());
                }
                if (aezp.h() && ((ShortsCreationSelectedTrack)aezp.c()).d() != null) {
                    final Uri d2 = ((ShortsCreationSelectedTrack)aezp.c()).d();
                    Object o;
                    if (d2 != null) {
                        final bor b2 = new boq((bbk)bbs).b(ayu.b(d2));
                        this.g = ((ShortsCreationSelectedTrack)aezp.c()).c();
                        o = new bmz((bny)b2, TimeUnit.MILLISECONDS.toMicros(this.g), TimeUnit.MILLISECONDS.toMicros(this.g + Math.min(n, ((ShortsCreationSelectedTrack)aezp.c()).b())));
                    }
                    else {
                        o = null;
                    }
                    if (o != null && !this.n) {
                        b = new boi(true, new bny[] { (bny)b, (bny)o }, (byte[])null);
                    }
                    else {
                        b = new boi(true, new bny[] { (bny)b }, (byte[])null);
                    }
                }
                this.Q((ttg)new gys(this, afeq, n, aezp, (bny)b));
            }
        }
    }
    
    public final void ak(final obq obq) {
        final rcp l = this.l;
        if (l != null && obq != null) {
            l.f = Optional.ofNullable((Object)new atzj(obq, (byte[])null));
        }
    }
    
    public final void b(final boolean b) {
    }
    
    public final void c(final boolean b) {
        if (b) {
            this.a = -9223372036854775807L;
        }
        this.r.tu((Object)b);
    }
    
    public final void d(final azc azc) {
    }
    
    public final void e(final int n) {
    }
    
    public final void f(final azb azb) {
    }
    
    public final void g(final azb azb) {
    }
    
    public final void h(final boolean b, final int n) {
    }
    
    public final void i(final azg azg, final azg azg2, final int n) {
    }
    
    public final void j() {
    }
    
    public final void k() {
    }
    
    public final void l(final boolean b) {
    }
    
    public final void m(final azr azr) {
    }
    
    public final void n(final azs azs) {
    }
    
    public final void o() {
    }
    
    public final void p() {
    }
    
    public final void q(final int n) {
    }
    
    public final void r() {
    }
    
    public final void s() {
    }
    
    public final void t() {
    }
    
    public final void u() {
    }
    
    public final void v() {
    }
    
    public final void w() {
    }
    
    public final void x() {
    }
    
    public final void y() {
    }
    
    public final void z() {
    }
}
