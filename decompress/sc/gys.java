import java.util.List;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import j$.time.Duration;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import java.util.Arrays;
import android.net.Uri$Builder;
import java.util.concurrent.TimeUnit;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gys implements ttg
{
    public final gyu a;
    public final afeq b;
    public final long c;
    public final aezp d;
    public final bny e;
    
    public gys(final gyu a, final afeq b, final long c, final aezp d, final bny e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(Object o) {
        final gyu a = this.a;
        final afeq b = this.b;
        final long c = this.c;
        final aezp d = this.d;
        final bny e = this.e;
        final bej bej = (bej)o;
        if (bej == null) {
            return;
        }
        final boolean e2 = a.e;
        if (a.l != null && a.n) {
            adkp.I(a.m.h(), (Object)"Source video uri missing when loading media in MEAudioPlayer");
            try {
                a.o.clear();
                final rcp l = a.l;
                l.getClass();
                l.b();
                if (rdz.i(a.d, (Uri)a.m.c(), 0L, TimeUnit.MILLISECONDS.toMicros(c)).f()) {
                    Uri build;
                    if (aezr.f((build = (Uri)a.m.c()).getScheme())) {
                        o = new Uri$Builder();
                        build = ((Uri$Builder)o).scheme("file").path(((Uri)a.m.c()).getPath()).build();
                    }
                    final rcp i = a.l;
                    i.getClass();
                    a.o.put(apoy.b, Arrays.asList(i.a(build)));
                    a.m.c().toString();
                }
                else {
                    ttr.g("VideoPlaybackC: Video does not have an audio track");
                }
                Uri d2;
                if (d.h()) {
                    d2 = ((ShortsCreationSelectedTrack)d.c()).d();
                }
                else {
                    d2 = null;
                }
                if (d2 != null && !d2.equals((Object)Uri.EMPTY)) {
                    final rcp j = a.l;
                    j.getClass();
                    final atzh a2 = j.a(d2);
                    final long c2 = ((ShortsCreationSelectedTrack)d.c()).c();
                    final long min = Math.min(c, ((ShortsCreationSelectedTrack)d.c()).b());
                    final rcp k = a.l;
                    k.getClass();
                    final Duration ofMillis = Duration.ofMillis(c2);
                    final Duration ofMillis2 = Duration.ofMillis(c2 + min);
                    if (k.b) {
                        if (!k.h.containsKey(a2)) {
                            o = new IllegalArgumentException("Track with the provided id does not exist");
                            throw o;
                        }
                        final ahaz builder = ((ahbh)aqsh.a).createBuilder();
                        final aqsb m = rcp.j(a2);
                        builder.copyOnWrite();
                        final aqsh aqsh = (aqsh)builder.instance;
                        m.getClass();
                        aqsh.c = m;
                        aqsh.b |= 0x1;
                        if (ofMillis.toMillis() != Long.MIN_VALUE && ofMillis2.toMillis() != Long.MIN_VALUE) {
                            final ahan ao = adyf.ao(ofMillis2.minus(ofMillis));
                            builder.copyOnWrite();
                            final aqsh aqsh2 = (aqsh)builder.instance;
                            ao.getClass();
                            aqsh2.d = ao;
                            aqsh2.b |= 0x2;
                        }
                        k.d((Callable)new pak(k, builder, 10));
                        final rcy e3 = k.h.get(a2).e;
                        e3.a((Runnable)new nht(e3, ofMillis, ofMillis2, 19));
                    }
                    a.o.put(apoy.c, Arrays.asList(a2));
                }
                if (a.q.bG() && !b.isEmpty()) {
                    final ArrayList list = new ArrayList();
                    final int size = ((List)b).size();
                    int n = 0;
                    final List list2 = (List)b;
                    while (n < size) {
                        final arbo arbo = (arbo)list2.get(n);
                        final rcp l2 = a.l;
                        l2.getClass();
                        final atzh a3 = l2.a(new Uri$Builder().scheme("file").path(arbo.c).build());
                        final rcp l3 = a.l;
                        l3.getClass();
                        arbj arbj;
                        if ((arbj = arbo.d) == null) {
                            arbj = arbj.a;
                        }
                        l3.d((Callable)new kxr(l3, a3, Duration.ofMillis((long)arbj.c), 13));
                        list.add(a3);
                        ++n;
                    }
                    if (!list.isEmpty()) {
                        a.o.put(apoy.d, list);
                    }
                }
                final rcp l4 = a.l;
                l4.getClass();
                o = new pak(l4, Duration.ofMillis(c), 9);
                l4.d((Callable)o);
                final rcp l5 = a.l;
                l5.getClass();
                l5.c(true);
                final rcp l6 = a.l;
                l6.getClass();
                o = new gyt(a);
                l6.e = Optional.ofNullable(o);
                final rcp l7 = a.l;
                l7.getClass();
                l7.h(Duration.ZERO);
            }
            catch (final Exception ex) {
                ttr.b("VideoPlaybackC: Failed to load media in MEAudioPlayer");
                zlm.c(zll.b, zlk.f, "[ShortsCreation][Android][Edit]Failed to load media in MEAudioPlayer", (Throwable)ex);
            }
        }
        else {
            bej.A(2);
        }
        bej.y(e2 ^ true);
        bej.M(e);
        bej.u();
        bej.C(1.0f);
    }
}
