// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import android.content.Context;
import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class ConsumerAdapter
{
    private final ClassLoader loader;
    
    public ConsumerAdapter(final ClassLoader loader) {
        loader.getClass();
        this.loader = loader;
    }
    
    private final Object buildConsumer(final atrt atrt, final atqd atqd) {
        final Object proxyInstance = Proxy.newProxyInstance(this.loader, new Class[] { this.unsafeConsumerClass() }, new ConsumerAdapter$ConsumerHandler(atrt, atqd));
        proxyInstance.getClass();
        return proxyInstance;
    }
    
    private final Class unsafeConsumerClass() {
        final Class<?> loadClass = this.loader.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        return loadClass;
    }
    
    public final void addConsumer(final Object o, final atrt atrt, final String s, final atqd atqd) {
        o.getClass();
        atrt.getClass();
        s.getClass();
        atqd.getClass();
        o.getClass().getMethod(s, this.unsafeConsumerClass()).invoke(o, this.buildConsumer(atrt, atqd));
    }
    
    public final Class consumerClassOrNull$window_release() {
        Class unsafeConsumerClass;
        try {
            unsafeConsumerClass = this.unsafeConsumerClass();
        }
        catch (final ClassNotFoundException ex) {
            unsafeConsumerClass = null;
        }
        return unsafeConsumerClass;
    }
    
    public final void createConsumer(final Object o, final atrt atrt, final String s, final Activity activity, final atqd atqd) {
        o.getClass();
        atrt.getClass();
        s.getClass();
        activity.getClass();
        atqd.getClass();
        o.getClass().getMethod(s, Activity.class, this.unsafeConsumerClass()).invoke(o, activity, this.buildConsumer(atrt, atqd));
    }
    
    public final ConsumerAdapter$Subscription createSubscription(final Object o, final atrt atrt, final String s, final String s2, final Activity activity, final atqd atqd) {
        o.getClass();
        atrt.getClass();
        s.getClass();
        s2.getClass();
        activity.getClass();
        atqd.getClass();
        final Object buildConsumer = this.buildConsumer(atrt, atqd);
        o.getClass().getMethod(s, Activity.class, this.unsafeConsumerClass()).invoke(o, activity, buildConsumer);
        return (ConsumerAdapter$Subscription)new ConsumerAdapter$createSubscription$1(o.getClass().getMethod(s2, this.unsafeConsumerClass()), o, buildConsumer);
    }
    
    public final ConsumerAdapter$Subscription createSubscription(final Object o, final atrt atrt, final String s, final String s2, final Context context, final atqd atqd) {
        o.getClass();
        atrt.getClass();
        s.getClass();
        s2.getClass();
        context.getClass();
        atqd.getClass();
        final Object buildConsumer = this.buildConsumer(atrt, atqd);
        o.getClass().getMethod(s, Context.class, this.unsafeConsumerClass()).invoke(o, context, buildConsumer);
        return (ConsumerAdapter$Subscription)new ConsumerAdapter$createSubscription$2(o.getClass().getMethod(s2, this.unsafeConsumerClass()), o, buildConsumer);
    }
    
    public final ConsumerAdapter$Subscription createSubscriptionNoActivity(final Object o, final atrt atrt, final String s, final String s2, final atqd atqd) {
        o.getClass();
        atrt.getClass();
        s.getClass();
        s2.getClass();
        atqd.getClass();
        final Object buildConsumer = this.buildConsumer(atrt, atqd);
        o.getClass().getMethod(s, this.unsafeConsumerClass()).invoke(o, buildConsumer);
        return (ConsumerAdapter$Subscription)new ConsumerAdapter$createSubscriptionNoActivity$1(o.getClass().getMethod(s2, this.unsafeConsumerClass()), o, buildConsumer);
    }
}
