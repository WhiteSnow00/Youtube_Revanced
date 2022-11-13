// 
// Decompiled by Procyon v0.6.0
// 

public final class fum extends acav
{
    private final amgs a;
    
    public fum(final amgs a, final vcy vcy, final aeea aeea, final Object o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(vcy, aeea, o, (String)null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        a.getClass();
        this.a = a;
    }
    
    protected final void a(final int n) {
        final amgp amgp = (amgp)this.a.c.get(n);
        if (this.a.c.size() > n) {
            if (vyg.e(amgp) != null) {
                super.h.c(vyg.e(amgp), this.d());
            }
            else if (vyg.d(amgp) != null) {
                super.h.c(vyg.d(amgp), this.d());
            }
            this.i(4);
        }
    }
}
