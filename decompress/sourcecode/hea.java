import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.atomic.AtomicReference;
import android.app.Activity;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.youtube.creation.trim.crop.CroppedVideoWithPreviewView;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.apps.tiktok.account.AccountId;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hea extends heu implements View$OnClickListener
{
    public aioe a;
    public AccountId aA;
    public final tzv aB;
    public gxa aC;
    public lhz aD;
    public aagm aE;
    public maw aF;
    public fzo aG;
    public fzo aH;
    public avt aI;
    final qpt aJ;
    qpt aK;
    public qpt aL;
    private YouTubeButton aM;
    private TextView aN;
    boolean ae;
    public boolean af;
    public final Object ag;
    public TrimVideoControllerView ah;
    public ShortsVideoTrimView2 ai;
    public RecyclerView aj;
    asic ak;
    public tzw al;
    MultiSegmentCameraProgressIndicator am;
    public rbr an;
    public rbq ao;
    public cl ap;
    public Track aq;
    public heo ar;
    public het as;
    public ucr at;
    public tzs au;
    public gxs av;
    public wwv aw;
    public tzz ax;
    public tzg ay;
    public Executor az;
    int b;
    public int c;
    public int d;
    long e;
    
    public hea() {
        this.a = aioe.a;
        this.b = 2;
        this.e = -1L;
        this.ag = new Object();
        this.aJ = new qpt(this);
        this.aB = (tzv)new hdx(this, 0);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final View inflate = layoutInflater.inflate(2131625386, viewGroup, false);
        (this.am = (MultiSegmentCameraProgressIndicator)inflate.findViewById(2131430658)).c(this.ax.c);
        final ucr at = this.at;
        at.a = (uco)new hee(this, 1);
        at.c(inflate);
        this.ah = (TrimVideoControllerView)inflate.findViewById(2131432198);
        final ImageView f = (ImageView)inflate.findViewById(2131430409);
        final TrimVideoControllerView ah = this.ah;
        if (ah != null) {
            ah.f = f;
        }
        this.ar.f(inflate);
        final ShortsVideoTrimView2 b = this.ar.b;
        if ((this.ai = b) != null) {
            b.F(new qxc(((br)this).nT(), inflate));
            final ShortsVideoTrimView2 ai = this.ai;
            ai.d = (int)(((br)this).nZ().getDimension(2131170309) * ai.c);
        }
        final View a = this.ar.a;
        if (a != null) {
            a.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, ((br)this).nZ().getDimensionPixelSize(2131169677)));
        }
        this.aj = (RecyclerView)inflate.findViewById(2131432027);
        (this.aM = (YouTubeButton)inflate.findViewById(2131428219)).setText((CharSequence)((br)this).nZ().getString(2132017715));
        this.aM.setContentDescription((CharSequence)((br)this).nZ().getString(2132019698));
        this.aM.setOnClickListener((View$OnClickListener)this);
        (this.aN = (TextView)inflate.findViewById(2131428220)).setText((CharSequence)((br)this).nT().getResources().getString(2132017716));
        return inflate;
    }
    
    public final void Y() {
        super.Y();
        final maw af = this.aF;
        if (af != null) {
            final Object b = af.b;
            final lhz ad = this.aD;
            if (ad != null) {
                ad.f((urf)b);
            }
        }
        final maw af2 = this.aF;
        if (af2 != null) {
            af2.o();
        }
        final cl ap = this.ap;
        if (ap != null) {
            final qpt aj = this.aJ;
            final ArrayList i = ap.i;
            if (i != null) {
                i.remove(aj);
            }
        }
    }
    
    final CroppedVideoWithPreviewView a() {
        return (CroppedVideoWithPreviewView)this.at.b;
    }
    
    public final void aa() {
        super.aa();
        final maw af = this.aF;
        if (af != null) {
            af.p();
        }
        final cl d = hgd.d((br)this);
        if ((this.ap = d) != null) {
            final qpt aj = this.aJ;
            if (d.i == null) {
                d.i = new ArrayList();
            }
            d.i.add(aj);
        }
        this.aJ.C();
    }
    
    public final void ab(final View view, final Bundle bundle) {
        if (bundle != null) {
            this.c = bundle.getInt("min_video_duration_ms");
            this.d = bundle.getInt("remaining_project_space_ms");
            this.b = bundle.getInt("max_hardware_decoders");
            this.e = bundle.getLong("playback_position", -1L);
        }
        final CroppedVideoWithPreviewView a = this.a();
        if (a != null) {
            final TrimVideoControllerView ah = this.ah;
            if (ah != null) {
                final maw t = this.aL.T((rbi)ah, (VideoWithPreviewView)a, this.e, this.b);
                this.aF = t;
                this.an = (rbr)new hdy(this, (Activity)((br)this).od());
                this.ao = (rbq)new hdz(this);
                t.c = new hed(this, 1);
            }
        }
        final avt ai = this.aI;
        if (ai != null) {
            final tuw s = ai.S(wya.c(130168));
            s.k(true);
            s.c();
            final tuw s2 = this.aI.S(wya.c(97091));
            s2.k(true);
            s2.c();
        }
    }
    
    public final void d() {
        final gxs av = this.av;
        if (av != null) {
            av.g();
        }
    }
    
    public final wwv n() {
        return this.aw;
    }
    
    public final void nm() {
        super.nm();
        hgd.B(this.aF, this.ai, this.an, this.ao);
    }
    
    public final void no() {
        super.no();
        this.aq = hgd.f(this.ay.a(), ((br)this).nT());
        this.aK = new qpt(this, (byte[])null);
        this.ak = this.au.c().J((asjd)flu.m).aB((asix)new gxt(this, 20));
    }
    
    public final void np() {
        super.np();
        final asic ak = this.ak;
        if (ak != null) {
            asjg.b((AtomicReference)ak);
            this.ak = null;
        }
        final tzw al = this.al;
        if (al != null) {
            al.L();
        }
    }
    
    protected final wyb o() {
        return wya.b(130169);
    }
    
    public final void onClick(final View view) {
        if (view == this.aM) {
            hgd.D(this.aI, 130168);
            this.d();
        }
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        if (m != null) {
            final byte[] byteArray = m.getByteArray("SHORTS_CLIP_TRIM_COMMAND_KEY");
            if (byteArray != null) {
                try {
                    this.a = (aioe)agzi.parseFrom((agzi)aioe.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab) {
                    trn.d("Error parsing navigation endpoint.", (Throwable)ahab);
                }
            }
        }
        this.ap = hgd.d((br)this);
    }
    
    protected final aioe p() {
        return this.a;
    }
    
    public final void pK(final Bundle bundle) {
        bundle.putInt("max_hardware_decoders", this.b);
        bundle.putInt("min_video_duration_ms", this.c);
        bundle.putInt("remaining_project_space_ms", this.d);
        final maw af = this.aF;
        if (af != null) {
            bundle.putLong("playback_position", af.n());
        }
    }
    
    final boolean r() {
        final maw af = this.aF;
        return af != null && af.r();
    }
}
