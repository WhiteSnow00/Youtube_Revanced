import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfk implements afwo
{
    private final int a;
    private final Object b;
    
    public agfk(final ahcq b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        if (b.c()) {
            agao.a.a();
            aeuz.X(b);
        }
    }
    
    public agfk(final byte[] array, final int a) {
        this.a = a;
        if (aeuz.T(2)) {
            this.b = new afyu(array, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
    
    public agfk(final byte[] array, final int a, final byte[] array2) {
        this.a = a;
        this.b = new afyx(array);
    }
    
    public agfk(final byte[] array, final int a, final char[] array2) {
        this.a = a;
        this.b = new afza(array);
    }
    
    public final byte[] a(final byte[] array, byte[] array2) {
        final int a = this.a;
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    final ByteBuffer allocate = ByteBuffer.allocate(array.length + 40);
                    final byte[] a2 = aggk.a(24);
                    allocate.put(a2);
                    ((afyy)this.b).b(allocate, a2, array, array2);
                    return allocate.array();
                }
                final ByteBuffer allocate2 = ByteBuffer.allocate(array.length + 28);
                final byte[] a3 = aggk.a(12);
                allocate2.put(a3);
                ((afyy)this.b).b(allocate2, a3, array, array2);
                return allocate2.array();
            }
            else {
                try {
                    array2 = aevy.T(new byte[][] { ((afxh)((ahcq)this.b).c).a(), ((afwo)((afxh)((ahcq)this.b).c).a).a(array, array2) });
                    final int c = ((afxh)((ahcq)this.b).c).c;
                    final int length = array.length;
                    return array2;
                }
                catch (final GeneralSecurityException ex) {
                    throw ex;
                }
            }
        }
        array2 = aggk.a(12);
        return ((afyu)this.b).a(array2, array);
    }
}
