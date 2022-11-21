import android.content.DialogInterface;
import com.google.android.libraries.elements.interfaces.ByteStore;
import java.util.function.Function;
import j$.util.Collection$_EL;
import java.util.Collection;
import android.support.v7.widget.LinearLayoutManager;
import j$.util.Optional;
import android.app.Dialog;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Collections;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.facebook.litho.ComponentTree;
import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aceb extends acdv
{
    private aslm aF;
    private acvt aG;
    private dvx aH;
    private dvx aI;
    private xab aJ;
    private Object aK;
    public ojl ae;
    public atnb af;
    List ag;
    public String ah;
    public arna ai;
    public atnb aj;
    RecyclerView ak;
    public vbs al;
    public vbs am;
    public vbs an;
    hz ao;
    public aheu ap;
    
    public static void aN(final aceb aceb, final Object ak, final xab aj) {
        aceb.aJ = aj;
        aceb.aK = ak;
    }
    
    private final dvx aO(final ahbt ahbt, final Context context) {
        aslm af;
        if ((af = this.aF) == null) {
            af = new aslm();
            this.aF = af;
        }
        return aamp.Z(context, (onm)this.ai.a(), ahbt, this.aJ, this.aK, null, af, this.ap);
    }
    
    private final void aP(final acco acco, final Activity activity) {
        aQ(this.aH);
        this.aH = null;
        aQ(this.aI);
        this.aI = null;
        this.aT();
        final acvt ag = this.aG;
        if (ag != null) {
            final RecyclerView ak = this.ak;
            if (ak != null) {
                ag.b(ak);
                this.aG = null;
            }
        }
        if ((acco.b & 0x4) != 0x0) {
            this.aH = this.aO(acco.f, (Context)activity);
        }
        if ((acco.b & 0x2) != 0x0) {
            this.aI = this.aO(acco.d, (Context)activity);
        }
        this.ag = (List)acco.e;
    }
    
    private static void aQ(final dvx dvx) {
        if (dvx != null) {
            dvx.x();
            dvx.E();
            dvx.B((ComponentTree)null);
        }
    }
    
    private final void aT() {
        final aslm af = this.aF;
        if (af != null) {
            af.dispose();
        }
        this.aF = new aslm();
    }
    
    @Override
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final bu oa = ((br)this).oa();
        oa.getClass();
        final Bundle m = ((br)this).m;
        if (m != null && (m.containsKey("MODEL_BOTTOM_SHEET_FRAGMENT_KEY") || m.containsKey("ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY"))) {
            Label_0254: {
                if (m.containsKey("COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY")) {
                    try {
                        this.aP((acco)adzw.az(m, "COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", (MessageLite)acco.a, ExtensionRegistryLite.getGeneratedRegistry()), (Activity)oa);
                        break Label_0254;
                    }
                    catch (final ahds ahds) {
                        throw new IllegalStateException("Error decoding ActionSheetContent update", (Throwable)ahds);
                    }
                }
                if (m.containsKey("ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY")) {
                    try {
                        this.ag = Collections.singletonList(((aqiq)adzw.az(m, "ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)aqiq.a, ExtensionRegistryLite.getGeneratedRegistry())).toByteString());
                        break Label_0254;
                    }
                    catch (final ahds ahds2) {
                        throw new IllegalStateException("Error decoding Element", (Throwable)ahds2);
                    }
                }
                try {
                    final acco acco = (acco)adzw.az(m, "MODEL_BOTTOM_SHEET_FRAGMENT_KEY", (MessageLite)acco.a, ExtensionRegistryLite.getGeneratedRegistry());
                    this.aT();
                    final int b = acco.b;
                    if ((b & 0x1) != 0x0) {
                        this.ah = acco.c;
                    }
                    if ((b & 0x4) != 0x0) {
                        this.aH = this.aO(acco.f, (Context)oa);
                    }
                    if ((acco.b & 0x2) != 0x0) {
                        (this.aI = this.aO(acco.d, (Context)oa)).setId(View.generateViewId());
                    }
                    this.ag = (List)acco.e;
                    final ojl ae = this.ae;
                    if (ae instanceof acdc && bundle != null) {
                        final acdc acdc = (acdc)ae;
                        final WeakReference b2 = acdc.b;
                        if (b2 != null) {
                            b2.clear();
                        }
                        acdc.b = new WeakReference((T)this);
                    }
                    return super.K(layoutInflater, viewGroup, bundle);
                }
                catch (final ahds ahds3) {
                    throw new IllegalStateException("Error decoding ActionSheetContent model", (Throwable)ahds3);
                }
            }
        }
        throw new IllegalStateException("No valid arguments provided.");
    }
    
    final void aM(final acco acco) {
        adzw.aE(((br)this).m, "COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", (MessageLite)acco);
        final bu oa = ((br)this).oa();
        if (oa != null) {
            if (!((Activity)oa).isFinishing()) {
                final ViewGroup az = super.az;
                if (az != null) {
                    az.removeAllViews();
                }
                final FrameLayout ax = super.ax;
                if (ax != null) {
                    final RelativeLayout ad = super.aD;
                    if (ad != null) {
                        ax.removeView((View)ad);
                    }
                }
                super.au = null;
                super.aw = null;
                final Dialog ay = super.ay;
                if (!super.aA && super.av != null && ay != null) {
                    final FrameLayout frameLayout = (FrameLayout)ay.findViewById(2131428419);
                    final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)ay.findViewById(2131428487);
                    if (frameLayout != null) {
                        frameLayout.removeView((View)super.av.getParent());
                    }
                    if (coordinatorLayout != null) {
                        tqf.aF((View)coordinatorLayout, tqf.aq(0), (Class)ViewGroup$MarginLayoutParams.class);
                    }
                }
                super.av = null;
                super.ax = null;
                super.aD = null;
                this.aP(acco, (Activity)oa);
                super.aw = (View)this.aW().orElse((Object)null);
                final View aw = super.aw;
                if (aw != null) {
                    aw.setId(View.generateViewId());
                }
                super.av = (View)this.aV().orElse((Object)null);
                super.au = (View)this.aU().orElse((Object)null);
                final ViewGroup az2 = super.az;
                if (az2 != null) {
                    Object o;
                    if (super.aA) {
                        o = super.aX((Context)oa);
                    }
                    else {
                        o = super.aY((Context)oa);
                    }
                    az2.addView((View)o);
                }
                super.bb((Activity)oa);
            }
        }
    }
    
    @Override
    protected final int aS() {
        return 48;
    }
    
    @Override
    protected final Optional aU() {
        final bu oa = ((br)this).oa();
        if (oa == null || this.ag.isEmpty()) {
            return Optional.empty();
        }
        final boolean f = this.al.f(45379806L);
        Object u = null;
        if (f && this.ag.size() == 1) {
            final ahbt ahbt = this.ag.get(0);
            final ovb a = ovc.a(((onm)this.ai.a()).a);
            a.d(false);
            final xab aj = this.aJ;
            if (aj != null) {
                u = this.ap.U(aj, (ajon)null);
            }
            a.d = (ovh)u;
            a.g = afgh.r(aamr.A(this.aK));
            final oij oij = new oij((Context)oa, a.a());
            oij.a(ahbt.I());
            return Optional.of((Object)oij);
        }
        if (this.aB) {
            this.ak = new acea((Context)oa);
        }
        else {
            this.ak = (RecyclerView)LayoutInflater.from((Context)oa).inflate(2131624102, (ViewGroup)null, false);
        }
        final RecyclerView ak = this.ak;
        if (ak == null) {
            return Optional.of((Object)null);
        }
        ak.az();
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.an();
        ak.af((nx)linearLayoutManager);
        final onm onm = (onm)this.ai.a();
        Label_0460: {
            if (this.am.f(45382015L)) {
                final xab aj2 = this.aJ;
                if (aj2 != null) {
                    final ovb a2 = ovc.a(onm.a);
                    a2.d(false);
                    a2.b(this.am.f(45382265L));
                    final acvo acvo = new acvo(onm, a2.a(), this.an, aj2, ouy.a, this.aj);
                    final acmm acmm = new acmm((acmh)new acmo());
                    final acmr acmr = new acmr();
                    acmr.addAll((Collection)Collection$_EL.stream((Collection)this.ag).map((Function)acdy.a).collect(afdz.a));
                    acmm.h((acla)acmr);
                    final acvt b = acvo.b(ak, acmm);
                    b.a(ak);
                    this.aG = b;
                    break Label_0460;
                }
            }
            ak.ac((nr)new acdd(onm, this.ag, this.ap, this.aJ, this.aK, (ajon)null, this.an, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
        ak.setClipToPadding(false);
        if (this.aB) {
            ak.setVerticalFadingEdgeEnabled(true);
            ak.setFadingEdgeLength(48);
        }
        if (this.al.cC() && this.aW().isPresent()) {
            final ByteStore byteStore = (ByteStore)this.af.a();
            final ahcr builder = ((ahcz)aqkt.a).createBuilder();
            builder.copyOnWrite();
            final aqkt aqkt = (aqkt)builder.instance;
            aqkt.b |= 0x1;
            aqkt.c = true;
            byteStore.set("bottom_sheet_scroll_position_key", ((ahbc)builder.build()).toByteArray());
            ak.aE(this.ao = (hz)new acdz(this));
        }
        return Optional.of((Object)ak);
    }
    
    public final Optional aV() {
        return Optional.ofNullable((Object)this.aH);
    }
    
    public final Optional aW() {
        return Optional.ofNullable((Object)this.aI);
    }
    
    @Override
    public final void nj() {
        final ojl ae = this.ae;
        if (ae instanceof acdc && this.aJ != null) {
            final acdc acdc = (acdc)ae;
            if (!acdc.e.f(45360353L)) {
                final xab d = acdc.d;
                if (d != null) {
                    d.s();
                }
            }
            acdc.d = null;
        }
        super.nj();
        aQ(this.aI);
        aQ(this.aH);
        final aslm af = this.aF;
        if (af != null) {
            af.dispose();
            this.aF = null;
        }
        final acvt ag = this.aG;
        if (ag != null) {
            final RecyclerView ak = this.ak;
            if (ak != null) {
                ag.b(ak);
                this.aG = null;
            }
        }
        if (this.al.cC() && this.aW().isPresent()) {
            ((ByteStore)this.af.a()).set("bottom_sheet_scroll_position_key", (byte[])null);
        }
        final RecyclerView ak2 = this.ak;
        if (ak2 != null) {
            ak2.ac((nr)null);
        }
        this.ak = null;
        this.ao = null;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        final ojl ae = this.ae;
        if (ae instanceof acdc) {
            final acdc acdc = (acdc)ae;
            final String h = acdc.h();
            if (h != null) {
                acdc.f.e(new wzh(3, 31), ajvy.E, h);
            }
        }
    }
}
