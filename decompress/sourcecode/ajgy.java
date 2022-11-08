// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgy extends vdj
{
    public final agza a;
    
    private ajgy() {
        final ajhb a = ajhb.a;
        throw null;
    }
    
    public ajgy(final agza a) {
        this.a = a;
    }
    
    public final ajha b(final vdo vdo) {
        return new ajha((ajhb)this.a.build(), vdo);
    }
    
    public final void c(final String j) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        j.getClass();
        ajhb.c |= 0x40;
        ajhb.j = j;
    }
    
    public final void d(final String g) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        g.getClass();
        ajhb.c |= 0x8;
        ajhb.g = g;
    }
    
    public final void e(final Boolean b) {
        final agza a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        ajhb.c |= 0x200;
        ajhb.m = booleanValue;
    }
    
    public final void f(final Boolean b) {
        final agza a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        ajhb.c |= 0x400;
        ajhb.n = booleanValue;
    }
    
    public final void g(final Integer n) {
        final agza a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        ajhb.c |= 0x80;
        ajhb.k = intValue;
    }
    
    public final void h(final String q) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        ajhb.c |= 0x2000;
        ajhb.q = q;
    }
    
    public final void i(final aorm e) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        e.getClass();
        ajhb.e = e;
        ajhb.c |= 0x2;
    }
    
    public final void j(final String f) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        f.getClass();
        ajhb.c |= 0x4;
        ajhb.f = f;
    }
    
    public final void k(final String l) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        l.getClass();
        ajhb.c |= 0x100;
        ajhb.l = l;
    }
    
    public final void l(final Integer n) {
        final agza a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        ajhb.c |= 0x10;
        ajhb.h = intValue;
    }
    
    public final void m(final String p) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajhb ajhb = (ajhb)a.instance;
        final ajhb a2 = ajhb.a;
        p.getClass();
        ajhb.c |= 0x1000;
        ajhb.p = p;
    }
}
