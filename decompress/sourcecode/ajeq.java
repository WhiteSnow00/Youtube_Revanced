// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeq extends vdj
{
    public final agza a;
    
    private ajeq() {
        final ajeu a = ajeu.a;
        throw null;
    }
    
    public ajeq(final agza a) {
        this.a = a;
    }
    
    public final ajes b(final vdo vdo) {
        return new ajes((ajeu)this.a.build(), vdo);
    }
    
    public final void c(final ahyd... array) {
        for (int i = 0; i <= 0; ++i) {
            final ahyd ahyd = array[i];
            final agza a = this.a;
            a.copyOnWrite();
            final ajeu ajeu = (ajeu)a.instance;
            final ajeu a2 = ajeu.a;
            ahyd.getClass();
            final agzy u = ajeu.u;
            if (!u.c()) {
                ajeu.u = agzi.mutableCopy(u);
            }
            ajeu.u.add((Object)ahyd);
        }
    }
    
    public final void d(final aorm v) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        v.getClass();
        ajeu.v = v;
        ajeu.c |= 0x20000;
    }
    
    public final void e(final String i) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        i.getClass();
        ajeu.c |= 0x8;
        ajeu.i = i;
    }
    
    public final void f(final Integer n) {
        final agza a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        ajeu.c |= 0x40;
        ajeu.l = intValue;
    }
    
    public final void g(final ajet e) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        e.getClass();
        ajeu.e = e;
        ajeu.d = 19;
    }
    
    public final void h(final String t) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        ajeu.c |= 0x10000;
        ajeu.t = t;
    }
    
    public final void i(final aorm e) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        e.getClass();
        ajeu.e = e;
        ajeu.d = 8;
    }
    
    public final void j(final String h) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        h.getClass();
        ajeu.c |= 0x4;
        ajeu.h = h;
    }
    
    public final void k(final Integer n) {
        final agza a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        ajeu.c |= 0x4000;
        ajeu.r = intValue;
    }
    
    public final void l(final String g) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        g.getClass();
        ajeu.c |= 0x2;
        ajeu.g = g;
    }
    
    public final void m(final Integer n) {
        final agza a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        ajeu.c |= 0x10;
        ajeu.j = intValue;
    }
    
    public final void n(final String s) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajeu ajeu = (ajeu)a.instance;
        final ajeu a2 = ajeu.a;
        s.getClass();
        ajeu.c |= 0x8000;
        ajeu.s = s;
    }
}
