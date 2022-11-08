// 
// Decompiled by Procyon v0.6.0
// 

public final class aamn
{
    public long a;
    public Object b;
    final /* synthetic */ Object c;
    
    public aamn(final aams c) {
        this.c = c;
        this.b = 0L;
    }
    
    public aamn(final yjm c) {
        this.c = c;
        this.b = null;
        this.a = 0L;
    }
    
    public final long a(final String s) {
        synchronized (this) {
            final Object b = this.b;
            if (b != null && ((abxv)b).b.equals(s)) {
                final Object c = this.c;
                final yjc n = ((yjm)c).n;
                if (n.d) {
                    return Math.max(n.f - (((yjm)c).l.d() - this.a), 0L);
                }
            }
            return 0L;
        }
    }
    
    public final abxv b() {
        synchronized (this) {
            return (abxv)this.b;
        }
    }
    
    public final void c(final abxv b) {
        synchronized (this) {
            this.b = b;
            this.a = ((yjm)this.c).l.d();
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
