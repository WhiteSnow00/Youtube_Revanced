// 
// Decompiled by Procyon v0.6.0
// 

public final class ajek extends vdj
{
    private final agza a;
    
    private ajek() {
        final ajen a = ajen.a;
        throw null;
    }
    
    public ajek(final agza a) {
        this.a = a;
    }
    
    public final ajem b(final vdo vdo) {
        return new ajem((ajen)this.a.build(), vdo);
    }
    
    public final void c(final Float n) {
        final agza a = this.a;
        final float floatValue = n;
        a.copyOnWrite();
        final ajen ajen = (ajen)a.instance;
        final ajen a2 = ajen.a;
        ajen.c |= 0x4;
        ajen.f = floatValue;
    }
    
    public final void d(final apka apka) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajen ajen = (ajen)a.instance;
        final ajen a2 = ajen.a;
        ajen.e = apka.k;
        ajen.c |= 0x2;
    }
    
    public final void e(final String h) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajen ajen = (ajen)a.instance;
        final ajen a2 = ajen.a;
        h.getClass();
        ajen.c |= 0x10;
        ajen.h = h;
    }
    
    public final void f(final Boolean b) {
        final agza a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajen ajen = (ajen)a.instance;
        final ajen a2 = ajen.a;
        ajen.c |= 0x80;
        ajen.k = booleanValue;
    }
    
    public final void g(final Boolean b) {
        final agza a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajen ajen = (ajen)a.instance;
        final ajen a2 = ajen.a;
        ajen.c |= 0x20;
        ajen.i = booleanValue;
    }
    
    public final void h(final amrx n) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajen ajen = (ajen)a.instance;
        final ajen a2 = ajen.a;
        ajen.n = n;
        ajen.c |= 0x400;
    }
    
    public final void i(final Float n) {
        final agza a = this.a;
        final float floatValue = n;
        a.copyOnWrite();
        final ajen ajen = (ajen)a.instance;
        final ajen a2 = ajen.a;
        ajen.c |= 0x8;
        ajen.g = floatValue;
    }
    
    public final void j(final Boolean b) {
        final agza a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajen ajen = (ajen)a.instance;
        final ajen a2 = ajen.a;
        ajen.c |= 0x40;
        ajen.j = booleanValue;
    }
}
