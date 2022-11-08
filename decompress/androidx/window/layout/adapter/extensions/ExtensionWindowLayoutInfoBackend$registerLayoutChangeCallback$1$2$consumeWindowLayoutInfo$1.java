// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;

final class ExtensionWindowLayoutInfoBackend$registerLayoutChangeCallback$1$2$consumeWindowLayoutInfo$1 extends atni implements atml
{
    final /* synthetic */ ExtensionWindowLayoutInfoBackend$MulticastConsumer $consumer;
    
    public ExtensionWindowLayoutInfoBackend$registerLayoutChangeCallback$1$2$consumeWindowLayoutInfo$1(final ExtensionWindowLayoutInfoBackend$MulticastConsumer $consumer) {
        this.$consumer = $consumer;
        super(1);
    }
    
    public final void invoke(final WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        this.$consumer.accept(windowLayoutInfo);
    }
}
