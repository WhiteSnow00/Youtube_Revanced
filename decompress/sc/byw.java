import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class byw implements bxi
{
    public static final byw a;
    private final List b;
    
    static {
        a = new byw();
    }
    
    private byw() {
        this.b = Collections.emptyList();
    }
    
    public byw(final azy azy) {
        this.b = Collections.singletonList(azy);
    }
    
    public final int a() {
        return 1;
    }
    
    public final int b(final long n) {
        if (n < 0L) {
            return 0;
        }
        return -1;
    }
    
    public final long c(final int n) {
        dk.f(n == 0);
        return 0L;
    }
    
    public final List d(final long n) {
        List<Object> list;
        if (n >= 0L) {
            list = this.b;
        }
        else {
            list = Collections.emptyList();
        }
        return list;
    }
}
