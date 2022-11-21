import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.concurrent.Executor;
import java.util.Iterator;
import j$.util.Comparator$_EL;
import java.util.function.ToIntFunction;
import j$.util.Comparator$_CC;
import java.util.function.Predicate;
import java.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.view.accessibility.CaptioningManager;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtm
{
    private static final String o;
    public final thg a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final String d;
    public final arna e;
    public final Set f;
    public CaptioningManager g;
    public boolean h;
    public SubtitleTrack i;
    public abut j;
    public PlayerResponseModel k;
    public acav l;
    public boolean m;
    public final acjq n;
    private final absv p;
    private final agnl q;
    
    static {
        o = tut.a("subtitles");
    }
    
    public abtm(final thg a, final Context b, final acjq n, final ScheduledExecutorService c, final String d, final ListenableFuture listenableFuture, final arna e, final absv p9, final byte[] array) {
        this.f = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        a.getClass();
        this.a = a;
        n.getClass();
        this.n = n;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = e;
        p9.getClass();
        this.p = p9;
        listenableFuture.getClass();
        if (p9.t()) {
            tfx.i(listenableFuture, (tfw)new zvx(this, 5));
        }
        final CaptioningManager g = this.g;
        final ajq d2 = aep.d(b.getResources().getConfiguration());
        final boolean h = d2.h();
        final String s = null;
        String language;
        if (!h) {
            language = d2.g(0).getLanguage();
        }
        else {
            language = null;
        }
        String language2 = s;
        if (g != null) {
            language2 = s;
            if (g.getLocale() != null) {
                final Locale locale = g.getLocale();
                language2 = s;
                if (locale != null) {
                    language2 = s;
                    if (locale.getLanguage() != null) {
                        language2 = locale.getLanguage();
                    }
                }
            }
        }
        this.q = new agnl(language, language2);
    }
    
    public static void d(final Throwable t) {
        tut.d("Failed to set caption preferences", t);
    }
    
    public static void e(final Throwable t) {
        tut.d("Failed to set caption preferences", t);
    }
    
    public static boolean l(final acjq acjq, final CaptioningManager captioningManager) {
        final ListenableFuture g = acjq.g();
        final TimeUnit seconds = TimeUnit.SECONDS;
        final Boolean value = false;
        if (tfx.g((Future)g, 1L, seconds, (Object)value)) {
            return (boolean)tfx.g((Future)acjq.f(), 1L, TimeUnit.SECONDS, (Object)value);
        }
        return captioningManager != null && captioningManager.isEnabled();
    }
    
    private final void m(final boolean h) {
        this.h = h;
        final acav l = this.l;
        if (l != null) {
            l.aC().tt(new aapj(this.h));
            return;
        }
        this.a.d((Object)new aapj(h));
    }
    
    public final int a() {
        return vir.bR.bT;
    }
    
    public final List b() {
        final ArrayList list = new ArrayList();
        final abut j = this.j;
        if (j == null) {
            return list;
        }
        final List list2 = (List)Collection$_EL.stream((Collection)j.e()).map((Function)zzl.o).collect(Collectors.toCollection((Supplier)iid.u));
        final agnl q = this.q;
        final List list3 = (List)Collection$_EL.stream((Collection)((Map<Object, Object>)q.b).entrySet()).filter((Predicate)new aabj(list2, 5)).sorted(Comparator$_EL.reversed(Comparator$_CC.comparingInt((ToIntFunction)gwz.f))).map((Function)zzl.p).collect(Collectors.toCollection((Supplier)achh.b));
        final Object a = q.a;
        if (a != null) {
            final SubtitleTrack subtitleTrack = (SubtitleTrack)a;
            if (list2.contains(subtitleTrack.e()) && subtitleTrack.s()) {
                list3.add(0, ((SubtitleTrack)q.a).e());
            }
        }
        final List list4 = (List)Collection$_EL.stream((Collection)list3).distinct().limit(3L).collect(Collectors.toCollection((Supplier)achh.b));
        final abut i = this.j;
        i.getClass();
        final List e = i.e();
        final ArrayList list5 = new ArrayList();
        for (final SubtitleTrack subtitleTrack2 : e) {
            int index;
            if (list4.contains(subtitleTrack2.e())) {
                index = list4.indexOf(subtitleTrack2.e());
            }
            else {
                index = -1;
            }
            final abur c = subtitleTrack2.c();
            c.b(index);
            list5.add(c.a());
        }
        return list5;
    }
    
    public final List c() {
        final String string = this.b.getString(2132020007);
        final PlayerResponseModel k = this.k;
        if (k != null && this.j()) {
            final ArrayList list = new ArrayList();
            list.add(SubtitleTrack.p(string));
            list.addAll(aamp.X(k, this.a()));
            return list;
        }
        final abut j = this.j;
        if (j != null) {
            return j.f();
        }
        return null;
    }
    
    public final void f(final PlayerResponseModel playerResponseModel, final angk angk) {
        final VideoStreamingData n = playerResponseModel.n();
        if (n != null && (n.u() || n.w())) {
            if (this.j()) {
                this.m(true);
            }
            return;
        }
        final abut h = abut.h(playerResponseModel.K(), angk, playerResponseModel.R(), this.b.getString(2132020007), this.b.getString(2132017524), this.p);
        if ((this.j = h) == null) {
            this.m(false);
            this.i(null, false);
            return;
        }
        if (!h.f().isEmpty()) {
            this.m(true);
        }
        final abut j = this.j;
        Label_0607: {
            if (j != null) {
                Label_0255: {
                    boolean b;
                    if (this.m) {
                        b = (boolean)tfx.g((Future)this.n.f(), 1L, TimeUnit.SECONDS, (Object)false);
                    }
                    else {
                        final abus a = abus.a;
                        final int ordinal = j.d().ordinal();
                        if (ordinal == 1) {
                            break Label_0607;
                        }
                        if (ordinal == 2) {
                            break Label_0255;
                        }
                        if (ordinal == 3) {
                            if (!(boolean)tfx.g((Future)this.n.g(), 1L, TimeUnit.SECONDS, (Object)false)) {
                                break Label_0255;
                            }
                        }
                        b = l(this.n, this.g);
                    }
                    if (!b) {
                        break Label_0607;
                    }
                }
                final abut i = this.j;
                SubtitleTrack b2;
                if (i == null) {
                    b2 = null;
                }
                else {
                    final abus d = i.d();
                    SubtitleTrack c = null;
                    Label_0440: {
                        Label_0335: {
                            if (!this.m) {
                                final angi b3 = i.b;
                                if (b3 != null) {
                                    if ((b3.b & 0x80) != 0x0 && b3.k) {
                                        break Label_0335;
                                    }
                                }
                                if (d != abus.a) {
                                    c = null;
                                    break Label_0440;
                                }
                            }
                        }
                        final acjq n2 = this.n;
                        ListenableFuture listenableFuture;
                        if (((vbs)n2.b).bh()) {
                            final afbh afbh = (afbh)((atls)n2.c).aG();
                            String s;
                            if (afbh != null && afbh.h()) {
                                s = (String)afbh.c();
                            }
                            else {
                                s = "";
                            }
                            listenableFuture = afxr.l(s);
                        }
                        else {
                            listenableFuture = afvh.e(((tnz)n2.a).a(), (afax)abro.i, (Executor)afwd.a);
                        }
                        c = i.c((String)tfx.g((Future)listenableFuture, 1L, TimeUnit.SECONDS, (Object)""));
                    }
                    final CaptioningManager g = this.g;
                    SubtitleTrack c2 = c;
                    if (c == null) {
                        c2 = c;
                        if (d == abus.a) {
                            c2 = c;
                            if (g != null) {
                                c2 = c;
                                if (g.isEnabled()) {
                                    final Locale locale = g.getLocale();
                                    c2 = c;
                                    if (locale != null) {
                                        c2 = i.c(locale.getLanguage());
                                    }
                                }
                            }
                        }
                    }
                    if ((b2 = c2) == null) {
                        b2 = i.b();
                    }
                }
                this.i(b2, false);
                for (final oqz oqz : this.f) {
                    final iwu iwu = (iwu)oqz.a;
                    iwu.c = iwu.a.i;
                    final Runnable d2 = iwu.d;
                    if (d2 != null) {
                        d2.run();
                        ((iwu)oqz.a).d = null;
                    }
                }
                return;
            }
        }
        this.i(null, false);
    }
    
    public final void g() {
        this.j = null;
        this.m(false);
        this.i(null, false);
        this.k = null;
    }
    
    public final void h(final SubtitleTrack a, final boolean b) {
        if (a != null && a.r()) {
            return;
        }
        boolean b2 = false;
        if (a != null) {
            tut.j(abtm.o, String.format("setSubtitleTrack name:%s languageCode:%s languageName:%s format:%d trackName:%s vssid:%s videoid:%s", a, a.e(), a.f(), a.b(), a.i(), a.l(), a.k()), new Throwable());
        }
        else {
            tut.h(abtm.o, "subtitleTrack is null");
        }
        if (a != null) {
            String e;
            if (a.t()) {
                e = "";
            }
            else {
                e = a.e();
                b2 = true;
            }
            final absc e2 = this.n.e();
            e2.b(b2);
            e2.b = e;
            tfx.m(e2.a(), (tfv)zvv.p);
            this.m = true;
            if (b) {
                final agnl q = this.q;
                if (a.s()) {
                    q.a = a;
                }
                agnl.q((Map)q.b, a.e());
            }
        }
        this.i(a, b);
    }
    
    public final void i(SubtitleTrack a, final boolean b) {
        this.i = a;
        final SubtitleTrack subtitleTrack = null;
        if (a != null && a.t()) {
            this.i = null;
        }
        if (this.i == null) {
            final abut j = this.j;
            if (j != null) {
                final angi b2 = j.b;
                a = subtitleTrack;
                if (b2 != null) {
                    a = subtitleTrack;
                    if (b2.h) {
                        final int g = b2.g;
                        a = subtitleTrack;
                        if (g >= 0) {
                            if (g >= j.a.b.size()) {
                                a = subtitleTrack;
                            }
                            else {
                                final abur a2 = j.a((angj)j.a.b.get(b2.g));
                                a2.e(true);
                                a = a2.a();
                            }
                        }
                    }
                }
                this.i = a;
            }
        }
        final aapi aapi = new aapi(this.i, b);
        final acav l = this.l;
        if (l != null) {
            l.aB().tt(aapi);
            return;
        }
        this.a.f((Object)aapi);
    }
    
    public final boolean j() {
        final PlayerResponseModel k = this.k;
        if (k == null) {
            return false;
        }
        final VideoStreamingData n = k.n();
        return n != null && n.w() && !aamp.X(k, this.a()).isEmpty();
    }
    
    public final void k(final aske aske, final aske aske2, final aske aske3, final abrp abrp, final absv absv) {
        final aslm aslm = new aslm();
        aslm.c(aske.p().am(new abtk(this, 3)));
        aslm.c(aske2.p().an(new abtk(this, 4), (asmi)abgj.p));
        if (absv.d()) {
            aslm.c(((aske)abrp.o).p().an(new abtk(this, 5), (asmi)abgj.p));
        }
        if (absv.t()) {
            aslm.c(aske3.p().am(new abtk(this, 6)));
        }
    }
}
