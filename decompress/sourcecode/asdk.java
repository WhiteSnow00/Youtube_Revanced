import io.grpc.Status;
import java.util.Iterator;
import java.util.HashSet;
import java.util.concurrent.Future;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdk implements Runnable
{
    final /* synthetic */ Object a = a;
    final /* synthetic */ Object b = b;
    final /* synthetic */ Object c = c;
    final /* synthetic */ Object d = d;
    final /* synthetic */ Object e = e;
    private final /* synthetic */ int f;
    
    public asdk(final asdx e, final Collection a, final asdv b, final Future c, final Future d, final int f) {
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
            ((adnw)this.d).d((String)this.c, (adnr)this.e, (adnp)this.b, (adnv)this.a);
            return;
        }
        for (final asdv asdv : this.a) {
            if (asdv != this.b) {
                asdv.a.c(asdx.c);
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
        final asby z = ((asbz)((asdx)e).D.a).z;
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
