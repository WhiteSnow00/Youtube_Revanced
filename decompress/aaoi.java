// 
// Decompiled by Procyon v0.6.0
// 

public final class aaoi
{
    public long a;
    public Object b;
    final Object c;
    
    public aaoi(final aaon c) {
        this.c = c;
        this.b = 0L;
    }
    
    public aaoi(final ylk c) {
        this.c = c;
        this.b = null;
        this.a = 0L;
    }
    
    public final long a(final String s) {
        synchronized (this) {
            final Object b = this.b;
            if (b != null && ((abzy)b).b.equals(s)) {
                final Object c = this.c;
                final ylb n = ((ylk)c).n;
                if (n.d) {
                    return Math.max(n.f - (((ylk)c).l.d() - this.a), 0L);
                }
            }
            return 0L;
        }
    }
    
    public final abzy b() {
        synchronized (this) {
            return (abzy)this.b;
        }
    }
    
    public final void c(final abzy b) {
        synchronized (this) {
            this.b = b;
            this.a = ((ylk)this.c).l.d();
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.b = null;
            this.a = 0L;
            this.notifyAll();
        }
    }
}
