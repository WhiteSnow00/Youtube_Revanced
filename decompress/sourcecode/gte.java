import j$.util.Optional;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import android.util.LruCache;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gte
{
    public final atix a;
    public final LruCache b;
    public boolean c;
    private final abgp d;
    private final atjj e;
    private final afbi f;
    private final Executor g;
    private final asho h;
    private asic i;
    private ListenableFuture j;
    
    public gte(final abgp d, final atjj e, final Executor g, final asho h) {
        this.a = atix.e();
        this.f = afbi.b((int)Math.ceil(6.0) + 4);
        this.b = new LruCache((int)Math.ceil(6.0) + 4);
        this.c = false;
        this.i = (asic)asjh.a;
        this.j = afva.k();
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
    }
    
    private final void g() {
        if (!this.i.tx()) {
            this.i.dispose();
        }
    }
    
    public final void a(final int n, final long n2) {
        synchronized (this) {
            ((afbn)this.f).add((Object)new ynj(n, n2, (short[])null));
            if (((afbn)this.f).size() == 1) {
                this.e();
            }
        }
    }
    
    public final void b(final abgq abgq, final int n) {
        monitorenter(this);
        if (abgq != null) {
            if (n >= 0) {
                try {
                    final Bitmap a = abgq.a;
                    final LruCache b = this.b;
                    final Integer value = n;
                    if (!a.equals(b.get((Object)value))) {
                        this.b.put((Object)value, (Object)abgq.a.copy(Bitmap$Config.ARGB_8888, false));
                        this.a.tr((Object)value);
                    }
                    this.e();
                    return;
                }
                finally {
                    monitorexit(this);
                }
            }
        }
        monitorexit(this);
    }
    
    public final void c() {
        final jdt jdt = (jdt)this.e.a();
        this.g();
        this.i = ((asgt)jdt.q().e).P(this.h).am((asix)new grs(this, 6), (asix)gpa.j);
    }
    
    public final void d(final int n, final long n2, final int n3) {
        monitorenter(this);
        Label_0082: {
            Label_0049: {
                if (n3 == 8) {
                    Label_0089: {
                        try {
                            this.c = true;
                            ((afbn)this.f).add((Object)new ynj(n, n2, (short[])null));
                            break Label_0082;
                        }
                        finally {
                            break Label_0089;
                        }
                        break Label_0049;
                    }
                    monitorexit(this);
                }
            }
            if (n3 == 4) {
                ((afbn)this.f).add((Object)new ynj(n, n2, (short[])null));
            }
        }
        this.e();
        monitorexit(this);
    }
    
    public final void e() {
        synchronized (this) {
            if (!((afbn)this.f).isEmpty() && !this.c && this.j.isDone() && this.d.i()) {
                final ynj ynj = (ynj)((afbr)this.f).remove();
                final long a = ynj.a;
                final int b = ynj.b;
                szc.f();
                final abgp d = this.d;
                ListenableFuture j;
                if (d.i() && !d.m) {
                    final Optional optional = (Optional)d.e.aF();
                    if (optional != null && optional.isPresent()) {
                        final abgr abgr = (abgr)optional.get();
                        final int a2 = abgr.a(a);
                        if (a2 < 0) {
                            j = afva.l((Throwable)new Exception("2"));
                        }
                        else if (!d.n) {
                            d.n = true;
                            j = afva.r((afrx)new abgm(d, abgr, a2), d.b);
                        }
                        else {
                            j = afva.l((Throwable)new Exception("3"));
                        }
                    }
                    else {
                        j = afva.l((Throwable)new Exception("1"));
                    }
                }
                else {
                    j = afva.l((Throwable)new Exception("0"));
                }
                tcp.k(this.j = j, this.g, (tcn)new gtd(this, b, a), (tco)new lmq(this, b, 1));
            }
        }
    }
    
    public final void f() {
        this.g();
        ((afbn)this.f).clear();
        this.b.evictAll();
        this.j.cancel(true);
    }
}
