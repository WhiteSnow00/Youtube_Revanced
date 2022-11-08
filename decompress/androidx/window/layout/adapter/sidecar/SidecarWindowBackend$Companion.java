// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import androidx.window.core.Version;
import java.util.concurrent.locks.ReentrantLock;
import android.content.Context;

public final class SidecarWindowBackend$Companion
{
    private SidecarWindowBackend$Companion() {
    }
    
    public final SidecarWindowBackend getInstance(final Context context) {
        context.getClass();
        if (SidecarWindowBackend.access$getGlobalInstance$cp() == null) {
            final ReentrantLock access$getGlobalLock$cp = SidecarWindowBackend.access$getGlobalLock$cp();
            access$getGlobalLock$cp.lock();
            try {
                if (SidecarWindowBackend.access$getGlobalInstance$cp() == null) {
                    SidecarWindowBackend.access$setGlobalInstance$cp(new SidecarWindowBackend(SidecarWindowBackend.Companion.initAndVerifyExtension(context)));
                }
            }
            finally {
                access$getGlobalLock$cp.unlock();
            }
        }
        final SidecarWindowBackend access$getGlobalInstance$cp = SidecarWindowBackend.access$getGlobalInstance$cp();
        access$getGlobalInstance$cp.getClass();
        return access$getGlobalInstance$cp;
    }
    
    public final ExtensionInterfaceCompat initAndVerifyExtension(final Context context) {
        context.getClass();
        Object o2;
        final Object o = o2 = null;
        try {
            if (this.isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion())) {
                o2 = new SidecarCompat(context);
                if (!((SidecarCompat)o2).validateExtensionInterface()) {
                    return null;
                }
            }
            return (ExtensionInterfaceCompat)o2;
        }
        finally {
            o2 = o;
            return (ExtensionInterfaceCompat)o2;
        }
    }
    
    public final boolean isSidecarVersionSupported(final Version version) {
        return version != null && version.compareTo(Version.Companion.getVERSION_0_1()) >= 0;
    }
    
    public final void resetInstance() {
        SidecarWindowBackend.access$setGlobalInstance$cp((SidecarWindowBackend)null);
    }
}
