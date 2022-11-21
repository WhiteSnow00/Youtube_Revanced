// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqd
{
    public long a;
    public Object b;
    final Object c;
    
    public aaqd(final aaqi c) {
        this.c = c;
        this.b = 0L;
    }
    
    public aaqd(final yni c) {
        this.c = c;
        this.b = null;
        this.a = 0L;
    }
    
    public final long a(final String s) {
        synchronized (this) {
            final Object b = this.b;
            if (b != null && ((acbi)b).b.equals(s)) {
                final Object c = this.c;
                final ymz n = ((yni)c).n;
                if (n.d) {
                    return Math.max(n.f - (((yni)c).l.d() - this.a), 0L);
                }
            }
            return 0L;
        }
    }
    
    public final acbi b() {
        synchronized (this) {
            return (acbi)this.b;
        }
    }
    
    public final void c(final acbi b) {
        synchronized (this) {
            this.b = b;
            this.a = ((yni)this.c).l.d();
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
