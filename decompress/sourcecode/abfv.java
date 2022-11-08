import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfv
{
    public int a;
    public float b;
    public final Set c;
    
    public abfv() {
        this.c = new CopyOnWriteArraySet();
    }
    
    public final void a(final abfu abfu) {
        this.c.add(abfu);
    }
    
    public final void b(final abfu abfu) {
        this.c.remove(abfu);
    }
    
    public final void c(final float b, final boolean b2) {
        this.b = b;
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((abfu)iterator.next()).d(b, b2);
        }
    }
    
    public final boolean d() {
        return this.a == 2;
    }
    
    public final boolean e() {
        return this.a == 0;
    }
    
    public final boolean f() {
        return this.a == 1;
    }
    
    public final boolean g() {
        return this.f() || this.d();
    }
}
