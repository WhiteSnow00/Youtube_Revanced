import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxg
{
    public static final String a;
    
    static {
        new afxf();
        a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        final agbv a2 = agbv.a;
        try {
            afvl.j(new afxi());
            if (afxc.a()) {
                return;
            }
            afvl.m(new afxf());
        }
        catch (final GeneralSecurityException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
}
