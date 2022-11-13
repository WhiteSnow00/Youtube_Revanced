import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbn implements agai
{
    public static final agbn a;
    
    static {
        a = new agbn();
    }
    
    private agbn() {
    }
    
    public final afwu a(final agau agau) {
        final int a = agbo.a;
        if (((agas)agau).a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                final agdc agdc = (agdc)ahbh.parseFrom((ahbh)agdc.a, ((agas)agau).c, ExtensionRegistryLite.a);
                if (agdc.b != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                final Integer value = agdc.d.d();
                agde agde;
                if ((agde = agdc.c) == null) {
                    agde = agde.a;
                }
                final Integer value2 = agde.c;
                agde agde2;
                if ((agde2 = agdc.c) == null) {
                    agde2 = agde.a;
                }
                int e;
                if ((e = aeuz.E(agde2.b)) == 0) {
                    e = 1;
                }
                final agdv a2 = agdv.a;
                final int n = e - 2;
                agbk agbk;
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 5) {
                                    final int d = aeuz.D(e);
                                    final StringBuilder sb = new StringBuilder("Unable to parse HashType: ");
                                    sb.append(d);
                                    throw new GeneralSecurityException(sb.toString());
                                }
                                agbk = agbk.b;
                            }
                            else {
                                agbk = agbk.e;
                            }
                        }
                        else {
                            agbk = agbk.c;
                        }
                    }
                    else {
                        agbk = agbk.d;
                    }
                }
                else {
                    agbk = agbk.a;
                }
                final agdv e2 = ((agas)agau).e;
                final int ordinal = e2.ordinal();
                agbl agbl;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                final int number = e2.getNumber();
                                final StringBuilder sb2 = new StringBuilder("Unable to parse OutputPrefixType: ");
                                sb2.append(number);
                                throw new GeneralSecurityException(sb2.toString());
                            }
                            agbl = agbl.b;
                        }
                        else {
                            agbl = agbl.d;
                        }
                    }
                    else {
                        agbl = agbl.c;
                    }
                }
                else {
                    agbl = agbl.a;
                }
                if (value < 16) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", value));
                }
                final int intValue = value2;
                if (intValue < 10) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", intValue));
                }
                if (agbk == agbk.a) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", intValue));
                    }
                }
                else if (agbk == agbk.b) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", intValue));
                    }
                }
                else if (agbk == agbk.c) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", intValue));
                    }
                }
                else if (agbk == agbk.d) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", intValue));
                    }
                }
                else {
                    if (agbk != agbk.e) {
                        throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                    }
                    if (intValue > 64) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", intValue));
                    }
                }
                final agbm agbm = new agbm(value, value2, agbl, agbk);
                final agnj z = agnj.Z(agdc.d.I());
                final Integer f = ((agas)agau).f;
                if (agbm.a != z.X()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if (agbm.aH() && f == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
                }
                if (!agbm.aH() && f != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
                }
                final agbl b = agbm.b;
                aggr aggr;
                if (b == agbl.d) {
                    aggr = aggr.a(new byte[0]);
                }
                else if (b != agbl.c && b != agbl.b) {
                    if (b != agbl.a) {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(b.e));
                    }
                    aggr = aggr.a(ByteBuffer.allocate(5).put((byte)1).putInt(f).array());
                }
                else {
                    aggr = aggr.a(ByteBuffer.allocate(5).put((byte)0).putInt(f).array());
                }
                return (afwu)new agbg(agbm, aggr);
            }
            catch (final ahca | IllegalArgumentException ex) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
    }
}
