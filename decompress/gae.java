import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gae
{
    public final fzj a;
    public final fzt b;
    public final fzv c;
    public final fzz d;
    public final gaa e;
    public final boolean f;
    public final boolean g;
    public final Object h;
    public final fzp i;
    public final ActionBarColor j;
    public final ActionBarColor k;
    public final int l;
    public final ActionBarColor m;
    public final int n;
    public final ActionBarColor o;
    public final ActionBarColor p;
    public final boolean q;
    public final boolean r;
    
    public gae() {
    }
    
    public gae(final fzj a, final fzt b, final fzv c, final fzz d, final gaa e, final boolean f, final boolean g, final Object h, final fzp i, final ActionBarColor j, final ActionBarColor k, final int l, final ActionBarColor m, final int n, final ActionBarColor o, final ActionBarColor p18, final boolean q, final boolean r) {
        this.a = a;
        this.b = b;
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
        this.r = r;
    }
    
    public static gad a() {
        final gad gad = new gad();
        gad.b(fzj.a().b());
        gad.d(false);
        gad.e(false);
        gad.f = fzp.a().a();
        gad.c(ezt.u());
        gad.k(ezt.u());
        gad.h(0);
        gad.g(ezt.u());
        gad.j(0);
        gad.i(ezt.u());
        gad.f(ezt.u());
        gad.l(false);
        gad.m(true);
        return gad;
    }
    
    public final gad b() {
        return new gad(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gae) {
            final gae gae = (gae)o;
            if (this.a.equals(gae.a)) {
                final fzt b = this.b;
                if (b == null) {
                    if (gae.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(gae.b)) {
                    return false;
                }
                final fzv c = this.c;
                if (c == null) {
                    if (gae.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(gae.c)) {
                    return false;
                }
                final fzz d = this.d;
                if (d == null) {
                    if (gae.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(gae.d)) {
                    return false;
                }
                final gaa e = this.e;
                if (e == null) {
                    if (gae.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(gae.e)) {
                    return false;
                }
                if (this.f == gae.f && this.g == gae.g) {
                    final Object h = this.h;
                    if (h == null) {
                        if (gae.h != null) {
                            return false;
                        }
                    }
                    else if (!h.equals(gae.h)) {
                        return false;
                    }
                    if (this.i.equals(gae.i) && this.j.equals(gae.j) && this.k.equals(gae.k) && this.l == gae.l && this.m.equals(gae.m) && this.n == gae.n && this.o.equals(gae.o) && this.p.equals(gae.p) && this.q == gae.q && this.r == gae.r) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final fzt b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final fzv c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final fzz d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final gaa e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final boolean f = this.f;
        int n = 1237;
        int n2;
        if (!f) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.g) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        final Object h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        final int hashCode7 = this.i.hashCode();
        final int hashCode8 = this.j.hashCode();
        final int hashCode9 = this.k.hashCode();
        final int l = this.l;
        final int hashCode10 = this.m.hashCode();
        final int n4 = this.n;
        final int hashCode11 = this.o.hashCode();
        final int hashCode12 = this.p.hashCode();
        int n5;
        if (!this.q) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        if (this.r) {
            n = 1231;
        }
        return (((((((((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ hashCode2) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ l) * 1000003 ^ hashCode10) * 1000003 ^ n4) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ n5) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final boolean f = this.f;
        final boolean g = this.g;
        final String value6 = String.valueOf(this.h);
        final String value7 = String.valueOf(this.i);
        final String value8 = String.valueOf(this.j);
        final String value9 = String.valueOf(this.k);
        final int l = this.l;
        final String value10 = String.valueOf(this.m);
        final int n = this.n;
        final String value11 = String.valueOf(this.o);
        final String value12 = String.valueOf(this.p);
        final boolean q = this.q;
        final boolean r = this.r;
        final StringBuilder sb = new StringBuilder("TopBarModel{actionBarModel=");
        sb.append(value);
        sb.append(", feedFilterBarModel=");
        sb.append(value2);
        sb.append(", mySubsFilterBarModel=");
        sb.append(value3);
        sb.append(", searchResultsChipBarModel=");
        sb.append(value4);
        sb.append(", tabHeaderElementBarModel=");
        sb.append(value5);
        sb.append(", enableTranslucentActionBar=");
        sb.append(f);
        sb.append(", hideTitleOnTranslucentActionBar=");
        sb.append(g);
        sb.append(", headerRenderer=");
        sb.append(value6);
        sb.append(", collapseBehavior=");
        sb.append(value7);
        sb.append(", backgroundColor=");
        sb.append(value8);
        sb.append(", statusBarColor=");
        sb.append(value9);
        sb.append(", primaryTextStyleResId=");
        sb.append(l);
        sb.append(", primaryTextColor=");
        sb.append(value10);
        sb.append(", secondaryTextStyleResId=");
        sb.append(n);
        sb.append(", secondaryTextColor=");
        sb.append(value11);
        sb.append(", indicatorColor=");
        sb.append(value12);
        sb.append(", translucentWhenAccessibilityEnabled=");
        sb.append(q);
        sb.append(", visible=");
        sb.append(r);
        sb.append("}");
        return sb.toString();
    }
}
