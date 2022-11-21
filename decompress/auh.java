import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auh implements cgj
{
    auh() {
    }
    
    @Override
    public final void a(final cgn cgn) {
        if (cgn instanceof avw) {
            final avv viewModelStore = ((avw)cgn).getViewModelStore();
            final cgl savedStateRegistry = cgn.getSavedStateRegistry();
            final Iterator iterator = viewModelStore.b().iterator();
            while (iterator.hasNext()) {
                apv.j(viewModelStore.a((String)iterator.next()), savedStateRegistry, cgn.getLifecycle());
            }
            if (!viewModelStore.b().isEmpty()) {
                savedStateRegistry.d(auh.class);
            }
            return;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    }
}
