import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbj implements aghh
{
    public final String a;
    public final int b;
    public agdz c;
    public agdr d;
    public int e;
    public aged f;
    
    public agbj(final agfd agfd) {
        final String b = agfd.b;
        this.a = b;
        if (b.equals(afzf.b)) {
            try {
                final agea agea = (agea)ahcz.parseFrom((ahcz)agea.a, agfd.c, ExtensionRegistryLite.a);
                this.c = (agdz)afzd.c(agfd);
                this.b = agea.b;
                return;
            }
            catch (final ahds ahds) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", (Throwable)ahds);
            }
        }
        if (b.equals(afzf.a)) {
            try {
                final agds agds = (agds)ahcz.parseFrom((ahcz)agds.a, agfd.c, ExtensionRegistryLite.a);
                this.d = (agdr)afzd.c(agfd);
                agdu agdu;
                if ((agdu = agds.b) == null) {
                    agdu = agdu.a;
                }
                this.e = agdu.c;
                agev agev;
                if ((agev = agds.c) == null) {
                    agev = agev.a;
                }
                this.b = this.e + agev.c;
                return;
            }
            catch (final ahds ahds2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", (Throwable)ahds2);
            }
        }
        if (b.equals(agay.a)) {
            try {
                final agee agee = (agee)ahcz.parseFrom((ahcz)agee.a, agfd.c, ExtensionRegistryLite.a);
                this.f = (aged)afzd.c(agfd);
                this.b = agee.b;
                return;
            }
            catch (final ahds ahds3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", (Throwable)ahds3);
            }
        }
        throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(b)));
    }
}
