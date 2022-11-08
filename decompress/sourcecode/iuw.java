// 
// Decompiled by Procyon v0.6.0
// 

public final class iuw implements abfu
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public iuw(final isu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iuw(final iux a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iuw(final iyr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final int n, final int n2, int b) {
        b = this.b;
        if (b == 0) {
            if (n != n2) {
                ((iux)this.a).a();
            }
            return;
        }
        boolean b2 = false;
        if (b != 1) {
            if (n != n2) {
                ((iyr)this.a).z(false);
            }
            return;
        }
        final Object a = this.a;
        if (n2 == 2) {
            b2 = true;
        }
        ((isu)a).b = b2;
    }
    
    @Override
    public final void d(final float n, final boolean b) {
        final int b2 = this.b;
        if (b2 != 0 && b2 != 1) {
            ((fpb)this.a).q(1.0f - aeh.u(n, 1.0f));
        }
    }
}
