import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dze
{
    private static int i;
    public dzf a;
    public final dzd b;
    public final dzd c;
    public final dzd d;
    public double e;
    public boolean f;
    public double g;
    public final CopyOnWriteArraySet h;
    
    public dze() {
        this.b = new dzd();
        this.c = new dzd();
        this.d = new dzd();
        this.f = true;
        this.g = 0.0;
        this.h = new CopyOnWriteArraySet();
        ++dze.i;
        this.a = dzf.a;
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
            ((dzg)iterator.next()).c();
        }
    }
}
