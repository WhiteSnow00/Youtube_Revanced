import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dii
{
    private static final Queue a;
    private int b;
    private int c;
    private Object d;
    
    static {
        a = dph.i(0);
    }
    
    private dii() {
    }
    
    public static dii a(final Object d, final int c, final int b) {
        Object a = dii.a;
        synchronized (a) {
            final dii dii = ((Queue<dii>)a).poll();
            monitorexit(a);
            a = dii;
            if (dii == null) {
                a = new dii();
            }
            ((dii)a).d = d;
            ((dii)a).c = c;
            ((dii)a).b = b;
            return (dii)a;
        }
    }
    
    public final void b() {
        final Queue a = dii.a;
        synchronized (a) {
            a.offer(this);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dii) {
            final dii dii = (dii)o;
            if (this.c == dii.c && this.b == dii.b && this.d.equals(dii.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.b * 31 + this.c) * 31 + this.d.hashCode();
    }
}
