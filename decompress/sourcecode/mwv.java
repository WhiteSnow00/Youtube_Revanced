import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwv
{
    long a;
    long b;
    
    public mwv() {
        this.a = -1L;
        this.b = -1L;
    }
    
    public final long a() {
        kgk.aM(this.b != -1L);
        return TimeUnit.NANOSECONDS.toMillis(this.b() - this.b);
    }
    
    public final long b() {
        if (this.a == -1L) {
            return System.nanoTime();
        }
        this.a = -1L;
        return 0L;
    }
    
    public final void c() {
        this.b = this.b();
    }
}
