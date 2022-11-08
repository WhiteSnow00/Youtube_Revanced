import android.util.Log;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aflc extends afkq
{
    public static final Set a;
    public static final afka b;
    public static final afla c;
    private final String d;
    private final Level e;
    private final Set f;
    private final afka g;
    
    static {
        b = afkd.a(a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(afio.a, afjj.a))));
        c = new afla();
    }
    
    public aflc(final String s, final Level e, final Set f, final afka g) {
        super(s);
        this.d = afld.e(s);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static void e(final afjo afjo, final String s, final Level level, final Set set, final afka afka) {
        final afjt f = afkn.f();
        final afjt k = afjo.k();
        final int b = k.b();
        Object c;
        if (b == 0) {
            c = afkk.c;
        }
        else if (b <= 28) {
            c = new afki(f, k);
        }
        else {
            c = new afkj(f, k);
        }
        final boolean b2 = afjo.n().intValue() < level.intValue();
        String s2;
        if (!b2 && !afko.b(afjo, (afkk)c, set)) {
            s2 = afko.a(afjo);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            if (b2 && afjo.l() != null) {
                sb.append("(REDACTED) ");
                sb.append(afjo.l().b);
            }
            else {
                if (afjo.l() != null) {
                    final aflr aflr = new aflr(afjo.l(), afjo.B(), sb);
                    final String c2 = aflr.c();
                    int i = aflu.b(c2, 0);
                    int n = 0;
                    int n2 = -1;
                Label_0222:
                    while (i >= 0) {
                        int j;
                        int n3 = j = i + 1;
                        int n4 = 0;
                        while (j < c2.length()) {
                            final int n5 = j + 1;
                            final char char1 = c2.charAt(j);
                            final char c3 = (char)(char1 - '0');
                            if (c3 >= '\n') {
                                int l = 0;
                                int n8 = 0;
                                Label_0509: {
                                    int n6;
                                    if (char1 == '$') {
                                        if (n5 - 1 - n3 == 0) {
                                            throw aflt.b("missing index", c2, i, n5);
                                        }
                                        if (c2.charAt(n3) == '0') {
                                            throw aflt.b("index has leading zero", c2, i, n5);
                                        }
                                        if (n5 == c2.length()) {
                                            throw aflt.c("unterminated parameter", c2, i);
                                        }
                                        n6 = n5 + 1;
                                        c2.charAt(n5);
                                        n2 = n4 - 1;
                                    }
                                    else {
                                        if (char1 != '<') {
                                            final int n7 = n;
                                            ++n;
                                            l = n5;
                                            n8 = n7;
                                            break Label_0509;
                                        }
                                        if (n2 == -1) {
                                            throw aflt.b("invalid relative parameter", c2, i, n5);
                                        }
                                        if (n5 == c2.length()) {
                                            throw aflt.c("unterminated parameter", c2, i);
                                        }
                                        n6 = n5 + 1;
                                        c2.charAt(n5);
                                    }
                                    final int n9 = n5;
                                    final int n10 = n6;
                                    n8 = n2;
                                    n3 = n9;
                                    l = n10;
                                }
                                --l;
                                while (l < c2.length()) {
                                    if ((char)((c2.charAt(l) & 0xFFFFFFDF) - 65) < '\u001a') {
                                        final int n11 = l + 1;
                                        final char char2 = c2.charAt(l);
                                        final int n12 = char2 & ' ';
                                        final afjl b3 = afjl.b(c2, n3, l, n12 == 0);
                                        final afjk afjk = afjk.k[afjk.a(char2)];
                                        afjk afjk2 = null;
                                        Label_0633: {
                                            if (n12 != 0) {
                                                afjk2 = afjk;
                                            }
                                            else {
                                                if (afjk != null) {
                                                    afjk2 = afjk;
                                                    if ((afjk.n & 0x80) != 0x0) {
                                                        break Label_0633;
                                                    }
                                                }
                                                afjk2 = null;
                                            }
                                        }
                                        aflm b4;
                                        int e;
                                        if (afjk2 != null) {
                                            if (!b3.e(afjk2.n, afjk2.m.f)) {
                                                throw aflt.b("invalid format specifier", c2, i, n11);
                                            }
                                            b4 = aflo.b(n8, afjk2, b3);
                                            e = n11;
                                        }
                                        else if (char2 != 't' && char2 != 'T') {
                                            if (char2 != 'h' && char2 != 'H') {
                                                throw aflt.b("invalid format specification", c2, i, n11);
                                            }
                                            if (!b3.e(160, false)) {
                                                throw aflt.b("invalid format specification", c2, i, n11);
                                            }
                                            b4 = new aflp(b3, n8);
                                            e = n11;
                                        }
                                        else {
                                            if (!b3.e(160, false)) {
                                                throw aflt.b("invalid format specification", c2, i, n11);
                                            }
                                            e = n11 + 1;
                                            if (e > c2.length()) {
                                                throw aflt.a("truncated format specifier", c2, i);
                                            }
                                            final aflk aflk = aflk.F.get(c2.charAt(n11));
                                            if (aflk == null) {
                                                throw aflt.a("illegal date/time conversion", c2, n11);
                                            }
                                            b4 = new afll(b3, n8, aflk);
                                        }
                                        final int a = b4.a;
                                        if (a < 32) {
                                            aflr.a |= 1 << a;
                                        }
                                        aflr.b = Math.max(aflr.b, a);
                                        aflr.b().a(aflr.d, aflr.c(), aflr.e, i);
                                        final Object[] c4 = aflr.c;
                                        final int a2 = b4.a;
                                        if (a2 < c4.length) {
                                            final Object o = c4[a2];
                                            if (o != null) {
                                                b4.a((afln)aflr, o);
                                            }
                                            else {
                                                aflr.d.append("null");
                                            }
                                        }
                                        else {
                                            aflr.d.append("[ERROR: MISSING LOG ARGUMENT]");
                                        }
                                        aflr.e = e;
                                        i = aflu.b(c2, e);
                                        n2 = n8;
                                        continue Label_0222;
                                    }
                                    ++l;
                                }
                                throw aflt.c("unterminated parameter", c2, i);
                            }
                            n4 = n4 * 10 + c3;
                            if (n4 >= 1000000) {
                                throw aflt.b("index too large", c2, i, n5);
                            }
                            j = n5;
                        }
                        throw aflt.c("unterminated parameter", c2, i);
                    }
                    final int a3 = aflr.a;
                    if ((a3 + 1 & a3) != 0x0 || (aflr.b > 31 && a3 != -1)) {
                        throw new aflt(String.format("unreferenced arguments [first missing index=%d]", Integer.numberOfTrailingZeros(-1 ^ a3)));
                    }
                    aflr.b().a(aflr.d, aflr.c(), aflr.e, aflr.c().length());
                    final StringBuilder d = aflr.d;
                    if (afjo.B().length > aflr.b + 1) {
                        d.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    }
                }
                else {
                    sb.append(afjr.b(afjo.m()));
                }
                afko.c((afkk)c, afka, sb);
            }
            s2 = sb.toString();
        }
        final Throwable t = (Throwable)afjo.k().d(afio.a);
        final int d2 = afld.d(afjo.n());
        if (d2 != 2 && d2 != 3 && d2 != 4) {
            if (d2 != 5) {
                Log.e(s, s2, t);
                return;
            }
            Log.w(s, s2, t);
        }
    }
    
    public final void c(final afjo afjo) {
        e(afjo, this.d, this.e, this.f, this.g);
    }
    
    public final boolean d(final Level level) {
        final int d = afld.d(level);
        return Log.isLoggable(this.d, d) || Log.isLoggable("all", d);
    }
}
