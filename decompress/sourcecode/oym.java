// 
// Decompiled by Procyon v0.6.0
// 

public final class oym
{
    private long a;
    private long b;
    private long c;
    private long d;
    
    public oym() {
        this.a = 0L;
    }
    
    final long a() {
        synchronized (this) {
            final long d = this.d;
            this.d = 0L;
            return d;
        }
    }
    
    public final long b(final int n) {
        monitorenter(this);
        Label_0030: {
            if (n == 1) {
                break Label_0030;
            }
            Label_0021: {
                if (n == 2) {
                    break Label_0021;
                }
                try {
                    return this.c;
                    return this.a;
                    return this.b;
                }
                finally {
                    monitorexit(this);
                }
            }
        }
    }
    
    public final long c() {
        synchronized (this) {
            return this.d;
        }
    }
    
    public final void d(long b) {
        synchronized (this) {
            this.a += b;
            this.d += b;
            final long n = 0L;
            if (b > 0L) {
                b += this.b;
                this.b = b;
            }
            else {
                this.b = 0L;
                b = n;
            }
            this.c = Math.max(this.c, b);
        }
    }
    
    public final void e() {
        synchronized (this) {
            this.b = 0L;
        }
    }
    
    public final void f() {
        synchronized (this) {
            this.d = 0L;
        }
    }
}
