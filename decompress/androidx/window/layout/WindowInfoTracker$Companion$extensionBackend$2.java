// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.core.ConsumerAdapter;
import androidx.window.layout.adapter.extensions.ExtensionWindowLayoutInfoBackend;

final class WindowInfoTracker$Companion$extensionBackend$2 extends atni implements atma
{
    public static final WindowInfoTracker$Companion$extensionBackend$2 INSTANCE;
    
    static {
        INSTANCE = new WindowInfoTracker$Companion$extensionBackend$2();
    }
    
    public WindowInfoTracker$Companion$extensionBackend$2() {
        super(0);
    }
    
    public final ExtensionWindowLayoutInfoBackend invoke() {
        final ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
        ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend3 = null;
        try {
            final ClassLoader classLoader = WindowInfoTracker.class.getClassLoader();
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider;
            if (classLoader != null) {
                safeWindowLayoutComponentProvider = new SafeWindowLayoutComponentProvider(classLoader, new ConsumerAdapter(classLoader));
            }
            else {
                safeWindowLayoutComponentProvider = null;
            }
            if (safeWindowLayoutComponentProvider != null) {
                final WindowLayoutComponent windowLayoutComponent = safeWindowLayoutComponentProvider.getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    classLoader.getClass();
                    final ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend2 = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent, new ConsumerAdapter(classLoader));
                }
            }
        }
        finally {
            final int a = WindowInfoTracker$Companion.a;
            extensionWindowLayoutInfoBackend3 = extensionWindowLayoutInfoBackend;
        }
        return extensionWindowLayoutInfoBackend3;
    }
}
