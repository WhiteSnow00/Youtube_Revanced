// 
// Decompiled by Procyon v0.6.0
// 

public final class ajit extends vgs
{
    public final ahcr a;
    
    private ajit() {
        final ajix a = ajix.a;
        throw null;
    }
    
    public ajit(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.b(vgx);
    }
    
    public final ajiv b(final vgx vgx) {
        return new ajiv((ajix)this.a.build(), vgx);
    }
    
    public final void c(final aibu... array) {
        for (int i = 0; i <= 0; ++i) {
            final aibu aibu = array[i];
            final ahcr a = this.a;
            a.copyOnWrite();
            final ajix ajix = (ajix)a.instance;
            final ajix a2 = ajix.a;
            aibu.getClass();
            final ahdp u = ajix.u;
            if (!u.c()) {
                ajix.u = ahcz.mutableCopy(u);
            }
            ajix.u.add((Object)aibu);
        }
    }
    
    public final void d(final aowb v) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        v.getClass();
        ajix.v = v;
        ajix.c |= 0x20000;
    }
    
    public final void e(final String i) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        i.getClass();
        ajix.c |= 0x8;
        ajix.i = i;
    }
    
    public final void f(final Integer n) {
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        ajix.c |= 0x40;
        ajix.l = intValue;
    }
    
    public final void g(final ajiw e) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        e.getClass();
        ajix.e = e;
        ajix.d = 19;
    }
    
    public final void h(final String t) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        ajix.c |= 0x10000;
        ajix.t = t;
    }
    
    public final void i(final aowb e) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        e.getClass();
        ajix.e = e;
        ajix.d = 8;
    }
    
    public final void j(final String h) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        h.getClass();
        ajix.c |= 0x4;
        ajix.h = h;
    }
    
    public final void k(final Integer n) {
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        ajix.c |= 0x4000;
        ajix.r = intValue;
    }
    
    public final void l(final String g) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        g.getClass();
        ajix.c |= 0x2;
        ajix.g = g;
    }
    
    public final void m(final Integer n) {
        final ahcr a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        ajix.c |= 0x10;
        ajix.j = intValue;
    }
    
    public final void n(final String s) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final ajix ajix = (ajix)a.instance;
        final ajix a2 = ajix.a;
        s.getClass();
        ajix.c |= 0x8000;
        ajix.s = s;
    }
}
