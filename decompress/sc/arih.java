import android.view.View$OnClickListener;
import android.os.Looper;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arih extends asht
{
    private final View a;
    
    public arih(final View a) {
        this.a = a;
    }
    
    @Override
    protected final void f(final ashy ashy) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ashy.d(asfn.c());
            ashy.b(new IllegalStateException("Expected to be called on the main thread but was ".concat(String.valueOf(Thread.currentThread().getName()))));
            return;
        }
        final arig onClickListener = new arig(this.a, ashy);
        ashy.d(onClickListener);
        this.a.setOnClickListener((View$OnClickListener)onClickListener);
    }
}
