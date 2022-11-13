import j$.time.Duration;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gru implements grq
{
    public static final int d = 0;
    public final afaq a;
    public final AtomicLong b;
    public final mcb c;
    private final xao e;
    private final Executor f;
    private final SecureRandom g;
    private final oby h;
    private final cyb i;
    
    static {
        ttr.a("Assistant");
    }
    
    public gru(final mcb c, final xao e, final Executor f, final SecureRandom g, final atke atke, final cyb i, final oby h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = new AtomicLong();
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.a = adyf.A((afaq)new grr(atke, 0));
        this.i = i;
        this.h = h;
    }
    
    public final ListenableFuture a() {
        final long c = this.h.c();
        final long millis = Duration.ofMinutes(((vai)this.i.a).h(45373072L)).toMillis();
        if (millis != 0L && c - this.b.get() < millis) {
            this.b.toString();
            return afwm.m((Object)false);
        }
        xan xan;
        if (this.g.nextFloat() < 0.01f) {
            final xan c2 = this.e.c(almx.bT);
            if ((xan = c2) != null) {
                c2.e();
                xan = c2;
            }
        }
        else {
            xan = null;
        }
        final ListenableFuture r = afnd.r(afnd.p((afty)new hul(this, 1), this.f), (aftz)grs.a, this.f);
        afnd.s(r, (afva)new grt(this, xan, c), this.f);
        return afnd.l(afnd.q(r, (aezf)glc.g, this.f), (Class)Exception.class, (aezf)glc.h, this.f);
    }
}
