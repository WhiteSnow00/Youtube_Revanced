import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.TranscodeOptions;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import java.util.concurrent.atomic.AtomicReference;
import android.app.Activity;
import com.google.android.libraries.youtube.creation.trim.crop.CroppedVideoWithPreviewView;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import android.widget.ImageView;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import com.google.android.libraries.youtube.edit.camera.ProgressBarData;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hef extends hev implements View$OnClickListener, rbr, rbq
{
    int a;
    final hfb aA;
    final uci aB;
    public lhz aC;
    public hyq aD;
    public aagm aE;
    public agmd aF;
    public maw aG;
    public fzo aH;
    public fzo aI;
    public avt aJ;
    auip aK;
    public qpt aL;
    public qpt aM;
    private aioe aN;
    private YouTubeButton aO;
    private TextView aP;
    public int ae;
    long af;
    boolean ag;
    asic ah;
    public aqyq ai;
    public aqyq aj;
    aqyy ak;
    apit al;
    public ProgressBarData[] am;
    TrimVideoControllerView an;
    public ShortsVideoTrimView2 ao;
    ImageView ap;
    public MultiSegmentCameraProgressIndicator aq;
    public heo ar;
    public ucr as;
    public tzs at;
    public wwv au;
    public hfd av;
    public tzz aw;
    public tzg ax;
    public Executor ay;
    final qxv az;
    public int b;
    public int c;
    public int d;
    public aqyw e;
    
    public hef() {
        this.aN = aioe.a;
        this.a = 2;
        this.af = -1L;
        this.ai = aqyq.a;
        final apmt a = apmt.a;
        this.az = (qxv)new heh(this, 1);
        this.aA = (hfb)new heg(this, 1);
        this.aB = (uci)new hec(this);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final View inflate = layoutInflater.inflate(2131625386, viewGroup, false);
        (this.aq = (MultiSegmentCameraProgressIndicator)inflate.findViewById(2131430658)).c(this.aw.c);
        final ucr as = this.as;
        as.a = (uco)new hee(this, 0);
        as.c(inflate);
        this.an = (TrimVideoControllerView)inflate.findViewById(2131432198);
        final ImageView imageView = (ImageView)inflate.findViewById(2131430409);
        this.ap = imageView;
        final TrimVideoControllerView an = this.an;
        if (an != null) {
            an.f = imageView;
        }
        this.aK = this.aL.ap();
        this.ar.f(inflate);
        final ShortsVideoTrimView2 b = this.ar.b;
        if ((this.ao = b) != null) {
            final avt aj = this.aJ;
            if (aj != null) {
                b.I = aj;
                b.F(new qxc(((br)this).nT(), inflate));
                this.ao.a = this.aB;
            }
        }
        this.aO = (YouTubeButton)inflate.findViewById(2131428219);
        (this.aO = (YouTubeButton)inflate.findViewById(2131428219)).setText((CharSequence)((br)this).nZ().getString(2132017715));
        this.aO.setContentDescription((CharSequence)((br)this).nZ().getString(2132019699));
        this.aO.setOnClickListener((View$OnClickListener)this);
        (this.aP = (TextView)inflate.findViewById(2131428220)).setText((CharSequence)((br)this).nT().getResources().getString(2132017717));
        return inflate;
    }
    
    public final void Y() {
        super.Y();
        this.aK();
        this.av.g();
    }
    
    public final void aK() {
        hgd.x((rbi)this.an, this.aG, this.aC, (rbr)this, (rbq)this);
    }
    
    final boolean aL() {
        final maw ag = this.aG;
        return ag != null && ag.r();
    }
    
    public final void aa() {
        super.aa();
        final hfd av = this.av;
        if (av != null) {
            av.i(this.aE.b(), this.aA);
        }
        hgd.z((rbi)this.an, this.aG, (rbr)this, (rbq)this, ((hfc)this.av).d);
        this.s(apmt.b);
    }
    
    public final void ab(final View view, final Bundle bundle) {
        if (bundle != null) {
            this.b = bundle.getInt("min_video_duration_ms");
            this.c = bundle.getInt("remaining_project_space_ms");
            this.d = bundle.getInt("selected_video_index");
            this.a = bundle.getInt("max_hardware_decoders");
            this.af = bundle.getLong("playback_position", -1L);
            this.ai = hgd.g("pending_clip_edit_metadata", bundle);
            this.aj = hgd.g("original_Clip_edit_metadata", bundle);
            if (bundle.containsKey("pending_visual_remix_source_data")) {
                try {
                    this.ak = (aqyy)aeda.aq(bundle, "pending_visual_remix_source_data", (MessageLite)aqyy.a, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab) {
                    this.ak = aqyy.a;
                }
            }
        }
        final CroppedVideoWithPreviewView d = this.d();
        final TrimVideoControllerView an = this.an;
        if (an != null && d != null) {
            final maw t = this.aM.T((rbi)an, (VideoWithPreviewView)d, this.af, this.a);
            this.aG = t;
            t.c = new hed(this, 0);
            final Object b = t.b;
            this.aF.b = 2;
            this.av.f((urf)b);
        }
        final avt aj = this.aJ;
        if (aj == null) {
            return;
        }
        final tuw s = aj.S(wya.c(130253));
        s.k(true);
        s.c();
        final tuw s2 = aj.S(wya.c(97091));
        s2.k(true);
        s2.c();
        final tuw s3 = aj.S(wya.c(110247));
        s3.k(true);
        s3.c();
        final tuw s4 = aj.S(wya.c(121259));
        s4.k(true);
        s4.c();
    }
    
    final CroppedVideoWithPreviewView d() {
        return (CroppedVideoWithPreviewView)this.as.b;
    }
    
    public final wwv n() {
        return this.au;
    }
    
    public final void nP(final boolean b) {
        final bu od = ((br)this).od();
        if (od != null) {
            hgd.w(b, this.aG, (Activity)od, hgd.o((rbi)this.an, this.ao, this.aL(), this.ag));
        }
    }
    
    public final void nm() {
        super.nm();
        hgd.B(this.aG, this.ao, (rbr)this, (rbq)this);
        this.av.b();
    }
    
    public final void no() {
        super.no();
        this.ah = this.at.c().aB((asix)new heb(this));
    }
    
    public final void np() {
        super.np();
        final asic ah = this.ah;
        if (ah != null) {
            asjg.b((AtomicReference)ah);
            this.ah = null;
        }
    }
    
    public final void nv(final long n) {
        final ShortsVideoTrimView2 ao = this.ao;
        if (ao != null) {
            ao.H(n);
        }
    }
    
    public final wyb o() {
        return wya.b(130169);
    }
    
    public final void onClick(final View view) {
        if (view == this.aO) {
            final aqyq aj = this.aj;
            if (aj != null) {
                final aqyq ai = this.ai;
                if (!hgd.n(aj, ai)) {
                    if (!hgd.m(aj, ai)) {
                        this.r(null);
                        return;
                    }
                }
            }
            final maw ag = this.aG;
            if (ag != null) {
                final EditableVideo d = ((urf)ag.b).d;
                if (d != null && this.aK != null) {
                    final avt aj2 = this.aJ;
                    final alft bh = auip.bh(d);
                    if (aj2 != null) {
                        final agza builder = ((agzi)alff.a).createBuilder();
                        final agza builder2 = ((agzi)algf.a).createBuilder();
                        builder2.copyOnWrite();
                        final algf algf = (algf)builder2.instance;
                        bh.getClass();
                        algf.d = bh;
                        algf.b |= 0x4;
                        final algf d2 = (algf)builder2.build();
                        builder.copyOnWrite();
                        final alff alff = (alff)builder.instance;
                        d2.getClass();
                        alff.D = d2;
                        alff.c |= 0x40000;
                        final alff b = (alff)builder.build();
                        final tuw s = aj2.S(wya.c(130253));
                        s.b = (agzi)b;
                        s.d();
                    }
                }
            }
            hgd.y(this.aG, this.aC);
            final aqyq aj3 = this.aj;
            if (aj3 != null && this.av != null) {
                final aqyw e = this.e;
                if (e != null) {
                    apip apip;
                    if ((apip = e.k) == null) {
                        apip = apip.a;
                    }
                    final aqyq ai2 = this.ai;
                    final agza builder3 = ((agzi)apit.a).createBuilder();
                    boolean d3 = false;
                    boolean b2 = false;
                    Label_0327: {
                        if (apip != null) {
                            apit apit;
                            if ((apit = apip.c) == null) {
                                apit = apit.a;
                            }
                            if (apit.c) {
                                b2 = true;
                                break Label_0327;
                            }
                        }
                        b2 = false;
                    }
                    boolean b3 = false;
                    Label_0362: {
                        if (apip != null) {
                            apit apit2;
                            if ((apit2 = apip.c) == null) {
                                apit2 = apit.a;
                            }
                            if (apit2.d) {
                                b3 = true;
                                break Label_0362;
                            }
                        }
                        b3 = false;
                    }
                    final boolean c = b2 || hgd.n(aj3, ai2);
                    if (b3 || hgd.m(aj3, ai2)) {
                        d3 = true;
                    }
                    builder3.copyOnWrite();
                    final apit apit3 = (apit)builder3.instance;
                    apit3.b |= 0x1;
                    apit3.c = c;
                    builder3.copyOnWrite();
                    final apit apit4 = (apit)builder3.instance;
                    apit4.b |= 0x2;
                    apit4.d = d3;
                    final agza builder4 = ((agzi)apip.a).createBuilder();
                    final apit c2 = (apit)builder3.build();
                    builder4.copyOnWrite();
                    final apip apip2 = (apip)builder4.instance;
                    c2.getClass();
                    apip2.c = c2;
                    apip2.b |= 0x1;
                    final apip j = (apip)builder4.build();
                    final aqyy ak = this.ak;
                    if (ak != null) {
                        final aqyq ai3 = this.ai;
                        if (ai3 != null) {
                            final int n = ai3.d - ai3.c;
                            aqyv aqyv;
                            if ((aqyv = ak.d) == null) {
                                aqyv = aqyv.a;
                            }
                            final int c3 = aqyv.c;
                            final int c4 = ai3.c;
                            aqyv aqyv2;
                            if ((aqyv2 = ak.f) == null) {
                                aqyv2 = aqyv.a;
                            }
                            final int c5 = aqyv2.c;
                            final agza builder5 = ((agzi)ak).toBuilder();
                            final agza builder6 = ((agzi)aqyv.a).createBuilder();
                            builder6.copyOnWrite();
                            final aqyv aqyv3 = (aqyv)builder6.instance;
                            aqyv3.b |= 0x1;
                            aqyv3.c = c3 + c4;
                            builder6.copyOnWrite();
                            final aqyv aqyv4 = (aqyv)builder6.instance;
                            aqyv4.b |= 0x2;
                            aqyv4.d = n;
                            final aqyv d4 = (aqyv)builder6.build();
                            builder5.copyOnWrite();
                            final aqyy aqyy = (aqyy)builder5.instance;
                            d4.getClass();
                            aqyy.d = d4;
                            aqyy.b |= 0x2;
                            final agza builder7 = ((agzi)aqyv.a).createBuilder();
                            builder7.copyOnWrite();
                            final aqyv aqyv5 = (aqyv)builder7.instance;
                            aqyv5.b |= 0x1;
                            aqyv5.c = c5 + c4;
                            builder7.copyOnWrite();
                            final aqyv aqyv6 = (aqyv)builder7.instance;
                            aqyv6.b |= 0x2;
                            aqyv6.d = n;
                            final aqyv f = (aqyv)builder7.build();
                            builder5.copyOnWrite();
                            final aqyy aqyy2 = (aqyy)builder5.instance;
                            f.getClass();
                            aqyy2.f = f;
                            aqyy2.b |= 0x8;
                            this.ak = (aqyy)builder5.build();
                        }
                    }
                    final hfd av = this.av;
                    final aqyq ai4 = this.ai;
                    final apit al = this.al;
                    final int d5 = this.d;
                    final TranscodeOptions g = this.aD.g();
                    final aqyy ak2 = this.ak;
                    final hfc hfc = (hfc)av;
                    hfc.j = j;
                    hfc.n = ak2;
                    hfc.h(ai4, al, d5, 6, g);
                }
            }
        }
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        if (m != null) {
            final byte[] byteArray = m.getByteArray("SHORTS_CLIP_TRIM_COMMAND_KEY");
            if (byteArray != null) {
                try {
                    this.aN = (aioe)agzi.parseFrom((agzi)aioe.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab) {
                    trn.d("Error parsing navigation endpoint.", (Throwable)ahab);
                }
            }
        }
    }
    
    protected final aioe p() {
        return this.aN;
    }
    
    public final void pK(final Bundle bundle) {
        bundle.putInt("max_hardware_decoders", this.a);
        bundle.putInt("min_video_duration_ms", this.b);
        bundle.putInt("remaining_project_space_ms", this.c);
        bundle.putInt("selected_video_index", this.d);
        final maw ag = this.aG;
        if (ag != null) {
            bundle.putLong("playback_position", ag.n());
        }
        final aqyy ak = this.ak;
        if (ak != null) {
            aeda.av(bundle, "pending_visual_remix_source_data", (MessageLite)ak);
        }
        hgd.k(this.ai, "pending_clip_edit_metadata", bundle);
        hgd.k(this.aj, "original_Clip_edit_metadata", bundle);
    }
    
    public final void r(final apmt apmt) {
        if (apmt != null) {
            this.s(apmt);
        }
        final cl d = hgd.d((br)this);
        if (d != null && d.a() > 0) {
            d.aa();
            return;
        }
        final bu od = ((br)this).od();
        if (od != null) {
            ((Activity)od).onBackPressed();
        }
    }
    
    final void s(final apmt apmt) {
        if (this.aJ == null) {
            return;
        }
        final algd a = algd.a;
        final maw ag = this.aG;
        Object o = a;
        if (ag != null) {
            final EditableVideo d = ((urf)ag.b).d;
            o = a;
            if (d != null) {
                final VideoMetaData b = d.b;
                final agza builder = ((agzi)algd.a).createBuilder((agzi)a);
                final long millis = afqo.c(b.h).toMillis();
                builder.copyOnWrite();
                final algd algd = (algd)builder.instance;
                algd.b |= 0x1;
                algd.c = millis;
                final int k = b.k();
                builder.copyOnWrite();
                final algd algd2 = (algd)builder.instance;
                algd2.b |= 0x2;
                algd2.d = k;
                final int j = b.j();
                builder.copyOnWrite();
                final algd algd3 = (algd)builder.instance;
                algd3.b |= 0x4;
                algd3.e = j;
                final algd algd4 = (algd)(o = builder.build());
                if (this.aK != null) {
                    final alft bh = auip.bh(d);
                    final agza builder2 = ((agzi)algd.a).createBuilder((agzi)algd4);
                    builder2.copyOnWrite();
                    final algd algd5 = (algd)builder2.instance;
                    bh.getClass();
                    algd5.g = bh;
                    algd5.b |= 0x10;
                    o = builder2.build();
                }
            }
        }
        final agza builder3 = ((agzi)algc.a).createBuilder();
        final ShortsVideoTrimView2 ao = this.ao;
        if (ao != null && ao.n) {
            builder3.copyOnWrite();
            final algc algc = (algc)builder3.instance;
            algc.b |= 0x1;
            algc.c = true;
        }
        else {
            long h;
            if (ao != null) {
                h = ao.h();
            }
            else {
                h = 0L;
            }
            final long millis2 = afqo.c(h).toMillis();
            builder3.copyOnWrite();
            final algc algc2 = (algc)builder3.instance;
            algc2.b |= 0x200;
            algc2.e = millis2;
        }
        builder3.copyOnWrite();
        final algc algc3 = (algc)builder3.instance;
        algc3.b |= 0x4;
        algc3.d = true;
        final agza builder4 = ((agzi)algd.a).createBuilder((agzi)o);
        final algc f = (algc)builder3.build();
        builder4.copyOnWrite();
        final algd algd6 = (algd)builder4.instance;
        f.getClass();
        algd6.f = f;
        algd6.b |= 0x8;
        final algd i = (algd)builder4.build();
        final agza builder5 = ((agzi)alff.a).createBuilder();
        final agza builder6 = ((agzi)algf.a).createBuilder();
        builder6.copyOnWrite();
        final algf algf = (algf)builder6.instance;
        i.getClass();
        algf.k = i;
        algf.b |= 0x2000;
        builder6.copyOnWrite();
        final algf algf2 = (algf)builder6.instance;
        algf2.l = 3;
        algf2.b |= 0x4000;
        builder6.copyOnWrite();
        final algf algf3 = (algf)builder6.instance;
        algf3.m = apmt.getNumber();
        algf3.b |= 0x8000;
        final algf d2 = (algf)builder6.build();
        builder5.copyOnWrite();
        final alff alff = (alff)builder5.instance;
        d2.getClass();
        alff.D = d2;
        alff.c |= 0x40000;
        final alff b2 = (alff)builder5.build();
        final int ordinal = apmt.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    final tuw s = this.aJ.S(wya.b(130169));
                    s.b = (agzi)b2;
                    s.f();
                    return;
                }
                if (ordinal != 5) {
                    return;
                }
            }
            final tuw s2 = this.aJ.S(wya.c(130253));
            s2.b = (agzi)b2;
            s2.d();
            return;
        }
        final tuw s3 = this.aJ.S(wya.b(130169));
        s3.b = (agzi)b2;
        s3.h();
    }
}
