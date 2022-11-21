// 
// Decompiled by Procyon v0.6.0
// 

public final class ajin extends vgs
{
    private final ahcr a;
    
    private ajin() {
        final ajiq a = ajiq.a;
        throw null;
    }
    
    public ajin(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.b(vgx);
    }
    
    public final ajip b(final vgx vgx) {
        return new ajip((ajiq)this.a.build(), vgx);
    }
    
    public final void c(final Float n) {
        final ahcr a = this.a;
        final float floatValue = n;
        a.copyOnWrite();
        final ajiq ajiq = (ajiq)a.instance;
        final ajiq a2 = ajiq.a;
        ajiq.c |= 0x4;
        ajiq.f = floatValue;
    }
    
    public final void d(final apoq apoq) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajiq ajiq = (ajiq)a.instance;
        final ajiq a2 = ajiq.a;
        ajiq.e = apoq.k;
        ajiq.c |= 0x2;
    }
    
    public final void e(final String h) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajiq ajiq = (ajiq)a.instance;
        final ajiq a2 = ajiq.a;
        h.getClass();
        ajiq.c |= 0x10;
        ajiq.h = h;
    }
    
    public final void f(final Boolean b) {
        final ahcr a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajiq ajiq = (ajiq)a.instance;
        final ajiq a2 = ajiq.a;
        ajiq.c |= 0x80;
        ajiq.k = booleanValue;
    }
    
    public final void g(final Boolean b) {
        final ahcr a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajiq ajiq = (ajiq)a.instance;
        final ajiq a2 = ajiq.a;
        ajiq.c |= 0x20;
        ajiq.i = booleanValue;
    }
    
    public final void h(final amwg n) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajiq ajiq = (ajiq)a.instance;
        final ajiq a2 = ajiq.a;
        ajiq.n = n;
        ajiq.c |= 0x400;
    }
    
    public final void i(final Float n) {
        final ahcr a = this.a;
        final float floatValue = n;
        a.copyOnWrite();
        final ajiq ajiq = (ajiq)a.instance;
        final ajiq a2 = ajiq.a;
        ajiq.c |= 0x8;
        ajiq.g = floatValue;
    }
    
    public final void j(final Boolean b) {
        final ahcr a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajiq ajiq = (ajiq)a.instance;
        final ajiq a2 = ajiq.a;
        ajiq.c |= 0x40;
        ajiq.j = booleanValue;
    }
}
