import com.google.android.libraries.youtube.player.stats.HeartbeatClient$HeartbeatClientState;
import java.util.concurrent.atomic.AtomicInteger;
import java.security.SecureRandom;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absh
{
    public final vsi a;
    public final String b;
    public final absg c;
    public final akys d;
    public final byte[] e;
    public final String f;
    public volatile long g;
    public int h;
    public aapq i;
    private final oco j;
    private final Executor k;
    private final Handler l;
    private final SecureRandom m;
    private final wza n;
    private final Runnable o;
    private final AtomicInteger p;
    private volatile boolean q;
    
    public absh(final oco j, final Executor k, final Handler l, final SecureRandom m, final vsi a, final String b, final absg c, final akys d, final byte[] e, final String f, final wza n) {
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.n = n;
        this.p = new AtomicInteger();
        this.o = (Runnable)new abgl(this, 15);
    }
    
    public final HeartbeatClient$HeartbeatClientState a() {
        synchronized (this) {
            return new HeartbeatClient$HeartbeatClientState(this.d, this.e, this.f, this.g, this.h);
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.g == 0L) {
                this.g = this.j.d() + 2000L;
            }
        }
    }
    
    public final void c(final aapq i) {
        synchronized (this) {
            this.i = i;
            if (i.j() && !this.q && this.g != 0L && this.g <= this.j.d()) {
                this.q = true;
                this.k.execute(this.o);
            }
        }
    }
    
    public final void d(final ablo ablo, final akyz akyz, final boolean d) {
        this.p.set(0);
        this.q = false;
        this.g = 0L;
        final ahcr builder = akcy.a.createBuilder();
        if (akyz != null) {
            final ahbt q = akyz.q;
            builder.copyOnWrite();
            final akcy akcy = (akcy)builder.instance;
            q.getClass();
            akcy.b |= 0x1;
            akcy.c = q;
        }
        builder.copyOnWrite();
        final akcy akcy2 = (akcy)builder.instance;
        akcy2.b |= 0x2;
        akcy2.d = d;
        final akps d2 = akpu.d();
        ((ahcr)d2).copyOnWrite();
        akpu.o((akpu)d2.instance, (akcy)builder.build());
        this.n.d((akpu)((ahcr)d2).build());
        this.l.post((Runnable)new abse(this, ablo, 0));
    }
    
    public final void e() {
        this.p.set(0);
        this.q = false;
        this.g = this.j.d() + this.d.d;
    }
    
    public final void f(final Exception ex, int value) {
        final long n = this.p.incrementAndGet();
        final akys d = this.d;
        if (n <= d.e) {
            this.q = false;
            value = this.p.get();
            this.g = value * 2000 + this.j.d() + (this.m.nextInt(999) - 499);
            return;
        }
        if (d.g) {
            this.e();
            return;
        }
        this.d(new ablo(value, ex), null, true);
    }
}
