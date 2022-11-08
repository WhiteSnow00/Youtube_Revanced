import java.util.Iterator;
import java.util.List;
import android.text.TextUtils;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ezb implements acil
{
    final Context a;
    final fwd b;
    final fve c;
    final acih d;
    public final View e;
    public final TextView f;
    public final WrappingTextView g;
    protected final TextView h;
    public final fzy i;
    boolean j;
    public Object k;
    private final aceo l;
    private final acek m;
    private final acio n;
    private final acnj o;
    private final Runnable p;
    private final TextView q;
    private final TextView r;
    private final ImageView s;
    private final ImageView t;
    private final View u;
    private TextView v;
    
    public ezb(final Context a, final aceo l, final giz n, final aeby aeby, final acnj o, final cxz cxz, final fvf fvf, final hyc hyc, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        a.getClass();
        this.a = a;
        l.getClass();
        this.l = l;
        n.getClass();
        this.n = (acio)n;
        this.o = o;
        final LayoutInflater from = LayoutInflater.from(a);
        final fzy fzy = null;
        final View inflate = from.inflate(2131624230, (ViewGroup)null);
        this.e = inflate;
        this.f = (TextView)inflate.findViewById(2131428131);
        this.q = (TextView)inflate.findViewById(2131432299);
        this.r = (TextView)inflate.findViewById(2131431810);
        this.s = (ImageView)inflate.findViewById(2131428086);
        this.t = (ImageView)inflate.findViewById(2131428448);
        this.g = (WrappingTextView)inflate.findViewById(2131428101);
        this.u = inflate.findViewById(2131428145);
        this.h = (TextView)inflate.findViewById(2131430740);
        final acej b = l.b().b();
        b.b(2131232282);
        this.m = b.a();
        final TextView textView = (TextView)inflate.findViewById(2131431807);
        final fwd k = hyc.k(inflate.findViewById(2131431815));
        this.b = k;
        this.c = fvf.a(textView, k);
        if (n.a == null) {
            n.c(inflate);
        }
        this.d = aeby.V((acio)n);
        this.p = new exu(this, 3);
        final ViewStub viewStub = (ViewStub)inflate.findViewById(2131429862);
        fzy d = fzy;
        if (viewStub != null) {
            d = fzy;
            if (cxz != null) {
                d = cxz.D(a, viewStub);
            }
        }
        this.i = d;
    }
    
    public static final afcr p(final CharSequence charSequence, final CharSequence charSequence2) {
        final afcm h = afcr.h(2);
        if (!TextUtils.isEmpty(charSequence)) {
            h.h(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            h.h(charSequence2);
        }
        return h.g();
    }
    
    private final aokb q(final aokb aokb, final wwv wwv) {
        aokb aokb2 = aokb;
        if (aokb != null) {
            final agza builder = ((agzi)aokb).toBuilder();
            feq.d(this.a, builder, this.f.getText());
            aokb2 = (aokb)builder.build();
        }
        this.c.j(aokb2, wwv);
        final boolean j = this.j;
        boolean b = true;
        if (!j) {
            final View b2 = this.b.b();
            if (b2 != null) {
                final int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(2131165779);
                final int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(2131165777);
                final int n = this.a.getResources().getDimensionPixelSize(2131168286) - dimensionPixelOffset2;
                b2.setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset, 0, dimensionPixelOffset);
                if (b2 instanceof TextView) {
                    final TextView textView = (TextView)b2;
                    if (textView.getMinWidth() > n) {
                        textView.setMinWidth(n);
                    }
                }
                if (b2.getMinimumWidth() > n) {
                    b2.setMinimumWidth(n);
                }
                this.j = true;
            }
        }
        final View u = this.u;
        if (aokb2 == null) {
            b = false;
        }
        tmy.v(u, b);
        return aokb2;
    }
    
    public final View a() {
        return this.e;
    }
    
    public abstract aioe b(final Object p0);
    
    public final void c(final acir acir) {
        this.d.c();
        this.c.f();
    }
    
    public abstract amer d(final Object p0);
    
    public abstract aokb f(final Object p0);
    
    public abstract aorm g(final Object p0);
    
    public abstract CharSequence h(final Object p0);
    
    public abstract CharSequence i(final Object p0);
    
    public abstract CharSequence j(final Object p0);
    
    public abstract CharSequence k(final Object p0);
    
    public abstract CharSequence l(final Object p0);
    
    public abstract Object m(final Object p0, final aokb p1);
    
    public void mN(final acij acij, final Object k) {
        this.k = k;
        final byte[] o = this.o(k);
        final ameo ameo = null;
        if (o != null) {
            ((wwx)acij).a.t((wxz)new wws(o), (alff)null);
        }
        this.f.setText(this.k(k));
        final aokb f = this.f(k);
        final wwv a = ((wwx)acij).a;
        if (f != null) {
            final Object m = this.m(k, this.q(f, a));
            this.g.a((List)p(this.h(m), this.i(m)));
            this.g.post(this.p);
            tmy.v((View)this.q, false);
            tmy.v((View)this.r, false);
            final WrappingTextView g = this.g;
            tmy.v((View)g, g.a.isEmpty() ^ true);
        }
        else {
            this.q(null, a);
            tmy.t(this.q, this.l(k));
            tmy.t(this.r, this.j(k));
            tmy.v((View)this.g, false);
        }
        tmy.v((View)this.h, false);
        this.l.j(this.s, this.g(k), this.m);
        while (true) {
            for (final ahyg ahyg : this.n(k)) {
                if ((ahyg.b & 0x2) != 0x0) {
                    ahyj ahyj;
                    if ((ahyj = ahyg.d) == null) {
                        ahyj = ahyj.a;
                    }
                    Object b;
                    if (ahyj != null) {
                        ajsq ajsq;
                        if ((ahyj.b & 0x1) != 0x0) {
                            if ((ajsq = ahyj.c) == null) {
                                ajsq = ajsq.a;
                            }
                        }
                        else {
                            ajsq = null;
                        }
                        b = abyh.b(ajsq);
                    }
                    else {
                        b = null;
                    }
                    if (!TextUtils.isEmpty((CharSequence)b)) {
                        if (this.v == null) {
                            this.v = (TextView)((ViewStub)this.e.findViewById(2131429593)).inflate();
                        }
                        tmy.t(this.v, (CharSequence)b);
                    }
                    else {
                        final TextView v = this.v;
                        if (v != null) {
                            tmy.v((View)v, false);
                        }
                    }
                    final wwv a2 = ((wwx)acij).a;
                    final amer d = this.d(k);
                    final acnj o2 = this.o;
                    final View e = this.e;
                    final ImageView t = this.t;
                    ameo ameo2 = ameo;
                    if (d != null) {
                        ameo2 = ameo;
                        if ((d.b & 0x1) != 0x0 && (ameo2 = d.c) == null) {
                            ameo2 = ameo.a;
                        }
                    }
                    o2.f(e, (View)t, ameo2, k, a2);
                    this.n.e(acij);
                    this.d.a(((wwx)acij).a, this.b(k), acij.e());
                    return;
                }
            }
            ahyj ahyj = null;
            continue;
        }
    }
    
    public abstract List n(final Object p0);
    
    public abstract byte[] o(final Object p0);
}
