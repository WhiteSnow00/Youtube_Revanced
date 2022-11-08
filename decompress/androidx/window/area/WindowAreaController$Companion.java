// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.area;

import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.core.VerificationMode;
import androidx.window.core.BuildConfig;
import androidx.window.extensions.WindowExtensionsProvider;

public final class WindowAreaController$Companion
{
    private static final UnsupportedOperationException REAR_DISPLAY_ERROR;
    private static final String TAG;
    private static WindowAreaControllerDecorator decorator;
    
    static {
        $$INSTANCE = new WindowAreaController$Companion();
        REAR_DISPLAY_ERROR = new UnsupportedOperationException("Rear Display mode cannot be enabled currently");
        TAG = atno.b((Class)WindowAreaController.class).c();
        WindowAreaController$Companion.decorator = (WindowAreaControllerDecorator)EmptyDecorator.INSTANCE;
    }
    
    private WindowAreaController$Companion() {
    }
    
    public final WindowAreaController getOrCreate() {
        WindowAreaComponent windowAreaComponent = null;
        try {
            WindowExtensionsProvider.getWindowExtensions().getWindowAreaComponent();
        }
        finally {
            BuildConfig.INSTANCE.getVerificationMode();
            final VerificationMode strict = VerificationMode.STRICT;
            windowAreaComponent = null;
        }
        Object o;
        if (windowAreaComponent == null) {
            o = new EmptyWindowAreaControllerImpl();
        }
        else {
            o = new WindowAreaControllerImpl(windowAreaComponent);
        }
        return WindowAreaController$Companion.decorator.decorate((WindowAreaController)o);
    }
    
    public final UnsupportedOperationException getREAR_DISPLAY_ERROR$window_release() {
        return WindowAreaController$Companion.REAR_DISPLAY_ERROR;
    }
    
    public final void overrideDecorator(final WindowAreaControllerDecorator decorator) {
        decorator.getClass();
        WindowAreaController$Companion.decorator = decorator;
    }
    
    public final void reset() {
        WindowAreaController$Companion.decorator = (WindowAreaControllerDecorator)EmptyDecorator.INSTANCE;
    }
}
