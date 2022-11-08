import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekf
{
    private static final AtomicInteger c;
    public final abg a;
    public final abg b;
    private final String d;
    
    static {
        c = new AtomicInteger(123051698);
    }
    
    public aekf(final String d) {
        this.a = new abg();
        this.b = new abg();
        agot.v(aexs.f(d) ^ true, (Object)"mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.d = d;
    }
    
    public final int a(final Object o) {
        qcj.s();
        final Integer n = (Integer)((abn)this.b).get((Object)o.getClass());
        final boolean b = true;
        agot.G(n != null, "The callback %s has not been registered", (Object)o.getClass());
        agot.G(this.b(n) == o && b, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", (Object)o.getClass());
        return n;
    }
    
    public final Object b(final int n) {
        qcj.s();
        final Object value = ((abn)this.a).get((Object)n);
        if (value == null) {
            for (final Map.Entry<K, Integer> entry : this.b.entrySet()) {
                if (entry.getValue() != n) {
                    continue;
                }
                throw new NullPointerException("Callback not re-registered for: ".concat(String.valueOf(((Class)entry.getKey()).getName())));
            }
        }
        value.getClass();
        return value;
    }
    
    public final void c(final Object o) {
        qcj.s();
        final Class<?> class1 = o.getClass();
        if (((abn)this.b).containsKey((Object)class1)) {
            agot.G(((abn)this.a).put((Object)(int)((abn)this.b).get((Object)class1), o) == null, "Attempted to register the callback class % twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", (Object)class1);
            return;
        }
        final int andIncrement = aekf.c.getAndIncrement();
        final abg b = this.b;
        final Integer value = andIncrement;
        ((abn)b).put((Object)class1, (Object)value);
        ((abn)this.a).put((Object)value, o);
    }
    
    public final void d(final Bundle bundle) {
        qcj.s();
        if (bundle != null) {
            final String concat = "CallbackIdMap.classes".concat(this.d);
            agot.E(bundle.containsKey(concat), (Object)"CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            final String[] stringArray = bundle.getStringArray(concat);
            final int[] intArray = bundle.getIntArray("CallbackIdMap.class_ids".concat(this.d));
            int i = 0;
            while (i < stringArray.length) {
                try {
                    final Integer n = (Integer)((abn)this.b).put((Object)Class.forName(stringArray[i]), (Object)intArray[i]);
                    if (n != null) {
                        final int intValue = n;
                        final int n2 = intArray[i];
                        agot.K(intValue == n2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", (Object)stringArray[i], (Object)n2, (Object)n);
                    }
                    ++i;
                    continue;
                }
                catch (final ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                break;
            }
        }
    }
    
    public final void e(final Bundle bundle) {
        qcj.s();
        final String concat = "CallbackIdMap.classes".concat(this.d);
        agot.G(bundle.containsKey(concat) ^ true, "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", (Object)concat);
        final abg b = this.b;
        final int d = ((abn)b).d;
        final String[] array = new String[d];
        final int[] array2 = new int[d];
        final Iterator iterator = b.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Class, V> entry = (Map.Entry<Class, V>)iterator.next();
            array[n] = entry.getKey().getName();
            array2[n] = (int)entry.getValue();
            ++n;
        }
        bundle.putStringArray(concat, array);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(this.d), array2);
    }
}
