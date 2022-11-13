// 
// Decompiled by Procyon v0.6.0
// 

public final class adli extends vmc
{
    public adli(final aeea aeea, final zme zme, final ahaz ahaz, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aeea, zme, "upload/register", (ahcv)ahaz, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    protected final void c() {
        final ahaz ahaz = (ahaz)this.a();
        tvb.n(((alcp)ahaz.instance).d);
        final int bc = adyf.bc(((alcp)ahaz.instance).e);
        boolean b = true;
        if (bc != 0) {
            if (bc == 1) {
                b = false;
            }
        }
        adkp.H(b);
    }
    
    public final boolean p() {
        return false;
    }
}
