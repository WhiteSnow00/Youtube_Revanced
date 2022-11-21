import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnr
{
    private static final AtomicLong d;
    public final long a;
    public final bbr b;
    public final long c;
    
    static {
        d = new AtomicLong();
    }
    
    public bnr(final long n, final bbr bbr) {
        final Uri a = bbr.a;
        Collections.emptyMap();
        this(n, bbr, 0L);
    }
    
    public bnr(final long a, final bbr b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static long a() {
        return bnr.d.getAndIncrement();
    }
}
