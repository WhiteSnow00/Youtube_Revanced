import android.app.Dialog;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.CountDownLatch;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxm extends hwr implements tgg
{
    private static final Pattern aF;
    public tqd aA;
    public wyw aB;
    public boolean aC;
    public int aD;
    public vaf aE;
    private View aG;
    private View aH;
    private TextView aI;
    private View aJ;
    private View aK;
    private TextView aL;
    private ImageView aM;
    private tce aN;
    private PlaybackStartDescriptor aO;
    private CharSequence aP;
    public View ae;
    public View af;
    public View ag;
    public abkz ah;
    public acgs ai;
    public final hxl aj;
    public xnt ak;
    public abpq al;
    public abpl am;
    public tgd an;
    public ida ao;
    public abnl ap;
    public kui aq;
    public lag ar;
    public gbu as;
    public String at;
    public int au;
    public String av;
    public long aw;
    public boolean ax;
    public CountDownLatch ay;
    public PlayerResponseModel az;
    
    static {
        aF = Pattern.compile("RD.*");
    }
    
    public hxm() {
        this.aj = new hxl(this, 0);
        this.ax = true;
    }
    
    private final void aU() {
        final String s = this.al.s();
        this.aG.setVisibility(0);
        final boolean b = s == null;
        this.aJ.setOnClickListener((View$OnClickListener)new hxk(this, b, 0));
        final int ad = this.aD;
        final int n = ad - 1;
        final xab xab = null;
        if (ad == 0) {
            throw null;
        }
        xab xab2 = null;
        Label_0168: {
            if (n != 1 && n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            xab2 = null;
                            break Label_0168;
                        }
                    }
                    else {
                        if (b) {
                            xab2 = xaa.c(29041);
                            break Label_0168;
                        }
                        xab2 = xaa.c(27431);
                        break Label_0168;
                    }
                }
                if (b) {
                    xab2 = xaa.c(29042);
                }
                else {
                    xab2 = xaa.c(27429);
                }
            }
            else if (b) {
                xab2 = xaa.c(29037);
            }
            else {
                xab2 = xaa.c(27427);
            }
        }
        if (xab2 != null) {
            this.aB.l((wzz)new wyt(xab2));
        }
        this.aK.setOnClickListener((View$OnClickListener)new hxk(this, b, 2));
        final int ad2 = this.aD;
        final int n2 = ad2 - 1;
        if (ad2 != 0) {
            xab xab3 = null;
            Label_0328: {
                if (n2 != 1 && n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                xab3 = xab;
                                break Label_0328;
                            }
                        }
                        else {
                            if (b) {
                                xab3 = xaa.c(29039);
                                break Label_0328;
                            }
                            xab3 = xaa.c(27432);
                            break Label_0328;
                        }
                    }
                    if (b) {
                        xab3 = xaa.c(29040);
                    }
                    else {
                        xab3 = xaa.c(27430);
                    }
                }
                else if (b) {
                    xab3 = xaa.c(29038);
                }
                else {
                    xab3 = xaa.c(27428);
                }
            }
            if (xab3 != null) {
                this.aB.l((wzz)new wyt(xab3));
            }
            return;
        }
        throw null;
    }
    
    private final boolean aV() {
        return !TextUtils.isEmpty((CharSequence)this.at) && TextUtils.isEmpty((CharSequence)this.av);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131625296, viewGroup, false);
        this.ae = inflate.findViewById(2131429670);
        this.af = inflate.findViewById(2131428905);
        this.ag = inflate.findViewById(2131428424);
        this.aH = inflate.findViewById(2131428398);
        this.aI = (TextView)inflate.findViewById(2131428399);
        this.aG = inflate.findViewById(2131431143);
        this.aJ = inflate.findViewById(2131430407);
        this.aL = (TextView)inflate.findViewById(2131430424);
        this.aK = inflate.findViewById(2131430760);
        this.aM = (ImageView)inflate.findViewById(2131432009);
        return inflate;
    }
    
    public final aiqj aM(final aiqj aiqj, final xab xab) {
        if (this.aB.i() == null) {
            return aiqj;
        }
        final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
        final ahbf b = amqf.b;
        final ahaz builder = ((ahbh)amqg.a).createBuilder();
        final String i = this.aB.i();
        builder.copyOnWrite();
        final amqg amqg = (amqg)builder.instance;
        i.getClass();
        amqg.b |= 0x1;
        amqg.c = i;
        final int a = xab.a;
        builder.copyOnWrite();
        final amqg amqg2 = (amqg)builder.instance;
        amqg2.b |= 0x2;
        amqg2.d = a;
        ahbb.e((ahaq)b, (Object)builder.build());
        return (aiqj)((ahaz)ahbb).build();
    }
    
    public final void aN() {
        final xnm g = this.ak.g();
        if (g != null && g.a() == 1) {
            this.ak.g().y(this.av);
        }
        if (this.aC && this.ar.c()) {
            this.aq.s(1, 1);
        }
        this.as.n((acwd)gbx.e(this.aP).a());
        this.an.m((Object)this);
    }
    
    public final void aO(final PlayerResponseModel playerResponseModel) {
        this.ap.k(playerResponseModel.y(), (tcc)new hbr(this, 2), this.av);
    }
    
    public final void aP() {
        if (this.aV()) {
            this.aT();
            return;
        }
        this.ae.setVisibility(0);
        this.af.setVisibility(8);
        this.ag.setVisibility(8);
        this.aN = tce.c((tcc)new hxl(this, 1));
        this.aQ(this.av, (tcc)tca.c((Activity)this.od(), (tcc)this.aN));
    }
    
    public final void aQ(final String s, final tcc tcc) {
        this.ah.j(s, this.aO.x(), this.aO.h(), -1, tcc);
    }
    
    public final void aS(final xnm xnm, final boolean b) {
        if (this.od() == null) {
            this.pO();
            return;
        }
        if (xnm == null && !b) {
            this.pO();
            return;
        }
        if (b) {
            this.aI.setText((CharSequence)this.od().getString(2132019322));
            this.aH.setVisibility(0);
            return;
        }
        final int a = xnm.a();
        if (a == 0) {
            if (xnm.ae()) {
                this.aI.setText((CharSequence)this.od().getString(2132019322));
            }
            else {
                this.aI.setText((CharSequence)this.od().getString(2132017781));
            }
            this.aH.setVisibility(0);
            return;
        }
        if (a != 1) {
            this.pO();
            return;
        }
        this.aH.setVisibility(8);
        if (!this.aV() && this.az == null) {
            return;
        }
        this.aU();
    }
    
    public final void aT() {
        this.ae.setVisibility(8);
        this.af.setVisibility(8);
        this.ag.setVisibility(0);
        final xnm g = this.ak.g();
        if (g == null) {
            return;
        }
        if (g.a() != 0 && !this.ak.o()) {
            this.aU();
        }
        final int ad = this.aD;
        final int n = ad - 1;
        if (ad != 0) {
            Label_0120: {
                if (n != 3) {
                    if (n == 4) {
                        this.aL.setText(2132019136);
                        break Label_0120;
                    }
                    if (n != 5) {
                        break Label_0120;
                    }
                }
                this.aL.setText(2132019135);
            }
            final PlayerResponseModel az = this.az;
            if (az != null) {
                this.ai.i(this.aM, az.l(), acgo.b);
            }
            return;
        }
        throw null;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    array2 = array;
                    if (((aani)o).c() == abkb.e) {
                        final CountDownLatch ay = this.ay;
                        array2 = array;
                        if (ay != null) {
                            ay.countDown();
                            if (this.ay.getCount() == 0L) {
                                this.aN();
                                return null;
                            }
                            array2 = array;
                        }
                    }
                }
                else {
                    final zms zms = (zms)o;
                    if (this.al.s() != null) {
                        this.ay = new CountDownLatch(2);
                        return null;
                    }
                    array2 = array;
                }
            }
            else {
                this.aS(((xnu)o).a(), this.ak.o());
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { xnu.class, zms.class, aani.class };
        }
        return array2;
    }
    
    public final void nn() {
        super.nn();
        this.ao = null;
    }
    
    public final void no() {
        super.no();
        adkp.Q(super.m.containsKey("watch"));
        final xnm g = this.ak.g();
        final boolean o = this.ak.o();
        this.aS(g, o);
        if (g == null && !o) {
            return;
        }
        this.an.g((Object)this);
        final PlaybackStartDescriptor a = ((WatchDescriptor)super.m.getParcelable("watch")).a;
        this.aO = a;
        this.at = a.i();
        this.au = this.aO.a();
        this.aw = this.aO.c();
        final PlaybackStartDescriptor ao = this.aO;
        final int h = ao.h;
        int n = 0;
        Label_0348: {
            if (ao.l() != null) {
                this.au = Math.max(0, this.au);
                this.av = this.aO.l().get(this.au);
                this.aD = 2;
            }
            else if (!TextUtils.isEmpty((CharSequence)this.aO.i())) {
                this.av = this.aO.k();
                if (hxm.aF.matcher(this.at).matches()) {
                    n = 5;
                    this.aD = 5;
                    break Label_0348;
                }
                n = 3;
                if (h == 3) {
                    this.aD = 2;
                }
                else {
                    if (TextUtils.equals((CharSequence)this.at, (CharSequence)"PPSV")) {
                        this.aD = 6;
                        n = 6;
                        break Label_0348;
                    }
                    if (this.au > 0 && h != 4) {
                        this.aD = 3;
                        break Label_0348;
                    }
                    this.aD = 4;
                    n = 4;
                    break Label_0348;
                }
            }
            else {
                if (TextUtils.isEmpty((CharSequence)this.aO.k())) {
                    this.aD = 1;
                    n = 1;
                    break Label_0348;
                }
                this.av = this.aO.k();
                this.aD = 2;
            }
            n = 2;
        }
        if (n == 1) {
            this.aA.c(2132017993);
            this.pO();
            return;
        }
        if (n == 2) {
            this.at = "";
            this.au = -1;
        }
        else if (n == 4 || n == 6) {
            this.au = 0;
        }
        this.af.findViewById(2131431192).setOnClickListener((View$OnClickListener)new hrb(this, 19));
        this.aP();
    }
    
    public final void np() {
        super.np();
        final tce an = this.aN;
        if (an != null) {
            an.d();
            this.aN = null;
        }
        if (this.ax) {
            this.an.m((Object)this);
        }
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ameg ameg;
        if ((ameg = this.aE.b().l) == null) {
            ameg = ameg.a;
        }
        this.aC = ameg.j;
        this.aP = this.nZ().getText(2132020127);
        final WatchDescriptor watchDescriptor = (WatchDescriptor)super.m.getParcelable("watch");
        aiqj b;
        if (watchDescriptor != null) {
            b = watchDescriptor.a.b;
        }
        else {
            b = null;
        }
        this.aB.b(xaa.b(14908), b, (alhi)null);
    }
    
    public final Dialog pN(final Bundle bundle) {
        final Dialog pn = super.pN(bundle);
        pn.getWindow().requestFeature(1);
        return pn;
    }
}
