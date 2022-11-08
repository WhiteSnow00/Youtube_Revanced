import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxq implements afur
{
    final ahar a;
    
    public afxq(final ahar a, final byte[] array, final byte[] array2) {
        this.a = a;
        if (a.c()) {
            afyn.a.a();
            aesy.as(a);
        }
    }
    
    @Override
    public final byte[] a(final byte[] array, byte[] s) {
        final Object c = this.a.c;
        if (c != null) {
            try {
                s = aety.S(new byte[][] { ((afvg)c).a(), ((afur)((afvg)this.a.c).a).a(array, s) });
                final int c2 = ((afvg)this.a.c).c;
                final int length = array.length;
                return s;
            }
            catch (final GeneralSecurityException ex) {
                throw ex;
            }
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
