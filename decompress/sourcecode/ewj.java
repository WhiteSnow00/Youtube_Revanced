import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewj
{
    static final long a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    
    static {
        a = TimeUnit.SECONDS.toMillis(72L);
        b = TimeUnit.SECONDS.toMillis(60L);
        c = TimeUnit.SECONDS.toMillis(36L);
        d = TimeUnit.SECONDS.toMillis(18L);
        e = TimeUnit.SECONDS.toMillis(3L);
    }
    
    static final int a() {
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        int n;
        if (availableProcessors > 4) {
            n = 3;
        }
        else {
            if (availableProcessors > 2) {
                return 2;
            }
            n = 1;
        }
        return n;
    }
}
