// 
// Decompiled by Procyon v0.6.0
// 

final class bva extends btq
{
    private final long a;
    
    public bva(final btk btk, final long a) {
        super(btk);
        dk.f(((btd)btk).c >= a);
        this.a = a;
    }
    
    public final long d() {
        return super.d() - this.a;
    }
    
    public final long e() {
        return super.e() - this.a;
    }
    
    public final long f() {
        return super.f() - this.a;
    }
}
