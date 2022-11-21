import java.util.Collection;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.Bundle;
import android.view.View;
import java.util.Map;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import android.util.Log;
import java.util.List;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.Worker;
import androidx.work.CoroutineWorker;
import androidx.viewpager.widget.ViewPager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.preference.PreferenceGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cde implements Runnable
{
    final Object a;
    private final int b;
    
    public cde(final PreferenceGroup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final SwipeRefreshLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final ViewPager a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final CoroutineWorker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final Worker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final ConstraintTrackingWorker a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final cdf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final ceh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final cfb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final cfe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final cfu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final cou a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final ctn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final cut a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final dae a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final dan a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final dcp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final dnn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cde(final mwm a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        int i = 0;
        switch (b) {
            default: {
                ((dnn)this.a).cancel(true);
                return;
            }
            case 19: {
                final Object a = this.a;
                ((dcp)a).c.a((dml)a);
                return;
            }
            case 18: {
                final dae dae = (dae)this.a;
                dae.d.a = 0;
                dae.d.p = null;
                dae.a(daj.j);
                return;
            }
            case 17: {
                ((dan)this.a).c(daj.j, (List)null);
                return;
            }
            case 16: {
                if (((cut)this.a).b == null) {
                    return;
                }
                final cur b2 = ((cut)this.a).b;
                final Object a2 = b2.a;
                if (a2 != null) {
                    ((cut)this.a).b(a2);
                    return;
                }
                ((cut)this.a).a(b2.b);
                return;
            }
            case 15: {
                final Object a3 = this.a;
                final ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker)a3;
                if (constraintTrackingWorker.i.isCancelled()) {
                    return;
                }
                final cmu cmu = (cmu)a3;
                final String b3 = cmu.ln().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                cmv.a().getClass();
                if (b3 == null || b3.length() == 0) {
                    Log.e(ctq.a, "No worker to delegate to.");
                    ctq.a(constraintTrackingWorker.i);
                    return;
                }
                constraintTrackingWorker.h = cmu.d.f.b(cmu.c, b3, constraintTrackingWorker.a);
                if (constraintTrackingWorker.h == null) {
                    final String a4 = ctq.a;
                    ctq.a(constraintTrackingWorker.i);
                    return;
                }
                final coi j = coi.j(cmu.c);
                final crl w = j.d.w();
                final String string = cmu.g().toString();
                string.getClass();
                final crk a5 = w.a(string);
                if (a5 == null) {
                    ctq.a(constraintTrackingWorker.i);
                    return;
                }
                final cph cph = new cph(j.j, (cpf)a3, (byte[])null);
                cph.a((Iterable)atzd.f((Object)a5));
                final String string2 = cmu.g().toString();
                string2.getClass();
                if (cph.c(string2)) {
                    final String a6 = ctq.a;
                    try {
                        final cmu h = ((ConstraintTrackingWorker)a3).h;
                        h.getClass();
                        final ListenableFuture b4 = h.b();
                        b4.getClass();
                        b4.addListener((Runnable)new cok((ConstraintTrackingWorker)a3, b4, 7), ((cmu)a3).h());
                        return;
                    }
                    finally {
                        synchronized (constraintTrackingWorker.b) {
                            if (((ConstraintTrackingWorker)a3).g) {
                                ctq.b(((ConstraintTrackingWorker)a3).i);
                            }
                            else {
                                ctq.a(((ConstraintTrackingWorker)a3).i);
                            }
                            return;
                        }
                    }
                }
                final String a7 = ctq.a;
                ctq.b(constraintTrackingWorker.i);
                return;
            }
            case 14: {
                final Object a8 = this.a;
                final cou cou = (cou)a8;
                if (cou.f == 0) {
                    cou.f = 1;
                    cmv.a();
                    final StringBuilder sb = new StringBuilder("onAllConstraintsMet for ");
                    final cqz c = cou.c;
                    sb.append(c);
                    c.toString();
                    if (cou.d.d.g(cou.k)) {
                        final ctd c2 = cou.d.c;
                        final cqz c3 = cou.c;
                        synchronized (c2.d) {
                            cmv.a();
                            new StringBuilder("Starting timer for ").append(c3);
                            c2.a(c3);
                            final ctc ctc = new ctc(c2, c3, 0);
                            c2.b.put(c3, ctc);
                            c2.c.put(c3, a8);
                            c2.a.b(600000L, (Runnable)ctc);
                            return;
                        }
                    }
                    cou.a();
                    return;
                }
                cmv.a();
                final StringBuilder sb2 = new StringBuilder("Already started work for ");
                final cqz c4 = cou.c;
                sb2.append(c4);
                c4.toString();
                return;
            }
            case 13: {
                final cou cou2 = (cou)this.a;
                if (cou2.f >= 2) {
                    cmv.a();
                    return;
                }
                cou2.f = 2;
                cmv.a();
                cou2.h.execute((Runnable)new cow(cou2.d, cor.f(cou2.a, cou2.c), cou2.b));
                if (cou2.d.d.e(cou2.c.a)) {
                    cmv.a();
                    cou2.h.execute((Runnable)new cow(cou2.d, cor.e(cou2.a, cou2.c), cou2.b));
                    return;
                }
                cmv.a();
                return;
            }
            case 12: {
                try {
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                }
                finally {
                    final Throwable t;
                    ((ctn)this.a).d(t);
                }
            }
            case 11: {
                try {
                    ((Worker)this.a).a.g((Object)((Worker)this.a).c());
                }
                finally {
                    final Throwable t2;
                    ((Worker)this.a).a.d(t2);
                }
            }
            case 10: {
                final CoroutineWorker coroutineWorker = (CoroutineWorker)this.a;
                if (coroutineWorker.b.isCancelled()) {
                    aqvr.s((atut)coroutineWorker.a);
                }
                return;
            }
            case 9: {
                ((ViewPager)this.a).r(0);
                ((ViewPager)this.a).h();
                return;
            }
            case 8: {
                ((SwipeRefreshLayout)this.a).b();
                return;
            }
            case 7: {
                final Lock h2 = ((cfu)this.a).a.h();
                h2.lock();
                Label_1782: {
                    atob a14 = null;
                    try {
                        final Object a9 = this.a;
                        final cgp a10 = ((cfu)a9).a.a;
                        Boolean value;
                        if (a10 != null) {
                            value = a10.j();
                        }
                        else {
                            value = null;
                        }
                        if (atqz.c(value, true)) {
                            if (!((cfu)a9).c) {
                                ((cfu)a9).a.c().a();
                            }
                            if (!((cfu)a9).c) {
                                Log.e("ROOM", "database is not initialized even though it is open");
                            }
                            else {
                                if (!((cfu)this.a).b.compareAndSet(true, false)) {
                                    h2.unlock();
                                    return;
                                }
                                if (((cfu)this.a).a.o()) {
                                    h2.unlock();
                                    return;
                                }
                                final cgp a11 = ((cfu)this.a).a.c().a();
                                a11.e();
                                try {
                                    final Object a12 = this.a;
                                    final Set c5 = atzj.c();
                                    Object o = ((cfu)a12).a.p(new cgo("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                                    try {
                                        while (((Cursor)o).moveToNext()) {
                                            c5.add(((Cursor)o).getInt(0));
                                        }
                                        auek.c((Closeable)o, null);
                                        atzj.f(c5);
                                        if (!c5.isEmpty()) {
                                            if (((cfu)this.a).g == null) {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            o = ((cfu)this.a).g;
                                            if (o == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            ((chf)o).b();
                                        }
                                        a11.h();
                                    }
                                    finally {
                                        try {}
                                        finally {
                                            final Throwable t3;
                                            auek.c((Closeable)o, t3);
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
                        final atob a13 = atob.a;
                    }
                    catch (final IllegalStateException ex2) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex2);
                        a14 = atob.a;
                    }
                    finally {
                        break Label_1782;
                    }
                    h2.unlock();
                    if (!((Collection)a14).isEmpty()) {
                        final Object a15 = this.a;
                        synchronized (((cfu)a15).d) {
                            final Iterator<Object> iterator = ((Iterable<Object>)((cfu)a15).d).iterator();
                            if (!iterator.hasNext()) {
                                return;
                            }
                            final bse bse = iterator.next().getValue();
                            throw null;
                        }
                    }
                    return;
                }
                h2.unlock();
                break;
            }
            case 6: {
                ((cfe)this.a).z();
                return;
            }
            case 5: {
                synchronized (this) {
                    ((PreferenceGroup)this.a).a.clear();
                }
            }
            case 4: {
                final RecyclerView b5 = ((cfb)this.a).b;
                b5.focusableViewAvailable((View)b5);
                return;
            }
            case 3: {
                ((ceh)this.a).aN();
                return;
            }
            case 2: {
                ((mwm)this.a).c();
                return;
            }
            case 1: {
                cdf cdf;
                for (cdf = (cdf)this.a; i < cdf.g.size(); ++i) {
                    ((bky)cdf.g.valueAt(i)).d(null, null);
                }
                cdf.g.clear();
                return;
            }
            case 0: {
                final Object a16 = this.a;
                final cdl h3 = ((cdf)a16).h;
                if (h3.d == a16) {
                    h3.k();
                }
            }
        }
    }
}
