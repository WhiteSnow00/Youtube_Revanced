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

public final class acll extends pc
{
    public final Handler a;
    public final adge b;
    public final adge c;
    public final adge d;
    public final adge e;
    public final adge f;
    private final List g;
    private final acid l;
    
    public acll() {
        this(new acid(), null, null, null);
    }
    
    public acll(final acid l, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new Handler(Looper.getMainLooper(), (Handler$Callback)new bne(this, 11));
        final adge b = new adge(1);
        this.b = b;
        final adge c = new adge(2);
        this.c = c;
        final adge d = new adge(3);
        this.d = d;
        final adge e = new adge(4);
        this.e = e;
        final adge f = new adge(5);
        this.f = f;
        this.g = Arrays.asList(b, c, d, e, f);
        l.getClass();
        this.l = l;
    }
    
    private static acko y(final on on) {
        if (on instanceof ackt) {
            return ((ackt)on).t;
        }
        return aald.y(on.a);
    }
    
    private final void z(final adge adge) {
        final ArrayList list = new ArrayList((Collection<? extends E>)adge.c);
        ((List<Object>)adge.b).addAll((Collection<?>)adge.c);
        ((List)adge.c).clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final aclj aclj = (aclj)list.get(i);
            if (aclj instanceof aclg) {
                final long j = ((aclg)aclj).j();
                if (j > 0L) {
                    final Handler a = this.a;
                    a.sendMessageDelayed(a.obtainMessage(adge.a, (Object)aclj), j);
                }
            }
            aclj.b();
        }
    }
    
    public final void a() {
        if (!this.j()) {
            ((nt)this).m();
        }
    }
    
    public final void b(final on on) {
        for (final adge adge : this.g) {
            final cgj cgj = ((Map<K, cgj>)adge.d).get(on);
            if (cgj != null) {
                ((List)adge.c).remove(cgj.c);
                ((List)adge.b).remove(cgj.c);
                final on[] array = (on[])cgj.b;
                for (int length = array.length, i = 0; i < length; ++i) {
                    ((Map<Object, Object>)adge.d).remove(array[i]);
                }
                this.a.removeMessages(adge.a, cgj.c);
                if (cgj.a) {
                    continue;
                }
                cgj.a = true;
                ((aclj)cgj.c).a();
            }
        }
    }
    
    public final void c() {
        for (final adge adge : this.g) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.addAll((Collection)adge.c);
            arrayDeque.addAll((Collection)adge.b);
            ((List)adge.c).clear();
            ((List)adge.b).clear();
            ((Map)adge.d).clear();
            final Iterator iterator2 = arrayDeque.iterator();
            while (iterator2.hasNext()) {
                ((aclj)iterator2.next()).a();
            }
            this.a.removeMessages(adge.a);
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
    
    public final boolean e(final on on) {
        final aclw aclw = (aclw)acid.w((agmx)this.l.d, on);
        if (aclw != null) {
            final acko y = y(on);
            if (y != null) {
                aclw.a = new acli(y, ((nt)this).h, (Runnable)new tjv(13), (Runnable)new acbp(this, aclw, on, 5));
                aclw.a.a.a().setAlpha(0.0f);
                this.b(on);
                ((List<aclw>)this.b.c).add(aclw);
                ((Map<on, cgj>)this.b.d).put(on, new cgj((aclj)aclw, new on[] { on }));
                return true;
            }
        }
        ((nt)this).l(on);
        return false;
    }
    
    public final boolean f(final on on, final on on2, final int n, final int n2, final int n3, final int n4) {
        if (on == on2) {
            ((nt)this).l(on);
            return false;
        }
        final acid l = this.l;
        final Class m = acid.m(on);
        final Class i = acid.m(on2);
        Object o2;
        final Object o = o2 = null;
        if (m != null) {
            if (i == null) {
                o2 = o;
            }
            else {
                o2 = ((agmx)l.a).s((Object)new akq((Object)m, (Object)i));
            }
        }
        if (o2 != null) {
            final acko y = y(on);
            final acko y2 = y(on2);
            if (y != null && y2 != null) {
                adge adge;
                if (on.a.getWidth() <= on2.a.getWidth() && on.a.getHeight() <= on2.a.getHeight()) {
                    adge = this.e;
                }
                else {
                    adge = this.f;
                }
                final aclk aclk = new aclk(this, on, on2, (aclu)o2, adge, null);
                final acls a = aclt.a();
                a.j(y);
                a.g(y2);
                a.b(250L);
                a.i((Runnable)new tjv(15));
                a.h((Runnable)new abvs(aclk, on, 9));
                a.f((Runnable)new tjv(16));
                a.e((Runnable)new abvs(aclk, on2, 10));
                a.c(n);
                a.d(n2);
                a.k(n3);
                a.l(n4);
                if (((aclu)o2).d(a.a())) {
                    this.b(on);
                    this.b(on2);
                    ((List<aclu>)adge.c).add((aclu)o2);
                    final cgj cgj = new cgj((aclj)o2, new on[] { on, on2 });
                    ((Map<on, cgj>)adge.d).put(on, cgj);
                    ((Map<on, cgj>)adge.d).put(on2, cgj);
                    return true;
                }
            }
        }
        ((nt)this).l(on);
        ((nt)this).l(on2);
        return false;
    }
    
    public final boolean g(final on on, final int n, final int n2, final int n3, final int n4) {
        final cgj cgj = ((Map<K, cgj>)this.d.d).get(on);
        if (cgj != null) {
            final aclp aclp = (aclp)cgj.c;
            if (aclp.f(new aclm(((nt)this).i, n, n2, n3, n4))) {
                ((nt)this).l(on);
                if (!((List)this.d.c).contains(aclp)) {
                    ((List<aclp>)this.d.c).add(aclp);
                }
                ((List)this.d.b).remove(aclp);
                return true;
            }
        }
        final aclp aclp2 = (aclp)acid.w((agmx)this.l.b, on);
        if (aclp2 != null) {
            final acko y = y(on);
            if (y != null) {
                final acln a = aclo.a();
                a.g(y);
                a.b(((nt)this).i);
                a.f((Runnable)new tjv(17));
                a.e((Runnable)new acbp(this, aclp2, on, 4));
                a.c(n);
                a.d(n2);
                a.h(n3);
                a.i(n4);
                if (aclp2.e(a.a())) {
                    this.b(on);
                    ((List<aclp>)this.d.c).add(aclp2);
                    ((Map<on, cgj>)this.d.d).put(on, new cgj((aclj)aclp2, new on[] { on }));
                    return true;
                }
            }
        }
        ((nt)this).l(on);
        return false;
    }
    
    public final boolean h(final on on) {
        final aclr aclr = (aclr)acid.w((agmx)this.l.c, on);
        if (aclr != null) {
            final acko y = y(on);
            if (y != null) {
                final aqvh a = aclq.a();
                a.j(y);
                a.g(120L);
                a.i((Runnable)new tjv(14));
                a.h((Runnable)new acbp(this, aclr, on, 6));
                aclr.c(a.f());
                this.b(on);
                ((List<aclr>)this.c.c).add(aclr);
                ((Map<on, cgj>)this.c.d).put(on, new cgj((aclj)aclr, new on[] { on }));
                return true;
            }
        }
        ((nt)this).l(on);
        return false;
    }
    
    public final boolean j() {
        return agpc.Z((Iterable)this.g, (aezs)aadz.i);
    }
    
    public final boolean k(final adge adge) {
        return this.a.hasMessages(adge.a);
    }
    
    public final void n(final on on) {
        for (final adge adge : this.g) {
            final cgj cgj = ((Map<K, cgj>)adge.d).get(on);
            if (cgj != null && this.a.hasMessages(adge.a, cgj.c)) {
                this.a.removeMessages(adge.a, cgj.c);
                if (this.k(adge)) {
                    continue;
                }
                this.a.post((Runnable)new abuv(this, 9));
            }
        }
    }
}
