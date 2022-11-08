import java.util.concurrent.Executor;
import java.util.Collections;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import android.content.BroadcastReceiver$PendingResult;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coe extends cna
{
    public static final Object a;
    private static coe m;
    private static coe n;
    public Context b;
    public cmc c;
    public WorkDatabase d;
    public List e;
    public cns f;
    public boolean g;
    public BroadcastReceiver$PendingResult h;
    public volatile cto i;
    public final der j;
    public aja k;
    public avt l;
    
    static {
        cmr.b("WorkManagerImpl");
        coe.m = null;
        coe.n = null;
        a = new Object();
    }
    
    public coe(Context applicationContext, final cmc c, final aja k, final byte[] array, final byte[] array2, byte[] array3) {
        final boolean boolean1 = applicationContext.getResources().getBoolean(2131034156);
        final Context applicationContext2 = applicationContext.getApplicationContext();
        final Object c2 = k.c;
        applicationContext2.getClass();
        c2.getClass();
        cfr d;
        if (boolean1) {
            d = new cfr(applicationContext2, (Class)WorkDatabase.class, (String)null);
            d.d = true;
        }
        else {
            d = bsa.d(applicationContext2, (Class)WorkDatabase.class, "androidx.work.workdb");
            d.c = (cgo)new cnx(applicationContext2);
        }
        d.b = (Executor)c2;
        d.a.add(cnf.a);
        d.b(new cfy[] { cnk.c });
        d.b(new cfy[] { new cnt(applicationContext2, 2, 3) });
        d.b(new cfy[] { cnl.c });
        d.b(new cfy[] { cnm.c });
        d.b(new cfy[] { new cnt(applicationContext2, 5, 6) });
        d.b(new cfy[] { cnn.c });
        d.b(new cfy[] { cno.c });
        d.b(new cfy[] { cnp.c });
        d.b(new cfy[] { new cof(applicationContext2) });
        d.b(new cfy[] { new cnt(applicationContext2, 10, 11) });
        d.b(new cfy[] { cnh.c });
        d.b(new cfy[] { cni.c });
        d.b(new cfy[] { cnj.c });
        d.e = false;
        d.f = true;
        final WorkDatabase d2 = (WorkDatabase)d.a();
        final Context applicationContext3 = applicationContext.getApplicationContext();
        final int h = c.h;
        final cmr b = new cmr();
        array3 = (byte[])cmr.a;
        synchronized (array3) {
            cmr.b = b;
            monitorexit(array3);
            array3 = (byte[])(Object)new der(applicationContext3, k, (byte[])null, (byte[])null, (byte[])null);
            this.j = (der)(Object)array3;
            array3 = (byte[])(Object)Arrays.asList(cnv.a(applicationContext3, this), (cnu)new cok(applicationContext3, c, (der)(Object)array3, this, null));
            final cns f = new cns(applicationContext, c, k, d2, (List)(Object)array3, null, null, null);
            applicationContext = applicationContext.getApplicationContext();
            this.b = applicationContext;
            this.c = c;
            this.k = k;
            this.d = d2;
            this.e = (List)(Object)array3;
            this.f = f;
            this.l = new avt(d2);
            this.g = false;
            if (!cod.a(applicationContext)) {
                csk.b(this.k, (Runnable)new csg(applicationContext, this));
                return;
            }
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
    }
    
    public static coe j(Context applicationContext) {
        synchronized (coe.a) {
            synchronized (coe.a) {
                coe coe = coe.m;
                if (coe != null) {
                    monitorexit(coe.a);
                }
                else {
                    coe = coe.n;
                    monitorexit(coe.a);
                }
                coe j = coe;
                if (coe == null) {
                    applicationContext = applicationContext.getApplicationContext();
                    if (!(applicationContext instanceof cmb)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    k(applicationContext, ((cmb)applicationContext).a());
                    j = j(applicationContext);
                }
                return j;
            }
        }
    }
    
    public static void k(final Context context, final cmc cmc) {
        synchronized (coe.a) {
            final coe m = coe.m;
            if (m != null && coe.n != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (m == null) {
                final Context applicationContext = context.getApplicationContext();
                if (coe.n == null) {
                    coe.n = new coe(applicationContext, cmc, new aja(cmc.b), null, null, null);
                }
                coe.m = coe.n;
            }
        }
    }
    
    public final cmw a(final String s) {
        final cse b = cse.b(s, this, true);
        csk.b(this.k, (Runnable)b);
        return (cmw)b.d;
    }
    
    public final cmw b(final List list) {
        if (!list.isEmpty()) {
            return new cnw(this, null, 2, list, null).B();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
    
    public final ListenableFuture c(final String s) {
        final csp csp = new csp(this, s);
        ((csn)this.k.c).execute((Runnable)csp);
        return (ListenableFuture)((csq)csp).c;
    }
    
    public final cmw d(final String s, final int n, final List list) {
        return new cnw(this, s, n, list).B();
    }
    
    public final void e(final String s) {
        csk.b(this.k, (Runnable)new csc(this, s));
    }
    
    public final ListenableFuture f() {
        final cso cso = new cso(this);
        ((csn)this.k.c).execute((Runnable)cso);
        return (ListenableFuture)((csq)cso).c;
    }
    
    public final cmw h(final String s, int n, final eg eg) {
        final int n2 = 2;
        if (n == 2) {
            n = n2;
        }
        else {
            n = 1;
        }
        return new cnw(this, s, n, Collections.singletonList(eg)).B();
    }
    
    public final void l() {
        synchronized (coe.a) {
            this.g = true;
            final BroadcastReceiver$PendingResult h = this.h;
            if (h != null) {
                h.finish();
                this.h = null;
            }
        }
    }
    
    public final void m() {
        cow.a(this.b);
        final crh w = this.d.w();
        final crv crv = (crv)w;
        crv.a.j();
        final chb d = crv.f.d();
        crv.a.k();
        try {
            d.b();
            ((crv)w).a.n();
            crv.a.l();
            crv.f.f(d);
            cnv.b(this.c, this.d, this.e);
        }
        finally {
            crv.a.l();
            crv.f.f(d);
        }
    }
    
    public final void n(final avt avt) {
        this.o(avt, null);
    }
    
    public final void o(final avt avt, final chs chs) {
        csk.b(this.k, (Runnable)new cnr(this, avt, chs, 2, (byte[])null, (byte[])null));
    }
    
    public final void p(final avt avt) {
        csk.b(this.k, (Runnable)new csr(this, avt, false, (byte[])null, (byte[])null));
    }
}
