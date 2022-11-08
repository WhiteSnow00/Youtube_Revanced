import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejh implements aeoo
{
    public static final afik a;
    public static final long b;
    public final oas c;
    public final aeid d;
    public final aftr e;
    public final ahbd f;
    public final ahbd g;
    private final aeig h;
    private final aftr i;
    private final afss j;
    
    static {
        a = afik.m("com/google/apps/tiktok/account/storage/WipeoutAccountsTask");
        b = TimeUnit.DAYS.toMillis(30L);
    }
    
    public aejh(final oas c, final ahbd g, final aeig h, final aeid d, final aftr i, final aftr e, final ahbd f, final afss j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.g = g;
        this.h = h;
        this.d = d;
        this.i = i;
        this.e = e;
        this.f = f;
        this.j = j;
    }
    
    public final ListenableFuture a() {
        return this.j.b(aesm.c((afrx)new aeiq(this, 2)), (Executor)this.e);
    }
    
    public final ListenableFuture b() {
        final ListenableFuture a = this.a();
        final ListenableFuture f = afrp.f(afrp.f((ListenableFuture)aftj.m(this.h.e()), aesm.d((afry)new aacz(this, 15)), (Executor)this.e), aesm.d((afry)new aacz(this, 16)), (Executor)this.i);
        return afva.E(new ListenableFuture[] { a, f }).j(aesm.i((Callable)new aejg(a, f, 2)), (Executor)this.i);
    }
}
