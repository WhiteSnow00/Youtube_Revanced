import java.util.concurrent.atomic.AtomicReference;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.android.libraries.youtube.creation.trim.crop.CroppedVideoWithPreviewView;
import android.app.Activity;
import j$.time.Duration;
import com.google.android.libraries.youtube.edit.camera.ProgressBarData;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import android.content.Context;
import java.io.IOException;
import android.widget.Toast;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.edit.preview.UnifyTrimVideoControllerView;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.libraries.video.media.VideoMetaData;
import java.util.concurrent.Executor;
import android.widget.ImageView;
import android.net.Uri;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hek extends hew implements uco, rbr, rbq, ure, uci
{
    public ShortsVideoTrimView2 a;
    public aagm aA;
    public agmd aB;
    public maw aC;
    public fzo aD;
    public fzo aE;
    public avt aF;
    auip aG;
    public auip aH;
    public qpt aI;
    public qpt aJ;
    public qpt aK;
    public qpt aL;
    private aioe aM;
    private int aN;
    private long aO;
    private asic aP;
    public boolean ae;
    public int af;
    public int ag;
    public Uri ah;
    public uac ai;
    public boolean aj;
    hem ak;
    public ImageView al;
    public gxs am;
    public wwv an;
    public ucr ao;
    public heo ap;
    public Executor aq;
    public tzs ar;
    public tzg as;
    public tzz at;
    public hfd au;
    qxv av;
    int aw;
    int ax;
    public lhz ay;
    public hyq az;
    public rbi b;
    public VideoMetaData c;
    public boolean d;
    int e;
    
    public hek() {
        this.aN = 1;
        this.aO = -1L;
        this.ae = false;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131625416, viewGroup, false);
        final ucr ao = this.ao;
        ao.a = (uco)this;
        ao.c(inflate);
        this.ap.g(inflate, this.aH.bv() && !this.aM());
        final ShortsVideoTrimView2 b = this.ap.b;
        if (b != null) {
            this.a = b;
            final avt af = this.aF;
            af.getClass();
            b.I = af;
            b.F(new qxc(((br)this).nT(), inflate));
            this.a.a = (uci)this;
        }
        if (this.aM()) {
            this.b = (rbi)inflate.findViewById(2131432198);
        }
        else {
            this.b = (rbi)inflate.findViewById(2131432224);
        }
        this.b.setVisibility(0);
        this.al = (ImageView)inflate.findViewById(2131430409);
        final rbi b2 = this.b;
        if (b2 instanceof TrimVideoControllerView) {
            ((TrimVideoControllerView)b2).f = (ImageView)inflate.findViewById(2131430409);
        }
        else if (b2 instanceof UnifyTrimVideoControllerView) {
            (((UnifyTrimVideoControllerView)b2).h = new eg((ViewGroup)inflate.findViewById(2131430990))).ab();
        }
        return inflate;
    }
    
    public final void Y() {
        super.Y();
        final hem ak = this.ak;
        if (ak != null) {
            ak.f();
        }
        this.aL();
        this.o((trb)etd.t);
    }
    
    public final void aK(final lqt lqt) {
        throw null;
    }
    
    public final void aL() {
        hgd.y(this.aC, this.ay);
    }
    
    public final boolean aM() {
        final int e = this.e;
        return e == 5 || e == 7;
    }
    
    final boolean aN() {
        final rbi b = this.b;
        return b != null && b.z();
    }
    
    public final void aa() {
        super.aa();
        final hem ak = this.ak;
        if (ak != null) {
            ak.h((hel)new hej(this));
        }
        hgd.z(this.b, this.aC, (rbr)this, (rbq)this, ((hfc)this.au).d);
        this.o((trb)new gzr(this, 9));
        szc.f();
        final uac ai = this.ai;
        if (ai != null) {
            this.ah = ai.a;
            this.aG = this.aK.aq((uab)ai);
            final hem ak2 = this.ak;
            if (ak2 != null) {
                ak2.i(ai);
                final hem ak3 = this.ak;
                final auip ag = this.aG;
                ag.getClass();
                ak3.m(ag);
            }
        }
        final ShortsVideoTrimView2 a = this.a;
        if (a != null) {
            a.b = (ucb)new hfk(this, 1);
        }
        Object o = this.aC;
        if (o != null) {
            ((maw)o).c = new hed(this, 2);
        }
        Label_0466: {
            try {
                final rdc v = hgd.v((maw)o, this.ay);
                final Context nt = ((br)this).nT();
                if (this.a != null && this.aC != null) {
                    final lhz ay = this.ay;
                    if (ay != null && v != null && nt != null) {
                        final uac ai2 = this.ai;
                        if (ai2 != null) {
                            final Uri ah = this.ah;
                            if (ah != null) {
                                o = ai2.b;
                                if (o == null) {
                                    o = ay.g(ah, TimeUnit.MILLISECONDS.toMicros(this.af), TimeUnit.MILLISECONDS.toMicros(this.ag));
                                }
                                final rbi b = this.b;
                                b.getClass();
                                final ShortsVideoTrimView2 a2 = this.a;
                                final maw ac = this.aC;
                                ac.getClass();
                                final Uri ah2 = this.ah;
                                ah2.getClass();
                                final long c = ai2.c;
                                hgd.C(a2, ac, v, ah2, true, c, (EditableVideo)o, hgd.f(this.as.a(), nt), hgd.c(this.as.a(), this.at.d));
                                b.v(c);
                                break Label_0466;
                            }
                        }
                    }
                }
                zjp.b(zjo.a, zjn.l, "[ShortsCreation][Android][Trim]At least one of the dependencies needed to setup preview is null.");
                trn.b("At least one of the dependencies needed to setup preview is null.");
                Toast.makeText(((br)this).nT(), 2132020131, 1).show();
                this.s(false);
                break Label_0466;
            }
            catch (final IllegalStateException o) {}
            catch (final IOException ex) {}
            zjp.b(zjo.a, zjn.l, "[ShortsCreation][Android][Trim]Failed to open video.");
            trn.d("Failed to open video.", (Throwable)o);
            this.s(false);
        }
        final hem ak4 = this.ak;
        if (ak4 != null) {
            ak4.j(apmt.b);
        }
    }
    
    public final void ab(final View view, final Bundle bundle) {
        if (bundle != null) {
            this.aj = true;
            this.aO = bundle.getLong("playback_position", -1L);
        }
        final avt af = this.aF;
        if (af != null) {
            if (this.aM != null) {
                final tuw p2 = af.P(wya.b(96659));
                p2.a = null;
                p2.b = (agzi)this.aM;
                p2.b();
            }
            if (this.aM()) {
                final tuw s = this.aF.S(wya.c(140681));
                s.k(true);
                s.c();
            }
            else {
                final tuw s2 = this.aF.S(wya.c(96644));
                s2.k(true);
                s2.c();
            }
            final tuw s3 = this.aF.S(wya.c(96638));
            s3.k(true);
            s3.c();
            final tuw s4 = this.aF.S(wya.c(97091));
            s4.k(true);
            s4.c();
            this.aF.S(wya.c(110246)).c();
            this.aF.S(wya.c(110247)).c();
            this.aF.S(wya.c(110248)).c();
            this.aF.S(wya.c(97092)).c();
            this.aF.S(wya.c(141308)).c();
            this.aF.S(wya.c(141309)).c();
            this.aF.S(wya.c(141307)).c();
            this.aF.S(wya.c(121259)).c();
        }
        final int n = 0;
        this.av = (qxv)new heh(this, 0);
        final rbi b = this.b;
        if (b instanceof TrimVideoControllerView) {
            ((TrimVideoControllerView)b).h = new qpt(this, (byte[])null);
        }
        else if (b instanceof UnifyTrimVideoControllerView) {
            ((UnifyTrimVideoControllerView)b).i = new qpt(this);
        }
        final CroppedVideoWithPreviewView d = this.d();
        final rbi b2 = this.b;
        if (b2 != null && d != null) {
            this.aC = this.aL.T(b2, (VideoWithPreviewView)d, this.aO, this.aN);
        }
        this.o((trb)new gzr(this, 8));
        this.ay = this.aD.K();
        final int e = this.e;
        int aw = 0;
        Label_0498: {
            if (e != 0) {
                aw = 3;
                if (e == 5) {
                    this.ax = 3;
                    aw = 2;
                    break Label_0498;
                }
                if (e == 7) {
                    this.ax = 5;
                    break Label_0498;
                }
                this.ax = 1;
            }
            else {
                this.ax = 2;
            }
            aw = 1;
        }
        this.aw = aw;
        final uab b3 = this.ar.b();
        final int n2 = (int)tzz.c(b3);
        final int aw2 = this.aw;
        final int n3 = aw2 - 1;
        if (aw2 == 0) {
            throw null;
        }
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 == 2) {
                    final int c = this.at.c;
                    final uir e2 = ProgressBarData.e();
                    e2.c(2131102063);
                    e2.b(2131493099);
                    e2.e(2131102062);
                    final qpt ai = this.aI;
                    final hdo a = hdp.a();
                    a.e(this.ap);
                    final ShortsVideoTrimView2 a2 = this.a;
                    a2.getClass();
                    a.a = a2;
                    final rbi b4 = this.b;
                    b4.getClass();
                    a.b = b4;
                    final urf n4 = this.n();
                    n4.getClass();
                    a.c = n4;
                    a.b();
                    a.d(n2);
                    a.c(c);
                    a.d = e2;
                    final int ax = this.ax;
                    if (ax == 0) {
                        throw null;
                    }
                    a.e = ax;
                    this.ak = (hem)ai.O(a.a());
                }
            }
            else {
                uir e3;
                if (((uyi)this.aH.b).l(45381852L).aG()) {
                    e3 = ProgressBarData.e();
                    e3.c(2131102065);
                    e3.e(2131102069);
                }
                else {
                    e3 = null;
                }
                int a3;
                if (b3 == null) {
                    a3 = n;
                }
                else {
                    a3 = b3.a();
                }
                final qpt ai2 = this.aI;
                final hdo a4 = hdp.a();
                a4.e(this.ap);
                final ShortsVideoTrimView2 a5 = this.a;
                a5.getClass();
                a4.a = a5;
                final rbi b5 = this.b;
                b5.getClass();
                a4.b = b5;
                final urf n5 = this.n();
                n5.getClass();
                a4.c = n5;
                a4.b();
                a4.d(n2);
                a4.c(a3);
                a4.d = e3;
                final int ax2 = this.ax;
                if (ax2 == 0) {
                    throw null;
                }
                a4.e = ax2;
                this.ak = (hem)ai2.O(a4.a());
            }
        }
        else {
            final qpt aj = this.aJ;
            final heo ap = this.ap;
            if (ap == null) {
                throw new NullPointerException("Null videoTrimController");
            }
            final ShortsVideoTrimView2 a6 = this.a;
            a6.getClass();
            final rbi b6 = this.b;
            b6.getClass();
            final int n6 = (int)Duration.ofMillis((long)this.ag).getSeconds();
            final urf n7 = this.n();
            n7.getClass();
            final int ax3 = this.ax;
            if (ax3 == 0) {
                throw null;
            }
            this.ak = (hem)new hdl((Activity)((eqa)aj.a).c.c.a(), (wwv)((eqa)aj.a).d.h.a(), (avt)((eqa)aj.a).d.i.a(), (hga)((eqa)aj.a).c.R(), ((eqa)aj.a).c.af(), (ucs)((eqa)aj.a).c.O.a(), new hdk(ap, a6, b6, n6, n7, ax3), null, null, null);
        }
        final hem ak = this.ak;
        if (ak != null) {
            ak.a(view);
        }
        if (bundle != null) {
            this.ai = uac.f(bundle);
            return;
        }
        final int e4 = this.e;
        if (e4 == 0) {
            this.ai = (uac)this.ar.b();
            return;
        }
        if (e4 != 5 && e4 != 7) {
            if (e4 == 4) {
                if (!uab.ad(this.ar.b())) {
                    if (uab.af(this.ar.b())) {
                        this.aP = this.ar.c().J((asjd)flu.n).aB((asix)new hep(this, 1));
                    }
                }
                else {
                    this.ai = (uac)this.ar.b();
                }
            }
            return;
        }
        final VideoMetaData c2 = this.c;
        if (c2 != null) {
            this.ai = uac.d(c2.a, "unused");
            return;
        }
        zjp.b(zjo.a, zjn.l, "[ShortsCreation][Android][Trim]Unable to create legacy TrimProject for Segment Import/Green Screen M2.0. VideoMetaData is unexpectedly null.");
    }
    
    public final void b(final float n) {
        final CroppedVideoWithPreviewView d = this.d();
        if (d != null && d.g()) {
            final avt af = this.aF;
            if (af != null) {
                af.S(wya.c(121259)).i();
                d.j(n);
                if (this.d) {
                    final urf n2 = this.n();
                    if (n2 != null) {
                        n2.m();
                    }
                }
                final urf n3 = this.n();
                EditableVideo d2;
                if (n3 == null) {
                    d2 = null;
                }
                else {
                    d2 = n3.d;
                }
                if (d2 != null) {
                    final auip ag = this.aG;
                    if (ag != null) {
                        ag.bm(d2);
                    }
                }
            }
        }
    }
    
    final CroppedVideoWithPreviewView d() {
        return (CroppedVideoWithPreviewView)this.ao.b;
    }
    
    final urf n() {
        final maw ac = this.aC;
        if (ac != null) {
            return (urf)ac.b;
        }
        return null;
    }
    
    public final void nP(final boolean b) {
        final bu od = ((br)this).od();
        if (b) {
            if (od != null) {
                ((Activity)od).getWindow().addFlags(128);
            }
        }
        else {
            if (od != null) {
                ((Activity)od).getWindow().clearFlags(128);
            }
            if (!this.aN()) {
                final rbi b2 = this.b;
                if (b2 != null && !b2.d) {
                    final ShortsVideoTrimView2 a = this.a;
                    if (a != null && !a.D && !this.d) {
                        b2.t();
                    }
                }
            }
        }
    }
    
    public final void nm() {
        super.nm();
        hgd.B(this.aC, this.a, (rbr)this, (rbq)this);
        this.o((trb)hen.b);
        this.p();
    }
    
    public final void nv(final long n) {
        final ShortsVideoTrimView2 a = this.a;
        if (a != null) {
            a.H(n);
        }
    }
    
    public final void nw(final long c) {
        final uac ai = this.ai;
        if (ai != null) {
            ai.c = c;
        }
        final rbi b = this.b;
        if (b != null) {
            b.v(c);
        }
    }
    
    public final void nx() {
        final wyb c = wya.c(97091);
        final avt af = this.aF;
        if (af != null) {
            af.S(c).d();
        }
        final rbi b = this.b;
        if (b == null || !b.d) {
            final ShortsVideoTrimView2 a = this.a;
            if (a == null || !a.D) {
                if (b != null) {
                    b.t();
                }
                this.d = (this.aN() ^ true);
                this.ao.d(this.aN());
            }
        }
    }
    
    public final void o(final trb trb) {
        trb.a((Object)this.au);
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        if (m != null) {
            final byte[] byteArray = m.getByteArray("SHORTS_EDIT_VIDEO_ENDPOINT");
            if (byteArray != null) {
                try {
                    this.aM = (aioe)agzi.parseFrom((agzi)aioe.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab) {
                    trn.d("Error parsing navigation endpoint.", (Throwable)ahab);
                }
            }
            this.e = m.getInt("navigation_source_key");
            this.aN = m.getInt("max_hardware_decoders");
            this.af = m.getInt("min_video_length_ms");
            this.ag = m.getInt("max_video_length_ms");
        }
        final agmd ab = this.aB;
        int b;
        if (!this.aM()) {
            b = 5;
        }
        else {
            b = 3;
        }
        ab.b = b;
        final Context nt = ((br)this).nT();
        if (nt != null) {
            hdv.a(nt);
        }
    }
    
    public final void p() {
        final asic ap = this.aP;
        if (ap != null) {
            asjg.b((AtomicReference)ap);
            this.aP = null;
        }
    }
    
    public final void pK(final Bundle bundle) {
        final urf n = this.n();
        long h;
        if (n == null) {
            h = 0L;
        }
        else {
            h = n.h();
        }
        bundle.putLong("playback_position", h);
        final uac ai = this.ai;
        if (ai != null) {
            ((uab)ai).I(bundle);
        }
    }
    
    public final void q() {
    }
    
    public final void r() {
        this.s(true);
    }
    
    public final void s(final boolean b) {
        if (b) {
            final hem ak = this.ak;
            if (ak != null) {
                ak.j(apmt.e);
            }
        }
        if (!this.aM()) {
            final CroppedVideoWithPreviewView d = this.d();
            if (d != null) {
                d.setVisibility(4);
            }
            final gxs am = this.am;
            if (am != null) {
                am.d();
            }
            return;
        }
        this.am.k();
    }
}
