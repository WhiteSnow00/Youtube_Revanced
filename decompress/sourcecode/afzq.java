import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzq implements afve
{
    private final ahar a;
    
    public afzq(final ahar a, final byte[] array, final byte[] array2) {
        this.a = a;
        if (a.c()) {
            afyn.a.a();
            aesy.as(a);
        }
    }
    
    public final byte[] a(byte[] s) {
        byte[] s2 = s;
        if (((afvg)this.a.c).b.equals(agbu.c)) {
            s2 = aety.S(new byte[][] { s, afzr.a });
        }
        try {
            s = aety.S(new byte[][] { ((afvg)this.a.c).a(), ((afve)((afvg)this.a.c).a).a(s2) });
            final int c = ((afvg)this.a.c).c;
            return s;
        }
        catch (final GeneralSecurityException ex) {
            throw ex;
        }
    }
}
