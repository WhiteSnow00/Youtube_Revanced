import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Collections;
import android.text.Layout$Alignment;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxt extends bxw
{
    private final bas a;
    private int d;
    private final int e;
    private final bxr[] f;
    private bxr g;
    private List h;
    private List i;
    private bxs j;
    private int k;
    private final atim l;
    
    public bxt(int i, final List list) {
        this.a = new bas();
        this.l = new atim((byte[])null);
        this.d = -1;
        int e = i;
        if (i == -1) {
            e = 1;
        }
        this.e = e;
        if (list != null) {
            final byte[] a = bae.a;
            if (list.size() == 1 && ((byte[])list.get(0)).length == 1) {
                i = ((byte[])list.get(0))[0];
            }
        }
        this.f = new bxr[8];
        for (i = 0; i < 8; ++i) {
            this.f[i] = new bxr();
        }
        this.g = this.f[0];
    }
    
    private final List l() {
        final ArrayList list = new ArrayList();
        final int n = 0;
        for (int i = 0; i < 8; ++i) {
            if (!this.f[i].f()) {
                final bxr bxr = this.f[i];
                if (bxr.n) {
                    Object o;
                    if (bxr.f()) {
                        o = null;
                    }
                    else {
                        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int j = 0; j < bxr.k.size(); ++j) {
                            spannableStringBuilder.append((CharSequence)bxr.k.get(j));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence)bxr.b());
                        final int v = bxr.v;
                        Layout$Alignment layout$Alignment = null;
                        Label_0225: {
                            if (v != 0) {
                                if (v == 1) {
                                    layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
                                    break Label_0225;
                                }
                                if (v == 2) {
                                    layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                                    break Label_0225;
                                }
                                if (v != 3) {
                                    final StringBuilder sb = new StringBuilder("Unexpected justification value: ");
                                    sb.append(v);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                            layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                        }
                        float n2;
                        float n4;
                        float n5;
                        if (bxr.p) {
                            n2 = (float)bxr.r;
                            final float n3 = (float)bxr.q;
                            n4 = 99.0f;
                            n5 = n3 / 99.0f;
                        }
                        else {
                            n2 = (float)bxr.r;
                            n5 = bxr.q / 74.0f;
                            n4 = 209.0f;
                        }
                        final float n6 = n2 / n4;
                        final int s = bxr.s;
                        final int n7 = s / 3;
                        int n8;
                        if (n7 == 0) {
                            n8 = 0;
                        }
                        else if (n7 == 1) {
                            n8 = 1;
                        }
                        else {
                            n8 = 2;
                        }
                        final int n9 = s % 3;
                        int n10;
                        if (n9 == 0) {
                            n10 = 0;
                        }
                        else if (n9 == 1) {
                            n10 = 1;
                        }
                        else {
                            n10 = 2;
                        }
                        final int y = bxr.y;
                        o = new bxq((CharSequence)spannableStringBuilder, layout$Alignment, n5 * 0.9f + 0.05f, n8, n6 * 0.9f + 0.05f, n10, y != bxr.b, y, bxr.o);
                    }
                    if (o != null) {
                        list.add(o);
                    }
                }
            }
        }
        Collections.sort((List<Object>)list, bxq.a);
        final ArrayList list2 = new ArrayList(list.size());
        for (int k = n; k < list.size(); ++k) {
            list2.add((Object)((bxq)list.get(k)).b);
        }
        return Collections.unmodifiableList((List<?>)list2);
    }
    
    private final void m() {
        final bxs j = this.j;
        if (j != null) {
            final int c = j.c;
            final int a = j.a;
            if (c != a + a - 1) {
                bap.e();
            }
            final atim l = this.l;
            final bxs i = this.j;
            l.l(i.b, i.c);
            int n = 0;
            while (this.l.d() > 0) {
                final int g = this.l.g(3);
                final int g2 = this.l.g(5);
                final int n2 = 7;
                int n3;
                if ((n3 = g) == 7) {
                    this.l.o(2);
                    final int g3 = this.l.g(6);
                    if ((n3 = g3) < 7) {
                        final StringBuilder sb = new StringBuilder("Invalid extended service number: ");
                        sb.append(g3);
                        bap.c("Cea708Decoder", sb.toString());
                        n3 = g3;
                    }
                }
                if (g2 == 0) {
                    if (n3 != 0) {
                        final StringBuilder sb2 = new StringBuilder("serviceNumber is non-zero (");
                        sb2.append(n3);
                        sb2.append(") when blockSize is 0");
                        bap.c("Cea708Decoder", sb2.toString());
                        break;
                    }
                    break;
                }
                else if (n3 != this.e) {
                    this.l.p(g2);
                }
                else {
                    final int f = this.l.f();
                    int n4 = n2;
                    int n5 = n;
                    while (true) {
                        n = n5;
                        if (this.l.f() >= f + g2 * 8) {
                            break;
                        }
                        final int g4 = this.l.g(8);
                        if (g4 != 16) {
                            if (g4 <= 31) {
                                if (g4 == 0) {
                                    continue;
                                }
                                if (g4 != 3) {
                                    if (g4 != 8) {
                                        switch (g4) {
                                            default: {
                                                if (g4 >= 17 && g4 <= 23) {
                                                    final StringBuilder sb3 = new StringBuilder("Currently unsupported COMMAND_EXT1 Command: ");
                                                    sb3.append(g4);
                                                    bap.c("Cea708Decoder", sb3.toString());
                                                    this.l.o(8);
                                                    continue;
                                                }
                                                if (g4 >= 24) {
                                                    final StringBuilder sb4 = new StringBuilder("Currently unsupported COMMAND_P16 Command: ");
                                                    sb4.append(g4);
                                                    bap.c("Cea708Decoder", sb4.toString());
                                                    this.l.o(16);
                                                    continue;
                                                }
                                                final StringBuilder sb5 = new StringBuilder("Invalid C0 command: ");
                                                sb5.append(g4);
                                                bap.c("Cea708Decoder", sb5.toString());
                                                continue;
                                            }
                                            case 14: {
                                                continue;
                                            }
                                            case 13: {
                                                this.g.c('\n');
                                                continue;
                                            }
                                            case 12: {
                                                this.n();
                                                continue;
                                            }
                                        }
                                    }
                                    else {
                                        final bxr g5 = this.g;
                                        final int length = g5.l.length();
                                        if (length <= 0) {
                                            continue;
                                        }
                                        g5.l.delete(length - 1, length);
                                    }
                                }
                                else {
                                    this.h = this.l();
                                }
                            }
                            else {
                                Label_0564: {
                                    if (g4 > 127) {
                                        if (g4 <= 159) {
                                            switch (g4) {
                                                case 142: {
                                                    break Label_0564;
                                                }
                                                default: {
                                                    final StringBuilder sb6 = new StringBuilder("Invalid C1 command: ");
                                                    sb6.append(g4);
                                                    bap.c("Cea708Decoder", sb6.toString());
                                                    break;
                                                }
                                                case 152:
                                                case 153:
                                                case 154:
                                                case 155:
                                                case 156:
                                                case 157:
                                                case 158:
                                                case 159: {
                                                    final int k = g4 - 152;
                                                    final bxr bxr = this.f[k];
                                                    this.l.o(2);
                                                    final boolean q = this.l.q();
                                                    final boolean q2 = this.l.q();
                                                    this.l.q();
                                                    final int g6 = this.l.g(3);
                                                    final boolean q3 = this.l.q();
                                                    final int g7 = this.l.g(n4);
                                                    final int g8 = this.l.g(8);
                                                    final int g9 = this.l.g(4);
                                                    int g10 = this.l.g(4);
                                                    this.l.o(2);
                                                    this.l.g(6);
                                                    this.l.o(2);
                                                    int g11 = this.l.g(3);
                                                    int g12 = this.l.g(3);
                                                    bxr.m = true;
                                                    bxr.n = q;
                                                    bxr.u = q2;
                                                    bxr.o = g6;
                                                    bxr.p = q3;
                                                    bxr.q = g7;
                                                    bxr.r = g8;
                                                    bxr.s = g9;
                                                    final int t = bxr.t;
                                                    ++g10;
                                                    if (t != g10) {
                                                        bxr.t = g10;
                                                        while ((q2 && bxr.k.size() >= bxr.t) || bxr.k.size() >= 15) {
                                                            bxr.k.remove(0);
                                                        }
                                                    }
                                                    if (g11 != 0 && bxr.w != g11) {
                                                        bxr.w = g11;
                                                        --g11;
                                                        final int n6 = bxr.g[g11];
                                                        final boolean b = bxr.f[g11];
                                                        final int n7 = bxr.d[g11];
                                                        final int n8 = bxr.e[g11];
                                                        bxr.i(n6, bxr.c[g11]);
                                                    }
                                                    if (g12 != 0 && bxr.x != g12) {
                                                        bxr.x = g12;
                                                        --g12;
                                                        final int n9 = bxr.i[g12];
                                                        final int n10 = bxr.h[g12];
                                                        bxr.g(false, false);
                                                        bxr.h(bxr.a, bxr.j[g12]);
                                                    }
                                                    if (this.k != k) {
                                                        this.k = k;
                                                        this.g = this.f[k];
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 151: {
                                                    if (!this.g.m) {
                                                        this.l.o(32);
                                                        break;
                                                    }
                                                    final int a2 = bxr.a(this.l.g(2), this.l.g(2), this.l.g(2), this.l.g(2));
                                                    this.l.g(2);
                                                    bxr.j(this.l.g(2), this.l.g(2), this.l.g(2));
                                                    this.l.q();
                                                    this.l.q();
                                                    this.l.g(2);
                                                    this.l.g(2);
                                                    final int g13 = this.l.g(2);
                                                    this.l.o(8);
                                                    this.g.i(a2, g13);
                                                    break;
                                                }
                                                case 146: {
                                                    if (!this.g.m) {
                                                        this.l.o(16);
                                                        break;
                                                    }
                                                    this.l.o(4);
                                                    final int g14 = this.l.g(4);
                                                    this.l.o(2);
                                                    this.l.g(6);
                                                    final bxr g15 = this.g;
                                                    if (g15.z != g14) {
                                                        g15.c('\n');
                                                    }
                                                    g15.z = g14;
                                                    break;
                                                }
                                                case 145: {
                                                    if (!this.g.m) {
                                                        this.l.o(24);
                                                        break;
                                                    }
                                                    final int a3 = bxr.a(this.l.g(2), this.l.g(2), this.l.g(2), this.l.g(2));
                                                    final int a4 = bxr.a(this.l.g(2), this.l.g(2), this.l.g(2), this.l.g(2));
                                                    this.l.o(2);
                                                    bxr.j(this.l.g(2), this.l.g(2), this.l.g(2));
                                                    this.g.h(a3, a4);
                                                    break;
                                                }
                                                case 144: {
                                                    if (!this.g.m) {
                                                        this.l.o(16);
                                                        break;
                                                    }
                                                    this.l.g(4);
                                                    this.l.g(2);
                                                    this.l.g(2);
                                                    final boolean q4 = this.l.q();
                                                    final boolean q5 = this.l.q();
                                                    this.l.g(3);
                                                    this.l.g(3);
                                                    this.g.g(q4, q5);
                                                    break;
                                                }
                                                case 143: {
                                                    this.n();
                                                    break;
                                                }
                                                case 141: {
                                                    this.l.o(8);
                                                    break;
                                                }
                                                case 140: {
                                                    for (int n11 = 1; n11 <= 8; ++n11) {
                                                        if (this.l.q()) {
                                                            this.f[8 - n11].e();
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 139: {
                                                    for (int n12 = 1; n12 <= 8; ++n12) {
                                                        if (this.l.q()) {
                                                            final bxr bxr2 = this.f[8 - n12];
                                                            bxr2.n ^= true;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 138: {
                                                    for (int n13 = 1; n13 <= 8; ++n13) {
                                                        if (this.l.q()) {
                                                            this.f[8 - n13].n = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 137: {
                                                    for (int n14 = 1; n14 <= 8; ++n14) {
                                                        if (this.l.q()) {
                                                            this.f[8 - n14].n = true;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 136: {
                                                    for (int n15 = 1; n15 <= 8; ++n15) {
                                                        if (this.l.q()) {
                                                            this.f[8 - n15].d();
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135: {
                                                    final int m = g4 - 128;
                                                    if (this.k != m) {
                                                        this.k = m;
                                                        this.g = this.f[m];
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        else {
                                            if (g4 > 255) {
                                                final StringBuilder sb7 = new StringBuilder("Invalid base command: ");
                                                sb7.append(g4);
                                                bap.c("Cea708Decoder", sb7.toString());
                                                n4 = 7;
                                                continue;
                                            }
                                            this.g.c((char)(g4 & 0xFF));
                                        }
                                        n5 = 1;
                                        n4 = 7;
                                        continue;
                                    }
                                    if (g4 == 127) {
                                        this.g.c('\u266b');
                                    }
                                    else {
                                        this.g.c((char)(g4 & 0xFF));
                                    }
                                }
                                n5 = 1;
                            }
                        }
                        else {
                            final int g16 = this.l.g(8);
                            if (g16 <= 31) {
                                final int n16 = n4 = 7;
                                if (g16 <= 7) {
                                    continue;
                                }
                                if (g16 <= 15) {
                                    this.l.o(8);
                                    n4 = n16;
                                }
                                else if (g16 <= 23) {
                                    this.l.o(16);
                                    n4 = n16;
                                }
                                else {
                                    this.l.o(24);
                                    n4 = n16;
                                }
                            }
                            else {
                                n4 = 7;
                                Label_2615: {
                                    if (g16 <= 127) {
                                        if (g16 != 32) {
                                            if (g16 != 33) {
                                                if (g16 != 37) {
                                                    if (g16 != 42) {
                                                        if (g16 != 44) {
                                                            if (g16 != 63) {
                                                                if (g16 != 57) {
                                                                    if (g16 != 58) {
                                                                        if (g16 != 60) {
                                                                            if (g16 != 61) {
                                                                                switch (g16) {
                                                                                    default: {
                                                                                        switch (g16) {
                                                                                            default: {
                                                                                                final StringBuilder sb8 = new StringBuilder("Invalid G2 character: ");
                                                                                                sb8.append(g16);
                                                                                                bap.c("Cea708Decoder", sb8.toString());
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 127: {
                                                                                                this.g.c('\u250c');
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 126: {
                                                                                                this.g.c('\u2518');
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 125: {
                                                                                                this.g.c('\u2500');
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 124: {
                                                                                                this.g.c('\u2514');
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 123: {
                                                                                                this.g.c('\u2510');
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 122: {
                                                                                                this.g.c('\u2502');
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 121: {
                                                                                                this.g.c('\u215e');
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 120: {
                                                                                                this.g.c('\u215d');
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 119: {
                                                                                                this.g.c('\u215c');
                                                                                                break Label_2615;
                                                                                            }
                                                                                            case 118: {
                                                                                                this.g.c('\u215b');
                                                                                                break Label_2615;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 53: {
                                                                                        this.g.c('\u2022');
                                                                                        break;
                                                                                    }
                                                                                    case 52: {
                                                                                        this.g.c('\u201d');
                                                                                        break;
                                                                                    }
                                                                                    case 51: {
                                                                                        this.g.c('\u201c');
                                                                                        break;
                                                                                    }
                                                                                    case 50: {
                                                                                        this.g.c('\u2019');
                                                                                        break;
                                                                                    }
                                                                                    case 49: {
                                                                                        this.g.c('\u2018');
                                                                                        break;
                                                                                    }
                                                                                    case 48: {
                                                                                        this.g.c('\u2588');
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                this.g.c('\u2120');
                                                                            }
                                                                        }
                                                                        else {
                                                                            this.g.c('\u0153');
                                                                        }
                                                                    }
                                                                    else {
                                                                        this.g.c('\u0161');
                                                                    }
                                                                }
                                                                else {
                                                                    this.g.c('\u2122');
                                                                }
                                                            }
                                                            else {
                                                                this.g.c('\u0178');
                                                            }
                                                        }
                                                        else {
                                                            this.g.c('\u0152');
                                                        }
                                                    }
                                                    else {
                                                        this.g.c('\u0160');
                                                    }
                                                }
                                                else {
                                                    this.g.c('\u2026');
                                                }
                                            }
                                            else {
                                                this.g.c(' ');
                                            }
                                        }
                                        else {
                                            this.g.c(' ');
                                        }
                                    }
                                    else if (g16 <= 159) {
                                        if (g16 <= 135) {
                                            this.l.o(32);
                                            continue;
                                        }
                                        if (g16 <= 143) {
                                            this.l.o(40);
                                            continue;
                                        }
                                        this.l.o(2);
                                        this.l.o(this.l.g(6) * 8);
                                        continue;
                                    }
                                    else {
                                        if (g16 > 255) {
                                            final StringBuilder sb9 = new StringBuilder("Invalid extended command: ");
                                            sb9.append(g16);
                                            bap.c("Cea708Decoder", sb9.toString());
                                            continue;
                                        }
                                        if (g16 == 160) {
                                            this.g.c('\u33c4');
                                        }
                                        else {
                                            final StringBuilder sb10 = new StringBuilder("Invalid G3 character: ");
                                            sb10.append(g16);
                                            bap.c("Cea708Decoder", sb10.toString());
                                            this.g.c('_');
                                        }
                                    }
                                }
                                n5 = 1;
                            }
                        }
                    }
                }
            }
            if (n != 0) {
                this.h = this.l();
            }
            this.j = null;
        }
    }
    
    private final void n() {
        for (int i = 0; i < 8; ++i) {
            this.f[i].e();
        }
    }
    
    public final String c() {
        throw null;
    }
    
    public final void d() {
        super.d();
        this.h = null;
        this.i = null;
        this.k = 0;
        this.g = this.f[0];
        this.n();
        this.j = null;
    }
    
    public final /* bridge */ void f() {
    }
    
    protected final bxi h() {
        final List h = this.h;
        dk.d((Object)(this.i = h));
        return (bxi)new byc(h, 1);
    }
    
    protected final void j(final bxl bxl) {
        final ByteBuffer c = bxl.c;
        dk.d((Object)c);
        this.a.E(c.array(), c.limit());
        while (this.a.a() >= 3) {
            final int n = this.a.i() & 0x7;
            final int n2 = n & 0x3;
            final byte b = (byte)this.a.i();
            final byte b2 = (byte)this.a.i();
            int n3;
            if ((n3 = n2) != 2) {
                if (n2 != 3) {
                    continue;
                }
                n3 = 3;
            }
            if ((n & 0x4) == 0x4) {
                bxs j;
                if (n3 == 3) {
                    this.m();
                    final int d = this.d;
                    final int d2 = (b & 0xC0) >> 6;
                    if (d != -1 && d2 != (0x3 & d + 1)) {
                        this.n();
                        final int d3 = this.d;
                        final StringBuilder sb = new StringBuilder("Sequence number discontinuity. previous=");
                        sb.append(d3);
                        sb.append(" current=");
                        sb.append(d2);
                        bap.c("Cea708Decoder", sb.toString());
                    }
                    this.d = d2;
                    int n4;
                    if ((n4 = (b & 0x3F)) == 0) {
                        n4 = 64;
                    }
                    j = new bxs(n4);
                    this.j = j;
                    j.b[j.c++] = b2;
                }
                else {
                    dk.f(true);
                    j = this.j;
                    if (j == null) {
                        bap.a("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        continue;
                    }
                    final byte[] b3 = j.b;
                    final int c2 = j.c;
                    final int c3 = c2 + 1;
                    j.c = c3;
                    b3[c2] = b;
                    j.c = c3 + 1;
                    b3[c3] = b2;
                }
                final int c4 = j.c;
                final int a = j.a;
                if (c4 != a + a - 1) {
                    continue;
                }
                this.m();
            }
        }
    }
    
    protected final boolean k() {
        return this.h != this.i;
    }
}
