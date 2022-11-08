import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.content.Intent;
import java.io.Closeable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public class aenl extends br implements aerp
{
    protected final athj b;
    
    public aenl() {
        this.b = new athj((br)this);
    }
    
    @Override
    public final void T(final Bundle bundle) {
        final aers i = this.b.i();
        try {
            super.T(bundle);
            atzz.c((Closeable)i, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                atzz.c((Closeable)i, t);
            }
        }
    }
    
    @Override
    public final void U(final int n, final int n2, final Intent intent) {
        final aers k = this.b.k();
        try {
            super.U(n, n2, intent);
            atzz.c((Closeable)k, null);
        }
        finally {
            try {}
            finally {
                atzz.c((Closeable)k, (Throwable)intent);
            }
        }
    }
    
    @Override
    public final void W() {
        final aers e = this.b.e();
        try {
            super.W();
            atzz.c((Closeable)e, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                atzz.c((Closeable)e, t);
            }
        }
    }
    
    @Override
    public final void aE(final MenuItem menuItem) {
        menuItem.getClass();
        atzz.c((Closeable)this.b.o(), null);
    }
    
    @Override
    public final void aI(final int n, final int n2) {
        atzz.c((Closeable)this.b.m(n, n2), null);
    }
    
    @Override
    public final void aJ(final int n, final int n2) {
        atzz.c((Closeable)this.b.m(n, n2), null);
    }
    
    protected final void aK() {
        super.aa();
    }
    
    protected final void aL() {
        super.no();
    }
    
    public aeso aM() {
        throw null;
    }
    
    protected final void aQ() {
        super.np();
    }
    
    protected final void aS(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        layoutInflater.getClass();
        super.K(layoutInflater, viewGroup, bundle);
    }
    
    @Override
    public final void ab(final View view, final Bundle bundle) {
        view.getClass();
        atzz.c((Closeable)this.b.i(), null);
    }
    
    @Override
    public void lP(final Context context) {
        super.lP(context);
        final br c = super.C;
        if (c instanceof aerp) {
            final athj b = this.b;
            if (b.c == null) {
                b.j(((aerp)c).aM(), true);
            }
        }
    }
    
    @Override
    public void nm() {
        final aers f = this.b.f();
        try {
            super.nm();
            atzz.c((Closeable)f, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                atzz.c((Closeable)f, t);
            }
        }
    }
    
    @Override
    public void no() {
        final aers i = this.b.i();
        try {
            super.no();
            atzz.c((Closeable)i, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                atzz.c((Closeable)i, t);
            }
        }
    }
    
    @Override
    public void np() {
        final aers i = this.b.i();
        try {
            super.np();
            atzz.c((Closeable)i, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                atzz.c((Closeable)i, t);
            }
        }
    }
    
    @Override
    public void oq(final Bundle bundle) {
        final aers i = this.b.i();
        try {
            super.oq(bundle);
            atzz.c((Closeable)i, null);
        }
        finally {
            try {}
            finally {
                atzz.c((Closeable)i, (Throwable)bundle);
            }
        }
    }
    
    protected final void p(final Bundle bundle) {
        super.oq(bundle);
    }
    
    @Override
    public void pK(final Bundle bundle) {
        atzz.c((Closeable)this.b.i(), null);
    }
    
    protected final void q() {
        super.nm();
    }
    
    protected final void r() {
        super.nn();
    }
    
    protected final void s() {
        super.Y();
    }
    
    public void sb(final aeso aeso, final boolean b) {
        throw null;
    }
}
