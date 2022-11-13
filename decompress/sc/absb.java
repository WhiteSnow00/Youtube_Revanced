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

public final class absb
{
    private static final String o;
    public final tgd a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final String d;
    public final arkg e;
    public final Set f;
    public CaptioningManager g;
    public boolean h;
    public SubtitleTrack i;
    public abtj j;
    public PlayerResponseModel k;
    public abzl l;
    public boolean m;
    public final acid n;
    private final abrj p;
    private final aglu q;
    
    static {
        o = ttr.a("subtitles");
    }
    
    public absb(final tgd a, final Context b, final acid n, final ScheduledExecutorService c, final String d, final ListenableFuture listenableFuture, final arkg e, final abrj p10, final byte[] array, final byte[] array2) {
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
        p10.getClass();
        this.p = p10;
        listenableFuture.getClass();
        if (p10.t()) {
            teu.i(listenableFuture, (tet)new zif(this, 9));
        }
        final CaptioningManager g = this.g;
        final ajp f = aep.f(b.getResources().getConfiguration());
        final boolean h = f.h();
        final String s = null;
        String language;
        if (!h) {
            language = f.g(0).getLanguage();
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
        this.q = new aglu(language, language2);
    }
    
    public static void d(final Throwable t) {
        ttr.d("Failed to set caption preferences", t);
    }
    
    public static void e(final Throwable t) {
        ttr.d("Failed to set caption preferences", t);
    }
    
    public static boolean k(final acid acid, final CaptioningManager captioningManager) {
        final ListenableFuture g = acid.g();
        final TimeUnit seconds = TimeUnit.SECONDS;
        final Boolean value = false;
        if (teu.g((Future)g, 1L, seconds, (Object)value)) {
            return (boolean)teu.g((Future)acid.f(), 1L, TimeUnit.SECONDS, (Object)value);
        }
        return captioningManager != null && captioningManager.isEnabled();
    }
    
    private final void m(final boolean h) {
        this.h = h;
        final abzl l = this.l;
        if (l != null) {
            l.aC().tu((Object)new aanm(this.h));
            return;
        }
        this.a.d((Object)new aanm(h));
    }
    
    public final int a() {
        return vhj.bR.bT;
    }
    
    public final List b() {
        final ArrayList list = new ArrayList();
        final abtj j = this.j;
        if (j == null) {
            return list;
        }
        final List list2 = (List)Collection$_EL.stream((Collection)j.e()).map((Function)zze.l).collect(Collectors.toCollection((Supplier)ihv.t));
        final aglu q = this.q;
        final List list3 = (List)Collection$_EL.stream((Collection)((Map<Object, Object>)q.b).entrySet()).filter((Predicate)new zzn(list2, 4)).sorted(Comparator$_EL.reversed(Comparator$_CC.comparingInt((ToIntFunction)gwo.f))).map((Function)zze.m).collect(Collectors.toCollection((Supplier)ihv.u));
        final Object a = q.a;
        if (a != null) {
            final SubtitleTrack subtitleTrack = (SubtitleTrack)a;
            if (list2.contains(subtitleTrack.e()) && subtitleTrack.s()) {
                list3.add(0, ((SubtitleTrack)q.a).e());
            }
        }
        final List list4 = (List)Collection$_EL.stream((Collection)list3).distinct().limit(3L).collect(Collectors.toCollection((Supplier)ihv.u));
        final abtj i = this.j;
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
            final abth c = subtitleTrack2.c();
            c.b(index);
            list5.add(c.a());
        }
        return list5;
    }
    
    public final List c() {
        final String string = this.b.getString(2132020004);
        final PlayerResponseModel k = this.k;
        if (k != null && this.j()) {
            final ArrayList list = new ArrayList();
            list.add(SubtitleTrack.p(string));
            list.addAll(aakt.W(k, this.a()));
            return list;
        }
        final abtj j = this.j;
        if (j != null) {
            return j.f();
        }
        return null;
    }
    
    public final void f(final PlayerResponseModel playerResponseModel, final aned aned) {
        final VideoStreamingData n = playerResponseModel.n();
        if (n != null && (n.u() || n.w())) {
            if (this.j()) {
                this.m(true);
            }
            return;
        }
        final abtj h = abtj.h(playerResponseModel.K(), aned, playerResponseModel.R(), this.b.getString(2132020004), this.b.getString(2132017524), this.p);
        if ((this.j = h) == null) {
            this.m(false);
            this.i(null, false);
            return;
        }
        if (!h.f().isEmpty()) {
            this.m(true);
        }
        final abtj j = this.j;
        Label_0607: {
            if (j != null) {
                Label_0255: {
                    boolean b;
                    if (this.m) {
                        b = (boolean)teu.g((Future)this.n.f(), 1L, TimeUnit.SECONDS, (Object)false);
                    }
                    else {
                        final abti a = abti.a;
                        final int ordinal = j.d().ordinal();
                        if (ordinal == 1) {
                            break Label_0607;
                        }
                        if (ordinal == 2) {
                            break Label_0255;
                        }
                        if (ordinal == 3) {
                            if (!(boolean)teu.g((Future)this.n.g(), 1L, TimeUnit.SECONDS, (Object)false)) {
                                break Label_0255;
                            }
                        }
                        b = k(this.n, this.g);
                    }
                    if (!b) {
                        break Label_0607;
                    }
                }
                final abtj i = this.j;
                SubtitleTrack b2;
                if (i == null) {
                    b2 = null;
                }
                else {
                    final abti d = i.d();
                    SubtitleTrack c = null;
                    Label_0440: {
                        Label_0335: {
                            if (!this.m) {
                                final aneb b3 = i.b;
                                if (b3 != null) {
                                    if ((b3.b & 0x80) != 0x0 && b3.k) {
                                        break Label_0335;
                                    }
                                }
                                if (d != abti.a) {
                                    c = null;
                                    break Label_0440;
                                }
                            }
                        }
                        final acid n2 = this.n;
                        ListenableFuture listenableFuture;
                        if (((vai)n2.b).be()) {
                            final aezp aezp = (aezp)((ativ)n2.c).aG();
                            String s;
                            if (aezp != null && aezp.h()) {
                                s = (String)aezp.c();
                            }
                            else {
                                s = "";
                            }
                            listenableFuture = afwm.m((Object)s);
                        }
                        else {
                            listenableFuture = aftq.e(((tmx)n2.a).a(), (aezf)abpk.j, (Executor)afum.a);
                        }
                        c = i.c((String)teu.g((Future)listenableFuture, 1L, TimeUnit.SECONDS, (Object)""));
                    }
                    final CaptioningManager g = this.g;
                    SubtitleTrack c2 = c;
                    if (c == null) {
                        c2 = c;
                        if (d == abti.a) {
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
                for (final pvh pvh : this.f) {
                    final iwl iwl = (iwl)pvh.a;
                    iwl.c = iwl.a.i;
                    final Runnable d2 = iwl.d;
                    if (d2 != null) {
                        d2.run();
                        ((iwl)pvh.a).d = null;
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
            ttr.j(absb.o, String.format("setSubtitleTrack name:%s languageCode:%s languageName:%s format:%d trackName:%s vssid:%s videoid:%s", a, a.e(), a.f(), a.b(), a.i(), a.l(), a.k()), new Throwable());
        }
        else {
            ttr.h(absb.o, "subtitleTrack is null");
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
            final abqs e2 = this.n.e();
            e2.b(Boolean.valueOf(b2));
            e2.b = e;
            teu.m(e2.a(), (tes)zsa.r);
            this.m = true;
            if (b) {
                final aglu q = this.q;
                if (a.s()) {
                    q.a = a;
                }
                aglu.q((Map)q.b, a.e());
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
            final abtj j = this.j;
            if (j != null) {
                final aneb b2 = j.b;
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
                                final abth a2 = j.a((anec)j.a.b.get(b2.g));
                                a2.e(true);
                                a = a2.a();
                            }
                        }
                    }
                }
                this.i = a;
            }
        }
        final aanl aanl = new aanl(this.i, b);
        final abzl l = this.l;
        if (l != null) {
            l.aB().tu((Object)aanl);
            return;
        }
        this.a.f((Object)aanl);
    }
    
    public final boolean j() {
        final PlayerResponseModel k = this.k;
        if (k == null) {
            return false;
        }
        final VideoStreamingData n = k.n();
        return n != null && n.w() && !aakt.W(k, this.a()).isEmpty();
    }
    
    public final void l(final ashi ashi, final ashi ashi2, final ashi ashi3, final abqg abqg, final abrj abrj) {
        final asiq asiq = new asiq();
        asiq.c(ashi.p().am(new abrx(this, 19)));
        asiq.c(ashi2.p().an(new abrx(this, 20), (asjm)abfd.m));
        if (abrj.d()) {
            asiq.c(((ashi)abqg.o).p().an(new absa(this, 1), (asjm)abfd.m));
        }
        if (abrj.t()) {
            asiq.c(ashi3.p().am(new absa(this, 0)));
        }
    }
}
