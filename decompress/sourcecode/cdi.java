import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import com.google.common.util.concurrent.ListenableFuture;
import android.view.View;
import java.util.Map;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import android.util.Log;
import java.util.List;
import android.os.Process;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.Worker;
import androidx.work.CoroutineWorker;
import androidx.viewpager.widget.ViewPager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.preference.PreferenceGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdi implements Runnable
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public cdi(final PreferenceGroup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final ViewPager a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final Worker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final cda a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final ced a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final cex a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final cfa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final cfq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final ctj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final cup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final dcl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final dnj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdi(final mus a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                Process.setThreadPriority(10);
                ((Runnable)this.a).run();
                return;
            }
            case 19: {
                ((dnj)this.a).cancel(true);
                return;
            }
            case 18: {
                final Object a = this.a;
                ((dcl)a).c.a((dmh)a);
                return;
            }
            case 17: {
                final daa daa = (daa)this.a;
                daa.d.a = 0;
                daa.d.p = null;
                daa.a(daf.j);
                return;
            }
            case 16: {
                ((daj)this.a).c(daf.j, (List)null);
                return;
            }
            case 15: {
                if (((cup)this.a).b == null) {
                    return;
                }
                final cun b = ((cup)this.a).b;
                final Object a2 = b.a;
                if (a2 != null) {
                    ((cup)this.a).b(a2);
                    return;
                }
                ((cup)this.a).a(b.b);
                return;
            }
            case 14: {
                final Object a3 = this.a;
                final ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker)a3;
                if (constraintTrackingWorker.i.isCancelled()) {
                    return;
                }
                final cmq cmq = (cmq)a3;
                final String b2 = cmq.ln().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                cmr.a().getClass();
                if (b2 == null || b2.length() == 0) {
                    Log.e(ctm.a, "No worker to delegate to.");
                    ctm.a(constraintTrackingWorker.i);
                    return;
                }
                constraintTrackingWorker.h = cmq.d.f.b(cmq.c, b2, constraintTrackingWorker.a);
                if (constraintTrackingWorker.h == null) {
                    final String a4 = ctm.a;
                    ctm.a(constraintTrackingWorker.i);
                    return;
                }
                final coe j = coe.j(cmq.c);
                final crh w = j.d.w();
                final String string = cmq.g().toString();
                string.getClass();
                final crg a5 = w.a(string);
                if (a5 == null) {
                    ctm.a(constraintTrackingWorker.i);
                    return;
                }
                final cpd cpd = new cpd(j.j, (cpb)a3, null);
                cpd.a(aqzg.F((Object)a5));
                final String string2 = cmq.g().toString();
                string2.getClass();
                if (cpd.c(string2)) {
                    final String a6 = ctm.a;
                    try {
                        final cmq h = ((ConstraintTrackingWorker)a3).h;
                        h.getClass();
                        final ListenableFuture b3 = h.b();
                        b3.getClass();
                        b3.addListener((Runnable)new cog((ConstraintTrackingWorker)a3, b3, 7), ((cmq)a3).h());
                        return;
                    }
                    finally {
                        synchronized (constraintTrackingWorker.b) {
                            if (((ConstraintTrackingWorker)a3).g) {
                                ctm.b(((ConstraintTrackingWorker)a3).i);
                            }
                            else {
                                ctm.a(((ConstraintTrackingWorker)a3).i);
                            }
                            return;
                        }
                    }
                }
                final String a7 = ctm.a;
                ctm.b(constraintTrackingWorker.i);
                return;
            }
            case 13: {
                final Object a8 = this.a;
                final coq coq = (coq)a8;
                if (coq.f == 0) {
                    coq.f = 1;
                    cmr.a();
                    final StringBuilder sb = new StringBuilder("onAllConstraintsMet for ");
                    final cqv c = coq.c;
                    sb.append(c);
                    c.toString();
                    if (coq.d.d.g(coq.k)) {
                        final csz c2 = coq.d.c;
                        final cqv c3 = coq.c;
                        synchronized (c2.d) {
                            cmr.a();
                            new StringBuilder("Starting timer for ").append(c3);
                            c2.a(c3);
                            final csy csy = new csy(c2, c3, 0);
                            c2.b.put(c3, csy);
                            c2.c.put(c3, a8);
                            c2.a.b(600000L, (Runnable)csy);
                            return;
                        }
                    }
                    coq.a();
                    return;
                }
                cmr.a();
                final StringBuilder sb2 = new StringBuilder("Already started work for ");
                final cqv c4 = coq.c;
                sb2.append(c4);
                c4.toString();
                return;
            }
            case 12: {
                final coq coq2 = (coq)this.a;
                if (coq2.f >= 2) {
                    cmr.a();
                    return;
                }
                coq2.f = 2;
                cmr.a();
                coq2.h.execute((Runnable)new cos(coq2.d, con.f(coq2.a, coq2.c), coq2.b));
                if (coq2.d.d.e(coq2.c.a)) {
                    cmr.a();
                    coq2.h.execute((Runnable)new cos(coq2.d, con.e(coq2.a, coq2.c), coq2.b));
                    return;
                }
                cmr.a();
                return;
            }
            case 11: {
                try {
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                }
                finally {
                    final Throwable t;
                    ((ctj)this.a).d(t);
                }
            }
            case 10: {
                try {
                    ((Worker)this.a).a.g((Object)((Worker)this.a).c());
                }
                finally {
                    final Throwable t2;
                    ((Worker)this.a).a.d(t2);
                }
            }
            case 9: {
                final CoroutineWorker coroutineWorker = (CoroutineWorker)this.a;
                if (coroutineWorker.b.isCancelled()) {
                    aqql.r((atrb)coroutineWorker.a);
                }
                return;
            }
            case 8: {
                ((ViewPager)this.a).r(0);
                ((ViewPager)this.a).h();
                return;
            }
            case 7: {
                ((SwipeRefreshLayout)this.a).b();
                return;
            }
            case 6: {
                final Lock h2 = ((cfq)this.a).a.h();
                h2.lock();
                Label_1613: {
                    atkj a14 = null;
                    try {
                        final Object a9 = this.a;
                        final cgl a10 = ((cfq)a9).a.a;
                        Boolean value;
                        if (a10 != null) {
                            value = a10.j();
                        }
                        else {
                            value = null;
                        }
                        if (atnh.c(value, true)) {
                            if (!((cfq)a9).c) {
                                ((cfq)a9).a.c().a();
                            }
                            if (!((cfq)a9).c) {
                                Log.e("ROOM", "database is not initialized even though it is open");
                            }
                            else {
                                if (!((cfq)this.a).b.compareAndSet(true, false)) {
                                    h2.unlock();
                                    return;
                                }
                                if (((cfq)this.a).a.o()) {
                                    h2.unlock();
                                    return;
                                }
                                final cgl a11 = ((cfq)this.a).a.c().a();
                                a11.e();
                                try {
                                    final Object a12 = this.a;
                                    final Set f = atva.f();
                                    Object o = ((cfq)a12).a.p((cgr)new cgk("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                                    try {
                                        while (((Cursor)o).moveToNext()) {
                                            f.add(((Cursor)o).getInt(0));
                                        }
                                        atzz.c((Closeable)o, (Throwable)null);
                                        atva.i(f);
                                        if (!f.isEmpty()) {
                                            if (((cfq)this.a).g == null) {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            o = ((cfq)this.a).g;
                                            if (o == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            ((chb)o).b();
                                        }
                                        a11.h();
                                    }
                                    finally {
                                        try {}
                                        finally {
                                            final Throwable t3;
                                            atzz.c((Closeable)o, t3);
                                        }
                                    }
                                }
                                finally {
                                    a11.f();
                                }
                            }
                        }
                        h2.unlock();
                        return;
                    }
                    catch (final SQLiteException ex) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex);
                        final atkj a13 = atkj.a;
                    }
                    catch (final IllegalStateException ex2) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex2);
                        a14 = atkj.a;
                    }
                    finally {
                        break Label_1613;
                    }
                    h2.unlock();
                    if (!a14.isEmpty()) {
                        final Object a15 = this.a;
                        synchronized (((cfq)a15).d) {
                            final Iterator<Object> iterator = ((Iterable<Object>)((cfq)a15).d).iterator();
                            if (!iterator.hasNext()) {
                                return;
                            }
                            final blz blz = iterator.next().getValue();
                            throw null;
                        }
                    }
                    return;
                }
                h2.unlock();
                break;
            }
            case 5: {
                ((cfa)this.a).z();
                return;
            }
            case 4: {
                synchronized (this) {
                    ((PreferenceGroup)this.a).a.clear();
                }
            }
            case 3: {
                final RecyclerView b4 = ((cex)this.a).b;
                b4.focusableViewAvailable((View)b4);
                return;
            }
            case 2: {
                ((ced)this.a).aN();
                return;
            }
            case 1: {
                final Object a16 = this.a;
                final cdg h3 = ((cda)a16).h;
                if (h3.d == a16) {
                    h3.k();
                }
                return;
            }
            case 0: {
                ((mus)this.a).c();
            }
        }
    }
}
