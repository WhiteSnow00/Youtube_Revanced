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

public final class cok implements Runnable
{
    final Object a;
    final Object b;
    private final int c;
    
    public cok(final ViewPager b, final dvb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final ConstraintTrackingWorker b, final ListenableFuture a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final com b, final ListenableFuture a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final com b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final con b, final crk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final cqi b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final csy b, final ctn a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final csy b, final ctn a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final dac b, final dai a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final dhn b, final Runnable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final dmh a, final ViewTreeObserver$OnDrawListener b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cok(final dur b, final Runnable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final dvb a, final ViewPager b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cok(final dvj b, final Runnable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final eee a, final ebw b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cok(final eso b, final asjy a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final evz a, final Bundle b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cok(final fdu b, final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cok(final fjc a, final View b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cok(final List a, final cpz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cok(final Future a, final Runnable b, final int c) {
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
                    ((fjc)this.a).ae = ((View)this.b).getMeasuredWidth();
                    ((fjc)this.a).af = ((View)this.b).getMeasuredHeight();
                    ((fjc)this.a).aM();
                    return;
                }
                case 19: {
                    final Object b = this.b;
                    final Object a = this.a;
                    final Object a2 = ((fdu)b).a;
                    final String d = ((ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint)a).d;
                    final acxj acxj = (acxj)a2;
                    acxj.a();
                    final acjq acjq = acxj.d.get(d);
                    if (acjq == null) {
                        return;
                    }
                    final View view = ((acxz)acjq.d).get();
                    final akdp akdp = (akdp)((WeakReference)acjq.c).get();
                    final xab xab = (xab)((WeakReference)acjq.b).get();
                    final acxb acxb = (acxb)((WeakReference)acjq.a).get();
                    if (view != null && akdp != null && view.isShown() && view.isAttachedToWindow()) {
                        acxj.e(akdp, view, null, xab, acxj.b, true, acxb);
                        return;
                    }
                    acxj.d.remove(d);
                    return;
                }
                case 18: {
                    ((evz)this.a).j((Bundle)this.b);
                    return;
                }
                case 17: {
                    final Object b2 = this.b;
                    final Object a3 = this.a;
                    final eso eso = (eso)b2;
                    ((xck)eso.N.a()).h();
                    final tph l = eso.d.l;
                    final int n3 = eso.i.b(tov.n) * 5;
                    final asla i = l.a().R((asld)eso.bN).S(300L, TimeUnit.SECONDS, eso.b).L(eso.b);
                    final TimeUnit seconds = TimeUnit.SECONDS;
                    final askz b3 = eso.b;
                    int n4 = n3;
                    if (n3 == 0) {
                        n4 = 15;
                    }
                    i.u(n4, seconds, b3).ab((asmi)new esc(eso, 1), (asmi)new esc(eso, 0));
                    if (eso.i.m(tov.ac)) {
                        ((asjy)a3).V((asmc)new esd(eso, 0));
                    }
                    return;
                }
                case 16: {
                    eee.A((ebw)this.b, ((eee)this.a).k);
                    return;
                }
                case 15: {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    try {
                        Process.setThreadPriority(((dvj)this.b).a);
                    }
                    catch (final SecurityException ex) {
                        Process.setThreadPriority(((dvj)this.b).a + 1);
                    }
                    ((Runnable)this.a).run();
                    return;
                }
                case 14: {
                    ((ViewPager)this.b).j((cky)this.a);
                    return;
                }
                case 13: {
                    ((ViewPager)this.b).e((cky)this.a);
                    return;
                }
                case 12: {
                    synchronized (((dur)this.b).a) {
                        final Integer n5 = ((dur)this.b).a.get(this.a);
                        if (n5 != null) {
                            n = n2;
                            if (n5 > 0) {
                                n = 1;
                            }
                            final Integer value = n5 - 1;
                            if (value > 0) {
                                ((dur)this.b).a.put(this.a, value);
                            }
                            else {
                                ((dur)this.b).a.remove(this.a);
                            }
                        }
                        monitorexit(((dur)this.b).a);
                        if (n != 0) {
                            ((Runnable)this.a).run();
                        }
                    }
                }
                case 11: {
                    dkl.a().b();
                    ((dmi)((dmh)this.a).b).b = true;
                    ((View)((dmh)this.a).a).getViewTreeObserver().removeOnDrawListener((ViewTreeObserver$OnDrawListener)this.b);
                    ((dmi)((dmh)this.a).b).a.clear();
                    return;
                }
                case 10: {
                    if (((dhn)this.b).a) {
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
                    final dac dac = (dac)b4;
                    if (dac.q.n() != null) {
                        dac.q.n().d((dai)a4);
                        return;
                    }
                    if (dac.q.m() != null) {
                        dac.q.m().c((dai)a4, (List)afgh.q());
                        return;
                    }
                    dap.f("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
                case 8: {
                    final Object a5 = this.a;
                    final Object b5 = this.b;
                    if (!((Future)a5).isDone() && !((Future)a5).isCancelled()) {
                        ((Future)a5).cancel(true);
                        dap.f("BillingClient", "Async task is taking too long, cancel it!");
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
                            ctq.b(((ConstraintTrackingWorker)b6).i);
                        }
                        else {
                            ((ConstraintTrackingWorker)b6).i.e((ListenableFuture)a6);
                        }
                    }
                }
                case 6: {
                    if (((csy)this.b).e.isCancelled()) {
                        return;
                    }
                    try {
                        final cmn cmn = (cmn)((ctn)this.a).get();
                        if (cmn != null) {
                            cmv.a();
                            final Object b7 = this.b;
                            final ctn e = ((csy)b7).e;
                            final cmo d2 = ((csy)b7).d;
                            final Context a7 = ((csy)b7).a;
                            final UUID g = ((csy)b7).c.g();
                            final ctn f = ctn.f();
                            csn.b(((csz)d2).c, (Runnable)new axc((csz)d2, f, g, cmn, a7, 2));
                            e.e((ListenableFuture)f);
                            return;
                        }
                        final StringBuilder sb = new StringBuilder("Worker was marked important (");
                        sb.append(((csy)this.b).b.d);
                        sb.append(") but did not provide ForegroundInfo");
                        throw new IllegalStateException(sb.toString());
                    }
                    finally {
                        final Throwable t2;
                        ((csy)this.b).e.d(t2);
                        return;
                    }
                }
                case 5: {
                    final Object b8 = this.b;
                    final Object a8 = this.a;
                    final csy csy = (csy)b8;
                    if (!csy.e.isCancelled()) {
                        ((ctn)a8).e(csy.c.a());
                        return;
                    }
                    ((ctn)a8).cancel(true);
                    return;
                }
                case 4: {
                    final cnw f2 = ((cqi)this.b).b.f;
                    final Object a9 = this.a;
                    synchronized (f2.i) {
                        com com;
                        if ((com = f2.e.get(a9)) == null) {
                            com = f2.f.get(a9);
                        }
                        crk c2;
                        if (com != null) {
                            c2 = com.c;
                            monitorexit(f2.i);
                        }
                        else {
                            monitorexit(f2.i);
                            c2 = null;
                        }
                        if (c2 != null && c2.c()) {
                            monitorenter(((cqi)this.b).c);
                            try {
                                ((cqi)this.b).f.put(cim.b(c2), c2);
                                ((cqi)this.b).g.add(c2);
                                final Object b9 = this.b;
                                ((cqi)b9).h.a((Iterable)((cqi)b9).g);
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
                        ((cpd)iterator.next()).a(((cpz)b10).d);
                    }
                    return;
                }
                case 2: {
                    cmv.a();
                    final int d3 = con.d;
                    final crk crk = (crk)this.a;
                    final String c3 = crk.c;
                    ((con)this.b).a.c(new crk[] { crk });
                    return;
                }
                case 1: {
                    if (((com)this.b).g.isCancelled()) {
                        return;
                    }
                    break Label_1863;
                }
                case 0: {
                    Label_1924: {
                        break Label_1924;
                        try {
                            ((ListenableFuture)this.a).get();
                            cmv.a();
                            final Object b11 = this.b;
                            ((com)b11).g.e(((com)b11).d.b());
                            return;
                        }
                        finally {
                            final Throwable t3;
                            ((com)this.b).g.d(t3);
                            return;
                        }
                        try {
                            try {
                                final clo h = (clo)((com)this.b).g.get();
                                if (h == null) {
                                    cmv.a();
                                    final String a11 = com.a;
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append(((com)this.b).c.d);
                                    sb2.append(" returned a null result. Treating it as a failure.");
                                    Log.e(a11, sb2.toString());
                                }
                                else {
                                    cmv.a();
                                    final StringBuilder sb3 = new StringBuilder();
                                    sb3.append(((com)this.b).c.d);
                                    sb3.append(" returned a ");
                                    sb3.append(h);
                                    ((com)this.b).h = h;
                                }
                                ((com)this.b).b();
                                return;
                            }
                            finally {
                                ((com)this.b).b();
                                while (true) {}
                                cmv.a();
                                final String a12 = com.a;
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append((String)this.a);
                                sb4.append(" failed because it threw an exception/error");
                                final Throwable t4;
                                Log.e(a12, sb4.toString(), t4);
                                ((com)this.b).b();
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
