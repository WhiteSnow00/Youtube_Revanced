import java.util.Set;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface;
import java.util.List;
import java.util.Collection;
import android.text.TextUtils;
import android.content.Context;
import com.google.protos.youtube.api.innertube.ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.app.AlertDialog;
import java.util.concurrent.Executor;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyb extends hxv implements krs, swy
{
    public aujg aA;
    public aeea aB;
    public aeea aC;
    private TextView aD;
    private View aE;
    private RecyclerView aF;
    private View aG;
    private ttk aH;
    private String aI;
    private ubu aJ;
    public bu ae;
    public vcy af;
    public zmf ag;
    public zmt ah;
    public wyv ai;
    public tqd aj;
    public atke ak;
    public hya al;
    public Executor am;
    aiqj an;
    public String ao;
    public AlertDialog ap;
    public TextView aq;
    public EditText ar;
    public AlertDialog as;
    public acle at;
    public fzw au;
    public vbs av;
    public ziy aw;
    public xib ax;
    public mdp ay;
    public mdp az;
    
    public hyb() {
        this.aI = null;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        Bundle m = bundle;
        if (bundle == null) {
            m = super.m;
        }
        this.an = vdb.b(m.getByteArray("navigation_endpoint"));
        this.aH = this.ay.N((syl)new sxl(this, 1));
        final View inflate = layoutInflater.inflate(2131625843, viewGroup, false);
        (this.aF = (RecyclerView)inflate.findViewById(2131430120)).af((nw)new LinearLayoutManager());
        this.aD = (TextView)inflate.findViewById(2131432095);
        this.aE = inflate.findViewById(2131431383);
        this.aG = inflate.findViewById(2131430652);
        this.aQ(null);
        return inflate;
    }
    
    @Override
    public final void V(final Activity activity) {
        super.V(activity);
        this.ae = (bu)activity;
    }
    
    final void aM() {
        this.aG.setVisibility(8);
        this.aF.setVisibility(0);
        this.aF.setClickable(true);
    }
    
    public final void aN() {
        if (this.an == null) {
            ttr.b("No navigation endpoint provided.");
            this.dismiss();
        }
        if (((ahbc)this.an).ry((ahaq)YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
            this.aP(null);
            return;
        }
        if (((ahbc)this.an).ry((ahaq)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.managePurchaseEndpoint)) {
            final ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint managePurchaseEndpointOuterClass$ManagePurchaseEndpoint = (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint)((ahbc)this.an).rx((ahaq)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.managePurchaseEndpoint);
            amaw amaw;
            if ((amaw = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint.b) == null) {
                amaw = amaw.a;
            }
            if (amaw.b == 173521720) {
                amaw amaw2;
                if ((amaw2 = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint.b) == null) {
                    amaw2 = amaw.a;
                }
                aojf a;
                if (amaw2.b == 173521720) {
                    a = (aojf)amaw2.c;
                }
                else {
                    a = aojf.a;
                }
                this.aO();
                this.aM();
                this.aQ("");
                this.at.add((Object)a);
            }
            return;
        }
        ttr.b("Unknown navigation endpoint provided: ".concat(String.valueOf(String.valueOf(this.an))));
    }
    
    final void aO() {
        if (this.at == null) {
            final acjv acjv = new acjv();
            ((acku)acjv).f((Class)apwx.class, (acks)new ackw(this.ak, 0));
            ((acku)acjv).f((Class)amge.class, (acks)new hxx(this, 1));
            ((acku)acjv).f((Class)aojf.class, (acks)new hxx(this, 0));
            ((acku)acjv).f((Class)aoye.class, (acks)new hxx(this, 2));
            ((acku)acjv).f((Class)apxa.class, (acks)new etc((Context)this.ae, (krs)this, 11));
            ((acku)acjv).f((Class)kfq.class, (acks)new jfv((Context)this.ae, 3));
            final ackz z = this.aB.Z((acku)acjv);
            final acle at = new acle();
            z.h((acjn)at);
            z.f((ackn)new acjz(this.ai.pF()));
            this.aF.ac((nq)z);
            this.at = at;
        }
        ((tfz)this.at).clear();
    }
    
    public final void aP(final String ao) {
        this.aG.setVisibility(0);
        this.aF.setVisibility(4);
        this.aF.setClickable(false);
        final aiqj an = this.an;
        if (an != null && ((ahbc)an).ry((ahaq)YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
            final aadx y = this.ax.Y(this.ag.c());
            final vxc d = y.d();
            d.w((YpcOffersEndpoint$YPCOffersEndpoint)((ahbc)this.an).rx((ahaq)YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint));
            ((vkk)d).k(glb.e(this.an));
            if (!TextUtils.isEmpty((CharSequence)ao)) {
                d.a = vxc.g(ao);
            }
            this.ao = ao;
            teu.n((aun)this.ae, y.e(d, this.am), (ttg)new hui(this, 6), (ttg)new hxz(this));
            return;
        }
        ttr.b("Invalid navigation endpoint provided.");
        this.dismiss();
    }
    
    final void aQ(final CharSequence text) {
        if (TextUtils.isEmpty(text)) {
            this.aD.setVisibility(8);
            this.aE.setVisibility(8);
            return;
        }
        this.aE.setVisibility(0);
        this.aD.setVisibility(0);
        this.aD.setText(text);
    }
    
    public final void aS(final apxa apxa) {
        this.aO();
        ((tfz)this.at).addAll((Collection)qdt.N(apxa));
        apwz apwz;
        if ((apwz = apxa.f) == null) {
            apwz = apwz.a;
        }
        final int b = apwz.b;
        final CharSequence charSequence = null;
        final CharSequence charSequence2 = null;
        apwr apwr;
        if ((b & 0x1) != 0x0) {
            apwz apwz2;
            if ((apwz2 = apxa.f) == null) {
                apwz2 = apwz.a;
            }
            if ((apwr = apwz2.c) == null) {
                apwr = apwr.a;
            }
        }
        else {
            apwr = null;
        }
        ajut ajut;
        if ((ajut = apxa.e) == null) {
            ajut = ajut.a;
        }
        if (!TextUtils.isEmpty((CharSequence)acak.b(ajut)) && apwr != null) {
            this.at.add((Object)apxa);
        }
        if (apxa.g.size() > 0 || apxa.i.size() > 0) {
            final acle at = this.at;
            final CharSequence[] p = qdt.P((List)apxa.g, this.af);
            final CharSequence[] p2 = qdt.P((List)apxa.i, this.af);
            final CharSequence concat = TextUtils.concat(new CharSequence[] { System.getProperty("line.separator"), System.getProperty("line.separator") });
            CharSequence charSequence3 = charSequence;
            if (p != null) {
                int n = 0;
                CharSequence concat2 = charSequence2;
                while (true) {
                    charSequence3 = concat2;
                    if (n >= p.length) {
                        break;
                    }
                    final CharSequence charSequence4 = p[n];
                    if (TextUtils.isEmpty(concat2)) {
                        concat2 = charSequence4;
                    }
                    else {
                        concat2 = TextUtils.concat(new CharSequence[] { concat2, concat, charSequence4 });
                    }
                    ++n;
                }
            }
            CharSequence charSequence5;
            if (p2 != null) {
                CharSequence concat3 = charSequence3;
                int n2 = 0;
                while (true) {
                    charSequence5 = concat3;
                    if (n2 >= p2.length) {
                        break;
                    }
                    final CharSequence charSequence6 = p2[n2];
                    if (TextUtils.isEmpty(concat3)) {
                        concat3 = charSequence6;
                    }
                    else {
                        concat3 = TextUtils.concat(new CharSequence[] { concat3, concat, charSequence6 });
                    }
                    ++n2;
                }
            }
            else {
                charSequence5 = charSequence3;
            }
            at.add((Object)new kfq(charSequence3, charSequence5));
        }
        this.aM();
        ajut ajut2;
        if ((ajut2 = apxa.c) == null) {
            ajut2 = ajut.a;
        }
        this.aQ((CharSequence)acak.b(ajut2));
    }
    
    public final ubu aT() {
        if (this.aJ == null) {
            this.aJ = new ubu((Activity)this.ae, this.aj, this.aC, (byte[])null, (byte[])null, (byte[])null);
        }
        return this.aJ;
    }
    
    public final void no() {
        super.no();
        this.aI = this.au.i();
        if (!this.ag.t()) {
            super.d.hide();
            this.ah.b((Activity)this.ae, (byte[])null, (zmr)new kwd(this, 1));
            return;
        }
        this.aN();
    }
    
    public final void np() {
        super.np();
        this.au.j(this.aI);
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.al.a(this);
        final syk syk = (syk)this.aH;
        ((Set)syk.b.a).remove(syk.a);
        final afke k = afft.p((Collection)this.az.a).k();
        while (k.hasNext()) {
            ((DialogInterface$OnDismissListener)k.next()).onDismiss(dialogInterface);
        }
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.nc(1, 0);
    }
}
