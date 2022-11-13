import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import java.util.Locale;
import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gup extends guq implements aeou, arlm, aepp, aetq
{
    private Context a;
    private final auo c;
    private boolean d;
    private iaj e;
    
    @Deprecated
    public gup() {
        this.c = new auo((aun)this);
        qdt.h();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.b.p();
        try {
            ((aepl)this).aS(layoutInflater, viewGroup, bundle);
            this.d();
            final View inflate = layoutInflater.inflate(2131625067, viewGroup, false);
            aeux.k();
            return inflate;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                hwo.c((Throwable)layoutInflater, t);
            }
        }
    }
    
    public final void V(final Activity activity) {
        this.b.p();
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
                hwo.c((Throwable)activity, t);
            }
        }
    }
    
    protected final /* bridge */ aepz a() {
        return (aepz)aept.b((br)this);
    }
    
    public final aeup aM() {
        return (aeup)this.b.c;
    }
    
    public final /* bridge */ Object aN() {
        return this.d();
    }
    
    public final Locale aO() {
        return agpi.Z((br)this);
    }
    
    public final iaj d() {
        final iaj e = this.e;
        if (e == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.d) {
            return e;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final aui getLifecycle() {
        return this.c;
    }
    
    public final void lP(final Context context) {
        this.b.p();
        try {
            if (!this.d) {
                super.lP(context);
                if (this.e == null) {
                    try {
                        this.aR();
                        this.e = new iaj();
                        ((br)this).X.b((aum)new TracedFragmentLifecycle(this.b, this.c, null));
                    }
                    catch (final ClassCastException ex) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ex);
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
                hwo.c(t, t2);
            }
        }
    }
    
    public final Context nT() {
        if (super.nT() != null) {
            if (this.a == null) {
                this.a = (Context)new aepq((br)this, super.nT());
            }
            return this.a;
        }
        return null;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        this.b.p();
        try {
            final LayoutInflater aa = ((br)this).aA();
            final LayoutInflater cloneInContext = aa.cloneInContext((Context)aepz.d(aa, (br)this));
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
                hwo.c((Throwable)bundle, t);
            }
        }
    }
    
    public final void nn() {
        final aett g = this.b.g();
        try {
            ((aepl)this).r();
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
                hwo.c(t, t2);
            }
        }
    }
    
    public final void sh(final aeup aeup, final boolean b) {
        this.b.j(aeup, b);
    }
}
