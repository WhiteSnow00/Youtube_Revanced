// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import android.app.Activity;

public final class ExtensionEmbeddingBackend$SplitListenerWrapper
{
    private final Activity activity;
    private final akn callback;
    private final Executor executor;
    private List lastValue;
    
    public ExtensionEmbeddingBackend$SplitListenerWrapper(final Activity activity, final Executor executor, final akn callback) {
        activity.getClass();
        executor.getClass();
        callback.getClass();
        this.activity = activity;
        this.executor = executor;
        this.callback = callback;
    }
    
    private static final void accept$lambda$1(final ExtensionEmbeddingBackend$SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper, final List list) {
        extensionEmbeddingBackend$SplitListenerWrapper.getClass();
        list.getClass();
        extensionEmbeddingBackend$SplitListenerWrapper.callback.accept((Object)list);
    }
    
    public final void accept(final List list) {
        list.getClass();
        final ArrayList lastValue = new ArrayList();
        for (final Object next : list) {
            if (((SplitInfo)next).contains(this.activity)) {
                lastValue.add(next);
            }
        }
        if (atnh.c((Object)lastValue, (Object)this.lastValue)) {
            return;
        }
        this.lastValue = lastValue;
        this.executor.execute(new ExtensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0(this, lastValue));
    }
    
    public final akn getCallback() {
        return this.callback;
    }
}
