import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

final class czh extends czg
{
    private static final atzn f;
    private static final atzn g;
    private static final atzn h;
    private static final atzn i;
    private static final atzn j;
    private final atzm k;
    private final atzk l;
    private int m;
    private long n;
    private int o;
    private String p;
    
    static {
        f = atzn.d("'\\");
        g = atzn.d("\"\\");
        h = atzn.d("{}[]:, \n\t\r\f/\\;#=");
        i = atzn.d("\n\r");
        j = atzn.d("*/");
    }
    
    public czh(final atzm k) {
        this.m = 0;
        this.k = k;
        this.l = ((atzt)k).b;
        this.l(6);
    }
    
    private final void A() {
        long n = this.k.e(czh.h);
        final atzk l = this.l;
        if (n == -1L) {
            n = l.b;
        }
        l.l(n);
    }
    
    private final boolean B(final int n) {
        if (n != 9 && n != 10 && n != 12 && n != 13 && n != 32) {
            if (n != 35) {
                if (n == 44) {
                    return false;
                }
                if (n != 47 && n != 61) {
                    if (n == 123 || n == 125 || n == 58) {
                        return false;
                    }
                    if (n != 59) {
                        switch (n) {
                            default: {
                                return true;
                            }
                            case 92: {
                                break;
                            }
                            case 91:
                            case 93: {
                                return false;
                            }
                        }
                    }
                }
            }
            this.x();
        }
        return false;
    }
    
    private final int C(final String s, final eab eab) {
        for (int length = ((String[])eab.b).length, i = 0; i < length; ++i) {
            if (s.equals(((String[])eab.b)[i])) {
                this.m = 0;
                this.d[this.b - 1] = s;
                return i;
            }
        }
        return -1;
    }
    
    private final char s() {
        if (!this.k.m(1L)) {
            throw this.c("Unterminated escape sequence");
        }
        final byte b = this.l.b();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char)b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            final char c = (char)b;
            final StringBuilder sb = new StringBuilder("Invalid escape sequence: \\");
            sb.append(c);
            throw this.c(sb.toString());
        }
        if (this.k.m(4L)) {
            int i = 0;
            char c2 = '\0';
            while (i < 4) {
                int a = this.l.a((long)i);
                final char c3 = (char)(c2 << 4);
                if (a >= 48 && a <= 57) {
                    a -= 48;
                }
                else if (a >= 97 && a <= 102) {
                    a -= 87;
                }
                else {
                    if (a < 65 || a > 70) {
                        throw this.c("\\u".concat(this.l.h(4L)));
                    }
                    a -= 55;
                }
                c2 = (char)(c3 + a);
                ++i;
            }
            this.l.l(4L);
            return c2;
        }
        throw new EOFException("Unterminated escape sequence at path ".concat(this.e()));
    }
    
    private final int t() {
        final int[] c = this.c;
        final int n = this.b - 1;
        final int n2 = c[n];
        final int n3 = 1;
        if (n2 == 1) {
            c[n] = 2;
        }
        else if (n2 == 2) {
            final int u = this.u(true);
            this.l.b();
            if (u != 44) {
                if (u != 59) {
                    if (u == 93) {
                        return this.m = 4;
                    }
                    throw this.c("Unterminated array");
                }
                else {
                    this.x();
                }
            }
        }
        else if (n2 != 3 && n2 != 5) {
            if (n2 == 4) {
                c[n] = 5;
                final int u2 = this.u(true);
                this.l.b();
                if (u2 != 58) {
                    if (u2 != 61) {
                        throw this.c("Expected ':'");
                    }
                    this.x();
                    if (this.k.m(1L) && this.l.a(0L) == 62) {
                        this.l.b();
                    }
                }
            }
            else if (n2 == 6) {
                c[n] = 7;
            }
            else if (n2 == 7) {
                if (this.u(false) == -1) {
                    return this.m = 18;
                }
                this.x();
            }
            else if (n2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        else {
            c[n] = 4;
            if (n2 == 5) {
                final int u3 = this.u(true);
                this.l.b();
                if (u3 != 44) {
                    if (u3 != 59) {
                        if (u3 == 125) {
                            return this.m = 2;
                        }
                        throw this.c("Unterminated object");
                    }
                    else {
                        this.x();
                    }
                }
            }
            final int u4 = this.u(true);
            if (u4 == 34) {
                this.l.b();
                return this.m = 13;
            }
            if (u4 == 39) {
                this.l.b();
                this.x();
                return this.m = 12;
            }
            if (u4 != 125) {
                this.x();
                if (this.B((char)u4)) {
                    return this.m = 14;
                }
                throw this.c("Expected name");
            }
            else {
                if (n2 != 5) {
                    this.l.b();
                    return this.m = 2;
                }
                throw this.c("Expected name");
            }
        }
        final int u5 = this.u(true);
        if (u5 == 34) {
            this.l.b();
            return this.m = 9;
        }
        if (u5 == 39) {
            this.x();
            this.l.b();
            return this.m = 8;
        }
        if (u5 != 44 && u5 != 59) {
            if (u5 == 91) {
                this.l.b();
                return this.m = 3;
            }
            if (u5 != 93) {
                if (u5 == 123) {
                    this.l.b();
                    return this.m = 1;
                }
                final byte a = this.l.a(0L);
                int m = 0;
                Label_0508: {
                    Label_0413: {
                        String s;
                        String s2;
                        if (a != 116 && a != 84) {
                            if (a != 102 && a != 70) {
                                if (a != 110 && a != 78) {
                                    break Label_0413;
                                }
                                s = "NULL";
                                s2 = "null";
                                m = 7;
                            }
                            else {
                                s = "FALSE";
                                s2 = "false";
                                m = 6;
                            }
                        }
                        else {
                            s = "TRUE";
                            s2 = "true";
                            m = 5;
                        }
                        int n4 = 1;
                        int length = 0;
                        Label_0459: {
                            while (true) {
                                length = s2.length();
                                if (n4 >= length) {
                                    break Label_0459;
                                }
                                final atzm k = this.k;
                                final int n5 = n4 + 1;
                                if (!k.m(n5)) {
                                    break;
                                }
                                final byte a2 = this.l.a((long)n4);
                                if (a2 != s2.charAt(n4) && a2 != s.charAt(n4)) {
                                    break;
                                }
                                n4 = n5;
                            }
                            break Label_0413;
                        }
                        if (!this.k.m(length + 1) || !this.B(this.l.a((long)length))) {
                            this.l.l((long)length);
                            this.m = m;
                            break Label_0508;
                        }
                    }
                    m = 0;
                }
                if (m != 0) {
                    return m;
                }
                long n6 = 0L;
                int n7 = 0;
                int o = 0;
                int n8 = 0;
                int n9 = 1;
                int n15 = 0;
                Label_1060: {
                    while (true) {
                        final atzm i = this.k;
                        final int n10 = o + 1;
                        Label_0807: {
                            if (i.m(n10)) {
                                final byte a3 = this.l.a((long)o);
                                long n11 = 0L;
                                int n12 = 0;
                                int n13 = 0;
                                int n14 = 0;
                                Label_1039: {
                                    if (a3 != 43) {
                                        if (a3 != 69 && a3 != 101) {
                                            if (a3 != 45) {
                                                if (a3 != 46) {
                                                    if (a3 >= 48 && a3 <= 57) {
                                                        if (n7 == 1 || n7 == 0) {
                                                            n11 = -(a3 - 48);
                                                            n12 = 2;
                                                            n13 = n8;
                                                            n14 = n9;
                                                            break Label_1039;
                                                        }
                                                        if (n7 == 2) {
                                                            if (n6 == 0L) {
                                                                break;
                                                            }
                                                            n11 = 10L * n6 - (a3 - 48);
                                                            n14 = (n9 & ((n6 > -922337203685477580L || (n6 == -922337203685477580L && n11 < n6)) ? 1 : 0));
                                                            n12 = n7;
                                                            n13 = n8;
                                                            break Label_1039;
                                                        }
                                                        else {
                                                            if (n7 == 3) {
                                                                n12 = 4;
                                                                n11 = n6;
                                                                n13 = n8;
                                                                n14 = n9;
                                                                break Label_1039;
                                                            }
                                                            if (n7 != 5 && n7 != 6) {
                                                                n12 = n7;
                                                                n11 = n6;
                                                                n13 = n8;
                                                                n14 = n9;
                                                                break Label_1039;
                                                            }
                                                            n12 = 7;
                                                            n11 = n6;
                                                            n13 = n8;
                                                            n14 = n9;
                                                            break Label_1039;
                                                        }
                                                    }
                                                    else {
                                                        if (this.B(a3)) {
                                                            break;
                                                        }
                                                        break Label_0807;
                                                    }
                                                }
                                                else {
                                                    if (n7 == 2) {
                                                        n12 = 3;
                                                        n11 = n6;
                                                        n13 = n8;
                                                        n14 = n9;
                                                        break Label_1039;
                                                    }
                                                    break;
                                                }
                                            }
                                            else {
                                                if (n7 == 0) {
                                                    n12 = 1;
                                                    n13 = 1;
                                                    n11 = n6;
                                                    n14 = n9;
                                                    break Label_1039;
                                                }
                                                if (n7 != 5) {
                                                    break;
                                                }
                                            }
                                        }
                                        else {
                                            n12 = 5;
                                            n11 = n6;
                                            n13 = n8;
                                            n14 = n9;
                                            if (n7 == 2) {
                                                break Label_1039;
                                            }
                                            if (n7 == 4) {
                                                n12 = n12;
                                                n11 = n6;
                                                n13 = n8;
                                                n14 = n9;
                                                break Label_1039;
                                            }
                                            break;
                                        }
                                    }
                                    else if (n7 != 5) {
                                        break;
                                    }
                                    n12 = 6;
                                    n14 = n9;
                                    n13 = n8;
                                    n11 = n6;
                                }
                                n7 = n12;
                                o = n10;
                                n6 = n11;
                                n8 = n13;
                                n9 = n14;
                                continue;
                            }
                        }
                        if (n7 == 2) {
                            Label_0889: {
                                if (n9 != 0) {
                                    if (n6 == Long.MIN_VALUE) {
                                        if (n8 == 0) {
                                            break Label_0889;
                                        }
                                        n8 = n3;
                                    }
                                    Label_0862: {
                                        if (n6 == 0L) {
                                            if (n8 != 0) {
                                                break Label_0889;
                                            }
                                        }
                                        else if (n8 != 0) {
                                            break Label_0862;
                                        }
                                        n6 = -n6;
                                    }
                                    this.n = n6;
                                    this.l.l((long)o);
                                    this.m = 16;
                                    n15 = 16;
                                    break Label_1060;
                                }
                            }
                            n7 = 2;
                        }
                        if (n7 == 2 || n7 == 4 || n7 == 7) {
                            this.o = o;
                            this.m = 17;
                            n15 = 17;
                            break Label_1060;
                        }
                        break;
                    }
                    n15 = 0;
                }
                if (n15 != 0) {
                    return n15;
                }
                if (this.B(this.l.a(0L))) {
                    this.x();
                    return this.m = 10;
                }
                throw this.c("Expected value");
            }
            else if (n2 == 1) {
                this.l.b();
                return this.m = 4;
            }
        }
        if (n2 != 1 && n2 != 2) {
            throw this.c("Unexpected value");
        }
        this.x();
        return this.m = 7;
    }
    
    private final int u(final boolean b) {
        while (true) {
            int n = 0;
            while (true) {
                final atzm k = this.k;
                final int n2 = n + 1;
                if (k.m(n2)) {
                    final byte a = this.l.a((long)n);
                    if (a != 10 && a != 32 && a != 13 && a != 9) {
                        this.l.l((long)(n2 - 1));
                        if (a == 47) {
                            if (!this.k.m(2L)) {
                                return 47;
                            }
                            this.x();
                            final byte a2 = this.l.a(1L);
                            if (a2 != 42) {
                                if (a2 != 47) {
                                    return 47;
                                }
                                this.l.b();
                                this.l.b();
                                this.z();
                                break;
                            }
                            else {
                                this.l.b();
                                this.l.b();
                                final atzm i = this.k;
                                final atzn j = czh.j;
                                final long d = i.d(j);
                                final atzk l = this.l;
                                final boolean b2 = d != -1L;
                                long b3;
                                if (b2) {
                                    b3 = d + j.b();
                                }
                                else {
                                    b3 = l.b;
                                }
                                l.l(b3);
                                if (b2) {
                                    break;
                                }
                                throw this.c("Unterminated comment");
                            }
                        }
                        else {
                            if (a == 35) {
                                this.x();
                                this.z();
                                break;
                            }
                            return a;
                        }
                    }
                    else {
                        n = n2;
                    }
                }
                else {
                    if (!b) {
                        return -1;
                    }
                    throw new EOFException("End of input");
                }
            }
        }
    }
    
    private final String v(final atzn atzn) {
        StringBuilder sb = null;
        while (true) {
            final long e = this.k.e(atzn);
            if (e == -1L) {
                throw this.c("Unterminated string");
            }
            if (this.l.a(e) == 92) {
                StringBuilder sb2;
                if ((sb2 = sb) == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.l.h(e));
                this.l.b();
                sb2.append(this.s());
                sb = sb2;
            }
            else {
                if (sb == null) {
                    final String h = this.l.h(e);
                    this.l.b();
                    return h;
                }
                sb.append(this.l.h(e));
                this.l.b();
                return sb.toString();
            }
        }
    }
    
    private final String w() {
        final long e = this.k.e(czh.h);
        String s;
        if (e != -1L) {
            s = this.l.h(e);
        }
        else {
            final atzk l = this.l;
            s = l.g(l.b, atpi.a);
        }
        return s;
    }
    
    private final void x() {
        throw this.c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
    
    private final void y(final atzn atzn) {
        while (true) {
            final long e = this.k.e(atzn);
            if (e == -1L) {
                throw this.c("Unterminated string");
            }
            if (this.l.a(e) != 92) {
                this.l.l(e + 1L);
                return;
            }
            this.l.l(e + 1L);
            this.s();
        }
    }
    
    private final void z() {
        final long e = this.k.e(czh.i);
        final atzk l = this.l;
        long b;
        if (e != -1L) {
            b = e + 1L;
        }
        else {
            b = l.b;
        }
        l.l(b);
    }
    
    @Override
    public final double a() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        if (n == 16) {
            this.m = 0;
            final int[] e = this.e;
            final int n2 = this.b - 1;
            ++e[n2];
            return (double)this.n;
        }
        Label_0329: {
            if (n == 17) {
                this.p = this.l.h((long)this.o);
            }
            else if (n == 9) {
                this.p = this.v(czh.g);
            }
            else if (n == 8) {
                this.p = this.v(czh.f);
            }
            else if (n == 10) {
                this.p = this.w();
            }
            else if (n != 11) {
                break Label_0329;
            }
            this.m = 11;
            try {
                final double double1 = Double.parseDouble(this.p);
                if (!Double.isNaN(double1) && !Double.isInfinite(double1)) {
                    this.p = null;
                    this.m = 0;
                    final int[] e2 = this.e;
                    final int n3 = this.b - 1;
                    ++e2[n3];
                    return double1;
                }
                final String e3 = this.e();
                final StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
                sb.append(double1);
                sb.append(" at path ");
                sb.append(e3);
                throw new czf(sb.toString());
            }
            catch (final NumberFormatException ex) {
                final String p = this.p;
                final String e4 = this.e();
                final StringBuilder sb2 = new StringBuilder("Expected a double but was ");
                sb2.append(p);
                sb2.append(" at path ");
                sb2.append(e4);
                throw new cze(sb2.toString());
            }
        }
        final String d = cix.d(this.q());
        final String e5 = this.e();
        final StringBuilder sb3 = new StringBuilder("Expected a double but was ");
        sb3.append(d);
        sb3.append(" at path ");
        sb3.append(e5);
        throw new cze(sb3.toString());
    }
    
    @Override
    public final int b() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        if (n == 16) {
            final long n2 = this.n;
            final int n3 = (int)n2;
            if (n2 == n3) {
                this.m = 0;
                final int[] e = this.e;
                final int n4 = this.b - 1;
                ++e[n4];
                return n3;
            }
            final String e2 = this.e();
            final StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(n2);
            sb.append(" at path ");
            sb.append(e2);
            throw new cze(sb.toString());
        }
        else {
            while (true) {
                if (n == 17) {
                    this.p = this.l.h((long)this.o);
                    break Label_0309;
                }
                String p;
                if (n != 9) {
                    if (n == 8) {
                        p = this.v(czh.f);
                    }
                    else {
                        if (n == 11) {
                            break Label_0309;
                        }
                        final String d = cix.d(this.q());
                        final String e3 = this.e();
                        final StringBuilder sb2 = new StringBuilder("Expected an int but was ");
                        sb2.append(d);
                        sb2.append(" at path ");
                        sb2.append(e3);
                        throw new cze(sb2.toString());
                    }
                }
                else {
                    p = this.v(czh.g);
                }
                this.p = p;
                try {
                    final int int1 = Integer.parseInt(p);
                    this.m = 0;
                    final int[] e4 = this.e;
                    final int n5 = this.b - 1;
                    ++e4[n5];
                    return int1;
                    this.m = 11;
                    try {
                        final double double1 = Double.parseDouble(this.p);
                        final int n6 = (int)double1;
                        if (n6 == double1) {
                            this.p = null;
                            this.m = 0;
                            final int[] e5 = this.e;
                            final int n7 = this.b - 1;
                            ++e5[n7];
                            return n6;
                        }
                        final String p2 = this.p;
                        final String e6 = this.e();
                        final StringBuilder sb3 = new StringBuilder("Expected an int but was ");
                        sb3.append(p2);
                        sb3.append(" at path ");
                        sb3.append(e6);
                        throw new cze(sb3.toString());
                    }
                    catch (final NumberFormatException ex) {
                        final String p3 = this.p;
                        final String e7 = this.e();
                        final StringBuilder sb4 = new StringBuilder("Expected an int but was ");
                        sb4.append(p3);
                        sb4.append(" at path ");
                        sb4.append(e7);
                        throw new cze(sb4.toString());
                    }
                }
                catch (final NumberFormatException ex2) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.k();
        this.k.close();
    }
    
    @Override
    public final String f() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        String s;
        if (n == 14) {
            s = this.w();
        }
        else if (n == 13) {
            s = this.v(czh.g);
        }
        else if (n == 12) {
            s = this.v(czh.f);
        }
        else {
            if (n != 15) {
                final String d = cix.d(this.q());
                final String e = this.e();
                final StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(d);
                sb.append(" at path ");
                sb.append(e);
                throw new cze(sb.toString());
            }
            s = this.p;
        }
        this.m = 0;
        return this.d[this.b - 1] = s;
    }
    
    @Override
    public final String g() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        String s;
        if (n == 10) {
            s = this.w();
        }
        else if (n == 9) {
            s = this.v(czh.g);
        }
        else if (n == 8) {
            s = this.v(czh.f);
        }
        else if (n == 11) {
            s = this.p;
            this.p = null;
        }
        else if (n == 16) {
            s = Long.toString(this.n);
        }
        else {
            if (n != 17) {
                final String d = cix.d(this.q());
                final String e = this.e();
                final StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(d);
                sb.append(" at path ");
                sb.append(e);
                throw new cze(sb.toString());
            }
            s = this.l.h((long)this.o);
        }
        this.m = 0;
        final int[] e2 = this.e;
        final int n2 = this.b - 1;
        ++e2[n2];
        return s;
    }
    
    @Override
    public final void h() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        if (n == 3) {
            this.l(1);
            this.e[this.b - 1] = 0;
            this.m = 0;
            return;
        }
        final String d = cix.d(this.q());
        final String e = this.e();
        final StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(d);
        sb.append(" at path ");
        sb.append(e);
        throw new cze(sb.toString());
    }
    
    @Override
    public final void i() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        if (n == 1) {
            this.l(3);
            this.m = 0;
            return;
        }
        final String d = cix.d(this.q());
        final String e = this.e();
        final StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(d);
        sb.append(" at path ");
        sb.append(e);
        throw new cze(sb.toString());
    }
    
    @Override
    public final void j() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        if (n == 4) {
            int b = this.b - 1;
            this.b = b;
            final int[] e = this.e;
            --b;
            ++e[b];
            this.m = 0;
            return;
        }
        final String d = cix.d(this.q());
        final String e2 = this.e();
        final StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(d);
        sb.append(" at path ");
        sb.append(e2);
        throw new cze(sb.toString());
    }
    
    @Override
    public final void k() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        if (n == 2) {
            int b = this.b - 1;
            this.b = b;
            this.d[b] = null;
            final int[] e = this.e;
            --b;
            ++e[b];
            this.m = 0;
            return;
        }
        final String d = cix.d(this.q());
        final String e2 = this.e();
        final StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(d);
        sb.append(" at path ");
        sb.append(e2);
        throw new cze(sb.toString());
    }
    
    @Override
    public final void m() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        if (n == 14) {
            this.A();
        }
        else if (n == 13) {
            this.y(czh.g);
        }
        else if (n == 12) {
            this.y(czh.f);
        }
        else if (n != 15) {
            final String d = cix.d(this.q());
            final String e = this.e();
            final StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(d);
            sb.append(" at path ");
            sb.append(e);
            throw new cze(sb.toString());
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }
    
    @Override
    public final void n() {
        int n = 0;
        int i = 0;
        do {
            int n2;
            if ((n2 = this.m) == 0) {
                n2 = this.t();
            }
            Label_0404: {
                if (n2 == 3) {
                    this.l(1);
                }
                else if (n2 == 1) {
                    this.l(3);
                }
                else if (n2 == 4) {
                    i = n - 1;
                    if (i >= 0) {
                        --this.b;
                        break Label_0404;
                    }
                    final String d = cix.d(this.q());
                    final String e = this.e();
                    final StringBuilder sb = new StringBuilder("Expected a value but was ");
                    sb.append(d);
                    sb.append(" at path ");
                    sb.append(e);
                    throw new cze(sb.toString());
                }
                else if (n2 == 2) {
                    i = n - 1;
                    if (i >= 0) {
                        --this.b;
                        break Label_0404;
                    }
                    final String d2 = cix.d(this.q());
                    final String e2 = this.e();
                    final StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                    sb2.append(d2);
                    sb2.append(" at path ");
                    sb2.append(e2);
                    throw new cze(sb2.toString());
                }
                else {
                    if (n2 == 14 || n2 == 10) {
                        this.A();
                        i = n;
                        break Label_0404;
                    }
                    if (n2 == 9 || n2 == 13) {
                        this.y(czh.g);
                        i = n;
                        break Label_0404;
                    }
                    if (n2 == 8 || n2 == 12) {
                        this.y(czh.f);
                        i = n;
                        break Label_0404;
                    }
                    if (n2 == 17) {
                        this.l.l((long)this.o);
                        i = n;
                        break Label_0404;
                    }
                    if (n2 != 18) {
                        i = n;
                        break Label_0404;
                    }
                    final String d3 = cix.d(this.q());
                    final String e3 = this.e();
                    final StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                    sb3.append(d3);
                    sb3.append(" at path ");
                    sb3.append(e3);
                    throw new cze(sb3.toString());
                }
                i = n + 1;
            }
            this.m = 0;
            n = i;
        } while (i != 0);
        final int[] e4 = this.e;
        final int n3 = this.b - 1;
        ++e4[n3];
        this.d[n3] = "null";
    }
    
    @Override
    public final boolean o() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        return n != 2 && n != 4 && n != 18;
    }
    
    @Override
    public final boolean p() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        if (n == 5) {
            this.m = 0;
            final int[] e = this.e;
            final int n2 = this.b - 1;
            ++e[n2];
            return true;
        }
        if (n == 6) {
            this.m = 0;
            final int[] e2 = this.e;
            final int n3 = this.b - 1;
            ++e2[n3];
            return false;
        }
        final String d = cix.d(this.q());
        final String e3 = this.e();
        final StringBuilder sb = new StringBuilder("Expected a boolean but was ");
        sb.append(d);
        sb.append(" at path ");
        sb.append(e3);
        throw new cze(sb.toString());
    }
    
    @Override
    public final int q() {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        switch (n) {
            default: {
                return 10;
            }
            case 16:
            case 17: {
                return 7;
            }
            case 12:
            case 13:
            case 14:
            case 15: {
                return 5;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                return 6;
            }
            case 7: {
                return 9;
            }
            case 5:
            case 6: {
                return 8;
            }
            case 4: {
                return 2;
            }
            case 3: {
                return 1;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
        }
    }
    
    @Override
    public final int r(final eab eab) {
        int n;
        if ((n = this.m) == 0) {
            n = this.t();
        }
        if (n < 12 || n > 15) {
            return -1;
        }
        if (n == 15) {
            return this.C(this.p, eab);
        }
        final atzm k = this.k;
        final Object a = eab.a;
        final atzt atzt = (atzt)k;
        if (!atzt.c) {
            while (true) {
                do {
                    final atzk b = atzt.b;
                    final atzr atzr = (atzr)a;
                    int b2 = atzz.b(b, atzr);
                    if (b2 != -2) {
                        if (b2 != -1) {
                            atzt.b.l((long)atzr.b[b2].b());
                        }
                        else {
                            b2 = -1;
                        }
                        if (b2 != -1) {
                            this.m = 0;
                            this.d[this.b - 1] = ((String[])eab.b)[b2];
                            return b2;
                        }
                        final String s = this.d[this.b - 1];
                        final String f = this.f();
                        final int c = this.C(f, eab);
                        if (c == -1) {
                            this.m = 15;
                            this.p = f;
                            this.d[this.b - 1] = s;
                            return -1;
                        }
                        return c;
                    }
                } while (atzt.a.t(atzt.b) != -1L);
                continue;
            }
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public final String toString() {
        final String string = this.k.toString();
        final StringBuilder sb = new StringBuilder("JsonReader(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
