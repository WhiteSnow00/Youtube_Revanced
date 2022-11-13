import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class ctg extends ctb
{
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;
    
    public ctg(final AtomicReferenceFieldUpdater a, final AtomicReferenceFieldUpdater b, final AtomicReferenceFieldUpdater c, final AtomicReferenceFieldUpdater d, final AtomicReferenceFieldUpdater e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final ctj ctj, final ctj ctj2) {
        this.b.lazySet(ctj, ctj2);
    }
    
    public final void b(final ctj ctj, final Thread thread) {
        this.a.lazySet(ctj, thread);
    }
    
    public final boolean c(final ctk ctk, final ctf ctf, final ctf ctf2) {
        return csk.b(this.d, (Object)ctk, (Object)ctf, (Object)ctf2);
    }
    
    public final boolean d(final ctk ctk, final Object o, final Object o2) {
        return csk.b(this.e, (Object)ctk, o, o2);
    }
    
    public final boolean e(final ctk ctk, final ctj ctj, final ctj ctj2) {
        return csk.b(this.c, (Object)ctk, (Object)ctj, (Object)ctj2);
    }
}
