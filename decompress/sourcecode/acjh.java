import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjh
{
    final /* synthetic */ acji a;
    private final on b;
    private final on c;
    private final acjr d;
    private boolean e;
    private boolean f;
    private final adec g;
    
    public acjh(final acji a, final on b, final on c, final acjr d, final adec g, final byte[] array) {
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
    
    public final void a(final on on) {
        final on b = this.b;
        if (on == b) {
            if (!this.e) {
                this.e = true;
                ((Map<Object, Object>)this.g.d).remove(b);
                ((nt)this.a).l(this.b);
                this.b();
            }
        }
        else {
            final on c = this.c;
            if (on == c && !this.f) {
                this.f = true;
                ((Map<Object, Object>)this.g.d).remove(c);
                ((nt)this.a).l(this.c);
                this.b();
            }
        }
    }
}
