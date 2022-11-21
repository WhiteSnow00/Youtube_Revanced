import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckp
{
    private ckp() {
    }
    
    public static final cml a(final Map map) {
        final cml cml = new cml(map);
        cml.e(cml);
        return cml;
    }
    
    public static final void b(final Map map, final Map map2) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            final V value = entry.getValue();
            if (value == null) {
                map2.put(s, null);
            }
            else {
                final Class<? extends boolean[]> class1 = ((boolean[])(Object)value).getClass();
                if (class1 != Boolean.class && class1 != Byte.class && class1 != Integer.class && class1 != Long.class && class1 != Float.class && class1 != Double.class && class1 != String.class && class1 != Boolean[].class && class1 != Byte[].class && class1 != Integer[].class && class1 != Long[].class && class1 != Float[].class && class1 != Double[].class && class1 != String[].class) {
                    if (class1 == boolean[].class) {
                        map2.put(s, cml.f((boolean[])(Object)value));
                    }
                    else if (class1 == byte[].class) {
                        map2.put(s, cml.g((byte[])(Object)value));
                    }
                    else if (class1 == int[].class) {
                        map2.put(s, cml.j((int[])(Object)value));
                    }
                    else if (class1 == long[].class) {
                        map2.put(s, cml.k((long[])(Object)value));
                    }
                    else if (class1 == float[].class) {
                        map2.put(s, cml.i((float[])(Object)value));
                    }
                    else {
                        if (class1 != double[].class) {
                            final StringBuilder sb = new StringBuilder("Key ");
                            sb.append(s);
                            sb.append("has invalid type ");
                            sb.append(class1);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        map2.put(s, cml.h((double[])(Object)value));
                    }
                }
                else {
                    map2.put(s, value);
                }
            }
        }
    }
    
    public static final void c(final String s, final byte[] array, final Map map) {
        map.put(s, cml.g(array));
    }
    
    public static final void d(final String s, final String s2, final Map map) {
        map.put(s, s2);
    }
    
    public static String e(final int n) {
        if (n == 1) {
            return "LOCAL";
        }
        if (n == 2) {
            return "REMOTE";
        }
        if (n == 3) {
            return "DATA_DISK_CACHE";
        }
        if (n == 4) {
            return "RESOURCE_DISK_CACHE";
        }
        if (n != 5) {
            return "null";
        }
        return "MEMORY_CACHE";
    }
    
    public static ListenableFuture f(final dcm dcm) {
        return afvh.e(sl.h((acf)new aal(dcm, 2)), (afax)new htk(1), dpc.b);
    }
}
