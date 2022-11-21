import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agcw implements agca
{
    public static final agcw a;
    
    static {
        a = new agcw();
    }
    
    private agcw() {
    }
    
    public final afyl a(final agcm agcm) {
        final int a = agcx.a;
        if (((agck)agcm).a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                final agdo agdo = (agdo)ahcz.parseFrom((ahcz)agdo.a, ((agck)agcm).c, ExtensionRegistryLite.a);
                if (agdo.b != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                final int d = agdo.c.d();
                if (d != 16 && d != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", d * 8));
                }
                agdq agdq;
                if ((agdq = agdo.d) == null) {
                    agdq = agdq.a;
                }
                final int b = agdq.b;
                if (b < 10 || b > 16) {
                    final StringBuilder sb = new StringBuilder("Invalid tag size for AesCmacParameters: ");
                    sb.append(b);
                    throw new GeneralSecurityException(sb.toString());
                }
                final agfn e = ((agck)agcm).e;
                final agfn a2 = agfn.a;
                final int ordinal = e.ordinal();
                agcu agcu;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                final int number = e.getNumber();
                                final StringBuilder sb2 = new StringBuilder("Unable to parse OutputPrefixType: ");
                                sb2.append(number);
                                throw new GeneralSecurityException(sb2.toString());
                            }
                            agcu = agcu.b;
                        }
                        else {
                            agcu = agcu.d;
                        }
                    }
                    else {
                        agcu = agcu.c;
                    }
                }
                else {
                    agcu = agcu.a;
                }
                final agcv agcv = new agcv(d, b, agcu);
                final agpb z = agpb.z(agdo.c.I());
                final Integer f = ((agck)agcm).f;
                if (agcv.a != z.x()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if (agcv.au() && f == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
                }
                if (!agcv.au() && f != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
                }
                final agcu b2 = agcv.b;
                agij agij;
                if (b2 == agcu.d) {
                    agij = agij.a(new byte[0]);
                }
                else if (b2 != agcu.c && b2 != agcu.b) {
                    if (b2 != agcu.a) {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(b2.e));
                    }
                    agij = agij.a(ByteBuffer.allocate(5).put((byte)1).putInt(f).array());
                }
                else {
                    agij = agij.a(ByteBuffer.allocate(5).put((byte)0).putInt(f).array());
                }
                return (afyl)new agcq(agcv, agij);
            }
            catch (final ahds | IllegalArgumentException ex) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    }
}
