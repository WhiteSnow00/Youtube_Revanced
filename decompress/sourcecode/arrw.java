import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arrw
{
    public static final arrw a;
    private final ConcurrentMap b;
    
    static {
        a = new arrw(new arrv[] { (arrv)new arrt(1), (arrv)arrt.a });
    }
    
    public arrw(final arrv... array) {
        this.b = (ConcurrentMap)new ConcurrentHashMap();
        for (final arrv arrv : array) {
            this.b.put(arrv.b(), arrv);
        }
    }
    
    public static arrw a() {
        return new arrw(new arrv[0]);
    }
}
