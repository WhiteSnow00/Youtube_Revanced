// 
// Decompiled by Procyon v0.6.0
// 

public final class adi extends ado
{
    public adi(final act act) {
        super(act);
        act.h.d();
        act.i.d();
        this.g = ((acw)act).ar;
    }
    
    private final void g(final adf adf) {
        this.i.j.add(adf);
        adf.k.add(this.i);
    }
    
    public final void b() {
        final act d = this.d;
        final acw acw = (acw)d;
        final int b = acw.b;
        final int c = acw.c;
        final float a = acw.a;
        if (acw.ar == 1) {
            if (b != -1) {
                this.i.k.add(d.U.h.i);
                this.d.U.h.i.j.add(this.i);
                this.i.e = b;
            }
            else if (c != -1) {
                this.i.k.add(d.U.h.j);
                this.d.U.h.j.j.add(this.i);
                this.i.e = -c;
            }
            else {
                final adf i = this.i;
                i.b = true;
                i.k.add(d.U.h.j);
                this.d.U.h.j.j.add(this.i);
            }
            this.g(this.d.h.i);
            this.g(this.d.h.j);
            return;
        }
        if (b != -1) {
            this.i.k.add(d.U.i.i);
            this.d.U.i.i.j.add(this.i);
            this.i.e = b;
        }
        else if (c != -1) {
            this.i.k.add(d.U.i.j);
            this.d.U.i.j.j.add(this.i);
            this.i.e = -c;
        }
        else {
            final adf j = this.i;
            j.b = true;
            j.k.add(d.U.i.j);
            this.d.U.i.j.j.add(this.i);
        }
        this.g(this.d.i.i);
        this.g(this.d.i.j);
    }
    
    public final void c() {
        final act d = this.d;
        if (((acw)d).ar == 1) {
            d.Z = this.i.f;
            return;
        }
        d.aa = this.i.f;
    }
    
    public final void d() {
        this.i.b();
    }
    
    public final boolean e() {
        return false;
    }
    
    public final void f() {
        final adf i = this.i;
        if (!i.c) {
            return;
        }
        if (i.i) {
            return;
        }
        this.i.c((int)(((adf)i.k.get(0)).f * ((acw)this.d).a + 0.5f));
    }
}
