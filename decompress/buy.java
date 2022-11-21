import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class buy extends bva
{
    public long a;
    public long[] b;
    public long[] c;
    
    public buy() {
        super((bug)new btl());
        this.a = -9223372036854775807L;
        this.b = new long[0];
        this.c = new long[0];
    }
    
    private static Double d(final bat bat) {
        return Double.longBitsToDouble(bat.p());
    }
    
    private static Object e(final bat bat, int i) {
        if (i == 0) {
            return d(bat);
        }
        boolean b = false;
        final int n = 0;
        if (i == 1) {
            if (bat.i() == 1) {
                b = true;
            }
            return b;
        }
        if (i == 2) {
            return f(bat);
        }
        if (i == 3) {
            final HashMap hashMap = new HashMap();
            while (true) {
                final String f = f(bat);
                i = bat.i();
                if (i == 9) {
                    break;
                }
                final Object e = e(bat, i);
                if (e == null) {
                    continue;
                }
                hashMap.put(f, e);
            }
            return hashMap;
        }
        if (i == 8) {
            return g(bat);
        }
        if (i == 10) {
            final int l = bat.l();
            final ArrayList list = new ArrayList<Object>(l);
            Object e2;
            for (i = n; i < l; ++i) {
                e2 = e(bat, bat.i());
                if (e2 != null) {
                    list.add(e2);
                }
            }
            return list;
        }
        if (i != 11) {
            return null;
        }
        final Date date = new Date((long)(double)d(bat));
        bat.H(2);
        return date;
    }
    
    private static String f(final bat bat) {
        final int m = bat.m();
        final int b = bat.b;
        bat.H(m);
        return new String(bat.a, b, m);
    }
    
    private static HashMap g(final bat bat) {
        final int l = bat.l();
        final HashMap hashMap = new HashMap<String, Object>(l);
        for (int i = 0; i < l; ++i) {
            final String f = f(bat);
            final Object e = e(bat, bat.i());
            if (e != null) {
                hashMap.put(f, e);
            }
        }
        return hashMap;
    }
    
    protected final boolean a(final bat bat) {
        return true;
    }
    
    protected final boolean b(final bat bat, final long n) {
        if (bat.i() != 2) {
            return false;
        }
        if (!"onMetaData".equals(f(bat))) {
            return false;
        }
        if (bat.a() != 0) {
            if (bat.i() != 8) {
                return false;
            }
            final HashMap g = g(bat);
            final Object value = g.get("duration");
            if (value instanceof Double) {
                final double doubleValue = (double)value;
                if (doubleValue > 0.0) {
                    this.a = (long)(doubleValue * 1000000.0);
                }
            }
            final Object value2 = g.get("keyframes");
            if (value2 instanceof Map) {
                final Map map = (Map)value2;
                final Object value3 = map.get("filepositions");
                final Object value4 = map.get("times");
                if (value3 instanceof List && value4 instanceof List) {
                    final List list = (List)value3;
                    final List list2 = (List)value4;
                    final int size = list2.size();
                    this.b = new long[size];
                    this.c = new long[size];
                    for (int i = 0; i < size; ++i) {
                        final Object value5 = list.get(i);
                        final Object value6 = list2.get(i);
                        if (!(value6 instanceof Double) || !(value5 instanceof Double)) {
                            this.b = new long[0];
                            this.c = new long[0];
                            break;
                        }
                        this.b[i] = (long)((double)value6 * 1000000.0);
                        this.c[i] = ((Double)value5).longValue();
                    }
                }
            }
        }
        return false;
    }
}
