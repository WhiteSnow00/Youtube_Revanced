// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.extensions;

import androidx.window.core.ConsumerAdapter$Subscription;
import android.app.Activity;
import java.util.List;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.core.ExtensionsUtil;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Map;
import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.WindowBackend;

public final class ExtensionWindowLayoutInfoBackend implements WindowBackend
{
    private final WindowLayoutComponent component;
    private final ConsumerAdapter consumerAdapter;
    private final Map consumerToToken;
    private final Map contextToListeners;
    private final ReentrantLock extensionWindowBackendLock;
    private final Map listenerToContext;
    
    public ExtensionWindowLayoutInfoBackend(final WindowLayoutComponent component, final ConsumerAdapter consumerAdapter) {
        component.getClass();
        consumerAdapter.getClass();
        this.component = component;
        this.consumerAdapter = consumerAdapter;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.contextToListeners = new LinkedHashMap();
        this.listenerToContext = new LinkedHashMap();
        this.consumerToToken = new LinkedHashMap();
    }
    
    public final boolean hasRegisteredListeners() {
        return !this.contextToListeners.isEmpty() || !this.listenerToContext.isEmpty() || !this.consumerToToken.isEmpty();
    }
    
    public void registerLayoutChangeCallback(final Context context, final Executor executor, final akn akn) {
        context.getClass();
        executor.getClass();
        akn.getClass();
        final ReentrantLock extensionWindowBackendLock = this.extensionWindowBackendLock;
        extensionWindowBackendLock.lock();
        try {
            final ExtensionWindowLayoutInfoBackend$MulticastConsumer extensionWindowLayoutInfoBackend$MulticastConsumer = this.contextToListeners.get(context);
            atjv a;
            if (extensionWindowLayoutInfoBackend$MulticastConsumer != null) {
                extensionWindowLayoutInfoBackend$MulticastConsumer.addListener(akn);
                this.listenerToContext.put(akn, context);
                a = atjv.a;
            }
            else {
                a = null;
            }
            if (a == null) {
                final ExtensionWindowLayoutInfoBackend$MulticastConsumer extensionWindowLayoutInfoBackend$MulticastConsumer2 = new ExtensionWindowLayoutInfoBackend$MulticastConsumer(context);
                this.contextToListeners.put(context, extensionWindowLayoutInfoBackend$MulticastConsumer2);
                this.listenerToContext.put(akn, context);
                extensionWindowLayoutInfoBackend$MulticastConsumer2.addListener(akn);
                final ExtensionWindowLayoutInfoBackend$registerLayoutChangeCallback$1$2$consumeWindowLayoutInfo$1 extensionWindowLayoutInfoBackend$registerLayoutChangeCallback$1$2$consumeWindowLayoutInfo$1 = new ExtensionWindowLayoutInfoBackend$registerLayoutChangeCallback$1$2$consumeWindowLayoutInfo$1(extensionWindowLayoutInfoBackend$MulticastConsumer2);
                final int safeVendorApiLevel = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
                ConsumerAdapter$Subscription consumerAdapter$Subscription;
                if (safeVendorApiLevel != 1) {
                    if (safeVendorApiLevel != 2) {
                        extensionWindowLayoutInfoBackend$MulticastConsumer2.accept(new WindowLayoutInfo((List)atkh.a));
                        return;
                    }
                    consumerAdapter$Subscription = this.consumerAdapter.createSubscription((Object)this.component, atno.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", context, (atml)extensionWindowLayoutInfoBackend$registerLayoutChangeCallback$1$2$consumeWindowLayoutInfo$1);
                }
                else {
                    if (!(context instanceof Activity)) {
                        extensionWindowLayoutInfoBackend$MulticastConsumer2.accept(new WindowLayoutInfo((List)atkh.a));
                        return;
                    }
                    consumerAdapter$Subscription = this.consumerAdapter.createSubscription((Object)this.component, atno.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity)context, (atml)extensionWindowLayoutInfoBackend$registerLayoutChangeCallback$1$2$consumeWindowLayoutInfo$1);
                }
                this.consumerToToken.put(extensionWindowLayoutInfoBackend$MulticastConsumer2, consumerAdapter$Subscription);
            }
        }
        finally {
            extensionWindowBackendLock.unlock();
        }
    }
    
    public void unregisterLayoutChangeCallback(final akn akn) {
        akn.getClass();
        final ReentrantLock extensionWindowBackendLock = this.extensionWindowBackendLock;
        extensionWindowBackendLock.lock();
        try {
            final Context context = this.listenerToContext.get(akn);
            if (context == null) {
                return;
            }
            final ExtensionWindowLayoutInfoBackend$MulticastConsumer extensionWindowLayoutInfoBackend$MulticastConsumer = this.contextToListeners.get(context);
            if (extensionWindowLayoutInfoBackend$MulticastConsumer == null) {
                return;
            }
            extensionWindowLayoutInfoBackend$MulticastConsumer.removeListener(akn);
            this.listenerToContext.remove(akn);
            if (extensionWindowLayoutInfoBackend$MulticastConsumer.isEmpty()) {
                final ConsumerAdapter$Subscription consumerAdapter$Subscription = this.consumerToToken.remove(extensionWindowLayoutInfoBackend$MulticastConsumer);
                if (consumerAdapter$Subscription != null) {
                    consumerAdapter$Subscription.dispose();
                }
                this.contextToListeners.remove(context);
            }
        }
        finally {
            extensionWindowBackendLock.unlock();
        }
    }
}
