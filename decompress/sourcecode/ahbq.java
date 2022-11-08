import com.google.protobuf.MessageLite;
import java.util.RandomAccess;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbq
{
    public static final aeda a;
    public static final aeda b;
    public static final aeda c;
    private static final Class d;
    
    static {
        Class d2;
        try {
            Class.forName("com.google.protobuf.GeneratedMessage");
        }
        finally {
            d2 = null;
        }
        d = d2;
        a = Z(false);
        b = Z(true);
        c = new aeda();
    }
    
    static int A(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + size * agym.ac(n);
    }
    
    static void B(final Object o, final Object o2) {
        final agyv j = ahbz.j(o2);
        if (!j.i()) {
            final agyv k = ahbz.k(o);
            for (int i = 0; i < j.b.a(); ++i) {
                k.g(j.b.f(i));
            }
            final Iterator iterator = j.b.c().iterator();
            while (iterator.hasNext()) {
                k.g((Map.Entry)iterator.next());
            }
        }
    }
    
    static void C(final Object o, final Object o2, final long n) {
        ahcj.v(o, n, ahbz.g(ahcj.i(o, n), ahcj.i(o2, n)));
    }
    
    static void D(final Object o, final Object o2) {
        final ahcc al = aeda.aL(o);
        final ahcc al2 = aeda.aL(o2);
        ahcc b;
        if (ahcc.a.equals(al2)) {
            b = al;
        }
        else if (ahcc.a.equals(al)) {
            b = ahcc.b(al, al2);
        }
        else if (al2.equals(ahcc.a)) {
            b = al;
        }
        else {
            al.d();
            final int b2 = al.b + al2.b;
            al.e(b2);
            System.arraycopy(al2.c, 0, al.c, al.b, al2.b);
            System.arraycopy(al2.d, 0, al.d, al.b, al2.b);
            al.b = b2;
            b = al;
        }
        aeda.aM(o, b);
    }
    
    static Object E(final Object o, final int n, final int n2, final Object o2) {
        Object an = o2;
        if (o2 == null) {
            an = aeda.aN(o);
        }
        aeda.aK(an, n, (long)n2);
        return an;
    }
    
    public static void F(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    ((Boolean)list.get(k)).booleanValue();
                    ++i;
                    ++k;
                }
                ((agym)aglk.b).D(i);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).j((byte)(byte)(((boolean)list.get(i)) ? 1 : 0));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).l(i, (boolean)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void G(final int n, final List list, final aglk aglk) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                ((agym)aglk.b).n(n, (agyc)list.get(i));
            }
        }
    }
    
    public static void H(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).doubleValue();
                    n2 += 8;
                    ++i;
                }
                ((agym)aglk.b).D(n2);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).aq((double)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).ap(i, (double)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void I(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += agym.O((int)list.get(k));
                    ++k;
                }
                ((agym)aglk.b).D(i);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).u((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).t(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void J(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).intValue();
                    n2 += 4;
                    ++i;
                }
                ((agym)aglk.b).D(n2);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).q((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).p(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void K(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).longValue();
                    n2 += 8;
                    ++i;
                }
                ((agym)aglk.b).D(n2);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).s((long)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).r(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void L(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).floatValue();
                    n2 += 4;
                    ++i;
                }
                ((agym)aglk.b).D(n2);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).as((float)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).ar(i, (float)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void M(final int n, final List list, final aglk aglk, final ahbp ahbp) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                aglk.i(n, list.get(i), ahbp);
            }
        }
    }
    
    public static void N(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += agym.O((int)list.get(k));
                    ++k;
                }
                ((agym)aglk.b).D(i);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).u((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).t(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void O(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    n2 += agym.ag((long)list.get(i));
                    ++i;
                }
                ((agym)aglk.b).D(n2);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).F((long)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).E(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void P(final int n, final List list, final aglk aglk, final ahbp ahbp) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                aglk.l(n, list.get(i), ahbp);
            }
        }
    }
    
    public static void Q(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).intValue();
                    n2 += 4;
                    ++i;
                }
                ((agym)aglk.b).D(n2);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).q((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).p(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void R(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).longValue();
                    n2 += 8;
                    ++i;
                }
                ((agym)aglk.b).D(n2);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).s((long)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).r(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void S(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    n2 += agym.X((int)list.get(i));
                    ++i;
                }
                ((agym)aglk.b).D(n2);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).av((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).au(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void T(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    n2 += agym.Z((long)list.get(i));
                    ++i;
                }
                ((agym)aglk.b).D(n2);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).ax((long)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).aw(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void U(final int n, final List list, final aglk aglk) {
        if (list != null && !list.isEmpty()) {
            final boolean b = list instanceof ahaj;
            int i = 0;
            final int n2 = 0;
            if (b) {
                final ahaj ahaj = (ahaj)list;
                for (int j = n2; j < list.size(); ++j) {
                    final Object f = ahaj.f(j);
                    if (f instanceof String) {
                        ((agym)aglk.b).z(n, (String)f);
                    }
                    else {
                        ((agym)aglk.b).n(n, (agyc)f);
                    }
                }
            }
            else {
                while (i < list.size()) {
                    ((agym)aglk.b).z(n, (String)list.get(i));
                    ++i;
                }
            }
        }
    }
    
    public static void V(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += agym.ae((int)list.get(k));
                    ++k;
                }
                ((agym)aglk.b).D(i);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).D((int)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).C(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void W(int i, final List list, final aglk aglk, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                ((agym)aglk.b).B(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += agym.ag((long)list.get(k));
                    ++k;
                }
                ((agym)aglk.b).D(i);
                for (i = n; i < list.size(); ++i) {
                    ((agym)aglk.b).F((long)list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    ((agym)aglk.b).E(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    static Object X(final Object o, final int n, final List list, final agzn agzn, Object o2, final aeda aeda) {
        if (agzn == null) {
            return o2;
        }
        Object o3;
        if (list instanceof RandomAccess) {
            final int size = list.size();
            int i = 0;
            int n2 = 0;
            while (i < size) {
                final int intValue = list.get(i);
                if (agzn.findValueByNumber(intValue) != null) {
                    if (i != n2) {
                        list.set(n2, intValue);
                    }
                    ++n2;
                }
                else {
                    o2 = E(o, n, intValue, o2);
                }
                ++i;
            }
            if (n2 != size) {
                list.subList(n2, size).clear();
                return o2;
            }
            o3 = o2;
        }
        else {
            final Iterator iterator = list.iterator();
            while (true) {
                o3 = o2;
                if (!iterator.hasNext()) {
                    break;
                }
                final int intValue2 = (int)iterator.next();
                if (agzn.findValueByNumber(intValue2) != null) {
                    continue;
                }
                o2 = E(o, n, intValue2, o2);
                iterator.remove();
            }
        }
        return o3;
    }
    
    static Object Y(final Object o, final int n, final List list, final agzo agzo, Object o2, final aeda aeda) {
        if (agzo == null) {
            return o2;
        }
        Object o3;
        if (list instanceof RandomAccess) {
            final int size = list.size();
            int i = 0;
            int n2 = 0;
            while (i < size) {
                final int intValue = list.get(i);
                if (agzo.isInRange(intValue)) {
                    if (i != n2) {
                        list.set(n2, intValue);
                    }
                    ++n2;
                }
                else {
                    o2 = E(o, n, intValue, o2);
                }
                ++i;
            }
            if (n2 != size) {
                list.subList(n2, size).clear();
                return o2;
            }
            o3 = o2;
        }
        else {
            final Iterator iterator = list.iterator();
            while (true) {
                o3 = o2;
                if (!iterator.hasNext()) {
                    break;
                }
                final int intValue2 = (int)iterator.next();
                if (agzo.isInRange(intValue2)) {
                    continue;
                }
                o2 = E(o, n, intValue2, o2);
                iterator.remove();
            }
        }
        return o3;
    }
    
    private static aeda Z(final boolean b) {
        Class clazz;
        try {
            Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        finally {
            clazz = null;
        }
        if (clazz == null) {
            return null;
        }
        try {
            return (aeda)clazz.getConstructor(Boolean.TYPE).newInstance(b);
        }
        finally {
            return null;
        }
    }
    
    static int a(final List list) {
        return list.size();
    }
    
    static int b(int i, final List list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        final int n2 = size * agym.ac(i);
        i = n;
        int n3 = n2;
        while (i < list.size()) {
            n3 += agym.J((agyc)list.get(i));
            ++i;
        }
        return n3;
    }
    
    static int c(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += agym.O(agzj.d(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += agym.O((int)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int d(final List list) {
        return list.size() * 4;
    }
    
    static int e(final List list) {
        return list.size() * 8;
    }
    
    static int f(final int n, final List list, final ahbp ahbp) {
        final int size = list.size();
        int i = 0;
        if (size != 0) {
            int n2 = 0;
            while (i < size) {
                n2 += agym.L(n, (MessageLite)list.get(i), ahbp);
                ++i;
            }
            return n2;
        }
        return 0;
    }
    
    static int g(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += agym.O(agzj.d(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += agym.O((int)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int h(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof ahan) {
            final ahan ahan = (ahan)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += agym.ag(ahan.a(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += agym.ag((long)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int i(final int n, final Object o, final ahbp ahbp) {
        if (o instanceof ahah) {
            return agym.Q(n, (ahah)o);
        }
        return agym.ac(n) + agym.U((MessageLite)o, ahbp);
    }
    
    static int j(int n, final List list, final ahbp ahbp) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        n = agym.ac(n) * size;
        while (i < size) {
            final Object value = list.get(i);
            int n2;
            if (value instanceof ahah) {
                n2 = agym.R((ahah)value);
            }
            else {
                n2 = agym.U((MessageLite)value, ahbp);
            }
            n += n2;
            ++i;
        }
        return n;
    }
    
    static int k(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += agym.X(agzj.d(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += agym.X((int)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int l(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof ahan) {
            final ahan ahan = (ahan)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += agym.Z(ahan.a(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += agym.Z((long)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int m(int n, final List list) {
        final int size = list.size();
        int n2 = 0;
        final int n3 = 0;
        if (size == 0) {
            return 0;
        }
        final int n4 = n = agym.ac(n) * size;
        int n6;
        if (list instanceof ahaj) {
            final ahaj ahaj = (ahaj)list;
            n = n4;
            int n5 = n3;
            while (true) {
                n6 = n;
                if (n5 >= size) {
                    break;
                }
                final Object f = ahaj.f(n5);
                int n7;
                if (f instanceof agyc) {
                    n7 = agym.J((agyc)f);
                }
                else {
                    n7 = agym.ab((String)f);
                }
                n += n7;
                ++n5;
            }
        }
        else {
            while (true) {
                n6 = n;
                if (n2 >= size) {
                    break;
                }
                final Object value = list.get(n2);
                int n8;
                if (value instanceof agyc) {
                    n8 = agym.J((agyc)value);
                }
                else {
                    n8 = agym.ab((String)value);
                }
                n += n8;
                ++n2;
            }
        }
        return n6;
    }
    
    static int n(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += agym.ae(agzj.d(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += agym.ae((int)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    static int o(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof ahan) {
            final ahan ahan = (ahan)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += agym.ag(ahan.a(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            int n6 = n;
            while (true) {
                n4 = n5;
                if (n6 >= size) {
                    break;
                }
                n5 += agym.ag((long)list.get(n6));
                ++n6;
            }
        }
        return n4;
    }
    
    public static void p(final Class clazz) {
        if (!agzi.class.isAssignableFrom(clazz)) {
            final Class d = ahbq.d;
            if (d != null) {
                if (!d.isAssignableFrom(clazz)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
        }
    }
    
    static boolean q(final Object o, final Object o2) {
        boolean b = true;
        if (o != o2) {
            if (o != null) {
                if (!o.equals(o2)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    static int r(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * agym.ay(n);
    }
    
    static int s(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + size * agym.ac(n);
    }
    
    static int t(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * agym.aA(n);
    }
    
    static int u(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * agym.aB(n);
    }
    
    static int v(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + size * agym.ac(n);
    }
    
    static int w(final int n, final List list) {
        if (list.size() == 0) {
            return 0;
        }
        return h(list) + list.size() * agym.ac(n);
    }
    
    static int x(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + size * agym.ac(n);
    }
    
    static int y(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + size * agym.ac(n);
    }
    
    static int z(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + size * agym.ac(n);
    }
}
