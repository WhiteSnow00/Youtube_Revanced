import libcore.io.Memory;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahfx extends ahfy
{
    public ahfx(final Unsafe unsafe) {
        super(unsafe);
    }
    
    public final byte a(final long n) {
        return Memory.peekByte(n);
    }
    
    public final double b(final Object o, final long n) {
        return Double.longBitsToDouble(this.l(o, n));
    }
    
    public final float c(final Object o, final long n) {
        return Float.intBitsToFloat(this.k(o, n));
    }
    
    public final void d(final long n, final byte[] array, final long n2, final long n3) {
        Memory.peekByteArray(n, array, (int)n2, (int)n3);
    }
    
    public final void e(final Object o, final long n, final boolean b) {
        if (ahfz.d) {
            ahfz.p(o, n, (byte)(byte)(b ? 1 : 0));
            return;
        }
        ahfz.q(o, n, (byte)(byte)(b ? 1 : 0));
    }
    
    public final void f(final Object o, final long n, final byte b) {
        if (ahfz.d) {
            ahfz.p(o, n, b);
            return;
        }
        ahfz.q(o, n, b);
    }
    
    public final void g(final Object o, final long n, final double n2) {
        this.p(o, n, Double.doubleToLongBits(n2));
    }
    
    public final void h(final Object o, final long n, final float n2) {
        this.o(o, n, Float.floatToIntBits(n2));
    }
    
    public final boolean i(final Object o, final long n) {
        if (ahfz.d) {
            return ahfz.y(o, n);
        }
        return ahfz.z(o, n);
    }
}
