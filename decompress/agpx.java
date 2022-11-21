import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.graphics.Bitmap;
import android.content.Intent;
import android.util.Log;
import android.text.TextUtils;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Locale;
import android.content.Context;
import android.app.Service;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpx
{
    public static agpx a;
    
    public static void A(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static void B(final List list) {
        final HashMap hashMap = new HashMap(list.size());
        final Iterator iterator = list.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final int n = 0;
            if (hasNext) {
                final agkt agkt = (agkt)iterator.next();
                final aapu aapu = new aapu(agkt);
                for (final Class clazz : agkt.a) {
                    final agla agla = new agla((Class)clazz, agkt.f() ^ true);
                    if (!hashMap.containsKey(agla)) {
                        hashMap.put(agla, new HashSet());
                    }
                    final Set set = (Set)hashMap.get(agla);
                    if (!set.isEmpty() && !agla.a) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", clazz));
                    }
                    set.add(aapu);
                }
            }
            else {
                final Iterator iterator3 = hashMap.values().iterator();
                while (iterator3.hasNext()) {
                    for (final aapu aapu2 : (Set)iterator3.next()) {
                        for (final aglb aglb : ((agkt)aapu2.b).b) {
                            if (aglb.e()) {
                                final Set set2 = (Set)hashMap.get(new agla(aglb.a, aglb.f()));
                                if (set2 == null) {
                                    continue;
                                }
                                for (final aapu aapu3 : set2) {
                                    ((Set<aapu>)aapu2.c).add(aapu3);
                                    ((Set<aapu>)aapu3.a).add(aapu2);
                                }
                            }
                        }
                    }
                }
                final HashSet set3 = new HashSet();
                final Iterator iterator7 = hashMap.values().iterator();
                while (iterator7.hasNext()) {
                    set3.addAll((Collection)iterator7.next());
                }
                final HashSet set4 = new HashSet();
                final Iterator iterator8 = set3.iterator();
                int n2;
                while (true) {
                    n2 = n;
                    if (!iterator8.hasNext()) {
                        break;
                    }
                    final aapu aapu4 = (aapu)iterator8.next();
                    if (!aapu4.bv()) {
                        continue;
                    }
                    set4.add(aapu4);
                }
                while (!set4.isEmpty()) {
                    final aapu aapu5 = (aapu)set4.iterator().next();
                    set4.remove(aapu5);
                    final int n3 = n2 + 1;
                    final Iterator<Object> iterator9 = ((Set<Object>)aapu5.c).iterator();
                    while (true) {
                        n2 = n3;
                        if (!iterator9.hasNext()) {
                            break;
                        }
                        final aapu aapu6 = iterator9.next();
                        ((Set)aapu6.a).remove(aapu5);
                        if (!aapu6.bv()) {
                            continue;
                        }
                        set4.add(aapu6);
                    }
                }
                if (n2 == list.size()) {
                    return;
                }
                final ArrayList list2 = new ArrayList();
                for (final aapu aapu7 : set3) {
                    if (!aapu7.bv() && !((Set)aapu7.c).isEmpty()) {
                        list2.add(aapu7.b);
                    }
                }
                throw new aglc((List)list2);
            }
        }
    }
    
    public static final void C(final agkt agkt, final List list) {
        list.add(agkt);
    }
    
    public static int D(final int n) {
        if (n < 3) {
            adzw.H(n, "expectedSize");
            return n + 1;
        }
        if (n < 1073741824) {
            final double n2 = n;
            Double.isNaN(n2);
            return (int)Math.ceil(n2 / 0.75);
        }
        return Integer.MAX_VALUE;
    }
    
    public static afgm E(final Map map) {
        final Iterator iterator = map.entrySet().iterator();
        if (!iterator.hasNext()) {
            return afkc.b;
        }
        final Map.Entry<Enum, V> entry = (Map.Entry<Enum, V>)iterator.next();
        final Enum enum1 = entry.getKey();
        final V value = entry.getValue();
        adzw.F((Object)enum1, (Object)value);
        final EnumMap enumMap = new EnumMap<Enum, Object>(enum1.getDeclaringClass());
        enumMap.put(enum1, value);
        while (iterator.hasNext()) {
            final Map.Entry<Enum, V> entry2 = (Map.Entry<Enum, V>)iterator.next();
            final Enum enum2 = entry2.getKey();
            final V value2 = entry2.getValue();
            adzw.F((Object)enum2, (Object)value2);
            enumMap.put(enum2, value2);
        }
        final int size = enumMap.size();
        afgm afgm;
        if (size != 0) {
            if (size != 1) {
                afgm = new afgb(enumMap);
            }
            else {
                final Map.Entry entry3 = (Map.Entry)an(enumMap.entrySet());
                afgm = afgm.m(entry3.getKey(), entry3.getValue());
            }
        }
        else {
            afgm = afkc.b;
        }
        return afgm;
    }
    
    public static Object F(final Map map, final Object o) {
        map.getClass();
        try {
            return map.get(o);
        }
        catch (final ClassCastException | NullPointerException ex) {
            return null;
        }
    }
    
    public static HashMap G(final int n) {
        return new HashMap(D(n));
    }
    
    public static Iterator H(final Iterator iterator) {
        return (Iterator)new afir(iterator);
    }
    
    public static Map.Entry I(final Object o, final Object o2) {
        return new affz(o, o2);
    }
    
    public static Map.Entry J(final Map.Entry entry) {
        entry.getClass();
        return (Map.Entry)new afis(entry);
    }
    
    public static Map K(final Map map, final afax afax) {
        afax.getClass();
        return (Map)new afiy(map, new xsj(afax), (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static boolean L(final Map map, final Object o) {
        return map == o || (o instanceof Map && map.entrySet().equals(((Map)o).entrySet()));
    }
    
    public static ArrayList M() {
        return new ArrayList();
    }
    
    public static ArrayList N(final Iterable iterable) {
        iterable.getClass();
        ArrayList o;
        if (iterable instanceof Collection) {
            o = new ArrayList((Collection<?>)iterable);
        }
        else {
            o = O(iterable.iterator());
        }
        return o;
    }
    
    public static ArrayList O(final Iterator iterator) {
        final ArrayList m = M();
        ad(m, iterator);
        return m;
    }
    
    @SafeVarargs
    public static ArrayList P(final Object... array) {
        array.getClass();
        final int length = array.length;
        adzw.H(length, "arraySize");
        final ArrayList list = new ArrayList<Object>(afxr.F(length + 5L + length / 10));
        Collections.addAll((Collection<? super Object>)list, array);
        return list;
    }
    
    public static ArrayList Q(final int n) {
        adzw.H(n, "initialArraySize");
        return new ArrayList(n);
    }
    
    public static List R(final List list) {
        if (list instanceof afgh) {
            return ((afgh)list).a();
        }
        if (list instanceof afik) {
            return ((afik)list).a;
        }
        if (list instanceof RandomAccess) {
            return (List)new afii(list);
        }
        return new afik(list);
    }
    
    public static List S(final List list, final afax afax) {
        Serializable s;
        if (list instanceof RandomAccess) {
            s = new afim(list, afax);
        }
        else {
            s = new afio(list, afax);
        }
        return (List)s;
    }
    
    public static boolean T(final List list, final Object o) {
        if (o == list) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        final List list2 = (List)o;
        final int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; ++i) {
                if (!aexq.c(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        final Iterator iterator = list.iterator();
        final Iterator iterator2 = list2.iterator();
        while (iterator.hasNext()) {
            if (iterator2.hasNext()) {
                if (aexq.c(iterator.next(), iterator2.next())) {
                    continue;
                }
            }
            return false;
        }
        if (!iterator2.hasNext()) {
            return true;
        }
        return false;
    }
    
    public static int U(final Iterator iterator, final int n) {
        iterator.getClass();
        int n2 = 0;
        adme.L(n >= 0, "numberToAdvance must be nonnegative");
        while (n2 < n && iterator.hasNext()) {
            iterator.next();
            ++n2;
        }
        return n2;
    }
    
    public static int V(final Iterator iterator, final afbk afbk) {
        afbk.getClass();
        int n = 0;
        while (iterator.hasNext()) {
            if (afbk.a(iterator.next())) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    public static aflu W(final Iterator iterator, final afbk afbk) {
        iterator.getClass();
        afbk.getClass();
        return (aflu)new afia(iterator, afbk);
    }
    
    public static Object X(final Iterator iterator) {
        Object next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }
    
    public static Object Y(final Iterator iterator, final Object o) {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return o;
    }
    
    public static Object Z(final Iterator iterator) {
        if (iterator.hasNext()) {
            final Object next = iterator.next();
            iterator.remove();
            return next;
        }
        return null;
    }
    
    public static boolean a(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    private static int aA(final byte b) {
        return b & 0x3F;
    }
    
    private static boolean aB(final byte b) {
        return b > -65;
    }
    
    private static Object aC(final List list) {
        return list.get(list.size() - 1);
    }
    
    private static Collection aD(final Iterable iterable) {
        Collection o;
        if (iterable instanceof Collection) {
            o = (Collection)iterable;
        }
        else {
            o = O(iterable.iterator());
        }
        return o;
    }
    
    private static void aE(final List list, final afbk afbk, final int n, final int n2) {
        int size = list.size();
        int n4;
        while (true) {
            final int n3 = size - 1;
            if (n3 <= (n4 = n2)) {
                break;
            }
            size = n3;
            if (!afbk.a(list.get(n3))) {
                continue;
            }
            list.remove(n3);
            size = n3;
        }
        while (--n4 >= n) {
            list.remove(n4);
        }
    }
    
    private static void aF(final List list, final afbk afbk) {
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            final Object value = list.get(i);
            int n2 = n;
            if (!afbk.a(value)) {
                if (i > n) {
                    try {
                        list.set(n, value);
                    }
                    catch (final IllegalArgumentException ex) {
                        aE(list, afbk, n, i);
                        return;
                    }
                    catch (final UnsupportedOperationException ex2) {
                        aE(list, afbk, n, i);
                        return;
                    }
                }
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        list.subList(n, list.size()).clear();
    }
    
    public static Iterator aa(final Iterator iterator) {
        return new afie(iterator);
    }
    
    public static Iterator ab(final Iterator iterator, final afax afax) {
        afax.getClass();
        return (Iterator)new afib(iterator, afax);
    }
    
    public static void ac(final Iterator iterator) {
        iterator.getClass();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
    
    public static boolean ad(final Collection collection, final Iterator iterator) {
        collection.getClass();
        iterator.getClass();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= collection.add(iterator.next());
        }
        return b;
    }
    
    public static boolean ae(final Iterator iterator, final Object o) {
        if (o == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
        }
        else {
            while (iterator.hasNext()) {
                if (o.equals(iterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean af(final Iterator iterator, final Collection collection) {
        collection.getClass();
        boolean b = false;
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    public static int ag(final Iterable iterable, final afbk afbk) {
        return V(iterable.iterator(), afbk);
    }
    
    public static afbh ah(final Iterable iterable, final afbk afbk) {
        final Iterator iterator = iterable.iterator();
        iterator.getClass();
        afbk.getClass();
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (afbk.a(next)) {
                return afbh.k(next);
            }
        }
        return afag.a;
    }
    
    public static Iterable ai(final Iterable iterable, final afbk afbk) {
        iterable.getClass();
        afbk.getClass();
        return (Iterable)new afhu(iterable, afbk);
    }
    
    public static Iterable aj(final Iterable iterable, final afax afax) {
        afax.getClass();
        return (Iterable)new afhv(iterable, afax);
    }
    
    public static Object ak(final Iterable iterable, final int n) {
        final Iterator iterator = iterable.iterator();
        final int u = U(iterator, n);
        if (iterator.hasNext()) {
            return iterator.next();
        }
        final StringBuilder sb = new StringBuilder("position (");
        sb.append(n);
        sb.append(") must be less than the number of elements that remained (");
        sb.append(u);
        sb.append(")");
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public static Object al(final Iterable iterable, final Object o) {
        return Y(iterable.iterator(), o);
    }
    
    public static Object am(final Iterable iterable) {
        if (!(iterable instanceof List)) {
            return X(iterable.iterator());
        }
        if (!((List)iterable).isEmpty()) {
            return aC((List)iterable);
        }
        throw new NoSuchElementException();
    }
    
    public static Object an(final Iterable iterable) {
        final Iterator iterator = iterable.iterator();
        final Object next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        final StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int n = 0; n < 4 && iterator.hasNext(); ++n) {
            sb.append(", ");
            sb.append(iterator.next());
        }
        if (iterator.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static String ao(final Iterable iterable) {
        final Iterator iterator = iterable.iterator();
        final StringBuilder sb = new StringBuilder("[");
        int n = 1;
        while (iterator.hasNext()) {
            if (n == 0) {
                sb.append(", ");
            }
            sb.append(iterator.next());
            n = 0;
        }
        sb.append(']');
        return sb.toString();
    }
    
    public static boolean ap(final Collection collection, final Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection)iterable);
        }
        iterable.getClass();
        return ad(collection, iterable.iterator());
    }
    
    public static boolean aq(final Iterable iterable, final afbk afbk) {
        return V(iterable.iterator(), afbk) != -1;
    }
    
    public static Object[] ar(final Iterable iterable) {
        return aD(iterable).toArray();
    }
    
    public static Object[] as(final Iterable iterable, final Class clazz) {
        return at(iterable, aewr.i(clazz, 0));
    }
    
    public static Object[] at(final Iterable iterable, final Object[] array) {
        return aD(iterable).toArray(array);
    }
    
    public static Object au(final Iterable iterable) {
        if (iterable instanceof Collection) {
            if (((Collection)iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return aC((List)iterable);
            }
        }
        final Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            return X(iterator);
        }
        return null;
    }
    
    public static void av(final Iterable iterable, final afbk afbk) {
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            final List list = (List)iterable;
            afbk.getClass();
            aF(list, afbk);
            return;
        }
        final Iterator iterator = iterable.iterator();
        afbk.getClass();
        while (iterator.hasNext()) {
            if (afbk.a(iterator.next())) {
                iterator.remove();
            }
        }
    }
    
    public static aevl aw(final Service service, final String s) {
        qem.r();
        return ((aeuv)aegu.N((Context)service, aeuv.class)).bH().a(s);
    }
    
    public static Locale ax(final br br) {
        final Bundle m = br.m;
        if (m == null) {
            return null;
        }
        return (Locale)m.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }
    
    public static void ay(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static agpx az() {
        return new agpx();
    }
    
    public static asao b(final Context context) {
        return new agpq(mqx.a(context));
    }
    
    public static void c(final byte b, final byte b2, final byte b3, final byte b4, final char[] array, final int n) {
        if (!aB(b2) && (b << 28) + (b2 + 112) >> 30 == 0 && !aB(b3) && !aB(b4)) {
            final int n2 = (b & 0x7) << 18 | aA(b2) << 12 | aA(b3) << 6 | aA(b4);
            array[n] = (char)((n2 >>> 10) + 55232);
            array[n + 1] = (char)((n2 & 0x3FF) + 56320);
            return;
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }
    
    public static void d(final byte b, final char[] array, final int n) {
        array[n] = (char)b;
    }
    
    public static void e(final byte b, final byte b2, final byte b3, final char[] array, final int n) {
        if (!aB(b2)) {
            int n2;
            if ((n2 = b) == -32) {
                if (b2 < -96) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                n2 = -32;
            }
            int n3;
            if ((n3 = n2) == -19) {
                if (b2 >= -96) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                n3 = -19;
            }
            if (!aB(b3)) {
                array[n] = (char)((n3 & 0xF) << 12 | aA(b2) << 6 | aA(b3));
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }
    
    public static void f(final byte b, final byte b2, final char[] array, final int n) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (!aB(b2)) {
            array[n] = (char)((b & 0x1F) << 6 | aA(b2));
            return;
        }
        throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
    }
    
    public static boolean g(final byte b) {
        return b >= 0;
    }
    
    public static boolean h(final byte b) {
        return b < -16;
    }
    
    public static boolean i(final byte b) {
        return b < -32;
    }
    
    public static agkt j(final String s, final String s2) {
        return agkt.d((Object)agpe.a(s, s2), (Class)agpe.class);
    }
    
    public static agkt k(final String s, final agpg agpg) {
        final agks c = agkt.c((Class)agpe.class);
        c.b(aglb.c((Class)Context.class));
        c.c((agkv)new agpf(s, agpg));
        return c.a();
    }
    
    public static SharedPreferences l(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
    
    public static String m(final Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }
    
    public static String n(final Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }
    
    public static String o(final Bundle bundle) {
        final String string = bundle.getString("from");
        if (string != null && string.startsWith("/topics/")) {
            return string;
        }
        return null;
    }
    
    public static void p(final String s, final Bundle bundle) {
        try {
            agjs.b();
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            final Bundle bundle3 = new Bundle();
            final String string = bundle2.getString("google.c.a.c_id");
            if (string != null) {
                bundle3.putString("_nmid", string);
            }
            final String m = m(bundle2);
            if (m != null) {
                bundle3.putString("_nmn", m);
            }
            final String n = n(bundle2);
            if (!TextUtils.isEmpty((CharSequence)n)) {
                bundle3.putString("label", n);
            }
            final String string2 = bundle2.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                bundle3.putString("message_channel", string2);
            }
            final String o = o(bundle2);
            if (o != null) {
                bundle3.putString("_nt", o);
            }
            final String string3 = bundle2.getString("google.c.a.ts");
            if (string3 != null) {
                try {
                    bundle3.putInt("_nmt", Integer.parseInt(string3));
                }
                catch (final NumberFormatException ex) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", (Throwable)ex);
                }
            }
            String string4;
            if (bundle2.containsKey("google.c.a.udt")) {
                string4 = bundle2.getString("google.c.a.udt");
            }
            else {
                string4 = null;
            }
            if (string4 != null) {
                try {
                    bundle3.putInt("_ndt", Integer.parseInt(string4));
                }
                catch (final NumberFormatException ex2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", (Throwable)ex2);
                }
            }
            String s2;
            if (!agpb.m(bundle2)) {
                s2 = "data";
            }
            else {
                s2 = "display";
            }
            if ("_nr".equals(s) || "_nf".equals(s)) {
                bundle3.putString("_nmc", s2);
            }
            final agjy agjy = (agjy)agjs.b().f((Class)agjy.class);
            if (agjy != null) {
                agjy.a(s, bundle3);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
        catch (final IllegalStateException ex3) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }
    
    public static boolean q(final Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }
    
    public static boolean r(final Intent intent) {
        return intent != null && !q(intent) && s(intent.getExtras());
    }
    
    public static boolean s(final Bundle bundle) {
        return bundle != null && "1".equals(bundle.getString("google.c.a.e"));
    }
    
    public static final void t(final afr afr, final agog agog) {
        if (agog != null) {
            try {
                final nnt c = agog.c;
                kht.aL((Object)c);
                final Bitmap bitmap = (Bitmap)nom.g(c, 5L, TimeUnit.SECONDS);
                afr.m(bitmap);
                final afn afn = new afn();
                afn.d(bitmap);
                afn.c((Bitmap)null);
                afr.r((afv)afn);
            }
            catch (final TimeoutException ex) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                agog.close();
            }
            catch (final InterruptedException ex2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                agog.close();
                Thread.currentThread().interrupt();
            }
            catch (final ExecutionException ex3) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(ex3.getCause()))));
            }
        }
    }
    
    public static byte[] u(final Queue queue, final int n) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        final byte[] array = queue.remove();
        final int length = array.length;
        if (length == n) {
            return array;
        }
        final byte[] copy = Arrays.copyOf(array, n);
        int min;
        for (int i = n - length; i > 0; i -= min) {
            final byte[] array2 = queue.remove();
            min = Math.min(i, array2.length);
            System.arraycopy(array2, 0, copy, n - i, min);
        }
        return copy;
    }
    
    public static final agnp v(final String s, final String s2, final String s3, final agns agns, final int n) {
        return new agnp(s, s2, s3, agns, n);
    }
    
    public static int w(final int n) {
        return n - 1;
    }
    
    public static final aglz x(final int n, final agly agly) {
        return (aglz)new aglv(n, agly);
    }
    
    public static void y(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void z(final Object o) {
        o.getClass();
    }
}
