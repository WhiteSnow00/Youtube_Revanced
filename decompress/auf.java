import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auf implements cgg
{
    auf() {
    }
    
    @Override
    public final void a(final cgk cgk) {
        if (cgk instanceof avv) {
            final avu viewModelStore = ((avv)cgk).getViewModelStore();
            final cgi savedStateRegistry = cgk.getSavedStateRegistry();
            final Iterator iterator = viewModelStore.b().iterator();
            while (iterator.hasNext()) {
                apv.e(viewModelStore.a((String)iterator.next()), savedStateRegistry, cgk.getLifecycle());
            }
            if (!viewModelStore.b().isEmpty()) {
                savedStateRegistry.d(auf.class);
            }
            return;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    }
}
