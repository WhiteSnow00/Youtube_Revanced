import java.util.HashSet;
import io.grpc.Status;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class asde
{
    final Object a;
    Collection b;
    Status c;
    final asdf d;
    
    public asde(final asdf d) {
        this.d = d;
        this.a = new Object();
        this.b = new HashSet();
    }
    
    final void a(final Status c) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = c;
            final boolean empty = this.b.isEmpty();
            monitorexit(this.a);
            if (empty) {
                this.d.y.j(c);
            }
        }
    }
}
