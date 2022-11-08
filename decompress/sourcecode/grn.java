import j$.time.Duration;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grn implements grj
{
    public final aeyr a;
    public final AtomicLong b;
    public final maw c;
    private final wyo e;
    private final Executor f;
    private final SecureRandom g;
    private final oas h;
    private final cya i;
    
    static {
        trn.a("Assistant");
    }
    
    public grn(final maw c, final wyo e, final Executor f, final SecureRandom g, final atjj atjj, final cya i, final oas h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = new AtomicLong();
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.a = agnj.E((aeyr)new grk(atjj, 0));
        this.i = i;
        this.h = h;
    }
    
    @Override
    public final ListenableFuture a() {
        final long c = this.h.c();
        final long millis = Duration.ofMinutes(((uyi)this.i.a).h(45373072L)).toMillis();
        if (millis != 0L && c - this.b.get() < millis) {
            this.b.toString();
            return afva.m((Object)false);
        }
        wyn wyn;
        if (this.g.nextFloat() < 0.01f) {
            final wyn c2 = this.e.c(alku.bT);
            if ((wyn = c2) != null) {
                c2.e();
                wyn = c2;
            }
        }
        else {
            wyn = null;
        }
        final ListenableFuture n = afld.n(afld.l((afrx)new htq(this, 1), this.f), (afry)grl.a, this.f);
        afld.o(n, (afsz)new grm(this, wyn, c), this.f);
        return afld.h(afld.m(n, (aexg)gku.g, this.f), (Class)Exception.class, (aexg)gku.h, this.f);
    }
}
