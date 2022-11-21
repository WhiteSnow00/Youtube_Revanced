import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class agaz implements afyi
{
    private final ahei a;
    
    public agaz(final ahei a, final byte[] array, final byte[] array2) {
        this.a = a;
        if (a.c()) {
            agcg.a.a();
            aewr.J(a);
        }
    }
    
    @Override
    public final byte[] a(final byte[] array, byte[] k) {
        try {
            k = aexq.K(new byte[][] { ((afyy)this.a.c).a(), ((afyi)((afyy)this.a.c).a).a(array, k) });
            final int c = ((afyy)this.a.c).c;
            final int length = array.length;
            return k;
        }
        catch (final GeneralSecurityException ex) {
            throw ex;
        }
    }
}
