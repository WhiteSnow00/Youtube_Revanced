import java.util.Map;
import android.util.SparseArray;
import java.util.Iterator;
import android.view.View;
import java.util.function.Consumer;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.a;
import java.util.HashMap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acoe
{
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public acoe(final Context b, final twt d, final veh c) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = false;
    }
    
    public acoe(final dpe d, final dmc c) {
        this.b = new dmz(this, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.c = c;
    }
    
    public acoe(final mbb c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = new HashMap();
        this.b = new a(c, 8, null, null);
    }
    
    public acoe(final sil b, final sjb d, final sgq c) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public acoe(final wza b, final aefs c, final vbo vbo, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = false;
        this.b = b;
        this.d = new ConcurrentHashMap();
        this.c = c;
        final airq b2 = vbo.b();
        if (b2 != null) {
            alxt alxt;
            if ((alxt = b2.p) == null) {
                alxt = alxt.a;
            }
            ajvi ajvi;
            if ((ajvi = alxt.c) == null) {
                ajvi = ajvi.a;
            }
            this.a = ajvi.b;
        }
    }
    
    private static akpu j(final wzh wzh, final ajvy ajvy, final String s) {
        final akps d = akpu.d();
        final ajvc a = ajvd.a();
        final ahcr builder = ((ahcz)ajvf.a).createBuilder();
        final int c = wzh.c;
        builder.copyOnWrite();
        final ajvf ajvf = (ajvf)builder.instance;
        ajvf.b |= 0x2;
        ajvf.d = c;
        final int d2 = wzh.d;
        builder.copyOnWrite();
        final ajvf ajvf2 = (ajvf)builder.instance;
        ajvf2.c = d2 - 1;
        ajvf2.b |= 0x1;
        ((ahcr)a).copyOnWrite();
        ajvd.g((ajvd)a.instance, (ajvf)builder.build());
        final int b = wzh.b;
        ((ahcr)a).copyOnWrite();
        ajvd.e((ajvd)a.instance, b);
        final ajve a2 = wzh.a;
        if (a2 != null) {
            ((ahcr)a).copyOnWrite();
            ajvd.h((ajvd)a.instance, a2);
        }
        if (!afbj.f(null)) {
            ((ahcr)a).copyOnWrite();
            ajvd.f((ajvd)a.instance, (String)null);
        }
        ((ahcr)a).copyOnWrite();
        ajvd.c((ajvd)a.instance, s);
        ((ahcr)a).copyOnWrite();
        ajvd.d((ajvd)a.instance, ajvy);
        ((ahcr)d).copyOnWrite();
        akpu.cp((akpu)d.instance, (ajvd)((ahcr)a).build());
        return (akpu)((ahcr)d).build();
    }
    
    private final boolean k(final ajvy ajvy) {
        return this.a && ajvy != null;
    }
    
    public final void a(final alpm alpm, afbh b, final Object o) {
        b = b.b((afax)accj.c);
        new acoc((Context)this.b, (twt)this.d, alpm, b, new acod(this, alpm, b, o)).show();
    }
    
    public final boolean b(final alpm alpm, final acoc acoc, final String s, final ajmb ajmb, final ajmb ajmb2, final boolean b) {
        final boolean f = afbj.f(s);
        boolean b2 = true;
        final boolean b3 = f ^ true;
        final int b4 = alpm.b;
        final boolean b5 = (b4 & 0x100) == 0x0 || ajmb != null;
        final boolean b6 = (b4 & 0x200) == 0x0 || ajmb2 != null;
        if (this.a) {
            acoc.c.setActivated(b3 ^ true);
            acoc.e.setActivated(b5 ^ true);
            acoc.f.setActivated(b6 ^ true);
        }
        if (!b3 || !b5 || !b6) {
            b2 = false;
        }
        if (b2) {
            acoc.b.setImageResource(2131232942);
        }
        else {
            acoc.b.setImageResource(2131232943);
            if (b) {
                acoc.b.announceForAccessibility((CharSequence)acoc.a.e);
                return false;
            }
        }
        return b2;
    }
    
    public final String c() {
        return ((aefs)this.c).cu(16);
    }
    
    public final void d(final wzh wzh, final ajvy ajvy) {
        if (this.k(ajvy)) {
            String c;
            if ((c = (String)((ConcurrentHashMap)this.d).get((Object)ajvy)) == null) {
                c = this.c();
                final String s = (String)((ConcurrentHashMap)this.d).putIfAbsent((Object)ajvy, (Object)c);
                if (s != null) {
                    c = s;
                }
            }
            this.e(wzh, ajvy, c);
        }
    }
    
    public final void e(final wzh wzh, final ajvy ajvy, final String s) {
        if (!this.k(ajvy)) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        ((wza)this.b).d(j(wzh, ajvy, s));
    }
    
    public final void f(final wzh wzh, final ajvy ajvy, final String s, final long n) {
        if (!this.k(ajvy)) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        ((wza)this.b).e(j(wzh, ajvy, s), n);
    }
    
    public final void g(final wzh wzh, final ajvy ajvy) {
        if (!this.k(ajvy)) {
            return;
        }
        final String c = this.c();
        ((ConcurrentHashMap)this.d).put((Object)ajvy, (Object)c);
        this.e(wzh, ajvy, c);
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
            final cgm cgm = (cgm)((SparseArray)((mbb)this.c).a).get(view.getId());
            boolean b2;
            final boolean b = b2 = false;
            if (cgm != null) {
                b2 = b;
                if (cgm.a) {
                    b2 = b;
                    if (!a) {
                        b2 = true;
                    }
                }
            }
            tqf.v(view, b2);
        }
    }
}
