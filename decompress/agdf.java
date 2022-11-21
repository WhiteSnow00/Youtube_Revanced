import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdf implements agca
{
    public static final agdf a;
    
    static {
        a = new agdf();
    }
    
    private agdf() {
    }
    
    public final afyl a(final agcm agcm) {
        final int a = agdg.a;
        if (((agck)agcm).a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                final ageu ageu = (ageu)ahcz.parseFrom((ahcz)ageu.a, ((agck)agcm).c, ExtensionRegistryLite.a);
                if (ageu.b != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                final Integer value = ageu.d.d();
                agew agew;
                if ((agew = ageu.c) == null) {
                    agew = agew.a;
                }
                final Integer value2 = agew.c;
                agew agew2;
                if ((agew2 = ageu.c) == null) {
                    agew2 = agew.a;
                }
                int z;
                if ((z = aexq.Z(agew2.b)) == 0) {
                    z = 1;
                }
                final agfn a2 = agfn.a;
                final int n = z - 2;
                agdc agdc;
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 5) {
                                    final int y = aexq.Y(z);
                                    final StringBuilder sb = new StringBuilder("Unable to parse HashType: ");
                                    sb.append(y);
                                    throw new GeneralSecurityException(sb.toString());
                                }
                                agdc = agdc.b;
                            }
                            else {
                                agdc = agdc.e;
                            }
                        }
                        else {
                            agdc = agdc.c;
                        }
                    }
                    else {
                        agdc = agdc.d;
                    }
                }
                else {
                    agdc = agdc.a;
                }
                final agfn e = ((agck)agcm).e;
                final int ordinal = e.ordinal();
                agdd agdd;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                final int number = e.getNumber();
                                final StringBuilder sb2 = new StringBuilder("Unable to parse OutputPrefixType: ");
                                sb2.append(number);
                                throw new GeneralSecurityException(sb2.toString());
                            }
                            agdd = agdd.b;
                        }
                        else {
                            agdd = agdd.d;
                        }
                    }
                    else {
                        agdd = agdd.c;
                    }
                }
                else {
                    agdd = agdd.a;
                }
                if (value < 16) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", value));
                }
                final int intValue = value2;
                if (intValue < 10) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", intValue));
                }
                if (agdc == agdc.a) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", intValue));
                    }
                }
                else if (agdc == agdc.b) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", intValue));
                    }
                }
                else if (agdc == agdc.c) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", intValue));
                    }
                }
                else if (agdc == agdc.d) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", intValue));
                    }
                }
                else {
                    if (agdc != agdc.e) {
                        throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                    }
                    if (intValue > 64) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", intValue));
                    }
                }
                final agde agde = new agde(value, value2, agdd, agdc);
                final agpb z2 = agpb.z(ageu.d.I());
                final Integer f = ((agck)agcm).f;
                if (agde.a != z2.x()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if (agde.au() && f == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
                }
                if (!agde.au() && f != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
                }
                final agdd b = agde.b;
                agij agij;
                if (b == agdd.d) {
                    agij = agij.a(new byte[0]);
                }
                else if (b != agdd.c && b != agdd.b) {
                    if (b != agdd.a) {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(b.e));
                    }
                    agij = agij.a(ByteBuffer.allocate(5).put((byte)1).putInt(f).array());
                }
                else {
                    agij = agij.a(ByteBuffer.allocate(5).put((byte)0).putInt(f).array());
                }
                return (afyl)new agcy(agde, agij);
            }
            catch (final ahds | IllegalArgumentException ex) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
    }
}
