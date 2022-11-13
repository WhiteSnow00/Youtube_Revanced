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

public final class afnc extends afmq
{
    public static final Set a;
    public static final afma b;
    public static final afna c;
    private final String d;
    private final Level e;
    private final Set f;
    private final afma g;
    
    static {
        b = afmd.a(a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(afko.a, aflj.a))));
        c = new afna();
    }
    
    public afnc(final String s, final Level e, final Set f, final afma g) {
        super(s);
        this.d = afnd.e(s);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static void e(final aflo aflo, final String s, final Level level, final Set set, final afma afma) {
        final aflt f = afmn.f();
        final aflt k = aflo.k();
        final int b = k.b();
        Object c;
        if (b == 0) {
            c = afmk.c;
        }
        else if (b <= 28) {
            c = new afmi(f, k);
        }
        else {
            c = new afmj(f, k);
        }
        final boolean b2 = aflo.n().intValue() < level.intValue();
        String s2;
        if (!b2 && !afmo.b(aflo, (afmk)c, set)) {
            s2 = afmo.a(aflo);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            if (b2 && aflo.l() != null) {
                sb.append("(REDACTED) ");
                sb.append(aflo.l().b);
            }
            else {
                if (aflo.l() != null) {
                    final afnr afnr = new afnr(aflo.l(), aflo.B(), sb);
                    final String c2 = afnr.c();
                    int i = afnu.b(c2, 0);
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
                                int n8 = 0;
                                int n9 = 0;
                                Label_0505: {
                                    int n6;
                                    if (char1 == '$') {
                                        if (n5 - 1 - n3 == 0) {
                                            throw afnt.b("missing index", c2, i, n5);
                                        }
                                        if (c2.charAt(n3) == '0') {
                                            throw afnt.b("index has leading zero", c2, i, n5);
                                        }
                                        if (n5 == c2.length()) {
                                            throw afnt.c("unterminated parameter", c2, i);
                                        }
                                        n6 = n5 + 1;
                                        c2.charAt(n5);
                                        n2 = n4 - 1;
                                    }
                                    else {
                                        if (char1 != '<') {
                                            final int n7 = n;
                                            ++n;
                                            n8 = n5;
                                            n9 = n7;
                                            break Label_0505;
                                        }
                                        if (n2 == -1) {
                                            throw afnt.b("invalid relative parameter", c2, i, n5);
                                        }
                                        if (n5 == c2.length()) {
                                            throw afnt.c("unterminated parameter", c2, i);
                                        }
                                        n6 = n5 + 1;
                                        c2.charAt(n5);
                                    }
                                    final int n10 = n5;
                                    n8 = n6;
                                    n9 = n2;
                                    n3 = n10;
                                }
                                for (int l = n8 - 1; l < c2.length(); ++l) {
                                    if ((char)((c2.charAt(l) & 0xFFFFFFDF) - 65) < '\u001a') {
                                        final char char2 = c2.charAt(l);
                                        final int n11 = char2 & ' ';
                                        final afll b3 = afll.b(c2, n3, l, n11 == 0);
                                        final aflk aflk = aflk.k[aflk.a(char2)];
                                        aflk aflk2 = null;
                                        Label_0626: {
                                            if (n11 != 0) {
                                                aflk2 = aflk;
                                            }
                                            else {
                                                if (aflk != null) {
                                                    aflk2 = aflk;
                                                    if ((aflk.n & 0x80) != 0x0) {
                                                        break Label_0626;
                                                    }
                                                }
                                                aflk2 = null;
                                            }
                                        }
                                        ++l;
                                        Object b4;
                                        if (aflk2 != null) {
                                            if (!b3.e(aflk2.n, aflk2.m.f)) {
                                                throw afnt.b("invalid format specifier", c2, i, l);
                                            }
                                            b4 = afno.b(n9, aflk2, b3);
                                        }
                                        else if (char2 != 't' && char2 != 'T') {
                                            if (char2 != 'h' && char2 != 'H') {
                                                throw afnt.b("invalid format specification", c2, i, l);
                                            }
                                            if (!b3.e(160, false)) {
                                                throw afnt.b("invalid format specification", c2, i, l);
                                            }
                                            b4 = new afnp(b3, n9);
                                        }
                                        else {
                                            if (!b3.e(160, false)) {
                                                throw afnt.b("invalid format specification", c2, i, l);
                                            }
                                            final int n12 = l + 1;
                                            if (n12 > c2.length()) {
                                                throw afnt.a("truncated format specifier", c2, i);
                                            }
                                            final afnk afnk = afnk.F.get(c2.charAt(l));
                                            if (afnk == null) {
                                                throw afnt.a("illegal date/time conversion", c2, l);
                                            }
                                            b4 = new afnl(b3, n9, afnk);
                                            l = n12;
                                        }
                                        final int a = ((afnm)b4).a;
                                        if (a < 32) {
                                            afnr.a |= 1 << a;
                                        }
                                        afnr.b = Math.max(afnr.b, a);
                                        afnr.b().a(afnr.d, afnr.c(), afnr.e, i);
                                        final Object[] c4 = afnr.c;
                                        final int a2 = ((afnm)b4).a;
                                        if (a2 < c4.length) {
                                            final Object o = c4[a2];
                                            if (o != null) {
                                                ((afnm)b4).a((afnn)afnr, o);
                                            }
                                            else {
                                                afnr.d.append("null");
                                            }
                                        }
                                        else {
                                            afnr.d.append("[ERROR: MISSING LOG ARGUMENT]");
                                        }
                                        afnr.e = l;
                                        i = afnu.b(c2, l);
                                        n2 = n9;
                                        continue Label_0222;
                                    }
                                }
                                throw afnt.c("unterminated parameter", c2, i);
                            }
                            n4 = n4 * 10 + c3;
                            if (n4 >= 1000000) {
                                throw afnt.b("index too large", c2, i, n5);
                            }
                            j = n5;
                        }
                        throw afnt.c("unterminated parameter", c2, i);
                    }
                    final int a3 = afnr.a;
                    if ((a3 + 1 & a3) != 0x0 || (afnr.b > 31 && a3 != -1)) {
                        throw new afnt(String.format("unreferenced arguments [first missing index=%d]", Integer.numberOfTrailingZeros(-1 ^ a3)));
                    }
                    afnr.b().a(afnr.d, afnr.c(), afnr.e, afnr.c().length());
                    final StringBuilder d = afnr.d;
                    if (aflo.B().length > afnr.b + 1) {
                        d.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    }
                }
                else {
                    sb.append(aflr.b(aflo.m()));
                }
                afmo.c((afmk)c, afma, sb);
            }
            s2 = sb.toString();
        }
        final Throwable t = (Throwable)aflo.k().d(afko.a);
        final int d2 = afnd.d(aflo.n());
        if (d2 != 2 && d2 != 3 && d2 != 4) {
            if (d2 != 5) {
                Log.e(s, s2, t);
                return;
            }
            Log.w(s, s2, t);
        }
    }
    
    public final void c(final aflo aflo) {
        e(aflo, this.d, this.e, this.f, this.g);
    }
    
    public final boolean d(final Level level) {
        final int d = afnd.d(level);
        return Log.isLoggable(this.d, d) || Log.isLoggable("all", d);
    }
}
