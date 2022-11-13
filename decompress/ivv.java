// 
// Decompiled by Procyon v0.6.0
// 

public final class ivv implements abhp
{
    final Object a;
    private final int b;
    
    public ivv(final itt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivv(final ivw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivv(final izq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(final int n, final int n2, int b) {
        b = this.b;
        if (b == 0) {
            if (n != n2) {
                ((ivw)this.a).a();
            }
            return;
        }
        boolean b2 = false;
        if (b != 1) {
            if (n != n2) {
                ((izq)this.a).z(false);
            }
            return;
        }
        final Object a = this.a;
        if (n2 == 2) {
            b2 = true;
        }
        ((itt)a).b = b2;
    }
    
    public final void d(float u, final boolean b) {
        final int b2 = this.b;
        if (b2 != 0 && b2 != 1) {
            final Object a = this.a;
            u = aei.u(u, 1.0f);
            ((fpg)a).pr(1.0f - u);
        }
    }
}
