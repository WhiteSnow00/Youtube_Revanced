// 
// Decompiled by Procyon v0.6.0
// 

public final class amck extends vgs
{
    public final ahct a;
    
    private amck() {
        final amcn a = amcn.a;
        throw null;
    }
    
    public amck(final ahct a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.b(vgx);
    }
    
    public final amcm b(final vgx vgx) {
        return new amcm((amcn)((ahcr)this.a).build(), vgx);
    }
    
    public final void c(final Long n) {
        final ahct a = this.a;
        final long longValue = n;
        ((ahcr)a).copyOnWrite();
        final amcn amcn = (amcn)a.instance;
        final amcn a2 = amcn.a;
        amcn.c |= 0x8;
        amcn.f = longValue;
    }
    
    public final void d(final String e) {
        final ahct a = this.a;
        ((ahcr)a).copyOnWrite();
        final amcn amcn = (amcn)a.instance;
        final amcn a2 = amcn.a;
        e.getClass();
        amcn.c |= 0x4;
        amcn.e = e;
    }
    
    public final void e(final Boolean b) {
        final ahct a = this.a;
        final boolean booleanValue = b;
        ((ahcr)a).copyOnWrite();
        final amcn amcn = (amcn)a.instance;
        final amcn a2 = amcn.a;
        amcn.c |= 0x10;
        amcn.h = booleanValue;
    }
}
