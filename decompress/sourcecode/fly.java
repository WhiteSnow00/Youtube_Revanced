import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fly implements tec
{
    public final oas a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final Map d;
    public final Map e;
    public final Map f;
    private final tdz g;
    private final Set h;
    
    public fly(final oas a, final tdz g, final ScheduledExecutorService b, final Executor c) {
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.h = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }
    
    public final void a(final flx flx) {
        if (this.h.isEmpty()) {
            this.g.g((Object)this);
        }
        this.h.add(flx);
    }
    
    public final void b(final flx flx) {
        this.h.remove(flx);
        if (this.h.isEmpty()) {
            this.g.m((Object)this);
        }
    }
    
    public final void c(final zwu zwu) {
        this.d.put(zwu.a.a(), this.a.c());
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            ((flx)iterator.next()).a(zwu);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zwu zwu = (zwu)o;
            szc.f();
            final String a = zwu.a.a();
            long longValue;
            if (this.d.containsKey(a)) {
                longValue = this.d.get(a);
            }
            else {
                longValue = 0L;
            }
            final long c = this.a.c();
            long n2;
            if (c - longValue > 500L) {
                n2 = 0L;
            }
            else {
                n2 = longValue + 500L - c;
            }
            array = null;
            if (n2 == 0L) {
                this.c(zwu);
            }
            else {
                this.f.put(a, zwu);
                if (!this.e.containsKey(a)) {
                    final ListenableFuture o2 = afva.o((afrx)new fdq(this, a, 3), n2, TimeUnit.MILLISECONDS, this.b);
                    afva.w(o2, (afsz)new fkb(this, a, 2), this.c);
                    this.e.put(a, o2);
                    return null;
                }
            }
        }
        else {
            array = new Class[] { zwu.class };
        }
        return array;
    }
}
