import java.util.Arrays;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtl
{
    static final aqtl[] a;
    public int b;
    public aqtl[] c;
    public int[] d;
    public int e;
    public int f;
    int g;
    String h;
    Map i;
    public int j;
    
    static {
        a = new aqtl[0];
    }
    
    public aqtl(final int j) {
        this.j = j;
    }
    
    public aqtl(final aqtl aqtl) {
        this.j = aqtl.j;
        this.b = aqtl.b;
        this.c = aqtl.c;
        this.d = aqtl.d;
        this.e = aqtl.e;
        this.f = aqtl.f;
        this.g = aqtl.g;
        this.h = aqtl.h;
        this.i = aqtl.i;
    }
    
    private final void b(final StringBuilder sb) {
        final int j = this.j;
        Label_1190: {
            if (j == 0) {
                break Label_1190;
            }
            final int n = 0;
            final int n2 = 0;
            int n3 = 0;
            final int n4 = 0;
            String s;
            aqtl[] c;
            int length;
            String s2;
            aqtl aqtl;
            aqtl[] c2;
            aqtl aqtl2;
            aqtl aqtl3;
            int l;
            int m;
            int f;
            String h;
            aqtl aqtl4 = null;
            int n5;
            int[] d;
            int length3;
            int[] d2;
            int n6;
            int[] d3;
            int n7;
            int n8;
            int[] d4;
            int n9;
            int n10;
            int length4;
            Label_0993_Outer:Label_0819_Outer:Label_0892_Outer:Block_28_Outer:
            while (true) {
                Label_1037: {
                    switch (j - 1) {
                        default: {
                            switch (j) {
                                default: {
                                    s = "VERTICAL_BAR";
                                    break Label_1182;
                                }
                                case 20: {
                                    break Label_1037;
                                }
                                case 19: {
                                    break Label_1037;
                                }
                                case 18: {
                                    break Label_1037;
                                }
                                case 17: {
                                    break Label_1037;
                                }
                                case 16: {
                                    break Label_1037;
                                }
                                case 15: {
                                    break Label_1037;
                                }
                                case 14: {
                                    break Label_1037;
                                }
                                case 13: {
                                    break Label_1037;
                                }
                                case 12: {
                                    break Label_1037;
                                }
                                case 11: {
                                    break Label_1037;
                                }
                                case 10: {
                                    break Label_1037;
                                }
                                case 9: {
                                    break Label_1037;
                                }
                                case 8: {
                                    break Label_1037;
                                }
                                case 7: {
                                    break Label_1037;
                                }
                                case 6: {
                                    break Label_1037;
                                }
                                case 5: {
                                    break Label_1037;
                                }
                                case 4: {
                                    break Label_1037;
                                }
                                case 3: {
                                    break Label_1037;
                                }
                                case 2: {
                                    break Label_1037;
                                }
                                case 1: {
                                    break Label_1037;
                                }
                            }
                            break;
                        }
                        case 18: {
                            c = this.c;
                            length = c.length;
                            s2 = "";
                            for (int i = n4; i < length; ++i, s2 = "|") {
                                aqtl = c[i];
                                sb.append(s2);
                                aqtl.b(sb);
                            }
                            return;
                        }
                        case 17: {
                            c2 = this.c;
                            for (int length2 = c2.length, k = n; k < length2; ++k) {
                                aqtl2 = c2[k];
                                if (aqtl2.j == 19) {
                                    sb.append("(?:");
                                    aqtl2.b(sb);
                                    sb.append(')');
                                }
                                else {
                                    aqtl2.b(sb);
                                }
                            }
                            return;
                        }
                        case 13:
                        case 14:
                        case 15:
                        case 16: {
                            aqtl3 = this.c[0];
                            l = aqtl3.j;
                            if (l == 0) {
                                throw null;
                            }
                            if (l - 1 <= 12 && (l != 3 || aqtl3.d.length <= 1)) {
                                aqtl3.b(sb);
                            }
                            else {
                                sb.append("(?:");
                                aqtl3.b(sb);
                                sb.append(')');
                            }
                            m = this.j;
                            if (m == 0) {
                                throw null;
                            }
                            switch (m - 1) {
                                case 16: {
                                    sb.append('{');
                                    sb.append(this.e);
                                    if (this.e != this.f) {
                                        sb.append(',');
                                        f = this.f;
                                        if (f >= 0) {
                                            sb.append(f);
                                        }
                                    }
                                    sb.append('}');
                                    break;
                                }
                                case 15: {
                                    sb.append('?');
                                    break;
                                }
                                case 14: {
                                    sb.append('+');
                                    break;
                                }
                                case 13: {
                                    sb.append('*');
                                    break;
                                }
                            }
                            if ((this.b & 0x20) != 0x0) {
                                sb.append('?');
                            }
                            return;
                        }
                        case 12: {
                            h = this.h;
                            if (h != null && !h.isEmpty()) {
                                sb.append("(?P<");
                                sb.append(this.h);
                                sb.append(">");
                            }
                            else {
                                sb.append('(');
                            }
                            aqtl4 = this.c[0];
                            if (aqtl4.j != 2) {
                                break;
                            }
                            break Label_1037;
                        }
                        case 11: {
                            break Label_1037;
                        }
                        case 10: {
                            break Label_1037;
                        }
                        case 9: {
                            break Label_1037;
                        }
                        case 8: {
                            break Label_1037;
                        }
                        case 7: {
                            break Label_1037;
                        }
                        case 6: {
                            break Label_1037;
                        }
                        case 5: {
                            break Label_1037;
                        }
                        case 4: {
                            break Label_1037;
                        }
                        case 3: {
                            break Label_1037;
                        }
                        case 2: {
                            break Label_1037;
                        }
                        case 1: {
                            break Label_1037;
                        }
                        case 0: {
                            break Label_1037;
                        }
                    }
                    try {
                        aqtl4.b(sb);
                        sb.append(')');
                        return;
                        s = "ALTERNATE";
                        break Label_1182;
                        s = "PLUS";
                        break Label_1182;
                        Label_0787: {
                            n5 = n2;
                        }
                        iftrue(Label_0892:)(d[0] != 0);
                    Label_0953_Outer:
                        while (true) {
                            while (true) {
                                Block_25: {
                                    Block_17: {
                                        Block_19_Outer:Label_0983_Outer:
                                        while (true) {
                                            while (true) {
                                            Block_26:
                                                while (true) {
                                                    while (true) {
                                                        Block_20: {
                                                            break Block_20;
                                                        Label_0819:
                                                            while (true) {
                                                                Block_24: {
                                                                    Block_18: {
                                                                        Label_0959: {
                                                                            while (true) {
                                                                                Block_23: {
                                                                                    while (true) {
                                                                                        iftrue(Label_1012:)(n3 >= length3);
                                                                                        Block_22: {
                                                                                            Block_27: {
                                                                                                break Block_27;
                                                                                                d2 = this.d;
                                                                                                iftrue(Label_0959:)(n6 >= d2.length - 1);
                                                                                                break Block_22;
                                                                                                s = "BEGIN_TEXT";
                                                                                                break Label_1182;
                                                                                                sb.append("[^\\x00-\\x{10FFFF}]");
                                                                                                return;
                                                                                                Label_1028:
                                                                                                return;
                                                                                                sb.append("\\b");
                                                                                                return;
                                                                                                n6 += 2;
                                                                                                continue Label_0819;
                                                                                                iftrue(Label_0754:)((this.d.length & 0x1) == 0x0);
                                                                                                break Block_18;
                                                                                                s = "LITERAL";
                                                                                                break Label_1182;
                                                                                                sb.append("(?s:.)");
                                                                                                return;
                                                                                            }
                                                                                            aqtn.b(sb, d3[n3]);
                                                                                            ++n3;
                                                                                            continue Label_0819_Outer;
                                                                                        }
                                                                                        n7 = d2[n6] + 1;
                                                                                        n8 = d2[n6 + 1] - 1;
                                                                                        c(sb, n7);
                                                                                        aqtn.b(sb, n7);
                                                                                        iftrue(Label_0886:)(n7 == n8);
                                                                                        break Block_23;
                                                                                        s = "ANY_CHAR";
                                                                                        break Label_1182;
                                                                                        d4 = this.d;
                                                                                        iftrue(Label_0959:)(n5 >= d4.length);
                                                                                        break Block_24;
                                                                                        sb.append("^\\x00-\\x{10FFFF}");
                                                                                        break Label_0959;
                                                                                        d3 = this.d;
                                                                                        length3 = d3.length;
                                                                                        continue Label_0819_Outer;
                                                                                    }
                                                                                    s = "CAPTURE";
                                                                                    break Label_1182;
                                                                                    sb.append("\\A");
                                                                                    return;
                                                                                    s = "STAR";
                                                                                    break Label_1182;
                                                                                    s = "REPEAT";
                                                                                    break Label_1182;
                                                                                    s = "END_TEXT";
                                                                                    sb.append((Object)s);
                                                                                    return;
                                                                                }
                                                                                sb.append('-');
                                                                                c(sb, n8);
                                                                                aqtn.b(sb, n8);
                                                                                continue Label_0892_Outer;
                                                                            }
                                                                            iftrue(Label_0688:)((this.b & 0x100) == 0x0);
                                                                            break Block_17;
                                                                            s = "LEFT_PAREN";
                                                                            continue Label_0993_Outer;
                                                                        }
                                                                        sb.append(']');
                                                                        return;
                                                                        s = "CONCAT";
                                                                        continue Label_0993_Outer;
                                                                        sb.append(')');
                                                                        return;
                                                                    }
                                                                    sb.append("[invalid char class]");
                                                                    return;
                                                                }
                                                                n9 = d4[n5];
                                                                n10 = d4[n5 + 1];
                                                                c(sb, n9);
                                                                aqtn.b(sb, n9);
                                                                iftrue(Label_0953:)(n9 == n10);
                                                                break Block_25;
                                                                Label_0688:
                                                                sb.append("\\z");
                                                                return;
                                                                s = "CHAR_CLASS";
                                                                continue Label_0993_Outer;
                                                                s = "NO_MATCH";
                                                                continue Label_0993_Outer;
                                                                sb.append('^');
                                                                n6 = 1;
                                                                continue Label_0819;
                                                            }
                                                            s = "WORD_BOUNDARY";
                                                            continue Label_0993_Outer;
                                                        }
                                                        n5 = n2;
                                                        iftrue(Label_0892:)(d[length4 - 1] != 1114111);
                                                        continue Label_0953_Outer;
                                                    }
                                                    throw null;
                                                    s = "BEGIN_LINE";
                                                    continue Label_0892_Outer;
                                                    iftrue(Label_0983:)((this.b & 0x1) == 0x0);
                                                    break Block_26;
                                                    s = "NO_WORD_BOUNDARY";
                                                    continue Label_0892_Outer;
                                                    Label_0754:
                                                    sb.append('[');
                                                    d = this.d;
                                                    length4 = d.length;
                                                    iftrue(Label_0787:)(length4 != 0);
                                                    continue Label_0983_Outer;
                                                }
                                                sb.append("(?i:");
                                                continue Block_28_Outer;
                                            }
                                            n5 += 2;
                                            continue Block_19_Outer;
                                        }
                                        s = "END_LINE";
                                        continue Label_0892_Outer;
                                    }
                                    sb.append("(?-m:$)");
                                    return;
                                }
                                sb.append('-');
                                c(sb, n10);
                                aqtn.b(sb, n10);
                                continue;
                            }
                            s = "QUEST";
                            continue Label_0892_Outer;
                            s = "EMPTY_MATCH";
                            continue Label_0892_Outer;
                            sb.append('$');
                            return;
                            Label_1012:
                            iftrue(Label_1028:)((this.b & 0x1) == 0x0);
                            continue Label_0953_Outer;
                        }
                        sb.append("(?:)");
                        return;
                        sb.append('^');
                        return;
                        sb.append("\\B");
                        return;
                        sb.append("(?-s:.)");
                        return;
                        s = "ANY_CHAR_NOT_NL";
                        continue Label_0892_Outer;
                    }
                    finally {
                        while (true) {}
                    }
                }
                break;
            }
        }
    }
    
    private static void c(final StringBuilder sb, final int n) {
        if (n == 45) {
            sb.append('\\');
        }
    }
    
    final int a() {
        final int j = this.j;
        int n = 0;
        int g;
        if (j == 13) {
            g = this.g;
        }
        else {
            g = 0;
        }
        final aqtl[] c = this.c;
        int n2 = g;
        if (c != null) {
            while (true) {
                n2 = g;
                if (n >= c.length) {
                    break;
                }
                final int a = c[n].a();
                int n3;
                if ((n3 = g) < a) {
                    n3 = a;
                }
                ++n;
                g = n3;
            }
        }
        return n2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aqtl)) {
            return false;
        }
        final aqtl aqtl = (aqtl)o;
        final int j = this.j;
        if (j != aqtl.j) {
            return false;
        }
        final int n = j - 1;
        if (j != 0) {
            Label_0350: {
                if (n != 2 && n != 3) {
                    if (n != 9) {
                        switch (n) {
                            case 17:
                            case 18: {
                                if (this.c.length != aqtl.c.length) {
                                    return false;
                                }
                                int n2 = 0;
                                while (true) {
                                    final aqtl[] c = this.c;
                                    if (n2 >= c.length) {
                                        break Label_0350;
                                    }
                                    if (!c[n2].equals(aqtl.c[n2])) {
                                        return false;
                                    }
                                    ++n2;
                                }
                                break;
                            }
                            case 16: {
                                if ((this.b & 0x20) != (aqtl.b & 0x20) || this.e != aqtl.e || this.f != aqtl.f || !this.c[0].equals(aqtl.c[0])) {
                                    return false;
                                }
                                break;
                            }
                            case 13:
                            case 14:
                            case 15: {
                                if ((this.b & 0x20) != (aqtl.b & 0x20) || !this.c[0].equals(aqtl.c[0])) {
                                    return false;
                                }
                                break;
                            }
                            case 12: {
                                if (this.g == aqtl.g) {
                                    final String h = this.h;
                                    if (h == null) {
                                        if (aqtl.h != null) {
                                            return false;
                                        }
                                    }
                                    else if (!h.equals(aqtl.h)) {
                                        return false;
                                    }
                                    if (this.c[0].equals(aqtl.c[0])) {
                                        break;
                                    }
                                }
                                return false;
                            }
                        }
                    }
                    else if ((this.b & 0x100) != (aqtl.b & 0x100)) {
                        return false;
                    }
                }
                else if (!Arrays.equals(this.d, aqtl.d)) {
                    return false;
                }
            }
            return true;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int j = this.j;
        if (j != 0) {
            final int n = j - 1;
            int n3 = 0;
            Label_0085: {
                if (n != 2 && n != 3) {
                    if (n != 9) {
                        int n4 = 0;
                        int n5 = 0;
                        switch (n) {
                            default: {
                                return j;
                            }
                            case 17:
                            case 18: {
                                n3 = Arrays.deepHashCode(this.c);
                                break Label_0085;
                            }
                            case 16: {
                                final int e = this.e;
                                final int f = this.f;
                                n4 = this.c[0].hashCode() * 31;
                                n5 = e * 31 + f * 31;
                                break;
                            }
                            case 13:
                            case 14:
                            case 15: {
                                n5 = (this.b & 0x20) * 31;
                                n4 = this.c[0].hashCode() * 31;
                                break;
                            }
                            case 12: {
                                final int g = this.g;
                                final String h = this.h;
                                int hashCode;
                                if (h != null) {
                                    hashCode = h.hashCode();
                                }
                                else {
                                    hashCode = 0;
                                }
                                return j + (g * 31 + hashCode * 31 + this.c[0].hashCode() * 31);
                            }
                        }
                        final int n6 = n5 + n4;
                        return j + n6;
                    }
                    n3 = (this.b & 0x100);
                }
                else {
                    n3 = Arrays.hashCode(this.d);
                }
            }
            final int n6 = n3 * 31;
            return j + n6;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        this.b(sb);
        return sb.toString();
    }
}
