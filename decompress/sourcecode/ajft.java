// 
// Decompiled by Procyon v0.6.0
// 

public final class ajft extends vdj
{
    private final agza a;
    
    private ajft() {
        final ajfx a = ajfx.a;
        throw null;
    }
    
    public ajft(final agza a) {
        this.a = a;
    }
    
    public final ajfv b(final vdo vdo) {
        return new ajfv((ajfx)this.a.build(), vdo);
    }
    
    public final void c(final String l) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        l.getClass();
        ajfx.c |= 0x100;
        ajfx.l = l;
    }
    
    public final void d(final String i) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        i.getClass();
        ajfx.c |= 0x8;
        ajfx.i = i;
    }
    
    public final void e(final String o) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        o.getClass();
        ajfx.c |= 0x800;
        ajfx.o = o;
    }
    
    public final void f(final ajfw e) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        e.getClass();
        ajfx.e = e;
        ajfx.d = 7;
    }
    
    public final void g(final String g) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        g.getClass();
        ajfx.c |= 0x2;
        ajfx.g = g;
    }
    
    public final void h(final aorm e) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        e.getClass();
        ajfx.e = e;
        ajfx.d = 6;
    }
    
    public final void i(final String h) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        h.getClass();
        ajfx.c |= 0x4;
        ajfx.h = h;
    }
    
    public final void j(final Integer n) {
        final agza a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        ajfx.c |= 0x400;
        ajfx.n = intValue;
    }
    
    public final void k(final Integer n) {
        final agza a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        ajfx.c |= 0x20;
        ajfx.k = intValue;
    }
    
    public final void l(final String j) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfx ajfx = (ajfx)a.instance;
        final ajfx a2 = ajfx.a;
        j.getClass();
        ajfx.c |= 0x10;
        ajfx.j = j;
    }
}
