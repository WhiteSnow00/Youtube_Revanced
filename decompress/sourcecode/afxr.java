import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxr implements agdo
{
    public final String a;
    public final int b;
    public agag c;
    public afzy d;
    public int e;
    public agak f;
    
    public afxr(final agbk agbk) {
        final String b = agbk.b;
        this.a = b;
        if (b.equals(afvn.b)) {
            try {
                final agah agah = (agah)agzi.parseFrom(agah.a, agbk.c, ExtensionRegistryLite.a);
                this.c = (agag)afvl.c(agbk);
                this.b = agah.b;
                return;
            }
            catch (final ahab ahab) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", (Throwable)ahab);
            }
        }
        if (b.equals(afvn.a)) {
            try {
                final afzz afzz = (afzz)agzi.parseFrom(afzz.a, agbk.c, ExtensionRegistryLite.a);
                this.d = (afzy)afvl.c(agbk);
                agab agab;
                if ((agab = afzz.b) == null) {
                    agab = agab.a;
                }
                this.e = agab.c;
                agbc agbc;
                if ((agbc = afzz.c) == null) {
                    agbc = agbc.a;
                }
                this.b = this.e + agbc.c;
                return;
            }
            catch (final ahab ahab2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", (Throwable)ahab2);
            }
        }
        if (b.equals(afxg.a)) {
            try {
                final agal agal = (agal)agzi.parseFrom(agal.a, agbk.c, ExtensionRegistryLite.a);
                this.f = (agak)afvl.c(agbk);
                this.b = agal.b;
                return;
            }
            catch (final ahab ahab3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", (Throwable)ahab3);
            }
        }
        throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(b)));
    }
}
