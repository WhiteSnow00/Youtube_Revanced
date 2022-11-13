import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxp extends bxw
{
    public static final int[] a;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final boolean[] j;
    private boolean A;
    private long B;
    private final bas k;
    private final int l;
    private final int m;
    private final int n;
    private final long o;
    private final ArrayList p;
    private bxo q;
    private List r;
    private List s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private byte x;
    private byte y;
    private int z;
    
    static {
        d = new int[] { 11, 1, 3, 12, 14, 5, 7, 9 };
        e = new int[] { 0, 4, 8, 12, 16, 20, 24, 28 };
        a = new int[] { -1, -16711936, -16776961, -16711681, -65536, -256, -65281 };
        f = new int[] { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632 };
        g = new int[] { 174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251 };
        h = new int[] { 193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187 };
        i = new int[] { 195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496 };
        j = new boolean[] { false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false };
    }
    
    public bxp(final String s, final int n) {
        this.k = new bas();
        this.p = new ArrayList();
        this.q = new bxo(0, 4);
        this.z = 0;
        this.o = 16000000L;
        int l;
        if (!"application/x-mp4-cea-608".equals(s)) {
            l = 3;
        }
        else {
            l = 2;
        }
        this.l = l;
        Label_0152: {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            bap.c("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                            this.n = 0;
                            this.m = 0;
                            break Label_0152;
                        }
                        this.n = 1;
                    }
                    else {
                        this.n = 0;
                    }
                    this.m = 1;
                    break Label_0152;
                }
                this.n = 1;
            }
            else {
                this.n = 0;
            }
            this.m = 0;
        }
        this.o(0);
        this.n();
        this.A = true;
        this.B = -9223372036854775807L;
    }
    
    private static char l(final byte b) {
        return (char)bxp.f[b - 32];
    }
    
    private final List m() {
        final int size = this.p.size();
        final ArrayList list = new ArrayList(size);
        final int n = 0;
        int n2 = 2;
        int min;
        for (int i = 0; i < size; ++i, n2 = min) {
            final azy b = this.p.get(i).b(Integer.MIN_VALUE);
            list.add((Object)b);
            min = n2;
            if (b != null) {
                min = Math.min(n2, b.k);
            }
        }
        final ArrayList list2 = new ArrayList(size);
        for (int j = n; j < size; ++j) {
            final azy azy = (azy)list.get(j);
            if (azy != null) {
                azy b2 = azy;
                if (azy.k != n2) {
                    b2 = this.p.get(j).b(n2);
                    dk.d((Object)b2);
                }
                list2.add((Object)b2);
            }
        }
        return list2;
    }
    
    private final void n() {
        this.q.e(this.t);
        this.p.clear();
        this.p.add(this.q);
    }
    
    private final void o(int i) {
        final int t = this.t;
        if (t == i) {
            return;
        }
        if ((this.t = i) == 3) {
            for (i = 0; i < this.p.size(); ++i) {
                this.p.get(i).g = 3;
            }
            return;
        }
        this.n();
        if (t != 3 && i != 1 && i != 0) {
            return;
        }
        this.r = Collections.emptyList();
    }
    
    private final void p(final int n) {
        this.u = n;
        this.q.h = n;
    }
    
    private static boolean q(final byte b) {
        return (b & 0xE0) == 0x0;
    }
    
    public final /* bridge */ Object b() {
        return this.i();
    }
    
    public final String c() {
        throw null;
    }
    
    public final void d() {
        super.d();
        this.r = null;
        this.s = null;
        this.o(0);
        this.p(4);
        this.n();
        this.v = false;
        this.w = false;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = true;
        this.B = -9223372036854775807L;
    }
    
    public final void f() {
    }
    
    protected final bxi h() {
        final List r = this.r;
        dk.d((Object)(this.s = r));
        return (bxi)new byc(r, 1);
    }
    
    public final bxm i() {
        bxm i;
        if ((i = super.i()) == null) {
            final long o = this.o;
            final long b = this.B;
            if (b != -9223372036854775807L) {
                if (super.c - b >= o) {
                    final bxm bxm = super.b.pollFirst();
                    if (bxm != null) {
                        this.r = Collections.emptyList();
                        this.B = -9223372036854775807L;
                        bxm.e(super.c, this.h(), Long.MAX_VALUE);
                        return bxm;
                    }
                }
            }
            i = null;
        }
        return i;
    }
    
    protected final void j(final bxl bxl) {
        final ByteBuffer c = bxl.c;
        dk.d((Object)c);
        this.k.E(c.array(), c.limit());
        boolean b = false;
        while (true) {
            final int a = this.k.a();
            final int l = this.l;
            if (a < l) {
                break;
            }
            int i;
            if (l == 2) {
                i = -4;
            }
            else {
                i = this.k.i();
            }
            final int j = this.k.i();
            final int k = this.k.i();
            if ((i & 0x2) != 0x0 || (i & 0x1) != this.m) {
                continue;
            }
            final int n = j & 0x7F;
            final int n2 = k & 0x7F;
            if (n == 0 && n2 == 0) {
                continue;
            }
            final boolean v = this.v;
            boolean v2 = false;
            Label_0173: {
                if ((i & 0x4) == 0x4) {
                    final boolean[] m = bxp.j;
                    if (m[j] && m[k]) {
                        v2 = true;
                        break Label_0173;
                    }
                }
                v2 = false;
            }
            this.v = v2;
            final byte x = (byte)n;
            final byte y = (byte)n2;
            boolean b2 = false;
            Label_0265: {
                if (v2 && (n & 0xF0) == 0x10) {
                    if (this.w && this.x == n && this.y == n2) {
                        this.w = false;
                        b2 = true;
                        break Label_0265;
                    }
                    this.w = true;
                    this.x = x;
                    this.y = y;
                }
                else {
                    this.w = false;
                }
                b2 = false;
            }
            if (b2) {
                continue;
            }
            Label_0284: {
                if (!v2) {
                    if (!v) {
                        continue;
                    }
                    this.n();
                }
                else {
                    Label_0408: {
                        if (n > 0 && n <= 15) {
                            this.A = false;
                        }
                        else if ((n & 0xF6) == 0x14) {
                            Label_0403: {
                                if (n2 != 32 && n2 != 47) {
                                    switch (n2) {
                                        default: {
                                            switch (n2) {
                                                default: {
                                                    break Label_0408;
                                                }
                                                case 42:
                                                case 43: {
                                                    this.A = false;
                                                    break Label_0408;
                                                }
                                                case 41: {
                                                    break Label_0403;
                                                }
                                            }
                                            break;
                                        }
                                        case 37:
                                        case 38:
                                        case 39: {
                                            break;
                                        }
                                    }
                                }
                            }
                            this.A = true;
                        }
                    }
                    if (!this.A) {
                        continue;
                    }
                    if (q(x)) {
                        this.z = (n >> 3 & 0x1);
                    }
                    if (this.z != this.n) {
                        continue;
                    }
                    if (q(x)) {
                        final int n3 = n & 0xF7;
                        if (n3 == 17 && (n2 & 0xF0) == 0x30) {
                            this.q.c((char)bxp.g[n2 & 0xF]);
                        }
                        else {
                            final int n4 = n & 0xF6;
                            if (n4 == 18 && (n2 & 0xE0) == 0x20) {
                                this.q.d();
                                final bxo q = this.q;
                                int n5;
                                if ((n & 0x1) == 0x0) {
                                    n5 = bxp.h[n2 & 0x1F];
                                }
                                else {
                                    n5 = bxp.i[n2 & 0x1F];
                                }
                                q.c((char)n5);
                            }
                            else if (n3 == 17 && (n2 & 0xF0) == 0x20) {
                                this.q.c(' ');
                                this.q.f(n2 >> 1 & 0x7, 0x1 == (n2 & 0x1));
                            }
                            else if ((n & 0xF0) == 0x10 && (n2 & 0xC0) == 0x40) {
                                int d;
                                final int n6 = d = bxp.d[n & 0x7];
                                if ((n2 & 0x20) != 0x0) {
                                    d = n6 + 1;
                                }
                                bxo bxo2;
                                final bxo bxo = bxo2 = this.q;
                                if (d != bxo.d) {
                                    if (this.t != 1 && !bxo.g()) {
                                        final bxo q2 = new bxo(this.t, this.u);
                                        this.q = q2;
                                        this.p.add(q2);
                                    }
                                    bxo2 = this.q;
                                    bxo2.d = d;
                                }
                                final int n7 = n2 & 0x10;
                                final int n8 = n2 >> 1 & 0x7;
                                int n9;
                                if (n7 == 16) {
                                    n9 = 8;
                                }
                                else {
                                    n9 = n8;
                                }
                                bxo2.f(n9, 0x1 == (n2 & 0x1));
                                if (n7 == 16) {
                                    this.q.e = bxp.e[n8];
                                }
                            }
                            else if (n3 == 23 && n2 >= 33 && n2 <= 35) {
                                this.q.f = n2 - 32;
                            }
                            else if (n4 == 20 && (n2 & 0xF0) == 0x20) {
                                if (n2 != 32) {
                                    if (n2 != 41) {
                                        switch (n2) {
                                            default: {
                                                final int t = this.t;
                                                if (t == 0) {
                                                    break;
                                                }
                                                if (n2 == 33) {
                                                    this.q.d();
                                                    break;
                                                }
                                                switch (n2) {
                                                    default: {
                                                        break Label_0284;
                                                    }
                                                    case 47: {
                                                        this.r = this.m();
                                                        this.n();
                                                        break Label_0284;
                                                    }
                                                    case 46: {
                                                        this.n();
                                                        break Label_0284;
                                                    }
                                                    case 45: {
                                                        if (t == 1 && !this.q.g()) {
                                                            final bxo q3 = this.q;
                                                            q3.b.add(q3.a());
                                                            q3.c.setLength(0);
                                                            q3.a.clear();
                                                            while (q3.b.size() >= Math.min(q3.h, q3.d)) {
                                                                q3.b.remove(0);
                                                            }
                                                            break Label_0284;
                                                        }
                                                        break Label_0284;
                                                    }
                                                    case 44: {
                                                        this.r = Collections.emptyList();
                                                        final int t2 = this.t;
                                                        if (t2 == 1 || t2 == 3) {
                                                            this.n();
                                                            break Label_0284;
                                                        }
                                                        break Label_0284;
                                                    }
                                                }
                                                break;
                                            }
                                            case 39: {
                                                this.o(1);
                                                this.p(4);
                                                break;
                                            }
                                            case 38: {
                                                this.o(1);
                                                this.p(3);
                                                break;
                                            }
                                            case 37: {
                                                this.o(1);
                                                this.p(2);
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        this.o(3);
                                    }
                                }
                                else {
                                    this.o(2);
                                }
                            }
                        }
                    }
                    else {
                        this.q.c(l(x));
                        if ((n2 & 0xE0) != 0x0) {
                            this.q.c(l(y));
                        }
                    }
                }
            }
            b = true;
        }
        if (b) {
            final int t3 = this.t;
            if (t3 == 1 || t3 == 3) {
                this.r = this.m();
                this.B = super.c;
            }
        }
    }
    
    protected final boolean k() {
        return this.r != this.s;
    }
}
