import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.CopyOnWriteArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idt implements idx
{
    public alyt a;
    public final vai b;
    private final CopyOnWriteArrayList c;
    private final vdr d;
    private final Executor e;
    private asir f;
    
    protected idt() {
        this.c = new CopyOnWriteArrayList();
    }
    
    public idt(final vdr d, final Executor e, final vai b) {
        this.c = new CopyOnWriteArrayList();
        this.d = d;
        this.e = e;
        this.b = b;
    }
    
    private final void g(final iej iej) {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            iej.a((Object)iterator.next());
        }
    }
    
    public final void a(final idw idw) {
        final CopyOnWriteArrayList c = this.c;
        idw.getClass();
        c.add(idw);
    }
    
    public final void b(final String s) {
        this.g((iej)new ids(s));
    }
    
    public final void c(final idw idw) {
        this.c.remove(idw);
    }
    
    public final void d() {
        this.f = this.d.b().g((Class)alyt.class).af(atjj.b(this.e)).K((asjs)hus.o).Z((asjr)hzh.m).l((Class)alyt.class).aH((asjm)new iad(this, 14));
    }
    
    public final void e() {
        final asir f = this.f;
        if (f != null && !f.tA()) {
            asjv.b((AtomicReference)this.f);
            this.f = null;
        }
        this.a = null;
    }
    
    public final void f() {
        this.g((iej)new idr());
    }
}
