import io.grpc.Status;
import java.util.Iterator;
import java.util.HashSet;
import java.util.concurrent.Future;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aseq implements Runnable
{
    final Object a;
    final Object b;
    final Object c;
    final Object d;
    final Object e;
    private final int f;
    
    public aseq(final adpx d, final String c, final adps e, final adpq b, final adpw a, final int f) {
        this.f = f;
        this.d = d;
        this.c = c;
        this.e = e;
        this.b = b;
        this.a = a;
    }
    
    public aseq(final asfe e, final Collection a, final asfc b, final Future c, final Future d, final int f) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        if (this.f != 0) {
            ((adpx)this.d).d((String)this.c, (adps)this.e, (adpq)this.b, (adpw)this.a);
            return;
        }
        for (final asfc asfc : this.a) {
            if (asfc != this.b) {
                asfc.a.c(asfe.c);
            }
        }
        final Object c = this.c;
        if (c != null) {
            ((Future)c).cancel(false);
        }
        final Object d = this.d;
        if (d != null) {
            ((Future)d).cancel(false);
        }
        final Object e = this.e;
        final asde z = ((asdf)((asfe)e).D.a).z;
        final Object a = z.a;
        monitorenter(a);
        try {
            z.b.remove(e);
            Status c2;
            if (z.b.isEmpty()) {
                c2 = z.c;
                z.b = new HashSet();
            }
            else {
                c2 = null;
            }
            monitorexit(a);
            if (c2 != null) {
                z.d.y.j(c2);
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
