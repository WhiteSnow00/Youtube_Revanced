// 
// Decompiled by Procyon v0.6.0
// 

final class jsv extends hw
{
    private final jsx a;
    private final aciw b;
    
    public jsv(final jsx a, final aciw b) {
        this.a = a;
        this.b = b;
        this.i();
    }
    
    private final void i() {
        if (this.b.a() > 0) {
            final jsx a = this.a;
            a.d.setVisibility(0);
            a.n();
            if (a.a == null) {
                a.a = new jsw(a);
                a.c.N.aE((iw)a.a);
            }
        }
        else {
            final jsx a2 = this.a;
            a2.d.setVisibility(8);
            a2.j();
            final jsw a3 = a2.a;
            if (a3 != null) {
                a2.c.N.aH((iw)a3);
                a2.a = null;
            }
        }
    }
    
    public final void c() {
        this.i();
    }
    
    public final void d(final int n, final int n2) {
        this.i();
    }
    
    public final void f(final int n, final int n2) {
        this.i();
    }
    
    public final void g(final int n, final int n2) {
        this.i();
    }
    
    public final void h(final int n, final int n2) {
        this.i();
    }
}
