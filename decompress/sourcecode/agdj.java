import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdj implements afum
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public agdj(final ahar b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        if (b.c()) {
            afyn.a.a();
            aesy.as(b);
        }
    }
    
    public agdj(final byte[] array, final int a) {
        this.a = a;
        if (aesy.ao(2)) {
            this.b = new afwt(array, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
    
    public agdj(final byte[] array, final int a, final byte[] array2) {
        this.a = a;
        this.b = new afww(array);
    }
    
    public agdj(final byte[] array, final int a, final char[] array2) {
        this.a = a;
        this.b = new afwz(array);
    }
    
    public final byte[] a(final byte[] array, byte[] array2) {
        final int a = this.a;
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    final ByteBuffer allocate = ByteBuffer.allocate(array.length + 40);
                    final byte[] a2 = agej.a(24);
                    allocate.put(a2);
                    ((afwx)this.b).b(allocate, a2, array, array2);
                    return allocate.array();
                }
                final ByteBuffer allocate2 = ByteBuffer.allocate(array.length + 28);
                final byte[] a3 = agej.a(12);
                allocate2.put(a3);
                ((afwx)this.b).b(allocate2, a3, array, array2);
                return allocate2.array();
            }
            else {
                try {
                    array2 = aety.S(new byte[][] { ((afvg)((ahar)this.b).c).a(), ((afum)((afvg)((ahar)this.b).c).a).a(array, array2) });
                    final int c = ((afvg)((ahar)this.b).c).c;
                    final int length = array.length;
                    return array2;
                }
                catch (final GeneralSecurityException ex) {
                    throw ex;
                }
            }
        }
        array2 = agej.a(12);
        return ((afwt)this.b).a(array2, array);
    }
}
