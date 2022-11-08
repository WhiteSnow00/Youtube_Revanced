import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvn
{
    public static final String a;
    public static final String b;
    
    static {
        new afvr();
        a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new afwa();
        b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new afwd();
        new afvx();
        new afwj();
        new afwn();
        new afwg();
        new afwq();
        final agbv a2 = agbv.a;
        try {
            a();
        }
        catch (final GeneralSecurityException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static void a() {
        afvl.j(new afvo());
        afzo.a();
        afvl.m(new afvr());
        afvl.m(new afwa());
        if (!afxc.a()) {
            afvl.m(new afvx());
            if (afwd.g()) {
                afvl.m(new afwd());
            }
            afvl.m(new afwg());
            afvl.m(new afwj());
            afvl.m(new afwn());
            afvl.m(new afwq());
        }
    }
}
