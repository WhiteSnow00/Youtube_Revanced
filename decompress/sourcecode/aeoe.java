import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeoe implements aum, avu, cgj, aud
{
    final /* synthetic */ aexq a;
    
    public aeoe(final aexq a) {
        this.a = a;
    }
    
    public final Context a() {
        return (Context)this.a.c();
    }
    
    public final cl b() {
        return ((bu)this.a.c()).getSupportFragmentManager();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ((qt)this.a.c()).getDefaultViewModelProviderFactory();
    }
    
    public final auh getLifecycle() {
        return ((dh)this.a.c()).getLifecycle();
    }
    
    public final cgh getSavedStateRegistry() {
        return ((qt)this.a.c()).getSavedStateRegistry();
    }
    
    public final avt getViewModelStore() {
        return ((qt)this.a.c()).getViewModelStore();
    }
}
