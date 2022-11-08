import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzn
{
    public int a;
    public final Object b;
    public Object c;
    public Object d;
    
    private dzn() {
        this.b = new ArrayList();
    }
    
    public dzn(final byte[] array) {
        this.b = new byte[256];
        this.a = 0;
    }
    
    public static dzn c(final dzs dzs, final boolean b) {
        return d(0, dzs, b);
    }
    
    static dzn d(final int a, final dzs c, final boolean b) {
        final dzn dzn = new dzn();
        dzn.a = a;
        dzn.c = c;
        dzm d;
        if (b) {
            d = new dzm();
        }
        else {
            d = null;
        }
        dzn.d = d;
        return dzn;
    }
    
    static dzn e(final dzn dzn, final dzn dzn2) {
        Object d = null;
        int a = 0;
        final dzn c = c(null, false);
        int a2;
        if (dzn != null) {
            a2 = dzn.a;
        }
        else {
            a2 = 0;
        }
        if (dzn2 != null) {
            a = dzn2.a;
        }
        final Object b = c.b;
        Object d2;
        if (dzn != null) {
            d2 = dzn.d;
        }
        else {
            d2 = null;
        }
        if (dzn2 != null) {
            d = dzn2.d;
        }
        if (dzn != null) {
            final Iterator<Object> iterator = ((List<Object>)dzn.b).iterator();
            while (iterator.hasNext()) {
                ((List<dzl>)b).add(dzl.d(iterator.next()));
            }
        }
        if (dzn2 != null) {
            final Iterator<Object> iterator2 = ((List<Object>)dzn2.b).iterator();
            while (iterator2.hasNext()) {
                ((List<dzl>)b).add(dzl.e(iterator2.next(), a2));
            }
        }
        c.a = a2 + a;
        if (d2 == null) {
            d2 = d;
        }
        else if (d != null) {
            d2 = ((dzm)d2).a((dzm)d);
        }
        c.d = d2;
        return c;
    }
    
    public static List o(final List list, final cxz cxz) {
        if (cxz == null) {
            return list;
        }
        final ArrayList list2 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); ++i) {
            list2.add(new efj((eeh)list.get(i), cxz, (byte[])null, (byte[])null, (byte[])null));
        }
        return list2;
    }
    
    public final int a() {
        return ((List)this.b).size();
    }
    
    public final dzl b(final int n) {
        return ((List<dzl>)this.b).get(n);
    }
    
    public final void f(final dzl dzl) {
        ((List<dzl>)this.b).add(dzl);
        final int b = dzl.b;
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
                e = dzl.e;
            }
        }
        else {
            e = -dzl.e;
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
            Label_0256: {
                Label_0253: {
                    Label_0250: {
                        if (b != -3) {
                            if (b == -2) {
                                e2 = dzl.e;
                                n = 0;
                                e3 = 0;
                                n2 = 0;
                                e4 = 0;
                                n3 = 0;
                                break Label_0253;
                            }
                            Label_0204: {
                                if (b != -1) {
                                    if (b == 0) {
                                        e5 = dzl.e;
                                        n = 0;
                                        e3 = 0;
                                        n2 = 0;
                                        e4 = 0;
                                        n3 = 0;
                                        e2 = 0;
                                        break Label_0256;
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
                                            break Label_0204;
                                        }
                                        n2 = 0;
                                        e4 = 0;
                                        n3 = 1;
                                        break Label_0250;
                                    }
                                    else {
                                        n = 1;
                                        e3 = 0;
                                    }
                                }
                                else {
                                    e3 = dzl.e;
                                    n = 0;
                                }
                                n2 = 0;
                            }
                            e4 = 0;
                        }
                        else {
                            e4 = dzl.e;
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
            this.d = ((dzm)d).a(new dzm(e, n, e3, n2, e4, n3, e2, e5));
        }
    }
    
    public final void g(final int n, final Object o) {
        this.f(dzl.f(n, o));
    }
    
    final void h() {
        for (final dzl dzl : this.b) {
            dzl.f = null;
            dzl.g = null;
            dzl.h = null;
            dzl.i = null;
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
            ((dcv)this.d).b = 1;
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
                ((dcv)this.d).b = 1;
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
        return ((dcv)this.d).b != 0;
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
            ((dcv)this.d).b = 1;
        }
        return array3;
    }
    
    public final void p(final int n, final eeh eeh, final cxz cxz, final Object o) {
        final Object c = this.c;
        if (c != null) {
            eeh.p((Object)((dzs)c).k);
        }
        this.f(dzl.c(1, n, (eeh)new efj(eeh, cxz, (byte[])null, (byte[])null, (byte[])null), null, o));
    }
    
    public final void q(final int n, final eeh eeh, final cxz cxz, final Object o, final Object o2) {
        this.f(dzl.c(2, n, (eeh)new efj(eeh, cxz, (byte[])null, (byte[])null, (byte[])null), o, o2));
    }
}
