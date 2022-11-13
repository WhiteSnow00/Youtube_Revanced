import java.util.Collection;
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

public final class cdj implements Runnable
{
    final Object a;
    private final int b;
    
    public cdj(final PreferenceGroup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final SwipeRefreshLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final ViewPager a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final CoroutineWorker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final Worker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final ConstraintTrackingWorker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final cdb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final cee a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final cey a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final cfb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final cfr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final cor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final ctk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final cuq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final dab a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final dak a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final dcm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final dnk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cdj(final mvx a, final int b, final byte[] array) {
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
                ((dnk)this.a).cancel(true);
                return;
            }
            case 18: {
                final Object a = this.a;
                ((dcm)a).c.a((dmi)a);
                return;
            }
            case 17: {
                final dab dab = (dab)this.a;
                dab.d.a = 0;
                dab.d.p = null;
                dab.a(dag.j);
                return;
            }
            case 16: {
                ((dak)this.a).c(dag.j, null);
                return;
            }
            case 15: {
                if (((cuq)this.a).b == null) {
                    return;
                }
                final cuo b = ((cuq)this.a).b;
                final Object a2 = b.a;
                if (a2 != null) {
                    ((cuq)this.a).b(a2);
                    return;
                }
                ((cuq)this.a).a(b.b);
                return;
            }
            case 14: {
                final Object a3 = this.a;
                final ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker)a3;
                if (constraintTrackingWorker.i.isCancelled()) {
                    return;
                }
                final cmr cmr = (cmr)a3;
                final String b2 = cmr.ln().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                cms.a().getClass();
                if (b2 == null || b2.length() == 0) {
                    Log.e(ctn.a, "No worker to delegate to.");
                    ctn.a(constraintTrackingWorker.i);
                    return;
                }
                constraintTrackingWorker.h = cmr.d.f.b(cmr.c, b2, constraintTrackingWorker.a);
                if (constraintTrackingWorker.h == null) {
                    final String a4 = ctn.a;
                    ctn.a(constraintTrackingWorker.i);
                    return;
                }
                final cof j = cof.j(cmr.c);
                final cri w = j.d.w();
                final String string = cmr.g().toString();
                string.getClass();
                final crh a5 = w.a(string);
                if (a5 == null) {
                    ctn.a(constraintTrackingWorker.i);
                    return;
                }
                final cpe cpe = new cpe(j.j, (cpc)a3, (byte[])null);
                cpe.a((Iterable)atvx.g((Object)a5));
                final String string2 = cmr.g().toString();
                string2.getClass();
                if (cpe.c(string2)) {
                    final String a6 = ctn.a;
                    try {
                        final cmr h = ((ConstraintTrackingWorker)a3).h;
                        h.getClass();
                        final ListenableFuture b3 = h.b();
                        b3.getClass();
                        b3.addListener((Runnable)new coh((ConstraintTrackingWorker)a3, b3, 7), ((cmr)a3).h());
                        return;
                    }
                    finally {
                        synchronized (constraintTrackingWorker.b) {
                            if (((ConstraintTrackingWorker)a3).g) {
                                ctn.b(((ConstraintTrackingWorker)a3).i);
                            }
                            else {
                                ctn.a(((ConstraintTrackingWorker)a3).i);
                            }
                            return;
                        }
                    }
                }
                final String a7 = ctn.a;
                ctn.b(constraintTrackingWorker.i);
                return;
            }
            case 13: {
                final Object a8 = this.a;
                final cor cor = (cor)a8;
                if (cor.f == 0) {
                    cor.f = 1;
                    cms.a();
                    final StringBuilder sb = new StringBuilder("onAllConstraintsMet for ");
                    final cqw c = cor.c;
                    sb.append(c);
                    c.toString();
                    if (cor.d.d.g(cor.k)) {
                        final cta c2 = cor.d.c;
                        final cqw c3 = cor.c;
                        synchronized (c2.d) {
                            cms.a();
                            new StringBuilder("Starting timer for ").append(c3);
                            c2.a(c3);
                            final csz csz = new csz(c2, c3, 0);
                            c2.b.put(c3, csz);
                            c2.c.put(c3, a8);
                            c2.a.b(600000L, (Runnable)csz);
                            return;
                        }
                    }
                    cor.a();
                    return;
                }
                cms.a();
                final StringBuilder sb2 = new StringBuilder("Already started work for ");
                final cqw c4 = cor.c;
                sb2.append(c4);
                c4.toString();
                return;
            }
            case 12: {
                final cor cor2 = (cor)this.a;
                if (cor2.f >= 2) {
                    cms.a();
                    return;
                }
                cor2.f = 2;
                cms.a();
                cor2.h.execute((Runnable)new cot(cor2.d, coo.f(cor2.a, cor2.c), cor2.b));
                if (cor2.d.d.e(cor2.c.a)) {
                    cms.a();
                    cor2.h.execute((Runnable)new cot(cor2.d, coo.e(cor2.a, cor2.c), cor2.b));
                    return;
                }
                cms.a();
                return;
            }
            case 11: {
                try {
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                }
                finally {
                    final Throwable t;
                    ((ctk)this.a).d(t);
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
                    aqsz.v((atrw)coroutineWorker.a);
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
                final Lock h2 = ((cfr)this.a).a.h();
                h2.lock();
                Label_1647: {
                    atle a14 = null;
                    try {
                        final Object a9 = this.a;
                        final cgm a10 = ((cfr)a9).a.a;
                        Boolean value;
                        if (a10 != null) {
                            value = a10.j();
                        }
                        else {
                            value = null;
                        }
                        if (atoc.c((Object)value, (Object)true)) {
                            if (!((cfr)a9).c) {
                                ((cfr)a9).a.c().a();
                            }
                            if (!((cfr)a9).c) {
                                Log.e("ROOM", "database is not initialized even though it is open");
                            }
                            else {
                                if (!((cfr)this.a).b.compareAndSet(true, false)) {
                                    h2.unlock();
                                    return;
                                }
                                if (((cfr)this.a).a.o()) {
                                    h2.unlock();
                                    return;
                                }
                                final cgm a11 = ((cfr)this.a).a.c().a();
                                a11.e();
                                try {
                                    final Object a12 = this.a;
                                    final Set b4 = atwm.b();
                                    Object o = ((cfr)a12).a.p((cgs)new cgl("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                                    try {
                                        while (((Cursor)o).moveToNext()) {
                                            b4.add(((Cursor)o).getInt(0));
                                        }
                                        aubn.c((Closeable)o, null);
                                        atwm.e(b4);
                                        if (!b4.isEmpty()) {
                                            if (((cfr)this.a).g == null) {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            o = ((cfr)this.a).g;
                                            if (o == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            ((chc)o).b();
                                        }
                                        a11.h();
                                    }
                                    finally {
                                        try {}
                                        finally {
                                            final Throwable t3;
                                            aubn.c((Closeable)o, t3);
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
                        final atle a13 = atle.a;
                    }
                    catch (final IllegalStateException ex2) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex2);
                        a14 = atle.a;
                    }
                    finally {
                        break Label_1647;
                    }
                    h2.unlock();
                    if (!((Collection)a14).isEmpty()) {
                        final Object a15 = this.a;
                        synchronized (((cfr)a15).d) {
                            final Iterator<Object> iterator = ((Iterable<Object>)((cfr)a15).d).iterator();
                            if (!iterator.hasNext()) {
                                return;
                            }
                            final bma bma = iterator.next().getValue();
                            throw null;
                        }
                    }
                    return;
                }
                h2.unlock();
                break;
            }
            case 5: {
                ((cfb)this.a).z();
                return;
            }
            case 4: {
                synchronized (this) {
                    ((PreferenceGroup)this.a).a.clear();
                }
            }
            case 3: {
                final RecyclerView b5 = ((cey)this.a).b;
                b5.focusableViewAvailable((View)b5);
                return;
            }
            case 2: {
                ((cee)this.a).aN();
                return;
            }
            case 1: {
                final Object a16 = this.a;
                final cdh h3 = ((cdb)a16).h;
                if (h3.d == a16) {
                    h3.k();
                }
                return;
            }
            case 0: {
                ((mvx)this.a).c();
            }
        }
    }
}
