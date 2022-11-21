import android.os.StrictMode$ThreadPolicy;
import java.security.SecureRandom;
import android.os.StrictMode;
import java.util.concurrent.atomic.AtomicLong;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeud
{
    public static final aeud a;
    private final UUID b;
    private final AtomicLong c;
    
    static {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            a = new aeud(UUID.randomUUID(), new SecureRandom().nextLong());
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    public aeud(final UUID b, final long n) {
        this.b = b;
        this.c = new AtomicLong((n ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL);
    }
    
    final long a() {
        AtomicLong c;
        long value;
        long n;
        long n2;
        do {
            value = this.c.get();
            c = this.c;
            n2 = (value * 25214903917L + 11L & 0xFFFFFFFFFFFFL);
            n = (25214903917L * n2 + 11L & 0xFFFFFFFFFFFFL);
        } while (!c.compareAndSet(value, n));
        return ((long)(int)(n2 >>> 16) << 32) + (int)(n >>> 16);
    }
    
    public final UUID b() {
        return new UUID((this.a() & 0xFFFFFFFFFFFF0FFFL) ^ this.b.getMostSignificantBits(), this.a() >>> 2 ^ this.b.getLeastSignificantBits());
    }
}
