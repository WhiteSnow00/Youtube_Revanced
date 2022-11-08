import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.EnumSet;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnm
{
    public static final String[] a;
    public static final List b;
    public static volatile int c;
    @Deprecated
    public static final lzh m;
    public static final kgk n;
    public static final kgk o;
    public final Context d;
    public final mnn e;
    public final String f;
    public final EnumSet g;
    public final mnp h;
    public final List i;
    public final String j;
    public final String k;
    public int l;
    
    static {
        m = new lzh("ClearcutLogger.API", n = (kgk)new mnj(), o = new kgk(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        a = new String[0];
        b = new CopyOnWriteArrayList();
        mnm.c = -1;
    }
    
    public mnm(final Context context, final String s, final String s2) {
        this(context, s, s2, mnr.e, mnv.b(context), (mnp)new mnz(context));
    }
    
    public mnm(final Context context, final String j, final String k, final EnumSet g, final mnn e, final mnp h) {
        this.i = new CopyOnWriteArrayList();
        this.l = 1;
        f(g, k);
        this.d = context.getApplicationContext();
        this.f = context.getPackageName();
        this.j = j;
        this.k = k;
        this.g = g;
        this.e = e;
        this.l = 1;
        this.h = h;
    }
    
    public static mnk a(final Context context, final String s) {
        return new mnk(context, s);
    }
    
    public static mnm c(final Context context, final String s) {
        final mnk a = a(context, s);
        a.b(mnr.f);
        return a.a();
    }
    
    public static String d(final Iterable iterable) {
        return aexm.b(", ").d(iterable);
    }
    
    public static void e(final EnumSet set) {
        if (!set.equals(mnr.g) && !set.equals(mnr.e) && !set.equals(mnr.f)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or PIILevel.DEIDENTIFIED");
        }
    }
    
    public static void f(final EnumSet set, final String s) {
        if (!set.contains(mnr.d)) {
            kgk.aN(s == null, (Object)"Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        e(set);
    }
    
    public static int[] h(final ArrayList list) {
        if (list == null) {
            return null;
        }
        final int[] array = new int[list.size()];
        for (int size = list.size(), i = 0, n = 0; i < size; ++i, ++n) {
            array[n] = (int)list.get(i);
        }
        return array;
    }
    
    @Deprecated
    public final mnl b(final MessageLite messageLite) {
        messageLite.getClass();
        return new mnl(this, null, (aeyr)new ljc(messageLite, 4));
    }
    
    public final boolean g() {
        return this.g.equals(mnr.f);
    }
}
