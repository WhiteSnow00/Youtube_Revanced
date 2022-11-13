import java.lang.ref.WeakReference;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Optional;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.Map;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftf implements otb
{
    private final InlinePlaybackLifecycleController a;
    private final get b;
    private final auda c;
    
    public ftf(final auda c, final InlinePlaybackLifecycleController a, final get b, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final ahaq a() {
        return (ahaq)aqnn.b;
    }
    
    public final ashc b(Object d, final ota ota) {
        final aqnn aqnn = (aqnn)d;
        ashc ashc;
        if (!this.b.e()) {
            ashc = ashc.f();
        }
        else {
            final String g = ota.g;
            if (g != null && "InlinePlaybackCommandEventData".equals(g)) {
                d = ota.d;
                if (!(d instanceof Map)) {
                    ashc = ashc.t(new Throwable("InlineMutedCommand dispatched without eventData."));
                }
                else {
                    final Map map = (Map)d;
                    final Boolean value = false;
                    final boolean booleanValue = (boolean)tpe.N(map, (Object)"isAutoNav", (Object)value);
                    final boolean booleanValue2 = (boolean)tpe.N(map, (Object)"supportsAutoAdvance", (Object)value);
                    final fsr fsr = map.get("playerTrackingViewVisibilityListener");
                    final int b = aqsx.B(aqnn.d);
                    if (b != 0) {
                        if (b == 2) {
                            CommandOuterClass$Command commandOuterClass$Command;
                            if ((commandOuterClass$Command = aqnn.e) == null) {
                                commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
                            }
                            final aiqj aiqj = (aiqj)((ahbc)commandOuterClass$Command).rx((ahaq)akjn.a);
                            CommandOuterClass$Command commandOuterClass$Command2;
                            if ((commandOuterClass$Command2 = aqnn.j) == null) {
                                commandOuterClass$Command2 = CommandOuterClass$Command.getDefaultInstance();
                            }
                            final aiqj aiqj2 = (aiqj)((ahbc)commandOuterClass$Command2).rx((ahaq)akjn.a);
                            Optional optional;
                            if ((aqnn.c & 0x800) != 0x0) {
                                aokk aokk;
                                if ((aokk = aqnn.o) == null) {
                                    aokk = aokk.a;
                                }
                                optional = Optional.of((Object)aokk);
                            }
                            else {
                                optional = Optional.empty();
                            }
                            if (!((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
                                ashc = ashc.t((Throwable)new NullPointerException());
                                return ashc;
                            }
                            final boolean g2 = aqnn.g;
                            final boolean h = aqnn.h;
                            final ahaz builder = ((ahbh)aotd.a).createBuilder();
                            ajut ajut2 = null;
                            Label_0567: {
                                if ((aqnn.c & 0x2000) != 0x0) {
                                    aotf k;
                                    if ((k = aqnn.q) == null) {
                                        k = aotf.a;
                                    }
                                    builder.copyOnWrite();
                                    final aotd aotd = (aotd)builder.instance;
                                    k.getClass();
                                    aotd.k = k;
                                    aotd.b |= 0x4000;
                                }
                                else {
                                    if (h) {
                                        final aiam a = aiam.a;
                                        builder.copyOnWrite();
                                        final aotd aotd2 = (aotd)builder.instance;
                                        a.getClass();
                                        aotd2.j = a;
                                        aotd2.b |= 0x1000;
                                    }
                                    else if (g2) {
                                        final aiah a2 = aiah.a;
                                        builder.copyOnWrite();
                                        final aotd aotd3 = (aotd)builder.instance;
                                        a2.getClass();
                                        aotd3.i = a2;
                                        aotd3.b |= 0x800;
                                    }
                                    if (!g2) {
                                        if (!h) {
                                            final ahbb ahbb = (ahbb)((ahbh)ajut.a).createBuilder();
                                            aqdy aqdy;
                                            if ((aqdy = aqnn.i) == null) {
                                                aqdy = aqdy.a;
                                            }
                                            final String c = aqdy.c;
                                            ((ahaz)ahbb).copyOnWrite();
                                            final ajut ajut = (ajut)ahbb.instance;
                                            c.getClass();
                                            ajut.b |= 0x1;
                                            ajut.d = c;
                                            ajut2 = (ajut)((ahaz)ahbb).build();
                                            break Label_0567;
                                        }
                                    }
                                }
                                ajut2 = null;
                            }
                            final int by = adyf.by(aqnn.s);
                            final boolean b2 = by != 0 && by == 3;
                            final glm i = this.c.i(fsr);
                            glm z;
                            if (i == null) {
                                final auda c2 = this.c;
                                CommandOuterClass$Command commandOuterClass$Command3;
                                if ((commandOuterClass$Command3 = aqnn.t) == null) {
                                    commandOuterClass$Command3 = CommandOuterClass$Command.getDefaultInstance();
                                }
                                aqgi aqgi;
                                if ((aqgi = aqnn.f) == null) {
                                    aqgi = aqgi.a;
                                }
                                int j;
                                if ((j = aqsx.J(aqnn.p)) == 0) {
                                    j = 1;
                                }
                                final aotd aotd4 = (aotd)builder.build();
                                final glo a3 = glp.a();
                                akfg akfg;
                                if ((akfg = akfg.b(aqnn.l)) == null) {
                                    akfg = akfg.a;
                                }
                                a3.b(akfg);
                                akgf akgf;
                                if ((akgf = akgf.b(aqnn.k)) == null) {
                                    akgf = akgf.a;
                                }
                                a3.e(akgf);
                                akfu akfu;
                                if ((akfu = akfu.b(aqnn.m)) == null) {
                                    akfu = akfu.a;
                                }
                                a3.c(akfu);
                                akge akge;
                                if ((akge = akge.b(aqnn.n)) == null) {
                                    akge = akge.a;
                                }
                                a3.d(akge);
                                int bz;
                                if ((bz = adyf.bz(aqnn.r)) == 0) {
                                    bz = 1;
                                }
                                a3.a = bz;
                                final glp a4 = a3.a();
                                final float u = aqnn.u;
                                final boolean v = aqnn.v;
                                final int w = aqnn.w;
                                final boolean x = aqnn.x;
                                int ba = adyf.bA(aqnn.y);
                                if (ba == 0) {
                                    ba = 1;
                                }
                                ((ahbc)aiqj).getClass();
                                adkp.Q(((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint));
                                final apsk apsk = (apsk)((ahbc)aiqj).rx((ahaq)WatchEndpointOuterClass.watchEndpoint);
                                Optional.empty();
                                aiqj aiqj3;
                                if (!adkp.ae(commandOuterClass$Command3, CommandOuterClass$Command.getDefaultInstance())) {
                                    final ahbb ahbb2 = (ahbb)((ahbh)aiqj.a).createBuilder();
                                    ahbb2.e((ahaq)ajmu.a, (Object)commandOuterClass$Command3);
                                    aiqj3 = (aiqj)((ahaz)ahbb2).build();
                                }
                                else {
                                    aiqj3 = null;
                                }
                                z = fbu.z(aakv.v(aqgi), apsk.d, aiqj, aiqj2, aiqj3, ajut2, new aotd[] { aotd4 }, j == 4, booleanValue2, a4, optional, b2, u, v, x, ba);
                                ((Map<fsr, gly>)c2.c).put(fsr, (gly)z);
                            }
                            else {
                                z = i;
                            }
                            final String l = z.i();
                            Object o;
                            if ((o = ((Map<K, gfi>)this.c.b).get(fsr)) == null) {
                                final Optional optional2 = map.get("inlinePlayerParentAllocator");
                                final auda c3 = this.c;
                                aqgi aqgi2;
                                if ((aqgi2 = aqnn.f) == null) {
                                    aqgi2 = aqgi.a;
                                }
                                akge akge2;
                                if ((akge2 = akge.b(aqnn.n)) == null) {
                                    akge2 = akge.a;
                                }
                                final Object d2 = c3.d;
                                final boolean a5 = c3.a;
                                final WeakReference weakReference = new WeakReference(fsr);
                                final heo heo = (heo)d2;
                                final kaw kaw = (kaw)((atke)heo.c).a();
                                kaw.getClass();
                                final acgs acgs = (acgs)((atke)heo.b).a();
                                acgs.getClass();
                                final trh trh = (trh)((atke)heo.a).a();
                                trh.getClass();
                                l.getClass();
                                aqgi2.getClass();
                                akge2.getClass();
                                optional2.getClass();
                                o = new kbk(kaw, acgs, trh, l, aqgi2, akge2, a5, weakReference, optional2);
                                ((Map<fsr, gfi>)c3.b).put(fsr, (gfi)o);
                            }
                            final InlinePlaybackLifecycleController a6 = this.a;
                            int n;
                            if (!booleanValue) {
                                n = 0;
                            }
                            else {
                                n = 2;
                            }
                            ashc = a6.m(z, (gfi)o, n).F(asil.a());
                            return ashc;
                        }
                    }
                    final glm m = this.c.i(fsr);
                    if (m != null) {
                        ashc = this.a.l(m).F(asil.a());
                    }
                    else {
                        ashc = ashc.f();
                    }
                }
            }
            else {
                ashc = ashc.f();
            }
        }
        return ashc;
    }
}
