import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abix
{
    public int a;
    public float b;
    public final Set c;
    
    public abix() {
        this.c = new CopyOnWriteArraySet();
    }
    
    public final void a(final abiw abiw) {
        this.c.add(abiw);
    }
    
    public final void b(final abiw abiw) {
        this.c.remove(abiw);
    }
    
    public final void c(final float b, final boolean b2) {
        this.b = b;
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((abiw)iterator.next()).d(b, b2);
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
