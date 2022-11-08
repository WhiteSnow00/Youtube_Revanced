import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class afxh implements afup
{
    private final ahar a;
    
    public afxh(final ahar a, final byte[] array, final byte[] array2) {
        this.a = a;
        if (a.c()) {
            afyn.a.a();
            aesy.as(a);
        }
    }
    
    @Override
    public final byte[] a(final byte[] array, byte[] s) {
        try {
            s = aety.S(new byte[][] { ((afvg)this.a.c).a(), ((afup)((afvg)this.a.c).a).a(array, s) });
            final int c = ((afvg)this.a.c).c;
            final int length = array.length;
            return s;
        }
        catch (final GeneralSecurityException ex) {
            throw ex;
        }
    }
}
