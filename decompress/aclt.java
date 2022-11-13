// 
// Decompiled by Procyon v0.6.0
// 

public final class aclt
{
    public final acko a;
    public final acko b;
    public final long c;
    public final Runnable d;
    public final Runnable e;
    public final Runnable f;
    public final Runnable g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    
    public aclt() {
    }
    
    public aclt(final acko a, final acko b, final long c, final Runnable d, final Runnable e, final Runnable f, final Runnable g, final int h, final int i, final int j, final int k) {
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
    
    public static acls a() {
        return new acls();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aclt) {
            final aclt aclt = (aclt)o;
            if (this.a.equals(aclt.a) && this.b.equals(aclt.b) && this.c == aclt.c && this.d.equals(aclt.d) && this.e.equals(aclt.e) && this.f.equals(aclt.f) && this.g.equals(aclt.g) && this.h == aclt.h && this.i == aclt.i && this.j == aclt.j && this.k == aclt.k) {
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
