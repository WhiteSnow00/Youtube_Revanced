import java.util.Iterator;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.concurrent.CopyOnWriteArrayList;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcq
{
    public boolean a;
    public CharSequence b;
    public CharSequence c;
    public aorm d;
    public wyh e;
    public abip f;
    public Bundle g;
    public final fqh h;
    public final c i;
    private final vjl j;
    private final List k;
    private lco l;
    private WatchNextResponseModel m;
    
    public lcq(final vjl j, final c i, final fqh h, final byte[] array, final byte[] array2) {
        this.h = h;
        this.j = j;
        this.i = i;
        this.k = new CopyOnWriteArrayList();
    }
    
    public static boolean l(final abip abip) {
        return abip.i == 12;
    }
    
    private final int m() {
        if (!this.k.isEmpty()) {
            return 1;
        }
        return 0;
    }
    
    private final void n() {
        final int m = this.m();
        final lco l = this.l;
        if (l != null) {
            l.a(m);
        }
    }
    
    public final int a(final WatchNextResponseModel watchNextResponseModel, final wyh e) {
        final lco l = this.l;
        final lco lco = null;
        WatchNextResponseModel watchNextResponseModel2;
        if (l != null) {
            watchNextResponseModel2 = l.get();
        }
        else {
            watchNextResponseModel2 = null;
        }
        if (watchNextResponseModel2 == watchNextResponseModel) {
            return 0;
        }
        lco i = lco;
        if (watchNextResponseModel != null) {
            i = new lco(watchNextResponseModel, this.m());
        }
        this.l = i;
        this.e = e;
        return 16;
    }
    
    public final WatchNextResponseModel b(final boolean b, final boolean b2, final boolean b3) {
        final c i = this.i;
        final WatchNextResponseModel c = this.c();
        boolean b4 = false;
        Label_0209: {
            if (c != null) {
                final alca f = c.f;
                if (f != null) {
                    albz albz;
                    if ((albz = f.c) == null) {
                        albz = albz.a;
                    }
                    if (albz.b == 49399797) {
                        albz albz2;
                        if ((albz2 = c.f.c) == null) {
                            albz2 = albz.a;
                        }
                        anws a;
                        if (albz2.b == 49399797) {
                            a = (anws)albz2.c;
                        }
                        else {
                            a = anws.a;
                        }
                        if (a.d.size() > 0) {
                            albz albz3;
                            if ((albz3 = c.f.c) == null) {
                                albz3 = albz.a;
                            }
                            anws a2;
                            if (albz3.b == 49399797) {
                                a2 = (anws)albz3.c;
                            }
                            else {
                                a2 = anws.a;
                            }
                            if ((((anwv)a2.d.get(0)).e & 0x40000) != 0x0) {
                                b4 = true;
                                break Label_0209;
                            }
                        }
                    }
                }
            }
            b4 = false;
        }
        final agza builder = ((agzi)anws.a).createBuilder();
        if (b4) {
            albz albz4;
            if ((albz4 = c.f.c) == null) {
                albz4 = albz.a;
            }
            anws a3;
            if (albz4.b == 49399797) {
                a3 = (anws)albz4.c;
            }
            else {
                a3 = anws.a;
            }
            builder.bA((anwv)a3.d.get(0));
        }
        if (b) {
            i.n(builder, b4 ^ true, b2, b3);
        }
        return com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c.m((anws)builder.build());
    }
    
    public final WatchNextResponseModel c() {
        final WatchNextResponseModel m = this.m;
        if (m != null) {
            return m;
        }
        final aioe b = this.h.b();
        apqi a = null;
        Label_0113: {
            if (b != null) {
                if (((agzd)b).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                    final apqg apqg = (apqg)((agzd)b).rr((agyr)WatchEndpointOuterClass.watchEndpoint);
                    apqj apqj;
                    if ((apqj = apqg.r) == null) {
                        apqj = apqj.a;
                    }
                    if (apqj.b == 128400768) {
                        apqj apqj2;
                        if ((apqj2 = apqg.r) == null) {
                            apqj2 = apqj.a;
                        }
                        if (apqj2.b == 128400768) {
                            a = (apqi)apqj2.c;
                            break Label_0113;
                        }
                        a = apqi.a;
                        break Label_0113;
                    }
                }
            }
            a = null;
        }
        byte[] i;
        if (a != null) {
            i = a.c.I();
        }
        else {
            i = null;
        }
        if (i == null) {
            return null;
        }
        return this.m = new WatchNextResponseModel((alcj)this.j.a(i, (MessageLite)alcj.a));
    }
    
    public final WatchNextResponseModel d() {
        final lco l = this.l;
        if (l != null) {
            return (WatchNextResponseModel)l.get();
        }
        return null;
    }
    
    public final CharSequence e() {
        if (this.b == null) {
            this.g();
        }
        return this.b;
    }
    
    public final void f(final int n) {
        if (n == 0) {
            return;
        }
        final Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            ((lcp)iterator.next()).g(this, n);
        }
    }
    
    public final void g() {
        if (this.c() != null && this.c().f != null) {
            albz albz;
            if ((albz = this.c().f.c) == null) {
                albz = albz.a;
            }
            if (albz.b == 49399797) {
                albz albz2;
                if ((albz2 = this.c().f.c) == null) {
                    albz2 = albz.a;
                }
                anws a;
                if (albz2.b == 49399797) {
                    a = (anws)albz2.c;
                }
                else {
                    a = anws.a;
                }
                if (a.d.size() != 0) {
                    alib alib;
                    if ((alib = ((anwv)a.d.get(0)).j) == null) {
                        alib = alib.a;
                    }
                    if (alib.e.size() != 0) {
                        final alie alie = (alie)alib.e.get(0);
                        if ((alie.b & 0x1000000) != 0x0) {
                            aogh aogh;
                            if ((aogh = alie.H) == null) {
                                aogh = aogh.a;
                            }
                            final int b = aogh.b;
                            final ajsq ajsq = null;
                            ajsq ajsq2;
                            if ((b & 0x2) != 0x0) {
                                if ((ajsq2 = aogh.c) == null) {
                                    ajsq2 = ajsq.a;
                                }
                            }
                            else {
                                ajsq2 = null;
                            }
                            this.b = (CharSequence)abyh.b(ajsq2);
                            aogg aogg;
                            if ((aogg = aogh.d) == null) {
                                aogg = aogg.a;
                            }
                            if ((aogg.b & 0x1) != 0x0) {
                                aogg aogg2;
                                if ((aogg2 = aogh.d) == null) {
                                    aogg2 = aogg.a;
                                }
                                aogd aogd;
                                if ((aogd = aogg2.c) == null) {
                                    aogd = aogd.a;
                                }
                                ajsq ajsq3 = ajsq;
                                if ((aogd.b & 0x2) != 0x0 && (ajsq3 = aogd.d) == null) {
                                    ajsq3 = ajsq.a;
                                }
                                this.c = (CharSequence)abyh.b(ajsq3);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void h(final lcp lcp) {
        if (this.k.contains(lcp)) {
            return;
        }
        this.k.add(lcp);
        this.n();
    }
    
    public final void i(final boolean a) {
        if (this.a == a) {
            return;
        }
        this.a = a;
        this.f(1);
    }
    
    public final void j(final Bundle g) {
        if (this.g == g) {
            return;
        }
        this.g = g;
        this.f(64);
    }
    
    public final void k(final lcp lcp) {
        this.k.remove(lcp);
        if (this.k.isEmpty()) {
            this.n();
        }
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("id", (Object)this.h);
        o.h("isCurrentPlayback", this.a);
        o.b("title", (Object)this.b);
        o.f("idHashCode", this.h.hashCode());
        return o.toString();
    }
}
