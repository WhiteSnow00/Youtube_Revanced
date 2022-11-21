import androidx.lifecycle.SavedStateHandleController;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atx extends avu implements avs
{
    private final cgl a;
    private final auk b;
    private final Bundle c;
    
    public atx(final cgn cgn, final Bundle c) {
        this.a = cgn.getSavedStateRegistry();
        this.b = cgn.getLifecycle();
        this.c = c;
    }
    
    private final avq e(final String s, final Class clazz) {
        final SavedStateHandleController i = apv.i(this.a, this.b, s, this.c);
        final avq d = this.d(clazz, i.b);
        d.u((Object)i);
        return d;
    }
    
    public final avq a(final Class clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.b != null) {
            return this.e(canonicalName, clazz);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
    
    public final avq b(final Class clazz, final avz avz) {
        final String s = (String)avz.a(avt.d);
        if (s != null) {
            return this.e(s, clazz);
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
    
    public final void c(final avq avq) {
        apv.j(avq, this.a, this.b);
    }
    
    protected abstract avq d(final Class p0, final avj p1);
}
