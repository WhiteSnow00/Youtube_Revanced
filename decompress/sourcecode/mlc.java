import java.util.List;
import com.google.android.gms.cast.MediaQueueItem;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import android.os.Bundle;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.cast.MediaMetadata;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public class mlc
{
    public mlc() {
    }
    
    public mlc(final char[] array) {
    }
    
    public mlc(final short[] array) {
    }
    
    private static long A(final byte[] array, final int n) {
        final ByteBuffer wrap = ByteBuffer.wrap(array, n, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
    
    private static long B(final long n) {
        return n ^ n >>> 47;
    }
    
    private static void C(final byte[] array, final int n, long n2, long rotateRight, final long[] array2) {
        final long a = A(array, n);
        final long a2 = A(array, n + 8);
        final long a3 = A(array, n + 16);
        final long a4 = A(array, n + 24);
        n2 += a;
        rotateRight = Long.rotateRight(rotateRight + n2 + a4, 21);
        final long n3 = a2 + n2 + a3;
        final long rotateRight2 = Long.rotateRight(n3, 44);
        array2[0] = n3 + a4;
        array2[1] = rotateRight + rotateRight2 + n2;
    }
    
    public static int l(final String s) {
        int intValue = 0;
        try {
            final Integer n = (Integer)Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", String.class).invoke(null, s);
            if (n != null) {
                intValue = n;
            }
            return intValue;
        }
        catch (final ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
            return intValue;
        }
    }
    
    @Deprecated
    public static WebImage m(final MediaMetadata mediaMetadata) {
        if (!mediaMetadata.c()) {
            return null;
        }
        return mediaMetadata.a.get(0);
    }
    
    public static Map n(final Bundle bundle, final String s) {
        final Map map = (Map)bundle.getSerializable(s);
        if (map == null) {
            return (Map)afgm.b;
        }
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<Integer, V> entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public static mie o(final long n) {
        return new mie(n);
    }
    
    public static void p(final MediaQueueItem mediaQueueItem) {
        if (mediaQueueItem.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(mediaQueueItem.d) && mediaQueueItem.d < 0.0) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(mediaQueueItem.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (!Double.isNaN(mediaQueueItem.f) && mediaQueueItem.f >= 0.0) {
            return;
        }
        throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
    }
    
    public static int q(final int n) {
        for (int i = 0; i < 3; ++i) {
            final int n2 = (new int[] { 1, 2, 3 })[i];
            if (n2 == 0) {
                throw null;
            }
            if (n2 - 1 == n) {
                return n2;
            }
        }
        return 1;
    }
    
    public static boolean r(final int[] array) {
        return array == null || array.length == 0;
    }
    
    public static long s(final byte[] array) {
        int length = array.length;
        long n = -7286425919675154353L;
        if (length <= 32) {
            if (length <= 16) {
                if (length >= 8) {
                    final long n2 = length + length - 7286425919675154353L;
                    final long n3 = A(array, 0) - 7286425919675154353L;
                    final long a = A(array, length - 8);
                    n = z(Long.rotateRight(a, 37) * n2 + n3, (Long.rotateRight(n3, 25) + a) * n2, n2);
                }
                else if (length >= 4) {
                    n = z(length + (((long)y(array, 0) & 0xFFFFFFFFL) << 3), (long)y(array, length - 4) & 0xFFFFFFFFL, length + length - 7286425919675154353L);
                }
                else if (length > 0) {
                    n = -7286425919675154353L * B(((array[0] & 0xFF) + ((array[length >> 1] & 0xFF) << 8)) * -7286425919675154353L ^ (length + ((array[length - 1] & 0xFF) << 2)) * -4348849565147123417L);
                }
            }
            else {
                final long n4 = length + length - 7286425919675154353L;
                final long n5 = A(array, 0) * -5435081209227447693L;
                final long a2 = A(array, 8);
                final long n6 = A(array, length - 8) * n4;
                n = z(A(array, length - 16) * -7286425919675154353L + (Long.rotateRight(n5 + a2, 43) + Long.rotateRight(n6, 30)), n5 + Long.rotateRight(a2 - 7286425919675154353L, 18) + n6, n4);
            }
        }
        else if (length <= 64) {
            final long n7 = length + length - 7286425919675154353L;
            final long n8 = A(array, 0) * -7286425919675154353L;
            final long a3 = A(array, 8);
            final long n9 = A(array, length - 8) * n7;
            final long n10 = Long.rotateRight(n8 + a3, 43) + Long.rotateRight(n9, 30) + A(array, length - 16) * -7286425919675154353L;
            final long rotateRight = Long.rotateRight(a3 - 7286425919675154353L, 18);
            final long n11 = A(array, 16) * n7;
            final long a4 = A(array, 24);
            final long n12 = (n10 + A(array, length - 32)) * n7;
            n = z(Long.rotateRight(n11 + a4, 43) + Long.rotateRight(n12, 30) + (z(n10, n8 + rotateRight + n9, n7) + A(array, length - 24)) * n7, n11 + Long.rotateRight(a4 + n8, 18) + n12, n7);
        }
        else {
            long n13 = B(-7956866745689871395L) * -7286425919675154353L;
            final long[] array2 = new long[2];
            final long[] array3 = new long[2];
            long n14 = A(array, 0) + 95310865018149119L;
            final int n15 = (--length >> 6) * 64;
            final int n16 = length & 0x3F;
            final int n17 = n15 + n16 - 63;
            long n18 = 2480279821605975764L;
            int n19 = 0;
            long n20;
            long n21;
            long n22;
            while (true) {
                final long rotateRight2 = Long.rotateRight(n14 + n18 + array2[0] + A(array, n19 + 8), 37);
                final long rotateRight3 = Long.rotateRight(n18 + array2[1] + A(array, n19 + 48), 42);
                n20 = (rotateRight2 * -5435081209227447693L ^ array3[1]);
                n21 = rotateRight3 * -5435081209227447693L + (array2[0] + A(array, n19 + 40));
                n22 = Long.rotateRight(n13 + array3[0], 33) * -5435081209227447693L;
                C(array, n19, array2[1] * -5435081209227447693L, n20 + array3[0], array2);
                C(array, n19 + 32, n22 + array3[1], A(array, n19 + 16) + n21, array3);
                n19 += 64;
                if (n19 == n15) {
                    break;
                }
                n13 = n20;
                n14 = n22;
                n18 = n21;
            }
            final long n23 = n20 & 0xFFL;
            final long n24 = -5435081209227447693L + (n23 + n23);
            final long n25 = array3[0] + n16;
            final long n26 = array2[0] + n25;
            array3[0] = n25 + (array2[0] = n26);
            final long rotateRight4 = Long.rotateRight(n22 + n21 + n26 + A(array, n17 + 8), 37);
            final long rotateRight5 = Long.rotateRight(n21 + array2[1] + A(array, n17 + 48), 42);
            final long n27 = rotateRight4 * n24 ^ array3[1] * 9L;
            final long n28 = rotateRight5 * n24 + (array2[0] * 9L + A(array, n17 + 40));
            final long n29 = Long.rotateRight(n20 + array3[0], 33) * n24;
            C(array, n17, array2[1] * n24, n27 + array3[0], array2);
            C(array, n17 + 32, n29 + array3[1], A(array, n17 + 16) + n28, array3);
            n = z(z(array2[0], array3[0], n24) + B(n28) * -4348849565147123417L + n27, z(array2[1], array3[1], n24) + n29, n24);
        }
        return n;
    }
    
    public static Integer t(final String s) {
        if (s == null) {
            return null;
        }
        int n = 0;
        Label_0115: {
            switch (s.hashCode()) {
                case 1645952171: {
                    if (s.equals("REPEAT_OFF")) {
                        n = 0;
                        break Label_0115;
                    }
                    break;
                }
                case 1645938909: {
                    if (s.equals("REPEAT_ALL")) {
                        n = 1;
                        break Label_0115;
                    }
                    break;
                }
                case -962896020: {
                    if (s.equals("REPEAT_SINGLE")) {
                        n = 2;
                        break Label_0115;
                    }
                    break;
                }
                case -1118317585: {
                    if (s.equals("REPEAT_ALL_AND_SHUFFLE")) {
                        n = 3;
                        break Label_0115;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n != 3) {
            return null;
        }
        return 3;
    }
    
    private static int y(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    private static long z(long n, final long n2, final long n3) {
        n = (n ^ n2) * n3;
        n = (n ^ n >>> 47 ^ n2) * n3;
        return (n ^ n >>> 47) * n3;
    }
    
    public void a(final int n, final int n2) {
        throw null;
    }
    
    public void b(final int n) {
        throw null;
    }
    
    public void c(final int n) {
        throw null;
    }
    
    public void d(final int[] array) {
    }
    
    public void e(final int[] array, final int n) {
    }
    
    public void f(final MediaQueueItem[] array) {
    }
    
    public void g(final int[] array) {
    }
    
    public void h(final List list, final List list2, final int n) {
    }
    
    public void i(final int[] array) {
    }
    
    public void j() {
    }
    
    public void k() {
        throw null;
    }
    
    public void u() {
    }
    
    public void v() {
    }
    
    public void w() {
    }
    
    public void x() {
    }
}
