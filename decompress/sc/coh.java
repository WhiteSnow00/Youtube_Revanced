import java.util.Iterator;
import java.util.UUID;
import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import android.util.Log;
import android.os.StrictMode;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.Process;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import java.util.List;
import android.view.View;
import com.google.protos.youtube.api.innertube.ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
import android.os.Bundle;
import android.view.ViewTreeObserver$OnDrawListener;
import com.google.common.util.concurrent.ListenableFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.viewpager.widget.ViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coh implements Runnable
{
    final Object a;
    final Object b;
    private final int c;
    
    public coh(final ViewPager b, final duy a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final ConstraintTrackingWorker b, final ListenableFuture a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final coj b, final ListenableFuture a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final coj b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final cok b, final crh a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final cqf b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final csv b, final ctk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final csv b, final ctk a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final czz b, final daf a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final dhj b, final Runnable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final dme a, final ViewTreeObserver$OnDrawListener b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public coh(final duo b, final Runnable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final duy a, final ViewPager b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public coh(final dvg b, final Runnable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final eeb a, final ebt b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public coh(final esm b, final ashc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final evx a, final Bundle b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public coh(final fdr b, final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public coh(final fiz a, final View b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public coh(final List a, final cpw b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public coh(final Future a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        int n = 0;
        final int n2 = 0;
        Label_1863: {
            switch (c) {
                default: {
                    ((fiz)this.a).ae = ((View)this.b).getMeasuredWidth();
                    ((fiz)this.a).af = ((View)this.b).getMeasuredHeight();
                    ((fiz)this.a).aM();
                    return;
                }
                case 19: {
                    final Object b = this.b;
                    final Object a = this.a;
                    final Object a2 = ((fdr)b).a;
                    final String d = ((ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint)a).d;
                    final acvw acvw = (acvw)a2;
                    acvw.a();
                    final acid acid = acvw.d.get(d);
                    if (acid == null) {
                        return;
                    }
                    final View view = (View)((acwm)acid.d).get();
                    final akbo akbo = (akbo)((WeakReference)acid.c).get();
                    final wyw wyw = (wyw)((WeakReference)acid.b).get();
                    final acvo acvo = (acvo)((WeakReference)acid.a).get();
                    if (view != null && akbo != null && view.isShown() && view.isAttachedToWindow()) {
                        acvw.e(akbo, view, (Object)null, wyw, acvw.b, true, acvo);
                        return;
                    }
                    acvw.d.remove(d);
                    return;
                }
                case 18: {
                    ((evx)this.a).j((Bundle)this.b);
                    return;
                }
                case 17: {
                    final Object b2 = this.b;
                    final Object a3 = this.a;
                    final esm esm = (esm)b2;
                    ((xbd)esm.O.a()).h();
                    final toh l = esm.d.l;
                    final int n3 = esm.i.b(tnu.m) * 5;
                    final asie i = l.a().R((asih)esm.bN).S(300L, TimeUnit.SECONDS, esm.b).L(esm.b);
                    final TimeUnit seconds = TimeUnit.SECONDS;
                    final asid b3 = esm.b;
                    int n4 = n3;
                    if (n3 == 0) {
                        n4 = 15;
                    }
                    i.u(n4, seconds, b3).ab(new erz(esm, 1), new erz(esm, 0));
                    if (esm.i.m(tnu.ab)) {
                        ((ashc)a3).V(new esa(esm, 0));
                    }
                    return;
                }
                case 16: {
                    eeb.A((ebt)this.b, ((eeb)this.a).k);
                    return;
                }
                case 15: {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    try {
                        Process.setThreadPriority(((dvg)this.b).a);
                    }
                    catch (final SecurityException ex) {
                        Process.setThreadPriority(((dvg)this.b).a + 1);
                    }
                    ((Runnable)this.a).run();
                    return;
                }
                case 14: {
                    ((ViewPager)this.b).j((ckv)this.a);
                    return;
                }
                case 13: {
                    ((ViewPager)this.b).e((ckv)this.a);
                    return;
                }
                case 12: {
                    synchronized (((duo)this.b).a) {
                        final Integer n5 = ((duo)this.b).a.get(this.a);
                        if (n5 != null) {
                            n = n2;
                            if (n5 > 0) {
                                n = 1;
                            }
                            final Integer value = n5 - 1;
                            if (value > 0) {
                                ((duo)this.b).a.put(this.a, value);
                            }
                            else {
                                ((duo)this.b).a.remove(this.a);
                            }
                        }
                        monitorexit(((duo)this.b).a);
                        if (n != 0) {
                            ((Runnable)this.a).run();
                        }
                    }
                }
                case 11: {
                    dkh.a().b();
                    ((dmf)((dme)this.a).b).b = true;
                    ((View)((dme)this.a).a).getViewTreeObserver().removeOnDrawListener((ViewTreeObserver$OnDrawListener)this.b);
                    ((dmf)((dme)this.a).b).a.clear();
                    return;
                }
                case 10: {
                    if (((dhj)this.b).a) {
                        StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        ((Runnable)this.a).run();
                    }
                    finally {
                        if (Log.isLoggable("GlideExecutor", 6)) {
                            final Throwable t;
                            Log.e("GlideExecutor", "Request threw uncaught throwable", t);
                        }
                    }
                }
                case 9: {
                    final Object b4 = this.b;
                    final Object a4 = this.a;
                    final czz czz = (czz)b4;
                    if (czz.q.n() != null) {
                        czz.q.n().d((daf)a4);
                        return;
                    }
                    if (czz.q.m() != null) {
                        czz.q.m().c((daf)a4, (List)afeq.q());
                        return;
                    }
                    dam.f("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
                case 8: {
                    final Object a5 = this.a;
                    final Object b5 = this.b;
                    if (!((Future)a5).isDone() && !((Future)a5).isCancelled()) {
                        ((Future)a5).cancel(true);
                        dam.f("BillingClient", "Async task is taking too long, cancel it!");
                        if (b5 != null) {
                            ((Runnable)b5).run();
                        }
                    }
                    return;
                }
                case 7: {
                    final Object b6 = this.b;
                    final Object a6 = this.a;
                    synchronized (((ConstraintTrackingWorker)b6).b) {
                        if (((ConstraintTrackingWorker)b6).g) {
                            ctn.b(((ConstraintTrackingWorker)b6).i);
                        }
                        else {
                            ((ConstraintTrackingWorker)b6).i.e((ListenableFuture)a6);
                        }
                    }
                }
                case 6: {
                    if (((csv)this.b).e.isCancelled()) {
                        return;
                    }
                    try {
                        final cmk cmk = (cmk)((ctk)this.a).get();
                        if (cmk != null) {
                            cms.a();
                            final Object b7 = this.b;
                            final ctk e = ((csv)b7).e;
                            final cml d2 = ((csv)b7).d;
                            final Context a7 = ((csv)b7).a;
                            final UUID g = ((csv)b7).c.g();
                            final ctk f = ctk.f();
                            csl.b(((csw)d2).c, (Runnable)new axb((csw)d2, f, g, cmk, a7, 2));
                            e.e((ListenableFuture)f);
                            return;
                        }
                        final StringBuilder sb = new StringBuilder("Worker was marked important (");
                        sb.append(((csv)this.b).b.d);
                        sb.append(") but did not provide ForegroundInfo");
                        throw new IllegalStateException(sb.toString());
                    }
                    finally {
                        final Throwable t2;
                        ((csv)this.b).e.d(t2);
                        return;
                    }
                }
                case 5: {
                    final Object b8 = this.b;
                    final Object a8 = this.a;
                    final csv csv = (csv)b8;
                    if (!csv.e.isCancelled()) {
                        ((ctk)a8).e(csv.c.a());
                        return;
                    }
                    ((ctk)a8).cancel(true);
                    return;
                }
                case 4: {
                    final cnt f2 = ((cqf)this.b).b.f;
                    final Object a9 = this.a;
                    synchronized (f2.i) {
                        coj coj;
                        if ((coj = f2.e.get(a9)) == null) {
                            coj = f2.f.get(a9);
                        }
                        crh c2;
                        if (coj != null) {
                            c2 = coj.c;
                            monitorexit(f2.i);
                        }
                        else {
                            monitorexit(f2.i);
                            c2 = null;
                        }
                        if (c2 != null && c2.c()) {
                            monitorenter(((cqf)this.b).c);
                            try {
                                ((cqf)this.b).f.put(chu.j(c2), c2);
                                ((cqf)this.b).g.add(c2);
                                final Object b9 = this.b;
                                ((cqf)b9).h.a(((cqf)b9).g);
                            }
                            finally {}
                        }
                    }
                }
                case 3: {
                    final Object a10 = this.a;
                    final Object b10 = this.b;
                    final Iterator iterator = ((Iterable)a10).iterator();
                    while (iterator.hasNext()) {
                        ((cpa)iterator.next()).a(((cpw)b10).d);
                    }
                    return;
                }
                case 2: {
                    cms.a();
                    final int d3 = cok.d;
                    final crh crh = (crh)this.a;
                    final String c3 = crh.c;
                    ((cok)this.b).a.c(new crh[] { crh });
                    return;
                }
                case 1: {
                    if (((coj)this.b).g.isCancelled()) {
                        return;
                    }
                    break Label_1863;
                }
                case 0: {
                    Label_1924: {
                        break Label_1924;
                        try {
                            ((ListenableFuture)this.a).get();
                            cms.a();
                            final Object b11 = this.b;
                            ((coj)b11).g.e(((coj)b11).d.b());
                            return;
                        }
                        finally {
                            final Throwable t3;
                            ((coj)this.b).g.d(t3);
                            return;
                        }
                        try {
                            try {
                                final cky h = (cky)((coj)this.b).g.get();
                                if (h == null) {
                                    cms.a();
                                    final String a11 = coj.a;
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append(((coj)this.b).c.d);
                                    sb2.append(" returned a null result. Treating it as a failure.");
                                    Log.e(a11, sb2.toString());
                                }
                                else {
                                    cms.a();
                                    final StringBuilder sb3 = new StringBuilder();
                                    sb3.append(((coj)this.b).c.d);
                                    sb3.append(" returned a ");
                                    sb3.append(h);
                                    ((coj)this.b).h = h;
                                }
                                ((coj)this.b).b();
                                return;
                            }
                            finally {
                                ((coj)this.b).b();
                                while (true) {}
                                cms.a();
                                final String a12 = coj.a;
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append((String)this.a);
                                sb4.append(" failed because it threw an exception/error");
                                final Throwable t4;
                                Log.e(a12, sb4.toString(), t4);
                                ((coj)this.b).b();
                                return;
                            }
                        }
                        catch (final ExecutionException ex2) {}
                        catch (final InterruptedException ex3) {}
                        catch (final CancellationException ex4) {}
                    }
                    break;
                }
            }
        }
    }
}
