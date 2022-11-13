// 
// Decompiled by Procyon v0.6.0
// 

public final class arbq
{
    public final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    
    public arbq() {
    }
    
    public arbq(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final int i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static arbq a(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        return new arbq(n, n2, n3, n4, n5, n6, n7, n8, n9);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof arbq) {
            final arbq arbq = (arbq)o;
            if (this.a == arbq.a && this.b == arbq.b && this.c == arbq.c && this.d == arbq.d && this.e == arbq.e && this.f == arbq.f && this.g == arbq.g && this.h == arbq.h && this.i == arbq.i) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((((((this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003 ^ this.h) * 1000003 ^ this.i) * 1000003;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final int i = this.i;
        final StringBuilder sb = new StringBuilder("Palette{section1Color=");
        sb.append(a);
        sb.append(", section2Color=");
        sb.append(b);
        sb.append(", section3Color=");
        sb.append(c);
        sb.append(", section4Color=");
        sb.append(d);
        sb.append(", primaryTextColor=");
        sb.append(e);
        sb.append(", bodyTextColor=");
        sb.append(f);
        sb.append(", activeIconColor=");
        sb.append(g);
        sb.append(", inactiveIconColor=");
        sb.append(h);
        sb.append(", disabledIconColor=");
        sb.append(i);
        sb.append(", surgeColor=0}");
        return sb.toString();
    }
}
