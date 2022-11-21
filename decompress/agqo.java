import java.util.Arrays;
import java.io.IOException;
import java.io.EOFException;
import java.io.Reader;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqo implements Closeable
{
    public final char[] a;
    public int b;
    public int c;
    public long d;
    public int e;
    public String f;
    public int g;
    public String[] h;
    public int[] i;
    private final Reader j;
    private int k;
    private int l;
    private int m;
    private int[] n;
    
    public agqo(final Reader j) {
        this.a = new char[1024];
        this.b = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.c = 0;
        final int[] n = new int[32];
        this.n = n;
        this.g = 1;
        n[0] = 6;
        this.h = new String[32];
        this.i = new int[32];
        this.j = j;
    }
    
    private final int i(final boolean b) {
        final char[] a = this.a;
        int b2 = this.b;
        int n = this.k;
    Label_0016:
        while (true) {
            int b3 = b2;
            int k = n;
            if (b2 == n) {
                this.b = b2;
                if (!this.m(1)) {
                    if (!b) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(this.c()));
                }
                else {
                    b3 = this.b;
                    k = this.k;
                }
            }
            b2 = b3 + 1;
            final char c = a[b3];
            if (c == '\n') {
                ++this.l;
                this.m = b2;
            }
            else if (c != ' ' && c != '\r') {
                if (c != '\t') {
                    if (c == '/') {
                        if ((this.b = b2) == k) {
                            this.b = b2 - 1;
                            final boolean m = this.m(2);
                            ++this.b;
                            if (!m) {
                                return 47;
                            }
                        }
                        this.k();
                        final int b4 = this.b;
                        final char c2 = a[b4];
                        if (c2 == '*') {
                            this.b = b4 + 1;
                            while (this.b + 2 <= this.k || this.m(2)) {
                                final char[] a2 = this.a;
                                final int b5 = this.b;
                                Label_0347: {
                                    if (a2[b5] != '\n') {
                                        for (int i = 0; i < 2; ++i) {
                                            if (this.a[this.b + i] != "*/".charAt(i)) {
                                                break Label_0347;
                                            }
                                        }
                                        b2 = 2 + this.b;
                                        n = this.k;
                                        continue Label_0016;
                                    }
                                    ++this.l;
                                    this.m = b5 + 1;
                                }
                                ++this.b;
                            }
                            throw this.j("Unterminated comment");
                        }
                        if (c2 != '/') {
                            return 47;
                        }
                        this.b = b4 + 1;
                        this.l();
                        b2 = this.b;
                        n = this.k;
                        continue;
                    }
                    else {
                        if (c == '#') {
                            this.b = b2;
                            this.k();
                            this.l();
                            b2 = this.b;
                            n = this.k;
                            continue;
                        }
                        this.b = b2;
                        return c;
                    }
                }
            }
            n = k;
        }
    }
    
    private final IOException j(final String s) {
        throw new agqp(s.concat(this.c()));
    }
    
    private final void k() {
        throw this.j("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
    
    private final void l() {
        while (this.b < this.k || this.m(1)) {
            final char[] a = this.a;
            final int b = this.b;
            final int n = b + 1;
            this.b = n;
            final char c = a[b];
            if (c == '\n') {
                ++this.l;
                this.m = n;
                return;
            }
            if (c == '\r') {
                break;
            }
        }
    }
    
    private final boolean m(int n) {
        final char[] a = this.a;
        final int m = this.m;
        final int b = this.b;
        this.m = m - b;
        final int k = this.k;
        if (k != b) {
            System.arraycopy(a, b, a, 0, this.k = k - b);
        }
        else {
            this.k = 0;
        }
        this.b = 0;
        int i;
        int n2;
        do {
            final Reader j = this.j;
            final int l = this.k;
            final int read = j.read(a, l, 1024 - l);
            if (read == -1) {
                return false;
            }
            i = this.k + read;
            this.k = i;
            n2 = n;
            if (this.l != 0) {
                continue;
            }
            n2 = n;
            if (this.m != 0) {
                continue;
            }
            n2 = n;
            if (i <= 0) {
                continue;
            }
            n2 = n;
            if (a[0] != '\ufeff') {
                continue;
            }
            ++this.b;
            this.m = 1;
            n2 = n + 1;
        } while (i < (n = n2));
        return true;
    }
    
    private final boolean n(final char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c == ',') {
                    return false;
                }
                if (c != '/' && c != '=') {
                    if (c == '{' || c == '}' || c == ':') {
                        return false;
                    }
                    if (c != ';') {
                        switch (c) {
                            default: {
                                return true;
                            }
                            case '\\': {
                                break;
                            }
                            case '[':
                            case ']': {
                                return false;
                            }
                        }
                    }
                }
            }
            this.k();
        }
        return false;
    }
    
    public final int a() {
        final int[] n = this.n;
        final int n2 = this.g - 1;
        final int n3 = n[n2];
        if (n3 == 1) {
            n[n2] = 2;
        }
        else if (n3 == 2) {
            final int i = this.i(true);
            if (i != 44) {
                if (i != 59) {
                    if (i == 93) {
                        return this.c = 4;
                    }
                    throw this.j("Unterminated array");
                }
                else {
                    this.k();
                }
            }
        }
        else if (n3 != 3 && n3 != 5) {
            if (n3 == 4) {
                n[n2] = 5;
                final int j = this.i(true);
                if (j != 58) {
                    if (j != 61) {
                        throw this.j("Expected ':'");
                    }
                    this.k();
                    if (this.b < this.k || this.m(1)) {
                        final char[] a = this.a;
                        final int b = this.b;
                        if (a[b] == '>') {
                            this.b = b + 1;
                        }
                    }
                }
            }
            else if (n3 == 6) {
                n[n2] = 7;
            }
            else if (n3 == 7) {
                if (this.i(false) == -1) {
                    return this.c = 17;
                }
                this.k();
                --this.b;
            }
            else if (n3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        else {
            n[n2] = 4;
            if (n3 == 5) {
                final int k = this.i(true);
                if (k != 44) {
                    if (k != 59) {
                        if (k == 125) {
                            return this.c = 2;
                        }
                        throw this.j("Unterminated object");
                    }
                    else {
                        this.k();
                    }
                }
            }
            final int l = this.i(true);
            if (l == 34) {
                return this.c = 13;
            }
            if (l == 39) {
                this.k();
                return this.c = 12;
            }
            if (l != 125) {
                this.k();
                --this.b;
                if (this.n((char)l)) {
                    return this.c = 14;
                }
                throw this.j("Expected name");
            }
            else {
                if (n3 != 5) {
                    return this.c = 2;
                }
                throw this.j("Expected name");
            }
        }
        final int m = this.i(true);
        if (m == 34) {
            return this.c = 9;
        }
        if (m == 39) {
            this.k();
            return this.c = 8;
        }
        if (m != 44 && m != 59) {
            if (m == 91) {
                return this.c = 3;
            }
            if (m != 93) {
                if (m == 123) {
                    return this.c = 1;
                }
                final int b2 = this.b - 1;
                this.b = b2;
                final char c = this.a[b2];
                int c2 = 0;
                Label_0541: {
                    Label_0520: {
                        String s;
                        String s2;
                        if (c != 't' && c != 'T') {
                            if (c != 'f' && c != 'F') {
                                if (c != 'n' && c != 'N') {
                                    break Label_0520;
                                }
                                s = "NULL";
                                s2 = "null";
                                c2 = 7;
                            }
                            else {
                                s = "FALSE";
                                s2 = "false";
                                c2 = 6;
                            }
                        }
                        else {
                            s = "TRUE";
                            s2 = "true";
                            c2 = 5;
                        }
                        int n4 = 1;
                        while (true) {
                            final int length = s2.length();
                            if (n4 < length) {
                                if (this.b + n4 >= this.k && !this.m(n4 + 1)) {
                                    break;
                                }
                                final char c3 = this.a[this.b + n4];
                                if (c3 != s2.charAt(n4) && c3 != s.charAt(n4)) {
                                    break;
                                }
                                ++n4;
                            }
                            else {
                                if ((this.b + length < this.k || this.m(length + 1)) && this.n(this.a[this.b + length])) {
                                    break;
                                }
                                this.b += length;
                                this.c = c2;
                                break Label_0541;
                            }
                        }
                    }
                    c2 = 0;
                }
                if (c2 != 0) {
                    return c2;
                }
                final char[] a2 = this.a;
                int b3 = this.b;
                int k2 = this.k;
                long n5 = 0L;
                long d = 0L;
                int n6 = 0;
                int e = 0;
                int n7 = 1;
                boolean b4 = false;
                int n12 = 0;
                Label_1066: {
                    while (true) {
                        Label_0875: {
                            char c4 = '\0';
                            Label_0864: {
                                Block_36: {
                                    while (true) {
                                        int b5 = b3;
                                        int k3 = k2;
                                        if (b3 + e == k2) {
                                            if (e == 1024) {
                                                break;
                                            }
                                            if (!this.m(e + 1)) {
                                                break Block_36;
                                            }
                                            b5 = this.b;
                                            k3 = this.k;
                                        }
                                        c4 = a2[b5 + e];
                                        Label_1053: {
                                            if (c4 != '+') {
                                                if (c4 != 'E' && c4 != 'e') {
                                                    if (c4 != '-') {
                                                        if (c4 != '.') {
                                                            if (c4 >= '0' && c4 <= '9') {
                                                                int n9 = 0;
                                                                long n10 = 0L;
                                                                int n11 = 0;
                                                                Label_0848: {
                                                                    if (n6 != 1 && n6 != 0) {
                                                                        if (n6 == 2) {
                                                                            if (d == n5) {
                                                                                break;
                                                                            }
                                                                            final long n8 = 10L * d - (c4 - '0');
                                                                            n7 &= ((d > -922337203685477580L || (d == -922337203685477580L && n8 < d)) ? 1 : 0);
                                                                            d = n8;
                                                                        }
                                                                        else {
                                                                            if (n6 != 3) {
                                                                                if (n6 != 5) {
                                                                                    n9 = n6;
                                                                                    n10 = d;
                                                                                    n11 = n7;
                                                                                    if (n6 != 6) {
                                                                                        break Label_0848;
                                                                                    }
                                                                                }
                                                                                n9 = 7;
                                                                                n10 = d;
                                                                                n11 = n7;
                                                                                break Label_0848;
                                                                            }
                                                                            n6 = 4;
                                                                        }
                                                                        n9 = n6;
                                                                        n10 = d;
                                                                        n11 = n7;
                                                                    }
                                                                    else {
                                                                        n10 = -(c4 - '0');
                                                                        n9 = 2;
                                                                        n11 = n7;
                                                                    }
                                                                }
                                                                n5 = 0L;
                                                                n6 = n9;
                                                                d = n10;
                                                                n7 = n11;
                                                                break Label_1053;
                                                            }
                                                            break Label_0864;
                                                        }
                                                        else {
                                                            if (n6 == 2) {
                                                                n6 = 3;
                                                                break Label_1053;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    else {
                                                        if (n6 == 0) {
                                                            n6 = 1;
                                                            b4 = true;
                                                            break Label_1053;
                                                        }
                                                        if (n6 != 5) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                else {
                                                    if (n6 == 2 || n6 == 4) {
                                                        n6 = 5;
                                                        break Label_1053;
                                                    }
                                                    break;
                                                }
                                            }
                                            else if (n6 != 5) {
                                                break;
                                            }
                                            n6 = 6;
                                        }
                                        ++e;
                                        b3 = b5;
                                        k2 = k3;
                                    }
                                    n12 = 0;
                                    break Label_1066;
                                }
                                break Label_0875;
                                continue;
                            }
                            if (this.n(c4)) {
                                continue;
                            }
                        }
                        int n13;
                        if ((n13 = n6) == 2) {
                            Label_0964: {
                                if (n7 != 0) {
                                    boolean b6;
                                    if (d == Long.MIN_VALUE) {
                                        if (!b4) {
                                            break Label_0964;
                                        }
                                        b6 = true;
                                    }
                                    else {
                                        b6 = b4;
                                    }
                                    Label_0935: {
                                        if (d == 0L) {
                                            if (b6) {
                                                break Label_0964;
                                            }
                                        }
                                        else if (b6) {
                                            break Label_0935;
                                        }
                                        d = -d;
                                    }
                                    this.d = d;
                                    this.b += e;
                                    this.c = 15;
                                    n12 = 15;
                                    break Label_1066;
                                }
                            }
                            n13 = 2;
                        }
                        if (n13 != 2 && n13 != 4 && n13 != 7) {
                            continue;
                        }
                        break;
                    }
                    this.e = e;
                    this.c = 16;
                    n12 = 16;
                }
                if (n12 != 0) {
                    return n12;
                }
                if (this.n(this.a[this.b])) {
                    this.k();
                    return this.c = 10;
                }
                throw this.j("Expected value");
            }
            else if (n3 == 1) {
                return this.c = 4;
            }
        }
        if (n3 != 1 && n3 != 2) {
            throw this.j("Unexpected value");
        }
        this.k();
        --this.b;
        return this.c = 7;
    }
    
    public final String b() {
        final StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.g; ++i) {
            final int n = this.n[i];
            if (n != 1 && n != 2) {
                if (n == 3 || n == 4 || n == 5) {
                    sb.append('.');
                    final String s = this.h[i];
                    if (s != null) {
                        sb.append(s);
                    }
                }
            }
            else {
                final int n2 = this.i[i];
                sb.append('[');
                sb.append(n2);
                sb.append(']');
            }
        }
        return sb.toString();
    }
    
    public final String c() {
        final int l = this.l;
        final int b = this.b;
        final int m = this.m;
        final String b2 = this.b();
        final StringBuilder sb = new StringBuilder(" at line ");
        sb.append(l + 1);
        sb.append(" column ");
        sb.append(b - m + 1);
        sb.append(" path ");
        sb.append(b2);
        return sb.toString();
    }
    
    @Override
    public final void close() {
        this.c = 0;
        this.n[0] = 8;
        this.g = 1;
        this.j.close();
    }
    
    public final String d(final char c) {
        final char[] a = this.a;
        StringBuilder sb = null;
        while (true) {
            int i = this.b;
            int n = this.k;
            int b = i;
            while (i < n) {
                final int m = i + 1;
                final char c2 = a[i];
                if (c2 == c) {
                    this.b = m;
                    final int n2 = m - b - 1;
                    if (sb == null) {
                        return new String(a, b, n2);
                    }
                    sb.append(a, b, n2);
                    return sb.toString();
                }
                else {
                    char c3 = '\n';
                    if (c2 == '\\') {
                        this.b = m;
                        final int n3 = m - b - 1;
                        StringBuilder sb2;
                        if ((sb2 = sb) == null) {
                            final int n4 = n3 + 1;
                            sb2 = new StringBuilder(Math.max(n4 + n4, 16));
                        }
                        sb2.append(a, b, n3);
                        if (this.b == this.k && !this.m(1)) {
                            throw this.j("Unterminated escape sequence");
                        }
                        final char[] a2 = this.a;
                        final int b2 = this.b;
                        final int n5 = b2 + 1;
                        this.b = n5;
                        final char c4 = a2[b2];
                        Label_0534: {
                            if (c4 != '\n') {
                                if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                                    if (c4 == 'b') {
                                        c3 = '\b';
                                        break Label_0534;
                                    }
                                    if (c4 == 'f') {
                                        c3 = '\f';
                                        break Label_0534;
                                    }
                                    if (c4 == 'n') {
                                        break Label_0534;
                                    }
                                    if (c4 == 'r') {
                                        c3 = '\r';
                                        break Label_0534;
                                    }
                                    if (c4 == 't') {
                                        c3 = '\t';
                                        break Label_0534;
                                    }
                                    if (c4 != 'u') {
                                        throw this.j("Invalid escape sequence");
                                    }
                                    if (n5 + 4 > this.k && !this.m(4)) {
                                        throw this.j("Unterminated escape sequence");
                                    }
                                    final int b3 = this.b;
                                    c3 = '\0';
                                    int n6 = b3;
                                    while (true) {
                                        final int n7 = n6;
                                        if (n7 >= b3 + 4) {
                                            this.b += 4;
                                            break Label_0534;
                                        }
                                        final char[] a3 = this.a;
                                        int n8 = a3[n7];
                                        final char c5 = (char)(c3 << 4);
                                        if (n8 >= 48 && n8 <= 57) {
                                            n8 -= 48;
                                        }
                                        else if (n8 >= 97 && n8 <= 102) {
                                            n8 -= 87;
                                        }
                                        else {
                                            if (n8 < 65 || n8 > 70) {
                                                throw new NumberFormatException("\\u".concat(new String(a3, this.b, 4)));
                                            }
                                            n8 -= 55;
                                        }
                                        c3 = (char)(c5 + n8);
                                        n6 = n7 + 1;
                                    }
                                }
                            }
                            else {
                                ++this.l;
                                this.m = n5;
                            }
                            c3 = c4;
                        }
                        sb2.append(c3);
                        b = this.b;
                        n = this.k;
                        i = b;
                        sb = sb2;
                    }
                    else {
                        if (c2 == '\n') {
                            ++this.l;
                            this.m = m;
                        }
                        i = m;
                    }
                }
            }
            StringBuilder sb3;
            if ((sb3 = sb) == null) {
                final int n9 = i - b;
                sb3 = new StringBuilder(Math.max(n9 + n9, 16));
            }
            sb3.append(a, b, i - b);
            this.b = i;
            if (!this.m(1)) {
                throw this.j("Unterminated string");
            }
            sb = sb3;
        }
    }
    
    public final String e() {
        final int n = 0;
        StringBuilder sb = null;
        while (true) {
            do {
                int n2 = 0;
                Label_0169: {
                    Label_0142: {
                        while (true) {
                            final int n3 = this.b + n2;
                            if (n3 < this.k) {
                                final char c = this.a[n3];
                                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                                    break Label_0169;
                                }
                                if (c == '#') {
                                    break Label_0142;
                                }
                                if (c == ',') {
                                    break Label_0169;
                                }
                                if (c == '/' || c == '=') {
                                    break Label_0142;
                                }
                                if (c == '{' || c == '}' || c == ':') {
                                    break Label_0169;
                                }
                                if (c == ';') {
                                    break Label_0142;
                                }
                                switch (c) {
                                    default: {
                                        ++n2;
                                        continue;
                                    }
                                    case 92: {
                                        break Label_0142;
                                    }
                                    case 91:
                                    case 93: {
                                        break Label_0169;
                                    }
                                }
                            }
                            else {
                                if (n2 >= 1024) {
                                    break;
                                }
                                if (this.m(n2 + 1)) {
                                    continue;
                                }
                                break Label_0169;
                            }
                        }
                        StringBuilder sb2;
                        if ((sb2 = sb) == null) {
                            sb2 = new StringBuilder(Math.max(n2, 16));
                        }
                        sb2.append(this.a, this.b, n2);
                        this.b += n2;
                        sb = sb2;
                        continue;
                    }
                    this.k();
                }
                StringBuilder sb2 = sb;
                String string;
                if (sb2 == null) {
                    string = new String(this.a, this.b, n2);
                }
                else {
                    sb2.append(this.a, this.b, n2);
                    string = sb2.toString();
                }
                this.b += n2;
                return string;
            } while (this.m(1));
            int n2 = n;
            continue;
        }
    }
    
    public final void f(final int n) {
        final int g = this.g;
        final int[] n2 = this.n;
        if (g == n2.length) {
            final int n3 = g + g;
            this.n = Arrays.copyOf(n2, n3);
            this.i = Arrays.copyOf(this.i, n3);
            this.h = Arrays.copyOf(this.h, n3);
        }
        this.n[this.g++] = n;
    }
    
    public final boolean g() {
        int n;
        if ((n = this.c) == 0) {
            n = this.a();
        }
        return n != 2 && n != 4 && n != 17;
    }
    
    public final int h() {
        int n;
        if ((n = this.c) == 0) {
            n = this.a();
        }
        switch (n) {
            default: {
                return 10;
            }
            case 15:
            case 16: {
                return 7;
            }
            case 12:
            case 13:
            case 14: {
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
    public final String toString() {
        return String.valueOf(this.getClass().getSimpleName()).concat(this.c());
    }
}
