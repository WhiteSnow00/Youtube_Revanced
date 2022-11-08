import android.content.Context;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpd
{
    private static gpd b;
    public boolean a;
    
    public gpd() {
        this.a = false;
    }
    
    public gpd(final byte[] array) {
    }
    
    private gpd(final byte[] array, final byte[] array2) {
        this.a = false;
    }
    
    public gpd(final char[] array) {
    }
    
    public static gpd i() {
        if (gpd.b == null) {
            gpd.b = new gpd(null, null);
        }
        return gpd.b;
    }
    
    public final void a() {
        monitorenter(this);
        try {
            while (!this.a) {
                this.wait();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b() {
        monitorenter(this);
        boolean b = false;
        try {
            while (!this.a) {
                try {
                    this.wait();
                }
                catch (final InterruptedException ex) {
                    b = true;
                }
            }
            if (b) {
                Thread.currentThread().interrupt();
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean c(long elapsedRealtime) {
        monitorenter(this);
        Label_0017: {
            if (elapsedRealtime > 0L) {
                break Label_0017;
            }
            try {
                final boolean a = this.a;
                monitorexit(this);
                return a;
                final long elapsedRealtime2 = SystemClock.elapsedRealtime();
                final long n = elapsedRealtime + elapsedRealtime2;
                elapsedRealtime = elapsedRealtime2;
                iftrue(Label_0046:)(n >= elapsedRealtime2);
                while (true) {
                    Block_5: {
                        while (true) {
                            Block_3: {
                                break Block_3;
                                iftrue(Label_0075:)(this.a || elapsedRealtime >= n);
                                break Block_5;
                                final boolean a2 = this.a;
                                monitorexit(this);
                                return a2;
                            }
                            this.a();
                            continue;
                        }
                    }
                    this.wait(n - elapsedRealtime);
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    continue;
                }
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final boolean e() {
        synchronized (this) {
            if (this.a) {
                return false;
            }
            this.a = true;
            this.notifyAll();
            return true;
        }
    }
    
    public final void f() {
        synchronized (this) {
            this.a = false;
        }
    }
    
    public final void g(final wzd wzd) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            final wzb d = wzd.d((Class)xcj.class, (wyz)new ffh(4));
            d.c((Class)xci.class);
            d.b((Class)xck.class);
            final wzb d2 = wzd.d((Class)xcd.class, (wyz)new ffh(3));
            d2.c((Class)xcl.class);
            d2.b((Class)xck.class);
            final wzb d3 = wzd.d((Class)xce.class, (wyz)new ffh(3));
            d3.c((Class)xcl.class);
            d3.b((Class)xck.class);
            final wzb d4 = wzd.d((Class)xcf.class, (wyz)new ffh(3));
            d4.c((Class)xcl.class);
            d4.b((Class)xck.class);
            wzd.j((Class)xcj.class, "mdx_cs");
            wzd.j((Class)xci.class, "mdx_cr");
            wzd.j((Class)xck.class, "mdx_off");
            wzd.j((Class)xcl.class, "mdx_sc");
            wzd.j((Class)xcd.class, "mdx_ccs");
            wzd.j((Class)xce.class, "mdx_ccp");
            wzd.j((Class)xcf.class, "mdx_ccst");
            this.a = true;
        }
    }
    
    public final void h() {
        this.a = true;
    }
    
    public final wfx j(final xkm xkm, final boolean b, final Context context, final oas oas, final tgw tgw, final adcr adcr, final xgc xgc, final wfw wfw, final boolean b2, final acko acko) {
        if (this.a && xkm != null) {
            return (wfx)new wur(context, tgw, adcr, xgc, new wev(), wfw, b2, acko, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        return (wfx)new wge(b, context, oas, xgc, wfw, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
