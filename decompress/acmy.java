import java.util.Map;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Handler$Callback;
import android.os.Looper;
import java.util.List;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmy extends pd
{
    public final Handler a;
    public final adhr b;
    public final adhr c;
    public final adhr d;
    public final adhr e;
    public final adhr f;
    private final List g;
    private final acjq l;
    
    public acmy() {
        this(new acjq(), null, null, null);
    }
    
    public acmy(final acjq l, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new Handler(Looper.getMainLooper(), (Handler$Callback)new bnh(this, 11));
        final adhr b = new adhr(1);
        this.b = b;
        final adhr c = new adhr(2);
        this.c = c;
        final adhr d = new adhr(3);
        this.d = d;
        final adhr e = new adhr(4);
        this.e = e;
        final adhr f = new adhr(5);
        this.f = f;
        this.g = Arrays.asList(b, c, d, e, f);
        l.getClass();
        this.l = l;
    }
    
    private static acmb y(final oo oo) {
        if (oo instanceof acmg) {
            return ((acmg)oo).t;
        }
        return aamz.B(oo.a);
    }
    
    private final void z(final adhr adhr) {
        final ArrayList list = new ArrayList((Collection<? extends E>)adhr.c);
        ((List<Object>)adhr.b).addAll((Collection<?>)adhr.c);
        ((List)adhr.c).clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final acmw acmw = (acmw)list.get(i);
            if (acmw instanceof acmt) {
                final long j = ((acmt)acmw).j();
                if (j > 0L) {
                    final Handler a = this.a;
                    a.sendMessageDelayed(a.obtainMessage(adhr.a, (Object)acmw), j);
                }
            }
            acmw.b();
        }
    }
    
    public final void a() {
        if (!this.j()) {
            ((nu)this).m();
        }
    }
    
    public final void b(final oo oo) {
        for (final adhr adhr : this.g) {
            final cgm cgm = ((Map<K, cgm>)adhr.d).get(oo);
            if (cgm != null) {
                ((List)adhr.c).remove(cgm.c);
                ((List)adhr.b).remove(cgm.c);
                final oo[] array = (oo[])cgm.b;
                for (int length = array.length, i = 0; i < length; ++i) {
                    ((Map<Object, Object>)adhr.d).remove(array[i]);
                }
                this.a.removeMessages(adhr.a, cgm.c);
                if (cgm.a) {
                    continue;
                }
                cgm.a = true;
                ((acmw)cgm.c).a();
            }
        }
    }
    
    public final void c() {
        for (final adhr adhr : this.g) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.addAll((Collection)adhr.c);
            arrayDeque.addAll((Collection)adhr.b);
            ((List)adhr.c).clear();
            ((List)adhr.b).clear();
            ((Map)adhr.d).clear();
            final Iterator iterator2 = arrayDeque.iterator();
            while (iterator2.hasNext()) {
                ((acmw)iterator2.next()).a();
            }
            this.a.removeMessages(adhr.a);
        }
    }
    
    public final void d() {
        this.z(this.c);
        this.z(this.e);
        if (!this.k(this.c)) {
            if (!this.k(this.e)) {
                this.z(this.d);
                if (this.k(this.d)) {
                    return;
                }
                this.z(this.b);
                this.z(this.f);
            }
        }
    }
    
    public final boolean e(final oo oo) {
        final acnj acnj = (acnj)acjq.w((agop)this.l.d, oo);
        if (acnj != null) {
            final acmb y = y(oo);
            if (y != null) {
                acnj.a = new acmv(y, ((nu)this).h, (Runnable)new tkz(13), (Runnable)new acdb(this, acnj, oo, 4));
                acnj.a.a.a().setAlpha(0.0f);
                this.b(oo);
                ((List<acnj>)this.b.c).add(acnj);
                ((Map<oo, cgm>)this.b.d).put(oo, new cgm(acnj, new oo[] { oo }));
                return true;
            }
        }
        ((nu)this).l(oo);
        return false;
    }
    
    public final boolean f(final oo oo, final oo oo2, final int n, final int n2, final int n3, final int n4) {
        if (oo == oo2) {
            ((nu)this).l(oo);
            return false;
        }
        final acjq l = this.l;
        final Class m = acjq.m(oo);
        final Class i = acjq.m(oo2);
        acnh acnh2;
        final acnh acnh = acnh2 = null;
        if (m != null) {
            if (i == null) {
                acnh2 = acnh;
            }
            else {
                acnh2 = (acnh)((agop)l.a).w(new akr((Object)m, (Object)i));
            }
        }
        if (acnh2 != null) {
            final acmb y = y(oo);
            final acmb y2 = y(oo2);
            if (y != null && y2 != null) {
                adhr adhr;
                if (oo.a.getWidth() <= oo2.a.getWidth() && oo.a.getHeight() <= oo2.a.getHeight()) {
                    adhr = this.e;
                }
                else {
                    adhr = this.f;
                }
                final acmx acmx = new acmx(this, oo, oo2, acnh2, adhr, null);
                final acnf a = acng.a();
                a.j(y);
                a.g(y2);
                a.b(250L);
                a.i((Runnable)new tkz(15));
                a.h(new abse(acmx, oo, 11));
                a.f((Runnable)new tkz(16));
                a.e(new abse(acmx, oo2, 12));
                a.c(n);
                a.d(n2);
                a.k(n3);
                a.l(n4);
                if (acnh2.d(a.a())) {
                    this.b(oo);
                    this.b(oo2);
                    ((List<acnh>)adhr.c).add(acnh2);
                    final cgm cgm = new cgm(acnh2, new oo[] { oo, oo2 });
                    ((Map<oo, cgm>)adhr.d).put(oo, cgm);
                    ((Map<oo, cgm>)adhr.d).put(oo2, cgm);
                    return true;
                }
            }
        }
        ((nu)this).l(oo);
        ((nu)this).l(oo2);
        return false;
    }
    
    public final boolean g(final oo oo, final int n, final int n2, final int n3, final int n4) {
        final cgm cgm = ((Map<K, cgm>)this.d.d).get(oo);
        if (cgm != null) {
            final acnc acnc = (acnc)cgm.c;
            if (acnc.f(new acmz(((nu)this).i, n, n2, n3, n4))) {
                ((nu)this).l(oo);
                if (!((List)this.d.c).contains(acnc)) {
                    ((List<acnc>)this.d.c).add(acnc);
                }
                ((List)this.d.b).remove(acnc);
                return true;
            }
        }
        final acnc acnc2 = (acnc)acjq.w((agop)this.l.b, oo);
        if (acnc2 != null) {
            final acmb y = y(oo);
            if (y != null) {
                final acna a = acnb.a();
                a.g(y);
                a.b(((nu)this).i);
                a.f((Runnable)new tkz(17));
                a.e((Runnable)new acdb(this, acnc2, oo, 3));
                a.c(n);
                a.d(n2);
                a.h(n3);
                a.i(n4);
                if (acnc2.e(a.a())) {
                    this.b(oo);
                    ((List<acnc>)this.d.c).add(acnc2);
                    ((Map<oo, cgm>)this.d.d).put(oo, new cgm(acnc2, new oo[] { oo }));
                    return true;
                }
            }
        }
        ((nu)this).l(oo);
        return false;
    }
    
    public final boolean h(final oo oo) {
        final acne acne = (acne)acjq.w((agop)this.l.c, oo);
        if (acne != null) {
            final acmb y = y(oo);
            if (y != null) {
                final aqyc a = acnd.a();
                a.j(y);
                a.g(120L);
                a.i((Runnable)new tkz(14));
                a.h((Runnable)new acdb(this, acne, oo, 5));
                acne.c(a.f());
                this.b(oo);
                ((List<acne>)this.c.c).add(acne);
                ((Map<oo, cgm>)this.c.d).put(oo, new cgm(acne, new oo[] { oo }));
                return true;
            }
        }
        ((nu)this).l(oo);
        return false;
    }
    
    public final boolean j() {
        return agpx.aq(this.g, aafv.i);
    }
    
    public final boolean k(final adhr adhr) {
        return this.a.hasMessages(adhr.a);
    }
    
    public final void n(final oo oo) {
        for (final adhr adhr : this.g) {
            final cgm cgm = ((Map<K, cgm>)adhr.d).get(oo);
            if (cgm != null && this.a.hasMessages(adhr.a, cgm.c)) {
                this.a.removeMessages(adhr.a, cgm.c);
                if (this.k(adhr)) {
                    continue;
                }
                this.a.post((Runnable)new acan(this, 8));
            }
        }
    }
}
