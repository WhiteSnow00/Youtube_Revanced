import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aue implements cgf
{
    aue() {
    }
    
    public final void a(final cgj cgj) {
        if (cgj instanceof avu) {
            final avt viewModelStore = ((avu)cgj).getViewModelStore();
            final cgh savedStateRegistry = cgj.getSavedStateRegistry();
            final Iterator iterator = viewModelStore.b().iterator();
            while (iterator.hasNext()) {
                apu.e(viewModelStore.a((String)iterator.next()), savedStateRegistry, cgj.getLifecycle());
            }
            if (!viewModelStore.b().isEmpty()) {
                savedStateRegistry.d((Class)aue.class);
            }
            return;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    }
}
