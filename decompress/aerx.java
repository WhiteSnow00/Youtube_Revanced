import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aerx implements aup, avw, cgn, aug
{
    final afbh a;
    
    public aerx(final afbh a) {
        this.a = a;
    }
    
    public final Context a() {
        return (Context)this.a.c();
    }
    
    public final cl b() {
        return ((bu)this.a.c()).getSupportFragmentManager();
    }
    
    public final avz getDefaultViewModelCreationExtras() {
        return (avz)avx.a;
    }
    
    public final avs getDefaultViewModelProviderFactory() {
        return ((qu)this.a.c()).getDefaultViewModelProviderFactory();
    }
    
    public final auk getLifecycle() {
        return ((dh)this.a.c()).getLifecycle();
    }
    
    public final cgl getSavedStateRegistry() {
        return ((qu)this.a.c()).getSavedStateRegistry();
    }
    
    public final avv getViewModelStore() {
        return ((qu)this.a.c()).getViewModelStore();
    }
}
