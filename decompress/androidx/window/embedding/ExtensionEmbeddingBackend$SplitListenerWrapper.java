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
    private final akp callback;
    private final Executor executor;
    private List lastValue;
    
    public static void $r8$lambda$II-g5TJn_0XMeuorRAEqwngDE3c(final ExtensionEmbeddingBackend$SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper, final List list) {
        accept$lambda$1(extensionEmbeddingBackend$SplitListenerWrapper, list);
    }
    
    public ExtensionEmbeddingBackend$SplitListenerWrapper(final Activity activity, final Executor executor, final akp callback) {
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
        if (atqz.c(lastValue, this.lastValue)) {
            return;
        }
        this.lastValue = lastValue;
        this.executor.execute(new ExtensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0(this, lastValue));
    }
    
    public final akp getCallback() {
        return this.callback;
    }
}
