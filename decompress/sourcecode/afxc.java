import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxc
{
    public static final Logger a;
    private static final AtomicBoolean b;
    
    static {
        a = Logger.getLogger(afxc.class.getName());
        b = new AtomicBoolean(false);
    }
    
    private afxc() {
    }
    
    public static boolean a() {
        return afxc.b.get();
    }
}
