import android.text.Spanned;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.text.TextUtils$TruncateAt;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.LayoutInflater;
import java.util.concurrent.atomic.AtomicReference;
import android.view.View;
import android.text.TextUtils;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvk extends usm implements utb, wdk, wdx, vxp, vya, foa, fys, fjk, fjo
{
    private asic A;
    private String B;
    private CharSequence C;
    private vxv D;
    private utz E;
    private ViewGroup F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private final uyi K;
    private final uyi L;
    private final qv M;
    private final zhb N;
    private final auip O;
    public final vxu a;
    public final fjl b;
    public final atir c;
    public acsw d;
    public alpx e;
    public CharSequence f;
    public boolean g;
    public boolean h;
    public asic i;
    public asic j;
    public final vwz k;
    public final uyi l;
    public final arud m;
    public final xpn n;
    private final tdz o;
    private final Context s;
    private final vxq t;
    private final atjj u;
    private final fjp v;
    private final fyt w;
    private final acup x;
    private final uuc y;
    private final kzd z;
    
    public kvk(final tdz o, final Context s, final zhb n, final vxq t, final vxu a, final atjj u, final qv m, final fjl b, final fjp v, final fyt w, final arud i, final acup x, final vup vup, final vwz k, final kzd z, final xpn n2, final uyi l, final uyi j, final auip o2, final uyi l2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(t.m());
        this.g = false;
        this.G = false;
        this.o = o;
        this.s = s;
        this.N = n;
        this.t = t;
        this.a = a;
        this.u = u;
        this.M = m;
        this.b = b;
        this.v = v;
        this.w = w;
        this.m = i;
        this.x = x;
        this.y = vup.q(t.m());
        this.k = k;
        this.z = z;
        this.n = n2;
        this.l = l;
        this.K = j;
        this.O = o2;
        this.L = l2;
        this.c = atir.e();
    }
    
    private final void M(final boolean c) {
        final agza builder = ((agzi)ToggleConversationActionOuterClass$ToggleConversationAction.a).createBuilder();
        builder.copyOnWrite();
        final ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction = (ToggleConversationActionOuterClass$ToggleConversationAction)builder.instance;
        toggleConversationActionOuterClass$ToggleConversationAction.b |= 0x2;
        toggleConversationActionOuterClass$ToggleConversationAction.c = c;
        this.o.d((Object)vyx.a(aexq.k("tag"), (ToggleConversationActionOuterClass$ToggleConversationAction)builder.build()));
    }
    
    private final void N(final ajnn ajnn) {
        final utz f = this.f();
        if (f == null) {
            return;
        }
        if (ajnn != null && (ajnn.b & 0x2) != 0x0) {
            ajsq ajsq;
            if ((ajsq = ajnn.c) == null) {
                ajsq = ajsq.a;
            }
            f.y((CharSequence)abyh.b(ajsq));
        }
        else {
            f.y((CharSequence)this.s.getString(2132018363));
        }
        final aogu aogu = null;
        this.C = null;
        if (ajnn != null) {
            if ((ajnn.b & 0x20) != 0x0) {
                ajsq ajsq2;
                if ((ajsq2 = ajnn.g) == null) {
                    ajsq2 = ajsq.a;
                }
                this.C = (CharSequence)abyh.b(ajsq2);
            }
            else {
                ajno ajno;
                if ((ajno = ajnn.f) == null) {
                    ajno = ajno.a;
                }
                aogu a;
                if (ajno.b == 76818770) {
                    a = (aogu)ajno.c;
                }
                else {
                    a = aogu.a;
                }
                for (final aogt aogt : a.c) {
                    if (aogt.g) {
                        this.C = aogt.e;
                        break;
                    }
                }
            }
        }
        if (ajnn != null && this.O()) {
            ajsq ajsq3;
            if ((ajnn.b & 0x8) != 0x0) {
                if ((ajsq3 = ajnn.e) == null) {
                    ajsq3 = ajsq.a;
                }
            }
            else {
                ajsq3 = null;
            }
            this.f = (CharSequence)abyh.b(ajsq3);
        }
        this.u();
        aogu a2 = aogu;
        if (ajnn != null) {
            a2 = aogu;
            if ((ajnn.b & 0x10) != 0x0) {
                ajno ajno2;
                if ((ajno2 = ajnn.f) == null) {
                    ajno2 = ajno.a;
                }
                if (ajno2.b == 76818770) {
                    a2 = (aogu)ajno2.c;
                }
                else {
                    a2 = aogu.a;
                }
            }
        }
        f.i(a2);
        f.q(ajnn);
        f.s(ajnn);
        f.r(ajnn);
    }
    
    private final boolean O() {
        alnz alnz;
        if ((alnz = this.m.f().d) == null) {
            alnz = alnz.a;
        }
        return alnz.c;
    }
    
    private final void P(final elw elw) {
        if (elw == null) {
            this.B = null;
            return;
        }
        if (TextUtils.equals((CharSequence)this.B, (CharSequence)elw.d())) {
            return;
        }
        final String d = elw.d();
        this.c.tr((Object)d);
        this.B = d;
        if (this.O()) {
            this.w.b(d, (fys)this);
        }
    }
    
    public final View a() {
        return (View)this.F;
    }
    
    public final void e(final acik acik) {
    }
    
    public final utz f() {
        utz utz;
        if ((utz = this.E) == null) {
            (this.E = (utz)this.u.a()).j((utb)this);
            utz = this.E;
            utz.m = super.p;
        }
        return utz;
    }
    
    public final void g(final ajnl ajnl, final alff alff) {
        super.g(ajnl, alff);
        if (ajnl == null) {
            return;
        }
        final fzo v = iba.V(ajnl);
        if (v == null) {
            return;
        }
        this.y.f(super.q, this.r);
        this.P(this.b.e());
        this.e = (alpx)v.a;
        this.N((ajnn)v.b);
    }
    
    public final void j() {
        this.k.b();
        this.G = false;
        this.a.c();
        this.M(false);
        this.b.b(this);
        this.v.n(this);
        this.M.d((foa)this);
        final asic a = this.A;
        if (a != null) {
            athh.f((AtomicReference)a);
        }
        this.g = false;
        this.t.m().o((wxz)new wws(this.e.j), (alff)null);
    }
    
    public final void k(final aioe aioe) {
        final ViewGroup f = (ViewGroup)LayoutInflater.from(this.s).inflate(2131624696, (ViewGroup)null, false);
        this.F = f;
        final zhb n = this.N;
        final wwv p = super.p;
        final abhr abhr = (abhr)((atjj)n.c).a();
        final adcr adcr = (adcr)((atjj)n.a).a();
        final abpj abpj = (abpj)((atjj)n.b).a();
        abpj.getClass();
        final wdr wdr = (wdr)((atjj)n.e).a();
        final wdh wdh = (wdh)((atjj)n.d).a();
        wdh.getClass();
        f.getClass();
        p.getClass();
        final vxv vxv = new vxv(abhr, adcr, abpj, wdr, wdh, f, p, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.D = vxv;
        final vxu a = this.a;
        if (a.e != vxv) {
            a.e = vxv;
            final ViewGroup b = a.e.b;
            (a.f = new wdj(b.getContext())).setLayoutParams(new ViewGroup$LayoutParams(-1, 0));
            final wdj f2 = a.f;
            f2.a = (wdi)a;
            b.addView((View)f2);
        }
        this.D.b().D();
        this.t.w((wdk)this);
        if (!(boolean)this.L.l(45379534L).aG()) {
            if (this.d == null) {
                this.d = this.O.F(super.p, (alff)null);
            }
            this.d.a((FrameLayout)this.F.findViewById(2131430782));
            this.t.x((wdx)this);
        }
        final vxq t = this.t;
        t.h = (vxp)this;
        ((vyb)t.j).a((vya)this);
        if (this.K.aT()) {
            this.F.findViewById(2131429631).setBackgroundColor(tmy.cn(this.s, 2130970829));
        }
        this.a.b(this.e);
        this.y.a();
    }
    
    public final void l() {
        this.t.C();
        this.k.a.clear();
        final asic i = this.i;
        if (i != null) {
            asjg.b((AtomicReference)i);
        }
        final asic j = this.j;
        if (j != null) {
            athh.f((AtomicReference)j);
        }
        this.y.b();
        ((vyb)this.t.j).h((vya)this);
        final acsw d = this.d;
        if (d != null) {
            final FrameLayout b = d.b;
            if (b != null) {
                b.removeAllViews();
            }
            d.a.c((acir)null);
        }
    }
    
    public final void lV() {
        this.k.d = true;
        if (this.F == null) {
            return;
        }
        final vxu a = this.a;
        a.d = this.e;
        ((vxq)a.a.a()).q();
    }
    
    public final void m() {
        this.y.c();
        this.I = true;
    }
    
    public final void n(final aioe aioe) {
        this.g = true;
        this.y.d(aioe);
        this.b.a(this);
        this.v.l(this);
        this.M.c((foa)this);
        this.A = this.z.a.al((asix)new kuc(this, 13));
        alnz alnz;
        if ((alnz = this.m.f().d) == null) {
            alnz = alnz.a;
        }
        if (alnz.f) {
            this.qg();
        }
        this.I = false;
        this.x.f();
        this.w();
        this.t.m().t((wxz)new wws(this.e.j), (alff)null);
    }
    
    public final void oK(final fkk fkk) {
        alnz alnz;
        if ((alnz = this.m.f().d) == null) {
            alnz = alnz.a;
        }
        if (!alnz.i && this.e != null && !this.I) {
            if (!this.J && fkk.c()) {
                this.t.m().o((wxz)new wws(this.e.j), (alff)null);
            }
            if (this.J && !fkk.c()) {
                this.t.m().t((wxz)new wws(this.e.j), (alff)null);
            }
        }
        if (this.J && !fkk.c()) {
            final vxu a = this.a;
            if (a.e != null) {
                ((vxq)a.a.a()).o(a.e.b());
                ((vxh)a.b.a()).b(a.e.a());
            }
        }
        this.J = fkk.c();
        if (!fkk.i()) {
            this.a.c();
        }
        final utz e = this.E;
        if (e != null) {
            e.n();
        }
    }
    
    public final void q(final usz usz) {
    }
    
    public final void qB() {
        this.k.d = false;
        if (this.F != null) {
            if (this.G) {
                final vxu a = this.a;
                final alpx e = this.e;
                final vxq vxq = (vxq)a.a.a();
                if (!vxq.E()) {
                    return;
                }
                a.d = e;
                vxq.u();
            }
        }
    }
    
    public final void qg() {
        this.G = true;
        this.a.b(this.e);
        this.M(true);
        this.oK(this.v.j());
        final utz e = this.E;
        if (e != null) {
            e.e();
        }
    }
    
    public final void qm() {
        this.H = false;
        this.w();
    }
    
    public final void qn() {
        this.H = true;
        this.w();
    }
    
    public final void qo(final String s, final apmw apmw) {
        if (TextUtils.equals((CharSequence)this.B, (CharSequence)s) && (apmw.b & 0x4) != 0x0) {
            ajsq ajsq;
            if ((ajsq = apmw.d) == null) {
                ajsq = ajsq.a;
            }
            this.f = (CharSequence)abyh.b(ajsq);
            this.u();
        }
    }
    
    public final void qp(final elw elw) {
        this.P(elw);
    }
    
    public final void s(final abxx abxx) {
        this.t.y(abxx);
    }
    
    public final void u() {
        if (TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.f)) {
            this.f().x((CharSequence)null);
            return;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(this.C)) {
            spannableStringBuilder.append(this.C);
            if (!TextUtils.isEmpty(this.f)) {
                spannableStringBuilder.append(' ');
                spannableStringBuilder.append(' ');
            }
        }
        if (!TextUtils.isEmpty(this.f)) {
            final Drawable drawable = this.s.getResources().getDrawable(2131230973);
            final int dimensionPixelSize = this.s.getResources().getDimensionPixelSize(2131166426);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            aip.f(drawable, tmy.ct(this.s, 2130970862).orElse(0));
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append(' ');
            spannableStringBuilder.setSpan((Object)new ImageSpan(drawable, 1), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append(this.f);
        }
        this.f().x((CharSequence)spannableStringBuilder);
        final utz f = this.f();
        final TextUtils$TruncateAt middle = TextUtils$TruncateAt.MIDDLE;
        final TextView b = f.b;
        if (b != null) {
            b.setEllipsize(middle);
        }
    }
    
    public final void v(final alpv alpv) {
        if (alpv == null) {
            return;
        }
        final int b = alpv.b;
        if (b == 138681548) {
            this.N((ajnn)alpv.c);
            return;
        }
        if (b == 130028801) {
            final alnx alnx = (alnx)alpv.c;
            final utz f = this.f();
            if (f == null) {
                return;
            }
            ajsq ajsq;
            if (alnx.b == 1) {
                ajsq = (ajsq)alnx.c;
            }
            else {
                ajsq = null;
            }
            final Spanned b2 = abyh.b(ajsq);
            if (TextUtils.isEmpty((CharSequence)b2)) {
                if (alnx.b == 5) {
                    final aogu aogu = (aogu)((agzd)alnx.c).rr((agyr)SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
                    if (aogu.c.size() != 0) {
                        for (final aogt aogt : aogu.c) {
                            if (aogt.g) {
                                this.C = aogt.e;
                                this.u();
                                break;
                            }
                        }
                    }
                    ((usx)f).i(aogu);
                }
                return;
            }
            this.C = (CharSequence)b2;
            this.u();
            ((usx)f).i((aogu)null);
        }
    }
    
    public final void w() {
        final utz f = this.f();
        if (f != null) {
            if (!this.I) {
                final boolean h = this.h;
                boolean b = false;
                if (!h) {
                    b = b;
                    if (!this.H) {
                        b = true;
                    }
                }
                ((usx)f).g(b);
            }
        }
    }
    
    public final boolean x() {
        return true;
    }
}
