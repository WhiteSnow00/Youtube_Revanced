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

public final class acjq
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public acjq() {
        this.d = new agop((byte[])null);
        this.c = new agop((byte[])null);
        this.b = new agop((byte[])null);
        this.a = new agop((byte[])null);
    }
    
    public acjq(final aadl d, final aske a, final askz b, final vbs c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public acjq(final acxj acxj, final akdp akdp, final View view, final xab xab, final acxb acxb) {
        this.d = new acxz(akdp.c, view, acxj.e);
        this.c = new WeakReference(akdp);
        this.b = new WeakReference(xab);
        this.a = new WeakReference(acxb);
    }
    
    public acjq(final afci c, final abkq d, final abrp b) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = new aslm();
    }
    
    public acjq(final Context d, final acig b, final ViewGroup c, final veh a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public acjq(final SharedPreferences c, final vbo d, final zoa a, final atnb b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public acjq(final RecyclerView recyclerView, final aefs aefs, final acrd acrd, final xaa d, final byte[] array, final byte[] array2) {
        this.d = d;
        final acmr a = new acmr();
        this.a = a;
        final acmm j = aefs.J((acmh)acrd.a());
        this.c = j;
        final acmm acmm = j;
        j.h((acla)a);
        final aclm b = new aclm();
        this.b = b;
        final acmm acmm2 = j;
        j.f((acma)b);
        recyclerView.ac((nr)j);
    }
    
    public acjq(final ViewGroup a, final Context d, final Handler c, final atnb b) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public acjq(final askz a, final Executor c, final absv d, final arzb b, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public acjq(final atnb b, final afbh afbh, final afbh a, final atnb d) {
        this.b = b;
        this.c = ((afbn)afbh).a;
        this.a = a;
        this.d = d;
    }
    
    public acjq(final atnb c, final aske b, final askz d, final absv a, final byte[] array) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public acjq(final atnb a, final atnb d, final atnb b, final atnb c) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public acjq(final atnb b, final Executor c, final afxj a, final adjq d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public acjq(final atnb c, final oco d, final abwe a, final String b, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public acjq(final String a, final Object c, final acfp d, final afgm b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public acjq(final Executor c, final abwe b, final aefs d, final absv a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public acjq(final vbs b, final tnz a) {
        this.b = b;
        this.a = a;
        this.d = atls.aE();
        this.c = atls.aE();
    }
    
    public static acjq d(final String s, final Object o, final acfp acfp) {
        return new acjq(s, o, acfp, null);
    }
    
    public static ListenableFuture i(final WatchNextResponseModel watchNextResponseModel, PlaybackStartDescriptor playbackStartDescriptor, final abla abla, final String s, final afax afax, final arzb arzb) {
        final String b = watchNextResponseModel.b;
        if (watchNextResponseModel.c != null) {
            final anhj ac = absv.ac(arzb);
            if (ac != null && ac.B) {
                final abkw d = PlaybackStartDescriptor.d();
                d.u = playbackStartDescriptor.h;
                d.a = watchNextResponseModel.c;
                PlaybackStartDescriptor playbackStartDescriptor2;
                playbackStartDescriptor = (playbackStartDescriptor2 = d.a());
                if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
                    final abkw e = playbackStartDescriptor.e();
                    e.p = b;
                    playbackStartDescriptor2 = e.a();
                    return (ListenableFuture)afax.apply(abmv.a(playbackStartDescriptor2, abla, s, true));
                }
                return (ListenableFuture)afax.apply(abmv.a(playbackStartDescriptor2, abla, s, true));
            }
        }
        final abkw e2 = playbackStartDescriptor.e();
        e2.p = b;
        PlaybackStartDescriptor playbackStartDescriptor2 = e2.a();
        return (ListenableFuture)afax.apply(abmv.a(playbackStartDescriptor2, abla, s, true));
    }
    
    public static Class m(final oo oo) {
        acmb acmb;
        if (oo == null) {
            acmb = null;
        }
        else if (oo instanceof acmg) {
            acmb = ((acmg)oo).t;
        }
        else {
            acmb = aamz.B(oo.a);
        }
        if (acmb != null) {
            return acmb.getClass();
        }
        return null;
    }
    
    public static acmw w(final agop agop, final oo oo) {
        final Class m = m(oo);
        if (m != null) {
            return agop.w(m);
        }
        return null;
    }
    
    public static aefs x(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla, final arzb arzb, final String s, final afax afax, final afax afax2, final boolean b, final Executor executor) {
        if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
            final ListenableFuture listenableFuture = (ListenableFuture)afax2.apply(abmw.a(playbackStartDescriptor, abla));
            return new aefs(afvh.f(listenableFuture, aewf.d((afvq)new ihx(playbackStartDescriptor, abla, s, afax, arzb, 9, (byte[])null, (byte[])null)), executor), afbh.k(listenableFuture));
        }
        return new aefs((ListenableFuture)afax.apply(abmv.a(playbackStartDescriptor, abla, s, b)), afag.a);
    }
    
    private final void y(final Object o, final Object o2) {
        ((acfp)this.d).a(o, o2);
    }
    
    public final void a(final Object o) {
        ((acfp)this.d).a(o, this.c);
    }
    
    public final void b(final JSONObject jsonObject, final Object o, final String s) {
        final String concat = String.valueOf(s).concat((String)this.a);
        if (!jsonObject.has(concat)) {
            return;
        }
        final Object b = this.b;
        if (b != null) {
            final Object value = ((afgm)b).get(jsonObject.getString(concat));
            if (value != null) {
                this.y(o, value);
                return;
            }
            throw new acfq();
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
        final int s = ((abkq)this.d).s;
        final boolean b2 = s == 2;
        if (s != 1 && b2 == b) {
            return;
        }
        ((Boolean)((Optional)((afci)this.c).a()).map((Function)new abxe(b)).orElse((Object)false)).booleanValue();
    }
    
    public final absc e() {
        return new absc((tnz)this.a, (atlt)this.d, (atlt)this.c, (vbs)this.b);
    }
    
    public final ListenableFuture f() {
        if (((vbs)this.b).bh()) {
            final afbh afbh = (afbh)((atls)this.d).aG();
            boolean b2;
            final boolean b = b2 = false;
            if (afbh != null) {
                b2 = b;
                if (afbh.h()) {
                    b2 = b;
                    if (afbh.c()) {
                        b2 = true;
                    }
                }
            }
            return afxr.l(b2);
        }
        return afvh.e(((tnz)this.a).a(), (afax)abro.k, (Executor)afwd.a);
    }
    
    public final ListenableFuture g() {
        if (((vbs)this.b).bh()) {
            final afbh afbh = (afbh)((atls)this.d).aG();
            boolean b = false;
            if (afbh != null) {
                b = b;
                if (afbh.h()) {
                    b = true;
                }
            }
            return afxr.l(b);
        }
        return afvh.e(((tnz)this.a).a(), (afax)abro.j, (Executor)afwd.a);
    }
    
    public final void h(final aske aske) {
        if (((vbs)((absv)this.a).c).f(45363623L)) {
            aske.am((asmi)new abps(this, 7, (byte[])null, (byte[])null));
        }
    }
    
    public final void j(final adje adje, final Bundle bundle) {
        final Iterator iterator = bundle.keySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += bundle.getString((String)iterator.next(), "").length();
        }
        ((qsp)((adjq)this.d).q.a()).b((double)n, new Object[0]);
        adje.a(bundle);
    }
    
    public final void k(final adje adje) {
        this.l(null, adje);
    }
    
    public final void l(final String s, final adje adje) {
        final Bundle bundle = new Bundle();
        for (final vhv vhv : (Set)((atnb)this.b).a()) {
            try {
                vhv.b(s, bundle);
            }
            catch (final Exception ex) {
                tut.d("Failed to fill feedback.", (Throwable)ex);
            }
        }
        tfx.k(((afxj)this.a).rC((Runnable)new adat(this, bundle, 4, null)), (Executor)this.c, (tfv)new fwv(this, adje, bundle, 10, (byte[])null), (tfw)new vdm(this, adje, bundle, 18, (byte[])null));
    }
    
    public final float n(final int n) {
        return ((Context)this.d).getResources().getDimension(n);
    }
    
    public final View o(final int n) {
        return LayoutInflater.from((Context)this.d).inflate(n, (ViewGroup)this.c, false);
    }
    
    public final void p(final View view, final aowb aowb, final ajws ajws, final ajws ajws2, final aisc aisc) {
        final ImageView imageView = (ImageView)view.findViewById(2131432010);
        final acib b = ((acig)this.b).b().b();
        b.f = 1;
        ((acig)this.b).j(imageView, aowb, b.a());
        ((TextView)view.findViewById(2131432096)).setText((CharSequence)acbu.b(ajws));
        ((TextView)view.findViewById(2131429861)).setText((CharSequence)acbu.b(ajws2));
        view.setOnClickListener((View$OnClickListener)new zig(this, aisc, 3, (byte[])null));
    }
    
    public final aaud q(final aavf aavf, final float n, final float n2) {
        return new aaud((ViewGroup)this.a, (Context)this.d, (Handler)this.c, (atnb)this.b, aavf, n, n2);
    }
    
    public final long r() {
        final zvm c = ((aadl)((atnb)this.b).a()).a().c();
        if (c == null) {
            return 0L;
        }
        final aacj d = c.d();
        if (d == null) {
            return 0L;
        }
        return d.a();
    }
    
    public final long s() {
        final zvm c = ((aadl)((atnb)this.b).a()).a().c();
        if (c == null) {
            return 0L;
        }
        final aacj c2 = c.c();
        if (c2 == null) {
            return 0L;
        }
        return Math.max(0L, c2.a());
    }
    
    public final long t() {
        final zvm c = ((aadl)((atnb)this.b).a()).a().c();
        if (c == null) {
            return 0L;
        }
        return this.u(c.f());
    }
    
    public final long u(final File file) {
        if (file == null) {
            return 0L;
        }
        return tqf.ag(((vbo)this.d).b(), file);
    }
    
    public final long v() {
        final zvm c = ((aadl)((atnb)this.b).a()).a().c();
        long n = 0L;
        if (c == null) {
            return 0L;
        }
        final File f = c.f();
        if (f == null) {
            return 0L;
        }
        final airq b = ((vbo)this.d).b();
        Label_0103: {
            if (!f.exists()) {
                break Label_0103;
            }
            try {
                final StatFs statFs = new StatFs(f.getAbsolutePath());
                n = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
                return tqf.af(n, b);
            }
            catch (final IllegalArgumentException ex) {
                return tqf.af(n, b);
            }
        }
    }
}
