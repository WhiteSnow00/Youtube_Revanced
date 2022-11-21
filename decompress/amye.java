// 
// Decompiled by Procyon v0.6.0
// 

public final class amye extends vgs
{
    public final ahcr a;
    
    private amye() {
        final amyh a = amyh.a;
        throw null;
    }
    
    public amye(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)new amyg((amyh)this.a.build(), vgx);
    }
    
    public final void b(final amyd amyd) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final amyh amyh = (amyh)a.instance;
        final amyh a2 = amyh.a;
        amyh.e = amyd.e;
        amyh.c |= 0x2;
    }
    
    public final void c(final Long n) {
        final ahcr a = this.a;
        final long longValue = n;
        a.copyOnWrite();
        final amyh amyh = (amyh)a.instance;
        final amyh a2 = amyh.a;
        amyh.c |= 0x4;
        amyh.f = longValue;
    }
    
    public final void d(final Long n) {
        final ahcr a = this.a;
        final long longValue = n;
        a.copyOnWrite();
        final amyh amyh = (amyh)a.instance;
        final amyh a2 = amyh.a;
        amyh.c |= 0x20;
        amyh.i = longValue;
    }
    
    public final void e(final amwh h) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final amyh amyh = (amyh)a.instance;
        final amyh a2 = amyh.a;
        h.getClass();
        amyh.h = h;
        amyh.c |= 0x10;
    }
    
    public final void f(final ahbt g) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final amyh amyh = (amyh)a.instance;
        final amyh a2 = amyh.a;
        amyh.c |= 0x8;
        amyh.g = g;
    }
    
    public final void g(final amwg j) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final amyh amyh = (amyh)a.instance;
        final amyh a2 = amyh.a;
        j.getClass();
        amyh.j = j;
        amyh.c |= 0x40;
    }
}
