import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byf implements bxl
{
    private final List a;
    private final int b;
    
    public byf(final List a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public byf(final List list, final int b, final byte[] array) {
        this.b = b;
        this.a = Collections.unmodifiableList((List<?>)list);
    }
    
    public final int a() {
        return 1;
    }
    
    public final int b(final long n) {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b != 2 && n < 0L) {
                    return 0;
                }
                return -1;
            }
            else if (n < 0L) {
                return 0;
            }
        }
        return -1;
    }
    
    public final long c(final int n) {
        final int b = this.b;
        if (b != 0) {
            boolean b2 = false;
            final boolean b3 = false;
            if (b != 1) {
                if (b != 2) {
                    boolean b4 = b3;
                    if (n == 0) {
                        b4 = true;
                    }
                    bad.d(b4);
                }
                return 0L;
            }
            if (n == 0) {
                b2 = true;
            }
            bad.d(b2);
        }
        return 0L;
    }
    
    public final List d(final long n) {
        final int b = this.b;
        if (b == 0) {
            return this.a;
        }
        if (b == 1) {
            List<Object> list;
            if (n >= 0L) {
                list = this.a;
            }
            else {
                list = Collections.emptyList();
            }
            return list;
        }
        if (b != 2) {
            List<Object> list2;
            if (n >= 0L) {
                list2 = this.a;
            }
            else {
                list2 = Collections.emptyList();
            }
            return list2;
        }
        return this.a;
    }
}
