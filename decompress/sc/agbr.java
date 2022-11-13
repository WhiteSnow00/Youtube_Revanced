import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class agbr implements afxf
{
    private final ahcq a;
    
    public agbr(final ahcq a, final byte[] array, final byte[] array2) {
        this.a = a;
        if (a.c()) {
            agao.a.a();
            aeuz.X(a);
        }
    }
    
    public final byte[] a(byte[] t) {
        byte[] t2 = t;
        if (((afxh)this.a.c).b.equals(agdv.c)) {
            t2 = aevy.T(new byte[][] { t, agbs.a });
        }
        try {
            t = aevy.T(new byte[][] { ((afxh)this.a.c).a(), ((afxf)((afxh)this.a.c).a).a(t2) });
            final int c = ((afxh)this.a.c).c;
            return t;
        }
        catch (final GeneralSecurityException ex) {
            throw ex;
        }
    }
}
