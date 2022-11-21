import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbi implements afyk
{
    final ahei a;
    
    public agbi(final ahei a, final byte[] array, final byte[] array2) {
        this.a = a;
        if (a.c()) {
            agcg.a.a();
            aewr.J(a);
        }
    }
    
    @Override
    public final byte[] a(final byte[] array, byte[] k) {
        final Object c = this.a.c;
        if (c != null) {
            try {
                k = aexq.K(new byte[][] { ((afyy)c).a(), ((afyk)((afyy)this.a.c).a).a(array, k) });
                final int c2 = ((afyy)this.a.c).c;
                final int length = array.length;
                return k;
            }
            catch (final GeneralSecurityException ex) {
                throw ex;
            }
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
