import java.util.regex.Matcher;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import android.text.TextUtils;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzf extends bxh
{
    private final bas a;
    private final byy b;
    
    public bzf() {
        super("WebvttDecoder");
        this.a = new bas();
        this.b = new byy();
    }
    
    protected final bxi n(final byte[] array, int i, final boolean b) {
        this.a.E(array, i);
        final ArrayList list = new ArrayList();
        try {
            bzg.c(this.a);
            while (!TextUtils.isEmpty((CharSequence)this.a.t())) {}
            final ArrayList list2 = new ArrayList();
            while (true) {
                final bas a = this.a;
                i = -1;
                int b2 = 0;
                while (i == -1) {
                    b2 = a.b;
                    final String t = a.t();
                    if (t == null) {
                        i = 0;
                    }
                    else if ("STYLE".equals(t)) {
                        i = 2;
                    }
                    else if (t.startsWith("NOTE")) {
                        i = 1;
                    }
                    else {
                        i = 3;
                    }
                }
                a.G(b2);
                if (i == 0) {
                    return (bxi)new bzh((List)list2);
                }
                if (i == 1) {
                    while (!TextUtils.isEmpty((CharSequence)this.a.t())) {}
                }
                else if (i == 2) {
                    if (!list2.isEmpty()) {
                        throw new bxk("A style block was found after the first cue.");
                    }
                    this.a.t();
                    byy b3 = this.b;
                    final bas a2 = this.a;
                    b3.d.setLength(0);
                    i = a2.b;
                    while (!TextUtils.isEmpty((CharSequence)a2.t())) {}
                    b3.c.E(a2.a, a2.b);
                    b3.c.G(i);
                    final ArrayList list3 = new ArrayList();
                    while (true) {
                        final bas c = b3.c;
                        final StringBuilder d = b3.d;
                        byy.c(c);
                        String trim = null;
                        Label_0441: {
                            if (c.a() >= 5) {
                                if ("::cue".equals(c.w(5))) {
                                    i = c.b;
                                    final String b4 = byy.b(c, d);
                                    if (b4 != null) {
                                        if ("{".equals(b4)) {
                                            c.G(i);
                                            trim = "";
                                            break Label_0441;
                                        }
                                        if ("(".equals(b4)) {
                                            int b5;
                                            int c2;
                                            for (b5 = c.b, c2 = c.c, i = 0; b5 < c2 && i == 0; ++b5) {
                                                if ((char)c.a[b5] == ')') {
                                                    i = 1;
                                                }
                                                else {
                                                    i = 0;
                                                }
                                            }
                                            trim = c.w(b5 - 1 - c.b).trim();
                                        }
                                        else {
                                            trim = null;
                                        }
                                        if (")".equals(byy.b(c, d))) {
                                            break Label_0441;
                                        }
                                    }
                                }
                            }
                            trim = null;
                        }
                        if (trim == null || !"{".equals(byy.b(b3.c, b3.d))) {
                            list.addAll(list3);
                            break;
                        }
                        final byz byz = new byz();
                        if (!"".equals(trim)) {
                            i = trim.indexOf(91);
                            String substring = trim;
                            if (i != -1) {
                                final Matcher matcher = byy.a.matcher(trim.substring(i));
                                if (matcher.matches()) {
                                    final String group = matcher.group(1);
                                    dk.d((Object)group);
                                    byz.d = group;
                                }
                                substring = trim.substring(0, i);
                            }
                            final String[] ap = bax.ap(substring, "\\.");
                            final String b6 = ap[0];
                            i = b6.indexOf(35);
                            if (i != -1) {
                                byz.b = b6.substring(0, i);
                                byz.a = b6.substring(i + 1);
                            }
                            else {
                                byz.b = b6;
                            }
                            i = ap.length;
                            if (i > 1) {
                                byz.c = new HashSet(Arrays.asList((String[])bax.ay((Object[])ap, i)));
                            }
                        }
                        final Object o = null;
                        i = 0;
                        byy byy = b3;
                        Object o2 = o;
                        while (i == 0) {
                            final bas c3 = byy.c;
                            i = c3.b;
                            final String b7 = byy.b(c3, byy.d);
                            int n;
                            if (b7 != null && !"}".equals(b7)) {
                                n = 0;
                            }
                            else {
                                n = 1;
                            }
                            String s = null;
                            byy byy3 = null;
                            Label_1596: {
                                String s2 = null;
                                Label_1593: {
                                    if (n == 0) {
                                        byy.c.G(i);
                                        final bas c4 = byy.c;
                                        final StringBuilder d2 = byy.d;
                                        byy.c(c4);
                                        final String a3 = byy.a(c4, d2);
                                        if (!"".equals(a3)) {
                                            if (":".equals(byy.b(c4, d2))) {
                                                byy.c(c4);
                                                final StringBuilder sb = new StringBuilder();
                                                i = 0;
                                                final byy byy2 = byy;
                                                while (true) {
                                                    while (i == 0) {
                                                        final int b8 = c4.b;
                                                        final String b9 = byy.b(c4, d2);
                                                        if (b9 == null) {
                                                            final String string = null;
                                                            s = b7;
                                                            byy3 = byy2;
                                                            s2 = s;
                                                            if (string == null) {
                                                                break Label_1593;
                                                            }
                                                            if ("".equals(string)) {
                                                                byy3 = byy2;
                                                                s2 = s;
                                                                break Label_1593;
                                                            }
                                                            i = c4.b;
                                                            final String b10 = byy.b(c4, d2);
                                                            if (!";".equals(b10)) {
                                                                byy3 = byy2;
                                                                s2 = s;
                                                                if (!"}".equals(b10)) {
                                                                    break Label_1593;
                                                                }
                                                                c4.G(i);
                                                            }
                                                            if ("color".equals(a3)) {
                                                                byz.f = baf.a(string);
                                                                byz.g = true;
                                                                byy3 = byy2;
                                                                s2 = s;
                                                                break Label_1593;
                                                            }
                                                            if ("background-color".equals(a3)) {
                                                                byz.h = baf.a(string);
                                                                byz.i = true;
                                                                byy3 = byy2;
                                                                s2 = s;
                                                                break Label_1593;
                                                            }
                                                            if ("ruby-position".equals(a3)) {
                                                                if ("over".equals(string)) {
                                                                    byz.o = 1;
                                                                    byy3 = byy2;
                                                                    s2 = s;
                                                                    break Label_1593;
                                                                }
                                                                byy3 = byy2;
                                                                s2 = s;
                                                                if ("under".equals(string)) {
                                                                    byz.o = 2;
                                                                    byy3 = byy2;
                                                                    s2 = s;
                                                                }
                                                                break Label_1593;
                                                            }
                                                            else {
                                                                if ("text-combine-upright".equals(a3)) {
                                                                    byz.p = ("all".equals(string) || string.startsWith("digits"));
                                                                    byy3 = byy2;
                                                                    s2 = s;
                                                                    break Label_1593;
                                                                }
                                                                if ("text-decoration".equals(a3)) {
                                                                    byy3 = byy2;
                                                                    s2 = s;
                                                                    if ("underline".equals(string)) {
                                                                        byz.j = 1;
                                                                        byy3 = byy2;
                                                                        break Label_1596;
                                                                    }
                                                                    break Label_1593;
                                                                }
                                                                else {
                                                                    if ("font-family".equals(a3)) {
                                                                        byz.e = aevy.b(string);
                                                                        byy3 = byy2;
                                                                        s2 = s;
                                                                        break Label_1593;
                                                                    }
                                                                    if ("font-weight".equals(a3)) {
                                                                        byy3 = byy2;
                                                                        s2 = s;
                                                                        if ("bold".equals(string)) {
                                                                            byz.k = 1;
                                                                            byy3 = byy2;
                                                                            s2 = s;
                                                                        }
                                                                        break Label_1593;
                                                                    }
                                                                    else if ("font-style".equals(a3)) {
                                                                        byy3 = byy2;
                                                                        s2 = s;
                                                                        if ("italic".equals(string)) {
                                                                            byz.l = 1;
                                                                            byy3 = byy2;
                                                                            s2 = s;
                                                                        }
                                                                        break Label_1593;
                                                                    }
                                                                    else {
                                                                        byy3 = byy2;
                                                                        s2 = s;
                                                                        if (!"font-size".equals(a3)) {
                                                                            break Label_1593;
                                                                        }
                                                                        final Matcher matcher2 = byy.b.matcher(aevy.b(string));
                                                                        if (!matcher2.matches()) {
                                                                            final StringBuilder sb2 = new StringBuilder("Invalid font-size: '");
                                                                            sb2.append(string);
                                                                            sb2.append("'.");
                                                                            bap.c("WebvttCssParser", sb2.toString());
                                                                            byy3 = byy2;
                                                                            s2 = s;
                                                                            break Label_1593;
                                                                        }
                                                                        final String group2 = matcher2.group(2);
                                                                        dk.d((Object)group2);
                                                                        i = group2.hashCode();
                                                                        Label_1509: {
                                                                            if (i != 37) {
                                                                                if (i != 3240) {
                                                                                    if (i == 3592) {
                                                                                        if (group2.equals("px")) {
                                                                                            i = 0;
                                                                                            break Label_1509;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (group2.equals("em")) {
                                                                                    i = 1;
                                                                                    break Label_1509;
                                                                                }
                                                                            }
                                                                            else if (group2.equals("%")) {
                                                                                i = 2;
                                                                                break Label_1509;
                                                                            }
                                                                            i = -1;
                                                                        }
                                                                        if (i != 0) {
                                                                            if (i != 1) {
                                                                                if (i != 2) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                byz.m = 3;
                                                                            }
                                                                            else {
                                                                                byz.m = 2;
                                                                            }
                                                                        }
                                                                        else {
                                                                            byz.m = 1;
                                                                        }
                                                                        final String group3 = matcher2.group(1);
                                                                        dk.d((Object)group3);
                                                                        byz.n = Float.parseFloat(group3);
                                                                        byy3 = byy2;
                                                                        break Label_1596;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (!"}".equals(b9) && !";".equals(b9)) {
                                                            sb.append(b9);
                                                        }
                                                        else {
                                                            c4.G(b8);
                                                            i = 1;
                                                        }
                                                    }
                                                    final String string = sb.toString();
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    s2 = b7;
                                    byy3 = byy;
                                }
                                s = s2;
                            }
                            i = n;
                            final byy byy4 = byy3;
                            o2 = s;
                            byy = byy4;
                        }
                        if ("}".equals(o2)) {
                            list3.add(byz);
                        }
                        b3 = byy;
                    }
                }
                else {
                    final bza d3 = bze.d(this.a, (List)list);
                    if (d3 == null) {
                        continue;
                    }
                    list2.add(d3);
                }
            }
        }
        catch (final aza aza) {
            throw new bxk((Throwable)aza);
        }
    }
}
