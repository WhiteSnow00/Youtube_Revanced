import java.util.List;
import android.content.Context;
import android.widget.LinearLayout;
import android.net.Uri;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff$Mode;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.Executor;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezd extends eze implements riv, tgg
{
    public aezp a;
    private View aA;
    private ImageView aB;
    private TextView aC;
    private TextView aD;
    private ImageView aE;
    private TextView aF;
    private TextView aG;
    private ImageView aH;
    private TextView aI;
    private TextView aJ;
    private ImageView aK;
    private ImageView aL;
    private ImageView aM;
    private View aN;
    private View aO;
    private View aP;
    private View aQ;
    private View aR;
    private boolean aS;
    private boolean aT;
    private final pvh aU;
    private final pvh aV;
    private final pvh aW;
    public tgd ae;
    public tqd af;
    public vol ag;
    public acgs ah;
    public riw ai;
    public eyi aj;
    public eyq ak;
    public eye al;
    public vcy am;
    public Executor an;
    public LoadingFrameLayout ao;
    public RelativeLayout ap;
    public View aq;
    public int ar;
    public aekp as;
    public wyw b;
    public acbm c;
    public accf d;
    public zmf e;
    
    public ezd() {
        this.a = (aezp)aeyo.a;
        this.aW = new pvh(this);
        this.aV = new pvh(this);
        this.aU = new pvh(this);
    }
    
    public static final void aM(final ImageView imageView, final int n) {
        if (n != 1) {
            imageView.setImageDrawable((Drawable)null);
            imageView.setBackgroundResource(2131231491);
            return;
        }
        imageView.setBackground((Drawable)null);
        imageView.setImageResource(2131232282);
    }
    
    private static aezp aP(final aezp aezp, final aezs aezs) {
        aezs.getClass();
        if (aezp.b((aezf)new bwk(aezs, 4)).e((Object)false)) {
            return aezp;
        }
        return (aezp)aeyo.a;
    }
    
    private static aezp br(final aezp aezp) {
        return aP(aezp, (aezs)bbu.i).b((aezf)bwo.j);
    }
    
    private static aezp bs(final aezp aezp) {
        return aP(aezp, (aezs)bbu.h).b((aezf)bwo.i);
    }
    
    private static aezp bt(final aezp aezp) {
        return aP(aezp, (aezs)bbu.e).b((aezf)bwo.e);
    }
    
    private final void bu(final aezp aezp, final ImageView imageView, final View view, final int n, final int n2) {
        final aezp b = aP(aezp, (aezs)bbu.f).b((aezf)bwo.f);
        if (b.h()) {
            view.setVisibility(0);
            view.setOnClickListener((View$OnClickListener)new eza(this, n2, n, b));
            this.b.l((wzz)new wyt(xaa.c(n2)));
        }
        else {
            view.setVisibility(4);
        }
        final aezp b2 = aP(aezp, (aezs)bbu.g).b((aezf)bwo.g);
        if (b2.h()) {
            this.bv(n);
            final acgs ah = this.ah;
            final aotp aotp = (aotp)b2.c();
            final acgn a = acgo.a();
            a.c = (acgq)new ezb(this, n);
            ah.j(imageView, aotp, a.a());
            return;
        }
        this.o(n);
        aM(imageView, n);
    }
    
    private final void bv(final int n) {
        View view;
        View view2;
        ImageView imageView;
        boolean b;
        if (n == 1) {
            view = this.aN;
            view2 = this.aP;
            imageView = this.aL;
            b = this.aS;
        }
        else {
            view = this.aO;
            view2 = this.aQ;
            imageView = this.aM;
            b = this.aT;
        }
        view.setVisibility(4);
        view2.setVisibility(0);
        if (b) {
            imageView.setColorFilter(-1291845632, PorterDuff$Mode.DARKEN);
            return;
        }
        imageView.setColorFilter((ColorFilter)null);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final LoadingFrameLayout ao = (LoadingFrameLayout)layoutInflater.inflate(2131624165, viewGroup, false);
        this.ao = ao;
        this.ap = (RelativeLayout)ao.findViewById(2131428813);
        this.aq = this.ao.findViewById(2131428138);
        this.aA = this.ao.findViewById(2131427543);
        this.aB = (ImageView)this.ao.findViewById(2131427544);
        this.aC = (TextView)this.ao.findViewById(2131428632);
        this.aD = (TextView)this.ao.findViewById(2131428631);
        this.aE = (ImageView)this.ao.findViewById(2131428627);
        this.aF = (TextView)this.ao.findViewById(2131430015);
        this.aG = (TextView)this.ao.findViewById(2131430014);
        this.aH = (ImageView)this.ao.findViewById(2131430011);
        this.aI = (TextView)this.ao.findViewById(2131429178);
        this.aJ = (TextView)this.ao.findViewById(2131429177);
        this.aK = (ImageView)this.ao.findViewById(2131429175);
        this.aL = (ImageView)this.ao.findViewById(2131430648);
        this.aN = this.ao.findViewById(2131430649);
        this.aP = this.ao.findViewById(2131430650);
        this.aM = (ImageView)this.ao.findViewById(2131428097);
        this.aO = this.ao.findViewById(2131428095);
        this.aQ = this.ao.findViewById(2131428098);
        this.aR = this.ao.findViewById(2131431383);
        this.ao.f((acxp)new hxc(this, 1));
        if (this.a.h()) {
            this.r();
            this.ao.a();
        }
        else {
            this.ao.c();
            this.d();
        }
        return (View)this.ao;
    }
    
    public final void Y() {
        super.Y();
        tpe.p(((br)this).O.findFocus());
    }
    
    public final void aK(final aiiv aiiv) {
        this.aI.setText((CharSequence)aiiv.c);
        final TextView aj = this.aJ;
        ajut ajut;
        if ((aiiv.b & 0x4) != 0x0) {
            if ((ajut = aiiv.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        aj.setText((CharSequence)acak.b(ajut));
        this.aK.setOnClickListener((View$OnClickListener)new exq(this, aiiv, 5));
    }
    
    public final void aL(final aiiv aiiv) {
        this.aF.setText((CharSequence)aiiv.c);
        final TextView ag = this.aG;
        ajut ajut;
        if ((aiiv.b & 0x4) != 0x0) {
            if ((ajut = aiiv.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        ag.setText((CharSequence)acak.b(ajut));
        aiqj aiqj;
        if ((aiqj = aiiv.e) == null) {
            aiqj = aiqj.a;
        }
        aijc aijc;
        if ((aijc = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint)((ahbc)aiqj).rx((ahaq)ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c) == null) {
            aijc = aijc.a;
        }
        if (aijc.b == 105915641) {
            this.aH.setVisibility(0);
            this.aH.setOnClickListener((View$OnClickListener)new exq(this, aiiv, 4));
            return;
        }
        this.aH.setVisibility(8);
    }
    
    public final void aa() {
        super.aa();
        if (!this.e.t()) {
            this.ax.c(false);
        }
    }
    
    public final void d() {
        final vol ag = this.ag;
        final voj voj = new voj(ag.c, ag.d, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final vol ag2 = this.ag;
        final Executor an = this.an;
        if (ag2.g == null) {
            ag2.g = new vok(ag2.e, ag2.b);
        }
        teu.n((aun)this, ((vmo)ag2.g).g((vls)voj, an), (ttg)new exv(this, 5), (ttg)new exv(this, 6));
    }
    
    public final gae mG() {
        if (this.au == null) {
            final affr i = afft.i();
            final afke k = ((ggq)this).aw.a.c.k();
            while (k.hasNext()) {
                final fzi fzi = k.next();
                if (fzi.j() != 2131429840) {
                    i.h(fzi);
                }
            }
            final gad b = this.aw.b();
            b.n((aezf)new etz(this, i, 3));
            this.au = b.a();
        }
        return this.au;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zmu zmu = (zmu)o;
            this.ax.c(false);
            array = null;
        }
        else {
            array = new Class[] { zmu.class };
        }
        return array;
    }
    
    public final void no() {
        super.no();
        if (!this.e.t()) {
            this.ax.c(false);
            return;
        }
        this.ae.g((Object)this);
        this.ai.j((riv)this);
        this.aj.b(this.aW);
        this.ak.b(this.aV);
        this.al.b(this.aU);
        qcg.A((riv)this, this.ai.a());
    }
    
    public final void np() {
        super.np();
        this.ae.m((Object)this);
        this.ai.k((riv)this);
        this.aj.c(this.aW);
    }
    
    public final void o(final int n) {
        View view;
        View view2;
        ImageView imageView;
        boolean b;
        if (n == 1) {
            view = this.aN;
            view2 = this.aP;
            imageView = this.aL;
            b = this.aS;
        }
        else {
            view = this.aO;
            view2 = this.aQ;
            imageView = this.aM;
            b = this.aT;
        }
        view2.setVisibility(4);
        if (this.ai.a() == 1) {
            view.setVisibility(4);
            return;
        }
        if (b) {
            imageView.setColorFilter(1291845632, PorterDuff$Mode.DARKEN);
            view.setVisibility(0);
            return;
        }
        imageView.setColorFilter((ColorFilter)null);
        view.setVisibility(4);
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.ar = 0;
        if (bundle == null) {
            return;
        }
        this.ar = bundle.getInt("arg_image_type_update", 0);
        this.aS = bundle.getBoolean("arg_has_profile_picture_endpoint");
        this.aT = bundle.getBoolean("arg_has_channel_banner_endpoint");
        if (!bundle.containsKey("arg_channel_profile_editor_renderer")) {
            return;
        }
        try {
            this.a = aezp.k((Object)ahbh.parseFrom((ahbh)aiis.a, bundle.getByteArray("arg_channel_profile_editor_renderer"), ExtensionRegistryLite.getGeneratedRegistry()));
        }
        catch (final ahca ahca) {}
    }
    
    public final void p(final int n) {
        qcg.A((riv)this, n);
    }
    
    public final void pP(final Bundle bundle) {
        if (this.a.h()) {
            bundle.putByteArray("arg_channel_profile_editor_renderer", ((agzk)this.a.c()).toByteArray());
        }
        bundle.putInt("arg_image_type_update", this.ar);
        bundle.putBoolean("arg_has_profile_picture_endpoint", this.aS);
        bundle.putBoolean("arg_has_channel_banner_endpoint", this.aT);
    }
    
    public final void q(final int n, final String s, final Uri uri) {
        if (n == 1) {
            this.aN.setVisibility(4);
            this.aP.setVisibility(4);
            this.aO.setVisibility(4);
            this.aQ.setVisibility(4);
            this.bv(this.ar);
            return;
        }
        if (n == 2) {
            this.d();
            return;
        }
        this.o(1);
        this.o(2);
    }
    
    public final void r() {
        this.b.b(xaa.b(144402), (aiqj)null, (alhi)null);
        final aezp b = aP(this.a, (aezs)bbu.j).b((aezf)bwo.k);
        final aezp b2 = aP(this.a, (aezs)bbu.k).b((aezf)bwo.l);
        if (!b.h() && !b2.h()) {
            this.ao.findViewById(2131428122).setVisibility(8);
        }
        else {
            this.aS = (boolean)b.b((aezf)bwo.h).e((Object)false);
            this.bu(b, this.aL, this.aN, 1, 143939);
            this.aT = ((((aiit)b2.e((Object)aiit.a)).b & 0x2) != 0x0);
            this.bu(b2, this.aM, this.aO, 2, 143940);
        }
        if (bt(this.a).h()) {
            this.aF.setVisibility(0);
            this.aG.setVisibility(0);
            this.aH.setVisibility(0);
            this.aL((aiiv)bt(this.a).c());
            this.b.l((wzz)new wyt(xaa.c(145224)));
        }
        else {
            this.aF.setVisibility(8);
            this.aG.setVisibility(8);
            this.aH.setVisibility(8);
        }
        if (bs(this.a).h()) {
            this.aI.setVisibility(0);
            this.aJ.setVisibility(0);
            this.aK.setVisibility(0);
            this.aK((aiiv)bs(this.a).c());
        }
        else {
            this.aI.setVisibility(8);
            this.aJ.setVisibility(8);
            this.aK.setVisibility(8);
        }
        if (br(this.a).h()) {
            this.s((aiiv)br(this.a).c());
            this.b.l((wzz)new wyt(xaa.c(145223)));
        }
        else {
            this.aC.setVisibility(8);
            this.aD.setVisibility(8);
            this.aE.setVisibility(8);
            this.aA.setVisibility(8);
        }
        if (!bt(this.a).h() && !bs(this.a).h() && !br(this.a).h()) {
            this.aR.setVisibility(8);
        }
        else {
            this.aR.setVisibility(0);
        }
        ((TextView)this.ao.findViewById(2131430617)).setText((CharSequence)acak.b((ajut)aP(this.a, (aezs)bbu.m).b((aezf)bwo.n).f()));
        final LinearLayout linearLayout = (LinearLayout)this.ao.findViewById(2131430616);
        linearLayout.removeAllViews();
        final ezc ezc = new ezc((Context)this.at, this.am, (List)((aiis)this.a.e((Object)aiis.a)).i, this.as, (byte[])null, (byte[])null, (byte[])null);
        for (int count = ezc.getCount(), i = 0; i < count; ++i) {
            linearLayout.addView(ezc.getView(i, (View)null, (ViewGroup)linearLayout));
        }
        tpe.t((TextView)this.ao.findViewById(2131428695), (CharSequence)vde.a((ajut)aP(this.a, (aezs)bbu.l).b((aezf)bwo.m).f(), this.am, false));
        final RelativeLayout ap = this.ap;
        ap.getClass();
        ap.setVisibility(8);
        final View aq = this.aq;
        aq.getClass();
        aq.setVisibility(0);
    }
    
    public final void s(final aiiv aiiv) {
        aiqj aiqj;
        if ((aiqj = aiiv.e) == null) {
            aiqj = aiqj.a;
        }
        aijc aijc;
        if ((aijc = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint)((ahbc)aiqj).rx((ahaq)ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c) == null) {
            aijc = aijc.a;
        }
        final int b = aijc.b;
        final int b2 = aiiv.b;
        final int n = 0;
        int visibility = 0;
        if ((b2 & 0x4) != 0x0) {
            this.aA.setVisibility(8);
            this.aC.setText((CharSequence)aiiv.c);
            this.aC.setVisibility(0);
            final TextView ad = this.aD;
            ajut ajut;
            if ((ajut = aiiv.d) == null) {
                ajut = ajut.a;
            }
            ad.setText((CharSequence)acak.b(ajut));
            this.aD.setVisibility(0);
            final ImageView ae = this.aE;
            if (b != 105915776) {
                visibility = 8;
            }
            ae.setVisibility(visibility);
            this.aE.setOnClickListener((View$OnClickListener)new exq(this, aiiv, 2));
            return;
        }
        this.aC.setVisibility(8);
        this.aD.setVisibility(8);
        this.aE.setVisibility(8);
        final View aa = this.aA;
        int visibility2 = n;
        if (b != 105915776) {
            visibility2 = 8;
        }
        aa.setVisibility(visibility2);
        this.aB.setOnClickListener((View$OnClickListener)new exq(this, aiiv, 3));
    }
}
