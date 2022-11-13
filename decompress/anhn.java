// 
// Decompiled by Procyon v0.6.0
// 

public final class anhn extends vfk
{
    private final ahaz a;
    
    private anhn() {
        final anhq a = anhq.a;
        throw null;
    }
    
    public anhn(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.f();
    }
    
    public final void b(final Long n) {
        final ahaz a = this.a;
        final long longValue = n;
        a.copyOnWrite();
        final anhq anhq = (anhq)a.instance;
        final anhq a2 = anhq.a;
        anhq.c |= 0x10;
        anhq.h = longValue;
    }
    
    public final void c(final Boolean b) {
        final ahaz a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final anhq anhq = (anhq)a.instance;
        final anhq a2 = anhq.a;
        anhq.c |= 0x2;
        anhq.e = booleanValue;
    }
    
    public final void d(final Long n) {
        final ahaz a = this.a;
        final long longValue = n;
        a.copyOnWrite();
        final anhq anhq = (anhq)a.instance;
        final anhq a2 = anhq.a;
        anhq.c |= 0x8;
        anhq.g = longValue;
    }
    
    public final void e(final Long n) {
        final ahaz a = this.a;
        final long longValue = n;
        a.copyOnWrite();
        final anhq anhq = (anhq)a.instance;
        final anhq a2 = anhq.a;
        anhq.c |= 0x4;
        anhq.f = longValue;
    }
    
    public final anhp f() {
        return new anhp((anhq)this.a.build());
    }
}
