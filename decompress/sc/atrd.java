// 
// Decompiled by Procyon v0.6.0
// 

public final class atrd extends atwe
{
    public final atpn b;
    
    public atrd(final atmd atmd, final atly atly) {
        atmd.getClass();
        super(atmd, atly);
        this.b = aucl.j();
    }
    
    @Override
    protected final void d(final Object o) {
        final atpn b = this.b;
        do {
            final int a = b.a;
            if (a != 0) {
                if (a == 1) {
                    atvn.a(auac.d(this.e), aumt.n(o, this.e));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!this.b.a(0, 2));
    }
    
    @Override
    protected final void tO(final Object o) {
        this.d(o);
    }
}
