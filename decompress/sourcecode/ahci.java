import java.lang.reflect.Field;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ahci
{
    final Unsafe a;
    
    public ahci(final Unsafe a) {
        this.a = a;
    }
    
    public abstract byte a(final long p0);
    
    public abstract double b(final Object p0, final long p1);
    
    public abstract float c(final Object p0, final long p1);
    
    public abstract void d(final long p0, final byte[] p1, final long p2, final long p3);
    
    public abstract void e(final Object p0, final long p1, final boolean p2);
    
    public abstract void f(final Object p0, final long p1, final byte p2);
    
    public abstract void g(final Object p0, final long p1, final double p2);
    
    public abstract void h(final Object p0, final long p1, final float p2);
    
    public abstract boolean i(final Object p0, final long p1);
    
    public final int j(final Class clazz) {
        return this.a.arrayBaseOffset(clazz);
    }
    
    public final int k(final Object o, final long n) {
        return this.a.getInt(o, n);
    }
    
    public final long l(final Object o, final long n) {
        return this.a.getLong(o, n);
    }
    
    public final long m(final Field field) {
        return this.a.objectFieldOffset(field);
    }
    
    public final Object n(final Object o, final long n) {
        return this.a.getObject(o, n);
    }
    
    public final void o(final Object o, final long n, final int n2) {
        this.a.putInt(o, n, n2);
    }
    
    public final void p(final Object o, final long n, final long n2) {
        this.a.putLong(o, n, n2);
    }
    
    public final void q(final Object o, final long n, final Object o2) {
        this.a.putObject(o, n, o2);
    }
    
    public final void r(final Class clazz) {
        this.a.arrayIndexScale(clazz);
    }
}
