// 
// Decompiled by Procyon v0.6.0
// 

public final class adg extends adm
{
    public adg(final acr acr) {
        super(acr);
        acr.h.d();
        acr.i.d();
        this.g = ((acu)acr).ar;
    }
    
    private final void g(final add add) {
        this.i.j.add(add);
        add.k.add(this.i);
    }
    
    public final void b() {
        final acr d = this.d;
        final acu acu = (acu)d;
        final int b = acu.b;
        final int c = acu.c;
        final float a = acu.a;
        if (acu.ar == 1) {
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
                final add i = this.i;
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
            final add j = this.i;
            j.b = true;
            j.k.add(d.U.i.j);
            this.d.U.i.j.j.add(this.i);
        }
        this.g(this.d.i.i);
        this.g(this.d.i.j);
    }
    
    public final void c() {
        final acr d = this.d;
        if (((acu)d).ar == 1) {
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
        final add i = this.i;
        if (!i.c) {
            return;
        }
        if (i.i) {
            return;
        }
        this.i.c((int)(((add)i.k.get(0)).f * ((acu)this.d).a + 0.5f));
    }
}
