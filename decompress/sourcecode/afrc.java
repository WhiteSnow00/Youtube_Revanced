import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class afrc extends afqw
{
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;
    
    public afrc(final AtomicReferenceFieldUpdater a, final AtomicReferenceFieldUpdater b, final AtomicReferenceFieldUpdater c, final AtomicReferenceFieldUpdater d, final AtomicReferenceFieldUpdater e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final afra a(final afrl afrl, final afra afra) {
        return this.d.getAndSet(afrl, afra);
    }
    
    public final afrk b(final afrl afrl, final afrk afrk) {
        return this.c.getAndSet(afrl, afrk);
    }
    
    public final void c(final afrk afrk, final afrk afrk2) {
        this.b.lazySet(afrk, afrk2);
    }
    
    public final void d(final afrk afrk, final Thread thread) {
        this.a.lazySet(afrk, thread);
    }
    
    public final boolean e(final afrl afrl, final afra afra, final afra afra2) {
        return afrb.a(this.d, (Object)afrl, (Object)afra, (Object)afra2);
    }
    
    public final boolean f(final afrl afrl, final Object o, final Object o2) {
        return afrb.a(this.e, (Object)afrl, o, o2);
    }
    
    public final boolean g(final afrl afrl, final afrk afrk, final afrk afrk2) {
        return afrb.a(this.c, (Object)afrl, (Object)afrk, (Object)afrk2);
    }
}
