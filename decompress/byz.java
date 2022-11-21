import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class byz implements bxl
{
    public static final byz a;
    private final List b;
    
    static {
        a = new byz();
    }
    
    private byz() {
        this.b = Collections.emptyList();
    }
    
    public byz(final azz azz) {
        this.b = Collections.singletonList(azz);
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
        bad.d(n == 0);
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
