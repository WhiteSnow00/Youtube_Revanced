import java.security.spec.EllipticCurve;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Arrays;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdn implements afvk
{
    private final ECPublicKey a;
    private final String b;
    private final int c;
    
    public agdn(final ECPublicKey a, final int n, final int c) {
        if (aesy.ao(2)) {
            aety.F(a);
            this.b = aety.w(n);
            this.a = a;
            this.c = c;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }
    
    public final void a(byte[] array, final byte[] array2) {
        byte[] array3 = array;
        if (this.c == 1) {
            final EllipticCurve curve = this.a.getParams().getCurve();
            final int length = array.length;
            final int b = aety.B(curve);
            if (length != b + b) {
                throw new GeneralSecurityException("Invalid signature");
            }
            if ((length & 0x1) != 0x0 || length == 0 || length > 132) {
                throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
            }
            final int n = length >> 1;
            final byte[] j = aety.J(Arrays.copyOf(array, n));
            final byte[] i = aety.J(Arrays.copyOfRange(array, n, length));
            final int length2 = j.length;
            final int length3 = i.length;
            final int n2 = length2 + 4 + length3;
            int n3;
            if (n2 >= 128) {
                array = new byte[n2 + 3];
                array[0] = 48;
                array[1] = -127;
                array[2] = (byte)n2;
                n3 = 3;
            }
            else {
                array = new byte[n2 + 2];
                array[0] = 48;
                array[1] = (byte)n2;
                n3 = 2;
            }
            final int n4 = n3 + 1;
            array[n3] = 2;
            final int n5 = n4 + 1;
            array[n4] = (byte)length2;
            System.arraycopy(j, 0, array, n5, length2);
            final int n6 = n5 + length2;
            final int n7 = n6 + 1;
            array[n6] = 2;
            array[n7] = (byte)length3;
            System.arraycopy(i, 0, array, n7 + 1, length3);
            array3 = array;
        }
        Label_0331: {
            if (!aety.H(array3)) {
                break Label_0331;
            }
            final Signature signature = (Signature)agdz.c.a(this.b);
            signature.initVerify(this.a);
            signature.update(array2);
            try {
                if (signature.verify(array3)) {
                    return;
                }
                throw new GeneralSecurityException("Invalid signature");
                throw new GeneralSecurityException("Invalid signature");
            }
            catch (final RuntimeException ex) {
                throw new GeneralSecurityException("Invalid signature");
            }
        }
    }
}
