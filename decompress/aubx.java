import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubx
{
    public static final aubx a;
    public static final aubx b;
    public static final aubx c;
    public static final aubx d;
    public static final aubx e;
    public int f;
    public boolean g;
    public boolean h;
    public byte i;
    byte[] j;
    public boolean k;
    
    static {
        (a = new aubx().a(0)).d();
        (b = new aubx().a(1)).d();
        (c = new aubx().a(2)).d();
        (d = new aubx()).k = true;
        final aubx a2 = new aubx().b().a(2);
        (e = a2).a(2);
        a2.a(1);
        a2.a(0);
    }
    
    private aubx() {
        this.f = 2;
    }
    
    private aubx(final aubx aubx) {
        this.f = aubx.f;
        this.g = aubx.g;
        this.h = aubx.h;
        this.i = 0;
        this.j = null;
    }
    
    public final aubx a(final int f) {
        final aubx aubx = new aubx(this);
        aubx.f = f;
        return aubx;
    }
    
    public final aubx b() {
        final aubx aubx = new aubx(this);
        aubx.h = true;
        return aubx;
    }
    
    public final aubx c() {
        if (!this.h) {
            return this.b();
        }
        return this;
    }
    
    public final void d() {
        new aubx(this).g = true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aubx) {
            final aubx aubx = (aubx)o;
            if (this.f == aubx.f && this.g == aubx.g && this.h == aubx.h) {
                final byte i = aubx.i;
                final byte[] j = aubx.j;
                if (Arrays.equals(null, (byte[])null) && this.k == aubx.k) {
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
