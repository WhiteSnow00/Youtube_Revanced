import android.app.AlertDialog$Builder;
import android.app.Activity;
import android.os.Parcelable;
import com.google.android.libraries.youtube.creation.trim.crop.CroppedVideoWithPlayerView;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.libraries.youtube.edit.camera.ProgressBarData;
import com.google.android.libraries.video.media.VideoMetaData;
import java.io.IOException;
import android.content.DialogInterface$OnClickListener;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.time.Duration;
import com.google.protos.youtube.api.innertube.ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand;
import com.google.protobuf.ExtensionRegistryLite;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import android.content.Context;
import java.util.Set;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.net.Uri;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfl extends hex implements uco, uci, hfr
{
    public static final int a;
    private static final String aS = "hfl";
    public static final int b;
    public heo aA;
    public her aB;
    public Executor aC;
    public ucs aD;
    public hfd aE;
    public hff aF;
    public hfv aG;
    public gko aH;
    public tzz aI;
    qxv aJ;
    public hyq aK;
    public aagm aL;
    public agmd aM;
    public avt aN;
    public aeby aO;
    auip aP;
    public qpt aQ;
    public qpt aR;
    public aock ae;
    public String af;
    public aocy ag;
    long ah;
    aioe ai;
    long aj;
    boolean ak;
    public long al;
    public long am;
    public Uri an;
    public Uri ao;
    public boolean ap;
    boolean aq;
    public EditableVideo ar;
    public long as;
    final Set at;
    hfn au;
    public Context av;
    aqyy aw;
    public hfp ax;
    public wwv ay;
    public ucr az;
    public ShortsVideoTrimView2 c;
    hfs d;
    public aqyx e;
    
    static {
        a = (int)TimeUnit.SECONDS.toMicros(60L);
        b = (int)TimeUnit.SECONDS.toMicros(15L);
    }
    
    public hfl() {
        this.aj = -1L;
        this.ak = true;
        this.as = 0L;
        this.at = new HashSet();
    }
    
    public static void aL(final String s) {
        trn.c(hfl.aS, s);
        zjp.b(zjo.b, zjn.l, "[ShortsCreation][Android][VideoIngestion]".concat(s));
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            this.al = bundle.getLong("min_trimmed_video_length_us_key");
            this.am = bundle.getLong("max_trimmed_video_length_us_key");
            this.ap = bundle.getBoolean("duration_toggle_enabled_key");
            this.aq = bundle.getBoolean("audio_muted_key");
            this.as = bundle.getLong("timeline_window_start_us_key");
            this.aj = bundle.getLong("playback_position", -1L);
            final byte[] byteArray = bundle.getByteArray("remix_source_key");
            if (byteArray != null) {
                try {
                    this.ae = (aock)agzi.parseFrom((agzi)aock.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab) {
                    trn.d("Error parsing remix source.", (Throwable)ahab);
                }
            }
            this.e = aqyx.b(bundle.getInt("visual_source_type_key"));
            this.af = bundle.getString("player_params_key");
            final byte[] byteArray2 = bundle.getByteArray("default_start_point_key");
            if (byteArray2 != null) {
                try {
                    this.ag = (aocy)agzi.parseFrom((agzi)aocy.a, byteArray2, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab2) {
                    trn.d("Error parsing default start point.", (Throwable)ahab2);
                }
            }
            final String string = bundle.getString("remote_video_source_uri");
            if (string != null) {
                this.an = Uri.parse(string);
            }
            else {
                trn.b("Remote video source uri not restored from bundle");
            }
            final String string2 = bundle.getString("remote_audio_source_uri");
            if (string2 != null) {
                this.ao = Uri.parse(string2);
            }
            else {
                trn.b("Remote audio source uri not restored from bundle");
            }
            final EditableVideo ar = (EditableVideo)bundle.getParcelable("editable_video_key");
            if (ar != null) {
                this.ar = ar;
            }
            else {
                trn.b("EditableVideo not restored from bundle");
            }
        }
        final View inflate = layoutInflater.inflate(2131625418, viewGroup, false);
        final ucr az = this.az;
        az.a = (uco)this;
        az.c(inflate);
        this.aA.f(inflate);
        final ShortsVideoTrimView2 b = this.aA.b;
        if ((this.c = b) != null) {
            b.I = this.aN;
            b.F(new qxc(((br)this).nT(), inflate));
            final ShortsVideoTrimView2 c = this.c;
            c.a = (uci)this;
            c.H = (ucj)new hfg(this, 0);
            this.aA.i(false);
        }
        final aioe ai = this.ai;
        ai.getClass();
        final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)((agzd)ai).rr((agyr)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand);
        final int b2 = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.b;
        final FormatStreamModel formatStreamModel = null;
        FormatStreamModel formatStreamModel2;
        if ((b2 & 0x80) != 0x0) {
            ajsj ajsj;
            if ((ajsj = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.j) == null) {
                ajsj = ajsj.b;
            }
            aock aock;
            if ((aock = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.g) == null) {
                aock = aock.a;
            }
            formatStreamModel2 = new FormatStreamModel(ajsj, aock.c, Duration.ofSeconds(shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.h).toMillis());
        }
        else {
            formatStreamModel2 = null;
        }
        FormatStreamModel formatStreamModel3 = formatStreamModel;
        if ((shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.b & 0x40) != 0x0) {
            ajsj ajsj2;
            if ((ajsj2 = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.i) == null) {
                ajsj2 = ajsj.b;
            }
            aock aock2;
            if ((aock2 = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.g) == null) {
                aock2 = aock.a;
            }
            formatStreamModel3 = new FormatStreamModel(ajsj2, aock2.d, Duration.ofSeconds(shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.h).toMillis());
        }
        final hfj hfj = new hfj(this, inflate);
        if (formatStreamModel2 != null) {
            if (formatStreamModel3 != null) {
                this.ao = formatStreamModel3.d;
            }
            this.aP(formatStreamModel2);
            this.an = formatStreamModel2.d;
            final hff af = this.aF;
            final aock ae = this.ae;
            ae.getClass();
            final String c2 = ae.c;
            final String af2 = this.af;
            af2.getClass();
            af.e = (hfe)hfj;
            tcp.k(afld.k((Callable)new exk(af, af.a(c2, af2), 19), af.b), af.b, (tcn)gnh.i, (tco)new hfi(af, 1));
        }
        else {
            final aock ae2 = this.ae;
            ae2.getClass();
            final hff af3 = this.aF;
            final String d = ae2.d;
            final String c3 = ae2.c;
            final String af4 = this.af;
            af4.getClass();
            af3.e = (hfe)hfj;
            final abkg a = af3.a(d, af4);
            final ListenableFuture k = afld.k((Callable)new exk(af3, af3.a(c3, af4), 16), af3.b);
            final ListenableFuture i = afld.k((Callable)new exk(af3, a, 17), af3.b);
            tcp.k(afld.s(new ListenableFuture[] { k, i }).P((Callable)new exk(k, i, 18), af3.b), af3.b, (tcn)gnh.h, (tco)new erz(af3, 20));
        }
        final PlayerView f = (PlayerView)inflate.findViewById(2131432347);
        final her ab = this.aB;
        ab.f = f;
        this.d = new hfs(ab, inflate, ((br)this).nT(), (hfr)this);
        this.aN.S(wya.c(110246)).h();
        return inflate;
    }
    
    public final void Y() {
        super.Y();
        this.aq = this.aB.l();
        final bu od = ((br)this).od();
        if (od != null) {
            final her ab = this.aB;
            synchronized (ab.c) {
                ab.c();
                ab.a.C(((Activity)od).isFinishing());
                ab.b = false;
            }
        }
        this.aE.g();
    }
    
    public final void aK(final String message) {
        szc.f();
        final aeby ao = this.aO;
        final Context av = this.av;
        av.getClass();
        int n;
        if (this.aH.a() == gkm.b) {
            n = 2132083650;
        }
        else {
            n = 2132083651;
        }
        final abyy ag = ao.ag(av, n);
        ((AlertDialog$Builder)ag).setMessage((CharSequence)message).setPositiveButton((CharSequence)((br)this).nZ().getString(2132019745), (DialogInterface$OnClickListener)new ceg(this, 7));
        ((AlertDialog$Builder)ag).setCancelable(false);
        ((AlertDialog$Builder)ag).show();
        this.aN.S(wya.c(153135)).h();
    }
    
    public final void aM() {
        this.ax.aT();
    }
    
    public final void aN() {
        this.aE.i(this.aL.b(), (hfb)new heg(this, 2));
        this.aS();
    }
    
    final void aO() {
        final her ab = this.aB;
        if (ab.a.f()) {
            ab.a.ak(28);
        }
    }
    
    public final void aP(final FormatStreamModel formatStreamModel) {
        if (this.ar == null) {
            final long micros = TimeUnit.MILLISECONDS.toMicros(formatStreamModel.c);
            VideoMetaData a;
            try {
                final qzq qzq = new qzq();
                qzq.a = formatStreamModel.d;
                qzq.h = micros;
                qzq.b(new long[] { 0L });
                qzq.d = formatStreamModel.i();
                qzq.e = formatStreamModel.d();
                a = qzq.a();
            }
            catch (final IOException ex) {
                aL("Error building VideoMetadata.");
                a = null;
            }
            if (a == null) {
                return;
            }
            final long a2 = afqo.a(Duration.ofMillis((long)this.s(micros)));
            final long am = this.am;
            long n;
            if (micros > am) {
                n = micros - am;
            }
            else {
                n = 0L;
            }
            final long min = Math.min(n, a2);
            this.as = min;
            final ShortsVideoTrimView2 c = this.c;
            if (c != null) {
                c.F = min;
            }
            final qxu qxu = new qxu();
            qxu.b = this.al;
            qxu.c(this.am);
            qxu.a = a;
            qxu.b();
            final EditableVideo a3 = qxu.a();
            this.ar = a3;
            final aocy ag = this.ag;
            long am2 = 0L;
            Label_0291: {
                if (ag != null && (ag.b & 0x2) != 0x0) {
                    agyo agyo;
                    if ((agyo = ag.d) == null) {
                        agyo = agyo.a;
                    }
                    final long a4 = afqo.a(aeda.am(agyo));
                    if (a4 > 0L) {
                        am2 = a4;
                        if (a4 < this.am) {
                            break Label_0291;
                        }
                    }
                    am2 = this.am;
                }
                else {
                    am2 = hfl.b;
                }
            }
            a3.F(a2, am2 + a2);
        }
        if (this.aJ == null) {
            this.aJ = (qxv)new heh(this, 2);
        }
        final EditableVideo ar = this.ar;
        if (ar != null) {
            ar.q(this.aJ);
        }
    }
    
    public final void aQ() {
        final hfn au = this.au;
        if (au != null) {
            final EditableVideo ar = this.ar;
            if (ar != null) {
                final int n = (int)afqo.c(ar.l() - this.ar.n()).toMillis();
                final uir m = au.m;
                if (m != null) {
                    if (n <= 0) {
                        final zjo a = zjo.a;
                        final zjn l = zjn.l;
                        final StringBuilder sb = new StringBuilder("[ShortsCreation][Android][Trim]Trim duration is not positive when using YouTube video: ");
                        sb.append(n);
                        zjp.b(a, l, sb.toString());
                        return;
                    }
                    m.d(n);
                    final ProgressBarData a2 = m.a();
                    final MultiSegmentCameraProgressIndicator i = au.l;
                    if (i != null) {
                        i.e(new ProgressBarData[] { a2 }, 0);
                    }
                }
            }
        }
    }
    
    public final void aS() {
        szc.f();
        this.aB.d();
        if (this.aq != this.aB.l()) {
            this.aB.k();
        }
        final hfn au = this.au;
        if (au != null) {
            au.b(this.aq);
        }
    }
    
    public final void aa() {
        super.aa();
        this.aN();
    }
    
    public final void ab(final View view, final Bundle bundle) {
        this.aE.f((urf)null);
    }
    
    public final void b(final float n) {
        final hfn au = this.au;
        if (au != null) {
            au.n.S(wya.c(121259)).i();
        }
        final CroppedVideoWithPlayerView croppedVideoWithPlayerView = (CroppedVideoWithPlayerView)this.az.b;
        if (croppedVideoWithPlayerView != null) {
            croppedVideoWithPlayerView.j(n);
        }
        final EditableVideo ar = this.ar;
        if (ar != null) {
            final auip ap = this.aP;
            if (ap != null) {
                ap.bm(ar);
                this.ar = ar;
            }
        }
    }
    
    public final wwv n() {
        return this.ay;
    }
    
    public final void nm() {
        super.nm();
        final ShortsVideoTrimView2 c = this.c;
        if (c != null) {
            c.B();
        }
        this.aE.b();
        final her ab = this.aB;
        final PlayerView f = ab.f;
        if (f != null) {
            f.m();
        }
        ab.a.t();
        final hfn au = this.au;
        if (au != null) {
            au.o = null;
        }
    }
    
    public final void nw(final long as) {
        this.as = as;
        final long millis = afqo.c(as).toMillis();
        if (as >= 0L) {
            if (millis < this.ah) {
                final hfs d = this.d;
                if (d != null) {
                    d.d(millis);
                }
            }
        }
    }
    
    public final void nx() {
        final hfn au = this.au;
        if (au != null) {
            au.n.S(wya.c(97091)).d();
        }
        final hfs d = this.d;
        if (d != null && !d.h) {
            final ShortsVideoTrimView2 c = this.c;
            if (c != null && !c.D) {
                if (d.a.m()) {
                    d.a.g();
                }
                else {
                    d.a.f(d.k);
                }
                if (d.a.m()) {
                    d.n.ac();
                }
                else {
                    d.n.ad();
                }
            }
        }
        this.az.d(this.aB.m());
    }
    
    protected final wyb o() {
        return wya.b(147595);
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        if (m != null) {
            final byte[] byteArray = m.getByteArray("VIDEO_INGESTION_COMMAND");
            if (byteArray != null) {
                try {
                    this.ai = (aioe)agzi.parseFrom((agzi)aioe.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab) {
                    trn.d("Error parsing navigation endpoint.", (Throwable)ahab);
                }
            }
        }
        this.aM.b = 4;
        hdv.a(((br)this).nT());
    }
    
    protected final aioe p() {
        return this.ai;
    }
    
    public final void pK(final Bundle bundle) {
        bundle.putLong("min_trimmed_video_length_us_key", this.al);
        bundle.putLong("max_trimmed_video_length_us_key", this.am);
        bundle.putBoolean("duration_toggle_enabled_key", this.ap);
        bundle.putBoolean("audio_muted_key", this.aq);
        bundle.putLong("playback_position", this.aB.a());
        bundle.putLong("timeline_window_start_us_key", this.as);
        final aock ae = this.ae;
        if (ae != null) {
            bundle.putByteArray("remix_source_key", ((agxl)ae).toByteArray());
        }
        final aqyx e = this.e;
        if (e != null) {
            bundle.putInt("visual_source_type_key", e.f);
        }
        final String af = this.af;
        if (af != null) {
            bundle.putString("player_params_key", af);
        }
        final aocy ag = this.ag;
        if (ag != null) {
            bundle.putByteArray("default_start_point_key", ((agxl)ag).toByteArray());
        }
        final Uri an = this.an;
        if (an != null) {
            bundle.putString("remote_video_source_uri", an.toString());
        }
        final Uri ao = this.ao;
        if (ao != null) {
            bundle.putString("remote_audio_source_uri", ao.toString());
        }
        final EditableVideo ar = this.ar;
        if (ar != null) {
            bundle.putParcelable("editable_video_key", (Parcelable)ar);
        }
    }
    
    public final int s(final long n) {
        final long aj = this.aj;
        if (aj != -1L) {
            return (int)aj;
        }
        final aocy ag = this.ag;
        if (ag == null) {
            return 0;
        }
        final long c = ag.c;
        long n2;
        if ((ag.b & 0x2) != 0x0) {
            agyo agyo;
            if ((agyo = ag.d) == null) {
                agyo = agyo.a;
            }
            n2 = afqo.a(aeda.am(agyo));
        }
        else {
            n2 = 0L;
        }
        if (n2 <= 0L || n2 >= this.am) {
            n2 = this.am;
        }
        if (n - afqo.a(Duration.ofMillis(c)) < n2) {
            return (int)afqo.c(Math.max(n - n2, 0L)).toMillis();
        }
        return (int)c;
    }
    
    protected final alff sz() {
        final alff a = alff.a;
        if (this.aD.a() == null) {
            zjp.b(zjo.a, zjn.l, "[ShortsCreation][Android][VideoIngestion]Frontend id not available for logging");
            return a;
        }
        final agza builder = ((agzi)alff.a).createBuilder();
        final agza builder2 = ((agzi)algf.a).createBuilder();
        final agza builder3 = ((agzi)algb.a).createBuilder();
        final String a2 = this.aD.a();
        a2.getClass();
        builder3.copyOnWrite();
        final algb algb = (algb)builder3.instance;
        algb.b |= 0x1;
        algb.c = a2;
        final algb g = (algb)builder3.build();
        builder2.copyOnWrite();
        final algf algf = (algf)builder2.instance;
        g.getClass();
        algf.g = g;
        algf.b |= 0x20;
        final algf d = (algf)builder2.build();
        builder.copyOnWrite();
        final alff alff = (alff)builder.instance;
        d.getClass();
        alff.D = d;
        alff.c |= 0x40000;
        return (alff)builder.build();
    }
}
