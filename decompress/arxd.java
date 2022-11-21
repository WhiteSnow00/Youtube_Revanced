import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxd
{
    public static final arxd a;
    private final ConcurrentMap b;
    
    static {
        a = new arxd(new arxc[] { (arxc)new arxa(1), (arxc)arxa.a });
    }
    
    public arxd(final arxc... array) {
        this.b = (ConcurrentMap)new ConcurrentHashMap();
        for (int i = 0; i < 2; ++i) {
            final arxc arxc = array[i];
            this.b.put(arxc.b(), arxc);
        }
    }
}
