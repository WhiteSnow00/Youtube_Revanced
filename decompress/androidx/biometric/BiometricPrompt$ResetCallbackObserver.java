// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import java.lang.ref.WeakReference;

public class BiometricPrompt$ResetCallbackObserver implements auc
{
    private final WeakReference a;
    
    public BiometricPrompt$ResetCallbackObserver(final sv sv) {
        this.a = new WeakReference((T)sv);
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
        if (this.a.get() != null) {
            ((sv)this.a.get()).u = null;
        }
    }
    
    public final void oT(final aup aup) {
    }
    
    public final void oY(final aup aup) {
    }
}
