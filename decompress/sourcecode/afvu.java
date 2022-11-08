import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvu extends afyj
{
    public afvu() {
        super(agaa.class, new afyp[] { new afvs(aged.class) });
    }
    
    public static final void g(final agac agac) {
        final int b = agac.b;
        if (b >= 12 && b <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
    
    public static final void h(final agaa agaa) {
        agep.d(agaa.b);
        agep.a(agaa.d.d());
        agac agac;
        if ((agac = agaa.c) == null) {
            agac = agac.a;
        }
        g(agac);
    }
    
    @Override
    public final afyi a() {
        return new afvt(agab.class);
    }
    
    @Override
    public final agbi b() {
        return agbi.b;
    }
    
    @Override
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }
}
