// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.area;

import j$.util.function.Consumer$_CC;
import androidx.window.core.VerificationMode;
import androidx.window.core.BuildConfig;
import androidx.window.extensions.area.WindowAreaComponent;
import java.util.function.Consumer;

public final class WindowAreaControllerImpl$RearDisplaySessionConsumer implements Consumer
{
    private final WindowAreaSessionCallback appCallback;
    private final WindowAreaComponent extensionsComponent;
    private WindowAreaSession session;
    
    public WindowAreaControllerImpl$RearDisplaySessionConsumer(final WindowAreaSessionCallback appCallback, final WindowAreaComponent extensionsComponent) {
        appCallback.getClass();
        extensionsComponent.getClass();
        this.appCallback = appCallback;
        this.extensionsComponent = extensionsComponent;
    }
    
    private final void onSessionFinished() {
        this.session = null;
        this.appCallback.onSessionEnded();
    }
    
    private final void onSessionStarted() {
        final RearDisplaySessionImpl session = new RearDisplaySessionImpl(this.extensionsComponent);
        this.session = (WindowAreaSession)session;
        this.appCallback.onSessionStarted((WindowAreaSession)session);
    }
    
    public void accept(final int n) {
        if (n == 0) {
            this.onSessionFinished();
            return;
        }
        if (n != 1) {
            if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.STRICT) {
                final WindowAreaControllerImpl$Companion companion = WindowAreaControllerImpl.Companion;
            }
            this.onSessionFinished();
            return;
        }
        this.onSessionStarted();
    }
}
