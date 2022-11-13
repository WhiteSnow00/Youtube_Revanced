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

abstract class jlf implements acko
{
    protected final View a;
    protected final TextView b;
    protected final ImageView c;
    protected final TextView d;
    protected final Context e;
    public aiqj f;
    private final TextView g;
    private final ViewGroup h;
    private final ViewStub i;
    private final TextView j;
    private final View k;
    private final View$OnClickListener l;
    private final acgs m;
    private final acvi n;
    private final acsy o;
    private final acpk p;
    private final gag q;
    private final fvn r;
    private final fwl s;
    
    public jlf(final Context e, final vcy vcy, final acgs m, final acvi n, final ziy ziy, final acpk p18, final hwn hwn, final hyx hyx, final aeea aeea, final int n2, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.f = null;
        this.e = e;
        m.getClass();
        this.m = m;
        this.p = p18;
        this.n = n;
        final View inflate = LayoutInflater.from(e).inflate(n2, viewGroup, false);
        this.a = inflate;
        this.d = (TextView)inflate.findViewById(2131432095);
        this.b = (TextView)inflate.findViewById(2131431822);
        this.c = (ImageView)inflate.findViewById(2131427725);
        this.g = (TextView)inflate.findViewById(2131427734);
        this.h = (ViewGroup)inflate.findViewById(2131427768);
        final ViewStub i = (ViewStub)inflate.findViewById(2131432102);
        this.i = i;
        final TextView j = (TextView)inflate.findViewById(2131431810);
        this.j = j;
        final View viewById = inflate.findViewById(2131431818);
        this.k = viewById;
        this.l = (View$OnClickListener)new jlb(this, vcy, 7);
        this.o = ziy.ap((TextView)inflate.findViewById(2131427452));
        this.q = new gag(p18, e, i);
        fwl l;
        if (viewById != null) {
            l = hyx.l(viewById);
        }
        else {
            l = null;
        }
        this.s = l;
        this.r = hwn.a(j, l);
        if (aeea.P()) {
            aeea.O(inflate, aeea.M(inflate, (Drawable)null));
            return;
        }
        tpe.e(inflate, tpe.j(e, 0));
    }
    
    static boolean f(final aprq aprq) {
        anuv anuv;
        if ((anuv = aprq.i) == null) {
            anuv = anuv.a;
        }
        final int dn = aqsx.dn(((amhp)anuv.rx((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer)).d);
        if (dn != 0) {
            if (dn == 17) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final View a() {
        return this.a;
    }
    
    protected abstract void b(final aprq p0);
    
    @Override
    public final void c(final acku acku) {
        this.r.f();
    }
    
    public final void d(final ackm ackm, final aprq aprq) {
        final int b = aprq.b;
        final aome aome = null;
        aiqj f;
        if ((b & 0x2) != 0x0) {
            if ((f = aprq.h) == null) {
                f = aiqj.a;
            }
        }
        else {
            f = null;
        }
        this.f = f;
        this.a.setOnClickListener(this.l);
        final TextView d = this.d;
        ajut ajut;
        if ((aprq.b & 0x1) != 0x0) {
            if ((ajut = aprq.g) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        d.setText((CharSequence)acak.b(ajut));
        anuv anuv;
        if ((anuv = aprq.i) == null) {
            anuv = anuv.a;
        }
        amhp amhp;
        if (anuv.ry((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
            anuv anuv2;
            if ((anuv2 = aprq.i) == null) {
                anuv2 = anuv.a;
            }
            amhp = (amhp)anuv2.rx((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
        }
        else {
            amhp = null;
        }
        if (f(aprq)) {
            final trd background = new trd(tpe.cr(this.e, 2130970948));
            background.b(6, 2, trd.a(this.d.getTextSize(), 2) + 4, 2);
            this.d.setBackground((Drawable)background);
            this.i.setVisibility(8);
        }
        else {
            this.d.setBackground((Drawable)null);
            this.d.setPadding(0, 0, 0, 0);
            this.q.f(amhp);
        }
        this.c.setVisibility(8);
        this.g.setVisibility(8);
        ((acsx)this.o).b((aicz)null, (wyw)null);
        ajut ajut2;
        if (aprq.e == 9) {
            ajut2 = (ajut)aprq.f;
        }
        else {
            ajut2 = null;
        }
        final Spanned b2 = acak.b(ajut2);
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            this.g.setVisibility(0);
            this.g.setText((CharSequence)b2);
        }
        else {
            aotp a;
            if (aprq.e == 5) {
                a = (aotp)aprq.f;
            }
            else {
                a = aotp.a;
            }
            if (aald.S(a)) {
                final acgs m = this.m;
                final ImageView c = this.c;
                aotp a2;
                if (aprq.e == 5) {
                    a2 = (aotp)aprq.f;
                }
                else {
                    a2 = aotp.a;
                }
                m.g(c, a2);
                this.c.setVisibility(0);
            }
            else if (aprq.e == 10) {
                final acsy o = this.o;
                final aida aida = (aida)aprq.f;
                aicz aicz;
                if ((aida.b & 0x1) != 0x0) {
                    if ((aicz = aida.c) == null) {
                        aicz = aicz.a;
                    }
                }
                else {
                    aicz = null;
                }
                ((acsx)o).b(aicz, ackm.a);
            }
        }
        final aprc[] array = ((List)aprq.j).toArray(new aprc[0]);
        tpe.v((View)this.h, array != null && array.length > 0);
        jgk.l(this.e, this.h, this.p, (List)Arrays.asList(array), true);
        anuv anuv3;
        if ((anuv3 = aprq.m) == null) {
            anuv3 = anuv.a;
        }
        aome aome2 = aome;
        if (anuv3.ry((ahaq)SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            anuv anuv4;
            if ((anuv4 = aprq.m) == null) {
                anuv4 = anuv.a;
            }
            aome2 = (aome)anuv4.rx((ahaq)SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        }
        if (aome2 == null) {
            this.s.f();
        }
        else {
            final Context e = this.e;
            final ahaz builder = aome2.toBuilder();
            fex.d(e, builder, this.d.getText());
            aome2 = (aome)builder.build();
        }
        this.r.j(aome2, ackm.a);
        final fwl s = this.s;
        if (s != null) {
            final View b3 = s.b();
            if (b3 != null) {
                b3.setPaddingRelative(b3.getPaddingStart(), 0, 0, 0);
            }
        }
        apqv apqv;
        if ((apqv = aprq.l) == null) {
            apqv = apqv.a;
        }
        final int b4 = apqv.b;
        final apqv k = aprq.k;
        apqv a3;
        if (k == null) {
            a3 = apqv.a;
        }
        else {
            a3 = k;
        }
        final int b5 = a3.b;
        Label_1198: {
            if (b4 == 118483990) {
                if (b5 == 118483990) {
                    apqv apqv2;
                    if ((apqv2 = aprq.l) == null) {
                        apqv2 = apqv.a;
                    }
                    aibe a4;
                    if (apqv2.b == 118483990) {
                        a4 = (aibe)apqv2.c;
                    }
                    else {
                        a4 = aibe.a;
                    }
                    apqv apqv3;
                    if ((apqv3 = aprq.k) == null) {
                        apqv3 = apqv.a;
                    }
                    aibe a5;
                    if (apqv3.b == 118483990) {
                        a5 = (aibe)apqv3.c;
                    }
                    else {
                        a5 = aibe.a;
                    }
                    this.d.setTextColor(this.n.a(a5.d, a4.d));
                    this.b.setTextColor(this.n.a(a5.e, a4.e));
                    this.g.setTextColor(this.n.a(a5.d, a4.d));
                    this.a.setBackgroundColor(this.n.a(a5.c, a4.c));
                    break Label_1198;
                }
            }
            else if (b5 == 118483990) {
                apqv a6;
                if ((a6 = k) == null) {
                    a6 = apqv.a;
                }
                aibe a7;
                if (a6.b == 118483990) {
                    a7 = (aibe)a6.c;
                }
                else {
                    a7 = aibe.a;
                }
                this.d.setTextColor(a7.d);
                this.b.setTextColor(a7.e);
                this.g.setTextColor(a7.d);
                this.a.setBackgroundColor(a7.c);
                break Label_1198;
            }
            this.d.setTextColor(tpe.cx(this.e, 2130970924).orElse(0));
            this.b.setTextColor(tpe.cx(this.e, 2130970926).orElse(0));
            this.g.setTextColor(tpe.cx(this.e, 2130970924).orElse(0));
            this.a.setBackgroundColor(tpe.cx(this.e, 2130970829).orElse(0));
        }
        this.b(aprq);
    }
    
    @Override
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        this.d(ackm, (aprq)o);
    }
}
