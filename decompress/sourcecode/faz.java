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

abstract class faz implements fbd
{
    protected final atjj a;
    private final int b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final Set f;
    private final afad g;
    private final ReferenceQueue h;
    private final Queue i;
    
    public faz(final atjj a, final int b, final boolean c, final boolean d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new HashSet();
        this.g = (afad)afcb.g();
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
    
    @Override
    public void b(final fbe fbe) {
        if (this.c) {
            this.g.remove((Object)fbe);
        }
        if (this.d) {
            this.f.add(fbe);
        }
    }
    
    @Override
    public void c(final List list) {
        if (!this.c) {
            return;
        }
        this.g();
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            final fbe fbe = (fbe)this.g.a().get((Object)iterator.next());
            if (fbe != null) {
                list.add(fbe);
            }
        }
        this.i.clear();
    }
    
    @Override
    public void d(final fbe fbe, String s, final Object o, final boolean b) {
        if (b) {
            return;
        }
        if (this.c) {
            final WeakReference weakReference = (WeakReference)this.g.get((Object)fbe);
            if (weakReference == null || weakReference.get() != o) {
                if (o != null) {
                    this.g.put((Object)fbe, (Object)new WeakReference(o, this.h));
                    if (weakReference != null) {
                        final adfy adfy = (adfy)this.a.a();
                        s = aexs.e(s);
                        ((qqq)adfy.c.a()).b(new Object[] { s, this.e });
                    }
                }
                else if (weakReference != null) {
                    this.g.remove((Object)fbe);
                    final adfy adfy2 = (adfy)this.a.a();
                    final String e = aexs.e(s);
                    s = this.e;
                    ((qqq)adfy2.d.a()).b(new Object[] { e, s });
                }
            }
        }
        if (this.d) {
            this.f.remove(fbe);
        }
    }
    
    @Override
    public final boolean e() {
        this.g();
        final boolean b = this.b != 0 && this.a() > this.b;
        final boolean empty = this.i.isEmpty();
        return b || (empty ^ true);
    }
    
    @Override
    public final boolean f(final fbe fbe) {
        return this.d && this.f.contains(fbe);
    }
}
