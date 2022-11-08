import android.os.StatFs;
import java.io.File;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Function;
import j$.util.Optional;
import org.json.JSONObject;
import java.util.Set;
import java.util.Iterator;
import android.os.Bundle;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acga
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public acga() {
        this.c = new agkw((byte[])null);
        this.a = new agkw((byte[])null);
        this.d = new agkw((byte[])null);
        this.b = new agkw((byte[])null);
    }
    
    public acga(final acts acts, final ajzl ajzl, final View view, final wwv wwv, final actk actk) {
        this.c = new acui(ajzl.c, view, acts.e);
        this.a = new WeakReference(ajzl);
        this.b = new WeakReference(wwv);
        this.d = new WeakReference(actk);
    }
    
    public acga(final aeyr b, final abhq d, final aboh a) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = new asib();
    }
    
    public acga(final Context d, final aceo c, final ViewGroup b, final vax a) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public acga(final Context d, final adhe c, final wvu a, final atjj b) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public acga(final SharedPreferences c, final uyf b, final zki a, final atjj d) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public acga(final RecyclerView recyclerView, final aeby aeby, final acno acno, final wwu c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        final acjb b = new acjb();
        this.b = b;
        final aciw t = aeby.T((acir)acno.a());
        this.a = t;
        final aciw aciw = t;
        t.h((achk)b);
        final achw d = new achw();
        this.d = d;
        final aciw aciw2 = t;
        t.f((acik)d);
        recyclerView.ac((nq)t);
    }
    
    public acga(final ViewGroup a, final Context c, final Handler b, final atjj d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public acga(final atjj a, final aexq aexq, final aexq c, final atjj d) {
        this.a = a;
        this.b = ((aexw)aexq).a;
        this.c = c;
        this.d = d;
    }
    
    public acga(final atjj b, final asgt a, final asho d, final abpj c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public acga(final atjj c, final atjj d, final atjj a, final atjj b) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public acga(final atjj b, final Executor c, final aftr a, final adfy d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public acga(final atjj a, final oas b, final aamd d, final String c, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public acga(final String c, final Object b, final accb d, final afcw a) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public acga(final Executor c, final aamd d, final aeby b, final abpj a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public acga(final uyi a, final tku c) {
        this.a = a;
        this.c = c;
        this.d = atid.aD();
        this.b = atid.aD();
    }
    
    public acga(final zzu d, final asgt c, final asho a, final uyi b) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static Class a(final on on) {
        acil acil;
        if (on == null) {
            acil = null;
        }
        else if (on instanceof aciq) {
            acil = ((aciq)on).t;
        }
        else {
            acil = actc.s(on.a);
        }
        if (acil != null) {
            return acil.getClass();
        }
        return null;
    }
    
    public static acjg e(final agkw agkw, final on on) {
        final Class a = a(on);
        if (a != null) {
            return agkw.s((Object)a);
        }
        return null;
    }
    
    public static acga v(final String s, final Object o, final accb accb) {
        return new acga(s, o, accb, null);
    }
    
    private final void w(final Object o, final Object o2) {
        ((accb)this.d).a(o, o2);
    }
    
    public final void b(final adfm adfm, final Bundle bundle) {
        final Iterator iterator = bundle.keySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += bundle.getString((String)iterator.next(), "").length();
        }
        ((qqn)((adfy)this.d).q.a()).b((double)n, new Object[0]);
        adfm.a(bundle);
    }
    
    public final void c(final adfm adfm) {
        this.d(null, adfm);
    }
    
    public final void d(final String s, final adfm adfm) {
        final Bundle bundle = new Bundle();
        for (final ven ven : (Set)((atjj)this.b).a()) {
            try {
                ven.b(s, bundle);
            }
            catch (final Exception ex) {
                trn.d("Failed to fill feedback.", (Throwable)ex);
            }
        }
        tcp.k(((aftr)this.a).rw((Runnable)new adhs(this, bundle, 1, (byte[])null, (byte[])null)), (Executor)this.c, (tcn)new fwj(this, adfm, bundle, 10, (byte[])null, (byte[])null), (tco)new vac(this, adfm, bundle, 18, (byte[])null, (byte[])null));
    }
    
    public final void f(final Object o) {
        ((accb)this.d).a(o, this.b);
    }
    
    public final void g(final JSONObject jsonObject, final Object o, String concat) {
        concat = String.valueOf(concat).concat((String)this.c);
        if (!jsonObject.has(concat)) {
            return;
        }
        final Object a = this.a;
        if (a != null) {
            final Object value = ((afcw)a).get((Object)jsonObject.getString(concat));
            if (value != null) {
                this.w(o, value);
                return;
            }
            throw new accc();
        }
        else {
            final Object b = this.b;
            if (b instanceof String) {
                this.w(o, jsonObject.getString(concat));
                return;
            }
            if (b instanceof Integer) {
                this.w(o, jsonObject.getInt(concat));
                return;
            }
            if (b instanceof Long) {
                this.w(o, jsonObject.getLong(concat));
                return;
            }
            if (b instanceof Float) {
                this.w(o, (float)jsonObject.getDouble(concat));
                return;
            }
            if (b instanceof Double) {
                this.w(o, jsonObject.getDouble(concat));
                return;
            }
            if (b instanceof Boolean) {
                this.w(o, jsonObject.getBoolean(concat));
            }
        }
    }
    
    public final void h(final boolean b) {
        final int t = ((abhq)this.d).t;
        final boolean b2 = t == 2;
        if (t != 1 && b2 == b) {
            return;
        }
        ((Boolean)((Optional)((aeyr)this.b).a()).map((Function)new abtr(b)).orElse((Object)false)).booleanValue();
    }
    
    public final abos i() {
        return new abos((tku)this.c, (atie)this.d, (atie)this.b, (uyi)this.a);
    }
    
    public final ListenableFuture j() {
        if (((uyi)this.a).bd()) {
            final aexq aexq = (aexq)((atid)this.d).aF();
            boolean b2;
            final boolean b = b2 = false;
            if (aexq != null) {
                b2 = b;
                if (aexq.h()) {
                    b2 = b;
                    if (aexq.c()) {
                        b2 = true;
                    }
                }
            }
            return afva.m((Object)b2);
        }
        return afrp.e(((tku)this.c).a(), (aexg)abog.g, (Executor)afsl.a);
    }
    
    public final ListenableFuture k() {
        if (((uyi)this.a).bd()) {
            final aexq aexq = (aexq)((atid)this.d).aF();
            boolean b = false;
            if (aexq != null) {
                b = b;
                if (aexq.h()) {
                    b = true;
                }
            }
            return afva.m((Object)b);
        }
        return afrp.e(((tku)this.c).a(), (aexg)abog.f, (Executor)afsl.a);
    }
    
    public final void l(final asgt asgt) {
        if (((uyi)((abpj)this.c).i).f(45363623L)) {
            asgt.al((asix)new abhi(this, 17, null, null, null));
        }
    }
    
    public final float m(final int n) {
        return ((Context)this.d).getResources().getDimension(n);
    }
    
    public final View n(final int n) {
        return LayoutInflater.from((Context)this.d).inflate(n, (ViewGroup)this.b, false);
    }
    
    public final void o(final View view, final aorm aorm, final ajsq ajsq, final ajsq ajsq2, final aioe aioe) {
        final ImageView imageView = (ImageView)view.findViewById(2131432006);
        final acej b = ((aceo)this.c).b().b();
        b.f = 1;
        ((aceo)this.c).j(imageView, aorm, b.a());
        ((TextView)view.findViewById(2131432092)).setText((CharSequence)abyh.b(ajsq));
        ((TextView)view.findViewById(2131429861)).setText((CharSequence)abyh.b(ajsq2));
        view.setOnClickListener((View$OnClickListener)new aafm(this, aioe, 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final aaqz p(final aasb aasb, final float n, final float n2) {
        return new aaqz((ViewGroup)this.a, (Context)this.c, (Handler)this.b, (atjj)this.d, aasb, n, n2);
    }
    
    public final long q() {
        final zrx c = ((zzu)((atjj)this.d).a()).a().c();
        if (c == null) {
            return 0L;
        }
        final zys d = c.d();
        if (d == null) {
            return 0L;
        }
        return d.a();
    }
    
    public final long r() {
        final zrx c = ((zzu)((atjj)this.d).a()).a().c();
        if (c == null) {
            return 0L;
        }
        final zys c2 = c.c();
        if (c2 == null) {
            return 0L;
        }
        return Math.max(0L, c2.a());
    }
    
    public final long s() {
        final zrx c = ((zzu)((atjj)this.d).a()).a().c();
        if (c == null) {
            return 0L;
        }
        return this.t(c.f());
    }
    
    public final long t(final File file) {
        if (file == null) {
            return 0L;
        }
        return tmy.ag(((uyf)this.b).b(), file);
    }
    
    public final long u() {
        final zrx c = ((zzu)((atjj)this.d).a()).a().c();
        long n = 0L;
        if (c == null) {
            return 0L;
        }
        final File f = c.f();
        if (f == null) {
            return 0L;
        }
        final ains b = ((uyf)this.b).b();
        Label_0101: {
            if (!f.exists()) {
                break Label_0101;
            }
            try {
                final StatFs statFs = new StatFs(f.getAbsolutePath());
                n = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
                return tmy.af(n, b);
            }
            catch (final IllegalArgumentException ex) {
                return tmy.af(n, b);
            }
        }
    }
}
