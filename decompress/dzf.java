import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzf
{
    private static int i;
    public dzg a;
    public final dze b;
    public final dze c;
    public final dze d;
    public double e;
    public boolean f;
    public double g;
    public final CopyOnWriteArraySet h;
    
    public dzf() {
        this.b = new dze();
        this.c = new dze();
        this.d = new dze();
        this.f = true;
        this.g = 0.0;
        this.h = new CopyOnWriteArraySet();
        ++dzf.i;
        this.a = dzg.a;
    }
    
    public final boolean a() {
        final double abs = Math.abs(this.b.b);
        boolean b = false;
        if (abs <= 0.005) {
            if (Math.abs(this.e - this.b.a) <= 0.005) {
                b = true;
            }
            else {
                final double c = this.a.c;
                b = b;
            }
        }
        return b;
    }
    
    public final void b(final double e) {
        if (this.e == e && this.a()) {
            return;
        }
        this.e = e;
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            ((dzh)iterator.next()).c();
        }
    }
}
