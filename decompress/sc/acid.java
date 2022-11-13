import android.os.StatFs;
import java.io.File;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import java.util.Set;
import java.util.Iterator;
import android.os.Bundle;
import java.util.function.Function;
import j$.util.Optional;
import org.json.JSONObject;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
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

public final class acid
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public acid() {
        this.d = new agmx((byte[])null);
        this.c = new agmx((byte[])null);
        this.b = new agmx((byte[])null);
        this.a = new agmx((byte[])null);
    }
    
    public acid(final aabo d, final ashi a, final asid b, final vai c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public acid(final acvw acvw, final akbo akbo, final View view, final wyw wyw, final acvo acvo) {
        this.d = new acwm(akbo.c, view, acvw.e);
        this.c = new WeakReference(akbo);
        this.b = new WeakReference(wyw);
        this.a = new WeakReference(acvo);
    }
    
    public acid(final afaq c, final abjj d, final abqg b) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = new asiq();
    }
    
    public acid(final Context d, final acgs b, final ViewGroup c, final vcy a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public acid(final SharedPreferences c, final vaf d, final zmf a, final atke b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public acid(final RecyclerView recyclerView, final aeea aeea, final acps acps, final wyv d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        final acle a = new acle();
        this.a = a;
        final ackz z = aeea.Z((acku)acps.a());
        this.c = z;
        final ackz ackz = z;
        z.h((acjn)a);
        final acjz b = new acjz();
        this.b = b;
        final ackz ackz2 = z;
        z.f((ackn)b);
        recyclerView.ac((nq)z);
    }
    
    public acid(final ViewGroup a, final Context d, final Handler c, final atke b) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public acid(final asid a, final Executor c, final abrj d, final arwh b, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public acid(final atke b, final aezp aezp, final aezp a, final atke d) {
        this.b = b;
        this.c = ((aezv)aezp).a;
        this.a = a;
        this.d = d;
    }
    
    public acid(final atke c, final ashi b, final asid d, final abrj a, final byte[] array) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public acid(final atke a, final atke d, final atke b, final atke c) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public acid(final atke b, final Executor c, final afvs a, final adia d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public acid(final atke c, final oby d, final aanx a, final String b, final byte[] array) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public acid(final String a, final Object c, final acec d, final afev b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public acid(final Executor c, final aanx b, final adet d, final abrj a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public acid(final vai b, final tmx a) {
        this.b = b;
        this.a = a;
        this.d = ativ.aE();
        this.c = ativ.aE();
    }
    
    public static acid d(final String s, final Object o, final acec acec) {
        return new acid(s, o, acec, null);
    }
    
    public static ListenableFuture i(final WatchNextResponseModel watchNextResponseModel, PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt, final String s, final aezf aezf, final arwh arwh) {
        final String b = watchNextResponseModel.b;
        if (watchNextResponseModel.c != null) {
            final anfc ag = abrj.ag(arwh);
            if (ag != null && ag.B) {
                final abjp d = PlaybackStartDescriptor.d();
                d.u = playbackStartDescriptor.h;
                d.a = watchNextResponseModel.c;
                PlaybackStartDescriptor playbackStartDescriptor2;
                playbackStartDescriptor = (playbackStartDescriptor2 = d.a());
                if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
                    final abjp e = playbackStartDescriptor.e();
                    e.p = b;
                    playbackStartDescriptor2 = e.a();
                    return (ListenableFuture)aezf.apply((Object)ablo.a(playbackStartDescriptor2, abjt, s, true));
                }
                return (ListenableFuture)aezf.apply((Object)ablo.a(playbackStartDescriptor2, abjt, s, true));
            }
        }
        final abjp e2 = playbackStartDescriptor.e();
        e2.p = b;
        PlaybackStartDescriptor playbackStartDescriptor2 = e2.a();
        return (ListenableFuture)aezf.apply((Object)ablo.a(playbackStartDescriptor2, abjt, s, true));
    }
    
    public static Class m(final on on) {
        acko acko;
        if (on == null) {
            acko = null;
        }
        else if (on instanceof ackt) {
            acko = ((ackt)on).t;
        }
        else {
            acko = aald.y(on.a);
        }
        if (acko != null) {
            return acko.getClass();
        }
        return null;
    }
    
    public static aclj w(final agmx agmx, final on on) {
        final Class m = m(on);
        if (m != null) {
            return agmx.s(m);
        }
        return null;
    }
    
    public static aeea x(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt, final arwh arwh, final String s, final aezf aezf, final aezf aezf2, final boolean b, final Executor executor) {
        if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
            final ListenableFuture listenableFuture = (ListenableFuture)aezf2.apply((Object)ablp.a(playbackStartDescriptor, abjt));
            return new aeea(aftq.f(listenableFuture, aeun.d((aftz)new ihp(playbackStartDescriptor, abjt, s, aezf, arwh, 9, null, null)), executor), aezp.k((Object)listenableFuture));
        }
        return new aeea((ListenableFuture)aezf.apply((Object)ablo.a(playbackStartDescriptor, abjt, s, b)), (aezp)aeyo.a);
    }
    
    private final void y(final Object o, final Object o2) {
        ((acec)this.d).a(o, o2);
    }
    
    public final void a(final Object o) {
        ((acec)this.d).a(o, this.c);
    }
    
    public final void b(final JSONObject jsonObject, final Object o, final String s) {
        final String concat = String.valueOf(s).concat((String)this.a);
        if (!jsonObject.has(concat)) {
            return;
        }
        final Object b = this.b;
        if (b != null) {
            final Object value = ((afev)b).get(jsonObject.getString(concat));
            if (value != null) {
                this.y(o, value);
                return;
            }
            throw new aced();
        }
        else {
            final Object c = this.c;
            if (c instanceof String) {
                this.y(o, jsonObject.getString(concat));
                return;
            }
            if (c instanceof Integer) {
                this.y(o, jsonObject.getInt(concat));
                return;
            }
            if (c instanceof Long) {
                this.y(o, jsonObject.getLong(concat));
                return;
            }
            if (c instanceof Float) {
                this.y(o, (float)jsonObject.getDouble(concat));
                return;
            }
            if (c instanceof Double) {
                this.y(o, jsonObject.getDouble(concat));
                return;
            }
            if (c instanceof Boolean) {
                this.y(o, jsonObject.getBoolean(concat));
            }
        }
    }
    
    public final void c(final boolean b) {
        final int s = ((abjj)this.d).s;
        final boolean b2 = s == 2;
        if (s != 1 && b2 == b) {
            return;
        }
        ((Boolean)((Optional)((afaq)this.c).a()).map((Function)new abvv(b)).orElse((Object)false)).booleanValue();
    }
    
    public final abqs e() {
        return new abqs((tmx)this.a, (atiw)this.d, (atiw)this.c, (vai)this.b);
    }
    
    public final ListenableFuture f() {
        if (((vai)this.b).be()) {
            final aezp aezp = (aezp)((ativ)this.d).aG();
            boolean b2;
            final boolean b = b2 = false;
            if (aezp != null) {
                b2 = b;
                if (aezp.h()) {
                    b2 = b;
                    if (aezp.c()) {
                        b2 = true;
                    }
                }
            }
            return afwm.m((Object)b2);
        }
        return aftq.e(((tmx)this.a).a(), (aezf)abpk.l, (Executor)afum.a);
    }
    
    public final ListenableFuture g() {
        if (((vai)this.b).be()) {
            final aezp aezp = (aezp)((ativ)this.d).aG();
            boolean b = false;
            if (aezp != null) {
                b = b;
                if (aezp.h()) {
                    b = true;
                }
            }
            return afwm.m((Object)b);
        }
        return aftq.e(((tmx)this.a).a(), (aezf)abpk.k, (Executor)afum.a);
    }
    
    public final void h(final ashi ashi) {
        if (((vai)((abrj)this.a).c).f(45363623L)) {
            ashi.am((asjm)new abpj(this, 2, (byte[])null, (byte[])null));
        }
    }
    
    public final void j(final adhp adhp, final Bundle bundle) {
        final Iterator iterator = bundle.keySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += bundle.getString((String)iterator.next(), "").length();
        }
        ((qrx)((adia)this.d).q.a()).b((double)n, new Object[0]);
        adhp.a(bundle);
    }
    
    public final void k(final adhp adhp) {
        this.l(null, adhp);
    }
    
    public final void l(final String s, final adhp adhp) {
        final Bundle bundle = new Bundle();
        for (final vgn vgn : (Set)((atke)this.b).a()) {
            try {
                vgn.b(s, bundle);
            }
            catch (final Exception ex) {
                ttr.d("Failed to fill feedback.", (Throwable)ex);
            }
        }
        teu.k(((afvs)this.a).rC((Runnable)new adfy(this, bundle, 2, null)), (Executor)this.c, (tes)new fwr(this, adhp, bundle, 10, (byte[])null), (tet)new vcd(this, adhp, bundle, 18, (byte[])null));
    }
    
    public final float n(final int n) {
        return ((Context)this.d).getResources().getDimension(n);
    }
    
    public final View o(final int n) {
        return LayoutInflater.from((Context)this.d).inflate(n, (ViewGroup)this.c, false);
    }
    
    public final void p(final View view, final aotp aotp, final ajut ajut, final ajut ajut2, final aiqj aiqj) {
        final ImageView imageView = (ImageView)view.findViewById(2131432009);
        final acgn b = ((acgs)this.b).b().b();
        b.f = 1;
        ((acgs)this.b).j(imageView, aotp, b.a());
        ((TextView)view.findViewById(2131432095)).setText((CharSequence)acak.b(ajut));
        ((TextView)view.findViewById(2131429861)).setText((CharSequence)acak.b(ajut2));
        view.setOnClickListener((View$OnClickListener)new zgi(this, aiqj, 3, (byte[])null));
    }
    
    public final aast q(final aatv aatv, final float n, final float n2) {
        return new aast((ViewGroup)this.a, (Context)this.d, (Handler)this.c, (atke)this.b, aatv, n, n2);
    }
    
    public final long r() {
        final ztp c = ((aabo)((atke)this.b).a()).a().c();
        if (c == null) {
            return 0L;
        }
        final aaam d = c.d();
        if (d == null) {
            return 0L;
        }
        return d.a();
    }
    
    public final long s() {
        final ztp c = ((aabo)((atke)this.b).a()).a().c();
        if (c == null) {
            return 0L;
        }
        final aaam c2 = c.c();
        if (c2 == null) {
            return 0L;
        }
        return Math.max(0L, c2.a());
    }
    
    public final long t() {
        final ztp c = ((aabo)((atke)this.b).a()).a().c();
        if (c == null) {
            return 0L;
        }
        return this.u(c.f());
    }
    
    public final long u(final File file) {
        if (file == null) {
            return 0L;
        }
        return tpe.ag(((vaf)this.d).b(), file);
    }
    
    public final long v() {
        final ztp c = ((aabo)((atke)this.b).a()).a().c();
        long n = 0L;
        if (c == null) {
            return 0L;
        }
        final File f = c.f();
        if (f == null) {
            return 0L;
        }
        final aipx b = ((vaf)this.d).b();
        Label_0103: {
            if (!f.exists()) {
                break Label_0103;
            }
            try {
                final StatFs statFs = new StatFs(f.getAbsolutePath());
                n = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
                return tpe.af(n, b);
            }
            catch (final IllegalArgumentException ex) {
                return tpe.af(n, b);
            }
        }
    }
}
