import androidx.lifecycle.SavedStateHandleController;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atv extends avt implements avr
{
    private final cgi a;
    private final aui b;
    private final Bundle c;
    
    public atv(final cgk cgk, final Bundle c) {
        this.a = cgk.getSavedStateRegistry();
        this.b = cgk.getLifecycle();
        this.c = c;
    }
    
    private final avp e(final String s, final Class clazz) {
        final SavedStateHandleController d = apv.d(this.a, this.b, s, this.c);
        final avp d2 = this.d(clazz, d.b);
        d2.u((Object)d);
        return d2;
    }
    
    public final avp a(final Class clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.b != null) {
            return this.e(canonicalName, clazz);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
    
    public final avp b(final Class clazz, final avy avy) {
        final String s = (String)avy.a(avs.d);
        if (s != null) {
            return this.e(s, clazz);
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
    
    public final void c(final avp avp) {
        apv.e(avp, this.a, this.b);
    }
    
    protected abstract avp d(final Class p0, final avi p1);
}
