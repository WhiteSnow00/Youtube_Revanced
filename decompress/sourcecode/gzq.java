import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import java.util.concurrent.TimeUnit;
import android.view.ViewConfiguration;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzq implements hit
{
    public final View a;
    public boolean b;
    public boolean c;
    public boolean d;
    public hiu e;
    private final ScheduledExecutorService f;
    private final Runnable g;
    private ScheduledFuture h;
    private final avt i;
    private final qpt j;
    
    public gzq(final ScheduledExecutorService f, final View a, final qpt j, final avt i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        this.a = a;
        this.j = j;
        this.i = i;
        this.g = (Runnable)new gvu(this, i, 6, (byte[])null, (byte[])null, (byte[])null);
    }
    
    private final void h() {
        this.c = false;
        ((gzs)this.j.a).t();
    }
    
    public final void f() {
        final ScheduledFuture h = this.h;
        if (h != null && !h.isDone()) {
            h.cancel(false);
        }
        this.b = false;
    }
    
    public final void g() {
        this.c = false;
    }
    
    public final void nD() {
        if (this.d) {
            return;
        }
        this.f();
        if (this.c) {
            this.h();
            return;
        }
        this.c = true;
        final qpt j = this.j;
        final ShortsRecordButtonView g = ((gzs)j.a).g;
        g.getClass();
        if (g.isEnabled()) {
            final Object a = j.a;
            final gzs gzs = (gzs)a;
            if (gzs.x()) {
                final ShortsRecordButtonView g2 = gzs.g;
                g2.getClass();
                g2.h();
            }
            else {
                gzs.u(true);
                final tyh c = gzs.c;
                final Iterator<Object> iterator = ((Deque<Object>)c.d).iterator();
                while (iterator.hasNext()) {
                    final File file = new File(iterator.next().c);
                    if (file.exists()) {
                        file.delete();
                    }
                }
                ((Collection)c.d).clear();
                final gzq h = gzs.h;
                h.getClass();
                h.d = true;
                final tyf b = gzs.b;
                final tuv g3 = b.G();
                final agza builder = ((agzi)aqza.a).createBuilder();
                b.b.W();
                b.e = sl.c((acd)new xp(b.i, 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                gzs.j = afrp.e(afrp.f((ListenableFuture)aftj.m(sl.c((acd)new aav(b.j, g3, 6, (byte[])null, (byte[])null, (byte[])null))), (afry)new rki(b, builder, 9), (Executor)b.a), (aexg)new ifv(b, (tye)a, g3, builder, 3), (Executor)b.a);
                tcp.n(gzs.d, gzs.j, (trb)new gzr(gzs, 2), (trb)new gzr(gzs, 3));
            }
        }
        else {
            ((gzs)j.a).i((aexq)aewp.a, "recordButtonView is disabled, cannot record");
        }
        this.h = this.f.schedule(this.g, ViewConfiguration.getLongPressTimeout(), TimeUnit.MILLISECONDS);
    }
    
    public final void nE() {
        this.f();
        if (this.c) {
            this.i.S(wya.c(147678)).i();
            this.h();
        }
    }
    
    public final void nF() {
        if (this.b) {
            this.h();
        }
        else {
            if (this.c) {
                final ShortsRecordButtonView g = ((gzs)this.j.a).g;
                g.getClass();
                g.f();
            }
            this.i.S(wya.c(147678)).d();
        }
        this.f();
    }
    
    public final void nK(final float n) {
    }
}
