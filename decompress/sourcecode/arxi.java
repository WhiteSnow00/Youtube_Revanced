import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Collections;
import java.util.ServiceLoader;
import java.util.ServiceConfigurationError;
import android.os.Parcelable$Creator;
import io.grpc.Status;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public class arxi
{
    public arxi() {
    }
    
    public arxi(final byte[] array) {
        new ConcurrentHashMap(8);
    }
    
    public arxi(final byte[] array, final byte[] array2) {
    }
    
    public arxi(final char[] array) {
        final int a = arvy.a;
    }
    
    public static asbh a() {
        if (asdh.a == null) {
            return (asbh)new asdh();
        }
        return (asbh)new arxx();
    }
    
    public static asad b() {
        return new asad();
    }
    
    public static atoi c(final atmp atmp) {
        return new atol(atmp, 0);
    }
    
    public static List d(final atoi atoi) {
        atoi.getClass();
        final ArrayList list = new ArrayList();
        final Iterator a = atoi.a();
        while (a.hasNext()) {
            list.add(a.next());
        }
        final int size = list.size();
        if (size == 0) {
            return atkh.a;
        }
        if (size != 1) {
            return list;
        }
        return aqzg.F(list.get(0));
    }
    
    public static void e(final atob atob, final Object o) {
        atob.getClass();
        if (atob.d(o)) {
            o.getClass();
            return;
        }
        throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(atob.b())));
    }
    
    public static void f(final Class clazz) {
        final String name = clazz.getName();
        final StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(name);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(name);
        sb.append(" and subscribe that to the target source instead.");
        aulo.r((Throwable)new asin(sb.toString()));
    }
    
    public static void g(final AtomicReference atomicReference, final asic asic, final Class clazz) {
        asjv.b((Object)asic, "next is null");
        while (!atomicReference.compareAndSet(null, asic)) {
            if (atomicReference.get() != null) {
                asic.dispose();
                if (atomicReference.get() != asjg.a) {
                    f(clazz);
                }
            }
        }
    }
    
    public static int i(final Parcel parcel, final Status status) {
        final int n = status.getCode().value() << 16;
        String s2;
        final String s = s2 = status.getDescription();
        if (s != null) {
            s2 = s;
            if (s.length() > 1000) {
                s2 = s.substring(0, 1000);
            }
        }
        if (s2 != null) {
            parcel.writeString(s2);
            return n | 0x20;
        }
        return n;
    }
    
    public static Status j(final int n, final Parcel parcel) {
        final Status fromCodeValue = Status.fromCodeValue(n >> 16 & 0xFF);
        if ((n & 0x20) != 0x0) {
            return fromCodeValue.withDescription(parcel.readString());
        }
        return fromCodeValue;
    }
    
    public static void k(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(n);
        parcel.setDataPosition(dataPosition);
    }
    
    public static boolean l(final int n, final int n2) {
        return (n & n2) != 0x0;
    }
    
    public static arub o(final String s, final Parcelable$Creator parcelable$Creator) {
        return arub.e(s, (arua)new arwu(parcelable$Creator));
    }
    
    public static List q(final Class t, Iterable o, ClassLoader classLoader, final arvi arvi) {
        if (r(classLoader)) {
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
            arvi.b(next);
            list.add(next);
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)Collections.reverseOrder((Comparator<? super T>)new lbi(arvi, 6)));
        return Collections.unmodifiableList((List<?>)list);
    }
    
    public static boolean r(final ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public static aubp s(final int n) {
        return new aubp(ByteBuffer.allocateDirect(Math.min(1048576, n)));
    }
    
    public final void m() {
        monitorenter(this);
        monitorexit(this);
    }
    
    public void p(final long n) {
    }
}
