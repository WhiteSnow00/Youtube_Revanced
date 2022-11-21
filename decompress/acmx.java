import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmx
{
    final acmy a;
    private final oo b;
    private final oo c;
    private final acnh d;
    private boolean e;
    private boolean f;
    private final adhr g;
    
    public acmx(final acmy a, final oo b, final oo c, final acnh d, final adhr g, final byte[] array) {
        this.a = a;
        this.e = false;
        this.f = false;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
    }
    
    private final void b() {
        if (this.e) {
            if (this.f) {
                ((List)this.g.c).remove(this.d);
                ((List)this.g.b).remove(this.d);
                this.a.a();
            }
        }
    }
    
    public final void a(final oo oo) {
        final oo b = this.b;
        if (oo == b) {
            if (!this.e) {
                this.e = true;
                ((Map<Object, Object>)this.g.d).remove(b);
                ((nu)this.a).l(this.b);
                this.b();
            }
        }
        else {
            final oo c = this.c;
            if (oo == c && !this.f) {
                this.f = true;
                ((Map<Object, Object>)this.g.d).remove(c);
                ((nu)this.a).l(this.c);
                this.b();
            }
        }
    }
}
