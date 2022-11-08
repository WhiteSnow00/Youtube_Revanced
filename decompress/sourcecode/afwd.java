import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwd extends afyj
{
    public afwd() {
        super(agai.class, new afyp[] { new afwb(afum.class) });
    }
    
    public static boolean g() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        }
        catch (final NoSuchAlgorithmException | NoSuchPaddingException ex) {
            return false;
        }
    }
    
    public static ardu h(final int b, final int n) {
        final agza builder = agaj.a.createBuilder();
        builder.copyOnWrite();
        ((agaj)builder.instance).b = b;
        return new ardu((Object)builder.build(), n);
    }
    
    @Override
    public final afyi a() {
        return new afwc(agaj.class);
    }
    
    @Override
    public final agbi b() {
        return agbi.b;
    }
    
    @Override
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }
}
