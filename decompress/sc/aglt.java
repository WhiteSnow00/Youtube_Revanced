import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import android.util.Log;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.PublicKey;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aglt
{
    public static final String[] a;
    public final SharedPreferences b;
    public final String c;
    
    static {
        a = new String[] { "*", "FCM", "GCM", "" };
    }
    
    public aglt(final agia agia) {
        this.b = agia.a().getSharedPreferences("com.google.android.gms.appid", 0);
        final String c = agia.e().c;
        String c2 = null;
        Label_0097: {
            if (c != null) {
                c2 = c;
            }
            else {
                final String b = agia.e().b;
                if (!b.startsWith("1:")) {
                    c2 = b;
                    if (!b.startsWith("2:")) {
                        break Label_0097;
                    }
                }
                final String[] split = b.split(":");
                if (split.length != 4 || (c2 = split[1]).isEmpty()) {
                    c2 = null;
                }
            }
        }
        this.c = c2;
    }
    
    public static String a(final PublicKey publicKey) {
        final byte[] encoded = publicKey.getEncoded();
        try {
            final byte[] digest = MessageDigest.getInstance("SHA1").digest(encoded);
            digest[0] = (byte)((digest[0] & 0xF) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        }
        catch (final NoSuchAlgorithmException ex) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }
    
    public static final PublicKey b(String generatePublic) {
        try {
            final byte[] decode = Base64.decode((String)generatePublic, 8);
            final KeyFactory instance = KeyFactory.getInstance("RSA");
            generatePublic = (NoSuchAlgorithmException)new X509EncodedKeySpec(decode);
            generatePublic = (NoSuchAlgorithmException)instance.generatePublic((KeySpec)generatePublic);
            return (PublicKey)generatePublic;
        }
        catch (final NoSuchAlgorithmException generatePublic) {}
        catch (final InvalidKeySpecException generatePublic) {}
        catch (final IllegalArgumentException ex) {}
        Log.w("ContentValues", "Invalid key stored ".concat(generatePublic.toString()));
        return null;
    }
}
