import android.os.SystemClock;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import java.util.concurrent.TimeUnit;
import java.util.TreeSet;
import java.util.List;
import android.widget.ImageView$ScaleType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class foi
{
    public final long a;
    public final Object b;
    
    public foi(final long a, final adgk b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public foi(final long a, final ajcf b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public foi(final long a, final ImageView$ScaleType b) {
        this.a = a;
        this.b = b;
    }
    
    public foi(final long a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public foi(final long a, final TreeSet b) {
        this.a = a;
        this.b = b;
    }
    
    public foi(final ably b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public foi(final amsy amsy, final long n) {
        this.b = amsy.b;
        this.a = n + TimeUnit.SECONDS.toMillis(amsy.d);
    }
    
    public foi(final Tick b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public foi(final String b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public foi(final nhj nhj, final String b) {
        this.b = b;
        nhj.X();
        this.a = SystemClock.elapsedRealtime();
    }
    
    public foi(final oas b, final long n) {
        b.getClass();
        this.b = b;
        agot.u(n > 0L);
        this.a = b.d() + n;
    }
    
    public foi(final xhh b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public foi(final zhc zhc) {
        this.a = (f(zhc.i(), false, 3) | f(zhc.j(), true, 2) | f(zhc.k(), true, 1) | f(zhc.l(), true, 0));
        this.b = new int[] { d(zhc.l()), d(zhc.k()), d(zhc.j()), d(zhc.i()) };
    }
    
    public foi(float[] b, final long a) {
        agot.u(true);
        this.b = b;
        b = b;
        final float b2 = b(b);
        for (int i = 0; i < 3; ++i) {
            b[i] /= b2;
        }
        this.a = a;
    }
    
    public foi(final float[] b, final long a, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public static float a(final float[] array, final float[] array2) {
        agot.u(true);
        float n = 0.0f;
        for (int i = 0; i < 3; ++i) {
            n += array[i] * array2[i];
        }
        return n;
    }
    
    public static float b(final float[] array) {
        return (float)Math.sqrt(a(array, array));
    }
    
    static int d(final ajbg ajbg) {
        return (int)TimeUnit.SECONDS.toMillis(tmy.aO((long)ajbg.d, 0L, 86400L));
    }
    
    static long f(final ajbg ajbg, final boolean b, final int n) {
        final int e = ajbg.e;
        final int c = ajox.C(e);
        if (c != 0) {
            if (c == 3) {
                return 1L << n;
            }
        }
        if ((ajbg.b & 0x4) != 0x0) {
            final int c2 = ajox.C(e);
            if (c2 != 0) {
                if (c2 != 1) {
                    return 0L;
                }
            }
        }
        if (b) {
            return 1L << n;
        }
        return 0L;
    }
    
    public static final int g(final ajbl ajbl) {
        final ajbl a = ajbl.a;
        final int ordinal = ajbl.ordinal();
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return 1;
        }
        if (ordinal != 4) {
            return 3;
        }
        return 0;
    }
    
    public final byte[] c() {
        final float[] array = new float[2];
        final Object b = this.b;
        agot.u(true);
        agot.u(true);
        final float[] array2 = new float[3];
        final float[] array3 = (float[])b;
        final float n = Math.abs(array3[0]) + Math.abs(array3[1]) + Math.abs(array3[2]);
        array2[0] = array3[0] / n;
        final float n2 = -array3[1] / n;
        array2[1] = n2;
        final float n3 = -array3[2] / n;
        array2[2] = n3;
        final double n4 = n3;
        final float n5 = 0.0f;
        if (n4 < 0.0) {
            final float abs = Math.abs(n2);
            float n6 = 1.0f;
            final float n7 = array2[0];
            float n8;
            if (n7 > 0.0f) {
                n8 = 1.0f;
            }
            else {
                n8 = -1.0f;
            }
            final float abs2 = Math.abs(n7);
            if (array2[1] <= 0.0f) {
                n6 = -1.0f;
            }
            final float n9 = (1.0f - abs2) * n6;
            array2[0] = (new float[] { (1.0f - abs) * n8, n9 })[0];
            array2[1] = n9;
        }
        final float n10 = array2[0] * 0.5f + 0.5f;
        array[0] = n10;
        array[1] = array2[1] * 0.5f + 0.5f;
        if (Float.isNaN(n10) || Float.isNaN(array[1])) {
            trn.l("One or both of the oct16 vectors components is NaN. Setting to zero.");
            float n11;
            if (Float.isNaN(array[0])) {
                n11 = 0.0f;
            }
            else {
                n11 = array[0];
            }
            array[0] = n11;
            float n12;
            if (Float.isNaN(array[1])) {
                n12 = n5;
            }
            else {
                n12 = array[1];
            }
            array[1] = n12;
        }
        final int n13 = (int)(array[0] * 256.0f);
        final int n14 = (int)(array[1] * 256.0f);
        final byte b2 = (byte)n13;
        final byte b3 = (byte)n14;
        byte b4 = b2;
        if (n13 >= 256) {
            b4 = -1;
        }
        byte b5 = b3;
        if (n14 >= 256) {
            b5 = -1;
        }
        return new byte[] { b4, b5 };
    }
    
    public final int e(final int n) {
        return ((int[])this.b)[n];
    }
}
