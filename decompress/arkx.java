import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkx
{
    public static final arkx a;
    public static final arkx b;
    public static final arkx c;
    public static final arkx d;
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
        a = new arkx(1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        b = new arkx(0.0, 1.0, -1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        c = new arkx(-1.0, 0.0, 0.0, -1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        d = new arkx(0.0, -1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
    }
    
    public arkx(final double h, final double i, final double j, final double k, final double e, final double f, final double g, final double l, final double m) {
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
    
    public static arkx a(final ByteBuffer byteBuffer) {
        return new arkx(coh.d(byteBuffer), coh.d(byteBuffer), coh.d(byteBuffer), coh.d(byteBuffer), coh.c(byteBuffer), coh.c(byteBuffer), coh.c(byteBuffer), coh.d(byteBuffer), coh.d(byteBuffer));
    }
    
    public final void b(final ByteBuffer byteBuffer) {
        cop.g(byteBuffer, this.h);
        cop.g(byteBuffer, this.i);
        cop.f(byteBuffer, this.e);
        cop.g(byteBuffer, this.j);
        cop.g(byteBuffer, this.k);
        cop.f(byteBuffer, this.f);
        cop.g(byteBuffer, this.l);
        cop.g(byteBuffer, this.m);
        cop.f(byteBuffer, this.g);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arkx arkx = (arkx)o;
            return Double.compare(arkx.h, this.h) == 0 && Double.compare(arkx.i, this.i) == 0 && Double.compare(arkx.j, this.j) == 0 && Double.compare(arkx.k, this.k) == 0 && Double.compare(arkx.l, this.l) == 0 && Double.compare(arkx.m, this.m) == 0 && Double.compare(arkx.e, this.e) == 0 && Double.compare(arkx.f, this.f) == 0 && Double.compare(arkx.g, this.g) == 0;
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
        return ((((((((int)(doubleToLongBits ^ doubleToLongBits >>> 32) * 31 + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32)) * 31 + (int)(doubleToLongBits3 ^ doubleToLongBits3 >>> 32)) * 31 + (int)(doubleToLongBits4 ^ doubleToLongBits4 >>> 32)) * 31 + (int)(doubleToLongBits5 ^ doubleToLongBits5 >>> 32)) * 31 + (int)(doubleToLongBits6 ^ doubleToLongBits6 >>> 32)) * 31 + (int)(doubleToLongBits7 ^ doubleToLongBits7 >>> 32)) * 31 + (int)(doubleToLongBits8 ^ doubleToLongBits8 >>> 32)) * 31 + (int)(doubleToLongBits9 ^ doubleToLongBits9 >>> 32);
    }
    
    @Override
    public final String toString() {
        if (this.equals(arkx.a)) {
            return "Rotate 0°";
        }
        if (this.equals(arkx.b)) {
            return "Rotate 90°";
        }
        if (this.equals(arkx.c)) {
            return "Rotate 180°";
        }
        if (this.equals(arkx.d)) {
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
