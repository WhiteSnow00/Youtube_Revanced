import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.graphics.Bitmap;
import android.content.Intent;
import android.util.Log;
import android.text.TextUtils;
import android.os.Bundle;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import java.util.Set;
import java.util.RandomAccess;
import java.util.NoSuchElementException;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpc
{
    public static agpc a;
    
    public static void A(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void B(final Object o) {
        o.getClass();
    }
    
    public static void C(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static int D(final Iterator iterator, final int n) {
        iterator.getClass();
        int n2 = 0;
        adkp.I(n >= 0, (Object)"numberToAdvance must be nonnegative");
        while (n2 < n && iterator.hasNext()) {
            iterator.next();
            ++n2;
        }
        return n2;
    }
    
    public static int E(final Iterator iterator, final aezs aezs) {
        aezs.getClass();
        int n = 0;
        while (iterator.hasNext()) {
            if (aezs.a(iterator.next())) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    public static afke F(final Iterator iterator, final aezs aezs) {
        iterator.getClass();
        aezs.getClass();
        return (afke)new afgj(iterator, aezs);
    }
    
    public static Object G(final Iterator iterator) {
        Object next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }
    
    public static Object H(final Iterator iterator, final Object o) {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return o;
    }
    
    public static Object I(final Iterator iterator) {
        if (iterator.hasNext()) {
            final Object next = iterator.next();
            iterator.remove();
            return next;
        }
        return null;
    }
    
    public static Iterator J(final Iterator iterator) {
        return new afgn(iterator);
    }
    
    public static Iterator K(final Iterator iterator, final aezf aezf) {
        aezf.getClass();
        return (Iterator)new afgk(iterator, aezf);
    }
    
    public static void L(final Iterator iterator) {
        iterator.getClass();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
    
    public static boolean M(final Collection collection, final Iterator iterator) {
        collection.getClass();
        iterator.getClass();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= collection.add(iterator.next());
        }
        return b;
    }
    
    public static boolean N(final Iterator iterator, final Object o) {
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
    
    public static boolean O(final Iterator iterator, final Collection collection) {
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
    
    public static int P(final Iterable iterable, final aezs aezs) {
        return E(iterable.iterator(), aezs);
    }
    
    public static aezp Q(final Iterable iterable, final aezs aezs) {
        final Iterator iterator = iterable.iterator();
        iterator.getClass();
        aezs.getClass();
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (aezs.a(next)) {
                final Object o = aezp.k(next);
                return (aezp)o;
            }
        }
        final Object o = aeyo.a;
        return (aezp)o;
    }
    
    public static Iterable R(final Iterable iterable, final aezs aezs) {
        iterable.getClass();
        aezs.getClass();
        return (Iterable)new afgd(iterable, aezs);
    }
    
    public static Iterable S(final Iterable iterable, final aezf aezf) {
        aezf.getClass();
        return (Iterable)new afge(iterable, aezf);
    }
    
    public static Object T(final Iterable iterable, final int n) {
        final Iterator iterator = iterable.iterator();
        final int d = D(iterator, n);
        if (iterator.hasNext()) {
            return iterator.next();
        }
        final StringBuilder sb = new StringBuilder("position (");
        sb.append(n);
        sb.append(") must be less than the number of elements that remained (");
        sb.append(d);
        sb.append(")");
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public static Object U(final Iterable iterable, final Object o) {
        return H(iterable.iterator(), o);
    }
    
    public static Object V(final Iterable iterable) {
        if (!(iterable instanceof List)) {
            return G(iterable.iterator());
        }
        if (!((List)iterable).isEmpty()) {
            return ap((List)iterable);
        }
        throw new NoSuchElementException();
    }
    
    public static Object W(final Iterable iterable) {
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
    
    public static String X(final Iterable iterable) {
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
    
    public static boolean Y(final Collection collection, final Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection)iterable);
        }
        iterable.getClass();
        return M(collection, iterable.iterator());
    }
    
    public static boolean Z(final Iterable iterable, final aezs aezs) {
        return E(iterable.iterator(), aezs) != -1;
    }
    
    public static void a(final int n) {
        if (n != 1) {
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static Object[] aa(final Iterable iterable) {
        return aq(iterable).toArray();
    }
    
    public static Object[] ab(final Iterable iterable, final Class clazz) {
        return ac(iterable, agpi.z(clazz, 0));
    }
    
    public static Object[] ac(final Iterable iterable, final Object[] array) {
        return aq(iterable).toArray(array);
    }
    
    public static Object ad(final Iterable iterable) {
        if (iterable instanceof Collection) {
            if (((Collection)iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return ap((List)iterable);
            }
        }
        final Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            return G(iterator);
        }
        return null;
    }
    
    public static void ae(final Iterable iterable, final aezs aezs) {
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            final List list = (List)iterable;
            aezs.getClass();
            as(list, aezs);
            return;
        }
        final Iterator iterator = iterable.iterator();
        aezs.getClass();
        while (iterator.hasNext()) {
            if (aezs.a(iterator.next())) {
                iterator.remove();
            }
        }
    }
    
    public static final afer af(final afff afff) {
        return afer.c((Collection)afff.a.entrySet());
    }
    
    public static int ag(final int n) {
        return (int)(Integer.rotateLeft((int)(n * -862048943L), 15) * 461845907L);
    }
    
    public static int ah(final Object o) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return ag(hashCode);
    }
    
    public static int ai(int max) {
        max = Math.max(max, 2);
        final int highestOneBit = Integer.highestOneBit(max);
        if (max <= highestOneBit) {
            return highestOneBit;
        }
        max = highestOneBit + highestOneBit;
        if (max > 0) {
            return max;
        }
        return 1073741824;
    }
    
    public static avr aj(final br br, final avr avr) {
        final aeph aeph = (aeph)aqsy.k((Object)br, (Class)aeph.class);
        final ahdc ae = aeph.aE();
        return (avr)new aepg(br, ((arkn)aqsy.k((Object)aeph.j().a(), (Class)arkn.class)).yO().b(br, avr), (Set)ae.a, (hhg)ae.b, (byte[])null, (byte[])null);
    }
    
    public static void ak(final br br, final AccountId accountId) {
        adkp.M(br instanceof arln, "Fragment %s is not a TikTok Fragment", (Object)br);
        adkp.M(((arln)br).lC() instanceof aepz, "Fragment %s is not a TikTok account Fragment", (Object)br);
        aepz.e(br, accountId);
    }
    
    public static void al(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static Object am(Context applicationContext, final Class clazz) {
        applicationContext = applicationContext.getApplicationContext();
        if (applicationContext instanceof arlm) {
            final Object ar = ((arlm)applicationContext).aR();
            try {
                return clazz.cast(ar);
            }
            catch (final ClassCastException ex) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", ex);
            }
        }
        throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
    }
    
    private static int an(final byte b) {
        return b & 0x3F;
    }
    
    private static boolean ao(final byte b) {
        return b > -65;
    }
    
    private static Object ap(final List list) {
        return list.get(list.size() - 1);
    }
    
    private static Collection aq(final Iterable iterable) {
        Collection q;
        if (iterable instanceof Collection) {
            q = (Collection)iterable;
        }
        else {
            q = agpi.Q(iterable.iterator());
        }
        return q;
    }
    
    private static void ar(final List list, final aezs aezs, final int n, final int n2) {
        int size = list.size();
        int n4;
        while (true) {
            final int n3 = size - 1;
            if (n3 <= (n4 = n2)) {
                break;
            }
            size = n3;
            if (!aezs.a(list.get(n3))) {
                continue;
            }
            list.remove(n3);
            size = n3;
        }
        while (--n4 >= n) {
            list.remove(n4);
        }
    }
    
    private static void as(final List list, final aezs aezs) {
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            final Object value = list.get(i);
            int n2 = n;
            if (!aezs.a(value)) {
                if (i > n) {
                    try {
                        list.set(n, value);
                    }
                    catch (final IllegalArgumentException ex) {
                        ar(list, aezs, n, i);
                        return;
                    }
                    catch (final UnsupportedOperationException ex2) {
                        ar(list, aezs, n, i);
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
    
    public static String b(final int n) {
        switch (n) {
            default: {
                return "END_DOCUMENT";
            }
            case 9: {
                return "NULL";
            }
            case 8: {
                return "BOOLEAN";
            }
            case 7: {
                return "NUMBER";
            }
            case 6: {
                return "STRING";
            }
            case 5: {
                return "NAME";
            }
            case 4: {
                return "END_OBJECT";
            }
            case 3: {
                return "BEGIN_OBJECT";
            }
            case 2: {
                return "END_ARRAY";
            }
            case 1: {
                return "BEGIN_ARRAY";
            }
        }
    }
    
    public static boolean c(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static arxu d(final Context context) {
        return new agny(mqj.a(context));
    }
    
    public static void e(final byte b, final byte b2, final byte b3, final byte b4, final char[] array, final int n) {
        if (!ao(b2) && (b << 28) + (b2 + 112) >> 30 == 0 && !ao(b3) && !ao(b4)) {
            final int n2 = (b & 0x7) << 18 | an(b2) << 12 | an(b3) << 6 | an(b4);
            array[n] = (char)((n2 >>> 10) + 55232);
            array[n + 1] = (char)((n2 & 0x3FF) + 56320);
            return;
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }
    
    public static void f(final byte b, final char[] array, final int n) {
        array[n] = (char)b;
    }
    
    public static void g(final byte b, final byte b2, final byte b3, final char[] array, final int n) {
        if (!ao(b2)) {
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
            if (!ao(b3)) {
                array[n] = (char)((n3 & 0xF) << 12 | an(b2) << 6 | an(b3));
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }
    
    public static void h(final byte b, final byte b2, final char[] array, final int n) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (!ao(b2)) {
            array[n] = (char)((b & 0x1F) << 6 | an(b2));
            return;
        }
        throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
    }
    
    public static boolean i(final byte b) {
        return b >= 0;
    }
    
    public static boolean j(final byte b) {
        return b < -16;
    }
    
    public static boolean k(final byte b) {
        return b < -32;
    }
    
    public static agjb l(final String s, final String s2) {
        return agjb.d((Object)agnm.a(s, s2), (Class)agnm.class);
    }
    
    public static agjb m(final String s, final agno agno) {
        final agja c = agjb.c((Class)agnm.class);
        c.b(agjk.c((Class)Context.class));
        c.c((agjd)new agnn(s, agno));
        return c.a();
    }
    
    public static SharedPreferences n(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
    
    public static String o(final Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }
    
    public static String p(final Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }
    
    public static String q(final Bundle bundle) {
        final String string = bundle.getString("from");
        if (string != null && string.startsWith("/topics/")) {
            return string;
        }
        return null;
    }
    
    public static void r(final String s, final Bundle bundle) {
        try {
            agia.b();
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            final Bundle bundle3 = new Bundle();
            final String string = bundle2.getString("google.c.a.c_id");
            if (string != null) {
                bundle3.putString("_nmid", string);
            }
            final String o = o(bundle2);
            if (o != null) {
                bundle3.putString("_nmn", o);
            }
            final String p2 = p(bundle2);
            if (!TextUtils.isEmpty((CharSequence)p2)) {
                bundle3.putString("label", p2);
            }
            final String string2 = bundle2.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                bundle3.putString("message_channel", string2);
            }
            final String q = q(bundle2);
            if (q != null) {
                bundle3.putString("_nt", q);
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
            if (!agnj.M(bundle2)) {
                s2 = "data";
            }
            else {
                s2 = "display";
            }
            if ("_nr".equals(s) || "_nf".equals(s)) {
                bundle3.putString("_nmc", s2);
            }
            final agig agig = (agig)agia.b().f((Class)agig.class);
            if (agig != null) {
                agig.a(s, bundle3);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
        catch (final IllegalStateException ex3) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }
    
    public static boolean s(final Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }
    
    public static boolean t(final Intent intent) {
        return intent != null && !s(intent) && u(intent.getExtras());
    }
    
    public static boolean u(final Bundle bundle) {
        return bundle != null && "1".equals(bundle.getString("google.c.a.e"));
    }
    
    public static final void v(final afq afq, final agmo agmo) {
        if (agmo != null) {
            try {
                final nnc c = agmo.c;
                khl.aP(c);
                final Bitmap bitmap = (Bitmap)nnv.e(c, 5L, TimeUnit.SECONDS);
                afq.m(bitmap);
                final afm afm = new afm();
                afm.d(bitmap);
                afm.c((Bitmap)null);
                afq.r((afu)afm);
            }
            catch (final TimeoutException ex) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                agmo.close();
            }
            catch (final InterruptedException ex2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                agmo.close();
                Thread.currentThread().interrupt();
            }
            catch (final ExecutionException ex3) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(ex3.getCause()))));
            }
        }
    }
    
    public static byte[] w(final Queue queue, final int n) {
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
    
    public static final agly x(final String s, final String s2, final String s3, final agmb agmb, final int n) {
        return new agly(s, s2, s3, agmb, n);
    }
    
    public static int y(final int n) {
        return n - 1;
    }
    
    public static final agki z(final int n, final agkh agkh) {
        return (agki)new agke(n, agkh);
    }
}
