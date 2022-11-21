// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class PredicateAdapter
{
    private final ClassLoader loader;
    
    public PredicateAdapter(final ClassLoader loader) {
        loader.getClass();
        this.loader = loader;
    }
    
    private final Class predicateClassOrThrow() {
        final Class<?> loadClass = this.loader.loadClass("java.util.function.Predicate");
        loadClass.getClass();
        return loadClass;
    }
    
    public final Object buildPairPredicate(final atrt atrt, final atrt atrt2, final atqh atqh) {
        atrt.getClass();
        atrt2.getClass();
        atqh.getClass();
        final Object proxyInstance = Proxy.newProxyInstance(this.loader, new Class[] { this.predicateClassOrThrow() }, (InvocationHandler)new PredicateAdapter$PairPredicateStubHandler(atrt, atrt2, atqh));
        proxyInstance.getClass();
        return proxyInstance;
    }
    
    public final Object buildPredicate(final atrt atrt, final atqd atqd) {
        atrt.getClass();
        atqd.getClass();
        final Object proxyInstance = Proxy.newProxyInstance(this.loader, new Class[] { this.predicateClassOrThrow() }, (InvocationHandler)new PredicateAdapter$PredicateStubHandler(atrt, atqd));
        proxyInstance.getClass();
        return proxyInstance;
    }
    
    public final Class predicateClassOrNull$window_release() {
        Class predicateClassOrThrow;
        try {
            predicateClassOrThrow = this.predicateClassOrThrow();
        }
        catch (final ClassNotFoundException ex) {
            predicateClassOrThrow = null;
        }
        return predicateClassOrThrow;
    }
}
