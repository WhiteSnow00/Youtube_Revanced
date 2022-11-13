// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.extensions;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import androidx.window.layout.WindowLayoutInfo;
import android.content.Context;

final class ExtensionWindowLayoutInfoBackend$MulticastConsumer implements ako
{
    private final Context context;
    private WindowLayoutInfo lastKnownValue;
    private final ReentrantLock multicastConsumerLock;
    private final Set registeredListeners;
    
    public ExtensionWindowLayoutInfoBackend$MulticastConsumer(final Context context) {
        context.getClass();
        this.context = context;
        this.multicastConsumerLock = new ReentrantLock();
        this.registeredListeners = new LinkedHashSet();
    }
    
    public void accept(final androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        final ReentrantLock multicastConsumerLock = this.multicastConsumerLock;
        multicastConsumerLock.lock();
        try {
            this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.context, windowLayoutInfo);
            final Iterator iterator = this.registeredListeners.iterator();
            while (iterator.hasNext()) {
                ((ako)iterator.next()).accept((Object)this.lastKnownValue);
            }
            multicastConsumerLock.unlock();
        }
        finally {
            multicastConsumerLock.unlock();
            while (true) {}
        }
    }
    
    public /* bridge */ void accept(final Object o) {
        this.accept((androidx.window.extensions.layout.WindowLayoutInfo)o);
    }
    
    public final void addListener(final ako ako) {
        ako.getClass();
        final ReentrantLock multicastConsumerLock = this.multicastConsumerLock;
        multicastConsumerLock.lock();
        try {
            final WindowLayoutInfo lastKnownValue = this.lastKnownValue;
            if (lastKnownValue != null) {
                ako.accept((Object)lastKnownValue);
            }
            this.registeredListeners.add(ako);
        }
        finally {
            multicastConsumerLock.unlock();
        }
    }
    
    public final boolean isEmpty() {
        return this.registeredListeners.isEmpty();
    }
    
    public final void removeListener(final ako ako) {
        ako.getClass();
        final ReentrantLock multicastConsumerLock = this.multicastConsumerLock;
        multicastConsumerLock.lock();
        try {
            this.registeredListeners.remove(ako);
        }
        finally {
            multicastConsumerLock.unlock();
        }
    }
}
