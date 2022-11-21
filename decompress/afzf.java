import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzf
{
    public static final String a;
    public static final String b;
    
    static {
        new afzj();
        a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new afzs();
        b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new afzv();
        new afzp();
        new agab();
        new agaf();
        new afzy();
        new agai();
        final agfo a2 = agfo.a;
        try {
            a();
        }
        catch (final GeneralSecurityException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static void a() {
        afzd.j(new afzg());
        agdh.a();
        afzd.m(new afzj());
        afzd.m(new afzs());
        if (!agau.a()) {
            afzd.m(new afzp());
            if (afzv.g()) {
                afzd.m(new afzv());
            }
            afzd.m(new afzy());
            afzd.m(new agab());
            afzd.m(new agaf());
            afzd.m(new agai());
        }
    }
}
