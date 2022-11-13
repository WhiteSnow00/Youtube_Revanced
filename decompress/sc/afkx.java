import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class afkx
{
    public static final adet d;
    public final AtomicLong a;
    public final AtomicLong b;
    public final AtomicInteger c;
    
    static {
        d = new adet((char[])null, null);
    }
    
    public afkx() {
        this.a = new AtomicLong();
        this.b = new AtomicLong();
        this.c = new AtomicInteger();
    }
    
    static afkw a(final int n, final TimeUnit timeUnit) {
        return new afkw(n, timeUnit);
    }
}
