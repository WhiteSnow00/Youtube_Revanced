import java.util.Map;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicReference;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqti implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final String a;
    
    public aqti(final String a) {
        this.a = a;
    }
    
    public static aqti a(String string, final String s) {
        final aqth aqth = new aqth(string);
        final int b = aqth.b;
        int n = 5;
        aqtl aqtl;
        if ((b & 0x2) != 0x0) {
            final String a = aqth.a;
            aqtl = new aqtl(3);
            aqtl.b = b;
            final int length = a.length();
            final int[] d = new int[a.codePointCount(0, length)];
            int codePoint;
            for (int i = 0, n2 = 0; i < length; i += Character.charCount(codePoint), ++n2) {
                codePoint = a.codePointAt(i);
                d[n2] = codePoint;
            }
            aqtl.d = d;
        }
        else {
            final aqtg aqtg = new aqtg(aqth.a);
            int n3 = -1;
            int n4 = -1;
            int n5 = -1;
            int n6 = -1;
        Label_0863_Outer:
            while (aqtg.i()) {
                final int a2 = aqtg.a();
            Label_0863:
                while (true) {
                    Label_2379: {
                        if (a2 == 36) {
                            if ((aqth.b & 0x10) != 0x0) {
                                final aqtl m = aqth.m(10);
                                m.b |= 0x100;
                            }
                            else {
                                aqth.m(8);
                            }
                            aqtg.e(1);
                            break Label_2379;
                        }
                        while (true) {
                            if (a2 != 46) {
                                Label_2287: {
                                    Label_2285: {
                                        if (a2 != 63) {
                                            if (a2 == 94) {
                                                if ((aqth.b & 0x10) != 0x0) {
                                                    aqth.m(9);
                                                }
                                                else {
                                                    aqth.m(7);
                                                }
                                                aqtg.e(1);
                                                break Label_2379;
                                            }
                                            if (a2 == 91) {
                                                final int a3 = aqtg.a;
                                                aqtg.e(1);
                                                final aqtl l = aqth.l(4);
                                                l.b = aqth.b;
                                                final aqta aqta = new aqta();
                                                int n7;
                                                if (aqtg.i() && aqtg.g('^')) {
                                                    aqtg.e(1);
                                                    if ((aqth.b & 0x4) == 0x0) {
                                                        aqta.e(10, 10);
                                                    }
                                                    n7 = -1;
                                                }
                                                else {
                                                    n7 = 1;
                                                }
                                                for (int n8 = 1; !aqtg.i() || aqtg.a() != 93 || n8 != 0; n8 = 0) {
                                                    if (aqtg.i() && aqtg.g('-') && (aqth.b & 0x40) == 0x0 && n8 == 0) {
                                                        final String d2 = aqtg.d();
                                                        if (d2.equals("-") || !d2.startsWith("-]")) {
                                                            aqtg.a = a3;
                                                            throw new aqtj("invalid character class range", aqtg.d());
                                                        }
                                                    }
                                                    final int a4 = aqtg.a;
                                                    if (aqtg.h("[:")) {
                                                        final String d3 = aqtg.d();
                                                        final int index = d3.indexOf(":]");
                                                        if (index < 0) {
                                                            aqtg.a = a4;
                                                        }
                                                        else {
                                                            final String substring = d3.substring(0, index + 2);
                                                            aqtg.f(substring);
                                                            final aqtb aqtb = aqtb.b.get(substring);
                                                            if (aqtb != null) {
                                                                aqta.d(aqtb, 0x1 == (aqth.b & 0x1));
                                                                continue Label_0863_Outer;
                                                            }
                                                            throw new aqtj("invalid character class range", substring);
                                                        }
                                                    }
                                                    if (!aqth.i(aqtg, aqta)) {
                                                        if (!aqth.h(aqtg, aqta)) {
                                                            aqtg.a = a4;
                                                            final int a5 = aqth.a(aqtg, a3);
                                                            int a6 = 0;
                                                            Label_2150: {
                                                                if (aqtg.i() && aqtg.g('-')) {
                                                                    aqtg.e(1);
                                                                    if (aqtg.i() && aqtg.g(']')) {
                                                                        aqtg.e(-1);
                                                                    }
                                                                    else {
                                                                        a6 = aqth.a(aqtg, a3);
                                                                        if (a6 >= a5) {
                                                                            break Label_2150;
                                                                        }
                                                                        throw new aqtj("invalid character class range", aqtg.c(a4));
                                                                    }
                                                                }
                                                                a6 = a5;
                                                            }
                                                            if ((aqth.b & 0x1) == 0x0) {
                                                                aqta.e(a5, a6);
                                                            }
                                                            else {
                                                                aqta.i(a5, a6);
                                                            }
                                                        }
                                                    }
                                                }
                                                aqtg.e(1);
                                                aqta.g();
                                                if (n7 < 0) {
                                                    int j = 0;
                                                    int b2 = 0;
                                                    int n9 = 0;
                                                    while (j < aqta.b) {
                                                        final int[] a7 = aqta.a;
                                                        final int n10 = a7[j];
                                                        final int n11 = a7[j + 1];
                                                        final int n12 = n10 - 1;
                                                        int n13 = b2;
                                                        if (n9 <= n12) {
                                                            a7[b2] = n9;
                                                            a7[b2 + 1] = n12;
                                                            n13 = b2 + 2;
                                                        }
                                                        n9 = n11 + 1;
                                                        j += 2;
                                                        b2 = n13;
                                                    }
                                                    aqta.b = b2;
                                                    if (n9 <= 1114111) {
                                                        aqta.a(b2 + 2);
                                                        final int[] a8 = aqta.a;
                                                        final int b3 = aqta.b;
                                                        final int b4 = b3 + 1;
                                                        aqta.b = b4;
                                                        a8[b3] = n9;
                                                        aqta.b = b4 + 1;
                                                        a8[b4] = 1114111;
                                                    }
                                                }
                                                l.d = aqta.b();
                                                aqth.e(l);
                                                break Label_2379;
                                            }
                                            if (a2 != 92) {
                                                if (a2 != 123) {
                                                    if (a2 == 124) {
                                                        aqth.p();
                                                        if (!aqth.j()) {
                                                            aqth.m(21);
                                                        }
                                                        aqtg.e(1);
                                                        break Label_0863;
                                                    }
                                                    switch (a2) {
                                                        default: {
                                                            aqth.f(aqtg.b());
                                                            break Label_0245;
                                                        }
                                                        case 42:
                                                        case 43: {
                                                            break;
                                                        }
                                                        case 41: {
                                                            aqth.p();
                                                            if (aqth.j()) {
                                                                aqth.d();
                                                            }
                                                            aqth.o();
                                                            if (aqth.c.size() < 2) {
                                                                throw new aqtj("regexp/syntax: internal error", "stack underflow");
                                                            }
                                                            final aqtl d4 = aqth.d();
                                                            final aqtl d5 = aqth.d();
                                                            if (d5.j == 20) {
                                                                aqth.b = d5.b;
                                                                if (d5.g == 0) {
                                                                    aqth.e(d4);
                                                                }
                                                                else {
                                                                    d5.j = 13;
                                                                    d5.c = new aqtl[] { d4 };
                                                                    aqth.e(d5);
                                                                }
                                                                aqtg.e(1);
                                                                break Label_0245;
                                                            }
                                                            throw new aqtj("missing closing )", aqth.a);
                                                        }
                                                        case 40: {
                                                            if ((aqth.b & 0x40) == 0x0 || !aqtg.h("(?")) {
                                                                final aqtl k = aqth.m(20);
                                                                final int n14 = aqth.d + 1;
                                                                aqth.d = n14;
                                                                k.g = n14;
                                                                aqtg.e(1);
                                                                break Label_0863;
                                                            }
                                                            final int a9 = aqtg.a;
                                                            final String d6 = aqtg.d();
                                                            if (!d6.startsWith("(?P<")) {
                                                                aqtg.e(2);
                                                                int b5 = aqth.b;
                                                                int n15 = 1;
                                                                boolean b6 = false;
                                                                while (aqtg.i()) {
                                                                    final int b7 = aqtg.b();
                                                                    Label_0770: {
                                                                        if (b7 != 41) {
                                                                            if (b7 != 45) {
                                                                                if (b7 == 58) {
                                                                                    break Label_0770;
                                                                                }
                                                                                if (b7 != 85) {
                                                                                    if (b7 != 105) {
                                                                                        if (b7 != 109) {
                                                                                            if (b7 != 115) {
                                                                                                break;
                                                                                            }
                                                                                            b5 |= 0x8;
                                                                                        }
                                                                                        else {
                                                                                            b5 &= 0xFFFFFFEF;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        b5 |= 0x1;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    b5 |= 0x20;
                                                                                }
                                                                                b6 = true;
                                                                            }
                                                                            else {
                                                                                if (n15 < 0) {
                                                                                    break;
                                                                                }
                                                                                b5 ^= -1;
                                                                                n15 = -1;
                                                                                b6 = false;
                                                                            }
                                                                            continue Label_0863_Outer;
                                                                        }
                                                                    }
                                                                    int b8 = b5;
                                                                    if (n15 < 0) {
                                                                        if (!b6) {
                                                                            break;
                                                                        }
                                                                        b8 = ~b5;
                                                                    }
                                                                    if (b7 == 58) {
                                                                        aqth.m(20);
                                                                    }
                                                                    aqth.b = b8;
                                                                    break Label_0863;
                                                                }
                                                                throw new aqtj("invalid or unsupported Perl syntax", aqtg.c(a9));
                                                            }
                                                            final int index2 = d6.indexOf(62);
                                                            if (index2 >= 0) {
                                                                final String substring2 = d6.substring(4, index2);
                                                                aqtg.f(substring2);
                                                                aqtg.e(n);
                                                                if (!substring2.isEmpty()) {
                                                                    for (int n16 = 0; n16 < substring2.length(); ++n16) {
                                                                        final char char1 = substring2.charAt(n16);
                                                                        if (char1 != '_' && !aqtn.c(char1)) {
                                                                            throw new aqtj("invalid named capture", d6.substring(0, index2));
                                                                        }
                                                                    }
                                                                    final aqtl m2 = aqth.m(20);
                                                                    final int n17 = aqth.d + 1;
                                                                    aqth.d = n17;
                                                                    m2.g = n17;
                                                                    if (aqth.e.put(substring2, n17) == null) {
                                                                        m2.h = substring2;
                                                                        break Label_0245;
                                                                    }
                                                                    throw new aqtj("duplicate capture group name", substring2);
                                                                }
                                                                throw new aqtj("invalid named capture", d6.substring(0, index2));
                                                            }
                                                            throw new aqtj("invalid named capture", d6);
                                                        }
                                                    }
                                                }
                                                else {
                                                    final int a10 = aqtg.a;
                                                    int n18 = 0;
                                                    Label_1104: {
                                                        Label_1102: {
                                                            if (aqtg.i()) {
                                                                if (aqtg.g('{')) {
                                                                    aqtg.e(1);
                                                                    final int c = aqth.c(aqtg);
                                                                    if (c != n3) {
                                                                        if (aqtg.i()) {
                                                                            int c2;
                                                                            if (!aqtg.g(',')) {
                                                                                c2 = c;
                                                                            }
                                                                            else {
                                                                                aqtg.e(1);
                                                                                if (!aqtg.i()) {
                                                                                    break Label_1102;
                                                                                }
                                                                                if (aqtg.g('}')) {
                                                                                    c2 = -1;
                                                                                }
                                                                                else if ((c2 = aqth.c(aqtg)) == n3) {
                                                                                    break Label_1102;
                                                                                }
                                                                            }
                                                                            if (aqtg.i()) {
                                                                                if (aqtg.g('}')) {
                                                                                    aqtg.e(1);
                                                                                    if (c >= 0 && c <= 1000 && c2 != -2 && c2 <= 1000 && (c2 < 0 || c <= c2)) {
                                                                                        n18 = (c << 16 | (char)c2);
                                                                                        break Label_1104;
                                                                                    }
                                                                                    throw new aqtj("invalid repeat count", aqtg.c(a10));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        n18 = -1;
                                                    }
                                                    if (n18 < 0) {
                                                        aqtg.a = a10;
                                                        aqth.f(aqtg.b());
                                                        n4 = a10;
                                                        break Label_2287;
                                                    }
                                                    n5 = n18 >> 16;
                                                    n6 = (short)(char)n18;
                                                    aqth.n(17, n5, n6, a10, aqtg, n4);
                                                    n4 = a10;
                                                    break Label_2285;
                                                }
                                            }
                                            else {
                                                final int a11 = aqtg.a;
                                                aqtg.e(1);
                                                if ((aqth.b & 0x40) != 0x0 && aqtg.i()) {
                                                    final int b9 = aqtg.b();
                                                    if (b9 == 81) {
                                                        final String d7 = aqtg.d();
                                                        final int index3 = d7.indexOf("\\E");
                                                        String substring3 = d7;
                                                        if (index3 >= 0) {
                                                            substring3 = d7.substring(0, index3);
                                                        }
                                                        aqtg.f(substring3);
                                                        aqtg.f("\\E");
                                                        for (int n19 = 0; n19 < substring3.length(); ++n19) {
                                                            aqth.f(substring3.charAt(n19));
                                                        }
                                                        break Label_2379;
                                                    }
                                                    if (b9 == 98) {
                                                        aqth.m(11);
                                                        break Label_2379;
                                                    }
                                                    if (b9 == 122) {
                                                        aqth.m(10);
                                                        break Label_2379;
                                                    }
                                                    switch (b9) {
                                                        default: {
                                                            aqtg.a = a11;
                                                            break;
                                                        }
                                                        case 67: {
                                                            throw new aqtj("invalid escape sequence", "\\C");
                                                        }
                                                        case 66: {
                                                            aqth.m(12);
                                                            break Label_2379;
                                                        }
                                                        case 65: {
                                                            aqth.m(9);
                                                            break Label_2379;
                                                        }
                                                    }
                                                }
                                                final aqtl l2 = aqth.l(4);
                                                l2.b = aqth.b;
                                                if (aqtg.h("\\p") || aqtg.h("\\P")) {
                                                    final aqta aqta2 = new aqta();
                                                    if (aqth.i(aqtg, aqta2)) {
                                                        l2.d = aqta2.b();
                                                        aqth.e(l2);
                                                        break Label_2379;
                                                    }
                                                }
                                                final aqta aqta3 = new aqta();
                                                if (aqth.h(aqtg, aqta3)) {
                                                    l2.d = aqta3.b();
                                                    aqth.e(l2);
                                                    break Label_2379;
                                                }
                                                aqtg.a = a11;
                                                aqth.g(l2);
                                                aqth.f(aqth.b(aqtg));
                                                break Label_2379;
                                            }
                                        }
                                        final int a12 = aqtg.a;
                                        final int b10 = aqtg.b();
                                        int n20;
                                        if (b10 != 42) {
                                            if (b10 != 43) {
                                                if (b10 != 63) {
                                                    n20 = 0;
                                                }
                                                else {
                                                    n20 = 16;
                                                }
                                            }
                                            else {
                                                n20 = 15;
                                            }
                                        }
                                        else {
                                            n20 = 14;
                                        }
                                        aqth.n(n20, n5, n6, a12, aqtg, n4);
                                        n4 = a12;
                                    }
                                    n3 = -1;
                                }
                                n = 5;
                                continue Label_0863_Outer;
                            }
                            if ((aqth.b & 0x8) != 0x0) {
                                aqth.m(6);
                            }
                            else {
                                aqth.m(5);
                            }
                            aqtg.e(1);
                            break Label_2379;
                            n4 = -1;
                            continue Label_0863_Outer;
                            n = 5;
                            continue;
                        }
                    }
                    n3 = -1;
                    continue Label_0863;
                }
            }
            aqth.p();
            if (aqth.j()) {
                aqth.d();
            }
            aqth.o();
            if (aqth.c.size() != 1) {
                throw new aqtj("missing closing )", aqth.a);
            }
            ((aqtl)aqth.c.get(0)).i = aqth.e;
            aqtl = aqth.c.get(0);
        }
        aqtl.a();
        final aqtl a13 = aqsz.a(aqtl);
        final int a14 = aqtd.a;
        final aqtk aqtk = new aqtk();
        aqtd.b(5, aqtk);
        final aqtc a15 = aqtd.a(a13, aqtk);
        aqtk.d(a15.b, aqtd.b(6, aqtk).a);
        aqtk.c = a15.a;
        new AtomicReference();
        int n21 = aqtk.c;
        while (true) {
            final aqte aqte = aqtk.a[n21];
            final int a16 = aqte.a;
            if (a16 != 3) {
                if (a16 != 4) {
                    if (a16 != 7) {
                        final StringBuilder sb = new StringBuilder();
                        final aqte c3 = aqtk.c(aqtk.c);
                        if (aqte.a(c3.a)) {
                            aqte c4 = c3;
                            if (c3.d.length == 1) {
                                while (aqte.a(c4.a)) {
                                    final int[] d8 = c4.d;
                                    if (d8.length != 1 || (c4.c & 0x1) != 0x0) {
                                        break;
                                    }
                                    sb.appendCodePoint(d8[0]);
                                    c4 = aqtk.c(c4.b);
                                }
                            }
                        }
                        string = sb.toString();
                        try {
                            string.getBytes("UTF-8");
                            if (!string.isEmpty()) {
                                string.codePointAt(0);
                            }
                            final Map i2 = a13.i;
                            return new aqti(s);
                        }
                        catch (final UnsupportedEncodingException ex) {
                            throw new IllegalStateException("can't happen");
                        }
                    }
                }
                else {
                    final int c5 = aqte.c;
                }
            }
            n21 = aqte.b;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                if (this.a.equals(((aqti)o).a)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
    
    Object readResolve() {
        final String a = this.a;
        return a(a, a);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
