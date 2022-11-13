// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import androidx.window.core.ConsumerAdapter;

public final class SafeWindowLayoutComponentProvider
{
    private final ConsumerAdapter consumerAdapter;
    private final ClassLoader loader;
    
    public SafeWindowLayoutComponentProvider(final ClassLoader loader, final ConsumerAdapter consumerAdapter) {
        loader.getClass();
        consumerAdapter.getClass();
        this.loader = loader;
        this.consumerAdapter = consumerAdapter;
    }
    
    public static final boolean access$doesReturn(final SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, final Method method, final atow atow) {
        return safeWindowLayoutComponentProvider.doesReturn(method, atow);
    }
    
    public static final boolean access$doesReturn(final SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, final Method method, final Class clazz) {
        return safeWindowLayoutComponentProvider.doesReturn(method, clazz);
    }
    
    public static final ConsumerAdapter access$getConsumerAdapter$p(final SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        return safeWindowLayoutComponentProvider.consumerAdapter;
    }
    
    public static final Class access$getFoldingFeatureClass(final SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        return safeWindowLayoutComponentProvider.getFoldingFeatureClass();
    }
    
    public static final Class access$getWindowExtensionsClass(final SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        return safeWindowLayoutComponentProvider.getWindowExtensionsClass();
    }
    
    public static final Class access$getWindowExtensionsProviderClass(final SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        return safeWindowLayoutComponentProvider.getWindowExtensionsProviderClass();
    }
    
    public static final Class access$getWindowLayoutComponentClass(final SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        return safeWindowLayoutComponentProvider.getWindowLayoutComponentClass();
    }
    
    public static final boolean access$isPublic(final SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, final Method method) {
        return safeWindowLayoutComponentProvider.isPublic(method);
    }
    
    private final boolean canUseWindowLayoutComponent() {
        return this.isWindowLayoutProviderValid() && this.isWindowExtensionsValid() && this.isWindowLayoutComponentValid() && this.isFoldingFeatureValid();
    }
    
    private final boolean doesReturn(final Method method, final atow atow) {
        return this.doesReturn(method, auby.c(atow));
    }
    
    private final boolean doesReturn(final Method method, final Class clazz) {
        return method.getReturnType().equals(clazz);
    }
    
    private final Class getFoldingFeatureClass() {
        final Class<?> loadClass = this.loader.loadClass("androidx.window.extensions.layout.FoldingFeature");
        loadClass.getClass();
        return loadClass;
    }
    
    private final Class getWindowExtensionsClass() {
        final Class<?> loadClass = this.loader.loadClass("androidx.window.extensions.WindowExtensions");
        loadClass.getClass();
        return loadClass;
    }
    
    private final Class getWindowExtensionsProviderClass() {
        final Class<?> loadClass = this.loader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        loadClass.getClass();
        return loadClass;
    }
    
    private final Class getWindowLayoutComponentClass() {
        final Class<?> loadClass = this.loader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        return loadClass;
    }
    
    private final boolean isFoldingFeatureValid() {
        return this.validate((atmv)new SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(this));
    }
    
    private final boolean isPublic(final Method method) {
        return Modifier.isPublic(method.getModifiers());
    }
    
    private final boolean isWindowExtensionsValid() {
        return this.validate((atmv)new SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(this));
    }
    
    private final boolean isWindowLayoutComponentValid() {
        return this.validate((atmv)new SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(this));
    }
    
    private final boolean isWindowLayoutProviderValid() {
        return this.validate((atmv)new SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(this));
    }
    
    private final boolean validate(final atmv atmv) {
        final boolean b = false;
        try {
            return (boolean)atmv.invoke();
        }
        catch (final ClassNotFoundException | NoSuchMethodException ex) {
            return b;
        }
    }
    
    public final WindowLayoutComponent getWindowLayoutComponent() {
        final boolean canUseWindowLayoutComponent = this.canUseWindowLayoutComponent();
        WindowLayoutComponent windowLayoutComponent = null;
        if (!canUseWindowLayoutComponent) {
            return windowLayoutComponent;
        }
        try {
            windowLayoutComponent = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            return windowLayoutComponent;
        }
        catch (final UnsupportedOperationException ex) {
            windowLayoutComponent = windowLayoutComponent;
            return windowLayoutComponent;
        }
    }
}
