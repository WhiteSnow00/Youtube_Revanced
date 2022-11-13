// 
// Decompiled by Procyon v0.6.0
// 

public final class amak extends vfk
{
    public final ahbb a;
    
    private amak() {
        final aman a = aman.a;
        throw null;
    }
    
    public amak(final ahbb a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.b(vfp);
    }
    
    public final amam b(final vfp vfp) {
        return new amam((aman)((ahaz)this.a).build(), vfp);
    }
    
    public final void c(final Long n) {
        final ahbb a = this.a;
        final long longValue = n;
        ((ahaz)a).copyOnWrite();
        final aman aman = (aman)a.instance;
        final aman a2 = aman.a;
        aman.c |= 0x8;
        aman.f = longValue;
    }
    
    public final void d(final String e) {
        final ahbb a = this.a;
        ((ahaz)a).copyOnWrite();
        final aman aman = (aman)a.instance;
        final aman a2 = aman.a;
        e.getClass();
        aman.c |= 0x4;
        aman.e = e;
    }
    
    public final void e(final Boolean b) {
        final ahbb a = this.a;
        final boolean booleanValue = b;
        ((ahaz)a).copyOnWrite();
        final aman aman = (aman)a.instance;
        final aman a2 = aman.a;
        aman.c |= 0x10;
        aman.h = booleanValue;
    }
}
