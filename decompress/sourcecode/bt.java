import android.view.Window;
import android.view.View;
import android.content.Context;
import android.app.Activity;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class bt extends bz implements ahd, ahe, cy, cz, avu, ra, rj, cgj, cn, all
{
    final /* synthetic */ bu a;
    
    public bt(final bu a) {
        this.a = a;
        super((Activity)a, (Context)a, new Handler());
    }
    
    public final View a(final int n) {
        return this.a.findViewById(n);
    }
    
    public final void addOnConfigurationChangedListener(final akn akn) {
        this.a.addOnConfigurationChangedListener(akn);
    }
    
    public final boolean b() {
        final Window window = this.a.getWindow();
        return window != null && window.peekDecorView() != null;
    }
    
    public final void c() {
        this.a.invalidateOptionsMenu();
    }
    
    public final void d(final br br) {
        this.a.onAttachFragment(br);
    }
    
    public final ri getActivityResultRegistry() {
        return this.a.getActivityResultRegistry();
    }
    
    public final auh getLifecycle() {
        return (auh)this.a.mFragmentLifecycleRegistry;
    }
    
    public final qz getOnBackPressedDispatcher() {
        return this.a.getOnBackPressedDispatcher();
    }
    
    public final cgh getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }
    
    public final avt getViewModelStore() {
        return this.a.getViewModelStore();
    }
    
    public final void removeOnConfigurationChangedListener(final akn akn) {
        this.a.removeOnConfigurationChangedListener(akn);
    }
}
