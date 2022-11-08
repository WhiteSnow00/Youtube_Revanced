import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agyv
{
    public static final agyv a;
    final ahbx b;
    public boolean c;
    public boolean d;
    
    static {
        a = new agyv(null);
    }
    
    private agyv() {
        this.b = ahbx.b(16);
    }
    
    private agyv(final byte[] array) {
        final ahbx b = ahbx.b(0);
        this.b = b;
        this.f();
        this.f();
    }
    
    public static int a(final ahcm ahcm, int ac, final Object o) {
        final int n = ac = agym.ac(ac);
        if (ahcm == ahcm.j) {
            agzz.j((MessageLite)o);
            ac = n + n;
        }
        return ac + b(ahcm, o);
    }
    
    static int b(final ahcm ahcm, final Object o) {
        final ahcm a = ahcm.a;
        final ahcn a2 = ahcn.a;
        switch (ahcm.ordinal()) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 17: {
                return agym.Z((long)o);
            }
            case 16: {
                return agym.X((int)o);
            }
            case 15: {
                ((Long)o).longValue();
                final boolean e = agym.e;
                return 8;
            }
            case 14: {
                ((Integer)o).intValue();
                final boolean e2 = agym.e;
                return 4;
            }
            case 13: {
                if (o instanceof agzm) {
                    return agym.O(((agzm)o).getNumber());
                }
                return agym.O((int)o);
            }
            case 12: {
                return agym.ae((int)o);
            }
            case 11: {
                if (o instanceof agyc) {
                    return agym.J((agyc)o);
                }
                return agym.H((byte[])o);
            }
            case 10: {
                if (o instanceof ahag) {
                    return agym.R((ahah)o);
                }
                return agym.T((MessageLite)o);
            }
            case 9: {
                return agym.M((MessageLite)o);
            }
            case 8: {
                if (o instanceof agyc) {
                    return agym.J((agyc)o);
                }
                return agym.ab((String)o);
            }
            case 7: {
                ((Boolean)o).booleanValue();
                final boolean e3 = agym.e;
                return 1;
            }
            case 6: {
                ((Integer)o).intValue();
                final boolean e4 = agym.e;
                return 4;
            }
            case 5: {
                ((Long)o).longValue();
                final boolean e5 = agym.e;
                return 8;
            }
            case 4: {
                return agym.O((int)o);
            }
            case 3: {
                return agym.ag((long)o);
            }
            case 2: {
                return agym.ag((long)o);
            }
            case 1: {
                ((Float)o).floatValue();
                final boolean e6 = agym.e;
                return 4;
            }
            case 0: {
                ((Double)o).doubleValue();
                final boolean e7 = agym.e;
                return 8;
            }
        }
    }
    
    public static void h(final agym agym, final ahcm ahcm, final int n, final Object o) {
        if (ahcm == ahcm.j) {
            final MessageLite messageLite = (MessageLite)o;
            agzz.j(messageLite);
            agym.B(n, 3);
            agym.at(messageLite);
            agym.B(n, 4);
            return;
        }
        agym.B(n, ahcm.t);
        final ahcn a = ahcn.a;
        switch (ahcm.ordinal()) {
            default: {
                return;
            }
            case 17: {
                agym.ax((long)o);
                return;
            }
            case 16: {
                agym.av((int)o);
                return;
            }
            case 15: {
                agym.s((long)o);
                return;
            }
            case 14: {
                agym.q((int)o);
                return;
            }
            case 13: {
                if (o instanceof agzm) {
                    agym.u(((agzm)o).getNumber());
                    return;
                }
                agym.u((int)o);
                return;
            }
            case 12: {
                agym.D((int)o);
                return;
            }
            case 11: {
                if (o instanceof agyc) {
                    agym.o((agyc)o);
                    return;
                }
                final byte[] array = (byte[])o;
                agym.G(array, array.length);
                return;
            }
            case 10: {
                agym.w((MessageLite)o);
                return;
            }
            case 9: {
                agym.at((MessageLite)o);
                return;
            }
            case 8: {
                if (o instanceof agyc) {
                    agym.o((agyc)o);
                    return;
                }
                agym.A((String)o);
                return;
            }
            case 7: {
                agym.j((byte)(byte)(((boolean)o) ? 1 : 0));
                return;
            }
            case 6: {
                agym.q((int)o);
                return;
            }
            case 5: {
                agym.s((long)o);
                return;
            }
            case 4: {
                agym.u((int)o);
                return;
            }
            case 3: {
                agym.F((long)o);
                return;
            }
            case 2: {
                agym.F((long)o);
                return;
            }
            case 1: {
                agym.as((float)o);
                return;
            }
            case 0: {
                agym.aq((double)o);
            }
        }
    }
    
    public static int k(final agzf agzf, final Object o) {
        final ahcm c = agzf.c;
        final int b = agzf.b;
        if (!agzf.d) {
            return a(c, b, o);
        }
        final List list = (List)o;
        final boolean e = agzf.e;
        final int n = 0;
        int n2 = 0;
        if (!e) {
            final Iterator iterator = list.iterator();
            int n3 = n;
            while (iterator.hasNext()) {
                n3 += a(c, b, iterator.next());
            }
            return n3;
        }
        if (list.isEmpty()) {
            return 0;
        }
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            n2 += b(c, iterator2.next());
        }
        return agym.ac(b) + n2 + agym.ae(n2);
    }
    
    private static Object o(final Object o) {
        if (o instanceof ahbb) {
            return ((ahbb)o).a();
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            final int length = array.length;
            final byte[] array2 = new byte[length];
            System.arraycopy(array, 0, array2, 0, length);
            return array2;
        }
        return o;
    }
    
    private static boolean p(final Map.Entry entry) {
        final agzf agzf = entry.getKey();
        if (agzf.a() == ahcn.i) {
            if (!agzf.d) {
                return q(entry.getValue());
            }
            final Iterator iterator = ((List)entry.getValue()).iterator();
            while (iterator.hasNext()) {
                if (!q(iterator.next())) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean q(final Object o) {
        if (o instanceof ahax) {
            return ((ahax)o).isInitialized();
        }
        if (o instanceof ahag) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
    
    private static final void r(final agzf agzf, final Object o) {
        final ahcm c = agzf.c;
        agzz.h(o);
        final ahcm a = ahcm.a;
        final ahcn a2 = ahcn.a;
        boolean b = false;
        switch (c.s.ordinal()) {
            default: {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", agzf.b, agzf.c.s, o.getClass().getName()));
            }
            case 8: {
                if (o instanceof MessageLite) {
                    return;
                }
                if (o instanceof ahag) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", agzf.b, agzf.c.s, o.getClass().getName()));
            }
            case 7: {
                if (o instanceof Integer) {
                    return;
                }
                if (o instanceof agzm) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", agzf.b, agzf.c.s, o.getClass().getName()));
            }
            case 6: {
                if (o instanceof agyc) {
                    return;
                }
                if (o instanceof byte[]) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", agzf.b, agzf.c.s, o.getClass().getName()));
            }
            case 5: {
                b = (o instanceof String);
                break;
            }
            case 4: {
                b = (o instanceof Boolean);
                break;
            }
            case 3: {
                b = (o instanceof Double);
                break;
            }
            case 2: {
                b = (o instanceof Float);
                break;
            }
            case 1: {
                b = (o instanceof Long);
                break;
            }
            case 0: {
                b = (o instanceof Integer);
                break;
            }
        }
        if (!b) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", agzf.b, agzf.c.s, o.getClass().getName()));
        }
    }
    
    public final int c(final Map.Entry entry) {
        final agzf agzf = entry.getKey();
        final V value = entry.getValue();
        if (agzf.a() == ahcn.i && !agzf.d && !agzf.e) {
            int n;
            int q;
            if (value instanceof ahag) {
                final int b = entry.getKey().b;
                final ahag ahag = (ahag)value;
                final int ac = agym.ac(1);
                n = ac + ac + agym.ad(2, b);
                q = agym.Q(3, (ahah)ahag);
            }
            else {
                final int b2 = entry.getKey().b;
                final MessageLite messageLite = (MessageLite)value;
                final int ac2 = agym.ac(1);
                n = ac2 + ac2 + agym.ad(2, b2);
                q = agym.ac(3) + agym.T(messageLite);
            }
            return n + q;
        }
        return k(agzf, value);
    }
    
    public final agyv d() {
        final agyv agyv = new agyv();
        for (int i = 0; i < this.b.a(); ++i) {
            final Map.Entry f = this.b.f(i);
            agyv.n((agzf)f.getKey(), f.getValue());
        }
        for (final Map.Entry<agzf, V> entry : this.b.c()) {
            agyv.n(entry.getKey(), entry.getValue());
        }
        agyv.d = this.d;
        return agyv;
    }
    
    public final Iterator e() {
        if (this.d) {
            return new ahaf(this.b.entrySet().iterator());
        }
        return this.b.entrySet().iterator();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof agyv && this.b.equals(((agyv)o).b));
    }
    
    public final void f() {
        if (!this.c) {
            final int n = 0;
            for (int i = 0; i < this.b.a(); ++i) {
                final Map.Entry f = this.b.f(i);
                if (f.getValue() instanceof agzi) {
                    f.getValue().makeImmutable();
                }
            }
            final ahbx b = this.b;
            if (!b.c) {
                for (int j = n; j < b.a(); ++j) {
                    final Map.Entry f2 = b.f(j);
                    if (((agzf)f2.getKey()).d) {
                        f2.setValue(Collections.unmodifiableList((List<?>)f2.getValue()));
                    }
                }
                for (final Map.Entry<agzf, V> entry : b.c()) {
                    if (entry.getKey().d) {
                        entry.setValue((V)Collections.unmodifiableList((List<?>)entry.getValue()));
                    }
                }
            }
            if (!b.c) {
                Map<Object, Object> b2;
                if (b.b.isEmpty()) {
                    b2 = Collections.emptyMap();
                }
                else {
                    b2 = Collections.unmodifiableMap((Map<?, ?>)b.b);
                }
                b.b = b2;
                Map<Object, Object> d;
                if (b.d.isEmpty()) {
                    d = Collections.emptyMap();
                }
                else {
                    d = Collections.unmodifiableMap((Map<?, ?>)b.d);
                }
                b.d = d;
                b.c = true;
            }
            this.c = true;
        }
    }
    
    public final void g(final Map.Entry entry) {
        final agzf agzf = entry.getKey();
        final V value = entry.getValue();
        if (value instanceof ahag) {
            final ahag ahag = (ahag)value;
            throw null;
        }
        if (agzf.d) {
            Object l;
            if ((l = this.l(agzf)) == null) {
                l = new ArrayList<Object>();
            }
            final Iterator iterator = ((List)value).iterator();
            while (iterator.hasNext()) {
                ((List<Object>)l).add(o(iterator.next()));
            }
            this.b.d(agzf, l);
            return;
        }
        if (agzf.a() != ahcn.i) {
            this.b.d(agzf, o(value));
            return;
        }
        final Object i = this.l(agzf);
        if (i == null) {
            this.b.d(agzf, o(value));
            return;
        }
        if (!(i instanceof ahbb)) {
            this.b.d(agzf, ((ahaw)((agza)((MessageLite)i).toBuilder()).mergeFrom((agzi)value)).build());
            return;
        }
        final ahbb ahbb = (ahbb)i;
        final ahbb ahbb2 = (ahbb)value;
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    final boolean i() {
        return this.b.isEmpty();
    }
    
    public final boolean j() {
        for (int i = 0; i < this.b.a(); ++i) {
            if (!p(this.b.f(i))) {
                return false;
            }
        }
        final Iterator iterator = this.b.c().iterator();
        while (iterator.hasNext()) {
            if (!p((Map.Entry)iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final Object l(final agzf agzf) {
        final Object value = this.b.get(agzf);
        if (!(value instanceof ahag)) {
            return value;
        }
        final ahag ahag = (ahag)value;
        throw null;
    }
    
    public final void m(final agzf agzf, final Object o) {
        if (agzf.d) {
            r(agzf, o);
            final Object l = this.l(agzf);
            List list2;
            if (l == null) {
                final ArrayList list = new ArrayList();
                this.b.d(agzf, list);
                list2 = list;
            }
            else {
                list2 = (List)l;
            }
            list2.add(o);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }
    
    public final void n(final agzf agzf, Object o) {
        if (agzf.d) {
            if (!(o instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            final ArrayList list = new ArrayList();
            list.addAll((Collection)o);
            for (int size = list.size(), i = 0; i < size; ++i) {
                r(agzf, list.get(i));
            }
            o = list;
        }
        else {
            r(agzf, o);
        }
        if (o instanceof ahag) {
            this.d = true;
        }
        this.b.d(agzf, o);
    }
}
