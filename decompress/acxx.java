import android.view.View$OnClickListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxx implements acxd
{
    public final boolean a;
    public final int b;
    public final View c;
    public final CharSequence d;
    public final CharSequence e;
    public final aies f;
    public final aies g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final afbh m;
    public final afbh n;
    public final acxb o;
    public final View$OnClickListener p;
    public final acyc q;
    private final boolean r;
    
    public acxx() {
    }
    
    public acxx(final boolean a, final int b, final boolean r, final View c, final CharSequence d, final CharSequence e, final aies f, final aies g, final int h, final int i, final int j, final int k, final float l, final afbh m, final afbh n, final acxb o, final View$OnClickListener p18, final acyc q) {
        this.a = a;
        this.b = b;
        this.r = r;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = q;
    }
    
    public static acxw a() {
        final acxw acxw = new acxw((char[])null);
        acxw.k(0);
        acxw.o(1);
        acxw.p(0);
        acxw.l(1.0f);
        acxw.h(false);
        acxw.m(2);
        acxw.f(2);
        acxw.n(false);
        return acxw;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acxx) {
            final acxx acxx = (acxx)o;
            if (this.a == acxx.a && this.b == acxx.b && this.r == acxx.r) {
                final View c = this.c;
                if (c == null) {
                    if (acxx.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(acxx.c)) {
                    return false;
                }
                final CharSequence d = this.d;
                if (d == null) {
                    if (acxx.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(acxx.d)) {
                    return false;
                }
                final CharSequence e = this.e;
                if (e == null) {
                    if (acxx.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(acxx.e)) {
                    return false;
                }
                final aies f = this.f;
                if (f == null) {
                    if (acxx.f != null) {
                        return false;
                    }
                }
                else if (!((ahcz)f).equals(acxx.f)) {
                    return false;
                }
                final aies g = this.g;
                if (g == null) {
                    if (acxx.g != null) {
                        return false;
                    }
                }
                else if (!((ahcz)g).equals(acxx.g)) {
                    return false;
                }
                if (this.h == acxx.h && this.i == acxx.i && this.j == acxx.j && this.k == acxx.k && Float.floatToIntBits(this.l) == Float.floatToIntBits(acxx.l) && this.m.equals(acxx.m) && this.n.equals(acxx.n)) {
                    final acxb o2 = this.o;
                    if (o2 == null) {
                        if (acxx.o != null) {
                            return false;
                        }
                    }
                    else if (!o2.equals(acxx.o)) {
                        return false;
                    }
                    final View$OnClickListener p = this.p;
                    if (p == null) {
                        if (acxx.p != null) {
                            return false;
                        }
                    }
                    else if (!p.equals(acxx.p)) {
                        return false;
                    }
                    final acyc q = this.q;
                    final acyc q2 = acxx.q;
                    if (q == null) {
                        if (q2 != null) {
                            return false;
                        }
                    }
                    else if (!q.equals(q2)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int f() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final int b = this.b;
        if (this.r) {
            n = 1231;
        }
        final View c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final CharSequence d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final CharSequence e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final aies f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = ((ahcz)f).hashCode();
        }
        final aies g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = ((ahcz)g).hashCode();
        }
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final int floatToIntBits = Float.floatToIntBits(this.l);
        final int hashCode7 = this.m.hashCode();
        final int hashCode8 = this.n.hashCode();
        final acxb o = this.o;
        int hashCode9;
        if (o == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = o.hashCode();
        }
        final View$OnClickListener p = this.p;
        int hashCode10;
        if (p == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = p.hashCode();
        }
        final acyc q = this.q;
        if (q != null) {
            hashCode = q.hashCode();
        }
        return (((((((((((((((((n2 ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ n) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 583896283 ^ hashCode5) * 583896283 ^ hashCode6) * 1000003 ^ h) * 1000003 ^ i) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ floatToIntBits) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode;
    }
    
    @Override
    public final acxb i() {
        return this.o;
    }
    
    @Override
    public final boolean k() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final int b = this.b;
        final boolean r = this.r;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.e);
        final String value4 = String.valueOf(this.f);
        final String value5 = String.valueOf(this.g);
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final float l = this.l;
        final String value6 = String.valueOf(this.m);
        final String value7 = String.valueOf(this.n);
        final String value8 = String.valueOf(this.o);
        final String value9 = String.valueOf(this.p);
        final String value10 = String.valueOf(this.q);
        final StringBuilder sb = new StringBuilder("YouTubeTooltipModel{counterfactual=");
        sb.append(a);
        sb.append(", duration=");
        sb.append(b);
        sb.append(", rateLimited=");
        sb.append(r);
        sb.append(", targetView=");
        sb.append(value);
        sb.append(", titleText=");
        sb.append(value2);
        sb.append(", detailText=");
        sb.append(value3);
        sb.append(", actionText=null, actionListener=null, actionButtonRenderer=");
        sb.append(value4);
        sb.append(", dismissText=null, dismissListener=null, dismissButtonRenderer=");
        sb.append(value5);
        sb.append(", tapDismissalType=");
        sb.append(h);
        sb.append(", targetEffectType=");
        sb.append(i);
        sb.append(", placement=");
        sb.append(j);
        sb.append(", alignment=");
        sb.append(k);
        sb.append(", maxWidthPercentage=");
        sb.append(l);
        sb.append(", backgroundColor=");
        sb.append(value6);
        sb.append(", acceptFeedbackOnTargetTapEnabled=");
        sb.append(value7);
        sb.append(", transientUiCallback=");
        sb.append(value8);
        sb.append(", onClickListener=");
        sb.append(value9);
        sb.append(", onTooltipDismissListener=");
        sb.append(value10);
        sb.append("}");
        return sb.toString();
    }
}
