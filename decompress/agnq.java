import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class agnq
{
    private static final long a;
    private static final long b;
    private long c;
    private int d;
    
    static {
        a = TimeUnit.HOURS.toMillis(24L);
        b = TimeUnit.MINUTES.toMillis(30L);
    }
    
    public agnq() {
        agni.b();
    }
    
    private final long c(final int n) {
        monitorenter(this);
        Label_0036: {
            if (n == 429 || (n >= 500 && n < 600)) {
                break Label_0036;
            }
            try {
                return agnq.a;
                final double pow = Math.pow(2.0, this.d);
                final double n2 = (double)(long)(Math.random() * 1000.0);
                Double.isNaN(n2);
                return (long)Math.min(pow + n2, (double)agnq.b);
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    private final void d() {
        synchronized (this) {
            this.d = 0;
        }
    }
    
    public final void a(final int n) {
        monitorenter(this);
        Label_0061: {
            if ((n >= 200 && n < 300) || n == 401 || n == 404) {
                break Label_0061;
            }
            try {
                ++this.d;
                this.c = System.currentTimeMillis() + this.c(n);
                return;
                this.d();
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final boolean b() {
        synchronized (this) {
            return this.d == 0 || System.currentTimeMillis() > this.c;
        }
    }
}
