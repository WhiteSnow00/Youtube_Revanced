// 
// Decompiled by Procyon v0.6.0
// 

final class arwm
{
    public volatile boolean a;
    private long b;
    private long c;
    
    public arwm() {
    }
    
    public final boolean a(long c) {
        synchronized (this) {
            final long c2 = this.c;
            if (c2 - c >= 0L) {
                c = c2;
            }
            this.c = c;
            if (this.b - c < 131072L && this.a) {
                this.a = false;
                return true;
            }
            return false;
        }
    }
    
    public final boolean b(long b) {
        synchronized (this) {
            b += this.b;
            this.b = b;
            return b - this.c >= 131072L && !this.a && (this.a = true);
        }
    }
}
