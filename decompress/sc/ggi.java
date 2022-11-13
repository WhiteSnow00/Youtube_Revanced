import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import java.util.Locale;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggi extends ggf implements aeou, arlm, aepp, aetq
{
    private ggj a;
    private Context b;
    private final auo c;
    private boolean d;
    private final atib e;
    
    @Deprecated
    public ggi() {
        this.c = new auo((aun)this);
        this.e = new atib((br)this);
        qdt.h();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.e.p();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            final ggj r = this.r();
            if (r.a) {
                ((ggq)r.b).pF().b(xaa.b(148649), (aiqj)null, (alhi)null);
            }
            final View inflate = layoutInflater.inflate(2131625505, viewGroup, false);
            if (r.a) {
                ((ggq)r.b).pF().D((wzz)new wyt(xaa.c(147757)));
            }
            final View viewById = inflate.findViewById(2131430671);
            viewById.postDelayed((Runnable)new fsi(r, viewById, 5), 1000L);
            aeux.k();
            return inflate;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                ger.m((Throwable)viewGroup, t);
            }
        }
    }
    
    public final void T(final Bundle bundle) {
        this.e.p();
        try {
            super.T(bundle);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    public final void U(final int n, final int n2, final Intent intent) {
        final aett k = this.e.k();
        try {
            super.U(n, n2, intent);
            k.close();
        }
        finally {
            try {
                k.close();
            }
            finally {
                final Throwable t;
                ger.m((Throwable)intent, t);
            }
        }
    }
    
    public final void V(final Activity activity) {
        this.e.p();
        try {
            super.V(activity);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                ger.m((Throwable)activity, t);
            }
        }
    }
    
    public final void W() {
        final aett e = this.e.e();
        try {
            super.W();
            e.close();
        }
        finally {
            try {
                e.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    public final void Y() {
        this.e.p();
        try {
            super.Y();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    public final void aE(final MenuItem menuItem) {
        this.e.o().close();
    }
    
    public final void aI(final int n, final int n2) {
        this.e.m(n, n2);
        aeux.k();
    }
    
    public final aeup aM() {
        return (aeup)this.e.c;
    }
    
    public final /* bridge */ Object aN() {
        return this.r();
    }
    
    public final Locale aO() {
        return agpi.Z((br)this);
    }
    
    public final void aa() {
        final aett h = this.e.h();
        try {
            super.aa();
            h.close();
        }
        finally {
            try {
                h.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    public final void ab(final View view, final Bundle bundle) {
        this.e.p();
        aeux.k();
    }
    
    public final aui getLifecycle() {
        return (aui)this.c;
    }
    
    public final void lP(final Context context) {
        this.e.p();
        try {
            if (!this.d) {
                super.lP(context);
                if (this.a == null) {
                    try {
                        final Object ar = this.aR();
                        final br a = ((ess)ar).a;
                        if (!(a instanceof ggi)) {
                            final String string = ggj.class.toString();
                            final String value = String.valueOf(a.getClass());
                            final StringBuilder sb = new StringBuilder("Attempt to inject a Fragment wrapper of type ");
                            sb.append(string);
                            sb.append(", but the wrapper available is of type: ");
                            sb.append(value);
                            sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                            throw new IllegalStateException(sb.toString());
                        }
                        final ggi ggi = (ggi)a;
                        ggi.getClass();
                        this.a = new ggj(ggi, ((ess)ar).C());
                        ((aui)((br)this).X).b((aum)new TracedFragmentLifecycle(this.e, this.c, (byte[])null));
                    }
                    catch (final ClassCastException ex) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ex);
                    }
                }
                final br c = ((br)this).C;
                if (c instanceof aetq) {
                    final atib e = this.e;
                    if (e.c == null) {
                        e.j(((aetq)c).aM(), true);
                    }
                }
                aeux.k();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    public final Context nT() {
        if (super.nT() != null) {
            if (this.b == null) {
                this.b = (Context)new aepq((br)this, super.nT());
            }
            return this.b;
        }
        return null;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        this.e.p();
        try {
            final LayoutInflater aa = ((br)this).aA();
            final LayoutInflater cloneInContext = aa.cloneInContext((Context)arlc.f(aa, (br)this));
            final LayoutInflater cloneInContext2 = cloneInContext.cloneInContext((Context)new aepq((br)this, cloneInContext));
            aeux.k();
            return cloneInContext2;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                ger.m((Throwable)bundle, t);
            }
        }
    }
    
    public final void nm() {
        final aett f = this.e.f();
        try {
            super.nm();
            final ggj r = this.r();
            if (r.a) {
                ((ggq)r.b).pF().o((wzz)new wyt(xaa.c(147757)), (alhi)null);
            }
            f.close();
        }
        finally {
            try {
                f.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    public final void nn() {
        final aett g = this.e.g();
        try {
            super.nn();
            this.d = true;
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    public final void no() {
        this.e.p();
        try {
            super.no();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    public final void np() {
        this.e.p();
        try {
            super.np();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    public final void oq(final Bundle bundle) {
        this.e.p();
        try {
            super.oq(bundle);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                ger.m(t, t2);
            }
        }
    }
    
    protected final arlc p() {
        return (arlc)aepu.a((br)this);
    }
    
    public final void pP(final Bundle bundle) {
        this.e.p();
        aeux.k();
    }
    
    public final ggj r() {
        final ggj a = this.a;
        if (a == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.d) {
            return a;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void sh(final aeup aeup, final boolean b) {
        this.e.j(aeup, b);
    }
}
