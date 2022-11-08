import java.security.Provider;
import java.util.logging.Level;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdz
{
    public static final agdz a;
    public static final agdz b;
    public static final agdz c;
    public static final agdz d;
    public static final agdz e;
    public static final agdz f;
    public static final agdz g;
    private static final Logger h;
    private final agdy i;
    
    static {
        h = Logger.getLogger(agdz.class.getName());
        a = new agdz((ageb)new agea(1));
        b = new agdz((ageb)new agea(4));
        c = new agdz((ageb)new agea(6));
        d = new agdz((ageb)new agea(5));
        e = new agdz((ageb)new agea(0));
        f = new agdz((ageb)new agea(3));
        g = new agdz((ageb)new agea(2));
    }
    
    public agdz(final ageb ageb) {
        if (afxc.a()) {
            this.i = (agdy)new agdx(ageb, 2);
            return;
        }
        if (aety.t()) {
            this.i = (agdy)new agdx(ageb, 1);
            return;
        }
        this.i = (agdy)new agdx(ageb, 0);
    }
    
    public static List b(final String... array) {
        final ArrayList list = new ArrayList();
        for (final String s : array) {
            final Provider provider = Security.getProvider(s);
            if (provider != null) {
                list.add(provider);
            }
            else {
                agdz.h.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", s));
            }
        }
        return list;
    }
    
    public final Object a(final String s) {
        return this.i.a(s);
    }
}
