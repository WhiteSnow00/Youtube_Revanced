import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubg
{
    public static final aubg a;
    public static final aubg b;
    public static final aubg c;
    public static final aubg d;
    public static final aubg e;
    public int f;
    public boolean g;
    public boolean h;
    public byte i;
    byte[] j;
    public boolean k;
    
    static {
        (a = new aubg().a(0)).d();
        (b = new aubg().a(1)).d();
        (c = new aubg().a(2)).d();
        (d = new aubg()).k = true;
        final aubg a2 = new aubg().b().a(2);
        (e = a2).a(2);
        a2.a(1);
        a2.a(0);
    }
    
    private aubg() {
        this.f = 2;
    }
    
    private aubg(final aubg aubg) {
        this.f = aubg.f;
        this.g = aubg.g;
        this.h = aubg.h;
        this.i = 0;
        this.j = null;
    }
    
    public final aubg a(final int f) {
        final aubg aubg = new aubg(this);
        aubg.f = f;
        return aubg;
    }
    
    public final aubg b() {
        final aubg aubg = new aubg(this);
        aubg.h = true;
        return aubg;
    }
    
    public final aubg c() {
        if (!this.h) {
            return this.b();
        }
        return this;
    }
    
    public final void d() {
        new aubg(this).g = true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aubg) {
            final aubg aubg = (aubg)o;
            if (this.f == aubg.f && this.g == aubg.g && this.h == aubg.h) {
                final byte i = aubg.i;
                final byte[] j = aubg.j;
                if (Arrays.equals(null, (byte[])null) && this.k == aubg.k) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.f + 1147) * 37 + ((this.g ^ true) ? 1 : 0)) * 37 + ((this.h ^ true) ? 1 : 0)) * 1369 + Arrays.hashCode((byte[])null)) * 37 + ((this.k ^ true) ? 1 : 0);
    }
}
