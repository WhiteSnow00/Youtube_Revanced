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

public final class acji extends pc
{
    public final Handler a;
    public final adec b;
    public final adec c;
    public final adec d;
    public final adec e;
    public final adec f;
    private final List g;
    private final acga l;
    
    public acji() {
        this(new acga(), null);
    }
    
    public acji(final acga l, final byte[] array) {
        this.a = new Handler(Looper.getMainLooper(), (Handler$Callback)new bnd(this, 11));
        final adec b = new adec(1);
        this.b = b;
        final adec c = new adec(2);
        this.c = c;
        final adec d = new adec(3);
        this.d = d;
        final adec e = new adec(4);
        this.e = e;
        final adec f = new adec(5);
        this.f = f;
        this.g = Arrays.asList(b, c, d, e, f);
        l.getClass();
        this.l = l;
    }
    
    private static acil y(final on on) {
        if (on instanceof aciq) {
            return ((aciq)on).t;
        }
        return actc.s(on.a);
    }
    
    private final void z(final adec adec) {
        final ArrayList list = new ArrayList((Collection<? extends E>)adec.c);
        ((List<Object>)adec.b).addAll((Collection<?>)adec.c);
        ((List)adec.c).clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final acjg acjg = (acjg)list.get(i);
            if (acjg instanceof acjd) {
                final long j = ((acjd)acjg).j();
                if (j > 0L) {
                    final Handler a = this.a;
                    a.sendMessageDelayed(a.obtainMessage(adec.a, (Object)acjg), j);
                }
            }
            acjg.b();
        }
    }
    
    public final void a() {
        if (!this.j()) {
            ((nt)this).m();
        }
    }
    
    public final void b(final on on) {
        for (final adec adec : this.g) {
            final cgi cgi = ((Map<K, cgi>)adec.d).get(on);
            if (cgi != null) {
                ((List)adec.c).remove(cgi.c);
                ((List)adec.b).remove(cgi.c);
                final on[] array = (on[])cgi.b;
                for (int length = array.length, i = 0; i < length; ++i) {
                    ((Map<Object, Object>)adec.d).remove(array[i]);
                }
                this.a.removeMessages(adec.a, cgi.c);
                if (cgi.a) {
                    continue;
                }
                cgi.a = true;
                ((acjg)cgi.c).a();
            }
        }
    }
    
    public final void c() {
        for (final adec adec : this.g) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.addAll((Collection)adec.c);
            arrayDeque.addAll((Collection)adec.b);
            ((List)adec.c).clear();
            ((List)adec.b).clear();
            ((Map)adec.d).clear();
            final Iterator iterator2 = arrayDeque.iterator();
            while (iterator2.hasNext()) {
                ((acjg)iterator2.next()).a();
            }
            this.a.removeMessages(adec.a);
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
        final acjt acjt = (acjt)acga.e((agkw)this.l.c, on);
        if (acjt != null) {
            final acil y = y(on);
            if (y != null) {
                acjt.a = new acjf(y, ((nt)this).h, (Runnable)new thr(13), (Runnable)new abzn(this, acjt, on, 5));
                acjt.a.a.a().setAlpha(0.0f);
                this.b(on);
                ((List<acjt>)this.b.c).add(acjt);
                ((Map<on, cgi>)this.b.d).put(on, new cgi((acjg)acjt, new on[] { on }));
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
        final acga l = this.l;
        final Class a = acga.a(on);
        final Class a2 = acga.a(on2);
        Object o2;
        final Object o = o2 = null;
        if (a != null) {
            if (a2 == null) {
                o2 = o;
            }
            else {
                o2 = ((agkw)l.b).s((Object)new akp((Object)a, (Object)a2));
            }
        }
        if (o2 != null) {
            final acil y = y(on);
            final acil y2 = y(on2);
            if (y != null && y2 != null) {
                adec adec;
                if (on.a.getWidth() <= on2.a.getWidth() && on.a.getHeight() <= on2.a.getHeight()) {
                    adec = this.e;
                }
                else {
                    adec = this.f;
                }
                final acjh acjh = new acjh(this, on, on2, (acjr)o2, adec, null);
                final acjp a3 = acjq.a();
                a3.j(y);
                a3.g(y2);
                a3.b(250L);
                a3.i((Runnable)new thr(15));
                a3.h((Runnable)new abwg(acjh, on, 7));
                a3.f((Runnable)new thr(16));
                a3.e((Runnable)new abwg(acjh, on2, 8));
                a3.c(n);
                a3.d(n2);
                a3.k(n3);
                a3.l(n4);
                if (((acjr)o2).d(a3.a())) {
                    this.b(on);
                    this.b(on2);
                    ((List<acjr>)adec.c).add((acjr)o2);
                    final cgi cgi = new cgi((acjg)o2, new on[] { on, on2 });
                    ((Map<on, cgi>)adec.d).put(on, cgi);
                    ((Map<on, cgi>)adec.d).put(on2, cgi);
                    return true;
                }
            }
        }
        ((nt)this).l(on);
        ((nt)this).l(on2);
        return false;
    }
    
    public final boolean g(final on on, final int n, final int n2, final int n3, final int n4) {
        final cgi cgi = ((Map<K, cgi>)this.d.d).get(on);
        if (cgi != null) {
            final acjm acjm = (acjm)cgi.c;
            if (acjm.f(new acjj(((nt)this).i, n, n2, n3, n4))) {
                ((nt)this).l(on);
                if (!((List)this.d.c).contains(acjm)) {
                    ((List<acjm>)this.d.c).add(acjm);
                }
                ((List)this.d.b).remove(acjm);
                return true;
            }
        }
        final acjm acjm2 = (acjm)acga.e((agkw)this.l.d, on);
        if (acjm2 != null) {
            final acil y = y(on);
            if (y != null) {
                final acjk a = acjl.a();
                a.g(y);
                a.b(((nt)this).i);
                a.f((Runnable)new thr(17));
                a.e((Runnable)new abzn(this, acjm2, on, 4));
                a.c(n);
                a.d(n2);
                a.h(n3);
                a.i(n4);
                if (acjm2.e(a.a())) {
                    this.b(on);
                    ((List<acjm>)this.d.c).add(acjm2);
                    ((Map<on, cgi>)this.d.d).put(on, new cgi((acjg)acjm2, new on[] { on }));
                    return true;
                }
            }
        }
        ((nt)this).l(on);
        return false;
    }
    
    public final boolean h(final on on) {
        final acjo acjo = (acjo)acga.e((agkw)this.l.a, on);
        if (acjo != null) {
            final acil y = y(on);
            if (y != null) {
                final aqsu a = acjn.a();
                a.j(y);
                a.g(120L);
                a.i((Runnable)new thr(14));
                a.h((Runnable)new abzn(this, acjo, on, 6));
                acjo.c(a.f());
                this.b(on);
                ((List<acjo>)this.c.c).add(acjo);
                ((Map<on, cgi>)this.c.d).put(on, new cgi((acjg)acjo, new on[] { on }));
                return true;
            }
        }
        ((nt)this).l(on);
        return false;
    }
    
    public final boolean j() {
        return adwd.aO(this.g, aacc.i);
    }
    
    public final boolean k(final adec adec) {
        return this.a.hasMessages(adec.a);
    }
    
    public final void n(final on on) {
        for (final adec adec : this.g) {
            final cgi cgi = ((Map<K, cgi>)adec.d).get(on);
            if (cgi != null && this.a.hasMessages(adec.a, cgi.c)) {
                this.a.removeMessages(adec.a, cgi.c);
                if (this.k(adec)) {
                    continue;
                }
                this.a.post((Runnable)new abxb(this, 7));
            }
        }
    }
}
