import android.net.Uri;
import android.text.TextUtils;
import android.app.Activity;
import java.security.InvalidParameterException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
import j$.util.Optional;
import android.text.SpannableStringBuilder;
import android.os.Bundle;
import j$.time.Duration;
import java.util.Calendar;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import android.view.View$OnClickListener;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.WeakHashMap;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyx
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public hyx() {
        final fzw d = new fzw((char[])null);
        this.d = d;
        final fzw fzw = d;
        final hyx b = new hyx(null, d, null, null, null, null, null, null);
        this.b = b;
        final hyx hyx = b;
        this.c = b.K();
        final cyb a = new cyb((byte[])null, (byte[])null);
        this.a = a;
        final cyb cyb = a;
        final ejk ejk = new ejk(a, (byte[])null, (byte[])null, (byte[])null);
        final hyx hyx2 = b;
        b.B("require", (eka)ejk);
        final eiz a2 = eiz.a;
        final cyb cyb2 = a;
        a.h("internal.platform", (Callable)a2);
        final ejt ejt = new ejt(0.0);
        final hyx hyx3 = b;
        b.B("runtime.counter", (eka)ejt);
    }
    
    public hyx(final acgs a, final ViewGroup viewGroup) {
        this.a = a;
        this.c = viewGroup.findViewById(2131428527);
        this.d = viewGroup.findViewById(2131428528);
        this.b = viewGroup.findViewById(2131428525);
    }
    
    public hyx(final acvy b, final acpk d, final vcy a, final acnc c) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public hyx(final adei c, final zmf a, final vwa b, final cya d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public hyx(final Context a, final acvw d, final aujg aujg, final acwt acwt, final TextView c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        final acsx h = aujg.H((View)c);
        this.b = h;
        this.d = d;
        this.c = c;
        final ezm c2 = new ezm(acwt, 1);
        final acsx acsx = h;
        h.c = (acsw)c2;
    }
    
    public hyx(final Context a, final tvk b, final avu c, final vaf d, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public hyx(final Context c, final vcy a, final ViewGroup viewGroup) {
        this.c = c;
        this.a = a;
        this.d = viewGroup.findViewById(2131430078);
        this.b = viewGroup.findViewById(2131430077);
    }
    
    public hyx(final View view, final acgs acgs) {
        final ImageView a = (ImageView)view.findViewById(2131431084);
        this.a = a;
        this.c = view.findViewById(2131431083);
        this.b = view.findViewById(2131431085);
        final tpg tpg = new tpg();
        final ImageView imageView = a;
        this.d = new achb((tpo)acgs, (tpk)tpg, a, false);
    }
    
    public hyx(final arkg b, final tyv c) {
        this.d = Collections.synchronizedList(new ArrayList<Object>());
        this.a = atjs.e();
        this.b = b;
        this.c = c;
    }
    
    public hyx(final atke d, final atke c, final atke a, final atke b) {
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public hyx(final atke a, final atke c, final atke b, final atke d, final byte[] array) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
    }
    
    public hyx(final atke a, final atke b, final atke d, final atke c, final byte[] array, final byte[] array2) {
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
    }
    
    public hyx(final atke c, final atke d, final atke a, final atke b, final byte[] array, final byte[] array2, final byte[] array3) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public hyx(final atke a, final atke b, final atke d, final atke c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        b.getClass();
        this.b = b;
        this.d = d;
        c.getClass();
        this.c = c;
    }
    
    public hyx(final atke c, final atke b, final atke a, final atke d, final byte[] array, final byte[] array2, final char[] array3) {
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public hyx(final atke a, final atke d, final atke c, final atke b, final byte[] array, final char[] array2) {
        this.a = a;
        this.d = d;
        this.c = c;
        b.getClass();
        this.b = b;
    }
    
    public hyx(final atke a, final atke b, final atke c, final atke d, final char[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public hyx(final atke d, final atke b, final atke a, final atke c, final char[] array, final byte[] array2) {
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public hyx(final atke c, final atke a, final atke b, final atke d, final char[] array, final char[] array2) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
    }
    
    public hyx(final atke c, final atke a, final atke b, final atke d, final int[] array) {
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
    }
    
    public hyx(final atke a, final atke d, final atke c, final atke b, final short[] array) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        this.c = c;
        b.getClass();
        this.b = b;
    }
    
    public hyx(final atke a, final atke b, final atke c, final atke d, final short[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public hyx(final atke a, final atke b, final atke d, final qdw c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public hyx(final atke d, final rpa rpa) {
        this.d = d;
        final Object b = rpa.b();
        if (b instanceof amzt) {
            this.c = b;
        }
        else {
            this.c = null;
        }
        this.b = new HashMap();
        final Object c = this.c;
        int bi;
        if (c == null || (bi = aqsx.bi(((amzt)c).c)) == 0) {
            bi = 1;
        }
        int b2;
        if (c != null) {
            b2 = ((amzt)c).b;
        }
        else {
            b2 = 0;
        }
        final boolean b3 = c != null && ((amzt)c).d;
        final boolean b4 = c != null && ((amzt)c).e;
        final String p2 = this.P();
        Object a;
        if (bi - 1 != 1) {
            a = new fbg(d, b2, b3, b4, p2);
        }
        else {
            a = new fbf(d, b2, b3, b4, p2);
        }
        this.a = a;
    }
    
    public hyx(final IntersectionEngine a, final gjl b, final cya c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new WeakHashMap();
    }
    
    public hyx(final gfz gfz, final asid asid, final vdr vdr, final vaf vaf) {
        apim apim;
        if ((apim = vaf.b().q) == null) {
            apim = apim.a;
        }
        if (apim.e) {
            final asht z = vdr.b().h(adkf.a, false).af(asid).K((asjs)hus.b).Z((asjr)hsb.m);
            this.d = z;
            final hus a = hus.a;
            final asht asht = z;
            final asht z2 = z.K((asjs)a).Z((asjr)hsb.n);
            this.a = z2;
            final hsb o = hsb.o;
            final asht asht2 = z;
            this.c = z.Z((asjr)o).aU().e(0);
            this.b = gfz.a().ax((ashw)z2).am(1L).Z((asjr)hsb.p).aU().e(0);
            return;
        }
        this.b = asht.I();
        this.c = asht.I();
        this.a = asht.I();
        this.d = asht.I();
    }
    
    public hyx(final hyx c, final fzw a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = new HashMap();
        this.d = new HashMap();
        this.c = c;
        this.a = a;
    }
    
    public hyx(final man a, final zmf b, final acid c, final atke d, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public hyx(final ovz b, final dst c, final String a) {
        this.d = "imageprefetch";
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hyx(final ovz d, final dst dst, final String s, final byte[] array) {
        this.b = "imageprefetch";
        this.d = d;
        final ArrayList c = new ArrayList();
        this.c = c;
        final ArrayList a = new ArrayList();
        this.a = a;
        c.add(dst);
        a.add(s);
    }
    
    public hyx(final pvh b, final pvh d, final cya a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = new eg((char[])null);
    }
    
    public hyx(final tcq a, final wxx b, final oby c, final vai d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public hyx(final vcy c, final wyv d, final actt b, final oiu a) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public hyx(final zmf b, final aln c, final fmm a, final Executor d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public hyx(final byte[] array) {
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.a = new HashMap();
    }
    
    private final View$OnClickListener N(final aicz aicz, final amfo amfo, final Map map) {
        if (aicz != null) {
            final int b = aicz.b;
            if ((b & 0x4000) == 0x0) {
                if ((b & 0x8000) == 0x0) {
                    return null;
                }
            }
            return (View$OnClickListener)new ezp(this, aicz, amfo, map, 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        return null;
    }
    
    private static aicz O(final amfn amfn) {
        if (amfn != null && (amfn.b & 0x1) != 0x0) {
            aicz aicz;
            if ((aicz = amfn.c) == null) {
                aicz = aicz.a;
            }
            return aicz;
        }
        return null;
    }
    
    private final String P() {
        final Object c = this.c;
        String f;
        if (c != null) {
            f = ((amzt)c).f;
        }
        else {
            f = "";
        }
        return f;
    }
    
    public static gdd e(final gdd gdd, final Function function) {
        return gdd.b(gdd.a, gdd.b.flatMap(function), gdd.c.flatMap(function));
    }
    
    public static Map i(final amfo amfo, final Map map, final boolean b) {
        final Map i = wyx.i((Object)amfo, b);
        if (map != null) {
            i.putAll(map);
        }
        return i;
    }
    
    public static final aoaf o(final vvl vvl) {
        anzw anzw = null;
        Label_0066: {
            if (vvl != null) {
                for (final Object next : vvl.a()) {
                    if (next instanceof anzw) {
                        anzw = (anzw)next;
                        final int bc = aqsx.bC(anzw.e);
                        if (bc != 0 && bc == 10050) {
                            break Label_0066;
                        }
                        continue;
                    }
                }
            }
            anzw = null;
        }
        if (anzw == null) {
            return null;
        }
        final Iterator<Object> iterator2 = ((List<Object>)anzw.d).iterator();
        while (iterator2.hasNext()) {
            aoaf aoaf;
            if ((aoaf = iterator2.next().i) == null) {
                aoaf = aoaf.a;
            }
            final int ba = aqsx.bA(aoaf.c);
            if (ba != 0 && ba == 344) {
                return aoaf;
            }
        }
        return null;
    }
    
    public final void A(final String s, final eka eka) {
        this.z(s, eka);
        ((Map<String, Boolean>)this.d).put(s, Boolean.valueOf(true));
    }
    
    public final void B(final String s, final eka eka) {
        if (!((Map)this.b).containsKey(s)) {
            final Object c = this.c;
            if (c != null) {
                if (((hyx)c).C(s)) {
                    ((hyx)this.c).B(s, eka);
                    return;
                }
            }
        }
        if (((Map)this.d).containsKey(s)) {
            return;
        }
        if (eka == null) {
            ((Map<Object, Object>)this.b).remove(s);
            return;
        }
        ((Map<String, eka>)this.b).put(s, eka);
    }
    
    public final boolean C(final String s) {
        if (((Map)this.b).containsKey(s)) {
            return true;
        }
        final Object c = this.c;
        return c != null && ((hyx)c).C(s);
    }
    
    public final void D(final String s, final Callable callable) {
        ((cyb)this.a).h(s, callable);
    }
    
    public final Object E(final dxh dxh) {
        return ((Map<K, Object>)this.a).get(dxh);
    }
    
    public final Collection F() {
        return ((Map<Object, Object>)this.a).values();
    }
    
    public final Set G() {
        return ((Map<Object, Object>)this.a).keySet();
    }
    
    public final void H(final dxh dxh) {
        if (((Map<Object, Object>)this.a).remove(dxh) == null) {
            return;
        }
        final int a = dxh.a;
        if (a == 1) {
            ((Map<Object, Object>)this.b).remove(dxh.b);
            return;
        }
        if (a != 2) {
            ((Map<Object, Object>)this.d).remove(dxh.b);
            return;
        }
        final String c = dxh.c;
        final Map map = ((Map<K, Map>)this.c).get(c);
        map.remove(dxh.b);
        if (map.isEmpty()) {
            ((Map<Object, Object>)this.c).remove(c);
        }
    }
    
    public final dxh I(final String s) {
        final Map map = ((Map<K, Map>)this.c).get(null);
        if (map != null) {
            return (dxh)map.get(s);
        }
        return null;
    }
    
    public final hyx J(final TextView textView) {
        final Context context = (Context)((atke)this.c).a();
        context.getClass();
        final acvw acvw = (acvw)((atke)this.b).a();
        acvw.getClass();
        final aujg aujg = (aujg)((atke)this.a).a();
        aujg.getClass();
        final acwt acwt = (acwt)((atke)this.d).a();
        acwt.getClass();
        return new hyx(context, acvw, aujg, acwt, textView, null, null, null);
    }
    
    public final hyx K() {
        return new hyx(this, (fzw)this.a, null, null, null, null, null, null);
    }
    
    public final hyx L() {
        return ((hyx)this.c).K();
    }
    
    public final eka M(final hyx hyx, final njs... array) {
        eka eka = eka.f;
        for (int length = array.length, i = 0; i < length; ++i) {
            final eka m = epf.m(array[i]);
            epf.af((hyx)this.b);
            if (!(m instanceof ekb)) {
                eka = m;
                if (!(m instanceof ejz)) {
                    continue;
                }
            }
            eka = ((fzw)this.d).ag(hyx, m);
        }
        return eka;
    }
    
    public final void a(final int n, final long n2, final long n3, final boolean b, final long n4, final boolean b2, final boolean b3) {
        long n6;
        if (n3 > 0L) {
            long n5;
            if (n3 > 86400L) {
                n5 = 3600L;
            }
            else {
                n5 = n3;
            }
            n6 = ThreadLocalRandom.current().nextInt((int)n5) + n2;
        }
        else {
            n6 = n2;
        }
        final long c = ((oby)this.c).c();
        final long n7 = c / 1000L;
        final Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(c);
        instance.set(11, (int)(n6 / 3600L % 24L));
        instance.set(12, (int)(n6 / 60L % 60L));
        instance.set(13, (int)(n6 % 60L));
        long n8;
        if (n7 > -900L + (n8 = instance.getTimeInMillis() / 1000L)) {
            instance.add(11, 24);
            n8 = instance.getTimeInMillis() / 1000L;
        }
        final long min = Math.min(Duration.ofDays(2L).toSeconds() + n7, Math.max(n7, n8));
        if (n2 >= 0L) {
            int n9;
            if (n == 2) {
                n9 = 1;
            }
            else if (n == 3) {
                n9 = 4;
            }
            else {
                n9 = 2;
            }
            final Bundle bundle = new Bundle();
            final long nextLong = ThreadLocalRandom.current().nextLong();
            bundle.putLong("task_id_key", nextLong);
            bundle.putLong("scheduled_time_seconds_key", min);
            bundle.putLong("base_local_time_seconds_key", n2);
            bundle.putLong("max_jitter_time_seconds_key", n3);
            bundle.putBoolean("task_schedules_next_task_key", b);
            bundle.putLong("max_run_attempts_key", n4);
            bundle.putBoolean("requires_unmetered_network_key", b2);
            bundle.putBoolean("requires_charging_key", b3);
            final Object a = this.a;
            int n10;
            if (!b2) {
                n10 = 1;
            }
            else {
                n10 = 2;
            }
            final boolean e = ((tcq)a).e("BACKGROUND_HOME_PREFETCH", min - n7, n9, n10, b3, bundle, (ypi)null, false);
            final ahaz builder = ((ahbh)akbx.a).createBuilder();
            builder.copyOnWrite();
            final akbx akbx = (akbx)builder.instance;
            akbx.c = n - 1;
            akbx.b |= 0x1;
            builder.copyOnWrite();
            final akbx akbx2 = (akbx)builder.instance;
            akbx2.b |= 0x2;
            akbx2.d = min;
            builder.copyOnWrite();
            final akbx akbx3 = (akbx)builder.instance;
            akbx3.b |= 0x4;
            akbx3.e = nextLong;
            builder.copyOnWrite();
            final akbx akbx4 = (akbx)builder.instance;
            akbx4.b |= 0x8;
            akbx4.f = e;
            final akbx akbx5 = (akbx)builder.build();
            final aknr d = aknt.d();
            ((ahaz)d).copyOnWrite();
            aknt.V((aknt)d.instance, akbx5);
            ((wxx)this.b).d((aknt)((ahaz)d).build());
        }
    }
    
    public final hsc b() {
        final hsh hsh = (hsh)((atke)this.d).a();
        hsh.getClass();
        final lkx lkx = (lkx)((atke)this.c).a();
        lkx.getClass();
        final arwh arwh = (arwh)((atke)this.a).a();
        arwh.getClass();
        final afaq afaq = (afaq)((atke)this.b).a();
        afaq.getClass();
        return new hsc(hsh, lkx, arwh, afaq, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final int c() {
        return ((List)this.d).size();
    }
    
    public final List d() {
        synchronized (this.d) {
            return new ArrayList((Collection)this.d);
        }
    }
    
    public final ashi f(final ashi ashi, final ashi ashi2) {
        return ashi.Y((asjr)new flo(this, new ezt(), ashi2, 4, null, null, null));
    }
    
    public final void g(final aiqm aiqm) {
        if (((actt)this.b).c((List)aiqm.g)) {
            final int b = aiqm.b;
            if ((b & 0x1) != 0x0) {
                final Object c = this.c;
                aiqj aiqj;
                if ((aiqj = aiqm.c) == null) {
                    aiqj = aiqj.a;
                }
                ((vcy)c).a(aiqj);
            }
            else if ((b & 0x2) != 0x0) {
                final Object c2 = this.c;
                aiqj aiqj2;
                if ((aiqj2 = aiqm.d) == null) {
                    aiqj2 = aiqj.a;
                }
                ((vcy)c2).a(aiqj2);
                ((wyv)this.d).pF().t((wzz)new wyt(aiqm.f), (alhi)null);
            }
            ((actt)this.b).a((List)aiqm.g);
        }
    }
    
    public final void h() {
        ((oiu)this.a).a();
    }
    
    public final acvz j(final amfo amfo, final Map map) {
        amfn amfn;
        if ((amfn = amfo.g) == null) {
            amfn = amfn.a;
        }
        final aicz o = O(amfn);
        amfn amfn2;
        if ((amfn2 = amfo.h) == null) {
            amfn2 = amfn.a;
        }
        final aicz o2 = O(amfn2);
        final acvz g = ((acvy)this.b).j().g(amfo.m ^ true);
        g.l(amfo.l ^ true);
        ajut ajut;
        if ((amfo.b & 0x10) != 0x0) {
            if ((ajut = amfo.e) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        g.b = (CharSequence)acak.b(ajut);
        final SpannableStringBuilder c = new SpannableStringBuilder();
        for (int i = 0; i < amfo.f.size(); ++i) {
            if (i > 0) {
                c.append((CharSequence)" ");
            }
            c.append((CharSequence)acak.c((ajut)amfo.f.get(i), (acaf)this.c));
        }
        g.c = (CharSequence)c;
        ajut ajut2;
        if (o != null && (o.b & 0x200) != 0x0) {
            if ((ajut2 = o.i) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        final acvz b = g.b((CharSequence)acak.b(ajut2), this.N(o, amfo, map), o);
        ajut ajut3;
        if (o2 != null && (o2.b & 0x200) != 0x0) {
            if ((ajut3 = o2.i) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        final acvz c2 = b.c((CharSequence)acak.b(ajut3), this.N(o2, amfo, null));
        c2.h = o2;
        if ((amfo.b & 0x1) != 0x0) {
            aotp j;
            if ((j = amfo.c) == null) {
                j = aotp.a;
            }
            c2.n(0);
            c2.i = j;
            c2.j = Optional.empty();
        }
        if ((amfo.b & 0x2) != 0x0) {
            final Object d = this.d;
            akdi akdi;
            if ((akdi = amfo.d) == null) {
                akdi = akdi.a;
            }
            akdh akdh;
            if ((akdh = akdh.b(akdi.c)) == null) {
                akdh = akdh.a;
            }
            c2.d(((acpk)d).a(akdh));
        }
        return c2;
    }
    
    public final fwm k(final ImageView imageView) {
        final SubscriptionNotificationOptionsDialogFragmentControllerImpl subscriptionNotificationOptionsDialogFragmentControllerImpl = (SubscriptionNotificationOptionsDialogFragmentControllerImpl)((atke)this.a).a();
        subscriptionNotificationOptionsDialogFragmentControllerImpl.getClass();
        final acpk acpk = (acpk)((atke)this.b).a();
        acpk.getClass();
        final acvw acvw = (acvw)((atke)this.c).a();
        acvw.getClass();
        final aeea aeea = (aeea)((atke)this.d).a();
        aeea.getClass();
        imageView.getClass();
        return new fwm(subscriptionNotificationOptionsDialogFragmentControllerImpl, acpk, acvw, aeea, imageView, null, null, null, null);
    }
    
    public final fwl l(final View view) {
        final flb flb = (flb)((atke)this.c).a();
        flb.getClass();
        final hyx hyx = (hyx)((atke)this.d).a();
        hyx.getClass();
        final hyx hyx2 = (hyx)((atke)this.a).a();
        hyx2.getClass();
        final gug gug = (gug)((atke)this.b).a();
        gug.getClass();
        view.getClass();
        return new fwl(flb, hyx, hyx2, gug, view, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ListenableFuture m(final vvl vvl) {
        final aoaf o = o(vvl);
        if (o != null) {
            aded aded;
            if (((zmf)this.a).t()) {
                aded = aded.b(((zmf)this.a).c().d());
            }
            else {
                aded = aded.c();
            }
            return ((adei)this.c).c(aded, (Object)o, (adeo)aden.b);
        }
        return afwm.l((Throwable)new InvalidParameterException());
    }
    
    public final void n() {
        aftq.f(aftq.e(((qqr)((cya)this.d).a).a(), (aezf)fng.n, (Executor)afum.a), (aftz)new fdy(this, 7, (byte[])null, (byte[])null, (byte[])null), (Executor)afum.a).addListener((Runnable)tg.a, (Executor)afum.a);
    }
    
    public final fvr p(final View view) {
        final vcy vcy = (vcy)((atke)this.d).a();
        vcy.getClass();
        final acpk acpk = (acpk)((atke)this.b).a();
        acpk.getClass();
        final tjm tjm = (tjm)((atke)this.a).a();
        tjm.getClass();
        final aeea aeea = (aeea)((atke)this.c).a();
        aeea.getClass();
        view.getClass();
        return new fvr(vcy, acpk, tjm, aeea, view, null, null, null, null);
    }
    
    public final fto q(final ftq ftq, final View view) {
        final acgs acgs = (acgs)((atke)this.a).a();
        acgs.getClass();
        final Context context = (Context)((atke)this.b).a();
        context.getClass();
        final acpk acpk = (acpk)((atke)this.d).a();
        acpk.getClass();
        final vai vai = (vai)((atke)this.c).a();
        vai.getClass();
        view.getClass();
        return new fto(acgs, context, acpk, ftq, vai, view);
    }
    
    public final void r(final Activity activity, final String s) {
        activity.getClass();
        String s2 = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s2 = "yt_android_default";
        }
        ((acid)this.c).l(s2, (adhp)new fjh(this, tpe.bg(activity), s2, Uri.parse(activity.getResources().getString(2132020215)), activity, null, null, null));
    }
    
    public final Object s(final fbj fbj, final Class clazz, final String s) {
        final Object value = ((Map<K, Object>)this.b).get(fbj);
        if (clazz.isInstance(value)) {
            final Object cast = clazz.cast(value);
            ((fbi)this.a).d(fbj, s, (Object)null, true);
            return cast;
        }
        return null;
    }
    
    public final Object t(final String s, final Class clazz, final String s2, final fbh fbh) {
        return this.u(s, clazz, s2, fbh, null);
    }
    
    public final Object u(String p5, final Class clazz, final String s, final fbh fbh, final Object o) {
        final fbj fbj = new fbj(p5, clazz);
        Object s2;
        if ((s2 = this.s(fbj, clazz, s)) == null) {
            final Object a = fbh.a();
            final boolean f = aezr.f(fbj.a);
            int n = 0;
            if (f) {
                final adia adia = (adia)((atke)this.d).a();
                final String e = aezr.e(s);
                p5 = this.P();
                ((qsa)adia.e.a()).b(new Object[] { e, p5 });
            }
            ((Map<fbj, Object>)this.b).put(fbj, a);
            if (((fbi)this.a).f(fbj)) {
                ((qsa)((adia)((atke)this.d).a()).f.a()).b(new Object[] { aezr.e(s), this.P() });
            }
            ((fbi)this.a).d(fbj, s, o, false);
            s2 = a;
            if (((fbi)this.a).e()) {
                final ArrayList list = new ArrayList();
                ((fbi)this.a).c((List)list);
                final int size = list.size();
                while (true) {
                    s2 = a;
                    if (n >= size) {
                        break;
                    }
                    final fbj fbj2 = (fbj)list.get(n);
                    ((Map<Object, Object>)this.b).remove(fbj2);
                    ((fbi)this.a).b(fbj2);
                    ++n;
                }
            }
        }
        return s2;
    }
    
    public final void v(final aicz aicz, final wyw wyw) {
        ((acsx)this.b).a(aicz, wyw, (Map)afev.m(wyx.b, Boolean.TRUE));
        if (aicz == null) {
            return;
        }
        final Object c = this.c;
        final int b = aicz.b;
        final akbo akbo = null;
        ajut ajut;
        if ((b & 0x200) != 0x0) {
            if ((ajut = aicz.i) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        ((TextView)c).setText((CharSequence)acak.b(ajut));
        final int c2 = aicz.c;
        final int n = 1;
        Label_0313: {
            if (c2 == 1) {
                final int aa = aefb.aa((int)aicz.d);
                if (aa != 0) {
                    if (aa == 7) {
                        ((TextView)this.c).setTextColor(tpe.cr((Context)this.a, 2130970852));
                        break Label_0313;
                    }
                }
            }
            if (aicz.c == 1) {
                final int aa2 = aefb.aa((int)aicz.d);
                if (aa2 != 0) {
                    if (aa2 == 6) {
                        ((TextView)this.c).setTextColor(tpe.cr((Context)this.a, 2130970922));
                        break Label_0313;
                    }
                }
            }
            int aa3 = n;
            if (aicz.c == 1) {
                aa3 = aefb.aa((int)aicz.d);
                if (aa3 == 0) {
                    aa3 = n;
                }
            }
            ttr.b("Unknown sponsor button style: ".concat(Integer.toString(aa3 - 1)));
            ((TextView)this.c).setTextColor(tpe.cr((Context)this.a, 2130970922));
        }
        akbq akbq;
        if ((akbq = aicz.m) == null) {
            akbq = akbq.a;
        }
        akbo a = akbo;
        if (akbq.b == 102716411) {
            akbq akbq2;
            if ((akbq2 = aicz.m) == null) {
                akbq2 = akbq.a;
            }
            if (akbq2.b == 102716411) {
                a = (akbo)akbq2.c;
            }
            else {
                a = akbo.a;
            }
        }
        if (a != null) {
            ((acvw)this.d).b(a, (View)this.c, (Object)aicz, wyw);
        }
    }
    
    public final eka w(final eka eka) {
        return ((fzw)this.a).ag(this, eka);
    }
    
    public final eka x(final ejq ejq) {
        eka eka = eka.f;
        final Iterator k = ejq.k();
        while (k.hasNext()) {
            final eka eka2 = eka = ((fzw)this.a).ag(this, ejq.e((int)k.next()));
            if (eka2 instanceof ejs) {
                eka = eka2;
                break;
            }
        }
        return eka;
    }
    
    public final eka y(final String s) {
        if (((Map)this.b).containsKey(s)) {
            return ((Map<K, eka>)this.b).get(s);
        }
        final Object c = this.c;
        if (c != null) {
            return ((hyx)c).y(s);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", s));
    }
    
    public final void z(final String s, final eka eka) {
        if (((Map)this.d).containsKey(s)) {
            return;
        }
        if (eka == null) {
            ((Map<Object, Object>)this.b).remove(s);
            return;
        }
        ((Map<String, eka>)this.b).put(s, eka);
    }
}
