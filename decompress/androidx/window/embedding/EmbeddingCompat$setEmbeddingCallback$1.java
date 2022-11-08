// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.ArrayList;
import java.util.List;

final class EmbeddingCompat$setEmbeddingCallback$1 extends atni implements atml
{
    final /* synthetic */ EmbeddingInterfaceCompat$EmbeddingCallbackInterface $embeddingCallback;
    final /* synthetic */ EmbeddingCompat this$0;
    
    public EmbeddingCompat$setEmbeddingCallback$1(final EmbeddingInterfaceCompat$EmbeddingCallbackInterface $embeddingCallback, final EmbeddingCompat this$0) {
        this.$embeddingCallback = $embeddingCallback;
        this.this$0 = this$0;
        super(1);
    }
    
    public final void invoke(final List list) {
        list.getClass();
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (next instanceof SplitInfo) {
                list2.add(next);
            }
        }
        this.$embeddingCallback.onSplitInfoChanged(EmbeddingCompat.access$getAdapter$p(this.this$0).translate(list2));
    }
}
