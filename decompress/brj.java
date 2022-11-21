import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brj implements brh, bcq
{
    public static final afgh a;
    public static final afgh b;
    public static final afgh c;
    public static final afgh d;
    public static final afgh e;
    public static final afgh f;
    private static brj g;
    private final afgm h;
    private final brw i;
    private final boolean j;
    private int k;
    private long l;
    private long m;
    private int n;
    private long o;
    private long p;
    private long q;
    private long r;
    private final bhy s;
    
    static {
        final Long value = 1500000L;
        a = afgh.v(4800000L, 3100000L, 2100000L, value, 800000L);
        final Long value2 = 1000000L;
        b = afgh.v(value, value2, 730000L, 440000L, 170000L);
        final Long value3 = 1400000L;
        final Long value4 = 1100000L;
        c = afgh.v(2200000L, value3, value4, 910000L, 620000L);
        d = afgh.v(3000000L, 1900000L, value3, value2, 660000L);
        e = afgh.v(6000000L, 4100000L, 3200000L, 1800000L, value2);
        f = afgh.v(2800000L, 2400000L, 1600000L, value4, 950000L);
    }
    
    @Deprecated
    public brj() {
        final int a = afgm.a;
        final bae a2 = bae.a;
        throw null;
    }
    
    public brj(final Context context, final Map map) {
        this.h = afgm.k(map);
        this.s = new bhy((byte[])null);
        this.i = new brw(2000);
        this.j = true;
        if (context != null) {
            final aenl l = aenl.l(context);
            final int h = l.h();
            this.n = h;
            this.q = this.l(h);
            final oqz oqz = new oqz(this);
            for (final WeakReference weakReference : (CopyOnWriteArrayList)l.d) {
                if (weakReference.get() == null) {
                    ((CopyOnWriteArrayList)l.d).remove(weakReference);
                }
            }
            ((CopyOnWriteArrayList<WeakReference>)l.d).add(new WeakReference(oqz));
            ((Handler)l.c).post((Runnable)new vt(l, oqz, 20, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            return;
        }
        this.n = 0;
        this.q = this.l(0);
    }
    
    public static brj i(final Context context) {
        synchronized (brj.class) {
            if (brj.g == null) {
                Context applicationContext;
                if (context == null) {
                    applicationContext = null;
                }
                else {
                    applicationContext = context.getApplicationContext();
                }
                final int[] k = k(baz.Q(context));
                final HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                final afgh a = brj.a;
                hashMap.put(2, a.get(k[0]));
                hashMap.put(3, brj.b.get(k[1]));
                hashMap.put(4, brj.c.get(k[2]));
                hashMap.put(5, brj.d.get(k[3]));
                hashMap.put(10, brj.e.get(k[4]));
                hashMap.put(9, brj.f.get(k[5]));
                hashMap.put(7, a.get(k[0]));
                brj.g = new brj(applicationContext, hashMap);
            }
            return brj.g;
        }
    }
    
    public static int[] k(final String s) {
        final int hashCode = s.hashCode();
        if (hashCode != 2091) {
            if (hashCode != 2092) {
                if (hashCode != 2102) {
                    if (hashCode != 2103) {
                        if (hashCode != 2111) {
                            if (hashCode != 2112) {
                                if (hashCode != 2129) {
                                    if (hashCode != 2130) {
                                        if (hashCode != 2135) {
                                            if (hashCode != 2136) {
                                                Label_8413: {
                                                    switch (hashCode) {
                                                        default: {
                                                            switch (hashCode) {
                                                                default: {
                                                                    switch (hashCode) {
                                                                        default: {
                                                                            switch (hashCode) {
                                                                                default: {
                                                                                    switch (hashCode) {
                                                                                        default: {
                                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                                        }
                                                                                        case 2150: {
                                                                                            if (s.equals("CI")) {
                                                                                                return new int[] { 3, 4, 4, 4, 2, 2 };
                                                                                            }
                                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                                        }
                                                                                        case 2149: {
                                                                                            if (s.equals("CH")) {
                                                                                                return new int[] { 0, 0, 0, 1, 0, 2 };
                                                                                            }
                                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                                        }
                                                                                        case 2148: {
                                                                                            if (s.equals("CG")) {
                                                                                                return new int[] { 3, 4, 3, 3, 2, 2 };
                                                                                            }
                                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                                        }
                                                                                        case 2147: {
                                                                                            if (s.equals("CF")) {
                                                                                                return new int[] { 4, 2, 4, 2, 2, 2 };
                                                                                            }
                                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 2125: {
                                                                                    if (s.equals("BO")) {
                                                                                        return new int[] { 1, 2, 3, 2, 2, 2 };
                                                                                    }
                                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                                }
                                                                                case 2124: {
                                                                                    if (s.equals("BN")) {
                                                                                        return new int[] { 2, 2, 0, 0, 2, 2 };
                                                                                    }
                                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                                }
                                                                                case 2123: {
                                                                                    if (s.equals("BM")) {
                                                                                        return new int[] { 1, 2, 0, 0, 2, 2 };
                                                                                    }
                                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                                }
                                                                                case 2122: {
                                                                                    if (s.equals("BL")) {
                                                                                        return new int[] { 1, 2, 2, 2, 2, 2 };
                                                                                    }
                                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 2100: {
                                                                            if (s.equals("AU")) {
                                                                                return new int[] { 0, 1, 1, 1, 2, 0 };
                                                                            }
                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                        }
                                                                        case 2099: {
                                                                            if (s.equals("AT")) {
                                                                                return new int[] { 1, 0, 1, 1, 0, 0 };
                                                                            }
                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                        }
                                                                        case 2098: {
                                                                            if (s.equals("AS")) {
                                                                                return new int[] { 2, 2, 3, 3, 2, 2 };
                                                                            }
                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                        }
                                                                        case 2097: {
                                                                            if (s.equals("AR")) {
                                                                                return new int[] { 2, 1, 1, 1, 2, 2 };
                                                                            }
                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                        }
                                                                        case 2096: {
                                                                            if (s.equals("AQ")) {
                                                                                return new int[] { 4, 2, 2, 2, 2, 2 };
                                                                            }
                                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                case 2877: {
                                                                    if (s.equals("ZW")) {
                                                                        return new int[] { 4, 2, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2867: {
                                                                    if (s.equals("ZM")) {
                                                                        return new int[] { 3, 3, 4, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2855: {
                                                                    if (s.equals("ZA")) {
                                                                        return new int[] { 3, 2, 2, 1, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2843: {
                                                                    if (s.equals("YT")) {
                                                                        return new int[] { 4, 2, 2, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2828: {
                                                                    if (s.equals("YE")) {
                                                                        return new int[] { 4, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2803: {
                                                                    if (s.equals("XK")) {
                                                                        return new int[] { 1, 1, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2780: {
                                                                    if (s.equals("WS")) {
                                                                        return new int[] { 3, 1, 3, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2767: {
                                                                    if (s.equals("WF")) {
                                                                        return new int[] { 4, 2, 2, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2751: {
                                                                    if (s.equals("VU")) {
                                                                        return new int[] { 3, 3, 3, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2744: {
                                                                    if (s.equals("VN")) {
                                                                        return new int[] { 0, 3, 3, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2739: {
                                                                    if (s.equals("VI")) {
                                                                        return new int[] { 0, 2, 0, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2737: {
                                                                    if (s.equals("VG")) {
                                                                        return new int[] { 2, 2, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2735: {
                                                                    if (s.equals("VE")) {
                                                                        return new int[] { 4, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2733: {
                                                                    if (s.equals("VC")) {
                                                                        return new int[] { 1, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2731: {
                                                                    if (s.equals("VA")) {
                                                                        return new int[] { 1, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2725: {
                                                                    if (s.equals("UZ")) {
                                                                        return new int[] { 2, 2, 3, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2724: {
                                                                    if (s.equals("UY")) {
                                                                        return new int[] { 2, 1, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2718: {
                                                                    if (s.equals("US")) {
                                                                        return new int[] { 1, 0, 2, 2, 3, 1 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2706: {
                                                                    if (s.equals("UG")) {
                                                                        return new int[] { 3, 3, 4, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2700: {
                                                                    if (s.equals("UA")) {
                                                                        return new int[] { 0, 2, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2694: {
                                                                    if (s.equals("TZ")) {
                                                                        return new int[] { 3, 4, 3, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2691: {
                                                                    if (s.equals("TW")) {
                                                                        return new int[] { 0, 0, 0, 0, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2690: {
                                                                    if (s.equals("TV")) {
                                                                        return new int[] { 4, 2, 2, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2688: {
                                                                    if (s.equals("TT")) {
                                                                        return new int[] { 1, 4, 1, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2686: {
                                                                    if (s.equals("TR")) {
                                                                        return new int[] { 1, 1, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2683: {
                                                                    if (s.equals("TO")) {
                                                                        return new int[] { 3, 2, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2682: {
                                                                    if (s.equals("TN")) {
                                                                        return new int[] { 2, 1, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2681: {
                                                                    if (s.equals("TM")) {
                                                                        return new int[] { 4, 2, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2680: {
                                                                    if (s.equals("TL")) {
                                                                        return new int[] { 4, 3, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2679: {
                                                                    if (s.equals("TK")) {
                                                                        return new int[] { 2, 2, 2, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2678: {
                                                                    if (s.equals("TJ")) {
                                                                        return new int[] { 4, 3, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2676: {
                                                                    if (s.equals("TH")) {
                                                                        return new int[] { 0, 2, 2, 3, 3, 4 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2675: {
                                                                    if (s.equals("TG")) {
                                                                        return new int[] { 3, 4, 1, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2672: {
                                                                    if (s.equals("TD")) {
                                                                        return new int[] { 4, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2671: {
                                                                    if (s.equals("TC")) {
                                                                        break;
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2663: {
                                                                    if (s.equals("SZ")) {
                                                                        return new int[] { 3, 3, 3, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2662: {
                                                                    if (s.equals("SY")) {
                                                                        return new int[] { 4, 3, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2661: {
                                                                    if (s.equals("SX")) {
                                                                        break;
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2659: {
                                                                    if (s.equals("SV")) {
                                                                        return new int[] { 2, 3, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2657: {
                                                                    if (s.equals("ST")) {
                                                                        return new int[] { 2, 2, 1, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2656: {
                                                                    if (s.equals("SS")) {
                                                                        return new int[] { 4, 3, 2, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2655: {
                                                                    if (s.equals("SR")) {
                                                                        return new int[] { 2, 4, 3, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2652: {
                                                                    if (s.equals("SO")) {
                                                                        return new int[] { 3, 2, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2651: {
                                                                    if (s.equals("SN")) {
                                                                        return new int[] { 4, 4, 4, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2650: {
                                                                    if (s.equals("SM")) {
                                                                        return new int[] { 0, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2649: {
                                                                    if (s.equals("SL")) {
                                                                        return new int[] { 3, 3, 4, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2648: {
                                                                    if (s.equals("SK")) {
                                                                        return new int[] { 0, 0, 0, 0, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2646: {
                                                                    if (s.equals("SI")) {
                                                                        return new int[] { 1, 0, 0, 0, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2645: {
                                                                    if (s.equals("SH")) {
                                                                        return new int[] { 4, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2644: {
                                                                    if (s.equals("SG")) {
                                                                        return new int[] { 1, 1, 2, 2, 2, 1 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2642: {
                                                                    if (s.equals("SE")) {
                                                                        return new int[] { 0, 0, 0, 0, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2641: {
                                                                    if (s.equals("SD")) {
                                                                        return new int[] { 4, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2640: {
                                                                    if (s.equals("SC")) {
                                                                        return new int[] { 4, 2, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2639: {
                                                                    if (s.equals("SB")) {
                                                                        return new int[] { 4, 2, 4, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2638: {
                                                                    if (s.equals("SA")) {
                                                                        return new int[] { 3, 1, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2629: {
                                                                    if (s.equals("RW")) {
                                                                        return new int[] { 3, 4, 2, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2627: {
                                                                    if (s.equals("RU")) {
                                                                        return new int[] { 1, 0, 0, 0, 4, 3 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2625: {
                                                                    if (s.equals("RS")) {
                                                                        return new int[] { 1, 0, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2621: {
                                                                    if (s.equals("RO")) {
                                                                        return new int[] { 0, 0, 1, 2, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2611: {
                                                                    if (s.equals("RE")) {
                                                                        return new int[] { 1, 2, 1, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2576: {
                                                                    if (s.equals("QA")) {
                                                                        return new int[] { 2, 4, 4, 4, 4, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2567: {
                                                                    if (s.equals("PW")) {
                                                                        return new int[] { 2, 2, 4, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2564: {
                                                                    if (s.equals("PT")) {
                                                                        return new int[] { 0, 0, 0, 0, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2563: {
                                                                    if (s.equals("PS")) {
                                                                        return new int[] { 3, 4, 1, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2562: {
                                                                    if (s.equals("PR")) {
                                                                        return new int[] { 2, 0, 2, 1, 2, 1 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2557: {
                                                                    if (s.equals("PM")) {
                                                                        return new int[] { 0, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2556: {
                                                                    if (s.equals("PL")) {
                                                                        return new int[] { 1, 1, 2, 2, 4, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2555: {
                                                                    if (s.equals("PK")) {
                                                                        return new int[] { 3, 2, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2552: {
                                                                    if (s.equals("PH")) {
                                                                        return new int[] { 2, 1, 3, 3, 3, 0 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2551: {
                                                                    if (s.equals("PG")) {
                                                                        return new int[] { 4, 3, 3, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2550: {
                                                                    if (s.equals("PF")) {
                                                                        return new int[] { 2, 2, 2, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2549: {
                                                                    if (s.equals("PE")) {
                                                                        return new int[] { 1, 2, 4, 4, 4, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2545: {
                                                                    if (s.equals("PA")) {
                                                                        return new int[] { 2, 3, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2526: {
                                                                    if (s.equals("OM")) {
                                                                        return new int[] { 2, 3, 1, 3, 4, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2508: {
                                                                    if (s.equals("NZ")) {
                                                                        return new int[] { 1, 1, 2, 2, 4, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2503: {
                                                                    if (s.equals("NU")) {
                                                                        return new int[] { 4, 2, 2, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2500: {
                                                                    if (s.equals("NR")) {
                                                                        return new int[] { 4, 2, 2, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2498: {
                                                                    if (s.equals("NP")) {
                                                                        return new int[] { 2, 2, 4, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2497: {
                                                                    if (s.equals("NO")) {
                                                                        return new int[] { 0, 0, 2, 0, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2494: {
                                                                    if (s.equals("NL")) {
                                                                        return new int[] { 0, 2, 2, 3, 0, 3 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2491: {
                                                                    if (s.equals("NI")) {
                                                                        return new int[] { 2, 3, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2489: {
                                                                    if (s.equals("NG")) {
                                                                        return new int[] { 3, 4, 2, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2487: {
                                                                    if (s.equals("NE")) {
                                                                        return new int[] { 4, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2485: {
                                                                    if (s.equals("NC")) {
                                                                        return new int[] { 3, 3, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2483: {
                                                                    if (s.equals("NA")) {
                                                                        return new int[] { 3, 3, 3, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2477: {
                                                                    if (s.equals("MZ")) {
                                                                        return new int[] { 3, 1, 2, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2476: {
                                                                    if (s.equals("MY")) {
                                                                        return new int[] { 1, 0, 3, 1, 3, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2475: {
                                                                    if (s.equals("MX")) {
                                                                        return new int[] { 2, 4, 3, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2474: {
                                                                    if (s.equals("MW")) {
                                                                        return new int[] { 4, 2, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2473: {
                                                                    if (s.equals("MV")) {
                                                                        return new int[] { 3, 4, 1, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2472: {
                                                                    if (s.equals("MU")) {
                                                                        return new int[] { 3, 1, 1, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2471: {
                                                                    if (s.equals("MT")) {
                                                                        return new int[] { 0, 0, 0, 0, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2470: {
                                                                    if (s.equals("MS")) {
                                                                        return new int[] { 0, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2469: {
                                                                    if (s.equals("MR")) {
                                                                        return new int[] { 4, 2, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2468: {
                                                                    if (s.equals("MQ")) {
                                                                        return new int[] { 2, 1, 2, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2467: {
                                                                    if (s.equals("MP")) {
                                                                        return new int[] { 0, 2, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2466: {
                                                                    if (s.equals("MO")) {
                                                                        return new int[] { 0, 2, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2465: {
                                                                    if (s.equals("MN")) {
                                                                        return new int[] { 2, 0, 1, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2464: {
                                                                    if (s.equals("MM")) {
                                                                        return new int[] { 2, 4, 2, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2463: {
                                                                    if (s.equals("ML")) {
                                                                        return new int[] { 4, 3, 3, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2462: {
                                                                    if (s.equals("MK")) {
                                                                        return new int[] { 1, 0, 0, 1, 3, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2459: {
                                                                    if (s.equals("MH")) {
                                                                        return new int[] { 4, 2, 2, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2458: {
                                                                    if (s.equals("MG")) {
                                                                        return new int[] { 4, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2457: {
                                                                    if (s.equals("MF")) {
                                                                        return new int[] { 1, 2, 1, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2456: {
                                                                    if (s.equals("ME")) {
                                                                        return new int[] { 2, 0, 0, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2455: {
                                                                    if (s.equals("MD")) {
                                                                        return new int[] { 1, 0, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2454: {
                                                                    if (s.equals("MC")) {
                                                                        return new int[] { 0, 2, 2, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2452: {
                                                                    if (s.equals("MA")) {
                                                                        return new int[] { 3, 3, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2445: {
                                                                    if (s.equals("LY")) {
                                                                        return new int[] { 3, 2, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2442: {
                                                                    if (s.equals("LV")) {
                                                                        return new int[] { 0, 0, 0, 0, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2441: {
                                                                    if (s.equals("LU")) {
                                                                        return new int[] { 1, 0, 3, 2, 1, 4 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2440: {
                                                                    if (s.equals("LT")) {
                                                                        return new int[] { 0, 0, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2439: {
                                                                    if (s.equals("LS")) {
                                                                        return new int[] { 3, 3, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2438: {
                                                                    if (s.equals("LR")) {
                                                                        return new int[] { 3, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2431: {
                                                                    if (s.equals("LK")) {
                                                                        return new int[] { 3, 1, 3, 3, 4, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2429: {
                                                                    if (s.equals("LI")) {
                                                                        return new int[] { 0, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2423: {
                                                                    if (s.equals("LC")) {
                                                                        return new int[] { 1, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2422: {
                                                                    if (s.equals("LB")) {
                                                                        return new int[] { 3, 3, 2, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2421: {
                                                                    if (s.equals("LA")) {
                                                                        return new int[] { 1, 2, 1, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2415: {
                                                                    if (s.equals("KZ")) {
                                                                        return new int[] { 2, 1, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2414: {
                                                                    if (s.equals("KY")) {
                                                                        return new int[] { 1, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2412: {
                                                                    if (s.equals("KW")) {
                                                                        return new int[] { 1, 0, 0, 0, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2407: {
                                                                    if (s.equals("KR")) {
                                                                        return new int[] { 0, 1, 1, 3, 4, 4 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2405: {
                                                                    if (s.equals("KP")) {
                                                                        return new int[] { 3, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2403: {
                                                                    if (s.equals("KN")) {
                                                                        return new int[] { 1, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2402: {
                                                                    if (s.equals("KM")) {
                                                                        return new int[] { 4, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2398: {
                                                                    if (s.equals("KI")) {
                                                                        return new int[] { 4, 2, 4, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2397: {
                                                                    if (s.equals("KH")) {
                                                                        return new int[] { 2, 1, 4, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2396: {
                                                                    if (s.equals("KG")) {
                                                                        return new int[] { 2, 1, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2394: {
                                                                    if (s.equals("KE")) {
                                                                        return new int[] { 3, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2374: {
                                                                    if (s.equals("JP")) {
                                                                        return new int[] { 0, 1, 1, 2, 2, 4 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2373: {
                                                                    if (s.equals("JO")) {
                                                                        return new int[] { 2, 1, 1, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2371: {
                                                                    if (s.equals("JM")) {
                                                                        return new int[] { 2, 4, 3, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2363: {
                                                                    if (s.equals("JE")) {
                                                                        return new int[] { 4, 2, 2, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2347: {
                                                                    if (s.equals("IT")) {
                                                                        return new int[] { 0, 0, 0, 1, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2346: {
                                                                    if (s.equals("IS")) {
                                                                        return new int[] { 0, 0, 0, 0, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2345: {
                                                                    if (s.equals("IR")) {
                                                                        return new int[] { 3, 0, 1, 1, 4, 1 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2344: {
                                                                    if (s.equals("IQ")) {
                                                                        return new int[] { 3, 2, 2, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2342: {
                                                                    if (s.equals("IO")) {
                                                                        return new int[] { 4, 2, 2, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2341: {
                                                                    if (s.equals("IN")) {
                                                                        return new int[] { 1, 1, 3, 2, 3, 3 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2340: {
                                                                    if (s.equals("IM")) {
                                                                        return new int[] { 0, 2, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2339: {
                                                                    if (s.equals("IL")) {
                                                                        return new int[] { 1, 2, 2, 2, 3, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2332: {
                                                                    if (s.equals("IE")) {
                                                                        return new int[] { 0, 1, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2331: {
                                                                    if (s.equals("ID")) {
                                                                        return new int[] { 3, 1, 2, 2, 3, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2317: {
                                                                    if (s.equals("HU")) {
                                                                        return new int[] { 0, 0, 0, 1, 3, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2316: {
                                                                    if (s.equals("HT")) {
                                                                        return new int[] { 4, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2314: {
                                                                    if (s.equals("HR")) {
                                                                        return new int[] { 1, 0, 0, 0, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2307: {
                                                                    if (s.equals("HK")) {
                                                                        return new int[] { 0, 1, 2, 3, 2, 0 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2290: {
                                                                    if (s.equals("GY")) {
                                                                        return new int[] { 3, 2, 2, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2288: {
                                                                    if (s.equals("GW")) {
                                                                        return new int[] { 3, 4, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2286: {
                                                                    if (s.equals("GU")) {
                                                                        return new int[] { 1, 2, 4, 4, 4, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2285: {
                                                                    if (s.equals("GT")) {
                                                                        return new int[] { 2, 3, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2283: {
                                                                    if (s.equals("GR")) {
                                                                        return new int[] { 1, 0, 0, 0, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2282: {
                                                                    if (s.equals("GQ")) {
                                                                        return new int[] { 4, 2, 1, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2281: {
                                                                    if (s.equals("GP")) {
                                                                        return new int[] { 2, 1, 2, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2279: {
                                                                    if (s.equals("GN")) {
                                                                        return new int[] { 4, 3, 4, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2278: {
                                                                    if (s.equals("GM")) {
                                                                        break Label_8413;
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2277: {
                                                                    if (s.equals("GL")) {
                                                                        return new int[] { 1, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2274: {
                                                                    if (s.equals("GI")) {
                                                                        return new int[] { 0, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2273: {
                                                                    if (s.equals("GH")) {
                                                                        return new int[] { 3, 3, 3, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2272: {
                                                                    if (s.equals("GG")) {
                                                                        return new int[] { 0, 2, 0, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2271: {
                                                                    if (s.equals("GF")) {
                                                                        return new int[] { 3, 2, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2270: {
                                                                    if (s.equals("GE")) {
                                                                        return new int[] { 1, 1, 1, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2269: {
                                                                    if (s.equals("GD")) {
                                                                        return new int[] { 1, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2267: {
                                                                    if (s.equals("GB")) {
                                                                        return new int[] { 0, 0, 1, 1, 1, 1 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2266: {
                                                                    if (s.equals("GA")) {
                                                                        return new int[] { 3, 4, 1, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2252: {
                                                                    if (s.equals("FR")) {
                                                                        return new int[] { 1, 2, 3, 1, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2249: {
                                                                    if (s.equals("FO")) {
                                                                        return new int[] { 0, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2247: {
                                                                    if (s.equals("FM")) {
                                                                        return new int[] { 4, 2, 4, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2245: {
                                                                    if (s.equals("FK")) {
                                                                        return new int[] { 3, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2244: {
                                                                    if (s.equals("FJ")) {
                                                                        return new int[] { 3, 1, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2243: {
                                                                    if (s.equals("FI")) {
                                                                        return new int[] { 0, 0, 0, 3, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2223: {
                                                                    if (s.equals("ET")) {
                                                                        return new int[] { 4, 3, 3, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2222: {
                                                                    if (s.equals("ES")) {
                                                                        return new int[] { 0, 1, 1, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2221: {
                                                                    if (s.equals("ER")) {
                                                                        return new int[] { 4, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2210: {
                                                                    if (s.equals("EG")) {
                                                                        return new int[] { 3, 4, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2208: {
                                                                    if (s.equals("EE")) {
                                                                        return new int[] { 0, 0, 0, 0, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2206: {
                                                                    if (s.equals("EC")) {
                                                                        return new int[] { 2, 3, 2, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2198: {
                                                                    if (s.equals("DZ")) {
                                                                        return new int[] { 3, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2187: {
                                                                    if (s.equals("DO")) {
                                                                        return new int[] { 3, 4, 4, 4, 4, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2185: {
                                                                    if (s.equals("DM")) {
                                                                        return new int[] { 0, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2183: {
                                                                    if (s.equals("DK")) {
                                                                        return new int[] { 0, 0, 3, 2, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2182: {
                                                                    if (s.equals("DJ")) {
                                                                        return new int[] { 4, 3, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2177: {
                                                                    if (s.equals("DE")) {
                                                                        return new int[] { 0, 1, 2, 2, 2, 3 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2167: {
                                                                    if (s.equals("CZ")) {
                                                                        return new int[] { 0, 0, 2, 0, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2166: {
                                                                    if (s.equals("CY")) {
                                                                        return new int[] { 1, 0, 0, 0, 0, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2165: {
                                                                    if (s.equals("CX")) {
                                                                        return new int[] { 1, 2, 2, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2164: {
                                                                    if (s.equals("CW")) {
                                                                        return new int[] { 2, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2163: {
                                                                    if (s.equals("CV")) {
                                                                        return new int[] { 2, 1, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2162: {
                                                                    if (s.equals("CU")) {
                                                                        return new int[] { 4, 3, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2159: {
                                                                    if (s.equals("CR")) {
                                                                        return new int[] { 2, 3, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2156: {
                                                                    if (s.equals("CO")) {
                                                                        return new int[] { 2, 3, 4, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2155: {
                                                                    if (s.equals("CN")) {
                                                                        return new int[] { 2, 0, 1, 1, 3, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2154: {
                                                                    if (s.equals("CM")) {
                                                                        return new int[] { 3, 3, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2153: {
                                                                    if (s.equals("CL")) {
                                                                        return new int[] { 1, 2, 2, 2, 3, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2152: {
                                                                    if (s.equals("CK")) {
                                                                        return new int[] { 2, 2, 2, 1, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2145: {
                                                                    if (s.equals("CD")) {
                                                                        return new int[] { 4, 2, 3, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2142: {
                                                                    if (s.equals("CA")) {
                                                                        return new int[] { 0, 2, 2, 2, 3, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2133: {
                                                                    if (s.equals("BW")) {
                                                                        return new int[] { 3, 2, 1, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2127: {
                                                                    if (s.equals("BQ")) {
                                                                        return new int[] { 1, 2, 0, 0, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2120: {
                                                                    if (s.equals("BJ")) {
                                                                        return new int[] { 4, 4, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2119: {
                                                                    if (s.equals("BI")) {
                                                                        return new int[] { 4, 4, 4, 4, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2118: {
                                                                    if (s.equals("BH")) {
                                                                        return new int[] { 1, 2, 1, 3, 4, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2117: {
                                                                    if (s.equals("BG")) {
                                                                        return new int[] { 0, 0, 0, 0, 1, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2116: {
                                                                    if (s.equals("BF")) {
                                                                        return new int[] { 4, 3, 4, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2115: {
                                                                    if (s.equals("BE")) {
                                                                        return new int[] { 0, 1, 4, 4, 3, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2114: {
                                                                    if (s.equals("BD")) {
                                                                        return new int[] { 2, 1, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2105: {
                                                                    if (s.equals("AZ")) {
                                                                        return new int[] { 3, 2, 3, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2094: {
                                                                    if (s.equals("AO")) {
                                                                        return new int[] { 4, 4, 3, 2, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                                case 2088: {
                                                                    if (s.equals("AI")) {
                                                                        return new int[] { 0, 2, 0, 3, 2, 2 };
                                                                    }
                                                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                                                }
                                                            }
                                                            return new int[] { 1, 2, 1, 0, 2, 2 };
                                                        }
                                                        case 2086: {
                                                            if (s.equals("AG")) {
                                                                return new int[] { 2, 4, 1, 2, 2, 2 };
                                                            }
                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                        }
                                                        case 2085: {
                                                            if (s.equals("AF")) {
                                                                break;
                                                            }
                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                        }
                                                        case 2084: {
                                                            if (s.equals("AE")) {
                                                                return new int[] { 1, 4, 4, 4, 4, 0 };
                                                            }
                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                        }
                                                        case 2083: {
                                                            if (s.equals("AD")) {
                                                                return new int[] { 1, 2, 0, 0, 2, 2 };
                                                            }
                                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                                        }
                                                    }
                                                }
                                                return new int[] { 4, 3, 3, 4, 2, 2 };
                                            }
                                            if (s.equals("BZ")) {
                                                return new int[] { 2, 4, 2, 1, 2, 2 };
                                            }
                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                        }
                                        else {
                                            if (s.equals("BY")) {
                                                return new int[] { 0, 1, 2, 3, 2, 2 };
                                            }
                                            return new int[] { 2, 2, 2, 2, 2, 2 };
                                        }
                                    }
                                    else {
                                        if (s.equals("BT")) {
                                            return new int[] { 3, 1, 3, 2, 2, 2 };
                                        }
                                        return new int[] { 2, 2, 2, 2, 2, 2 };
                                    }
                                }
                                else {
                                    if (s.equals("BS")) {
                                        return new int[] { 4, 4, 2, 2, 2, 2 };
                                    }
                                    return new int[] { 2, 2, 2, 2, 2, 2 };
                                }
                            }
                            else if (!s.equals("BB")) {
                                return new int[] { 2, 2, 2, 2, 2, 2 };
                            }
                            return new int[] { 0, 2, 0, 0, 2, 2 };
                        }
                        if (s.equals("BA")) {
                            return new int[] { 1, 2, 1, 1, 2, 2 };
                        }
                        return new int[] { 2, 2, 2, 2, 2, 2 };
                    }
                    else if (!s.equals("AX")) {
                        return new int[] { 2, 2, 2, 2, 2, 2 };
                    }
                    return new int[] { 0, 2, 2, 2, 2, 2 };
                }
                if (s.equals("AW")) {
                    return new int[] { 1, 3, 4, 4, 2, 2 };
                }
                return new int[] { 2, 2, 2, 2, 2, 2 };
            }
            else {
                if (s.equals("AM")) {
                    return new int[] { 2, 3, 2, 3, 2, 2 };
                }
                return new int[] { 2, 2, 2, 2, 2, 2 };
            }
        }
        else if (!s.equals("AL")) {
            return new int[] { 2, 2, 2, 2, 2, 2 };
        }
        return new int[] { 1, 1, 1, 1, 2, 2 };
    }
    
    private final long l(final int n) {
        Long n2;
        if ((n2 = (Long)this.h.get(n)) == null) {
            n2 = (Long)this.h.get(0);
        }
        Long value;
        if ((value = n2) == null) {
            value = 1000000L;
        }
        return value;
    }
    
    private final void m(int n, long n2, final long r) {
        if (n == 0) {
            if (n2 == 0L) {
                if (r == this.r) {
                    return;
                }
                n2 = 0L;
            }
            n = 0;
        }
        this.r = r;
        this.s.f(n, n2, r);
    }
    
    private static boolean n(final bbr bbr, final boolean b) {
        return b && !bbr.g(8);
    }
    
    @Override
    public final void a(final bbn bbn, final bbr bbr, final boolean b, final int n) {
        synchronized (this) {
            if (!n(bbr, b)) {
                return;
            }
            this.m += n;
        }
    }
    
    @Override
    public final void b(final bbn bbn, final bbr bbr, final boolean b) {
        synchronized (this) {
            if (!n(bbr, b)) {
                return;
            }
            bad.f(this.k > 0);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long l = this.l;
            final long o = this.o;
            final int n = (int)(elapsedRealtime - l);
            this.o = o + n;
            final long p3 = this.p;
            final long m = this.m;
            this.p = p3 + m;
            if (n > 0) {
                this.i.k((int)Math.sqrt((double)m), m * 8000.0f / n);
                if (this.o >= 2000L || this.p >= 524288L) {
                    this.q = (long)this.i.a(0.5f);
                }
                this.m(n, this.m, this.q);
                this.l = elapsedRealtime;
                this.m = 0L;
            }
            --this.k;
        }
    }
    
    @Override
    public final void c(final bbn bbn, final bbr bbr, final boolean b) {
    }
    
    @Override
    public final void d(final bbn bbn, final bbr bbr, final boolean b) {
        synchronized (this) {
            if (!n(bbr, b)) {
                return;
            }
            if (this.k == 0) {
                this.l = SystemClock.elapsedRealtime();
            }
            ++this.k;
        }
    }
    
    @Override
    public final long e() {
        synchronized (this) {
            return this.q;
        }
    }
    
    @Override
    public final bcq f() {
        return this;
    }
    
    @Override
    public final void g(final Handler handler, final brg brg) {
        bad.b(handler);
        bad.b(brg);
        this.s.e(handler, brg);
    }
    
    @Override
    public final void h(final brg brg) {
        this.s.g(brg);
    }
    
    public final void j(int n) {
        synchronized (this) {
            final int n2 = this.n;
            if (n2 != 0 && !this.j) {
                return;
            }
            if (n2 == n) {
                return;
            }
            this.n = n;
            if (n != 1 && n != 0 && n != 8) {
                this.q = this.l(n);
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.k > 0) {
                    n = (int)(elapsedRealtime - this.l);
                }
                else {
                    n = 0;
                }
                this.m(n, this.m, this.q);
                this.l = elapsedRealtime;
                this.m = 0L;
                this.p = 0L;
                this.o = 0L;
                final brw i = this.i;
                i.a.clear();
                i.b = -1;
                i.c = 0;
                i.d = 0;
            }
        }
    }
}
