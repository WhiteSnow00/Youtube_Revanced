import java.util.Map;
import android.util.SparseArray;
import java.util.Iterator;
import android.view.View;
import java.util.function.Consumer;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.w;
import java.util.HashMap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acko
{
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public acko(final Context b, final ttn d, final vax c) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = false;
    }
    
    public acko(final dpa d, final dlx c) {
        this.b = new dmv(this, null, null, null);
        this.d = d;
        this.c = c;
    }
    
    public acko(final lzi c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = new HashMap();
        this.b = new w(c, 9, (byte[])null, (byte[])null);
    }
    
    public acko(final sfh b, final sfx d, final sdm c) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public acko(final wvu b, final avt c, final uyf uyf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = false;
        this.b = b;
        this.d = new ConcurrentHashMap();
        this.c = c;
        final ains b2 = uyf.b();
        if (b2 != null) {
            altp altp;
            if ((altp = b2.p) == null) {
                altp = altp.a;
            }
            ajrf ajrf;
            if ((ajrf = altp.c) == null) {
                ajrf = ajrf.a;
            }
            this.a = ajrf.b;
        }
    }
    
    private static aklq j(final wwc wwc, final ajrw ajrw, final String s) {
        final aklo d = aklq.d();
        final ajqz a = ajra.a();
        final agza builder = ((agzi)ajrc.a).createBuilder();
        final int c = wwc.c;
        builder.copyOnWrite();
        final ajrc ajrc = (ajrc)builder.instance;
        ajrc.b |= 0x2;
        ajrc.d = c;
        final int d2 = wwc.d;
        builder.copyOnWrite();
        final ajrc ajrc2 = (ajrc)builder.instance;
        ajrc2.c = d2 - 1;
        ajrc2.b |= 0x1;
        ((agza)a).copyOnWrite();
        ajra.g((ajra)a.instance, (ajrc)builder.build());
        final int b = wwc.b;
        ((agza)a).copyOnWrite();
        ajra.e((ajra)a.instance, b);
        final ajrb a2 = wwc.a;
        if (a2 != null) {
            ((agza)a).copyOnWrite();
            ajra.h((ajra)a.instance, a2);
        }
        if (!aexs.f(null)) {
            ((agza)a).copyOnWrite();
            ajra.f((ajra)a.instance, (String)null);
        }
        ((agza)a).copyOnWrite();
        ajra.c((ajra)a.instance, s);
        ((agza)a).copyOnWrite();
        ajra.d((ajra)a.instance, ajrw);
        ((agza)d).copyOnWrite();
        aklq.co((aklq)d.instance, (ajra)((agza)a).build());
        return (aklq)((agza)d).build();
    }
    
    private final boolean k(final ajrw ajrw) {
        return this.a && ajrw != null;
    }
    
    public final void a(final alli alli, final aexq aexq, final Object o) {
        final aexq b = aexq.b((aexg)abog.t);
        new ackm((Context)this.b, (ttn)this.d, alli, b, new ackn(this, alli, b, o)).show();
    }
    
    public final boolean b(final alli alli, final ackm ackm, final String s, final ajhy ajhy, final ajhy ajhy2, final boolean b) {
        final boolean f = aexs.f(s);
        boolean b2 = true;
        final boolean b3 = f ^ true;
        final int b4 = alli.b;
        final boolean b5 = (b4 & 0x100) == 0x0 || ajhy != null;
        final boolean b6 = (b4 & 0x200) == 0x0 || ajhy2 != null;
        if (this.a) {
            ackm.c.setActivated(b3 ^ true);
            ackm.e.setActivated(b5 ^ true);
            ackm.f.setActivated(b6 ^ true);
        }
        if (!b3 || !b5 || !b6) {
            b2 = false;
        }
        if (b2) {
            ackm.b.setImageResource(2131232942);
        }
        else {
            ackm.b.setImageResource(2131232943);
            if (b) {
                ackm.b.announceForAccessibility((CharSequence)ackm.a.e);
                return false;
            }
        }
        return b2;
    }
    
    public final String c() {
        return ((avt)this.c).X(16);
    }
    
    public final void d(final wwc wwc, final ajrw ajrw) {
        if (this.k(ajrw)) {
            String c;
            if ((c = (String)((ConcurrentHashMap)this.d).get((Object)ajrw)) == null) {
                c = this.c();
                final String s = (String)((ConcurrentHashMap)this.d).putIfAbsent((Object)ajrw, (Object)c);
                if (s != null) {
                    c = s;
                }
            }
            this.e(wwc, ajrw, c);
        }
    }
    
    public final void e(final wwc wwc, final ajrw ajrw, final String s) {
        if (!this.k(ajrw)) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        ((wvu)this.b).d(j(wwc, ajrw, s));
    }
    
    public final void f(final wwc wwc, final ajrw ajrw, final String s, final long n) {
        if (!this.k(ajrw)) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        ((wvu)this.b).e(j(wwc, ajrw, s), n);
    }
    
    public final void g(final wwc wwc, final ajrw ajrw) {
        if (!this.k(ajrw)) {
            return;
        }
        final String c = this.c();
        ((ConcurrentHashMap)this.d).put((Object)ajrw, (Object)c);
        this.e(wwc, ajrw, c);
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
            final cgi cgi = (cgi)((SparseArray)((lzi)this.c).a).get(view.getId());
            boolean b2;
            final boolean b = b2 = false;
            if (cgi != null) {
                b2 = b;
                if (cgi.a) {
                    b2 = b;
                    if (!a) {
                        b2 = true;
                    }
                }
            }
            tmy.v(view, b2);
        }
    }
}
