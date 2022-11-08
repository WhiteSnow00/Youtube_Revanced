import android.graphics.PathEffect;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

final class bya
{
    private static final byte[] h;
    private static final byte[] i;
    private static final byte[] j;
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final bxx d;
    public final bxz e;
    public Bitmap f;
    public final adec g;
    
    static {
        h = new byte[] { 0, 7, 8, 15 };
        i = new byte[] { 0, 119, -120, -1 };
        j = new byte[] { 0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1 };
    }
    
    public bya(final int n, final int n2) {
        final Paint a = new Paint();
        (this.a = a).setStyle(Paint$Style.FILL_AND_STROKE);
        a.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
        a.setPathEffect((PathEffect)null);
        final Paint b = new Paint();
        (this.b = b).setStyle(Paint$Style.FILL);
        b.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OVER));
        b.setPathEffect((PathEffect)null);
        this.c = new Canvas();
        this.d = new bxx(719, 575, 0, 719, 0, 575);
        this.g = new adec(0, e(), f(), g());
        this.e = new bxz(n, n2);
    }
    
    public static void a(byte[] array, final int[] array2, final int n, final int n2, int n3, final Paint paint, final Canvas canvas) {
        final athu athu = new athu(array, null);
        byte[] h = null;
        byte[] h3;
        byte[] h2 = h3 = h;
        int n4 = n3;
        n3 = n2;
        while (athu.d() != 0) {
            final int g = athu.g(8);
            if (g != 240) {
                switch (g) {
                    default: {
                        switch (g) {
                            default: {
                                continue;
                            }
                            case 34: {
                                h2 = h(16, 8, athu);
                                continue;
                            }
                            case 33: {
                                h = h(4, 8, athu);
                                continue;
                            }
                            case 32: {
                                h3 = h(4, 4, athu);
                                continue;
                            }
                        }
                        break;
                    }
                    case 18: {
                        final int n5 = 0;
                        int n6 = n3;
                        n3 = n5;
                        do {
                            int n7 = athu.g(8);
                            int n8;
                            if (n7 != 0) {
                                n8 = 1;
                            }
                            else if (!athu.q()) {
                                n8 = athu.g(7);
                                if (n8 != 0) {
                                    n7 = 0;
                                }
                                else {
                                    n7 = 0;
                                    n3 = 1;
                                    n8 = 0;
                                }
                            }
                            else {
                                n8 = athu.g(7);
                                n7 = athu.g(8);
                            }
                            if (n8 != 0 && paint != null) {
                                paint.setColor(array2[n7]);
                                canvas.drawRect((float)n6, (float)n4, (float)(n6 + n8), (float)(n4 + 1), paint);
                            }
                            n6 += n8;
                        } while (n3 == 0);
                        n3 = n6;
                        continue;
                    }
                    case 17: {
                        if (n == 3) {
                            if (h2 == null) {
                                array = bya.j;
                            }
                            else {
                                array = h2;
                            }
                        }
                        else {
                            array = null;
                        }
                        final int n9 = 0;
                        int n10 = n3;
                        n3 = n9;
                        while (true) {
                            int g2 = athu.g(4);
                            int g3 = 0;
                            int n12 = 0;
                            Label_0575: {
                                Label_0364: {
                                    if (g2 == 0) {
                                        Label_0423: {
                                            if (athu.q()) {
                                                int n11;
                                                if (!athu.q()) {
                                                    g3 = athu.g(2) + 4;
                                                    n11 = athu.g(4);
                                                }
                                                else {
                                                    final int g4 = athu.g(2);
                                                    if (g4 == 0) {
                                                        g2 = 0;
                                                        break Label_0364;
                                                    }
                                                    if (g4 == 1) {
                                                        n12 = n3;
                                                        n3 = 0;
                                                        g3 = 2;
                                                        break Label_0575;
                                                    }
                                                    if (g4 != 2) {
                                                        if (g4 != 3) {
                                                            n12 = n3;
                                                            break Label_0423;
                                                        }
                                                        g3 = athu.g(8) + 25;
                                                        n11 = athu.g(4);
                                                    }
                                                    else {
                                                        g3 = athu.g(4) + 9;
                                                        n11 = athu.g(4);
                                                    }
                                                }
                                                final int n13 = n3;
                                                n3 = n11;
                                                n12 = n13;
                                                break Label_0575;
                                            }
                                            g3 = athu.g(3);
                                            if (g3 != 0) {
                                                n12 = n3;
                                                g3 += 2;
                                                n3 = 0;
                                                break Label_0575;
                                            }
                                            n12 = 1;
                                        }
                                        n3 = 0;
                                        g3 = 0;
                                        break Label_0575;
                                    }
                                }
                                final int n14 = n3;
                                final int n15 = 1;
                                n3 = g2;
                                n12 = n14;
                                g3 = n15;
                            }
                            if (g3 != 0 && paint != null) {
                                int n16 = n3;
                                if (array != null) {
                                    n16 = array[n3];
                                }
                                paint.setColor(array2[n16]);
                                canvas.drawRect((float)n10, (float)n4, (float)(n10 + g3), (float)(n4 + 1), paint);
                            }
                            n10 += g3;
                            if (n12 != 0) {
                                break;
                            }
                            n3 = n12;
                        }
                        athu.j();
                        n3 = n10;
                        continue;
                    }
                    case 16: {
                        if (n == 3) {
                            if (h == null) {
                                array = bya.i;
                            }
                            else {
                                array = h;
                            }
                        }
                        else if (n == 2) {
                            if (h3 == null) {
                                array = bya.h;
                            }
                            else {
                                array = h3;
                            }
                        }
                        else {
                            array = null;
                        }
                        final int n17 = 0;
                        int n18 = n3;
                        n3 = n17;
                        while (true) {
                            int g5 = athu.g(2);
                            int n20 = 0;
                            int n21 = 0;
                            Label_0958: {
                                if (g5 == 0) {
                                    if (athu.q()) {
                                        final int g6 = athu.g(3);
                                        final int g7 = athu.g(2);
                                        final int n19 = g6 + 3;
                                        n20 = n3;
                                        n3 = g7;
                                        n21 = n19;
                                        break Label_0958;
                                    }
                                    if (athu.q()) {
                                        g5 = 0;
                                    }
                                    else {
                                        final int g8 = athu.g(2);
                                        if (g8 == 0) {
                                            n3 = 0;
                                            n21 = 0;
                                            n20 = 1;
                                            break Label_0958;
                                        }
                                        if (g8 == 1) {
                                            n20 = n3;
                                            n3 = 0;
                                            n21 = 2;
                                            break Label_0958;
                                        }
                                        if (g8 == 2) {
                                            final int g9 = athu.g(4);
                                            final int g10 = athu.g(2);
                                            final int n22 = g9 + 12;
                                            n20 = n3;
                                            n3 = g10;
                                            n21 = n22;
                                            break Label_0958;
                                        }
                                        if (g8 != 3) {
                                            n20 = n3;
                                            n3 = 0;
                                            n21 = 0;
                                            break Label_0958;
                                        }
                                        final int g11 = athu.g(8);
                                        final int g12 = athu.g(2);
                                        final int n23 = g11 + 29;
                                        n20 = n3;
                                        n3 = g12;
                                        n21 = n23;
                                        break Label_0958;
                                    }
                                }
                                final int n24 = n3;
                                n21 = 1;
                                n3 = g5;
                                n20 = n24;
                            }
                            if (n21 != 0 && paint != null) {
                                int n25 = n3;
                                if (array != null) {
                                    n25 = array[n3];
                                }
                                paint.setColor(array2[n25]);
                                canvas.drawRect((float)n18, (float)n4, (float)(n18 + n21), (float)(n4 + 1), paint);
                            }
                            n18 += n21;
                            if (n20 != 0) {
                                break;
                            }
                            n3 = n20;
                        }
                        athu.j();
                        n3 = n18;
                        continue;
                    }
                }
            }
            else {
                n4 += 2;
                n3 = n2;
            }
        }
    }
    
    public static aeyk b(final athu athu) {
        final int g = athu.g(16);
        athu.o(4);
        final int g2 = athu.g(2);
        final boolean q = athu.q();
        athu.o(1);
        final byte[] e = baw.e;
        byte[] e2 = baw.e;
        byte[] array;
        if (g2 == 1) {
            athu.o(athu.g(8) * 16);
            array = e;
        }
        else {
            array = e;
            if (g2 == 0) {
                final int g3 = athu.g(16);
                final int g4 = athu.g(16);
                array = e;
                if (g3 > 0) {
                    array = new byte[g3];
                    athu.s(array, g3);
                }
                if (g4 > 0) {
                    e2 = new byte[g4];
                    athu.s(e2, g4);
                }
                else {
                    e2 = array;
                }
            }
        }
        return new aeyk(g, q, array, e2);
    }
    
    public static adec c(final athu athu, int i) {
        final int g = athu.g(8);
        athu.o(8);
        i -= 2;
        final int[] e = e();
        final int[] f = f();
        final int[] g2 = g();
        while (i > 0) {
            final int g3 = athu.g(8);
            final int g4 = athu.g(8);
            i -= 2;
            int[] array;
            if ((g4 & 0x80) != 0x0) {
                array = e;
            }
            else if ((g4 & 0x40) != 0x0) {
                array = f;
            }
            else {
                array = g2;
            }
            int g5;
            int g6;
            int g7;
            int g8;
            if ((g4 & 0x1) != 0x0) {
                g5 = athu.g(8);
                g6 = athu.g(8);
                g7 = athu.g(8);
                g8 = athu.g(8);
                i -= 4;
            }
            else {
                final int g9 = athu.g(6);
                final int g10 = athu.g(4);
                final int g11 = athu.g(4);
                final int g12 = athu.g(2);
                i -= 2;
                g7 = g11 << 4;
                g8 = g12 << 6;
                g5 = g9 << 2;
                g6 = g10 << 4;
            }
            if (g5 == 0) {
                g8 = 255;
            }
            if (g5 == 0) {
                g7 = 0;
            }
            if (g5 == 0) {
                g6 = 0;
            }
            final double n = g5;
            final double n2 = g6 - 128;
            final double n3 = g7 - 128;
            final byte b = (byte)(255 - (g8 & 0xFF));
            Double.isNaN(n2);
            Double.isNaN(n);
            final int e2 = baw.e((int)(n + 1.402 * n2), 0, 255);
            Double.isNaN(n3);
            Double.isNaN(n);
            Double.isNaN(n2);
            final int e3 = baw.e((int)(n - 0.34414 * n3 - n2 * 0.71414), 0, 255);
            Double.isNaN(n3);
            Double.isNaN(n);
            array[g3] = d(b, e2, e3, baw.e((int)(n + n3 * 1.772), 0, 255));
        }
        return new adec(g, e, f, g2);
    }
    
    private static int d(final int n, final int n2, final int n3, final int n4) {
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }
    
    private static int[] e() {
        return new int[] { 0, -1, -16777216, -8421505 };
    }
    
    private static int[] f() {
        final int[] array = new int[16];
        array[0] = 0;
        for (int i = 1; i < 16; ++i) {
            if (i < 8) {
                int n;
                if (0x1 != (i & 0x1)) {
                    n = 0;
                }
                else {
                    n = 255;
                }
                int n2;
                if ((i & 0x2) != 0x0) {
                    n2 = 255;
                }
                else {
                    n2 = 0;
                }
                int n3;
                if ((i & 0x4) != 0x0) {
                    n3 = 255;
                }
                else {
                    n3 = 0;
                }
                array[i] = d(255, n, n2, n3);
            }
            else {
                int n4 = 127;
                int n5;
                if (0x1 != (i & 0x1)) {
                    n5 = 0;
                }
                else {
                    n5 = 127;
                }
                int n6;
                if ((i & 0x2) != 0x0) {
                    n6 = 127;
                }
                else {
                    n6 = 0;
                }
                if ((i & 0x4) == 0x0) {
                    n4 = 0;
                }
                array[i] = d(255, n5, n6, n4);
            }
        }
        return array;
    }
    
    private static int[] g() {
        final int[] array = new int[256];
        array[0] = 0;
        for (int i = 0; i < 256; ++i) {
            int n = 255;
            if (i < 8) {
                int n2;
                if (0x1 != (i & 0x1)) {
                    n2 = 0;
                }
                else {
                    n2 = 255;
                }
                int n3;
                if ((i & 0x2) != 0x0) {
                    n3 = 255;
                }
                else {
                    n3 = 0;
                }
                if ((i & 0x4) == 0x0) {
                    n = 0;
                }
                array[i] = d(63, n2, n3, n);
            }
            else {
                final int n4 = i & 0x88;
                int n5 = 170;
                int n6 = 85;
                if (n4 != 0) {
                    if (n4 != 8) {
                        int n7 = 43;
                        if (n4 != 128) {
                            if (n4 == 136) {
                                int n8;
                                if (0x1 != (i & 0x1)) {
                                    n8 = 0;
                                }
                                else {
                                    n8 = 43;
                                }
                                int n9;
                                if ((i & 0x10) != 0x0) {
                                    n9 = 85;
                                }
                                else {
                                    n9 = 0;
                                }
                                int n10;
                                if ((i & 0x2) != 0x0) {
                                    n10 = 43;
                                }
                                else {
                                    n10 = 0;
                                }
                                int n11;
                                if ((i & 0x20) != 0x0) {
                                    n11 = 85;
                                }
                                else {
                                    n11 = 0;
                                }
                                if ((i & 0x4) == 0x0) {
                                    n7 = 0;
                                }
                                if ((i & 0x40) == 0x0) {
                                    n6 = 0;
                                }
                                array[i] = d(255, n8 + n9, n10 + n11, n7 + n6);
                            }
                        }
                        else {
                            int n12;
                            if (0x1 != (i & 0x1)) {
                                n12 = 0;
                            }
                            else {
                                n12 = 43;
                            }
                            int n13;
                            if ((i & 0x10) != 0x0) {
                                n13 = 85;
                            }
                            else {
                                n13 = 0;
                            }
                            int n14;
                            if ((i & 0x2) != 0x0) {
                                n14 = 43;
                            }
                            else {
                                n14 = 0;
                            }
                            int n15;
                            if ((i & 0x20) != 0x0) {
                                n15 = 85;
                            }
                            else {
                                n15 = 0;
                            }
                            if ((i & 0x4) == 0x0) {
                                n7 = 0;
                            }
                            if ((i & 0x40) == 0x0) {
                                n6 = 0;
                            }
                            array[i] = d(255, n12 + 127 + n13, n14 + 127 + n15, n7 + 127 + n6);
                        }
                    }
                    else {
                        int n16;
                        if (0x1 != (i & 0x1)) {
                            n16 = 0;
                        }
                        else {
                            n16 = 85;
                        }
                        int n17;
                        if ((i & 0x10) != 0x0) {
                            n17 = 170;
                        }
                        else {
                            n17 = 0;
                        }
                        int n18;
                        if ((i & 0x2) != 0x0) {
                            n18 = 85;
                        }
                        else {
                            n18 = 0;
                        }
                        int n19;
                        if ((i & 0x20) != 0x0) {
                            n19 = 170;
                        }
                        else {
                            n19 = 0;
                        }
                        if ((i & 0x4) == 0x0) {
                            n6 = 0;
                        }
                        if ((i & 0x40) == 0x0) {
                            n5 = 0;
                        }
                        array[i] = d(127, n16 + n17, n18 + n19, n6 + n5);
                    }
                }
                else {
                    int n20;
                    if (0x1 != (i & 0x1)) {
                        n20 = 0;
                    }
                    else {
                        n20 = 85;
                    }
                    int n21;
                    if ((i & 0x10) != 0x0) {
                        n21 = 170;
                    }
                    else {
                        n21 = 0;
                    }
                    int n22;
                    if ((i & 0x2) != 0x0) {
                        n22 = 85;
                    }
                    else {
                        n22 = 0;
                    }
                    int n23;
                    if ((i & 0x20) != 0x0) {
                        n23 = 170;
                    }
                    else {
                        n23 = 0;
                    }
                    if ((i & 0x4) == 0x0) {
                        n6 = 0;
                    }
                    if ((i & 0x40) == 0x0) {
                        n5 = 0;
                    }
                    array[i] = d(255, n20 + n21, n22 + n23, n6 + n5);
                }
            }
        }
        return array;
    }
    
    private static byte[] h(final int n, final int n2, final athu athu) {
        final byte[] array = new byte[n];
        for (int i = 0; i < n; ++i) {
            array[i] = (byte)athu.g(n2);
        }
        return array;
    }
}
