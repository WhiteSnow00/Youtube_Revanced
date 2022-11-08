// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import android.app.Activity;

public interface ExtensionInterfaceCompat
{
    void onWindowLayoutChangeListenerAdded(final Activity p0);
    
    void onWindowLayoutChangeListenerRemoved(final Activity p0);
    
    void setExtensionCallback(final ExtensionInterfaceCompat$ExtensionCallbackInterface p0);
    
    boolean validateExtensionInterface();
}
