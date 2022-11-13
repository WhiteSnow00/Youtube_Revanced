import com.google.android.libraries.youtube.player.stats.HeartbeatClient$HeartbeatClientState;
import java.util.concurrent.atomic.AtomicInteger;
import java.security.SecureRandom;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqw
{
    public final vqz a;
    public final String b;
    public final abqv c;
    public final akws d;
    public final byte[] e;
    public final String f;
    public volatile long g;
    public int h;
    public aant i;
    private final oby j;
    private final Executor k;
    private final Handler l;
    private final SecureRandom m;
    private final wxx n;
    private final Runnable o;
    private final AtomicInteger p;
    private volatile boolean q;
    
    public abqw(final oby j, final Executor k, final Handler l, final SecureRandom m, final vqz a, final String b, final abqv c, final akws d, final byte[] e, final String f, final wxx n) {
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
        this.o = (Runnable)new abei(this, 16);
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
    
    public final void c(final aant i) {
        synchronized (this) {
            this.i = i;
            if (i.j() && !this.q && this.g != 0L && this.g <= this.j.d()) {
                this.q = true;
                this.k.execute(this.o);
            }
        }
    }
    
    public final void d(final abkh abkh, final akwz akwz, final boolean d) {
        this.p.set(0);
        this.q = false;
        this.g = 0L;
        final ahaz builder = ((ahbh)akax.a).createBuilder();
        if (akwz != null) {
            final ahab q = akwz.q;
            builder.copyOnWrite();
            final akax akax = (akax)builder.instance;
            q.getClass();
            akax.b |= 0x1;
            akax.c = q;
        }
        builder.copyOnWrite();
        final akax akax2 = (akax)builder.instance;
        akax2.b |= 0x2;
        akax2.d = d;
        final aknr d2 = aknt.d();
        ((ahaz)d2).copyOnWrite();
        aknt.o((aknt)d2.instance, (akax)builder.build());
        this.n.d((aknt)((ahaz)d2).build());
        this.l.post((Runnable)new aaxb(this, abkh, 19));
    }
    
    public final void e() {
        this.p.set(0);
        this.q = false;
        this.g = this.j.d() + this.d.d;
    }
    
    public final void f(final Exception ex, int value) {
        final long n = this.p.incrementAndGet();
        final akws d = this.d;
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
        this.d(new abkh(value, (Throwable)ex), null, true);
    }
}
