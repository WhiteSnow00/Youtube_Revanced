import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfo
{
    public static final arfo a;
    public static final arfo b;
    public static final arfo c;
    public static final arfo d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    public final double m;
    
    static {
        a = new arfo(1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        b = new arfo(0.0, 1.0, -1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        c = new arfo(-1.0, 0.0, 0.0, -1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        d = new arfo(0.0, -1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
    }
    
    public arfo(final double h, final double i, final double j, final double k, final double e, final double f, final double g, final double l, final double m) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static arfo a(final ByteBuffer byteBuffer) {
        return new arfo(clm.q(byteBuffer), clm.q(byteBuffer), clm.q(byteBuffer), clm.q(byteBuffer), clm.p(byteBuffer), clm.p(byteBuffer), clm.p(byteBuffer), clm.q(byteBuffer), clm.q(byteBuffer));
    }
    
    public final void b(final ByteBuffer byteBuffer) {
        clm.i(byteBuffer, this.h);
        clm.i(byteBuffer, this.i);
        clm.h(byteBuffer, this.e);
        clm.i(byteBuffer, this.j);
        clm.i(byteBuffer, this.k);
        clm.h(byteBuffer, this.f);
        clm.i(byteBuffer, this.l);
        clm.i(byteBuffer, this.m);
        clm.h(byteBuffer, this.g);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arfo arfo = (arfo)o;
            return Double.compare(arfo.h, this.h) == 0 && Double.compare(arfo.i, this.i) == 0 && Double.compare(arfo.j, this.j) == 0 && Double.compare(arfo.k, this.k) == 0 && Double.compare(arfo.l, this.l) == 0 && Double.compare(arfo.m, this.m) == 0 && Double.compare(arfo.e, this.e) == 0 && Double.compare(arfo.f, this.f) == 0 && Double.compare(arfo.g, this.g) == 0;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.e);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.f);
        final long doubleToLongBits3 = Double.doubleToLongBits(this.g);
        final long doubleToLongBits4 = Double.doubleToLongBits(this.h);
        final long doubleToLongBits5 = Double.doubleToLongBits(this.i);
        final long doubleToLongBits6 = Double.doubleToLongBits(this.j);
        final long doubleToLongBits7 = Double.doubleToLongBits(this.k);
        final long doubleToLongBits8 = Double.doubleToLongBits(this.l);
        final long doubleToLongBits9 = Double.doubleToLongBits(this.m);
        return ((((((((int)(doubleToLongBits ^ doubleToLongBits >>> 32) * 31 + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32)) * 31 + (int)(doubleToLongBits3 >>> 32 ^ doubleToLongBits3)) * 31 + (int)(doubleToLongBits4 >>> 32 ^ doubleToLongBits4)) * 31 + (int)(doubleToLongBits5 >>> 32 ^ doubleToLongBits5)) * 31 + (int)(doubleToLongBits6 >>> 32 ^ doubleToLongBits6)) * 31 + (int)(doubleToLongBits7 >>> 32 ^ doubleToLongBits7)) * 31 + (int)(doubleToLongBits8 ^ doubleToLongBits8 >>> 32)) * 31 + (int)(doubleToLongBits9 >>> 32 ^ doubleToLongBits9);
    }
    
    @Override
    public final String toString() {
        if (this.equals(arfo.a)) {
            return "Rotate 0°";
        }
        if (this.equals(arfo.b)) {
            return "Rotate 90°";
        }
        if (this.equals(arfo.c)) {
            return "Rotate 180°";
        }
        if (this.equals(arfo.d)) {
            return "Rotate 270°";
        }
        final double e = this.e;
        final double f = this.f;
        final double g = this.g;
        final double h = this.h;
        final double i = this.i;
        final double j = this.j;
        final double k = this.k;
        final double l = this.l;
        final double m = this.m;
        final StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(e);
        sb.append(", v=");
        sb.append(f);
        sb.append(", w=");
        sb.append(g);
        sb.append(", a=");
        sb.append(h);
        sb.append(", b=");
        sb.append(i);
        sb.append(", c=");
        sb.append(j);
        sb.append(", d=");
        sb.append(k);
        sb.append(", tx=");
        sb.append(l);
        sb.append(", ty=");
        sb.append(m);
        sb.append("}");
        return sb.toString();
    }
}
