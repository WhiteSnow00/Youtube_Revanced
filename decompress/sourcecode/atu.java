import androidx.lifecycle.SavedStateHandleController;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atu extends avs implements avq
{
    private final cgh a;
    private final auh b;
    private final Bundle c;
    
    public atu(final cgj cgj, final Bundle c) {
        this.a = cgj.getSavedStateRegistry();
        this.b = cgj.getLifecycle();
        this.c = c;
    }
    
    private final avo e(final String s, final Class clazz) {
        final SavedStateHandleController d = apu.d(this.a, this.b, s, this.c);
        final avo d2 = this.d(clazz, d.b);
        d2.u((Object)d);
        return d2;
    }
    
    public final avo a(final Class clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.b != null) {
            return this.e(canonicalName, clazz);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
    
    public final avo b(final Class clazz, final avx avx) {
        final String s = (String)avx.a(avr.d);
        if (s != null) {
            return this.e(s, clazz);
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
    
    public final void c(final avo avo) {
        apu.e(avo, this.a, this.b);
    }
    
    protected abstract avo d(final Class p0, final avh p1);
}
