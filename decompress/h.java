import java.util.List;
import java.text.AttributedString;
import java.text.AttributedCharacterIterator;
import java.util.Iterator;
import java.io.IOException;
import java.util.Date;
import java.io.Serializable;
import java.text.ParsePosition;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.HashMap;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;
import java.text.DateFormat;
import java.util.Map;
import java.util.Locale;
import java.text.Format;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h extends Format
{
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    private static final Locale g;
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient w b;
    public transient Map c;
    private transient DateFormat h;
    private transient NumberFormat i;
    private transient jkn j;
    private transient jkn k;
    
    static {
        d = new String[] { "number", "date", "time", "spellout", "ordinal", "duration" };
        e = new String[] { "", "currency", "percent", "integer" };
        f = new String[] { "", "short", "medium", "long", "full" };
        g = new Locale("");
    }
    
    public h(String f, final Locale a) {
        this.a = a;
        try {
            final w b = this.b;
            if (b == null) {
                this.b = new w(f);
            }
            else {
                b.i(f);
            }
            final Map c = this.c;
            if (c != null) {
                c.clear();
            }
            int n;
            for (int b2 = this.b.b(), i = 1; i < b2 - 2; i = n + 1) {
                final v d = this.b.d(i);
                n = i;
                if (d.e == 6) {
                    n = i;
                    if (d.b() == 2) {
                        final int n2 = i + 2;
                        final w b3 = this.b;
                        final int n3 = n2 + 1;
                        final String f2 = b3.f(b3.d(n2));
                        f = "";
                        final v d2 = this.b.d(n3);
                        n = n3;
                        if (d2.e == 11) {
                            f = this.b.f(d2);
                            n = n3 + 1;
                        }
                        final int c2 = c(f2, h.d);
                        Format format;
                        if (c2 != 0) {
                            if (c2 != 1) {
                                if (c2 != 2) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Unknown format type \"");
                                    sb.append(f2);
                                    sb.append("\"");
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                final int c3 = c(f, h.f);
                                if (c3 != 0) {
                                    if (c3 != 1) {
                                        if (c3 != 2) {
                                            if (c3 != 3) {
                                                if (c3 != 4) {
                                                    format = new SimpleDateFormat(f, this.a);
                                                }
                                                else {
                                                    format = DateFormat.getTimeInstance(0, this.a);
                                                }
                                            }
                                            else {
                                                format = DateFormat.getTimeInstance(1, this.a);
                                            }
                                        }
                                        else {
                                            format = DateFormat.getTimeInstance(2, this.a);
                                        }
                                    }
                                    else {
                                        format = DateFormat.getTimeInstance(3, this.a);
                                    }
                                }
                                else {
                                    format = DateFormat.getTimeInstance(2, this.a);
                                }
                            }
                            else {
                                final int c4 = c(f, h.f);
                                if (c4 != 0) {
                                    if (c4 != 1) {
                                        if (c4 != 2) {
                                            if (c4 != 3) {
                                                if (c4 != 4) {
                                                    format = new SimpleDateFormat(f, this.a);
                                                }
                                                else {
                                                    format = DateFormat.getDateInstance(0, this.a);
                                                }
                                            }
                                            else {
                                                format = DateFormat.getDateInstance(1, this.a);
                                            }
                                        }
                                        else {
                                            format = DateFormat.getDateInstance(2, this.a);
                                        }
                                    }
                                    else {
                                        format = DateFormat.getDateInstance(3, this.a);
                                    }
                                }
                                else {
                                    format = DateFormat.getDateInstance(2, this.a);
                                }
                            }
                        }
                        else {
                            final int c5 = c(f, h.e);
                            if (c5 != 0) {
                                if (c5 != 1) {
                                    if (c5 != 2) {
                                        if (c5 != 3) {
                                            format = new DecimalFormat(f, new DecimalFormatSymbols(this.a));
                                        }
                                        else {
                                            format = NumberFormat.getIntegerInstance(this.a);
                                        }
                                    }
                                    else {
                                        format = NumberFormat.getPercentInstance(this.a);
                                    }
                                }
                                else {
                                    format = NumberFormat.getCurrencyInstance(this.a);
                                }
                            }
                            else {
                                format = NumberFormat.getInstance(this.a);
                            }
                        }
                        if (this.c == null) {
                            this.c = new HashMap();
                        }
                        this.c.put(i, format);
                    }
                }
            }
        }
        catch (final RuntimeException ex) {
            final w b4 = this.b;
            if (b4 != null) {
                b4.a = null;
                b4.d = false;
                b4.b.clear();
                final ArrayList c6 = b4.c;
                if (c6 != null) {
                    c6.clear();
                }
            }
            final Map c7 = this.c;
            if (c7 != null) {
                c7.clear();
            }
            throw ex;
        }
    }
    
    public static final String a(final Locale locale, final String s, final Object... array) {
        final StringBuilder sb = new StringBuilder(s.length());
        new h(s, locale).g(0, null, null, null, array, new atib(sb), null);
        return sb.toString();
    }
    
    private static final int c(String lowerCase, final String[] array) {
        final byte[] a = d.a;
        final int length = lowerCase.length();
        final int n = 0;
        String substring = lowerCase;
        Label_0122: {
            if (length != 0) {
                if (!d.a(lowerCase.charAt(0))) {
                    substring = lowerCase;
                    if (!d.a(lowerCase.charAt(lowerCase.length() - 1))) {
                        break Label_0122;
                    }
                }
                int length2;
                int n2;
                for (length2 = lowerCase.length(), n2 = 0; n2 < length2 && d.a(lowerCase.charAt(n2)); ++n2) {}
                int n3;
                if (n2 < (n3 = length2)) {
                    while (true) {
                        final int n4 = length2 - 1;
                        n3 = length2;
                        if (!d.a(lowerCase.charAt(n4))) {
                            break;
                        }
                        length2 = n4;
                    }
                }
                substring = lowerCase.substring(n2, n3);
            }
        }
        lowerCase = substring.toLowerCase(h.g);
        for (int i = n; i < array.length; ++i) {
            if (lowerCase.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
    
    private final void d(final String s, final ParsePosition parsePosition, final Object[] array, final Map map) {
        if (s == null) {
            return;
        }
        final w b = this.b;
        String a = b.a;
        int n = b.d(0).a();
        int index = parsePosition.getIndex();
        final ParsePosition parsePosition2 = new ParsePosition(0);
        int n2 = 1;
    Label_0726_Outer:
        while (true) {
            final int n3 = 1;
            final v d = this.b.d(n2);
            final int e = d.e;
            final int n4 = d.a - n;
            if (n4 != 0 && !a.regionMatches(n, s, index, n4)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            final int n5 = index + n4;
            if (e == 2) {
                parsePosition.setIndex(n5);
                return;
            }
            int n7;
            int n22;
            if (e != 3 && e != 4) {
                final int c = this.b.c(n2);
                final int b2 = d.b();
                final w b3 = this.b;
                ++n2;
                final v d2 = b3.d(n2);
                int c2;
                Serializable value;
                String s2;
                if (array != null) {
                    c2 = d2.c;
                    value = c2;
                    s2 = null;
                }
                else {
                    if (d2.e == 9) {
                        s2 = this.b.f(d2);
                    }
                    else {
                        s2 = Integer.toString(d2.c);
                    }
                    value = s2;
                    c2 = 0;
                }
                final int n6 = n2 + 1;
                final Map c3 = this.c;
                String s3 = null;
                Object value2 = null;
                int n8 = 0;
                Label_1082: {
                    if (c3 != null) {
                        final Format format = c3.get(n6 - 2);
                        if (format != null) {
                            parsePosition2.setIndex(n5);
                            final Object object = format.parseObject(s, parsePosition2);
                            if (parsePosition2.getIndex() == n5) {
                                parsePosition.setErrorIndex(n5);
                                return;
                            }
                            n7 = parsePosition2.getIndex();
                            s3 = s2;
                            value2 = object;
                            n8 = n3;
                            break Label_1082;
                        }
                    }
                    if (b2 != 1) {
                        final Map c4 = this.c;
                        if (c4 == null || !c4.containsKey(n6 - 2)) {
                            if (b2 == 3) {
                                parsePosition2.setIndex(n5);
                                final w b4 = this.b;
                                final int index2 = parsePosition2.getIndex();
                                double n9 = Double.NaN;
                                int index3 = index2;
                                int n10 = n6;
                                final String s4 = a;
                                while (true) {
                                    int c5;
                                    w w2;
                                    String s6 = null;
                                    int n17;
                                    double n18;
                                    String s7;
                                    for (w w = b4; w.h(n10) != 7; n10 = c5 + 1, s7 = s6, w = w2, s2 = s7, index3 = n17, n9 = n18) {
                                        final double a2 = w.a(w.d(n10));
                                        int n11 = n10 + 2;
                                        c5 = w.c(n11);
                                        final String a3 = w.a;
                                        int a4 = w.d(n11).a();
                                        int n12 = 0;
                                        String s5 = s2;
                                        w2 = w;
                                        int n16 = 0;
                                    Label_0543_Outer:
                                        while (true) {
                                            final int n13 = n11 + 1;
                                            s6 = s5;
                                            final v d3 = w2.d(n13);
                                            while (true) {
                                                Label_0562: {
                                                    if (n13 == c5) {
                                                        break Label_0562;
                                                    }
                                                    final int a5 = a4;
                                                    final int n14 = n12;
                                                    if (d3.e == 3) {
                                                        break Label_0562;
                                                    }
                                                    a4 = a5;
                                                    s5 = s6;
                                                    n11 = n13;
                                                    n12 = n14;
                                                    continue Label_0543_Outer;
                                                }
                                                final int n15 = d3.a - a4;
                                                if (n15 != 0 && !s.regionMatches(index2, a3, a4, n15)) {
                                                    n16 = -1;
                                                    break;
                                                }
                                                final int n14 = n12 + n15;
                                                if (n13 == c5) {
                                                    n16 = n14;
                                                    break;
                                                }
                                                final int a5 = d3.a();
                                                continue Label_0726_Outer;
                                            }
                                        }
                                        n17 = index3;
                                        n18 = n9;
                                        if (n16 >= 0) {
                                            final int n19 = n16 + index2;
                                            n17 = index3;
                                            n18 = n9;
                                            if (n19 > index3) {
                                                if (n19 == s.length()) {
                                                    n9 = a2;
                                                    index3 = n19;
                                                    s3 = s6;
                                                    a = s4;
                                                    if (index3 == index2) {
                                                        parsePosition2.setErrorIndex(index2);
                                                    }
                                                    else {
                                                        parsePosition2.setIndex(index3);
                                                    }
                                                    if (parsePosition2.getIndex() == n5) {
                                                        parsePosition.setErrorIndex(n5);
                                                        return;
                                                    }
                                                    value2 = n9;
                                                    n7 = parsePosition2.getIndex();
                                                    n8 = 1;
                                                    break Label_1082;
                                                }
                                                else {
                                                    n17 = n19;
                                                    n18 = a2;
                                                }
                                            }
                                        }
                                    }
                                    s3 = s2;
                                    continue;
                                }
                            }
                            if (!c.b(b2) && b2 != 5) {
                                throw new IllegalStateException("unexpected argType ".concat(c.a(b2)));
                            }
                            throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                        }
                    }
                    final String s8 = a;
                    final StringBuilder sb = new StringBuilder();
                    final w b5 = this.b;
                    final String a6 = b5.a;
                    int n20 = b5.d(c).a();
                    int n21 = c + 1;
                    while (true) {
                        final v d4 = this.b.d(n21);
                        final int e2 = d4.e;
                        sb.append(a6, n20, d4.a);
                        if (e2 == 6 || e2 == 2) {
                            break;
                        }
                        n20 = d4.a();
                        ++n21;
                    }
                    final String string = sb.toString();
                    if (string.length() != 0) {
                        n7 = s.indexOf(string, n5);
                    }
                    else {
                        n7 = s.length();
                    }
                    if (n7 < 0) {
                        parsePosition.setErrorIndex(n5);
                        return;
                    }
                    String substring = s.substring(n5, n7);
                    final String string2 = value.toString();
                    final StringBuilder sb2 = new StringBuilder("{");
                    sb2.append(string2);
                    sb2.append("}");
                    final boolean equals = substring.equals(sb2.toString());
                    if (equals) {
                        substring = null;
                    }
                    n8 = ((equals ^ true) ? 1 : 0);
                    final String s9 = substring;
                    s3 = s2;
                    a = s8;
                    value2 = s9;
                }
                if (n8 != 0) {
                    if (array != null) {
                        array[c2] = value2;
                    }
                    else if (map != null) {
                        map.put(s3, value2);
                    }
                }
                n = this.b.d(c).a();
                n22 = c;
            }
            else {
                n = d.a();
                n22 = n2;
                n7 = n5;
            }
            final int n23 = n22 + 1;
            index = n7;
            n2 = n23;
        }
    }
    
    private final void e(final Object o, final atib atib, final FieldPosition fieldPosition) {
        if (o != null && !(o instanceof Map)) {
            this.f((Object[])o, null, atib, fieldPosition);
            return;
        }
        this.f(null, (Map)o, atib, fieldPosition);
    }
    
    private final void f(final Object[] array, final Map map, final atib atib, final FieldPosition fieldPosition) {
        if (array != null && this.b.d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        this.g(0, null, array, map, null, atib, fieldPosition);
    }
    
    private final void g(int n, final g g, final Object[] array, final Map map, final Object[] array2, final atib atib, FieldPosition fieldPosition) {
        final w b = this.b;
        final String a = b.a;
        final int a2 = b.d(n).a();
        int n2 = n + 1;
        n = a2;
        while (true) {
            final v d = this.b.d(n2);
            final int e = d.e;
            final int a3 = d.a;
            try {
                ((Appendable)atib.b).append(a, n, a3);
                atib.a += a3 - n;
                if (e == 2) {
                    return;
                }
                n = d.a();
                if (e == 5) {
                    if (g.h) {
                        atib.D(g.f, (Object)g.c, g.g);
                    }
                    else {
                        atib.C((Format)this.b(), (Object)g.c);
                    }
                }
                else if (e == 6) {
                    n = this.b.c(n2);
                    final int b2 = d.b();
                    final w b3 = this.b;
                    final int n3 = n2 + 1;
                    final v d2 = b3.d(n3);
                    final String f = this.b.f(d2);
                    Serializable value = null;
                    Object value2 = null;
                    boolean b4 = false;
                    Label_0389: {
                        Serializable s = null;
                        Label_0375: {
                            if (array != null) {
                                final short c = d2.c;
                                if (atib.c != null) {
                                    value = c;
                                }
                                else {
                                    value = null;
                                }
                                s = value;
                                if (c < 0) {
                                    break Label_0375;
                                }
                                s = value;
                                if (c >= array.length) {
                                    break Label_0375;
                                }
                                value2 = array[c];
                            }
                            else {
                                if (array2 != null) {
                                    while (true) {
                                        for (int i = 0; i < array2.length; i += 2) {
                                            if (f.equals(array2[i].toString())) {
                                                value2 = array2[i + 1];
                                                b4 = false;
                                                value = f;
                                                break Label_0389;
                                            }
                                        }
                                        value2 = null;
                                        b4 = true;
                                        continue;
                                    }
                                }
                                if (map == null || !map.containsKey(f)) {
                                    s = f;
                                    break Label_0375;
                                }
                                value2 = map.get(f);
                                value = f;
                            }
                            b4 = false;
                            break Label_0389;
                        }
                        final Number n4 = null;
                        b4 = true;
                        value = s;
                        value2 = n4;
                    }
                    int n5 = n3 + 1;
                    int a4 = atib.a;
                    Label_0449: {
                        if (b4) {
                            final StringBuilder sb = new StringBuilder("{");
                            sb.append(f);
                            sb.append("}");
                            atib.B((CharSequence)sb.toString());
                        }
                        else if (value2 == null) {
                            atib.B((CharSequence)"null");
                        }
                        else {
                            Label_0570: {
                                if (g != null && g.e == n5 - 2) {
                                    if (g.d == 0.0) {
                                        atib.D(g.f, (Object)g.c, g.g);
                                    }
                                    else {
                                        atib.C(g.f, value2);
                                    }
                                }
                                else {
                                    final Map c2 = this.c;
                                    if (c2 != null) {
                                        final Format format = c2.get(n5 - 2);
                                        if (format != null) {
                                            atib.C(format, value2);
                                            break Label_0570;
                                        }
                                    }
                                    if (b2 != 1) {
                                        final Map c3 = this.c;
                                        if (c3 == null || !c3.containsKey(n5 - 2)) {
                                            if (b2 == 3) {
                                                if (value2 instanceof Number) {
                                                    final double doubleValue = ((Number)value2).doubleValue();
                                                    final w b5 = this.b;
                                                    final int b6 = b5.b();
                                                    int n6 = n5 + 2;
                                                    while (true) {
                                                        final int n7 = b5.c(n6) + 1;
                                                        if (n7 >= b6) {
                                                            break;
                                                        }
                                                        final int n8 = n7 + 1;
                                                        final v d3 = b5.d(n7);
                                                        if (d3.e == 7) {
                                                            break;
                                                        }
                                                        final double a5 = b5.a(d3);
                                                        final int n9 = n8 + 1;
                                                        if (b5.a.charAt(((v)b5.b.get(n8)).a) == '<') {
                                                            if (doubleValue <= a5) {
                                                                break;
                                                            }
                                                        }
                                                        else if (doubleValue < a5) {
                                                            break;
                                                        }
                                                        n6 = n9;
                                                    }
                                                    this.h(n6, null, array, map, array2, atib);
                                                    break Label_0449;
                                                }
                                                final String string = value2.toString();
                                                final StringBuilder sb2 = new StringBuilder("'");
                                                sb2.append(string);
                                                sb2.append("' is not a Number");
                                                throw new IllegalArgumentException(sb2.toString());
                                            }
                                            else {
                                                final int n10 = n;
                                                if (c.b(b2)) {
                                                    if (value2 instanceof Number) {
                                                        jkn jkn;
                                                        if (b2 == 4) {
                                                            if (this.j == null) {
                                                                this.j = new jkn(this, 1);
                                                            }
                                                            jkn = this.j;
                                                        }
                                                        else {
                                                            if (this.k == null) {
                                                                this.k = new jkn(this, 2);
                                                            }
                                                            jkn = this.k;
                                                        }
                                                        final Number n11 = (Number)value2;
                                                        final w b7 = this.b;
                                                        final v v = b7.b.get(n5);
                                                        double a6;
                                                        if (c.d(v.e)) {
                                                            a6 = b7.a(v);
                                                        }
                                                        else {
                                                            a6 = 0.0;
                                                        }
                                                        final g g2 = new g(n5, f, n11, a6);
                                                        final w b8 = this.b;
                                                        final double doubleValue2 = n11.doubleValue();
                                                        final int b9 = b8.b();
                                                        final v d4 = b8.d(n5);
                                                        double a7;
                                                        if (c.d(d4.e)) {
                                                            a7 = b8.a(d4);
                                                            ++n5;
                                                        }
                                                        else {
                                                            a7 = 0.0;
                                                        }
                                                        String s2 = null;
                                                        int n12 = 0;
                                                        int n13 = 0;
                                                        n = a4;
                                                        final Serializable s3 = value;
                                                        jkn jkn2 = jkn;
                                                        FieldPosition fieldPosition2 = null;
                                                        int n33 = 0;
                                                        Label_2246: {
                                                            while (true) {
                                                                int n14 = n5 + 1;
                                                                final v d5 = b8.d(n5);
                                                                fieldPosition2 = fieldPosition;
                                                                if (d5.e == 7) {
                                                                    break;
                                                                }
                                                                jkn jkn4 = null;
                                                                Label_2207: {
                                                                    Label_1145: {
                                                                        if (!c.d(b8.h(n14))) {
                                                                            int n30 = 0;
                                                                            int n31 = 0;
                                                                            jkn jkn3 = null;
                                                                            Label_2196: {
                                                                                Label_2185: {
                                                                                    if (n12 == 0) {
                                                                                        int n15;
                                                                                        String a8 = null;
                                                                                        if (b8.g(d5, "other")) {
                                                                                            if (n13 != 0) {
                                                                                                break Label_2185;
                                                                                            }
                                                                                            if (s2 == null || !s2.equals("other")) {
                                                                                                n13 = n14;
                                                                                                break Label_1145;
                                                                                            }
                                                                                            n15 = n14;
                                                                                            a8 = s2;
                                                                                        }
                                                                                        else {
                                                                                            int n29 = 0;
                                                                                            Label_2104: {
                                                                                                int n17;
                                                                                                if (s2 == null) {
                                                                                                    final double n16 = doubleValue2 - a7;
                                                                                                    if (jkn2.b == null) {
                                                                                                        jkn2.b = t.d(((h)jkn2.c).a, jkn2.a);
                                                                                                    }
                                                                                                    final Object c4 = jkn2.c;
                                                                                                    final int a9 = g2.a;
                                                                                                    final h h = (h)c4;
                                                                                                    final int b10 = h.b.b();
                                                                                                    n17 = n12;
                                                                                                    int n18 = a9;
                                                                                                    int n19 = n;
                                                                                                    if (c.d(h.b.d(a9).e)) {
                                                                                                        n18 = a9 + 1;
                                                                                                        n19 = n;
                                                                                                        n17 = n12;
                                                                                                    }
                                                                                                    int c5;
                                                                                                    while (true) {
                                                                                                        final w b11 = h.b;
                                                                                                        c5 = n18 + 1;
                                                                                                        final v d6 = b11.d(n18);
                                                                                                        final int e2 = d6.e;
                                                                                                        n = n19;
                                                                                                        if (e2 == 7) {
                                                                                                            c5 = 0;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (h.b.g(d6, "other")) {
                                                                                                            break;
                                                                                                        }
                                                                                                        int n20 = c5;
                                                                                                        if (c.d(h.b.h(c5))) {
                                                                                                            n20 = c5 + 1;
                                                                                                        }
                                                                                                        n18 = h.b.c(n20) + 1;
                                                                                                        if (n18 >= b10) {
                                                                                                            c5 = 0;
                                                                                                            break;
                                                                                                        }
                                                                                                        n19 = n;
                                                                                                    }
                                                                                                    final Object c6 = jkn2.c;
                                                                                                    final String b12 = g2.b;
                                                                                                    ++c5;
                                                                                                    int e4;
                                                                                                    while (true) {
                                                                                                        final h h2 = (h)c6;
                                                                                                        final v d7 = h2.b.d(c5);
                                                                                                        final int e3 = d7.e;
                                                                                                        int n21;
                                                                                                        if (e3 == 2) {
                                                                                                            n21 = 0;
                                                                                                        }
                                                                                                        else {
                                                                                                            if (e3 != 5) {
                                                                                                                if (e3 == 6) {
                                                                                                                    final int b13 = d7.b();
                                                                                                                    if (b12.length() != 0 && (b13 == 1 || b13 == 2)) {
                                                                                                                        final v d8 = h2.b.d(c5 + 1);
                                                                                                                        e4 = c5;
                                                                                                                        if (h2.b.g(d8, b12)) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    c5 = h2.b.c(c5);
                                                                                                                }
                                                                                                                ++c5;
                                                                                                                continue;
                                                                                                            }
                                                                                                            n21 = -1;
                                                                                                        }
                                                                                                        e4 = n21;
                                                                                                        break;
                                                                                                    }
                                                                                                    if ((g2.e = e4) > 0) {
                                                                                                        final Map c7 = ((h)jkn2.c).c;
                                                                                                        if (c7 != null) {
                                                                                                            g2.f = (Format)c7.get(e4);
                                                                                                        }
                                                                                                    }
                                                                                                    if (g2.f == null) {
                                                                                                        g2.f = ((h)jkn2.c).b();
                                                                                                        g2.h = true;
                                                                                                    }
                                                                                                    g2.g = g2.f.format(g2.c);
                                                                                                    final s h3 = ((t)jkn2.b).h;
                                                                                                    int n25 = 0;
                                                                                                    Label_1932: {
                                                                                                        if (!Double.isInfinite(n16)) {
                                                                                                            if (!Double.isNaN(n16)) {
                                                                                                                double n22;
                                                                                                                if (n16 < 0.0) {
                                                                                                                    n22 = -n16;
                                                                                                                }
                                                                                                                else {
                                                                                                                    n22 = n16;
                                                                                                                }
                                                                                                                if (n22 < 1.0E9) {
                                                                                                                    final long n23 = (long)(n22 * 1000000.0);
                                                                                                                    int n24 = 10;
                                                                                                                    for (int j = 6; j > 0; --j) {
                                                                                                                        if (n23 % 1000000L % n24 != 0L) {
                                                                                                                            n25 = j;
                                                                                                                            break Label_1932;
                                                                                                                        }
                                                                                                                        n24 *= 10;
                                                                                                                    }
                                                                                                                }
                                                                                                                else {
                                                                                                                    final String format2 = String.format(Locale.ENGLISH, "%1.15e", n22);
                                                                                                                    int lastIndex = format2.lastIndexOf(101);
                                                                                                                    int n27;
                                                                                                                    final int n26 = n27 = lastIndex + 1;
                                                                                                                    if (format2.charAt(n26) == '+') {
                                                                                                                        n27 = n26 + 1;
                                                                                                                    }
                                                                                                                    int n28 = lastIndex - 2 - Integer.parseInt(format2.substring(n27));
                                                                                                                    if (n28 >= 0) {
                                                                                                                        --lastIndex;
                                                                                                                        while (true) {
                                                                                                                            n25 = n28;
                                                                                                                            if (n28 <= 0) {
                                                                                                                                break Label_1932;
                                                                                                                            }
                                                                                                                            n25 = n28;
                                                                                                                            if (format2.charAt(lastIndex) != '0') {
                                                                                                                                break Label_1932;
                                                                                                                            }
                                                                                                                            --n28;
                                                                                                                            --lastIndex;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        n25 = 0;
                                                                                                    }
                                                                                                    final m m = new m(n16, n25);
                                                                                                    Label_2040: {
                                                                                                        if (!Double.isInfinite(m.a) && !Double.isNaN(m.a)) {
                                                                                                            while (true) {
                                                                                                                for (final r r : h3.b) {
                                                                                                                    if (r.b.a(m)) {
                                                                                                                        a8 = r.a;
                                                                                                                        break Label_2040;
                                                                                                                    }
                                                                                                                }
                                                                                                                r r = null;
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        a8 = "other";
                                                                                                    }
                                                                                                    if (n13 != 0 && a8.equals("other")) {
                                                                                                        n29 = 1;
                                                                                                        break Label_2104;
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    n17 = n12;
                                                                                                    a8 = s2;
                                                                                                }
                                                                                                n29 = n17;
                                                                                            }
                                                                                            s2 = a8;
                                                                                            n30 = n29;
                                                                                            n31 = n;
                                                                                            jkn3 = jkn2;
                                                                                            if (n29 != 0) {
                                                                                                break Label_2196;
                                                                                            }
                                                                                            s2 = a8;
                                                                                            n30 = n29;
                                                                                            n31 = n;
                                                                                            jkn3 = jkn2;
                                                                                            if (!b8.g(d5, a8)) {
                                                                                                break Label_2196;
                                                                                            }
                                                                                            n15 = n14;
                                                                                        }
                                                                                        n13 = n14;
                                                                                        final int n32 = 1;
                                                                                        n14 = n15;
                                                                                        n12 = n32;
                                                                                        s2 = a8;
                                                                                        jkn4 = jkn2;
                                                                                        break Label_2207;
                                                                                    }
                                                                                }
                                                                                n30 = n12;
                                                                                jkn3 = jkn2;
                                                                                n31 = n;
                                                                            }
                                                                            jkn4 = jkn3;
                                                                            n = n31;
                                                                            n12 = n30;
                                                                            break Label_2207;
                                                                        }
                                                                        n33 = n14 + 1;
                                                                        if (doubleValue2 == b8.a(b8.d(n14))) {
                                                                            a4 = n;
                                                                            break Label_2246;
                                                                        }
                                                                        n14 = n33;
                                                                    }
                                                                    jkn4 = jkn2;
                                                                }
                                                                n5 = b8.c(n14) + 1;
                                                                if (n5 >= b9) {
                                                                    break;
                                                                }
                                                                jkn2 = jkn4;
                                                                fieldPosition = fieldPosition2;
                                                            }
                                                            a4 = n;
                                                            n33 = n13;
                                                        }
                                                        this.h(n33, g2, array, map, array2, atib);
                                                        n = n10;
                                                        fieldPosition = fieldPosition2;
                                                        value = s3;
                                                        break Label_0449;
                                                    }
                                                    final String string2 = value2.toString();
                                                    final StringBuilder sb3 = new StringBuilder("'");
                                                    sb3.append(string2);
                                                    sb3.append("' is not a Number");
                                                    throw new IllegalArgumentException(sb3.toString());
                                                }
                                                else {
                                                    final int n34 = a4;
                                                    if (b2 == 5) {
                                                        final w b14 = this.b;
                                                        final String string3 = value2.toString();
                                                        final int b15 = b14.b();
                                                        int n35 = 0;
                                                        while (true) {
                                                            int k;
                                                            do {
                                                                final v d9 = b14.d(n5);
                                                                n = n35;
                                                                if (d9.e == 7) {
                                                                    break;
                                                                }
                                                                final int n36 = n5 + 1;
                                                                if (b14.g(d9, string3)) {
                                                                    this.h(n36, null, array, map, array2, atib);
                                                                    n = n10;
                                                                    a4 = n34;
                                                                    break Label_0449;
                                                                }
                                                                if ((n = n35) == 0) {
                                                                    if (b14.g(d9, "other")) {
                                                                        n = n36;
                                                                    }
                                                                    else {
                                                                        n = 0;
                                                                    }
                                                                }
                                                                k = (n5 = b14.c(n36) + 1);
                                                                n35 = n;
                                                            } while (k < b15);
                                                            final int n36 = n;
                                                            continue;
                                                        }
                                                    }
                                                    throw new IllegalStateException("unexpected argType ".concat(c.a(b2)));
                                                }
                                            }
                                        }
                                    }
                                    if (value2 instanceof Number) {
                                        atib.C((Format)this.b(), value2);
                                    }
                                    else if (value2 instanceof Date) {
                                        if (this.h == null) {
                                            this.h = DateFormat.getDateTimeInstance(3, 3, this.a);
                                        }
                                        atib.C((Format)this.h, value2);
                                    }
                                    else {
                                        atib.B((CharSequence)value2.toString());
                                    }
                                }
                            }
                        }
                    }
                    final Object c8 = atib.c;
                    if (c8 != null) {
                        final int a10 = atib.a;
                        if (a4 < a10) {
                            ((List<bav>)c8).add(new bav((Object)value, a4, a10));
                        }
                    }
                    if (fieldPosition != null && f.a.equals((Object)fieldPosition.getFieldAttribute())) {
                        fieldPosition.setBeginIndex(a4);
                        fieldPosition.setEndIndex(atib.a);
                        fieldPosition = null;
                    }
                    final int a11 = this.b.d(n).a();
                    n2 = n;
                    n = a11;
                }
                ++n2;
            }
            catch (final IOException ex) {
                throw new z((Throwable)ex);
            }
        }
    }
    
    private final void h(final int n, final g g, final Object[] array, final Map map, final Object[] array2, final atib atib) {
        if (this.b.f != 2) {
            this.g(n, g, array, map, array2, atib, null);
            return;
        }
        throw new UnsupportedOperationException("JDK apostrophe mode not supported");
    }
    
    public final NumberFormat b() {
        if (this.i == null) {
            this.i = NumberFormat.getInstance(this.a);
        }
        return this.i;
    }
    
    @Override
    public final StringBuffer format(final Object o, final StringBuffer sb, final FieldPosition fieldPosition) {
        this.e(o, new atib(sb), fieldPosition);
        return sb;
    }
    
    @Override
    public final AttributedCharacterIterator formatToCharacterIterator(final Object o) {
        if (o != null) {
            final StringBuilder sb = new StringBuilder();
            final atib atib = new atib(sb);
            atib.c = new ArrayList();
            this.e(o, atib, null);
            final AttributedString attributedString = new AttributedString(sb.toString());
            for (final bav bav : atib.c) {
                attributedString.addAttribute((AttributedCharacterIterator.Attribute)bav.d, bav.c, bav.b, bav.a);
            }
            return attributedString.getIterator();
        }
        throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
    }
    
    @Override
    public final int hashCode() {
        return this.b.a.hashCode();
    }
    
    @Override
    public final Object parseObject(final String s, final ParsePosition parsePosition) {
        if (!this.b.d) {
            int n = 0;
            short n2 = -1;
        Label_0114:
            while (true) {
                int c;
                if ((c = n) != 0) {
                    c = this.b.c(n);
                }
                while (true) {
                    int i;
                    do {
                        final w b = this.b;
                        final int n3 = c + 1;
                        i = b.h(n3);
                        final int n4 = n3;
                        if (i != 6) {
                            c = n3;
                        }
                        else {
                            if (n4 < 0) {
                                break Label_0114;
                            }
                            final short c2 = this.b.d(n4 + 1).c;
                            n = n4;
                            if (c2 > n2) {
                                n2 = c2;
                                n = n4;
                                continue Label_0114;
                            }
                            continue Label_0114;
                        }
                    } while (i != 2);
                    final int n4 = -1;
                    continue;
                }
            }
            final Object[] array = new Object[n2 + 1];
            final int index = parsePosition.getIndex();
            this.d(s, parsePosition, array, null);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return array;
        }
        else {
            final HashMap hashMap = new HashMap();
            final int index2 = parsePosition.getIndex();
            this.d(s, parsePosition, null, hashMap);
            if (parsePosition.getIndex() == index2) {
                return null;
            }
            return hashMap;
        }
    }
}
