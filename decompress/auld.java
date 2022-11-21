import java.util.concurrent.atomic.AtomicReferenceArray;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auld
{
    private static final ConcurrentHashMap a;
    
    static {
        a = new ConcurrentHashMap();
        new AtomicReferenceArray(25);
    }
    
    public static aule a(final String s) {
        if (s.length() != 0) {
            aule aule;
            if ((aule = (aule)auld.a.get((Object)s)) == null) {
                final aupl aupl = new aupl();
                final int length = s.length();
                final int[] array = { 0 };
                int n;
                for (int i = 0; i < length; i = n + 1) {
                    array[0] = i;
                    final String b = b(s, array);
                    n = array[0];
                    final int length2 = b.length();
                    if (length2 == 0) {
                        break;
                    }
                    final char char1 = b.charAt(0);
                    if (char1 != '\'') {
                        if (char1 != 'K') {
                            if (char1 != 'M') {
                                if (char1 != 'S') {
                                    if (char1 != 'a') {
                                        if (char1 != 'h') {
                                            if (char1 != 'k') {
                                                if (char1 != 'm') {
                                                    if (char1 != 's') {
                                                        if (char1 != 'G') {
                                                            if (char1 != 'H') {
                                                                Label_0437: {
                                                                    if (char1 != 'Y') {
                                                                        if (char1 != 'Z') {
                                                                            if (char1 == 'd') {
                                                                                aupl.v(length2);
                                                                                continue;
                                                                            }
                                                                            if (char1 == 'e') {
                                                                                aupl.w(length2);
                                                                                continue;
                                                                            }
                                                                            switch (char1) {
                                                                                default: {
                                                                                    switch (char1) {
                                                                                        default: {
                                                                                            throw new IllegalArgumentException("Illegal pattern component: ".concat(b));
                                                                                        }
                                                                                        case 122: {
                                                                                            if (length2 >= 4) {
                                                                                                aupl.g((aumb)new aulp(0), (aulz)null);
                                                                                                continue;
                                                                                            }
                                                                                            final aulp aulp = new aulp(1);
                                                                                            aupl.g((aumb)aulp, (aulz)aulp);
                                                                                            continue;
                                                                                        }
                                                                                        case 119: {
                                                                                            aupl.D(length2);
                                                                                            continue;
                                                                                        }
                                                                                        case 120:
                                                                                        case 121: {
                                                                                            break Label_0437;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 69: {
                                                                                    if (length2 >= 4) {
                                                                                        aupl.i(auil.m);
                                                                                        continue;
                                                                                    }
                                                                                    aupl.h(auil.m);
                                                                                    continue;
                                                                                }
                                                                                case 68: {
                                                                                    aupl.x(length2);
                                                                                    continue;
                                                                                }
                                                                                case 67: {
                                                                                    aupl.t(auil.d, length2, length2);
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            if (length2 == 1) {
                                                                                aupl.j(false);
                                                                                continue;
                                                                            }
                                                                            if (length2 == 2) {
                                                                                aupl.j(true);
                                                                                continue;
                                                                            }
                                                                            aupl.g((aumb)aulo.a, (aulz)aulo.a);
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                                if (length2 == 2) {
                                                                    boolean b2;
                                                                    if (n + 1 < length) {
                                                                        ++array[0];
                                                                        b2 = (c(b(s, array)) ^ true);
                                                                        --array[0];
                                                                    }
                                                                    else {
                                                                        b2 = true;
                                                                    }
                                                                    if (char1 != 'x') {
                                                                        aupl.f((Object)new aulr(auil.f, ((aujg)new auii()).p() - 30, b2));
                                                                    }
                                                                    else {
                                                                        final auii auii = new auii();
                                                                        aupl.f((Object)new aulr(auil.k, ((auji)auii).b.u().a(((auji)auii).a) - 30, b2));
                                                                    }
                                                                }
                                                                else {
                                                                    int n3;
                                                                    final int n2 = n3 = 9;
                                                                    if (n + 1 < length) {
                                                                        ++array[0];
                                                                        if (!c(b(s, array))) {
                                                                            n3 = n2;
                                                                        }
                                                                        else {
                                                                            n3 = length2;
                                                                        }
                                                                        --array[0];
                                                                    }
                                                                    if (char1 != 'Y') {
                                                                        if (char1 != 'x') {
                                                                            if (char1 == 'y') {
                                                                                aupl.F(length2, n3);
                                                                            }
                                                                        }
                                                                        else {
                                                                            aupl.E(length2, n3);
                                                                        }
                                                                    }
                                                                    else {
                                                                        aupl.n(auil.c, length2, n3);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                aupl.z(length2);
                                                            }
                                                        }
                                                        else {
                                                            aupl.i(auil.b);
                                                        }
                                                    }
                                                    else {
                                                        aupl.C(length2);
                                                    }
                                                }
                                                else {
                                                    aupl.A(length2);
                                                }
                                            }
                                            else {
                                                aupl.n(auil.q, length2, 2);
                                            }
                                        }
                                        else {
                                            aupl.n(auil.p, length2, 2);
                                        }
                                    }
                                    else {
                                        aupl.i(auil.n);
                                    }
                                }
                                else {
                                    aupl.y(length2, length2);
                                }
                            }
                            else if (length2 >= 3) {
                                if (length2 >= 4) {
                                    aupl.i(auil.h);
                                }
                                else {
                                    aupl.h(auil.h);
                                }
                            }
                            else {
                                aupl.B(length2);
                            }
                        }
                        else {
                            aupl.n(auil.o, length2, 2);
                        }
                    }
                    else {
                        final String substring = b.substring(1);
                        if (substring.length() == 1) {
                            aupl.q(substring.charAt(0));
                        }
                        else {
                            aupl.r(new String(substring));
                        }
                    }
                }
                final aule a = aupl.a();
                final ConcurrentHashMap a2 = auld.a;
                aule = a;
                if (a2.size() < 500) {
                    final aule aule2 = (aule)a2.putIfAbsent((Object)s, (Object)a);
                    if (aule2 != null) {
                        return aule2;
                    }
                    aule = a;
                }
            }
            return aule;
        }
        throw new IllegalArgumentException("Invalid pattern specification");
    }
    
    private static String b(final String s, final int[] array) {
        final StringBuilder sb = new StringBuilder();
        int n = array[0];
        final char char1 = s.charAt(n);
        final int length = s.length();
        int n3;
        if ((char1 >= 'A' && char1 <= 'Z') || (char1 >= 'a' && char1 <= 'z')) {
            sb.append(char1);
            while (true) {
                final int n2 = n + 1;
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                n3 = n;
                if (s.charAt(n2) != char1) {
                    break;
                }
                sb.append(char1);
                n = n2;
            }
        }
        else {
            sb.append('\'');
            int n4 = 0;
            while (true) {
                n3 = n;
                if (n >= length) {
                    break;
                }
                final char char2 = s.charAt(n);
                if (char2 == '\'') {
                    final int n5 = n + 1;
                    if (n5 < length && s.charAt(n5) == '\'') {
                        sb.append('\'');
                        n = n5;
                    }
                    else {
                        n4 ^= 0x1;
                    }
                }
                else {
                    if (n4 == 0 && ((char2 >= 'A' && char2 <= 'Z') || (char2 >= 'a' && char2 <= 'z'))) {
                        n3 = n - 1;
                        break;
                    }
                    sb.append(char2);
                }
                ++n;
            }
        }
        array[0] = n3;
        return sb.toString();
    }
    
    private static boolean c(final String s) {
        final int length = s.length();
        if (length > 0) {
            switch (s.charAt(0)) {
                case 'M': {
                    if (length <= 2) {
                        return true;
                    }
                    break;
                }
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y': {
                    return true;
                }
            }
        }
        return false;
    }
}
