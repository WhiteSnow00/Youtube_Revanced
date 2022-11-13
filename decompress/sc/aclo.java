// 
// Decompiled by Procyon v0.6.0
// 

public final class aclo
{
    public final acko a;
    public final long b;
    public final Runnable c;
    public final Runnable d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    
    public aclo() {
    }
    
    public aclo(final acko a, final long b, final Runnable c, final Runnable d, final int e, final int f, final int g, final int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static acln a() {
        return new acln();
    }
    
    public final aclo b(final aclm aclm) {
        final acln a = a();
        a.g(this.a);
        a.f(this.c);
        a.e(this.d);
        a.b(aclm.a);
        a.c(aclm.b);
        a.d(aclm.c);
        a.h(aclm.d);
        a.i(aclm.e);
        return a.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aclo) {
            final aclo aclo = (aclo)o;
            if (this.a.equals(aclo.a) && this.b == aclo.b && this.c.equals(aclo.c) && this.d.equals(aclo.d) && this.e == aclo.e && this.f == aclo.f && this.g == aclo.g && this.h == aclo.h) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ (int)this.b) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003 ^ this.h;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final long b = this.b;
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final StringBuilder sb = new StringBuilder("MoveParameters{presenter=");
        sb.append(value);
        sb.append(", duration=");
        sb.append(b);
        sb.append(", onStart=");
        sb.append(value2);
        sb.append(", onEnd=");
        sb.append(value3);
        sb.append(", fromX=");
        sb.append(e);
        sb.append(", fromY=");
        sb.append(f);
        sb.append(", toX=");
        sb.append(g);
        sb.append(", toY=");
        sb.append(h);
        sb.append("}");
        return sb.toString();
    }
}
