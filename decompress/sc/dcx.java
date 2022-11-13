import java.util.Iterator;
import java.nio.ByteOrder;
import java.util.Arrays;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcx implements dcu
{
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public dcw f;
    public Bitmap g;
    public Boolean h;
    public Bitmap$Config i;
    public final dml j;
    private int[] k;
    private final int[] l;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    
    public dcx(final dml j, final dcw dcw, final ByteBuffer byteBuffer, final int n, final byte[] array) {
        this.l = new int[256];
        this.i = Bitmap$Config.ARGB_8888;
        this.j = j;
        this.f = new dcw();
        this.c(dcw, byteBuffer, n);
    }
    
    private final int d() {
        return this.a.get() & 0xFF;
    }
    
    private final Bitmap e() {
        final Boolean h = this.h;
        Bitmap$Config bitmap$Config;
        if (h != null && !h) {
            bitmap$Config = this.i;
        }
        else {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap b = ((dgg)this.j.a).b(this.t, this.s, bitmap$Config);
        b.setHasAlpha(true);
        return b;
    }
    
    public final Bitmap a() {
        monitorenter(this);
        try {
            if (this.f.c <= 0 || this.e < 0) {
                this.q = 1;
            }
            final int q = this.q;
            if (q == 1 || q == 2) {
                monitorexit(this);
                return null;
            }
            this.q = 0;
            if (this.b == null) {
                this.b = this.j.c(255);
            }
            final dcv dcv = this.f.e.get(this.e);
            final int n = this.e - 1;
            dcv dcv2;
            if (n >= 0) {
                dcv2 = this.f.e.get(n);
            }
            else {
                dcv2 = null;
            }
            int[] k;
            if ((k = dcv.k) == null) {
                k = this.f.a;
            }
            if ((this.k = k) == null) {
                this.q = 1;
                monitorexit(this);
                return null;
            }
            if (dcv.f) {
                System.arraycopy(k, 0, this.l, 0, 256);
                (this.k = this.l)[dcv.h] = 0;
                if (dcv.g == 2 && this.e == 0) {
                    this.h = true;
                }
            }
            final int[] d = this.d;
            if (dcv2 == null) {
                final Bitmap g = this.g;
                if (g != null) {
                    this.j.a(g);
                }
                this.g = null;
                Arrays.fill(d, 0);
            }
            if (dcv2 != null && dcv2.g == 3 && this.g == null) {
                Arrays.fill(d, 0);
            }
            if (dcv2 != null) {
                final int g2 = dcv2.g;
                if (g2 > 0) {
                    if (g2 == 2) {
                        int l = 0;
                        Label_0372: {
                            if (!dcv.f) {
                                final dcw f = this.f;
                                l = f.l;
                                if (dcv.k == null) {
                                    break Label_0372;
                                }
                                l = l;
                                if (f.j != dcv.h) {
                                    break Label_0372;
                                }
                            }
                            l = 0;
                        }
                        final int d2 = dcv2.d;
                        final int r = this.r;
                        final int n2 = d2 / r;
                        final int n3 = dcv2.b / r;
                        final int n4 = dcv2.c / r;
                        int i = 0;
                        for (int n5 = dcv2.a / r, t = this.t; i < (i = n3 * t + n5) + n2 * t; i += this.t) {
                            for (int j = i; j < i + n4; ++j) {
                                d[j] = l;
                            }
                        }
                    }
                    else if (g2 == 3) {
                        final Bitmap g3 = this.g;
                        if (g3 != null) {
                            final int t2 = this.t;
                            g3.getPixels(d, 0, t2, 0, 0, t2, this.s);
                        }
                    }
                }
            }
            if (dcv != null) {
                this.a.position(dcv.j);
            }
            int n6;
            if (dcv == null) {
                final dcw f2 = this.f;
                n6 = f2.f * f2.g;
            }
            else {
                n6 = dcv.d * dcv.c;
            }
            final byte[] c = this.c;
            if (c == null || c.length < n6) {
                this.c = this.j.c(n6);
            }
            final byte[] c2 = this.c;
            if (this.m == null) {
                this.m = new short[4096];
            }
            final short[] m = this.m;
            if (this.n == null) {
                this.n = new byte[4096];
            }
            final byte[] n7 = this.n;
            if (this.o == null) {
                this.o = new byte[4097];
            }
            final byte[] o = this.o;
            final int d3 = this.d();
            final int n8 = 1 << d3;
            int n9 = d3 + 1;
            for (int n10 = 0; n10 < n8; ++n10) {
                m[n10] = 0;
                n7[n10] = (byte)n10;
            }
            final int n11 = (1 << n9) - 1;
            final int n12 = n8 + 2;
            final byte[] b = this.b;
            int n13 = n12;
            int n14 = n9;
            int n15 = n11;
            int n16 = 0;
            int n17 = -1;
            int n18 = 0;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            int n23 = 0;
            int n24 = 0;
        Label_0779:
            while (n16 < n6) {
                int d4;
                if (n18 == 0) {
                    d4 = this.d();
                    if (d4 <= 0) {
                        d4 = 0;
                    }
                    else {
                        final ByteBuffer a = this.a;
                        a.get(this.b, 0, Math.min(d4, a.remaining()));
                    }
                    if (d4 <= 0) {
                        this.q = 3;
                        break;
                    }
                    n21 = 0;
                }
                else {
                    d4 = n18;
                }
                final int n25 = n20 + ((b[n21] & 0xFF) << n19);
                final int n26 = n21 + 1;
                final int n27 = d4 - 1;
                final int n28 = n17;
                final int n29 = n19 + 8;
                final int n30 = n13;
                int n31 = n23;
                int n32 = n15;
                int n33 = n25;
                int n34 = n9;
                int n35 = n16;
                int n36 = n14;
                int n37 = n30;
                int n38 = n29;
                int n39 = n28;
                while (true) {
                    while (n38 >= n36) {
                        final int n40 = n33 & n32;
                        final int n41 = n33 >> n36;
                        n38 -= n36;
                        if (n40 == n8) {
                            n32 = n11;
                            final int n42 = n34;
                            n37 = n12;
                            n39 = -1;
                            n36 = n34;
                            n34 = n42;
                            n33 = n41;
                        }
                        else {
                            final int n43 = n38;
                            if (n40 == n8 + 1) {
                                final int n44 = n41;
                                n38 = n43;
                                final int n45 = n31;
                                final int n46 = n36;
                                n19 = n38;
                                n13 = n37;
                                n16 = n35;
                                n9 = n34;
                                n17 = n39;
                                n18 = n27;
                                n20 = n44;
                                n21 = n26;
                                n15 = n32;
                                n14 = n46;
                                n23 = n45;
                                continue Label_0779;
                            }
                            if (n39 == -1) {
                                c2[n22] = n7[n40];
                                ++n35;
                                ++n22;
                                n31 = n40;
                            }
                            else {
                                int n47;
                                int n48;
                                if (n40 >= n37) {
                                    o[n24] = (byte)n31;
                                    n47 = n24 + 1;
                                    n48 = n39;
                                }
                                else {
                                    final int n49 = n40;
                                    n47 = n24;
                                    n48 = n49;
                                }
                                while (n48 >= n8) {
                                    o[n47] = n7[n48];
                                    n48 = m[n48];
                                    ++n47;
                                }
                                final int n50 = n7[n48] & 0xFF;
                                final byte b2 = (byte)n50;
                                c2[n22] = b2;
                                int n51;
                                int n52;
                                while (true) {
                                    n51 = n35 + 1;
                                    n52 = n22 + 1;
                                    if (n47 <= 0) {
                                        break;
                                    }
                                    --n47;
                                    c2[n52] = o[n47];
                                    n35 = n51;
                                    n22 = n52;
                                }
                                int n53 = n37;
                                int n54 = n36;
                                int n55 = n32;
                                if (n37 < 4096) {
                                    m[n37] = (short)n39;
                                    n7[n37] = b2;
                                    n53 = ++n37;
                                    n54 = n36;
                                    n55 = n32;
                                    if ((n37 & n32) == 0x0) {
                                        n53 = n37;
                                        n54 = n36;
                                        n55 = n32;
                                        if (n37 < 4096) {
                                            n55 = n32 + n37;
                                            n54 = n36 + 1;
                                            n53 = n37;
                                        }
                                    }
                                }
                                final int n56 = n50;
                                n37 = n53;
                                n36 = n54;
                                n35 = n51;
                                n31 = n56;
                                n22 = n52;
                                n32 = n55;
                                n24 = n47;
                            }
                            n39 = n40;
                            n38 = n43;
                            n33 = n41;
                        }
                    }
                    final int n44 = n33;
                    continue;
                }
            }
            Arrays.fill(c2, n22, n6, (byte)0);
            if (!dcv.e && this.r == 1) {
                final int[] d5 = this.d;
                final int d6 = dcv.d;
                final int b3 = dcv.b;
                final int c3 = dcv.c;
                final int a2 = dcv.a;
                final int e = this.e;
                final int t3 = this.t;
                final byte[] c4 = this.c;
                final int[] k2 = this.k;
                int n57 = -1;
                for (int n58 = 0; n58 < d6; ++n58) {
                    final int n59 = (n58 + b3) * t3;
                    int n60 = n59 + a2;
                    final int n61 = n60 + c3;
                    final int n62 = n59 + t3;
                    int n63 = dcv.c * n58;
                    while (true) {
                        int n64;
                        if (n62 < n61) {
                            n64 = n62;
                        }
                        else {
                            n64 = n61;
                        }
                        if (n60 >= n64) {
                            break;
                        }
                        final byte b4 = c4[n63];
                        final int n65 = b4 & 0xFF;
                        int n66;
                        if (n65 != (n66 = n57)) {
                            final int n67 = k2[n65];
                            if (n67 != 0) {
                                d5[n60] = n67;
                                n66 = n57;
                            }
                            else {
                                n66 = b4;
                            }
                        }
                        ++n60;
                        ++n63;
                        n57 = n66;
                    }
                }
                final Boolean h = this.h;
                this.h = ((h != null && h) || (this.h == null && e == 0 && n57 != -1));
            }
            else {
                final int[] d7 = this.d;
                final int d8 = dcv.d;
                final int r2 = this.r;
                final int n68 = d8 / r2;
                final int n69 = dcv.b / r2;
                int n70 = dcv.c / r2;
                int n71 = dcv.a / r2;
                final int e2 = this.e;
                int t4 = this.t;
                final int s = this.s;
                final byte[] c5 = this.c;
                final int[] k3 = this.k;
                Boolean h2 = this.h;
                int n72 = 0;
                int n73 = 0;
                int n74 = 1;
                int n75 = 8;
                while (n73 < n68) {
                    int n76;
                    int n77;
                    int n78;
                    int n79;
                    if (dcv.e) {
                        if (n72 >= n68) {
                            if (++n74 != 2) {
                                if (n74 != 3) {
                                    if (n74 == 4) {
                                        n72 = 1;
                                        n75 = 2;
                                    }
                                }
                                else {
                                    n72 = 2;
                                    n75 = 4;
                                }
                            }
                            else {
                                n72 = 4;
                            }
                        }
                        n76 = n72 + n75;
                        n77 = n72;
                        n78 = n74;
                        n79 = n75;
                    }
                    else {
                        n77 = n73;
                        n79 = n75;
                        n78 = n74;
                        n76 = n72;
                    }
                    final int n80 = n77 + n69;
                    int n89 = 0;
                    int n90 = 0;
                    int n91 = 0;
                    Label_2536: {
                        int n94;
                        int n95;
                        int n96;
                        Boolean b5;
                        if (n80 < s) {
                            final int n81 = n80 * t4;
                            int n82 = n81 + n71;
                            final int n83 = n82 + n70;
                            final int n84 = n81 + t4;
                            int n85 = n73 * r2 * dcv.c;
                            int n86;
                            if (n84 < (n86 = n83)) {
                                n86 = n84;
                            }
                            if (r2 == 1) {
                                while (n82 < n86) {
                                    final int n87 = k3[c5[n85] & 0xFF];
                                    Boolean value;
                                    if (n87 != 0) {
                                        d7[n82] = n87;
                                        value = h2;
                                    }
                                    else {
                                        value = h2;
                                        if (e2 == 0 && (value = h2) == null) {
                                            value = true;
                                        }
                                    }
                                    ++n82;
                                    ++n85;
                                    h2 = value;
                                }
                                final int n88 = n71;
                                n89 = n70;
                                n90 = n88;
                                n91 = t4;
                                break Label_2536;
                            }
                            final int n92 = n85 + (n86 - n82) * r2;
                            final int n93 = n86;
                            while (true) {
                                n94 = n70;
                                n95 = n71;
                                n96 = t4;
                                b5 = h2;
                                if (n82 >= n93) {
                                    break;
                                }
                                final int c6 = dcv.c;
                                int n97 = n85;
                                int n98 = 0;
                                int n99 = 0;
                                int n100 = 0;
                                int n101 = 0;
                                int n102 = 0;
                                while (n97 < n85 + this.r) {
                                    final byte[] c7 = this.c;
                                    if (n97 >= c7.length || n97 >= n92) {
                                        break;
                                    }
                                    final int n103 = this.k[c7[n97] & 0xFF];
                                    if (n103 != 0) {
                                        n98 += (n103 >> 24 & 0xFF);
                                        n99 += (n103 >> 16 & 0xFF);
                                        n100 += (n103 >> 8 & 0xFF);
                                        n101 += (n103 & 0xFF);
                                        ++n102;
                                    }
                                    ++n97;
                                }
                                final int n104 = n85 + c6;
                                int n105 = n99;
                                int n106 = n98;
                                int n109;
                                int n110;
                                int n111;
                                int n112;
                                int n113;
                                for (int n107 = n104; n107 < this.r + n104; ++n107, n106 = n109, n105 = n110, n100 = n111, n101 = n112, n102 = n113) {
                                    final byte[] c8 = this.c;
                                    if (n107 >= c8.length || n107 >= n92) {
                                        break;
                                    }
                                    final int n108 = this.k[c8[n107] & 0xFF];
                                    n109 = n106;
                                    n110 = n105;
                                    n111 = n100;
                                    n112 = n101;
                                    n113 = n102;
                                    if (n108 != 0) {
                                        n109 = n106 + (n108 >> 24 & 0xFF);
                                        n110 = n105 + (n108 >> 16 & 0xFF);
                                        n111 = n100 + (n108 >> 8 & 0xFF);
                                        n112 = n101 + (n108 & 0xFF);
                                        n113 = n102 + 1;
                                    }
                                }
                                int n114;
                                if (n102 == 0) {
                                    n114 = 0;
                                }
                                else {
                                    n114 = (n106 / n102 << 24 | n105 / n102 << 16 | n100 / n102 << 8 | n101 / n102);
                                }
                                Boolean value2;
                                if (n114 != 0) {
                                    d7[n82] = n114;
                                    value2 = h2;
                                }
                                else {
                                    value2 = h2;
                                    if (e2 == 0 && (value2 = h2) == null) {
                                        value2 = true;
                                    }
                                }
                                n85 += r2;
                                ++n82;
                                h2 = value2;
                            }
                        }
                        else {
                            b5 = h2;
                            n96 = t4;
                            n95 = n71;
                            n94 = n70;
                        }
                        n89 = n94;
                        n90 = n95;
                        n91 = n96;
                        h2 = b5;
                    }
                    ++n73;
                    n72 = n76;
                    final int n115 = n90;
                    n70 = n89;
                    n71 = n115;
                    t4 = n91;
                    n74 = n78;
                    n75 = n79;
                }
                if (this.h == null) {
                    this.h = (h2 != null && h2);
                }
            }
            if (this.p) {
                final int g4 = dcv.g;
                if (g4 == 0 || g4 == 1) {
                    if (this.g == null) {
                        this.g = this.e();
                    }
                    final Bitmap g5 = this.g;
                    final int t5 = this.t;
                    g5.setPixels(d, 0, t5, 0, 0, t5, this.s);
                }
            }
            final Bitmap e3 = this.e();
            final int t6 = this.t;
            e3.setPixels(d, 0, t6, 0, 0, t6, this.s);
            monitorexit(this);
            return e3;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }
    
    public final void c(final dcw f, ByteBuffer readOnlyBuffer, int highestOneBit) {
        monitorenter(this);
        Label_0203: {
            if (highestOneBit <= 0) {
                break Label_0203;
            }
            try {
                highestOneBit = Integer.highestOneBit(highestOneBit);
                this.q = 0;
                this.f = f;
                this.e = -1;
                readOnlyBuffer = readOnlyBuffer.asReadOnlyBuffer();
                (this.a = readOnlyBuffer).position(0);
                this.a.order(ByteOrder.LITTLE_ENDIAN);
                this.p = false;
                final Iterator iterator = f.e.iterator();
                while (iterator.hasNext()) {
                    if (((dcv)iterator.next()).g == 3) {
                        this.p = true;
                        break;
                    }
                }
                this.r = highestOneBit;
                final int f2 = f.f;
                this.t = f2 / highestOneBit;
                final int g = f.g;
                this.s = g / highestOneBit;
                this.c = this.j.c(f2 * g);
                final dml j = this.j;
                highestOneBit = this.t * this.s;
                final Object b = j.b;
                int[] d;
                if (b == null) {
                    d = new int[highestOneBit];
                }
                else {
                    d = (int[])((dge)b).a(highestOneBit, (Class)int[].class);
                }
                this.d = d;
                monitorexit(this);
            }
            finally {
                monitorexit(this);
                while (true) {}
                final StringBuilder sb = new StringBuilder("Sample size must be >=0, not: ");
                sb.append(highestOneBit);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
