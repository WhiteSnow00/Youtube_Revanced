// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.concurrent.locks.ReentrantLock;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.PredicateAdapter;
import androidx.window.core.ExtensionsUtil;

public final class ExtensionEmbeddingBackend$Companion
{
    private ExtensionEmbeddingBackend$Companion() {
    }
    
    public ExtensionEmbeddingBackend$Companion(final atqv atqv) {
        this();
    }
    
    private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
        final EmbeddingInterfaceCompat embeddingInterfaceCompat = null;
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = null;
        try {
            if (this.isExtensionVersionSupported(ExtensionsUtil.INSTANCE.getSafeVendorApiLevel()) && EmbeddingCompat.Companion.isEmbeddingAvailable()) {
                final ClassLoader classLoader = EmbeddingBackend.class.getClassLoader();
                if (classLoader != null) {
                    final EmbeddingCompat embeddingCompat = new EmbeddingCompat(EmbeddingCompat.Companion.embeddingComponent(), new EmbeddingAdapter(new PredicateAdapter(classLoader)), new ConsumerAdapter(classLoader));
                }
            }
        }
        finally {
            final Throwable t;
            new StringBuilder("Failed to load embedding extension: ").append(t);
            embeddingInterfaceCompat2 = embeddingInterfaceCompat;
        }
        return embeddingInterfaceCompat2;
    }
    
    public final ExtensionEmbeddingBackend getInstance() {
        if (ExtensionEmbeddingBackend.access$getGlobalInstance$cp() == null) {
            final ReentrantLock access$getGlobalLock$cp = ExtensionEmbeddingBackend.access$getGlobalLock$cp();
            access$getGlobalLock$cp.lock();
            try {
                if (ExtensionEmbeddingBackend.access$getGlobalInstance$cp() == null) {
                    ExtensionEmbeddingBackend.access$setGlobalInstance$cp(new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension()));
                }
            }
            finally {
                access$getGlobalLock$cp.unlock();
            }
        }
        final ExtensionEmbeddingBackend access$getGlobalInstance$cp = ExtensionEmbeddingBackend.access$getGlobalInstance$cp();
        access$getGlobalInstance$cp.getClass();
        return access$getGlobalInstance$cp;
    }
    
    public final boolean isExtensionVersionSupported(final Integer n) {
        return n != null && n > 0;
    }
}
