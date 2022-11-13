import java.util.Iterator;
import java.util.List;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class fbe implements fbi
{
    protected final atke a;
    private final int b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final Set f;
    private final afcc g;
    private final ReferenceQueue h;
    private final Queue i;
    
    public fbe(final atke a, final int b, final boolean c, final boolean d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new HashSet();
        this.g = (afcc)afea.g();
        this.h = new ReferenceQueue();
        this.i = new ArrayDeque();
    }
    
    private final void g() {
        if (!this.c) {
            return;
        }
        for (Reference reference = this.h.poll(); reference != null; reference = this.h.poll()) {
            if (reference instanceof WeakReference) {
                this.i.add((WeakReference<?>)reference);
            }
        }
    }
    
    protected abstract int a();
    
    public void b(final fbj fbj) {
        if (this.c) {
            this.g.remove(fbj);
        }
        if (this.d) {
            this.f.add(fbj);
        }
    }
    
    public void c(final List list) {
        if (!this.c) {
            return;
        }
        this.g();
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            final fbj fbj = this.g.a().get(iterator.next());
            if (fbj != null) {
                list.add(fbj);
            }
        }
        this.i.clear();
    }
    
    public void d(final fbj fbj, String s, final Object o, final boolean b) {
        if (b) {
            return;
        }
        if (this.c) {
            final WeakReference weakReference = this.g.get(fbj);
            if (weakReference == null || weakReference.get() != o) {
                if (o != null) {
                    this.g.put(fbj, new WeakReference(o, this.h));
                    if (weakReference != null) {
                        final adia adia = (adia)this.a.a();
                        final String e = aezr.e(s);
                        s = this.e;
                        ((qsa)adia.c.a()).b(new Object[] { e, s });
                    }
                }
                else if (weakReference != null) {
                    this.g.remove(fbj);
                    final adia adia2 = (adia)this.a.a();
                    s = aezr.e(s);
                    ((qsa)adia2.d.a()).b(new Object[] { s, this.e });
                }
            }
        }
        if (this.d) {
            this.f.remove(fbj);
        }
    }
    
    public final boolean e() {
        this.g();
        final boolean b = this.b != 0 && this.a() > this.b;
        final boolean empty = this.i.isEmpty();
        return b || (empty ^ true);
    }
    
    public final boolean f(final fbj fbj) {
        return this.d && this.f.contains(fbj);
    }
}
