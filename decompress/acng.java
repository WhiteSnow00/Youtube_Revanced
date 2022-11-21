// 
// Decompiled by Procyon v0.6.0
// 

public final class acng
{
    public final acmb a;
    public final acmb b;
    public final long c;
    public final Runnable d;
    public final Runnable e;
    public final Runnable f;
    public final Runnable g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    
    public acng() {
    }
    
    public acng(final acmb a, final acmb b, final long c, final Runnable d, final Runnable e, final Runnable f, final Runnable g, final int h, final int i, final int j, final int k) {
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
    }
    
    public static acnf a() {
        return new acnf();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acng) {
            final acng acng = (acng)o;
            if (this.a.equals(acng.a) && this.b.equals(acng.b) && this.c == acng.c && this.d.equals(acng.d) && this.e.equals(acng.e) && this.f.equals(acng.f) && this.g.equals(acng.g) && this.h == acng.h && this.i == acng.i && this.j == acng.j && this.k == acng.k) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ (int)this.c) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h) * 1000003 ^ this.i) * 1000003 ^ this.j) * 1000003 ^ this.k;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final long c = this.c;
        final String value3 = String.valueOf(this.d);
        final String value4 = String.valueOf(this.e);
        final String value5 = String.valueOf(this.f);
        final String value6 = String.valueOf(this.g);
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final StringBuilder sb = new StringBuilder("ReplaceParameters{oldPresenter=");
        sb.append(value);
        sb.append(", newPresenter=");
        sb.append(value2);
        sb.append(", duration=");
        sb.append(c);
        sb.append(", oldOnStart=");
        sb.append(value3);
        sb.append(", oldOnEnd=");
        sb.append(value4);
        sb.append(", newOnStart=");
        sb.append(value5);
        sb.append(", newOnEnd=");
        sb.append(value6);
        sb.append(", fromX=");
        sb.append(h);
        sb.append(", fromY=");
        sb.append(i);
        sb.append(", toX=");
        sb.append(j);
        sb.append(", toY=");
        sb.append(k);
        sb.append("}");
        return sb.toString();
    }
}
