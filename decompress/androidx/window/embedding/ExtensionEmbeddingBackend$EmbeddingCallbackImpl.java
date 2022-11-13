// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import java.util.List;

public final class ExtensionEmbeddingBackend$EmbeddingCallbackImpl implements EmbeddingInterfaceCompat$EmbeddingCallbackInterface
{
    private List lastInfo;
    final ExtensionEmbeddingBackend this$0;
    
    public ExtensionEmbeddingBackend$EmbeddingCallbackImpl(final ExtensionEmbeddingBackend this$0) {
        this.this$0 = this$0;
    }
    
    public final List getLastInfo() {
        return this.lastInfo;
    }
    
    public void onSplitInfoChanged(final List lastInfo) {
        lastInfo.getClass();
        this.lastInfo = lastInfo;
        final Iterator iterator = this.this$0.getSplitChangeCallbacks().iterator();
        while (iterator.hasNext()) {
            ((ExtensionEmbeddingBackend$SplitListenerWrapper)iterator.next()).accept(lastInfo);
        }
    }
    
    public final void setLastInfo(final List lastInfo) {
        this.lastInfo = lastInfo;
    }
}
