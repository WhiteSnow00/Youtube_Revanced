import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class adh extends adm
{
    public adh(final acr acr) {
        super(acr);
    }
    
    private final void g(final add add) {
        this.i.j.add(add);
        add.k.add(this.i);
    }
    
    public final void b() {
        final acr d = this.d;
        if (d instanceof aco) {
            final add i = this.i;
            i.b = true;
            final aco aco = (aco)d;
            final int a = aco.a;
            final boolean b = aco.b;
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            int j = 0;
            if (a != 0) {
                if (a == 1) {
                    i.l = 5;
                    for (int k = n2; k < aco.as; ++k) {
                        final acr acr = aco.ar[k];
                        if (b || acr.ah != 8) {
                            final add l = acr.h.j;
                            l.j.add(this.i);
                            this.i.k.add(l);
                        }
                    }
                    this.g(this.d.h.i);
                    this.g(this.d.h.j);
                    return;
                }
                if (a == 2) {
                    i.l = 6;
                    for (int n4 = n; n4 < aco.as; ++n4) {
                        final acr acr2 = aco.ar[n4];
                        if (b || acr2.ah != 8) {
                            final add m = acr2.i.i;
                            m.j.add(this.i);
                            this.i.k.add(m);
                        }
                    }
                    this.g(this.d.i.i);
                    this.g(this.d.i.j);
                    return;
                }
                if (a == 3) {
                    i.l = 7;
                    while (j < aco.as) {
                        final acr acr3 = aco.ar[j];
                        if (b || acr3.ah != 8) {
                            final add j2 = acr3.i.j;
                            j2.j.add(this.i);
                            this.i.k.add(j2);
                        }
                        ++j;
                    }
                    this.g(this.d.i.i);
                    this.g(this.d.i.j);
                }
            }
            else {
                i.l = 4;
                for (int n5 = n3; n5 < aco.as; ++n5) {
                    final acr acr4 = aco.ar[n5];
                    if (b || acr4.ah != 8) {
                        final add i2 = acr4.h.i;
                        i2.j.add(this.i);
                        this.i.k.add(i2);
                    }
                }
                this.g(this.d.h.i);
                this.g(this.d.h.j);
            }
        }
    }
    
    public final void c() {
        final acr d = this.d;
        if (d instanceof aco) {
            final int a = ((aco)d).a;
            if (a != 0 && a != 1) {
                d.aa = this.i.f;
                return;
            }
            d.Z = this.i.f;
        }
    }
    
    public final void d() {
        this.e = null;
        this.i.b();
    }
    
    public final boolean e() {
        return false;
    }
    
    public final void f() {
        final aco aco = (aco)this.d;
        final int a = aco.a;
        final Iterator iterator = this.i.k.iterator();
        int n = 0;
        int n2 = -1;
        while (iterator.hasNext()) {
            final int f = ((add)iterator.next()).f;
            int n3;
            if (n2 == -1 || f < (n3 = n2)) {
                n3 = f;
            }
            n2 = n3;
            if (n < f) {
                n = f;
                n2 = n3;
            }
        }
        if (a != 0 && a != 2) {
            this.i.c(n + aco.c);
            return;
        }
        this.i.c(n2 + aco.c);
    }
}
