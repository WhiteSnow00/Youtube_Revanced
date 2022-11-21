import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class agdj implements afyw
{
    private final ahei a;
    
    public agdj(final ahei a, final byte[] array, final byte[] array2) {
        this.a = a;
        if (a.c()) {
            agcg.a.a();
            aewr.J(a);
        }
    }
    
    @Override
    public final byte[] a(byte[] k) {
        byte[] i = k;
        if (((afyy)this.a.c).b.equals(agfn.c)) {
            i = aexq.K(new byte[][] { k, agdk.a });
        }
        try {
            k = aexq.K(new byte[][] { ((afyy)this.a.c).a(), ((afyw)((afyy)this.a.c).a).a(i) });
            final int c = ((afyy)this.a.c).c;
            return k;
        }
        catch (final GeneralSecurityException ex) {
            throw ex;
        }
    }
}
