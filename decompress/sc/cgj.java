import java.util.Iterator;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0;
import androidx.savedstate.Recreator;
import java.util.concurrent.Executor;
import android.view.View;
import java.util.Set;
import android.app.Activity;
import android.graphics.Typeface;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgj
{
    public boolean a;
    public final Object b;
    public final Object c;
    
    public cgj() {
        this.c = new HashSet();
        this.b = new HashSet();
        this.a = false;
    }
    
    public cgj(final aclj c, final on... b) {
        this.a = false;
        this.c = c;
        this.b = b;
    }
    
    public cgj(final adxv b, final Typeface c) {
        this.c = c;
        this.b = b;
    }
    
    public cgj(final Activity activity, final Set c) {
        this.a = false;
        this.b = activity;
        this.c = c;
    }
    
    public cgj(final View c, final ega b) {
        this.c = c;
        this.b = b;
    }
    
    public cgj(final cgk b) {
        this.b = b;
        this.c = new cgi();
    }
    
    public cgj(final Executor b) {
        this.b = b;
        this.c = new HashSet();
    }
    
    public static final cgj a(final cgk cgk) {
        cgk.getClass();
        return new cgj(cgk);
    }
    
    public final void b() {
        final aui lifecycle = ((cgk)this.b).getLifecycle();
        lifecycle.getClass();
        if (lifecycle.a() != auh.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.b((aum)new Recreator((cgk)this.b));
        final cgi cgi = (cgi)this.c;
        if (!cgi.b) {
            lifecycle.b((aum)new SavedStateRegistry$$ExternalSyntheticLambda0(cgi));
            cgi.b = true;
            this.a = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }
    
    public final void c(Bundle bundle) {
        if (!this.a) {
            this.b();
        }
        final aui lifecycle = ((cgk)this.b).getLifecycle();
        lifecycle.getClass();
        if (lifecycle.a().a(auh.d)) {
            final StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            final auh a = lifecycle.a();
            sb.append(a);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(a)));
        }
        final cgi cgi = (cgi)this.c;
        if (!cgi.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (!cgi.d) {
            if (bundle != null) {
                bundle = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            else {
                bundle = null;
            }
            cgi.c = bundle;
            cgi.d = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
    
    public final void d(final Bundle bundle) {
        bundle.getClass();
        final Object c = this.c;
        final Bundle bundle2 = new Bundle();
        final cgi cgi = (cgi)c;
        final Bundle c2 = cgi.c;
        if (c2 != null) {
            bundle2.putAll(c2);
        }
        final ry f = cgi.a.f();
        while (((Iterator)f).hasNext()) {
            final rx rx = (rx)f.a();
            bundle2.putBundle((String)rx.a, ((cgh)rx.b).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
    
    public final Rect e() {
        final glo n = dvd.b((ega)this.b).n;
        if (n == null) {
            return null;
        }
        return n.f();
    }
    
    public final ListenableFuture f() {
        synchronized (this) {
            this.a = true;
            final ListenableFuture j = afwm.K((Iterable)this.c).j((Callable)eiz.e, (Executor)this.b);
            ((HashSet)this.c).clear();
            return j;
        }
    }
    
    public final ListenableFuture g(final oaa oaa) {
        synchronized (this) {
            if (this.a) {
                return afwm.k();
            }
            final ListenableFuture a = oaa.a();
            ((HashSet)this.c).add(a);
            afwm.w(a, (afva)new xzk(this, a, 1, (byte[])null), (Executor)this.b);
            return a;
        }
    }
    
    public final boolean h() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final void i() {
        if (!this.a) {
            final afke k = ((afiq)this.c).k();
            while (k.hasNext()) {
                ((dh)this.b).getLifecycle().b((aum)k.next());
            }
            this.a = true;
        }
    }
    
    public final void j() {
        this.a = true;
    }
    
    public final void k(final Typeface typeface) {
        if (!this.a) {
            ((adxv)this.b).a(typeface);
        }
    }
    
    public final void l() {
        this.k((Typeface)this.c);
    }
}
