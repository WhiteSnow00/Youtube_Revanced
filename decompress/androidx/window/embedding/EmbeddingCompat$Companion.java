// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.Method;

public final class EmbeddingCompat$Companion
{
    public static atnn $r8$lambda$6PyLpcVV902c0I_YKmt66yyoLX0(final Object o, final Method method, final Object[] array) {
        return embeddingComponent$lambda$1(o, method, array);
    }
    
    public static atnn $r8$lambda$LYyK7ytY5mU8W4eb_Z4KEMQSr64(final Object o, final Method method, final Object[] array) {
        return embeddingComponent$lambda$0(o, method, array);
    }
    
    private EmbeddingCompat$Companion() {
    }
    
    public EmbeddingCompat$Companion(final atqv atqv) {
        this();
    }
    
    private static final atnn embeddingComponent$lambda$0(final Object o, final Method method, final Object[] array) {
        return atnn.a;
    }
    
    private static final atnn embeddingComponent$lambda$1(final Object o, final Method method, final Object[] array) {
        return atnn.a;
    }
    
    public final ActivityEmbeddingComponent embeddingComponent() {
        ActivityEmbeddingComponent activityEmbeddingComponent;
        if (this.isEmbeddingAvailable()) {
            if ((activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent()) == null) {
                final Object proxyInstance = Proxy.newProxyInstance(EmbeddingCompat.class.getClassLoader(), new Class[] { ActivityEmbeddingComponent.class }, EmbeddingCompat$Companion$$ExternalSyntheticLambda0.INSTANCE);
                proxyInstance.getClass();
                activityEmbeddingComponent = (ActivityEmbeddingComponent)proxyInstance;
            }
        }
        else {
            final Object proxyInstance2 = Proxy.newProxyInstance(EmbeddingCompat.class.getClassLoader(), new Class[] { ActivityEmbeddingComponent.class }, EmbeddingCompat$Companion$$ExternalSyntheticLambda1.INSTANCE);
            proxyInstance2.getClass();
            activityEmbeddingComponent = (ActivityEmbeddingComponent)proxyInstance2;
        }
        return activityEmbeddingComponent;
    }
    
    public final boolean isEmbeddingAvailable() {
        boolean b = false;
        try {
            if (WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null) {
                b = true;
            }
            return b;
        }
        catch (final NoClassDefFoundError | UnsupportedOperationException ex) {
            return b;
        }
    }
}
