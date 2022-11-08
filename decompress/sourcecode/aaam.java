import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaam implements tec
{
    public final arhr a;
    public final atjj b;
    public final atjj c;
    public final atjj d;
    public final tdz e;
    public final ScheduledExecutorService f;
    public final AtomicReference g;
    public boolean h;
    private final atjj i;
    private final zki j;
    private final atjj k;
    
    public aaam(final atjj i, final arhr a, final atjj b, final atjj c, final atjj d, final tdz e, final zki j, final atjj k, final ScheduledExecutorService f) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.j = j;
        this.k = k;
        this.f = f;
        this.g = new AtomicReference();
    }
    
    public final ashe a(final amsh amsh) {
        return this.b((List)afcr.r((Object)amsh)).get(0);
    }
    
    public final List b(final List list) {
        if (this.g.get() == null) {
            this.c();
        }
        final aaao aaao = this.g.get();
        if (aaao != null) {
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.addAll(((aaal)this.i.a()).a((amsh)iterator.next(), null));
            }
            final ArrayList list3 = new ArrayList();
            for (final aaag aaag : list2) {
                final atir ar = atir.aR((Object)new aaak(aaag.c, aaaj.a));
                aaao.g.put(aaag.a, ar);
                list3.add(ar);
            }
            afld.j((Runnable)new zst(aaao, (List)list2, 8), aaao.c);
            return list3;
        }
        throw new aaan("No active identity");
    }
    
    public final void c() {
        if (this.j.t()) {
            final zkh c = this.j.c();
            final aaao aaao = this.g.get();
            if (aaao != null) {
                if (aaao.a.b().equals(c.b())) {
                    return;
                }
            }
            try {
                final zhb zhb = (zhb)this.k.a();
                final thh thh = (thh)((atjj)zhb.c).a();
                thh.getClass();
                final acko acko = (acko)((atjj)zhb.a).a();
                acko.getClass();
                final aaal aaal = (aaal)((atjj)zhb.e).a();
                aaal.getClass();
                final Object d = zhb.d;
                final Executor executor = (Executor)((atjj)zhb.b).a();
                executor.getClass();
                c.getClass();
                final aaao aaao2 = new aaao(thh, acko, aaal, (atjj)d, executor, c, null);
                aaao2.i = new aepj(this);
                afld.j((Runnable)new zsh(aaao2, 11), aaao2.c);
                this.g.set(aaao2);
            }
            catch (final RuntimeException ex) {
                trn.d("Couldn't initialize orchestration queue", (Throwable)ex);
                zjp.c(zjo.b, zjn.B, "Couldn't initialize orchestration queue", (Throwable)ex);
            }
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zkx zkx = (zkx)o;
                final aaap aaap = (aaap)this.a.a();
                final ListenableFuture b = aaap.b;
                if (b != null && !b.isDone()) {
                    aaap.b.cancel(true);
                }
                final aaao aaao = this.g.get();
                if (aaao != null) {
                    aaao.g();
                    this.g.set(null);
                    return null;
                }
            }
            else {
                final zkv zkv = (zkv)o;
                this.c();
            }
        }
        else {
            array = new Class[] { zkv.class, zkx.class };
        }
        return array;
    }
}
