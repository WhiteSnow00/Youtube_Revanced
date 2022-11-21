import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class adj extends ado
{
    public adj(final act act) {
        super(act);
    }
    
    private final void g(final adf adf) {
        this.i.j.add(adf);
        adf.k.add(this.i);
    }
    
    public final void b() {
        final act d = this.d;
        if (d instanceof acq) {
            final adf i = this.i;
            i.b = true;
            final acq acq = (acq)d;
            final int a = acq.a;
            final boolean b = acq.b;
            final int n = 0;
            final int n2 = 0;
            int j = 0;
            final int n3 = 0;
            if (a != 0) {
                if (a == 1) {
                    i.l = 5;
                    for (int k = n2; k < acq.as; ++k) {
                        final act act = acq.ar[k];
                        if (b || act.ah != 8) {
                            final adf l = act.h.j;
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
                    for (int n4 = n; n4 < acq.as; ++n4) {
                        final act act2 = acq.ar[n4];
                        if (b || act2.ah != 8) {
                            final adf m = act2.i.i;
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
                    for (int n5 = n3; n5 < acq.as; ++n5) {
                        final act act3 = acq.ar[n5];
                        if (b || act3.ah != 8) {
                            final adf j2 = act3.i.j;
                            j2.j.add(this.i);
                            this.i.k.add(j2);
                        }
                    }
                    this.g(this.d.i.i);
                    this.g(this.d.i.j);
                }
            }
            else {
                i.l = 4;
                while (j < acq.as) {
                    final act act4 = acq.ar[j];
                    if (b || act4.ah != 8) {
                        final adf i2 = act4.h.i;
                        i2.j.add(this.i);
                        this.i.k.add(i2);
                    }
                    ++j;
                }
                this.g(this.d.h.i);
                this.g(this.d.h.j);
            }
        }
    }
    
    public final void c() {
        final act d = this.d;
        if (d instanceof acq) {
            final int a = ((acq)d).a;
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
        final acq acq = (acq)this.d;
        final int a = acq.a;
        final Iterator iterator = this.i.k.iterator();
        int n = 0;
        int n2 = -1;
        while (iterator.hasNext()) {
            final int f = ((adf)iterator.next()).f;
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
            this.i.c(n + acq.c);
            return;
        }
        this.i.c(n2 + acq.c);
    }
}
