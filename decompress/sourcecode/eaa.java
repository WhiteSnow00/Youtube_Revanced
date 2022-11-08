import android.view.ViewParent;
import java.util.ConcurrentModificationException;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.Iterator;
import java.io.IOException;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.ArrayList;
import com.facebook.litho.ComponentTree;
import android.util.SparseArray;
import android.os.Handler;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.media.MediaCodec$CryptoInfo;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eaa
{
    public final Object a;
    public final Object b;
    
    public eaa() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public eaa(final aja b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        final aja aja = b;
        this.a = b.a;
    }
    
    public eaa(final MediaCodec$CryptoInfo b) {
        this.b = b;
        this.a = new MediaCodec$CryptoInfo$Pattern(0, 0);
    }
    
    public eaa(Handler a, final bhd b) {
        if (b != null) {
            dk.d((Object)a);
        }
        else {
            a = null;
        }
        this.a = a;
        this.b = b;
    }
    
    public eaa(final Handler a, final bkm b) {
        this.a = a;
        this.b = b;
    }
    
    public eaa(final Handler b, final bnz a) {
        this.b = b;
        this.a = a;
    }
    
    public eaa(final ardu a, final cxz b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
    }
    
    public eaa(final ayc b, final SparseArray sparseArray) {
        this.b = b;
        final SparseArray a = new SparseArray(b.b());
        for (int i = 0; i < b.b(); ++i) {
            final int a2 = b.a(i);
            final bga bga = (bga)sparseArray.get(a2);
            dk.d((Object)bga);
            a.append(a2, (Object)bga);
        }
        this.a = a;
    }
    
    public eaa(final ayf b, final bkq a) {
        this.b = b;
        this.a = a;
    }
    
    public eaa(final ComponentTree a) {
        this.a = a;
        this.b = new ArrayList(2);
    }
    
    public eaa(final cvk b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public eaa(final Class b, final ddb a) {
        this.b = b;
        this.a = a;
    }
    
    public eaa(final Class b, final ddr a) {
        this.b = b;
        this.a = a;
    }
    
    public eaa(final String b, final String a) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public eaa(final String a, final String b, final byte[] array) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public eaa(final String b, final String a, final byte[] array, final byte[] array2) {
        a.getClass();
        this.b = b;
        this.a = a;
    }
    
    public eaa(final String a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    public eaa(final List a) {
        this.a = a;
        this.b = new buc[a.size()];
    }
    
    public eaa(final byte[] array) {
        this.a = new ArrayList();
        this.b = new HashMap();
    }
    
    public eaa(final byte[] b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public eaa(final byte[] array, final byte[] array2) {
        this.b = new AtomicReference();
        this.a = new abg();
    }
    
    public eaa(final float[] a, final int[] b) {
        this.a = a;
        this.b = b;
    }
    
    private eaa(final String[] b, final atzb a) {
        this.b = b;
        this.a = a;
    }
    
    private final List A(final String s) {
        synchronized (this) {
            if (!((List)this.a).contains(s)) {
                ((List<String>)this.a).add(s);
            }
            final List list = ((Map<K, List>)this.b).get(s);
            if (list == null) {
                final ArrayList list2 = new ArrayList();
                ((Map<String, ArrayList>)this.b).put(s, list2);
                return list2;
            }
            return list;
        }
    }
    
    public static void b(final Map map, final Map map2, final String s) {
        final List list = map2.get(s);
        final List list2 = map.remove(s);
        if (list != null && list2 != null) {
            list2.removeAll(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            map.put(s, list2);
        }
    }
    
    public static eaa y(final String... array) {
        try {
            final int length = array.length;
            final atyx[] array2 = new atyx[length];
            final atyu atyu = new atyu();
            final int n = 0;
            for (int i = 0; i < array.length; ++i) {
                final String s = array[i];
                final String[] a = czf.a;
                ((atyv)atyu).q();
                final int length2 = s.length();
                int j = 0;
                int n2 = 0;
                while (j < length2) {
                    final char char1 = s.charAt(j);
                    int n3 = 0;
                    Label_0178: {
                        String s2;
                        if (char1 < '\u0080') {
                            if ((s2 = a[char1]) == null) {
                                n3 = n2;
                                break Label_0178;
                            }
                        }
                        else if (char1 == '\u2028') {
                            s2 = "\\u2028";
                        }
                        else {
                            n3 = n2;
                            if (char1 != '\u2029') {
                                break Label_0178;
                            }
                            s2 = "\\u2029";
                        }
                        if (n2 < j) {
                            atyu.s(s, n2, j);
                        }
                        s2.getClass();
                        atyu.s(s2, 0, s2.length());
                        n3 = j + 1;
                    }
                    ++j;
                    n2 = n3;
                }
                if (n2 < length2) {
                    atyu.s(s, n2, length2);
                }
                ((atyv)atyu).q();
                atyu.b();
                final long b = atyu.b;
                if (b < 0L || b > 2147483647L) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("byteCount: ");
                    sb.append(b);
                    throw new IllegalArgumentException(sb.toString());
                }
                atyx k;
                if (b >= 4096L) {
                    k = atyu.i((int)b);
                    atyu.l(b);
                }
                else {
                    k = new atyx(atyu.n(b));
                }
                array2[i] = k;
            }
            final String[] array3 = array.clone();
            final atza a2 = atzb.a;
            final List z = aqqn.z((Object[])array2);
            if (z.size() > 1) {
                Collections.sort((List<Comparable>)z);
            }
            final ArrayList list = new ArrayList(length);
            for (final atyx atyx : array2) {
                list.add((Object)(-1));
            }
            final Object[] array4 = list.toArray((Object[])new Integer[0]);
            array4.getClass();
            final Integer[] array5 = (Integer[])array4;
            final Integer[] copy = Arrays.copyOf(array5, array5.length);
            copy.getClass();
            ArrayList list2;
            if (copy.length == 0) {
                list2 = new ArrayList();
            }
            else {
                list2 = new ArrayList((Collection)new atkf((Object[])copy, true));
            }
            int n4 = 0;
            int n5 = 0;
        Label_0488:
            while (n4 < length) {
                final atyx atyx2 = array2[n4];
                int size = z.size();
                final int size2 = z.size();
                if (size < 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("fromIndex (");
                    sb2.append(0);
                    sb2.append(") is greater than toIndex (");
                    sb2.append(size);
                    sb2.append(").");
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (size <= size2) {
                    --size;
                    int n6 = 0;
                    while (true) {
                        while (n6 <= size) {
                            final int n7 = n6 + size >>> 1;
                            final int c = atwa.c(z.get(n7), atyx2);
                            if (c < 0) {
                                n6 = n7 + 1;
                            }
                            else {
                                final int n8 = n7;
                                if (c <= 0) {
                                    list2.set(n8, n5);
                                    ++n4;
                                    ++n5;
                                    continue Label_0488;
                                }
                                size = n7 - 1;
                            }
                        }
                        final int n8 = -(n6 + 1);
                        continue;
                    }
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("toIndex (");
                sb3.append(size);
                sb3.append(") is greater than size (");
                sb3.append(size2);
                sb3.append(").");
                throw new IndexOutOfBoundsException(sb3.toString());
            }
            if (((atyx)z.get(0)).b() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int n10;
            for (int n9 = 0; n9 < z.size(); n9 = n10) {
                final atyx atyx3 = z.get(n9);
                int n11;
                n10 = (n11 = n9 + 1);
                while (n11 < z.size()) {
                    final atyx atyx4 = z.get(n11);
                    atyx3.getClass();
                    if (!atyx4.g(atyx3, atyx3.b())) {
                        break;
                    }
                    if (atyx4.b() == atyx3.b()) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("duplicate option: ");
                        sb4.append(atyx4);
                        throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(atyx4)));
                    }
                    if (((Number)list2.get(n11)).intValue() > ((Number)list2.get(n9)).intValue()) {
                        z.remove(n11);
                        list2.remove(n11);
                    }
                    else {
                        ++n11;
                    }
                }
            }
            final atyu atyu2 = new atyu();
            a2.a(0L, atyu2, 0, z, 0, z.size(), list2);
            final int[] array6 = new int[(int)atza.b(atyu2)];
            int n12 = n;
            while (true) {
                final long b2 = atyu2.b;
                if (b2 == 0L) {
                    final atyx[] copy2 = Arrays.copyOf(array2, length);
                    copy2.getClass();
                    return new eaa(array3, new atzb((atyx[])copy2, array6));
                }
                if (b2 < 4L) {
                    throw new EOFException();
                }
                final atze a3 = atyu2.a;
                a3.getClass();
                final int b3 = a3.b;
                final int c2 = a3.c;
                int n13;
                if (c2 - b3 < 4L) {
                    n13 = ((atyu2.b() & 0xFF) << 24 | (atyu2.b() & 0xFF) << 16 | (atyu2.b() & 0xFF) << 8 | (atyu2.b() & 0xFF));
                }
                else {
                    final byte[] a4 = a3.a;
                    final int n14 = b3 + 1;
                    final byte b4 = a4[b3];
                    final int n15 = n14 + 1;
                    final byte b5 = a4[n14];
                    final int n16 = n15 + 1;
                    final byte b6 = a4[n15];
                    final int b7 = n16 + 1;
                    final byte b8 = a4[n16];
                    atyu2.b = b2 - 4L;
                    if (b7 == c2) {
                        atyu2.a = a3.a();
                        atzf.b(a3);
                    }
                    else {
                        a3.b = b7;
                    }
                    n13 = ((b8 & 0xFF) | ((b5 & 0xFF) << 16 | (b4 & 0xFF) << 24 | (b6 & 0xFF) << 8));
                }
                array6[n12] = n13;
                ++n12;
            }
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static void z(final String s, final ardu ardu, final Map map) {
        List list;
        if ((list = map.get(s)) == null) {
            list = new ArrayList();
            map.put(s, list);
        }
        list.add(ardu);
    }
    
    public final eaa a() {
        final eaa eaa = new eaa();
        if (((Map)this.a).isEmpty()) {
            return eaa;
        }
        for (final String s : ((Map<String, V>)this.a).keySet()) {
            ((Map<String, ArrayList>)eaa.a).put(s, new ArrayList((Collection<?>)((Map<Object, Object>)this.a).get(s)));
        }
        for (final String s2 : ((Map<String, V>)this.b).keySet()) {
            ((Map<String, ArrayList>)eaa.b).put(s2, new ArrayList((Collection<?>)((Map<Object, Object>)this.b).get(s2)));
        }
        return eaa;
    }
    
    public final void c(dvt o) {
        if (!((ComponentTree)this.a).i) {
            return;
        }
        ViewPager viewPager;
        dux dux;
        for (o = ((dvt)o).getParent(); o != null; o = ((ViewParent)o).getParent()) {
            if (o instanceof ViewPager) {
                viewPager = (ViewPager)o;
                dux = new dux((ComponentTree)this.a, viewPager);
                try {
                    viewPager.e((cku)dux);
                }
                catch (final ConcurrentModificationException ex) {
                    ana.I((View)viewPager, (Runnable)new cog(viewPager, dux, 13));
                }
                ((List<dux>)this.b).add(dux);
            }
        }
    }
    
    public final List d(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator<Object> iterator = ((List<Object>)this.a).iterator();
            while (iterator.hasNext()) {
                final List list2 = ((Map<K, List>)this.b).get(iterator.next());
                if (list2 != null) {
                    for (final aja aja : list2) {
                        if (aja.l(clazz, clazz2)) {
                            list.add(aja.b);
                        }
                    }
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final List e(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator<Object> iterator = ((List<Object>)this.a).iterator();
            while (iterator.hasNext()) {
                final List list2 = ((Map<K, List>)this.b).get(iterator.next());
                if (list2 != null) {
                    for (final aja aja : list2) {
                        if (aja.l(clazz, clazz2) && !list.contains(aja.a)) {
                            list.add(aja.a);
                        }
                    }
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void f(final String s, final ddq ddq, final Class clazz, final Class clazz2) {
        synchronized (this) {
            this.A(s).add(new aja(clazz, clazz2, ddq));
        }
    }
    
    public final void g(final List list) {
        monitorenter(this);
        try {
            final ArrayList list2 = new ArrayList((Collection)this.a);
            ((List)this.a).clear();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((List<String>)this.a).add((String)iterator.next());
            }
            for (int size = list2.size(), i = 0; i < size; ++i) {
                final String s = (String)list2.get(i);
                if (!list.contains(s)) {
                    ((List<String>)this.a).add(s);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void h(final ddq ddq, final Class clazz, final Class clazz2) {
        synchronized (this) {
            this.A("legacy_prepend_all").add(0, new aja(clazz, clazz2, ddq));
        }
    }
    
    public final int i() {
        return ((int[])this.b).length;
    }
    
    public final void j(final long n, final bar bar) {
        if (bar.a() < 9) {
            return;
        }
        final int d = bar.d();
        final int d2 = bar.d();
        final int i = bar.i();
        if (d == 434 && d2 == 1195456820 && i == 3) {
            ble.d(n, bar, (buc[])this.b);
        }
    }
    
    public final void k(final btl btl, final can can) {
        for (int i = 0; i < ((buc[])this.b).length; ++i) {
            can.c();
            final buc q = btl.q(can.a(), 3);
            final ayf ayf = ((List<ayf>)this.a).get(i);
            final String n = ayf.n;
            final boolean equals = "application/cea-608".equals(n);
            boolean b = true;
            if (!equals) {
                b = ("application/cea-708".equals(n) && b);
            }
            dk.g(b, (Object)"Invalid closed caption mime type provided: ".concat(String.valueOf(n)));
            final aye aye = new aye();
            aye.a = can.b();
            aye.k = n;
            aye.d = ayf.f;
            aye.c = ayf.e;
            aye.C = ayf.F;
            aye.m = ayf.p;
            q.b(aye.a());
            ((buc[])this.b)[i] = q;
        }
    }
    
    public final void l(final Exception ex) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhc(this, ex, 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void m(final Exception ex) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhc(this, ex, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void n(final String s, final long n, final long n2) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bsm(this, s, n, n2, 1, null, null, null, null));
        }
    }
    
    public final void o(final String s) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhc(this, s, 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void p(final bdx bdx) {
        bdx.a();
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhc(this, bdx, 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void q(final bdx bdx) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhc(this, bdx, 3, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void r(final ayf ayf, final bdy bdy) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new vo(this, ayf, bdy, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void s(final long n) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new gtg(this, n, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void t(final boolean b) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new dmu(this, b, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void u(final int n, final long n2, final long n3) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new brb(this, n, n2, n3, 1, null, null, null, null));
        }
    }
    
    public final int v() {
        return ((ayc)this.b).b();
    }
    
    public final bga w(final int n) {
        final bga bga = (bga)((SparseArray)this.a).get(n);
        dk.d((Object)bga);
        return bga;
    }
    
    public final boolean x(final int n) {
        return ((ayc)this.b).c(n);
    }
}
