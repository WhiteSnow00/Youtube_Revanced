import android.view.Window;
import android.view.View;
import android.content.Context;
import android.app.Activity;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class bt extends bz implements ahe, ahf, cy, cz, avv, ra, rj, cgk, cn, alm
{
    final bu a;
    
    public bt(final bu a) {
        super((Activity)(this.a = a), (Context)a, new Handler());
    }
    
    @Override
    public final View a(final int n) {
        return this.a.findViewById(n);
    }
    
    public final void addOnConfigurationChangedListener(final ako ako) {
        ((qt)this.a).addOnConfigurationChangedListener(ako);
    }
    
    @Override
    public final boolean b() {
        final Window window = this.a.getWindow();
        return window != null && window.peekDecorView() != null;
    }
    
    @Override
    public final void c() {
        this.a.invalidateOptionsMenu();
    }
    
    public final void d(final br br) {
        this.a.onAttachFragment(br);
    }
    
    public final ri getActivityResultRegistry() {
        return ((qt)this.a).getActivityResultRegistry();
    }
    
    public final aui getLifecycle() {
        return (aui)this.a.mFragmentLifecycleRegistry;
    }
    
    public final qz getOnBackPressedDispatcher() {
        return ((qt)this.a).getOnBackPressedDispatcher();
    }
    
    public final cgi getSavedStateRegistry() {
        return ((qt)this.a).getSavedStateRegistry();
    }
    
    public final avu getViewModelStore() {
        return ((qt)this.a).getViewModelStore();
    }
    
    public final void removeOnConfigurationChangedListener(final ako ako) {
        ((qt)this.a).removeOnConfigurationChangedListener(ako);
    }
}
