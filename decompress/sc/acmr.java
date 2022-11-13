import java.util.Map;
import android.util.SparseArray;
import java.util.Iterator;
import android.view.View;
import java.util.function.Consumer;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.v;
import java.util.HashMap;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmr
{
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public acmr(final Context b, final tvr d, final vcy c) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = false;
    }
    
    public acmr(final c c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.d = new HashMap();
        this.b = new v(c, 9, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public acmr(final dpb d, final dly c) {
        this.b = new dmw(this, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.c = c;
    }
    
    public acmr(final shm b, final sic d, final sfr c) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public acmr(final wxx b, final msr c, final vaf vaf, final byte[] array) {
        this.a = false;
        this.b = b;
        this.d = new ConcurrentHashMap();
        this.c = c;
        final aipx b2 = vaf.b();
        if (b2 != null) {
            alvt alvt;
            if ((alvt = b2.p) == null) {
                alvt = alvt.a;
            }
            ajtj ajtj;
            if ((ajtj = alvt.c) == null) {
                ajtj = ajtj.a;
            }
            this.a = ajtj.b;
        }
    }
    
    private static aknt j(final wye wye, final ajtz ajtz, final String s) {
        final aknr d = aknt.d();
        final ajtd a = ajte.a();
        final ahaz builder = ((ahbh)ajtg.a).createBuilder();
        final int c = wye.c;
        builder.copyOnWrite();
        final ajtg ajtg = (ajtg)builder.instance;
        ajtg.b |= 0x2;
        ajtg.d = c;
        final int d2 = wye.d;
        builder.copyOnWrite();
        final ajtg ajtg2 = (ajtg)builder.instance;
        ajtg2.c = d2 - 1;
        ajtg2.b |= 0x1;
        ((ahaz)a).copyOnWrite();
        ajte.g((ajte)a.instance, (ajtg)builder.build());
        final int b = wye.b;
        ((ahaz)a).copyOnWrite();
        ajte.e((ajte)a.instance, b);
        final ajtf a2 = wye.a;
        if (a2 != null) {
            ((ahaz)a).copyOnWrite();
            ajte.h((ajte)a.instance, a2);
        }
        if (!aezr.f((String)null)) {
            ((ahaz)a).copyOnWrite();
            ajte.f((ajte)a.instance, (String)null);
        }
        ((ahaz)a).copyOnWrite();
        ajte.c((ajte)a.instance, s);
        ((ahaz)a).copyOnWrite();
        ajte.d((ajte)a.instance, ajtz);
        ((ahaz)d).copyOnWrite();
        aknt.cp((aknt)d.instance, (ajte)((ahaz)a).build());
        return (aknt)((ahaz)d).build();
    }
    
    private final boolean k(final ajtz ajtz) {
        return this.a && ajtz != null;
    }
    
    public final void a(final alnm alnm, aezp b, final Object o) {
        b = b.b((aezf)abvp.d);
        new acmp((Context)this.b, (tvr)this.d, alnm, b, new acmq(this, alnm, b, o)).show();
    }
    
    public final boolean b(final alnm alnm, final acmp acmp, final String s, final ajkc ajkc, final ajkc ajkc2, final boolean b) {
        final boolean f = aezr.f(s);
        boolean b2 = true;
        final boolean b3 = f ^ true;
        final int b4 = alnm.b;
        final boolean b5 = (b4 & 0x100) == 0x0 || ajkc != null;
        final boolean b6 = (b4 & 0x200) == 0x0 || ajkc2 != null;
        if (this.a) {
            acmp.c.setActivated(b3 ^ true);
            acmp.e.setActivated(b5 ^ true);
            acmp.f.setActivated(b6 ^ true);
        }
        if (!b3 || !b5 || !b6) {
            b2 = false;
        }
        if (b2) {
            acmp.b.setImageResource(2131232942);
        }
        else {
            acmp.b.setImageResource(2131232943);
            if (b) {
                acmp.b.announceForAccessibility((CharSequence)acmp.a.e);
                return false;
            }
        }
        return b2;
    }
    
    public final String c() {
        return ((msr)this.c).y(16);
    }
    
    public final void d(final wye wye, final ajtz ajtz) {
        if (this.k(ajtz)) {
            String c;
            if ((c = (String)((ConcurrentHashMap)this.d).get((Object)ajtz)) == null) {
                c = this.c();
                final String s = (String)((ConcurrentHashMap)this.d).putIfAbsent((Object)ajtz, (Object)c);
                if (s != null) {
                    c = s;
                }
            }
            this.e(wye, ajtz, c);
        }
    }
    
    public final void e(final wye wye, final ajtz ajtz, final String s) {
        if (!this.k(ajtz)) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        ((wxx)this.b).d(j(wye, ajtz, s));
    }
    
    public final void f(final wye wye, final ajtz ajtz, final String s, final long n) {
        if (!this.k(ajtz)) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        ((wxx)this.b).e(j(wye, ajtz, s), n);
    }
    
    public final void g(final wye wye, final ajtz ajtz) {
        if (!this.k(ajtz)) {
            return;
        }
        final String c = this.c();
        ((ConcurrentHashMap)this.d).put((Object)ajtz, (Object)c);
        this.e(wye, ajtz, c);
    }
    
    public final void h(final Consumer consumer) {
        final Iterator<Object> iterator = (Iterator<Object>)((Map<View, V>)this.d).keySet().iterator();
        while (iterator.hasNext()) {
            consumer.accept(iterator.next());
        }
    }
    
    public final void i(final boolean a) {
        if (a == this.a) {
            return;
        }
        this.a = a;
        for (final View view : ((Map<View, V>)this.d).keySet()) {
            final cgj cgj = (cgj)((SparseArray)((c)this.c).a).get(view.getId());
            boolean b2;
            final boolean b = b2 = false;
            if (cgj != null) {
                b2 = b;
                if (cgj.a) {
                    b2 = b;
                    if (!a) {
                        b2 = true;
                    }
                }
            }
            tpe.v(view, b2);
        }
    }
}
