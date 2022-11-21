import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzv extends agcc
{
    public afzv() {
        super((Class)ageb.class, new agci[] { new afzt(afyf.class) });
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
    
    public static arjd h(final int b, final int n) {
        final ahcr builder = ((ahcz)agec.a).createBuilder();
        builder.copyOnWrite();
        ((agec)builder.instance).b = b;
        return new arjd(builder.build(), n);
    }
    
    public final agcb a() {
        return new afzu(agec.class);
    }
    
    public final agfb b() {
        return agfb.b;
    }
    
    public final /* bridge */ MessageLite c(final ahbt ahbt) {
        return (MessageLite)ahcz.parseFrom((ahcz)ageb.a, ahbt, ExtensionRegistryLite.a);
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }
    
    public final /* bridge */ void e(final MessageLite messageLite) {
        final ageb ageb = (ageb)messageLite;
        agii.d(ageb.b);
        agii.a(ageb.c.d());
    }
}
