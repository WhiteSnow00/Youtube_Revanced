// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjb extends vgs
{
    private final ahcr a;
    
    private ajjb() {
        final ajje a = ajje.a;
        throw null;
    }
    
    public ajjb(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.g();
    }
    
    public final void b(final String h) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajje ajje = (ajje)a.instance;
        final ajje a2 = ajje.a;
        ajje.c |= 0x10;
        ajje.h = h;
    }
    
    public final void c(final String g) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajje ajje = (ajje)a.instance;
        final ajje a2 = ajje.a;
        g.getClass();
        ajje.c |= 0x8;
        ajje.g = g;
    }
    
    public final void d(final Integer n) {
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajje ajje = (ajje)a.instance;
        final ajje a2 = ajje.a;
        ajje.c |= 0x20;
        ajje.i = intValue;
    }
    
    public final void e(final String e) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajje ajje = (ajje)a.instance;
        final ajje a2 = ajje.a;
        e.getClass();
        ajje.c |= 0x2;
        ajje.e = e;
    }
    
    public final void f(final Integer n) {
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajje ajje = (ajje)a.instance;
        final ajje a2 = ajje.a;
        ajje.c |= 0x4;
        ajje.f = intValue;
    }
    
    public final ajjd g() {
        return new ajjd((ajje)this.a.build());
    }
}
