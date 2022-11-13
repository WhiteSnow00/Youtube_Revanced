import android.content.SharedPreferences;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.MissingFormatArgumentException;
import java.util.Arrays;
import android.content.res.Resources;
import android.util.Log;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import j$.time.format.DateTimeFormatter;
import j$.time.ZoneOffset;
import j$.util.DateRetargetClass;
import java.util.Date;
import android.os.Bundle;
import java.io.IOException;
import java.io.File;
import android.content.Context;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnj
{
    private static WeakReference b;
    public final Object a;
    
    private agnj() {
        final ainq a = ainq.a;
        throw null;
    }
    
    private agnj(final aggr a) {
        this.a = a;
    }
    
    public agnj(final agni a) {
        this.a = a;
    }
    
    public agnj(final ahal a) {
        ahby.i((Object)a, "output");
        this.a = a;
        final ahal ahal = a;
        a.f = this;
    }
    
    public agnj(final ahaz a) {
        this.a = a;
    }
    
    private agnj(final ahek ahek, final Object o, final ahek ahek2, final Object o2) {
        this.a = new ahcq(ahek, o, ahek2, o2);
    }
    
    public agnj(final Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        final File file = new File(agx.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !this.D()) {
                this.B();
            }
        }
        catch (final IOException ex) {}
    }
    
    public agnj(final Context context, final String s) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat".concat(s), 0);
    }
    
    public agnj(final Context context, final byte[] array) {
        final mqw mqw = new mqw(context, (byte[])null);
        this.a = new agiv(mqw);
    }
    
    public agnj(final Bundle bundle) {
        this.a = new Bundle(bundle);
    }
    
    public agnj(final String a) {
        this.a = a;
    }
    
    public static String J(final String s) {
        String substring = s;
        if (s.startsWith("gcm.n.")) {
            substring = s.substring(6);
        }
        return substring;
    }
    
    public static boolean M(final Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(ab("gcm.n.e")));
    }
    
    public static agnj Y(final Context context) {
        synchronized (agnj.class) {
            khl.aP(context);
            final WeakReference b = agnj.b;
            agnj agnj;
            if (b == null) {
                agnj = null;
            }
            else {
                agnj = (agnj)b.get();
            }
            if (agnj == null) {
                final agnj agnj2 = new agnj(context.getApplicationContext(), (byte[])null);
                agnj.b = new WeakReference(agnj2);
                return agnj2;
            }
            return agnj;
        }
    }
    
    public static agnj Z(final byte[] array) {
        return new agnj(aggr.a(array));
    }
    
    public static int a(final ahcq ahcq, final Object o, final Object o2) {
        return ahau.a((ahek)ahcq.c, 1, o) + ahau.a((ahek)ahcq.d, 2, o2);
    }
    
    private static final String aa(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("|T|");
        sb.append(s2);
        sb.append("|*");
        return sb.toString();
    }
    
    private static String ab(final String s) {
        if (!s.startsWith("gcm.n.")) {
            return s;
        }
        return s.replace("gcm.n.", "gcm.notification.");
    }
    
    private final String ac(final long n) {
        synchronized (this) {
            return DateRetargetClass.toInstant(new Date(n)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
    }
    
    private final String ad(String s) {
        monitorenter(this);
        try {
            for (Map.Entry<K, Set> entry : ((SharedPreferences)this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    final Iterator iterator2 = entry.getValue().iterator();
                    while (iterator2.hasNext()) {
                        if (s.equals(iterator2.next())) {
                            s = (String)entry.getKey();
                            monitorexit(this);
                            return s;
                        }
                    }
                }
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void ae() {
        monitorenter(this);
        try {
            final long long1 = ((SharedPreferences)this.a).getLong("fire-count", 0L);
            final Iterator iterator = ((SharedPreferences)this.a).getAll().entrySet().iterator();
            String s = "";
            String s2 = null;
            while (iterator.hasNext()) {
                final Map.Entry<K, Set> entry = (Map.Entry<K, Set>)iterator.next();
                if (entry.getValue() instanceof Set) {
                    final Iterator iterator2 = entry.getValue().iterator();
                    String s3 = s2;
                    String s4 = s;
                    while (true) {
                        s = s4;
                        s2 = s3;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final String s5 = (String)iterator2.next();
                        if (s3 != null && s3.compareTo(s5) <= 0) {
                            continue;
                        }
                        s4 = (String)entry.getKey();
                        s3 = s5;
                    }
                }
            }
            final HashSet set = new HashSet(((SharedPreferences)this.a).getStringSet(s, (Set)new HashSet()));
            set.remove(s2);
            ((SharedPreferences)this.a).edit().putStringSet(s, (Set)set).putLong("fire-count", long1 - 1L).commit();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void af(final String s) {
        synchronized (this) {
            final String ad = this.ad(s);
            if (ad == null) {
                return;
            }
            final HashSet set = new HashSet(((SharedPreferences)this.a).getStringSet(ad, (Set)new HashSet()));
            set.remove(s);
            if (set.isEmpty()) {
                ((SharedPreferences)this.a).edit().remove(ad).commit();
                return;
            }
            ((SharedPreferences)this.a).edit().putStringSet(ad, (Set)set).commit();
        }
    }
    
    public static void b(final ahal ahal, final ahcq ahcq, final Object o, final Object o2) {
        ahau.h(ahal, (ahek)ahcq.c, 1, o);
        ahau.h(ahal, (ahek)ahcq.d, 2, o2);
    }
    
    public static agnj v(final ahek ahek, final Object o, final ahek ahek2, final Object o2) {
        return new agnj(ahek, o, ahek2, o2);
    }
    
    public final agmt A(final String s, final String s2) {
        synchronized (this) {
            return agmt.a(((SharedPreferences)this.a).getString(aa(s, s2), (String)null));
        }
    }
    
    public final void B() {
        synchronized (this) {
            ((SharedPreferences)this.a).edit().clear().commit();
        }
    }
    
    public final void C(final String s, final String s2, final String s3, String b) {
        synchronized (this) {
            b = agmt.b(s3, b, System.currentTimeMillis());
            if (b == null) {
                return;
            }
            final SharedPreferences$Editor edit = ((SharedPreferences)this.a).edit();
            edit.putString(aa(s, s2), b);
            edit.commit();
        }
    }
    
    public final boolean D() {
        synchronized (this) {
            return ((SharedPreferences)this.a).getAll().isEmpty();
        }
    }
    
    public final Bundle E() {
        final Bundle bundle = new Bundle((Bundle)this.a);
        for (final String s : ((Bundle)this.a).keySet()) {
            if (!s.startsWith("google.c.a.") && !s.equals("from")) {
                bundle.remove(s);
            }
        }
        return bundle;
    }
    
    public final Integer F(final String s) {
        final String i = this.I(s);
        if (!TextUtils.isEmpty((CharSequence)i)) {
            try {
                return Integer.parseInt(i);
            }
            catch (final NumberFormatException ex) {
                final String j = J(s);
                final StringBuilder sb = new StringBuilder("Couldn't parse value of ");
                sb.append(j);
                sb.append("(");
                sb.append(i);
                sb.append(") into an int");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }
    
    public final String G(final Resources resources, String o, String j) {
        final String i = this.I(j.concat("_loc_key"));
        if (TextUtils.isEmpty((CharSequence)i)) {
            return null;
        }
        final int identifier = resources.getIdentifier(i, "string", (String)o);
        if (identifier != 0) {
            final JSONArray k = this.K(j.concat("_loc_args"));
            if (k == null) {
                o = null;
            }
            else {
                final int length = k.length();
                final String[] array = new String[length];
                int n = 0;
                while (true) {
                    o = array;
                    if (n >= length) {
                        break;
                    }
                    array[n] = k.optString(n);
                    ++n;
                }
            }
            if (o == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, (Object[])o);
            }
            catch (final MissingFormatArgumentException ex) {
                j = J(j);
                o = Arrays.toString((Object[])o);
                final StringBuilder sb = new StringBuilder("Missing format argument for ");
                sb.append(j);
                sb.append(": ");
                sb.append((String)o);
                sb.append(" Default value will be used.");
                Log.w("NotificationParams", sb.toString(), (Throwable)ex);
                return null;
            }
        }
        o = J(j.concat("_loc_key"));
        final StringBuilder sb2 = new StringBuilder();
        sb2.append((String)o);
        sb2.append(" resource not found: ");
        sb2.append(j);
        sb2.append(" Default value will be used.");
        Log.w("NotificationParams", sb2.toString());
        return null;
    }
    
    public final String H(final Resources resources, final String s, final String s2) {
        final String i = this.I(s2);
        if (!TextUtils.isEmpty((CharSequence)i)) {
            return i;
        }
        return this.G(resources, s, s2);
    }
    
    public final String I(final String s) {
        final Bundle bundle = (Bundle)this.a;
        String s2 = s;
        if (!bundle.containsKey(s)) {
            s2 = s;
            if (s.startsWith("gcm.n.")) {
                final String ab = ab(s);
                s2 = s;
                if (((Bundle)this.a).containsKey(ab)) {
                    s2 = ab;
                }
            }
        }
        return bundle.getString(s2);
    }
    
    public final JSONArray K(final String s) {
        final String i = this.I(s);
        if (!TextUtils.isEmpty((CharSequence)i)) {
            try {
                return new JSONArray(i);
            }
            catch (final JSONException ex) {
                final String j = J(s);
                final StringBuilder sb = new StringBuilder("Malformed JSON for key ");
                sb.append(j);
                sb.append(": ");
                sb.append(i);
                sb.append(", falling back to default");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }
    
    public final boolean L(String i) {
        i = this.I(i);
        return "1".equals(i) || Boolean.parseBoolean(i);
    }
    
    public final List N() {
        monitorenter(this);
        try {
            final ArrayList<agkv> list = new ArrayList<agkv>();
            for (final Map.Entry<String, V> entry : ((SharedPreferences)this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    list.add(new agkv((String)entry.getKey(), (List)new ArrayList((Collection<?>)entry.getValue())));
                }
            }
            this.R(System.currentTimeMillis());
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void O() {
        monitorenter(this);
        try {
            final SharedPreferences$Editor edit = ((SharedPreferences)this.a).edit();
            for (final Map.Entry<String, V> entry : ((SharedPreferences)this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    edit.remove((String)entry.getKey());
                }
            }
            edit.remove("fire-count");
            edit.commit();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void P() {
        synchronized (this) {
            final String ac = this.ac(System.currentTimeMillis());
            ((SharedPreferences)this.a).edit().putString("last-used-date", ac).commit();
            this.af(ac);
        }
    }
    
    public final void Q(long n, final String s) {
        synchronized (this) {
            final String ac = this.ac(n);
            if (((SharedPreferences)this.a).getString("last-used-date", "").equals(ac)) {
                return;
            }
            if ((n = ((SharedPreferences)this.a).getLong("fire-count", 0L)) + 1L == 30L) {
                this.ae();
                n = ((SharedPreferences)this.a).getLong("fire-count", 0L);
            }
            final HashSet set = new HashSet(((SharedPreferences)this.a).getStringSet(s, (Set)new HashSet()));
            set.add(ac);
            ((SharedPreferences)this.a).edit().putStringSet(s, (Set)set).putLong("fire-count", n + 1L).putString("last-used-date", ac).commit();
        }
    }
    
    final void R(final long n) {
        synchronized (this) {
            ((SharedPreferences)this.a).edit().putLong("fire-global", n).commit();
        }
    }
    
    final boolean S(final long n, final long n2) {
        synchronized (this) {
            return this.ac(n).equals(this.ac(n2));
        }
    }
    
    public final boolean T(final long n) {
        synchronized (this) {
            return this.U(n);
        }
    }
    
    final boolean U(final long n) {
        synchronized (this) {
            if (!((SharedPreferences)this.a).contains("fire-global")) {
                ((SharedPreferences)this.a).edit().putLong("fire-global", n).commit();
                return true;
            }
            if (!this.S(((SharedPreferences)this.a).getLong("fire-global", -1L), n)) {
                ((SharedPreferences)this.a).edit().putLong("fire-global", n).commit();
                return true;
            }
            return false;
        }
    }
    
    public final void V(final agip... array) {
        try {
            final Thing[] array2 = { null };
            System.arraycopy(array, 0, array2, 0, 1);
            this.W(new MutateRequest(1, array2, null, null, null, null, null));
        }
        catch (final ArrayStoreException ex) {
            nnv.b((Exception)new agin("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }
    
    public final void W(final MutateRequest mutateRequest) {
        final Object a = this.a;
        final agiv agiv = (agiv)a;
        final ateg ateg = new ateg(agiv, mutateRequest);
        ((nnc)((nns)ateg.b).a).l((Executor)a, (nmv)a);
        synchronized (agiv.b) {
            final boolean empty = ((agiv)a).b.isEmpty();
            ((agiv)a).b.add(ateg);
            monitorexit(agiv.b);
            if (empty) {
                ateg.f();
            }
        }
    }
    
    public final int X() {
        return ((aggr)this.a).a.length;
    }
    
    public final void c(final int n, final boolean b) {
        ((ahal)this.a).l(n, b);
    }
    
    public final void d(final int n, final ahab ahab) {
        ((ahal)this.a).n(n, ahab);
    }
    
    public final void e(final int n, final double n2) {
        ((ahal)this.a).ap(n, n2);
    }
    
    public final void f(final int n, final int n2) {
        ((ahal)this.a).t(n, n2);
    }
    
    public final void g(final int n, final int n2) {
        ((ahal)this.a).p(n, n2);
    }
    
    public final void h(final int n, final long n2) {
        ((ahal)this.a).r(n, n2);
    }
    
    public final void i(final int n, final float n2) {
        ((ahal)this.a).ar(n, n2);
    }
    
    public final void j(final int n, final Object o, final ahdo ahdo) {
        final Object a = this.a;
        final MessageLite messageLite = (MessageLite)o;
        final ahal ahal = (ahal)a;
        ahal.B(n, 3);
        ahdo.l((Object)messageLite, ahal.f);
        ahal.B(n, 4);
    }
    
    public final void k(final int n, final int n2) {
        ((ahal)this.a).t(n, n2);
    }
    
    public final void l(final int n, final long n2) {
        ((ahal)this.a).E(n, n2);
    }
    
    public final void m(final int n, final Object o, final ahdo ahdo) {
        ((ahal)this.a).v(n, (MessageLite)o, ahdo);
    }
    
    public final void n(final int n, final Object o) {
        if (o instanceof ahab) {
            ((ahal)this.a).y(n, (ahab)o);
            return;
        }
        ((ahal)this.a).x(n, (MessageLite)o);
    }
    
    public final void o(final int n, final int n2) {
        ((ahal)this.a).p(n, n2);
    }
    
    public final void p(final int n, final long n2) {
        ((ahal)this.a).r(n, n2);
    }
    
    public final void q(final int n, final int n2) {
        ((ahal)this.a).au(n, n2);
    }
    
    public final void r(final int n, final long n2) {
        ((ahal)this.a).aw(n, n2);
    }
    
    public final void s(final int n, final String s) {
        ((ahal)this.a).z(n, s);
    }
    
    public final void t(final int n, final int n2) {
        ((ahal)this.a).C(n, n2);
    }
    
    public final void u(final int n, final long n2) {
        ((ahal)this.a).E(n, n2);
    }
    
    public final void w() {
        final ainq ainq = (ainq)((ahaz)this.a).build();
    }
    
    public final aiot x(final vfp vfp) {
        return new aiot((aino)((ahaz)this.a).build(), vfp);
    }
    
    public final aior y(final vfp vfp) {
        return new aior((ainm)((ahaz)this.a).build());
    }
    
    public final aiaa z() {
        return new aiaa((aiab)((ahaz)this.a).build());
    }
}
