// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjw extends vgs
{
    private final ahcr a;
    
    private ajjw() {
        final ajka a = ajka.a;
        throw null;
    }
    
    public ajjw(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.b(vgx);
    }
    
    public final ajjy b(final vgx vgx) {
        return new ajjy((ajka)this.a.build(), vgx);
    }
    
    public final void c(final String l) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        l.getClass();
        ajka.c |= 0x100;
        ajka.l = l;
    }
    
    public final void d(final String i) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        i.getClass();
        ajka.c |= 0x8;
        ajka.i = i;
    }
    
    public final void e(final String o) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        o.getClass();
        ajka.c |= 0x800;
        ajka.o = o;
    }
    
    public final void f(final ajjz e) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        e.getClass();
        ajka.e = e;
        ajka.d = 7;
    }
    
    public final void g(final String g) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        g.getClass();
        ajka.c |= 0x2;
        ajka.g = g;
    }
    
    public final void h(final aowb e) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        e.getClass();
        ajka.e = e;
        ajka.d = 6;
    }
    
    public final void i(final String h) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        h.getClass();
        ajka.c |= 0x4;
        ajka.h = h;
    }
    
    public final void j(final Integer n) {
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        ajka.c |= 0x400;
        ajka.n = intValue;
    }
    
    public final void k(final Integer n) {
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        ajka.c |= 0x20;
        ajka.k = intValue;
    }
    
    public final void l(final String j) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajka ajka = (ajka)a.instance;
        final ajka a2 = ajka.a;
        j.getClass();
        ajka.c |= 0x10;
        ajka.j = j;
    }
}
