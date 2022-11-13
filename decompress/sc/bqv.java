import android.media.Spatializer;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.os.Looper;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import android.util.Pair;
import android.text.TextUtils;
import android.media.AudioManager;
import java.util.Comparator;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqv extends bqy
{
    public static final afib a;
    public static final afib b;
    public final Object c;
    public final Context d;
    public final boolean e;
    public bql f;
    public bqq g;
    public axu h;
    
    static {
        a = afib.d(aar.h);
        b = afib.d(aar.i);
    }
    
    @Deprecated
    public bqv() {
        final bql b = bql.B;
        throw null;
    }
    
    public bqv(final Context context) {
        final bql b = bql.b(context);
        this.c = new Object();
        final bqq bqq = null;
        Context applicationContext;
        if (context != null) {
            applicationContext = context.getApplicationContext();
        }
        else {
            applicationContext = null;
        }
        this.d = applicationContext;
        this.f = b;
        this.h = axu.a;
        boolean e = false;
        if (context != null) {
            e = e;
            if (bax.ah(context)) {
                e = true;
            }
        }
        if (!(this.e = e) && context != null && bax.a >= 32) {
            final AudioManager audioManager = (AudioManager)context.getSystemService("audio");
            bqq g;
            if (audioManager == null) {
                g = bqq;
            }
            else {
                g = new bqq(audioManager.getSpatializer());
            }
            this.g = g;
        }
        if (this.f.L && context == null) {
            bap.c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
    
    protected static int a(final ayg ayg, String e, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)e) && e.equals(ayg.e)) {
            return 4;
        }
        e = e(e);
        final String e2 = e(ayg.e);
        if (e2 != null && e != null) {
            if (e2.startsWith(e) || e.startsWith(e2)) {
                return 3;
            }
            if (bax.aq(e2, "-")[0].equals(bax.aq(e, "-")[0])) {
                return 2;
            }
            return 0;
        }
        else {
            if (b && e2 == null) {
                return 1;
            }
            return 0;
        }
    }
    
    public static int b(final int n, final int n2) {
        if (n != 0 && n == n2) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(n & n2);
    }
    
    protected static String e(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s) && !TextUtils.equals((CharSequence)s, (CharSequence)"und")) {
            return s;
        }
        return null;
    }
    
    protected static boolean k(int f, final boolean b) {
        f = ber.f(f);
        boolean b2 = true;
        if (f != 4) {
            if (b) {
                if (f != 3) {
                    return false;
                }
                b2 = b2;
            }
            else {
                b2 = false;
            }
        }
        return b2;
    }
    
    private final void p(final bql f) {
        synchronized (this.c) {
            final boolean equals = this.f.equals((Object)f);
            this.f = f;
            monitorexit(this.c);
            if (equals ^ true) {
                if (f.L && this.d == null) {
                    bap.c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                ((brb)this).o();
            }
        }
    }
    
    private static void q(final bpe bpe, final azp azp) {
        for (int i = 0; i < bpe.b; ++i) {
            if (azp.z.get(bpe.b(i)) != null) {
                throw null;
            }
        }
    }
    
    private static final Pair r(int i, final abmz abmz, final int[][][] array, final bqs bqs, final Comparator comparator) {
        final ArrayList list = new ArrayList();
        int n;
        for (int a = abmz.a, j = 0; j < a; ++j, a = n) {
            n = a;
            if (i == abmz.c(j)) {
                final bpe f = abmz.f(j);
                int n2 = 0;
                while (true) {
                    n = a;
                    if (n2 >= f.b) {
                        break;
                    }
                    final azn b = f.b(n2);
                    final List a2 = bqs.a(j, b, array[j][n2]);
                    final boolean[] array2 = new boolean[b.a];
                    for (int k = 0; k < b.a; ++k) {
                        final bqt bqt = a2.get(k);
                        final int b2 = bqt.b();
                        if (!array2[k]) {
                            if (b2 != 0) {
                                Object r;
                                if (b2 == 1) {
                                    r = afeq.r((Object)bqt);
                                }
                                else {
                                    r = new ArrayList<bqt>();
                                    ((List<bqt>)r).add(bqt);
                                    for (int l = k + 1; l < b.a; ++l) {
                                        final bqt bqt2 = a2.get(l);
                                        if (bqt2.b() == 2 && bqt.c(bqt2)) {
                                            ((List<bqt>)r).add(bqt2);
                                            array2[l] = true;
                                        }
                                    }
                                }
                                list.add(r);
                            }
                        }
                    }
                    ++n2;
                }
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        final List list2 = Collections.max((Collection<? extends List>)list, (Comparator<? super List>)comparator);
        final int[] array3 = new int[list2.size()];
        for (i = 0; i < list2.size(); ++i) {
            array3[i] = ((bqt)list2.get(i)).c;
        }
        final bqt bqt3 = (bqt)list2.get(0);
        return Pair.create((Object)new dml(bqt3.b, array3), (Object)bqt3.a);
    }
    
    public final /* bridge */ azp c() {
        return this.d();
    }
    
    public final bql d() {
        synchronized (this.c) {
            return this.f;
        }
    }
    
    public final void f() {
        synchronized (this.c) {
            final boolean l = this.f.L;
            int n2;
            final int n = n2 = 0;
            if (l) {
                n2 = n;
                if (!this.e) {
                    n2 = n;
                    if (bax.a >= 32) {
                        final bqq g = this.g;
                        n2 = n;
                        if (g != null) {
                            n2 = n;
                            if (g.b) {
                                n2 = 1;
                            }
                        }
                    }
                }
            }
            monitorexit(this.c);
            if (n2 != 0) {
                ((brb)this).o();
            }
        }
    }
    
    public final void g() {
        synchronized (this.c) {
            if (bax.a >= 32) {
                final bqq g = this.g;
                if (g != null) {
                    final Spatializer$OnSpatializerStateChangedListener d = g.d;
                    if (d != null && g.c != null) {
                        g.a.removeOnSpatializerStateChangedListener(d);
                        g.c.removeCallbacksAndMessages((Object)null);
                        g.c = null;
                        g.d = null;
                    }
                }
            }
            monitorexit(this.c);
            super.g();
        }
    }
    
    public final void h(final axu h) {
        synchronized (this.c) {
            final boolean equals = this.h.equals((Object)h);
            this.h = h;
            monitorexit(this.c);
            if (equals ^ true) {
                this.f();
            }
        }
    }
    
    public final void i(final azp azp) {
        if (azp instanceof bql) {
            this.p((bql)azp);
        }
        final bqk bqk = new bqk(this.d());
        bqk.g(azp);
        this.p(bqk.f());
    }
    
    public final boolean j() {
        return true;
    }
    
    protected final Pair l(final abmz abmz, final int[][][] array, final int[] array2) {
        Object o = this.c;
        monitorenter(o);
        try {
            final bql f = this.f;
            if (f.L && bax.a >= 32) {
                final bqq g = this.g;
                if (g != null) {
                    final Looper myLooper = Looper.myLooper();
                    dk.e((Object)myLooper);
                    if (g.d == null && g.c == null) {
                        g.d = (Spatializer$OnSpatializerStateChangedListener)new bqp(this);
                        g.c = new Handler(myLooper);
                        final Spatializer a = g.a;
                        final Handler c = g.c;
                        c.getClass();
                        a.addOnSpatializerStateChangedListener((Executor)new bqo(c, 0), g.d);
                    }
                }
            }
            monitorexit(o);
            final int a2 = abmz.a;
            final dml[] array3 = new dml[a2];
            final Pair r = r(2, abmz, array, (bqs)new bqh(f, array2, 1), aar.f);
            if (r != null) {
                array3[r.second] = (dml)r.first;
            }
            while (true) {
                for (int i = 0; i < abmz.a; ++i) {
                    if (abmz.c(i) == 2 && abmz.f(i).b > 0) {
                        final boolean b = true;
                        o = r(1, abmz, array, (bqs)new bqg(this, f, b), aar.e);
                        if (o != null) {
                            array3[((Pair)o).second] = (dml)((Pair)o).first;
                        }
                        String e;
                        if (o == null) {
                            e = null;
                        }
                        else {
                            e = ((azn)((dml)((Pair)o).first).b).a(((int[])((dml)((Pair)o).first).a)[0]).e;
                        }
                        final Pair r2 = r(3, abmz, array, (bqs)new bqh(f, e, 0), aar.g);
                        if (r2 != null) {
                            array3[r2.second] = (dml)r2.first;
                        }
                        for (int j = 0; j < a2; ++j) {
                            final int c2 = abmz.c(j);
                            if (c2 != 2 && c2 != 1 && c2 != 3) {
                                final bpe f2 = abmz.f(j);
                                final int[][] array4 = array[j];
                                int k = 0;
                                o = null;
                                int n = 0;
                                bqj bqj = null;
                                while (k < f2.b) {
                                    final azn b2 = f2.b(k);
                                    final int[] array5 = array4[k];
                                    bqj bqj2;
                                    Pair pair;
                                    int n2;
                                    for (int l = 0; l < b2.a; ++l, bqj = bqj2, o = pair, n = n2) {
                                        bqj2 = bqj;
                                        pair = (Pair)o;
                                        n2 = n;
                                        if (k(array5[l], f.M)) {
                                            final bqj bqj3 = new bqj(b2.a(l), array5[l]);
                                            if (bqj != null) {
                                                bqj2 = bqj;
                                                pair = (Pair)o;
                                                n2 = n;
                                                if (bqj3.a(bqj) <= 0) {
                                                    continue;
                                                }
                                            }
                                            bqj2 = bqj3;
                                            n2 = l;
                                            pair = (Pair)b2;
                                        }
                                    }
                                    ++k;
                                }
                                dml dml;
                                if (o == null) {
                                    dml = null;
                                }
                                else {
                                    dml = new dml((azn)o, new int[] { n });
                                }
                                array3[j] = dml;
                            }
                        }
                        final int a3 = abmz.a;
                        final HashMap hashMap = new HashMap();
                        for (int n3 = 0; n3 < a3; ++n3) {
                            q(abmz.f(n3), f);
                        }
                        q((bpe)abmz.c, f);
                        for (int n4 = 0; n4 < a3; ++n4) {
                            if (hashMap.get(abmz.c(n4)) != null) {
                                throw null;
                            }
                        }
                        for (int a4 = abmz.a, n5 = 0; n5 < a4; ++n5) {
                            final bpe f3 = abmz.f(n5);
                            final Map map = (Map)f.P.get(n5);
                            if (map != null && map.containsKey(f3)) {
                                final Map map2 = (Map)f.P.get(n5);
                                bqn bqn;
                                if (map2 != null) {
                                    bqn = map2.get(f3);
                                }
                                else {
                                    bqn = null;
                                }
                                if (bqn != null) {
                                    throw null;
                                }
                                array3[n5] = null;
                            }
                        }
                        for (int n6 = 0; n6 < a2; ++n6) {
                            final int c3 = abmz.c(n6);
                            if (f.c(n6) || f.A.contains((Object)c3)) {
                                array3[n6] = null;
                            }
                        }
                        final bre m = ((brb)this).k;
                        dk.e((Object)m);
                        o = new ArrayList();
                        for (final dml dml2 : array3) {
                            if (dml2 != null && ((int[])dml2.a).length > 1) {
                                final afel d = afeq.d();
                                d.h(new bqd(0L, 0L));
                                ((List<afel>)o).add(d);
                            }
                            else {
                                ((List<afel>)o).add(null);
                            }
                        }
                        final long[][] array6 = new long[a2][];
                        for (int n8 = 0; n8 < a2; ++n8) {
                            final dml dml3 = array3[n8];
                            if (dml3 == null) {
                                array6[n8] = new long[0];
                            }
                            else {
                                array6[n8] = new long[((int[])dml3.a).length];
                                int n9 = 0;
                                while (true) {
                                    final int[] array7 = (int[])dml3.a;
                                    if (n9 >= array7.length) {
                                        break;
                                    }
                                    final long n10 = ((azn)dml3.b).a(array7[n9]).j;
                                    final long[] array8 = array6[n8];
                                    long n11 = n10;
                                    if (n10 == -1L) {
                                        n11 = 0L;
                                    }
                                    array8[n9] = n11;
                                    ++n9;
                                }
                                Arrays.sort(array6[n8]);
                            }
                        }
                        final int[] array9 = new int[a2];
                        final long[] array10 = new long[a2];
                        for (int n12 = 0; n12 < a2; ++n12) {
                            final long[] array11 = array6[n12];
                            long n13;
                            if (array11.length == 0) {
                                n13 = 0L;
                            }
                            else {
                                n13 = array11[0];
                            }
                            array10[n12] = n13;
                        }
                        bqe.s((List)o, array10);
                        final afgq u = xra.t().b().u();
                        for (int n14 = 0; n14 < a2; ++n14) {
                            int length = array6[n14].length;
                            if (length > 1) {
                                final double[] array12 = new double[length];
                                int n15 = 0;
                                while (true) {
                                    final long[] array13 = array6[n14];
                                    final int length2 = array13.length;
                                    double log = 0.0;
                                    if (n15 >= length2) {
                                        break;
                                    }
                                    final long n16 = array13[n15];
                                    if (n16 != -1L) {
                                        log = Math.log((double)n16);
                                    }
                                    array12[n15] = log;
                                    ++n15;
                                }
                                --length;
                                final double n17 = array12[length] - array12[0];
                                int n18 = 0;
                                while (n18 < length) {
                                    final double n19 = array12[n18];
                                    ++n18;
                                    final double n20 = array12[n18];
                                    double n21;
                                    if (n17 == 0.0) {
                                        n21 = 1.0;
                                    }
                                    else {
                                        n21 = ((n19 + n20) * 0.5 - array12[0]) / n17;
                                    }
                                    ((afhl)u).p(n21, n14);
                                }
                            }
                        }
                        final afeq o2 = afeq.o(((afhl)u).u());
                        for (int n22 = 0; n22 < o2.size(); ++n22) {
                            final int intValue = (int)o2.get(n22);
                            final int n23 = array9[intValue] + 1;
                            array9[intValue] = n23;
                            array10[intValue] = array6[intValue][n23];
                            bqe.s((List)o, array10);
                        }
                        for (int n24 = 0; n24 < a2; ++n24) {
                            if (((List<afel>)o).get(n24) != null) {
                                final long n25 = array10[n24];
                                array10[n24] = n25 + n25;
                            }
                        }
                        bqe.s((List)o, array10);
                        final afel d2 = afeq.d();
                        for (int n26 = 0; n26 < ((List)o).size(); ++n26) {
                            final afel afel = ((List<afel>)o).get(n26);
                            afeq afeq;
                            if (afel == null) {
                                afeq = afeq.q();
                            }
                            else {
                                afeq = afel.g();
                            }
                            d2.h(afeq);
                        }
                        final afeq g2 = d2.g();
                        o = new bqw[a2];
                        for (int n27 = 0; n27 < a2; ++n27) {
                            final dml dml4 = array3[n27];
                            if (dml4 != null) {
                                final int[] array14 = (int[])dml4.a;
                                final int length3 = array14.length;
                                if (length3 != 0) {
                                    Object o3;
                                    if (length3 == 1) {
                                        o3 = new bqx((azn)dml4.b, array14[0]);
                                    }
                                    else {
                                        o3 = new bqe((azn)dml4.b, array14, m, (List)g2.get(n27));
                                    }
                                    o[n27] = o3;
                                }
                            }
                        }
                        final bft[] array15 = new bft[a2];
                        for (int n28 = 0; n28 < a2; ++n28) {
                            final int c4 = abmz.c(n28);
                            bft a5 = null;
                            Label_1866: {
                                if (!f.c(n28)) {
                                    if (!f.A.contains((Object)c4)) {
                                        if (abmz.c(n28) == -2 || o[n28] != null) {
                                            a5 = bft.a;
                                            break Label_1866;
                                        }
                                    }
                                }
                                a5 = null;
                            }
                            array15[n28] = a5;
                        }
                        final boolean n29 = f.N;
                        return Pair.create((Object)array15, o);
                    }
                }
                final boolean b = false;
                continue;
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
