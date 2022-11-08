import android.text.Spanned;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import java.util.List;
import java.util.Arrays;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class jkd implements acil
{
    protected final View a;
    protected final TextView b;
    protected final ImageView c;
    protected final TextView d;
    protected final Context e;
    public aioe f;
    private final TextView g;
    private final ViewGroup h;
    private final ViewStub i;
    private final TextView j;
    private final View k;
    private final View$OnClickListener l;
    private final aceo m;
    private final acte n;
    private final acqu o;
    private final acng p;
    private final fzy q;
    private final fve r;
    private final fwd s;
    
    public jkd(final Context e, final vax vax, final aceo m, final acte n, final zhb zhb, final acng p14, final fvf fvf, final hyc hyc, final adcr adcr, final int n2, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = null;
        this.e = e;
        m.getClass();
        this.m = m;
        this.p = p14;
        this.n = n;
        final View inflate = LayoutInflater.from(e).inflate(n2, viewGroup, false);
        this.a = inflate;
        this.d = (TextView)inflate.findViewById(2131432092);
        this.b = (TextView)inflate.findViewById(2131431819);
        this.c = (ImageView)inflate.findViewById(2131427725);
        this.g = (TextView)inflate.findViewById(2131427734);
        this.h = (ViewGroup)inflate.findViewById(2131427768);
        final ViewStub i = (ViewStub)inflate.findViewById(2131432099);
        this.i = i;
        final TextView j = (TextView)inflate.findViewById(2131431807);
        this.j = j;
        final View viewById = inflate.findViewById(2131431815);
        this.k = viewById;
        this.l = (View$OnClickListener)new jjz(this, vax, 6);
        this.o = zhb.g((TextView)inflate.findViewById(2131427452));
        this.q = new fzy(p14, e, i);
        fwd k;
        if (viewById != null) {
            k = hyc.k(viewById);
        }
        else {
            k = null;
        }
        this.s = k;
        this.r = fvf.a(j, k);
        if (adcr.d()) {
            adcr.c(inflate, adcr.a(inflate, (Drawable)null));
            return;
        }
        tmy.e(inflate, tmy.j(e, 0));
    }
    
    static boolean f(final appm appm) {
        anss anss;
        if ((anss = appm.i) == null) {
            anss = anss.a;
        }
        final int dm = aqql.dm(((amfl)((agzd)anss).rr((agyr)MetadataBadgeRendererOuterClass.metadataBadgeRenderer)).d);
        if (dm != 0) {
            if (dm == 17) {
                return true;
            }
        }
        return false;
    }
    
    public final View a() {
        return this.a;
    }
    
    protected abstract void b(final appm p0);
    
    public final void c(final acir acir) {
        this.r.f();
    }
    
    public final void d(final acij acij, final appm appm) {
        final int b = appm.b;
        final agzi agzi = null;
        aioe f;
        if ((b & 0x2) != 0x0) {
            if ((f = appm.h) == null) {
                f = aioe.a;
            }
        }
        else {
            f = null;
        }
        this.f = f;
        this.a.setOnClickListener(this.l);
        final TextView d = this.d;
        ajsq ajsq;
        if ((appm.b & 0x1) != 0x0) {
            if ((ajsq = appm.g) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        d.setText((CharSequence)abyh.b(ajsq));
        anss anss;
        if ((anss = appm.i) == null) {
            anss = anss.a;
        }
        amfl amfl;
        if (((agzd)anss).rs((agyr)MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
            anss anss2;
            if ((anss2 = appm.i) == null) {
                anss2 = anss.a;
            }
            amfl = (amfl)((agzd)anss2).rr((agyr)MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
        }
        else {
            amfl = null;
        }
        if (f(appm)) {
            final toy background = new toy(tmy.cn(this.e, 2130970948));
            background.b(6, 2, toy.a(this.d.getTextSize(), 2) + 4, 2);
            this.d.setBackground((Drawable)background);
            this.i.setVisibility(8);
        }
        else {
            this.d.setBackground((Drawable)null);
            this.d.setPadding(0, 0, 0, 0);
            this.q.f(amfl);
        }
        this.c.setVisibility(8);
        this.g.setVisibility(8);
        ((acqt)this.o).b(null, null);
        ajsq ajsq2;
        if (appm.e == 9) {
            ajsq2 = (ajsq)appm.f;
        }
        else {
            ajsq2 = null;
        }
        final Spanned b2 = abyh.b(ajsq2);
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            this.g.setVisibility(0);
            this.g.setText((CharSequence)b2);
        }
        else {
            aorm a;
            if (appm.e == 5) {
                a = (aorm)appm.f;
            }
            else {
                a = aorm.a;
            }
            if (actc.M(a)) {
                final aceo m = this.m;
                final ImageView c = this.c;
                aorm a2;
                if (appm.e == 5) {
                    a2 = (aorm)appm.f;
                }
                else {
                    a2 = aorm.a;
                }
                m.g(c, a2);
                this.c.setVisibility(0);
            }
            else if (appm.e == 10) {
                final acqu o = this.o;
                final aibc aibc = (aibc)appm.f;
                aibb aibb;
                if ((aibc.b & 0x1) != 0x0) {
                    if ((aibb = aibc.c) == null) {
                        aibb = aibb.a;
                    }
                }
                else {
                    aibb = null;
                }
                ((acqt)o).b(aibb, ((wwx)acij).a);
            }
        }
        final apoy[] array = ((List)appm.j).toArray(new apoy[0]);
        tmy.v((View)this.h, array != null && array.length > 0);
        jfi.h(this.e, this.h, this.p, (List)Arrays.asList(array), true);
        anss anss3;
        if ((anss3 = appm.m) == null) {
            anss3 = anss.a;
        }
        Object o2 = agzi;
        if (((agzd)anss3).rs((agyr)SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            anss anss4;
            if ((anss4 = appm.m) == null) {
                anss4 = anss.a;
            }
            o2 = ((agzd)anss4).rr((agyr)SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        }
        if (o2 == null) {
            this.s.f();
        }
        else {
            final Context e = this.e;
            final agza builder = ((agzi)o2).toBuilder();
            feq.d(e, builder, this.d.getText());
            o2 = builder.build();
        }
        this.r.j((aokb)o2, ((wwx)acij).a);
        final fwd s = this.s;
        if (s != null) {
            final View b3 = s.b();
            if (b3 != null) {
                b3.setPaddingRelative(b3.getPaddingStart(), 0, 0, 0);
            }
        }
        apor apor;
        if ((apor = appm.l) == null) {
            apor = apor.a;
        }
        final int b4 = apor.b;
        final apor k = appm.k;
        apor a3;
        if (k == null) {
            a3 = apor.a;
        }
        else {
            a3 = k;
        }
        final int b5 = a3.b;
        Label_1198: {
            if (b4 == 118483990) {
                if (b5 == 118483990) {
                    apor apor2;
                    if ((apor2 = appm.l) == null) {
                        apor2 = apor.a;
                    }
                    ahzg a4;
                    if (apor2.b == 118483990) {
                        a4 = (ahzg)apor2.c;
                    }
                    else {
                        a4 = ahzg.a;
                    }
                    apor apor3;
                    if ((apor3 = appm.k) == null) {
                        apor3 = apor.a;
                    }
                    ahzg a5;
                    if (apor3.b == 118483990) {
                        a5 = (ahzg)apor3.c;
                    }
                    else {
                        a5 = ahzg.a;
                    }
                    this.d.setTextColor(this.n.a(a5.d, a4.d));
                    this.b.setTextColor(this.n.a(a5.e, a4.e));
                    this.g.setTextColor(this.n.a(a5.d, a4.d));
                    this.a.setBackgroundColor(this.n.a(a5.c, a4.c));
                    break Label_1198;
                }
            }
            else if (b5 == 118483990) {
                apor a6;
                if ((a6 = k) == null) {
                    a6 = apor.a;
                }
                ahzg a7;
                if (a6.b == 118483990) {
                    a7 = (ahzg)a6.c;
                }
                else {
                    a7 = ahzg.a;
                }
                this.d.setTextColor(a7.d);
                this.b.setTextColor(a7.e);
                this.g.setTextColor(a7.d);
                this.a.setBackgroundColor(a7.c);
                break Label_1198;
            }
            this.d.setTextColor(tmy.ct(this.e, 2130970924).orElse(0));
            this.b.setTextColor(tmy.ct(this.e, 2130970926).orElse(0));
            this.g.setTextColor(tmy.ct(this.e, 2130970924).orElse(0));
            this.a.setBackgroundColor(tmy.ct(this.e, 2130970829).orElse(0));
        }
        this.b(appm);
    }
}
