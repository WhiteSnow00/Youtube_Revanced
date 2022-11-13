import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bno
{
    private static final AtomicLong d;
    public final long a;
    public final bbp b;
    public final long c;
    
    static {
        d = new AtomicLong();
    }
    
    public bno(final long n, final bbp bbp) {
        final Uri a = bbp.a;
        Collections.emptyMap();
        this(n, bbp, 0L);
    }
    
    public bno(final long a, final bbp b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static long a() {
        return bno.d.getAndIncrement();
    }
}
