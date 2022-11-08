import android.view.View$OnClickListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acug implements actm
{
    public final boolean a;
    public final int b;
    public final View c;
    public final CharSequence d;
    public final CharSequence e;
    public final aibb f;
    public final aibb g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final aexq m;
    public final aexq n;
    public final actk o;
    public final View$OnClickListener p;
    public final acul q;
    private final boolean r;
    
    public acug() {
    }
    
    public acug(final boolean a, final int b, final boolean r, final View c, final CharSequence d, final CharSequence e, final aibb f, final aibb g, final int h, final int i, final int j, final int k, final float l, final aexq m, final aexq n, final actk o, final View$OnClickListener p18, final acul q) {
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
    
    public static acuf a() {
        final acuf acuf = new acuf((char[])null);
        acuf.k(0);
        acuf.o(1);
        acuf.p(0);
        acuf.l(1.0f);
        acuf.h(false);
        acuf.m(2);
        acuf.f(2);
        acuf.n(false);
        return acuf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acug) {
            final acug acug = (acug)o;
            if (this.a == acug.a && this.b == acug.b && this.r == acug.r) {
                final View c = this.c;
                if (c == null) {
                    if (acug.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(acug.c)) {
                    return false;
                }
                final CharSequence d = this.d;
                if (d == null) {
                    if (acug.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(acug.d)) {
                    return false;
                }
                final CharSequence e = this.e;
                if (e == null) {
                    if (acug.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(acug.e)) {
                    return false;
                }
                final aibb f = this.f;
                if (f == null) {
                    if (acug.f != null) {
                        return false;
                    }
                }
                else if (!((agzi)f).equals(acug.f)) {
                    return false;
                }
                final aibb g = this.g;
                if (g == null) {
                    if (acug.g != null) {
                        return false;
                    }
                }
                else if (!((agzi)g).equals(acug.g)) {
                    return false;
                }
                if (this.h == acug.h && this.i == acug.i && this.j == acug.j && this.k == acug.k && Float.floatToIntBits(this.l) == Float.floatToIntBits(acug.l) && this.m.equals((Object)acug.m) && this.n.equals((Object)acug.n)) {
                    final actk o2 = this.o;
                    if (o2 == null) {
                        if (acug.o != null) {
                            return false;
                        }
                    }
                    else if (!o2.equals(acug.o)) {
                        return false;
                    }
                    final View$OnClickListener p = this.p;
                    if (p == null) {
                        if (acug.p != null) {
                            return false;
                        }
                    }
                    else if (!p.equals(acug.p)) {
                        return false;
                    }
                    final acul q = this.q;
                    final acul q2 = acug.q;
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
        final aibb f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = ((agzi)f).hashCode();
        }
        final aibb g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = ((agzi)g).hashCode();
        }
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final int floatToIntBits = Float.floatToIntBits(this.l);
        final int hashCode7 = this.m.hashCode();
        final int hashCode8 = this.n.hashCode();
        final actk o = this.o;
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
        final acul q = this.q;
        if (q != null) {
            hashCode = q.hashCode();
        }
        return (((((((((((((((((n2 ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ n) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 583896283 ^ hashCode5) * 583896283 ^ hashCode6) * 1000003 ^ h) * 1000003 ^ i) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ floatToIntBits) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode;
    }
    
    public final actk i() {
        return this.o;
    }
    
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
