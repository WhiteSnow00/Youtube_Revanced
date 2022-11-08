import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeit implements aeip
{
    public final aftr a;
    public final aftr b;
    public final atjj c;
    public final atjj d;
    public final atjj e;
    public final atjj f;
    public final atjj g;
    public final aagm h;
    
    public aeit(final aagm h, final aftr a, final aftr b, final atjj c, final atjj d, final atjj e, final atjj f, final atjj g, final byte[] array) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public static aehx a(final aejd aejd) {
        final AccountId b = AccountId.b(aejd.c);
        aehy aehy;
        if ((aehy = aejd.d) == null) {
            aehy = aehy.a;
        }
        int n;
        if ((n = afqg.n(aejd.e)) == 0) {
            n = 1;
        }
        return aehx.a(b, aehy, n);
    }
    
    public static ggc b(final Set set) {
        final ArrayList list = new ArrayList(set.size());
        for (final aeib aeib : set) {
            ListenableFuture listenableFuture;
            try {
                listenableFuture = aeib.a();
                list.add(listenableFuture);
            }
            catch (final Exception ex) {
                listenableFuture = afva.l((Throwable)ex);
            }
            aejp.b(listenableFuture, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return afva.D((Iterable)list);
    }
}
