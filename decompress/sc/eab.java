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

public final class eab
{
    public final Object a;
    public final Object b;
    
    public eab() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public eab(final ajb b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        final ajb ajb = b;
        this.a = b.a;
    }
    
    public eab(final MediaCodec$CryptoInfo b) {
        this.b = b;
        this.a = new MediaCodec$CryptoInfo$Pattern(0, 0);
    }
    
    public eab(Handler a, final bhe b) {
        if (b != null) {
            dk.d((Object)a);
        }
        else {
            a = null;
        }
        this.a = a;
        this.b = b;
    }
    
    public eab(final Handler a, final bkn b) {
        this.a = a;
        this.b = b;
    }
    
    public eab(final Handler b, final boa a) {
        this.b = b;
        this.a = a;
    }
    
    public eab(final argj a, final cya b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
    }
    
    public eab(final ayd b, final SparseArray sparseArray) {
        this.b = b;
        final SparseArray a = new SparseArray(b.b());
        for (int i = 0; i < b.b(); ++i) {
            final int a2 = b.a(i);
            final bgb bgb = (bgb)sparseArray.get(a2);
            dk.d((Object)bgb);
            a.append(a2, (Object)bgb);
        }
        this.a = a;
    }
    
    public eab(final ayg b, final bkr a) {
        this.b = b;
        this.a = a;
    }
    
    public eab(final ComponentTree a) {
        this.a = a;
        this.b = new ArrayList(2);
    }
    
    public eab(final cvl b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public eab(final Class b, final ddc a) {
        this.b = b;
        this.a = a;
    }
    
    public eab(final Class b, final dds a) {
        this.b = b;
        this.a = a;
    }
    
    public eab(final String b, final String a) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public eab(final String a, final String b, final byte[] array) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public eab(final String b, final String a, final byte[] array, final byte[] array2) {
        a.getClass();
        this.b = b;
        this.a = a;
    }
    
    public eab(final String a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    public eab(final List a) {
        this.a = a;
        this.b = new bud[a.size()];
    }
    
    public eab(final byte[] array) {
        this.a = new ArrayList();
        this.b = new HashMap();
    }
    
    public eab(final byte[] b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public eab(final byte[] array, final byte[] array2) {
        this.b = new AtomicReference();
        this.a = new abh();
    }
    
    public eab(final float[] a, final int[] b) {
        this.a = a;
        this.b = b;
    }
    
    private eab(final String[] b, final atzr a) {
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
    
    public static eab y(final String... array) {
        try {
            final int length = array.length;
            final atzn[] array2 = new atzn[length];
            final atzk atzk = new atzk();
            final int n = 0;
            for (int i = 0; i < array.length; ++i) {
                final String s = array[i];
                final String[] a = czg.a;
                ((atzl)atzk).q();
                final int length2 = s.length();
                int j = 0;
                int n2 = 0;
                while (j < length2) {
                    final char char1 = s.charAt(j);
                    int n3 = 0;
                    Label_0168: {
                        String s2;
                        if (char1 < '\u0080') {
                            s2 = a[char1];
                            n3 = n2;
                            if (s2 == null) {
                                break Label_0168;
                            }
                        }
                        else if (char1 == '\u2028') {
                            s2 = "\\u2028";
                        }
                        else {
                            n3 = n2;
                            if (char1 != '\u2029') {
                                break Label_0168;
                            }
                            s2 = "\\u2029";
                        }
                        if (n2 < j) {
                            atzk.s(s, n2, j);
                        }
                        s2.getClass();
                        atzk.s(s2, 0, s2.length());
                        n3 = j + 1;
                    }
                    ++j;
                    n2 = n3;
                }
                if (n2 < length2) {
                    atzk.s(s, n2, length2);
                }
                ((atzl)atzk).q();
                atzk.b();
                final long b = atzk.b;
                if (b < 0L || b > 2147483647L) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("byteCount: ");
                    sb.append(b);
                    throw new IllegalArgumentException(sb.toString());
                }
                atzn k;
                if (b >= 4096L) {
                    k = atzk.i((int)b);
                    atzk.l(b);
                }
                else {
                    k = new atzn(atzk.n(b));
                }
                array2[i] = k;
            }
            final String[] array3 = array.clone();
            final atzq a2 = atzr.a;
            final List f = atum.f((Object[])array2);
            if (f.size() > 1) {
                Collections.sort((List<Comparable>)f);
            }
            final ArrayList list = new ArrayList(length);
            for (final atzn atzn : array2) {
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
                list2 = new ArrayList((Collection)new atla((Object[])copy, true));
            }
            int n4 = 0;
            int n5 = 0;
        Label_0480:
            while (n4 < length) {
                final atzn atzn2 = array2[n4];
                final int size = f.size();
                final int size2 = f.size();
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
                    int n6 = size - 1;
                    int n7 = 0;
                    while (true) {
                        while (n7 <= n6) {
                            final int n8 = n7 + n6 >>> 1;
                            final int c = atzb.c(f.get(n8), atzn2);
                            if (c < 0) {
                                n7 = n8 + 1;
                            }
                            else {
                                final int n9 = n8;
                                if (c <= 0) {
                                    list2.set(n9, n5);
                                    ++n4;
                                    ++n5;
                                    continue Label_0480;
                                }
                                n6 = n8 - 1;
                            }
                        }
                        final int n9 = -(n7 + 1);
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
            if (((atzn)f.get(0)).b() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int n11;
            for (int n10 = 0; n10 < f.size(); n10 = n11) {
                final atzn atzn3 = f.get(n10);
                int n12;
                n11 = (n12 = n10 + 1);
                while (n12 < f.size()) {
                    final atzn atzn4 = f.get(n12);
                    atzn3.getClass();
                    if (!atzn4.g(atzn3, atzn3.b())) {
                        break;
                    }
                    if (atzn4.b() == atzn3.b()) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("duplicate option: ");
                        sb4.append(atzn4);
                        throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(atzn4)));
                    }
                    if (((Number)list2.get(n12)).intValue() > ((Number)list2.get(n10)).intValue()) {
                        f.remove(n12);
                        list2.remove(n12);
                    }
                    else {
                        ++n12;
                    }
                }
            }
            final atzk atzk2 = new atzk();
            a2.a(0L, atzk2, 0, f, 0, f.size(), list2);
            final int[] array6 = new int[(int)atzq.b(atzk2)];
            int n13 = n;
            while (true) {
                final long b2 = atzk2.b;
                if (b2 == 0L) {
                    final atzn[] copy2 = Arrays.copyOf(array2, length);
                    copy2.getClass();
                    return new eab(array3, new atzr((atzn[])copy2, array6));
                }
                if (b2 < 4L) {
                    throw new EOFException();
                }
                final atzu a3 = atzk2.a;
                a3.getClass();
                final int b3 = a3.b;
                final int c2 = a3.c;
                int n14;
                if (c2 - b3 < 4L) {
                    n14 = ((atzk2.b() & 0xFF) << 24 | (atzk2.b() & 0xFF) << 16 | (atzk2.b() & 0xFF) << 8 | (atzk2.b() & 0xFF));
                }
                else {
                    final byte[] a4 = a3.a;
                    final int n15 = b3 + 1;
                    final byte b4 = a4[b3];
                    final int n16 = n15 + 1;
                    final byte b5 = a4[n15];
                    final int n17 = n16 + 1;
                    final byte b6 = a4[n16];
                    final int b7 = n17 + 1;
                    final byte b8 = a4[n17];
                    atzk2.b = b2 - 4L;
                    if (b7 == c2) {
                        atzk2.a = a3.a();
                        atzv.b(a3);
                    }
                    else {
                        a3.b = b7;
                    }
                    n14 = ((b8 & 0xFF) | ((b5 & 0xFF) << 16 | (b4 & 0xFF) << 24 | (b6 & 0xFF) << 8));
                }
                array6[n13] = n14;
                ++n13;
            }
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static void z(final String s, final argj argj, final Map map) {
        List list;
        if ((list = map.get(s)) == null) {
            list = new ArrayList();
            map.put(s, list);
        }
        list.add(argj);
    }
    
    public final eab a() {
        final eab eab = new eab();
        if (((Map)this.a).isEmpty()) {
            return eab;
        }
        for (final String s : ((Map<String, V>)this.a).keySet()) {
            ((Map<String, ArrayList>)eab.a).put(s, new ArrayList((Collection<?>)((Map<Object, Object>)this.a).get(s)));
        }
        for (final String s2 : ((Map<String, V>)this.b).keySet()) {
            ((Map<String, ArrayList>)eab.b).put(s2, new ArrayList((Collection<?>)((Map<Object, Object>)this.b).get(s2)));
        }
        return eab;
    }
    
    public final void c(dvu o) {
        if (!((ComponentTree)this.a).i) {
            return;
        }
        ViewPager viewPager;
        duy duy;
        for (o = ((dvu)o).getParent(); o != null; o = ((ViewParent)o).getParent()) {
            if (o instanceof ViewPager) {
                viewPager = (ViewPager)o;
                duy = new duy((ComponentTree)this.a, viewPager);
                try {
                    viewPager.e((ckv)duy);
                }
                catch (final ConcurrentModificationException ex) {
                    anb.I((View)viewPager, new coh(viewPager, duy, 13));
                }
                ((List<duy>)this.b).add(duy);
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
                    for (final ajb ajb : list2) {
                        if (ajb.l(clazz, clazz2)) {
                            list.add(ajb.b);
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
                    for (final ajb ajb : list2) {
                        if (ajb.l(clazz, clazz2) && !list.contains(ajb.a)) {
                            list.add(ajb.a);
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
    
    public final void f(final String s, final ddr ddr, final Class clazz, final Class clazz2) {
        synchronized (this) {
            this.A(s).add(new ajb(clazz, clazz2, ddr));
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
    
    public final void h(final ddr ddr, final Class clazz, final Class clazz2) {
        synchronized (this) {
            this.A("legacy_prepend_all").add(0, new ajb(clazz, clazz2, ddr));
        }
    }
    
    public final int i() {
        return ((int[])this.b).length;
    }
    
    public final void j(final long n, final bas bas) {
        if (bas.a() < 9) {
            return;
        }
        final int d = bas.d();
        final int d2 = bas.d();
        final int i = bas.i();
        if (d == 434 && d2 == 1195456820 && i == 3) {
            blf.d(n, bas, (bud[])this.b);
        }
    }
    
    public final void k(final btm btm, final cao cao) {
        for (int i = 0; i < ((bud[])this.b).length; ++i) {
            cao.c();
            final bud q = btm.q(cao.a(), 3);
            final ayg ayg = ((List<ayg>)this.a).get(i);
            final String n = ayg.n;
            final boolean equals = "application/cea-608".equals(n);
            boolean b = true;
            if (!equals) {
                b = ("application/cea-708".equals(n) && b);
            }
            dk.g(b, (Object)"Invalid closed caption mime type provided: ".concat(String.valueOf(n)));
            final ayf ayf = new ayf();
            ayf.a = cao.b();
            ayf.k = n;
            ayf.d = ayg.f;
            ayf.c = ayg.e;
            ayf.C = ayg.F;
            ayf.m = ayg.p;
            q.b(ayf.a());
            ((bud[])this.b)[i] = q;
        }
    }
    
    public final void l(final Exception ex) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhd(this, ex, 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void m(final Exception ex) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhd(this, ex, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void n(final String s, final long n, final long n2) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bsn(this, s, n, n2, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void o(final String s) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhd(this, s, 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void p(final bdy bdy) {
        bdy.a();
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhd(this, bdy, 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void q(final bdy bdy) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new bhd(this, bdy, 3, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void r(final ayg ayg, final bdz bdz) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new vo(this, ayg, bdz, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void s(final long n) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new gtp(this, n, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void t(final boolean b) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new dmv(this, b, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void u(final int n, final long n2, final long n3) {
        final Object a = this.a;
        if (a != null) {
            ((Handler)a).post((Runnable)new brc(this, n, n2, n3, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final int v() {
        return ((ayd)this.b).b();
    }
    
    public final bgb w(final int n) {
        final bgb bgb = (bgb)((SparseArray)this.a).get(n);
        dk.d((Object)bgb);
        return bgb;
    }
    
    public final boolean x(final int n) {
        return ((ayd)this.b).c(n);
    }
}
