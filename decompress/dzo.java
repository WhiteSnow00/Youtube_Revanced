import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzo
{
    public int a;
    public final Object b;
    public Object c;
    public Object d;
    
    private dzo() {
        this.b = new ArrayList();
    }
    
    public dzo(final byte[] array) {
        this.b = new byte[256];
        this.a = 0;
    }
    
    public static dzo c(final dzt dzt, final boolean b) {
        return d(0, dzt, b);
    }
    
    static dzo d(final int a, final dzt c, final boolean b) {
        final dzo dzo = new dzo();
        dzo.a = a;
        dzo.c = c;
        dzn d;
        if (b) {
            d = new dzn();
        }
        else {
            d = null;
        }
        dzo.d = d;
        return dzo;
    }
    
    static dzo e(final dzo dzo, final dzo dzo2) {
        Object d = null;
        int a = 0;
        final dzo c = c(null, false);
        int a2;
        if (dzo != null) {
            a2 = dzo.a;
        }
        else {
            a2 = 0;
        }
        if (dzo2 != null) {
            a = dzo2.a;
        }
        final Object b = c.b;
        Object d2;
        if (dzo != null) {
            d2 = dzo.d;
        }
        else {
            d2 = null;
        }
        if (dzo2 != null) {
            d = dzo2.d;
        }
        if (dzo != null) {
            final Iterator<Object> iterator = ((List<Object>)dzo.b).iterator();
            while (iterator.hasNext()) {
                ((List<dzm>)b).add(dzm.d(iterator.next()));
            }
        }
        if (dzo2 != null) {
            final Iterator<Object> iterator2 = ((List<Object>)dzo2.b).iterator();
            while (iterator2.hasNext()) {
                ((List<dzm>)b).add(dzm.e(iterator2.next(), a2));
            }
        }
        c.a = a2 + a;
        if (d2 == null) {
            d2 = d;
        }
        else if (d != null) {
            d2 = ((dzn)d2).a((dzn)d);
        }
        c.d = d2;
        return c;
    }
    
    public static List o(final List list, final cya cya) {
        if (cya == null) {
            return list;
        }
        final ArrayList list2 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); ++i) {
            list2.add(new efk((eei)list.get(i), cya, null, null, null));
        }
        return list2;
    }
    
    public final int a() {
        return ((List)this.b).size();
    }
    
    public final dzm b(final int n) {
        return ((List<dzm>)this.b).get(n);
    }
    
    public final void f(final dzm dzm) {
        ((List<dzm>)this.b).add(dzm);
        final int b = dzm.b;
        int e;
        if (b != -3) {
            if (b != -1) {
                if (b != 1) {
                    if (b != 3) {
                        e = 0;
                    }
                    else {
                        e = -1;
                    }
                }
                else {
                    e = 1;
                }
            }
            else {
                e = dzm.e;
            }
        }
        else {
            e = -dzm.e;
        }
        this.a += e;
        final Object d = this.d;
        if (d != null) {
            int e2 = 0;
            int n = 0;
            int e3 = 0;
            int n2 = 0;
            int e4 = 0;
            int n3 = 0;
            int e5 = 0;
            Label_0266: {
                Label_0263: {
                    Label_0260: {
                        if (b != -3) {
                            if (b == -2) {
                                e2 = dzm.e;
                                n = 0;
                                e3 = 0;
                                n2 = 0;
                                e4 = 0;
                                n3 = 0;
                                break Label_0263;
                            }
                            Label_0214: {
                                if (b != -1) {
                                    if (b == 0) {
                                        e5 = dzm.e;
                                        n = 0;
                                        e3 = 0;
                                        n2 = 0;
                                        e4 = 0;
                                        n3 = 0;
                                        e2 = 0;
                                        break Label_0266;
                                    }
                                    if (b != 1) {
                                        n = 0;
                                        final int n4 = 0;
                                        e3 = 0;
                                        final int n5 = 0;
                                        if (b != 2) {
                                            final int n6 = 1;
                                            n = n4;
                                            e3 = n5;
                                            n2 = n6;
                                            break Label_0214;
                                        }
                                        n2 = 0;
                                        e4 = 0;
                                        n3 = 1;
                                        break Label_0260;
                                    }
                                    else {
                                        n = 1;
                                        e3 = 0;
                                    }
                                }
                                else {
                                    e3 = dzm.e;
                                    n = 0;
                                }
                                n2 = 0;
                            }
                            e4 = 0;
                        }
                        else {
                            e4 = dzm.e;
                            n = 0;
                            e3 = 0;
                            n2 = 0;
                        }
                        n3 = 0;
                    }
                    e2 = 0;
                }
                e5 = 0;
            }
            this.d = ((dzn)d).a(new dzn(e, n, e3, n2, e4, n3, e2, e5));
        }
    }
    
    public final void g(final int n, final Object o) {
        this.f(dzm.f(n, o));
    }
    
    final void h() {
        for (final dzm dzm : this.b) {
            dzm.f = null;
            dzm.g = null;
            dzm.h = null;
            dzm.i = null;
        }
        ((List)this.b).clear();
        this.d = null;
        this.a = 0;
    }
    
    public final int i() {
        int n;
        try {
            n = (((ByteBuffer)this.c).get() & 0xFF);
        }
        catch (final Exception ex) {
            ((dcw)this.d).b = 1;
            n = 0;
        }
        return n;
    }
    
    public final int j() {
        return ((ByteBuffer)this.c).getShort();
    }
    
    public final void k() {
        final int i = this.i();
        this.a = i;
        if (i > 0) {
            int n = 0;
            try {
                while (true) {
                    final int a = this.a;
                    if (n >= a) {
                        break;
                    }
                    final int n2 = a - n;
                    ((ByteBuffer)this.c).get((byte[])this.b, n, n2);
                    n += n2;
                }
            }
            catch (final Exception ex) {
                ((dcw)this.d).b = 1;
            }
        }
    }
    
    public final void l() {
        int i;
        do {
            i = this.i();
            ((ByteBuffer)this.c).position(Math.min(((ByteBuffer)this.c).position() + i, ((ByteBuffer)this.c).limit()));
        } while (i > 0);
    }
    
    public final boolean m() {
        return ((dcw)this.d).b != 0;
    }
    
    public final int[] n(final int n) {
        final byte[] array = new byte[n * 3];
        int[] array3;
        try {
            ((ByteBuffer)this.c).get(array);
            final int[] array2 = new int[256];
            int n2 = 0;
            int n3 = 0;
            while (true) {
                array3 = array2;
                if (n2 >= n) {
                    break;
                }
                final int n4 = n3 + 1;
                final byte b = array[n3];
                final int n5 = n4 + 1;
                array2[n2] = ((b & 0xFF) << 16 | 0xFF000000 | (array[n4] & 0xFF) << 8 | (array[n5] & 0xFF));
                n3 = n5 + 1;
                ++n2;
            }
        }
        catch (final BufferUnderflowException ex) {
            array3 = null;
            ((dcw)this.d).b = 1;
        }
        return array3;
    }
    
    public final void p(final int n, final eei eei, final cya cya, final Object o) {
        final Object c = this.c;
        if (c != null) {
            eei.p((Object)((dzt)c).k);
        }
        this.f(dzm.c(1, n, (eei)new efk(eei, cya, null, null, null), null, o));
    }
    
    public final void q(final int n, final eei eei, final cya cya, final Object o, final Object o2) {
        this.f(dzm.c(2, n, (eei)new efk(eei, cya, null, null, null), o, o2));
    }
}
