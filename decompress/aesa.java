import com.google.apps.tiktok.lifecycle.LifecycleMemoizingObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesa implements avs
{
    public final avq a(final Class clazz) {
        adme.L(LifecycleMemoizingObserver.class.equals(clazz), "This ViewModelProvider.Factory only supports LifecycleMemoizingObserver.");
        return (avq)new LifecycleMemoizingObserver();
    }
    
    public final avq b(final Class clazz, final avz avz) {
        return aqo.e((avs)this, clazz);
    }
}
