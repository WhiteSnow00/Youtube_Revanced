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

public final class bqu extends bqx
{
    public static final afgb a;
    public static final afgb b;
    public final Object c;
    public final Context d;
    public final boolean e;
    public bqk f;
    public bqp g;
    public axt h;
    
    static {
        a = afgb.d((Comparator)aaq.h);
        b = afgb.d((Comparator)aaq.i);
    }
    
    @Deprecated
    public bqu() {
        final bqk b = bqk.B;
        throw null;
    }
    
    public bqu(final Context context) {
        final bqk b = bqk.b(context);
        this.c = new Object();
        final bqp bqp = null;
        Context applicationContext;
        if (context != null) {
            applicationContext = context.getApplicationContext();
        }
        else {
            applicationContext = null;
        }
        this.d = applicationContext;
        this.f = b;
        this.h = axt.a;
        boolean e = false;
        if (context != null) {
            e = e;
            if (baw.ah(context)) {
                e = true;
            }
        }
        if (!(this.e = e) && context != null && baw.a >= 32) {
            final AudioManager audioManager = (AudioManager)context.getSystemService("audio");
            bqp g;
            if (audioManager == null) {
                g = bqp;
            }
            else {
                g = new bqp(audioManager.getSpatializer());
            }
            this.g = g;
        }
        if (this.f.L && context == null) {
            bao.c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
    
    protected static int a(final ayf ayf, String e, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)e) && e.equals(ayf.e)) {
            return 4;
        }
        e = e(e);
        final String e2 = e(ayf.e);
        if (e2 != null && e != null) {
            if (e2.startsWith(e) || e.startsWith(e2)) {
                return 3;
            }
            if (baw.aq(e2, "-")[0].equals(baw.aq(e, "-")[0])) {
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
        f = beq.f(f);
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
    
    private final void p(final bqk f) {
        synchronized (this.c) {
            final boolean equals = this.f.equals((Object)f);
            this.f = f;
            monitorexit(this.c);
            if (equals ^ true) {
                if (f.L && this.d == null) {
                    bao.c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                ((bra)this).o();
            }
        }
    }
    
    private static void q(final bpd bpd, final azo azo) {
        for (int i = 0; i < bpd.b; ++i) {
            if (azo.z.get((Object)bpd.b(i)) != null) {
                throw null;
            }
        }
    }
    
    private static final Pair r(int i, final abkz abkz, final int[][][] array, final bqr bqr, final Comparator comparator) {
        final ArrayList list = new ArrayList();
        int n;
        for (int a = abkz.a, j = 0; j < a; ++j, a = n) {
            n = a;
            if (i == abkz.c(j)) {
                final bpd f = abkz.f(j);
                int n2 = 0;
                while (true) {
                    n = a;
                    if (n2 >= f.b) {
                        break;
                    }
                    final azm b = f.b(n2);
                    final List a2 = bqr.a(j, b, array[j][n2]);
                    final boolean[] array2 = new boolean[b.a];
                    for (int k = 0; k < b.a; ++k) {
                        final bqs bqs = a2.get(k);
                        final int b2 = bqs.b();
                        if (!array2[k]) {
                            if (b2 != 0) {
                                Object r;
                                if (b2 == 1) {
                                    r = afcr.r((Object)bqs);
                                }
                                else {
                                    r = new ArrayList<bqs>();
                                    ((List<bqs>)r).add(bqs);
                                    for (int l = k + 1; l < b.a; ++l) {
                                        final bqs bqs2 = a2.get(l);
                                        if (bqs2.b() == 2 && bqs.c(bqs2)) {
                                            ((List<bqs>)r).add(bqs2);
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
            array3[i] = ((bqs)list2.get(i)).c;
        }
        final bqs bqs3 = (bqs)list2.get(0);
        return Pair.create((Object)new dmk(bqs3.b, array3), (Object)bqs3.a);
    }
    
    public final bqk d() {
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
                    if (baw.a >= 32) {
                        final bqp g = this.g;
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
                ((bra)this).o();
            }
        }
    }
    
    public final void g() {
        synchronized (this.c) {
            if (baw.a >= 32) {
                final bqp g = this.g;
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
    
    public final void h(final axt h) {
        synchronized (this.c) {
            final boolean equals = this.h.equals((Object)h);
            this.h = h;
            monitorexit(this.c);
            if (equals ^ true) {
                this.f();
            }
        }
    }
    
    public final void i(final azo azo) {
        if (azo instanceof bqk) {
            this.p((bqk)azo);
        }
        final bqj bqj = new bqj(this.d());
        bqj.g(azo);
        this.p(bqj.f());
    }
    
    public final boolean j() {
        return true;
    }
    
    protected final Pair l(final abkz abkz, final int[][][] array, final int[] array2) {
        Object o = this.c;
        monitorenter(o);
        try {
            final bqk f = this.f;
            if (f.L && baw.a >= 32) {
                final bqp g = this.g;
                if (g != null) {
                    final Looper myLooper = Looper.myLooper();
                    dk.e((Object)myLooper);
                    if (g.d == null && g.c == null) {
                        g.d = (Spatializer$OnSpatializerStateChangedListener)new bqo(this);
                        g.c = new Handler(myLooper);
                        final Spatializer a = g.a;
                        final Handler c = g.c;
                        c.getClass();
                        a.addOnSpatializerStateChangedListener((Executor)new bqn(c, 0), g.d);
                    }
                }
            }
            monitorexit(o);
            final int a2 = abkz.a;
            final dmk[] array3 = new dmk[a2];
            final Pair r = r(2, abkz, array, (bqr)new bqg(f, array2, 1), (Comparator)aaq.f);
            if (r != null) {
                array3[r.second] = (dmk)r.first;
            }
            while (true) {
                for (int i = 0; i < abkz.a; ++i) {
                    if (abkz.c(i) == 2 && abkz.f(i).b > 0) {
                        final boolean b = true;
                        o = r(1, abkz, array, (bqr)new bqf(this, f, b), (Comparator)aaq.e);
                        if (o != null) {
                            array3[((Pair)o).second] = (dmk)((Pair)o).first;
                        }
                        String e;
                        if (o == null) {
                            e = null;
                        }
                        else {
                            e = ((azm)((dmk)((Pair)o).first).b).a(((int[])((dmk)((Pair)o).first).a)[0]).e;
                        }
                        final Pair r2 = r(3, abkz, array, (bqr)new bqg(f, e, 0), (Comparator)aaq.g);
                        if (r2 != null) {
                            array3[r2.second] = (dmk)r2.first;
                        }
                        for (int j = 0; j < a2; ++j) {
                            final int c2 = abkz.c(j);
                            if (c2 != 2 && c2 != 1 && c2 != 3) {
                                final bpd f2 = abkz.f(j);
                                final int[][] array4 = array[j];
                                int k = 0;
                                Object o2 = null;
                                int n = 0;
                                bqi bqi = null;
                                while (k < f2.b) {
                                    final azm b2 = f2.b(k);
                                    final int[] array5 = array4[k];
                                    bqi bqi2;
                                    int n2;
                                    for (int l = 0; l < b2.a; ++l, bqi = bqi2, o2 = o, n = n2) {
                                        bqi2 = bqi;
                                        o = o2;
                                        n2 = n;
                                        if (k(array5[l], f.M)) {
                                            final bqi bqi3 = new bqi(b2.a(l), array5[l]);
                                            if (bqi != null) {
                                                bqi2 = bqi;
                                                o = o2;
                                                n2 = n;
                                                if (bqi3.a(bqi) <= 0) {
                                                    continue;
                                                }
                                            }
                                            bqi2 = bqi3;
                                            n2 = l;
                                            o = b2;
                                        }
                                    }
                                    ++k;
                                }
                                dmk dmk;
                                if (o2 == null) {
                                    dmk = null;
                                }
                                else {
                                    dmk = new dmk((azm)o2, new int[] { n });
                                }
                                array3[j] = dmk;
                            }
                        }
                        final int a3 = abkz.a;
                        final HashMap hashMap = new HashMap();
                        for (int n3 = 0; n3 < a3; ++n3) {
                            q(abkz.f(n3), f);
                        }
                        q((bpd)abkz.c, f);
                        for (int n4 = 0; n4 < a3; ++n4) {
                            if (hashMap.get(abkz.c(n4)) != null) {
                                throw null;
                            }
                        }
                        for (int a4 = abkz.a, n5 = 0; n5 < a4; ++n5) {
                            final bpd f3 = abkz.f(n5);
                            final Map map = (Map)f.P.get(n5);
                            if (map != null && map.containsKey(f3)) {
                                final Map map2 = (Map)f.P.get(n5);
                                bqm bqm;
                                if (map2 != null) {
                                    bqm = map2.get(f3);
                                }
                                else {
                                    bqm = null;
                                }
                                if (bqm != null) {
                                    throw null;
                                }
                                array3[n5] = null;
                            }
                        }
                        for (int n6 = 0; n6 < a2; ++n6) {
                            final int c3 = abkz.c(n6);
                            if (f.c(n6) || f.A.contains((Object)c3)) {
                                array3[n6] = null;
                            }
                        }
                        final brd m = ((bra)this).k;
                        dk.e((Object)m);
                        final ArrayList list = new ArrayList();
                        for (final dmk dmk2 : array3) {
                            if (dmk2 != null && ((int[])dmk2.a).length > 1) {
                                final afcm d = afcr.d();
                                d.h(new bqc(0L, 0L));
                                list.add(d);
                            }
                            else {
                                list.add(null);
                            }
                        }
                        final long[][] array6 = new long[a2][];
                        for (int n8 = 0; n8 < a2; ++n8) {
                            o = array3[n8];
                            if (o == null) {
                                array6[n8] = new long[0];
                            }
                            else {
                                array6[n8] = new long[((int[])((dmk)o).a).length];
                                int n9 = 0;
                                while (true) {
                                    final int[] array7 = (int[])((dmk)o).a;
                                    if (n9 >= array7.length) {
                                        break;
                                    }
                                    final long n10 = ((azm)((dmk)o).b).a(array7[n9]).j;
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
                        o = new long[a2];
                        for (int n12 = 0; n12 < a2; ++n12) {
                            final long[] array10 = array6[n12];
                            long n13;
                            if (array10.length == 0) {
                                n13 = 0L;
                            }
                            else {
                                n13 = array10[0];
                            }
                            o[n12] = n13;
                        }
                        bqd.s((List)list, (long[])o);
                        final afer b3 = xpb.A().b().B();
                        for (int n14 = 0; n14 < a2; ++n14) {
                            final int length = array6[n14].length;
                            if (length > 1) {
                                final double[] array11 = new double[length];
                                int n15 = 0;
                                while (true) {
                                    final long[] array12 = array6[n14];
                                    final int length2 = array12.length;
                                    double log = 0.0;
                                    if (n15 >= length2) {
                                        break;
                                    }
                                    final long n16 = array12[n15];
                                    if (n16 != -1L) {
                                        log = Math.log((double)n16);
                                    }
                                    array11[n15] = log;
                                    ++n15;
                                }
                                final int n17 = length - 1;
                                final double n18 = array11[n17] - array11[0];
                                int n20;
                                for (int n19 = 0; n19 < n17; n19 = n20) {
                                    n20 = n19 + 1;
                                    final double n21 = array11[n19];
                                    final double n22 = array11[n20];
                                    double n23;
                                    if (n18 == 0.0) {
                                        n23 = 1.0;
                                    }
                                    else {
                                        n23 = ((n21 + n22) * 0.5 - array11[0]) / n18;
                                    }
                                    ((affl)b3).p((Object)n23, (Object)n14);
                                }
                            }
                        }
                        final afcr o3 = afcr.o(((affl)b3).u());
                        for (int n24 = 0; n24 < o3.size(); ++n24) {
                            final int intValue = (int)o3.get(n24);
                            final int n25 = array9[intValue] + 1;
                            array9[intValue] = n25;
                            o[intValue] = array6[intValue][n25];
                            bqd.s((List)list, (long[])o);
                        }
                        for (int n26 = 0; n26 < a2; ++n26) {
                            if (list.get(n26) != null) {
                                final long n27 = o[n26];
                                o[n26] = n27 + n27;
                            }
                        }
                        bqd.s((List)list, (long[])o);
                        o = afcr.d();
                        for (int n28 = 0; n28 < list.size(); ++n28) {
                            final afcm afcm = (afcm)list.get(n28);
                            afcr afcr;
                            if (afcm == null) {
                                afcr = afcr.q();
                            }
                            else {
                                afcr = afcm.g();
                            }
                            ((afcm)o).h(afcr);
                        }
                        o = ((afcm)o).g();
                        final bqv[] array13 = new bqv[a2];
                        for (int n29 = 0; n29 < a2; ++n29) {
                            final dmk dmk3 = array3[n29];
                            if (dmk3 != null) {
                                final int[] array14 = (int[])dmk3.a;
                                final int length3 = array14.length;
                                if (length3 != 0) {
                                    Object o4;
                                    if (length3 == 1) {
                                        o4 = new bqw((azm)dmk3.b, array14[0]);
                                    }
                                    else {
                                        o4 = new bqd((azm)dmk3.b, array14, m, (List)((afcr)o).get(n29));
                                    }
                                    array13[n29] = (bqv)o4;
                                }
                            }
                        }
                        final bfs[] array15 = new bfs[a2];
                        for (int n30 = 0; n30 < a2; ++n30) {
                            final int c4 = abkz.c(n30);
                            bfs a5 = null;
                            Label_1882: {
                                if (!f.c(n30)) {
                                    if (!f.A.contains((Object)c4)) {
                                        if (abkz.c(n30) == -2 || array13[n30] != null) {
                                            a5 = bfs.a;
                                            break Label_1882;
                                        }
                                    }
                                }
                                a5 = null;
                            }
                            array15[n30] = a5;
                        }
                        final boolean n31 = f.N;
                        return Pair.create((Object)array15, (Object)array13);
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
