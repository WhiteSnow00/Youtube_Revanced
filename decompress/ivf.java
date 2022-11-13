import android.content.Context;
import android.graphics.drawable.Drawable;
import app.revanced.integrations.sponsorblock.SponsorBlockUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils;
import android.widget.TextView;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivf implements fpz
{
    public final wyw a;
    public final Resources b;
    public final vcy c;
    public final abag d;
    public boolean e;
    public boolean f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public boolean k;
    public final toz l;
    public final toz m;
    public final toz n;
    public final toz o;
    public final toz p;
    public final toz q;
    private final int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private CharSequence x;
    private boolean y;
    private StringBuilder z;
    
    public ivf(final toz m, final toz n, final toz l, final toz o, final toz p9, final toz q, final wyw a, final vcy c, final abag d) {
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p9;
        this.q = q;
        this.a = a;
        this.d = d;
        this.c = c;
        final Resources resources = ((TextView)m.a).getResources();
        this.b = resources;
        this.r = resources.getDimensionPixelSize(2131168510);
        this.s = true;
        this.v = 0;
        l.l(this.u, false);
        ((TextView)m.a).setImportantForAccessibility(2);
    }
    
    private final void k() {
        if (this.m() && !this.k) {
            ((TextView)this.m.a).setText((CharSequence)null);
        }
    }
    
    private final void l(final boolean s, final boolean b) {
        if (this.s == s) {
            return;
        }
        this.s = s;
        final toz l = this.l;
        boolean b3;
        final boolean b2 = b3 = false;
        if (s) {
            b3 = b2;
            if (this.u) {
                b3 = b2;
                if (!this.k) {
                    b3 = true;
                }
            }
        }
        l.l(b3, b);
        this.j(b);
    }
    
    private final boolean m() {
        return this.u && this.v == 1;
    }
    
    private static boolean n(final CharSequence charSequence, final CharSequence charSequence2) {
        final boolean equals = TextUtils.equals(charSequence, charSequence2);
        boolean b = true;
        if (!equals) {
            if (TextUtils.isEmpty(charSequence)) {
                if (!TextUtils.isEmpty(charSequence2)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final void a(final boolean b) {
        this.l(false, b);
    }
    
    public final void b(final boolean b) {
        if (this.w == b) {
            return;
        }
        this.w = b;
        ((TextView)this.l.a).setClickable(b);
    }
    
    public final void c(final boolean u) {
        if (this.u == u) {
            return;
        }
        this.u = u;
        final toz l = this.l;
        int n;
        if (!u) {
            n = 8;
        }
        else {
            n = 4;
        }
        l.j(n);
        this.l.l(this.s && this.u && !this.k, false);
        this.j(false);
        this.k();
        this.o.a.setClickable(this.u ^ true);
        if (!this.u) {
            tpe.aF(this.m.a, tpe.aA(0), (Class)ViewGroup$MarginLayoutParams.class);
        }
    }
    
    public final void d(final boolean t) {
        if (this.t == t) {
            return;
        }
        this.t = t;
        this.j(false);
    }
    
    public final void e(final CharSequence g, final CharSequence h, final CharSequence charSequence) {
        if (!TextUtils.equals(this.x, charSequence) || this.y != this.u) {
            this.x = charSequence;
            this.y = this.u;
            if (this.z == null) {
                this.z = new StringBuilder();
            }
            final StringBuilder z = this.z;
            z.delete(0, z.length());
            if (this.y) {
                this.z.append('-');
            }
            this.z.append(charSequence);
            final TextView textView = (TextView)this.n.a;
            textView.setText((CharSequence)this.z);
            textView.setMinimumWidth(0);
            textView.measure(0, 0);
            ((TextView)this.n.a).setMinimumWidth(textView.getMeasuredWidth());
        }
        this.g = g;
        this.h = h;
        this.i = charSequence;
        this.h();
        final String appendTimeWithoutSegments = SponsorBlockUtils.appendTimeWithoutSegments(this.b.getString(2132019988, new Object[] { charSequence }));
        if (!n(appendTimeWithoutSegments, ((TextView)this.n.a).getText())) {
            ((TextView)this.n.a).setText((CharSequence)appendTimeWithoutSegments);
        }
    }
    
    public final void f(final boolean b) {
        this.l(true, b);
    }
    
    public final void g(final boolean b) {
        int v = 0;
        Label_0029: {
            if (!this.m() || this.w) {
                if (!b) {
                    v = 2;
                    break Label_0029;
                }
            }
            v = 1;
        }
        if (this.v == v) {
            return;
        }
        this.v = v;
        final TextView textView = (TextView)this.l.a;
        final Context context = textView.getContext();
        int n;
        if (this.v == 1) {
            n = 2131232449;
        }
        else {
            n = 2131232452;
        }
        apj.j(textView, agx.a(context, n), (Drawable)null, (Drawable)null);
        this.k();
        final boolean m = this.m();
        final int n2 = 0;
        int r;
        if (m) {
            r = 0;
        }
        else {
            r = this.r;
        }
        if (!this.u) {
            r = n2;
        }
        tpe.aF(this.m.a, tpe.aA(r), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    public final void h() {
        CharSequence text;
        if (this.m() && !this.k) {
            text = null;
        }
        else if (this.f) {
            text = this.b.getString(2132019492, new Object[] { this.h });
        }
        else {
            text = this.g;
        }
        if (!n(text, ((TextView)this.m.a).getText())) {
            ((TextView)this.m.a).setText(text);
        }
    }
    
    public final void i(final boolean b) {
        final boolean empty = TextUtils.isEmpty(this.j);
        final boolean e = this.e;
        boolean b3;
        final boolean b2 = b3 = false;
        if (!e) {
            b3 = b2;
            if (this.s) {
                b3 = b2;
                if (this.t) {
                    b3 = b2;
                    if (!empty) {
                        b3 = true;
                    }
                }
            }
        }
        if (b3 || empty) {
            ((TextView)this.p.a).setText(this.j);
        }
        this.p.l(b3, b);
    }
    
    public final void j(final boolean b) {
        final boolean s = this.s;
        final boolean b2 = false;
        final boolean b3 = s && this.t;
        final boolean b4 = s && this.t && (!this.u || this.k);
        final boolean b5 = s && this.u && !this.k;
        boolean b6 = false;
        Label_0115: {
            if (!b3) {
                b6 = b2;
                if (!b5) {
                    break Label_0115;
                }
            }
            b6 = b2;
            if (!this.e) {
                b6 = true;
            }
        }
        this.o.l(b6, b);
        this.a.l((wzz)new wyt(xaa.c(86640)));
        final toz n = this.n;
        int n2;
        if (!this.u) {
            n2 = 4;
        }
        else {
            n2 = 8;
        }
        n.j(n2);
        this.m.l(b3, b);
        this.n.l(b4, b);
        this.i(b);
    }
}
