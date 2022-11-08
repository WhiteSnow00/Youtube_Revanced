// 
// Decompiled by Procyon v0.6.0
// 

public final class gcc
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final aexq w;
    public final int x;
    public final int y;
    private final aexq z;
    
    public gcc() {
    }
    
    public gcc(final boolean a, final boolean b, final boolean c, final boolean d, final boolean e, final boolean f, final boolean g, final boolean h, final boolean i, final int j, final int k, final int l, final int m, final int n, final int o, final int p26, final int q, final int r, final int s, final int t, final aexq z, final int u, final int v, final aexq w, final int x, final int y) {
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
        this.p = p26;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.z = z;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final int a(final boolean b) {
        final aexq z = this.z;
        int n;
        if (b) {
            n = this.s;
        }
        else {
            n = this.t;
        }
        return (int)z.e(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gcc) {
            final gcc gcc = (gcc)o;
            if (this.a == gcc.a && this.b == gcc.b && this.c == gcc.c && this.d == gcc.d && this.e == gcc.e && this.f == gcc.f && this.g == gcc.g && this.h == gcc.h && this.i == gcc.i && this.j == gcc.j && this.k == gcc.k && this.l == gcc.l && this.m == gcc.m && this.n == gcc.n && this.o == gcc.o && this.p == gcc.p && this.q == gcc.q && this.r == gcc.r && this.s == gcc.s && this.t == gcc.t && this.z.equals(gcc.z) && this.u == gcc.u && this.v == gcc.v && this.w.equals(gcc.w) && this.x == gcc.x && this.y == gcc.y) {
                return true;
            }
        }
        return false;
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
        int n3;
        if (!this.b) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.c) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        int n5;
        if (!this.d) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        int n6;
        if (!this.e) {
            n6 = 1237;
        }
        else {
            n6 = 1231;
        }
        int n7;
        if (!this.f) {
            n7 = 1237;
        }
        else {
            n7 = 1231;
        }
        int n8;
        if (!this.g) {
            n8 = 1237;
        }
        else {
            n8 = 1231;
        }
        int n9;
        if (!this.h) {
            n9 = 1237;
        }
        else {
            n9 = 1231;
        }
        if (this.i) {
            n = 1231;
        }
        return (((((((((((((((((((((((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n9) * 1000003 ^ n) * 1000003 ^ this.j) * 1000003 ^ this.k) * 1000003 ^ this.l) * 1000003 ^ this.m) * 1000003 ^ this.n) * 1000003 ^ this.o) * 1000003 ^ this.p) * 1000003 ^ this.q) * 1000003 ^ this.r) * 1000003 ^ this.s) * 1000003 ^ this.t) * 1000003 ^ this.z.hashCode()) * 1000003 ^ this.u) * 1000003 ^ this.v) * 1000003 ^ this.w.hashCode()) * 1000003 ^ this.x) * 1000003 ^ this.y;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final int j = this.j;
        final int k = this.k;
        final int l = this.l;
        final int m = this.m;
        final int n = this.n;
        final int o = this.o;
        final int p = this.p;
        final int q = this.q;
        final int r = this.r;
        final int s = this.s;
        final int t = this.t;
        final String value = String.valueOf(this.z);
        final int u = this.u;
        final int v = this.v;
        final String value2 = String.valueOf(this.w);
        final int x = this.x;
        final int y = this.y;
        final StringBuilder sb = new StringBuilder("ChipStyleProperties{hasAvatar=");
        sb.append(a);
        sb.append(", hasCheckbox=");
        sb.append(b);
        sb.append(", hasIcon=");
        sb.append(c);
        sb.append(", hasText=");
        sb.append(d);
        sb.append(", shouldUseButtonStyleText=");
        sb.append(e);
        sb.append(", shouldSkipIconTint=");
        sb.append(f);
        sb.append(", clickable=");
        sb.append(g);
        sb.append(", useTouchFeedbackCircleAsBackground=");
        sb.append(h);
        sb.append(", useMultilineTextView=");
        sb.append(i);
        sb.append(", iconMarginStart=");
        sb.append(j);
        sb.append(", iconMarginEnd=");
        sb.append(k);
        sb.append(", iconDimensions=");
        sb.append(l);
        sb.append(", textPaddingStart=");
        sb.append(m);
        sb.append(", textPaddingEnd=");
        sb.append(n);
        sb.append(", textPaddingStartWithImage=");
        sb.append(o);
        sb.append(", minimumWidth=");
        sb.append(p);
        sb.append(", cornerRadius=");
        sb.append(q);
        sb.append(", textViewGravity=");
        sb.append(r);
        sb.append(", selectedTextColor=");
        sb.append(s);
        sb.append(", unselectedTextColor=");
        sb.append(t);
        sb.append(", iconColor=");
        sb.append(value);
        sb.append(", selectedBackgroundResource=");
        sb.append(u);
        sb.append(", unselectedBackgroundResource=");
        sb.append(v);
        sb.append(", checkboxTintColor=");
        sb.append(value2);
        sb.append(", selectedRippleColor=");
        sb.append(x);
        sb.append(", unselectedRippleColor=");
        sb.append(y);
        sb.append("}");
        return sb.toString();
    }
}
