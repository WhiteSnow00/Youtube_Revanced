import java.util.Iterator;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaap implements Runnable
{
    private static final aaaf d;
    private static final aaaf e;
    private static final aaaf f;
    public final aftr a;
    public ListenableFuture b;
    private final ScheduledExecutorService g;
    private final Map h;
    private final aaam i;
    private final aaal j;
    private final oas k;
    private final aaha l;
    
    static {
        final aaae b = aaaf.c.b();
        b.b = 36;
        d = b.a();
        final aaae b2 = aaaf.c.b();
        b2.b = 6;
        e = b2.a();
        final aaae b3 = aaaf.c.b();
        b3.b = 34;
        f = b3.a();
    }
    
    public aaap(final aftr a, final ScheduledExecutorService g, final Map h, final aaam i, final aaal j, final oas k, final aaha l) {
        this.a = a;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    private final void b(final aaao aaao, final aaag aaag, final aaaf aaaf, final long n, final long n2) {
        final ArrayList list = new ArrayList();
        final HashSet set = new HashSet();
        final int f = aaaf.f;
        final int n3 = f - 1;
        if (f != 0) {
            boolean b = false;
            if (n3 != 1) {
                if (n3 == 2) {
                    Label_0168: {
                        if (aaaf.d) {
                            final int incrementAndGet = aaag.e.incrementAndGet();
                            amsf amsf;
                            if ((amsf = aaag.c.e) == null) {
                                amsf = amsf.b;
                            }
                            final agzq f2 = amsf.f;
                            if (incrementAndGet <= ((List)f2).size()) {
                                set.add(aaag);
                                this.g.schedule((Runnable)new zst(aaao, aaag, 9), (int)((List)f2).get(incrementAndGet - 1), TimeUnit.SECONDS);
                                break Label_0168;
                            }
                        }
                        b = true;
                    }
                    aaao.h(aaag, aaaf, list, n, n2, b);
                    if (b) {
                        set.addAll(aaao.e(aaag, aaag));
                    }
                }
            }
            else {
                if (!aaaf.e.isEmpty()) {
                    final afcr e = aaaf.e;
                    for (int size = ((List)e).size(), i = 0; i < size; ++i) {
                        final amsh amsh = (amsh)((List)e).get(i);
                        try {
                            list.addAll(this.j.a(amsh, aaag));
                        }
                        catch (final aaan aaan) {
                            final int b2 = aaag.b;
                            final String message = aaan.getMessage();
                            final StringBuilder sb = new StringBuilder("[Offline] Add additionAction failed for parentEntityType: ");
                            sb.append(b2);
                            sb.append(" ErrorMesasge: ");
                            sb.append(message);
                            trn.b(sb.toString());
                        }
                    }
                }
                aaao.h(aaag, aaaf, list, n, n2, false);
                set.addAll(aaao.c(list, aaag));
                set.addAll(aaao.f(aaag, aaag));
            }
            aaao.k(set);
            return;
        }
        throw null;
    }
    
    private static afcr c(final afcr afcr, final int b) {
        final afcm d = afcr.d();
        for (int i = 0; i < ((afgh)afcr).c; ++i) {
            final aaae b2 = aaaf.c.b();
            b2.b = b;
            d.h(b2.a());
        }
        return d.g();
    }
    
    @Override
    public final void run() {
        final Optional ofNullable = Optional.ofNullable((Object)this.i.g.get());
        if (!ofNullable.isPresent()) {
            return;
        }
        final aaao aaao = (aaao)ofNullable.get();
        final aaag a = aaao.a();
        if (a == null) {
            goto Label_0915;
        }
        Object seconds = this.h.get(a.b);
        if (seconds == null) {
            goto Label_0907;
        }
        final int c = a.c.c;
        ((aaai)seconds).getClass().getSimpleName();
        final afcr b = aaao.b(a, ((aaai)seconds).a(a.c));
        if (((afgh)b).c <= 1) {
            goto Label_0648;
        }
        final afif d = b.D();
        while (((Iterator)d).hasNext()) {
            aaao.n((aaag)((Iterator)d).next(), 3);
        }
        this.k.d();
        try {
            final zkh a2 = aaao.a;
            final afcm d2 = afcr.d();
            final afif d3 = b.D();
            while (((Iterator)d3).hasNext()) {
                try {
                    d2.h(((aaag)((Iterator)d3).next()).c);
                    continue;
                }
                catch (final TimeoutException seconds) {
                    goto Label_0269;
                }
                break;
            }
            final ListenableFuture c2 = ((aaai)seconds).c(a2, d2.g());
            seconds = TimeUnit.SECONDS;
            try {
                final afcr afcr = (afcr)c2.get(600L, (TimeUnit)seconds);
            }
            catch (final RuntimeException seconds) {}
            catch (final ExecutionException seconds) {}
            catch (final InterruptedException seconds) {}
            catch (final SQLiteException ex) {}
            catch (final TimeoutException ex2) {}
        }
        catch (final TimeoutException ex3) {}
        catch (final RuntimeException ex4) {}
        catch (final ExecutionException ex5) {}
        catch (final InterruptedException ex6) {}
        catch (final SQLiteException ex7) {}
        try {
            seconds = ((aaai)seconds).b(aaao.a, a.c).get(60L, TimeUnit.SECONDS);
            goto Label_0875;
        }
        catch (final TimeoutException ex8) {}
        catch (final RuntimeException ex9) {}
        catch (final ExecutionException ex10) {}
        catch (final InterruptedException ex11) {}
        catch (final SQLiteException ex12) {}
    }
}
