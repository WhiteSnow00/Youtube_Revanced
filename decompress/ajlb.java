// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlb extends vgs
{
    public final ahcr a;
    
    private ajlb() {
        final ajle a = ajle.a;
        throw null;
    }
    
    public ajlb(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.b(vgx);
    }
    
    public final ajld b(final vgx vgx) {
        return new ajld((ajle)this.a.build(), vgx);
    }
    
    public final void c(final String j) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        j.getClass();
        ajle.c |= 0x40;
        ajle.j = j;
    }
    
    public final void d(final String g) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        g.getClass();
        ajle.c |= 0x8;
        ajle.g = g;
    }
    
    public final void e(final Boolean b) {
        final ahcr a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        ajle.c |= 0x200;
        ajle.m = booleanValue;
    }
    
    public final void f(final Boolean b) {
        final ahcr a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        ajle.c |= 0x400;
        ajle.n = booleanValue;
    }
    
    public final void g(final Integer n) {
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        ajle.c |= 0x80;
        ajle.k = intValue;
    }
    
    public final void h(final String q) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        ajle.c |= 0x2000;
        ajle.q = q;
    }
    
    public final void i(final aowb e) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        e.getClass();
        ajle.e = e;
        ajle.c |= 0x2;
    }
    
    public final void j(final String f) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        f.getClass();
        ajle.c |= 0x4;
        ajle.f = f;
    }
    
    public final void k(final String l) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        l.getClass();
        ajle.c |= 0x100;
        ajle.l = l;
    }
    
    public final void l(final Integer n) {
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        ajle.c |= 0x10;
        ajle.h = intValue;
    }
    
    public final void m(final String p) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajle ajle = (ajle)a.instance;
        final ajle a2 = ajle.a;
        p.getClass();
        ajle.c |= 0x1000;
        ajle.p = p;
    }
}
