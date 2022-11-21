// 
// Decompiled by Procyon v0.6.0
// 

public final class admx extends vnj
{
    public admx(final aefs aefs, final znz znz, final ahcr ahcr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, znz, "upload/register", (ahen)ahcr, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    protected final void c() {
        final ahcr ahcr = (ahcr)this.a();
        twd.n(((alep)ahcr.instance).d);
        final int ba = adzw.ba(((alep)ahcr.instance).e);
        boolean b = true;
        if (ba != 0) {
            if (ba == 1) {
                b = false;
            }
        }
        adme.K(b);
    }
    
    public final boolean p() {
        return false;
    }
}
