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

public final class cgm
{
    public boolean a;
    public final Object b;
    public final Object c;
    
    public cgm() {
        this.c = new HashSet();
        this.b = new HashSet();
        this.a = false;
    }
    
    public cgm(final acmw c, final oo... b) {
        this.a = false;
        this.c = c;
        this.b = b;
    }
    
    public cgm(final adzm b, final Typeface c) {
        this.c = c;
        this.b = b;
    }
    
    public cgm(final Activity activity, final Set c) {
        this.a = false;
        this.b = activity;
        this.c = c;
    }
    
    public cgm(final View c, final egd b) {
        this.c = c;
        this.b = b;
    }
    
    public cgm(final cgn b) {
        this.b = b;
        this.c = new cgl();
    }
    
    public cgm(final Executor b) {
        this.b = b;
        this.c = new HashSet();
    }
    
    public static final cgm a(final cgn cgn) {
        cgn.getClass();
        return new cgm(cgn);
    }
    
    public final void b() {
        final auk lifecycle = ((cgn)this.b).getLifecycle();
        lifecycle.getClass();
        if (lifecycle.a() != auj.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.b((auo)new Recreator((cgn)this.b));
        final cgl cgl = (cgl)this.c;
        if (!cgl.b) {
            lifecycle.b((auo)new SavedStateRegistry$$ExternalSyntheticLambda0(cgl));
            cgl.b = true;
            this.a = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }
    
    public final void c(Bundle bundle) {
        if (!this.a) {
            this.b();
        }
        final auk lifecycle = ((cgn)this.b).getLifecycle();
        lifecycle.getClass();
        if (lifecycle.a().a(auj.d)) {
            final StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            final auj a = lifecycle.a();
            sb.append(a);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(a)));
        }
        final cgl cgl = (cgl)this.c;
        if (!cgl.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (!cgl.d) {
            if (bundle != null) {
                bundle = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            else {
                bundle = null;
            }
            cgl.c = bundle;
            cgl.d = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
    
    public final void d(final Bundle bundle) {
        bundle.getClass();
        final Object c = this.c;
        final Bundle bundle2 = new Bundle();
        final cgl cgl = (cgl)c;
        final Bundle c2 = cgl.c;
        if (c2 != null) {
            bundle2.putAll(c2);
        }
        final rz f = cgl.a.f();
        while (((Iterator)f).hasNext()) {
            final ry ry = (ry)f.a();
            bundle2.putBundle((String)ry.a, ((cgk)ry.b).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
    
    public final Rect e() {
        final glt n = dvg.b((egd)this.b).n;
        if (n == null) {
            return null;
        }
        return n.f();
    }
    
    public final ListenableFuture f() {
        synchronized (this) {
            this.a = true;
            final ListenableFuture j = afxr.L((Iterable)this.c).j((Callable)ejc.f, (Executor)this.b);
            ((HashSet)this.c).clear();
            return j;
        }
    }
    
    public final ListenableFuture g(final oaq oaq) {
        synchronized (this) {
            if (this.a) {
                return afxr.j();
            }
            final ListenableFuture a = oaq.a();
            ((HashSet)this.c).add(a);
            afxr.v(a, (afwr)new ybk(this, a, 1, (byte[])null), (Executor)this.b);
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
            final aflu k = ((afkg)this.c).k();
            while (((Iterator)k).hasNext()) {
                ((dh)this.b).getLifecycle().b((auo)((Iterator)k).next());
            }
            this.a = true;
        }
    }
    
    public final void j() {
        this.a = true;
    }
    
    public final void k(final Typeface typeface) {
        if (!this.a) {
            ((adzm)this.b).a(typeface);
        }
    }
    
    public final void l() {
        this.k((Typeface)this.c);
    }
}
