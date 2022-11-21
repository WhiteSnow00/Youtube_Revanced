import io.grpc.Status;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CancellationException;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ServiceLoader;
import java.util.ServiceConfigurationError;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class arxu
{
    public static aryk e(final List list, final arwo arwo, final Object o) {
        return new aryk(list, arwo, o);
    }
    
    public static aryf f(final List list, final arwo arwo, final Object[][] array) {
        return new aryf(list, arwo, array);
    }
    
    public static void g(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static List i(final Class t, Iterable o, ClassLoader classLoader, final arzy arzy) {
        if (j(classLoader)) {
            classLoader = (ClassLoader)new ArrayList();
            final Iterator iterator = ((Iterable)o).iterator();
            while (true) {
                o = classLoader;
                if (!iterator.hasNext()) {
                    break;
                }
                final Class clazz = (Class)iterator.next();
                try {
                    o = clazz.asSubclass((Class)t).getConstructor((Class[])new Class[0]).newInstance(new Object[0]);
                }
                catch (ClassCastException o) {
                    o = null;
                }
                finally {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", clazz.getName(), t), t);
                }
                if (o == null) {
                    continue;
                }
                ((List<Iterable>)classLoader).add((Iterable)o);
            }
        }
        else if (!((Iterable)(o = ServiceLoader.load((Class<S>)t, classLoader))).iterator().hasNext()) {
            o = ServiceLoader.load((Class<S>)t);
        }
        final ArrayList list = new ArrayList();
        for (final Object next : o) {
            arzy.b(next);
            list.add(next);
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)Collections.reverseOrder((Comparator<? super T>)new lcs(arzy, 6)));
        return Collections.unmodifiableList((List<?>)list);
    }
    
    public static boolean j(final ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public static arzm k(final List list, final arwo arwo, final arzk arzk) {
        return new arzm(list, arwo, arzk);
    }
    
    public static aror l(final List list, final List list2) {
        return new aror(list, list2);
    }
    
    public static void m(final atnb atnb, final List list) {
        list.add(atnb);
    }
    
    public static void n(final atnb atnb, final List list) {
        list.add(atnb);
    }
    
    public static void o(final Object o, final Class clazz) {
        if (o != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(clazz.getCanonicalName()).concat(" must be set"));
    }
    
    public static void q(final atwr atwr, final Throwable t) {
        atwr.getClass();
        CancellationException p2 = null;
        CancellationException ex = null;
        if (t != null) {
            if (t instanceof CancellationException) {
                ex = (CancellationException)t;
            }
            if ((p2 = ex) == null) {
                p2 = aqvq.p("Channel was consumed, consumer had failed", t);
            }
        }
        atwr.r(p2);
    }
    
    public static Object r(final Throwable t) {
        return new atwh(t);
    }
    
    public static atnh s(final Object o, final Object o2) {
        return new atnh(o, o2);
    }
    
    public static boolean t(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static arop u(final agpb agpb) {
        return new arop((Map)agpb.a);
    }
    
    public static aroo v(final agpb agpb) {
        return new aroo((Map)agpb.a);
    }
    
    public void a(final Status status, final arze arze) {
        throw null;
    }
    
    public void b(final arze arze) {
        throw null;
    }
    
    public void c(final Object o) {
        throw null;
    }
    
    public void d() {
    }
    
    public void h(final long n) {
    }
    
    public arxu p() {
        throw null;
    }
}
