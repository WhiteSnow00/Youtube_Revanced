import java.io.File;
import android.app.Activity;
import android.view.View;
import java.util.Iterator;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.CountDownLatch;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class elq implements Runnable, elm
{
    public final AtomicReference a;
    public Context b;
    public final myj c;
    public final ehj d;
    public final boolean e;
    final CountDownLatch f;
    private final Executor g;
    private final List h;
    
    public elq(final Context b, final Executor g, final ehj d) {
        this.a = new AtomicReference();
        boolean e = true;
        this.f = new CountDownLatch(1);
        this.h = new ArrayList();
        this.d = d;
        this.b = b;
        this.g = g;
        mdx.b(b);
        if (!(boolean)mdx.d.e() || !d.g) {
            e = false;
        }
        this.e = e;
        this.c = myj.a(b, g, e);
        g.execute(this);
    }
    
    public static final Context a(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }
    
    private final void b() {
        if (!this.h.isEmpty()) {
            if (this.a.get() != null) {
                for (final Object[] array : this.h) {
                    final int length = array.length;
                    if (length == 1) {
                        this.a.get().h((MotionEvent)array[0]);
                    }
                    else {
                        if (length != 3) {
                            continue;
                        }
                        this.a.get().i((int)array[0], (int)array[1], (int)array[2]);
                    }
                }
                this.h.clear();
            }
        }
    }
    
    private final void j() {
        this.a.set(els.p(this.d.e, a(this.b), this.d.f));
    }
    
    @Deprecated
    public final String c(final Context context, final String s) {
        return this.d(context, s, null, null);
    }
    
    @Deprecated
    public final String d(final Context context, final String s, final View view, final Activity activity) {
        if (this.o()) {
            this.b();
            return this.a.get().d(a(context), s, view, activity);
        }
        return "";
    }
    
    public final String e(final Context context) {
        return this.f(context, null);
    }
    
    public final String f(final Context context, final byte[] array) {
        if (this.o()) {
            this.b();
            return this.a.get().e(a(context));
        }
        return "";
    }
    
    public final String g(final Context context, final View view, final Activity activity) {
        if (this.o()) {
            return this.a.get().g(context, view, activity);
        }
        return "";
    }
    
    public final void h(final MotionEvent motionEvent) {
        if (this.a.get() != null) {
            this.b();
            this.a.get().h(motionEvent);
            return;
        }
        this.h.add(new Object[] { motionEvent });
    }
    
    public final void i(final int n, final int n2, final int n3) {
        if (this.a.get() != null) {
            this.b();
            this.a.get().i(n, n2, n3);
            return;
        }
        this.h.add(new Object[] { n, n2, n3 });
    }
    
    public final void k(final View view) {
        if (this.a.get() != null) {
            this.a.get().k(view);
        }
    }
    
    public final boolean m() {
        return this.f.getCount() == 0L && this.a.get() != null && this.a.get().m();
    }
    
    public final boolean o() {
        final boolean b = false;
        try {
            this.f.await();
            boolean b2 = b;
            if (this.a.get() != null) {
                final boolean o = this.a.get().o();
                b2 = b;
                if (o) {
                    b2 = true;
                }
            }
            return b2;
        }
        catch (final InterruptedException ex) {
            return b;
        }
    }
    
    @Override
    public final void run() {
        final long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            try {
                int d;
                if ((d = epf.D(this.d.c)) == 0) {
                    d = 1;
                }
                while (true) {
                    Label_0261: {
                        Label_0035: {
                            if (d - 1 == 2) {
                                break Label_0035;
                            }
                            final int n = 2;
                            break Label_0261;
                        }
                        Object o = this.b;
                        final myv myv = new myv(this.b, ntc.T((Context)o, this.c), (myr)new elp(this, 0), (boolean)mdx.c.e());
                        final long currentTimeMillis2 = System.currentTimeMillis();
                        o = myv.a;
                        synchronized (o) {
                            final eny g = myv.g(1);
                            Label_0240: {
                                if (g == null) {
                                    myv.e(4025, currentTimeMillis2);
                                    monitorexit(o);
                                }
                                else {
                                    final File a = myv.a(g.c);
                                    if (!new File(a, "pcam.jar").exists()) {
                                        myv.e(4026, currentTimeMillis2);
                                        monitorexit(o);
                                    }
                                    else {
                                        if (new File(a, "pcbc").exists()) {
                                            myv.e(5019, currentTimeMillis2);
                                            monitorexit(o);
                                            break Label_0240;
                                        }
                                        myv.e(4027, currentTimeMillis2);
                                        monitorexit(o);
                                    }
                                }
                                if (this.d.d) {
                                    continue;
                                }
                            }
                            final int n = 3;
                            if (n - 1 != 2) {
                                this.j();
                                final int d2 = epf.D(this.d.c);
                                if (d2 != 0) {
                                    if (d2 == 3) {
                                        o = this.g;
                                        ((Executor)o).execute((Runnable)new dmc(this, 15));
                                    }
                                }
                            }
                            else {
                                final elk b = elk.b(this.d.e, a(this.b), this.g, this.d.f, this.e);
                                this.a.set(b);
                                if (!b.n() && this.d.d) {
                                    this.j();
                                }
                            }
                            this.b = null;
                            final CountDownLatch countDownLatch = this.f;
                            countDownLatch.countDown();
                        }
                    }
                    break;
                }
            }
            catch (final NullPointerException ex) {}
            finally {
                this.b = null;
                this.f.countDown();
                while (true) {}
                this.j();
                final NullPointerException ex2;
                this.c.c(2031, System.currentTimeMillis() - currentTimeMillis, (Exception)ex2);
                this.b = null;
                final CountDownLatch countDownLatch = this.f;
                continue;
            }
            break;
        }
    }
}
