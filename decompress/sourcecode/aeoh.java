import com.google.apps.tiktok.lifecycle.LifecycleMemoizingObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeoh implements avq
{
    public final avo a(final Class clazz) {
        agot.v(LifecycleMemoizingObserver.class.equals(clazz), (Object)"This ViewModelProvider.Factory only supports LifecycleMemoizingObserver.");
        return (avo)new LifecycleMemoizingObserver();
    }
}
