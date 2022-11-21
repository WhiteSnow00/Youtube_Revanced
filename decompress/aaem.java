import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Date;
import android.text.format.DateFormat;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.content.Context;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public class aaem implements aafh
{
    private final arzb a;
    
    public aaem(final arzb a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    protected static ajws k(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return acbu.g(new String[0]);
        }
        return acbu.g(new String[] { s });
    }
    
    private final algm p(final Context context, final aisc o, final aacx aacx) {
        final ahcr builder = ((ahcz)aobc.a).createBuilder();
        builder.bB((Iterable)this.e(context, aacx));
        final aobc c = (aobc)builder.build();
        final ahcr builder2 = algd.a.createBuilder();
        final ahcr builder3 = algc.a.createBuilder();
        builder3.copyOnWrite();
        final algc algc = (algc)builder3.instance;
        c.getClass();
        algc.c = c;
        algc.b = 49399797;
        builder2.copyOnWrite();
        final algd algd = (algd)builder2.instance;
        final algc c2 = (algc)builder3.build();
        c2.getClass();
        algd.c = c2;
        algd.b |= 0x1;
        final algd c3 = (algd)builder2.build();
        final ahct ahct = (ahct)((ahcz)algm.a).createBuilder();
        ((ahcr)ahct).copyOnWrite();
        final algm algm = (algm)ahct.instance;
        o.getClass();
        algm.o = o;
        algm.b |= 0x1000;
        final ahcr builder4 = algn.a.createBuilder();
        builder4.copyOnWrite();
        final algn algn = (algn)builder4.instance;
        c3.getClass();
        algn.c = c3;
        algn.b = 51779735;
        ((ahcr)ahct).copyOnWrite();
        final algm algm2 = (algm)ahct.instance;
        final algn e = (algn)builder4.build();
        e.getClass();
        algm2.e = e;
        algm2.b |= 0x2;
        return (algm)((ahcr)ahct).build();
    }
    
    private static alqb q(final alqh c) {
        final ahct ahct = (ahct)((ahcz)alqa.a).createBuilder();
        ((ahcr)ahct).copyOnWrite();
        final alqa alqa = (alqa)ahct.instance;
        c.getClass();
        alqa.c = c;
        alqa.b |= 0x1;
        final ahbt b = ahbt.b;
        ((ahcr)ahct).copyOnWrite();
        final alqa alqa2 = (alqa)ahct.instance;
        b.getClass();
        alqa2.b |= 0x1000;
        alqa2.n = b;
        ((ahcr)ahct).copyOnWrite();
        final alqa alqa3 = (alqa)ahct.instance;
        alqa3.b |= 0x2000;
        alqa3.o = true;
        final alqg c2 = alqg.c;
        ((ahcr)ahct).copyOnWrite();
        final alqa alqa4 = (alqa)ahct.instance;
        alqa4.d = c2.e;
        alqa4.b |= 0x2;
        final alqa c3 = (alqa)((ahcr)ahct).build();
        final ahcr builder = alqb.a.createBuilder();
        builder.copyOnWrite();
        final alqb alqb = (alqb)builder.instance;
        c3.getClass();
        alqb.c = c3;
        alqb.b |= 0x1;
        return (alqb)builder.build();
    }
    
    @Override
    public WatchNextResponseModel a(final WatchNextResponseModel watchNextResponseModel, final Context context, final aaco aaco, final List list, final int n, final byte[] array, final ahzf ahzf) {
        watchNextResponseModel.getClass();
        context.getClass();
        WatchNextResponseModel watchNextResponseModel2 = watchNextResponseModel;
        if (aaco != null) {
            final algm a = watchNextResponseModel.a;
            aisc aisc;
            if ((aisc = a.o) == null) {
                aisc = aisc.a;
            }
            algm algm = a;
            if (((ahcu)aisc).ry((ahci)WatchEndpointOuterClass.watchEndpoint)) {
                aisc aisc2;
                if ((aisc2 = a.o) == null) {
                    aisc2 = aisc.a;
                }
                final apuw apuw = (apuw)((ahcu)aisc2).rx((ahci)WatchEndpointOuterClass.watchEndpoint);
                final ahct ahct = (ahct)((ahcz)a).toBuilder();
                String e;
                if ((apuw.b & 0x2) != 0x0) {
                    e = apuw.e;
                }
                else {
                    e = null;
                }
                final String d = apuw.d;
                final int f = apuw.f;
                aisc aisc3;
                if ((aisc3 = a.o) == null) {
                    aisc3 = aisc.a;
                }
                final aisc c = aamn.C(e, d, f, aisc3.c);
                ((ahcr)ahct).copyOnWrite();
                final algm algm2 = (algm)ahct.instance;
                c.getClass();
                algm2.o = c;
                algm2.b |= 0x1000;
                algm = (algm)((ahcr)ahct).build();
            }
            watchNextResponseModel2 = new WatchNextResponseModel(this.l(context, algm, aaco, list, n, array, ahzf));
        }
        return watchNextResponseModel2;
    }
    
    @Override
    public WatchNextResponseModel b(final Context context, final aacx aacx, final byte[] array) {
        return new WatchNextResponseModel(this.m(context, aacx, array));
    }
    
    @Override
    public WatchNextResponseModel c(final Context context, final aaco aaco, final List list, final int n, final byte[] array, final ahzf ahzf) {
        return new WatchNextResponseModel(this.n(context, aaco, list, n, array, ahzf));
    }
    
    protected Collection d() {
        return afhk.s("PPSV");
    }
    
    protected List e(final Context context, final aacx aacx) {
        final ahcr builder = ((ahcz)aobf.a).createBuilder();
        final ahct ahct = (ahct)((ahcz)alme.a).createBuilder();
        final ahcr builder2 = appw.a.createBuilder();
        final agr e = aacx.e;
        if (e != null) {
            final ajws k = k((String)e.b);
            builder2.copyOnWrite();
            final appw appw = (appw)builder2.instance;
            k.getClass();
            appw.d = k;
            appw.b |= 0x2;
            final aowb e2 = ((vig)e.c).e();
            builder2.copyOnWrite();
            final appw appw2 = (appw)builder2.instance;
            e2.getClass();
            appw2.c = e2;
            appw2.b |= 0x1;
        }
        final ahcr builder3 = ((ahcz)almh.a).createBuilder();
        builder3.copyOnWrite();
        final almh almh = (almh)builder3.instance;
        final appw j = (appw)builder2.build();
        j.getClass();
        almh.J = j;
        almh.c |= 0x400;
        final almh almh2 = (almh)builder3.build();
        final ajws i = k(aacx.j());
        final ajws l = k(context.getString(2132020161, new Object[] { aacx.b() }));
        final ajws m = k(aacx.h());
        final ajws k2 = k(aacx.e());
        final ajws k3 = k(aacx.h());
        final ajws k4 = k(aacx.e());
        final ahct ahct2 = (ahct)((ahcz)ajws.a).createBuilder();
        final Date c = aacx.c;
        final ahct ahct3 = (ahct)((ahcz)ajwu.a).createBuilder();
        ((ahcr)ahct3).copyOnWrite();
        final ajwu ajwu = (ajwu)ahct3.instance;
        ajwu.b |= 0x2;
        ajwu.d = true;
        final String format = DateFormat.getLongDateFormat(context).format(aacx.c);
        ((ahcr)ahct3).copyOnWrite();
        final ajwu ajwu2 = (ajwu)ahct3.instance;
        format.getClass();
        ajwu2.b |= 0x1;
        ajwu2.c = format;
        ahct2.i((ajwu)((ahcr)ahct3).build());
        final ajws i2 = (ajws)((ahcr)ahct2).build();
        final ahct ahct4 = (ahct)((ahcz)apps.a).createBuilder();
        ((ahcr)ahct4).copyOnWrite();
        final apps apps = (apps)ahct4.instance;
        apps.b |= 0x8000000;
        apps.h = false;
        ((ahcr)ahct4).copyOnWrite();
        final apps apps2 = (apps)ahct4.instance;
        apps2.b |= 0x4000000;
        apps2.g = false;
        ajws f;
        if ((f = aacx.d.k) == null) {
            f = ajws.a;
        }
        ((ahcr)ahct4).copyOnWrite();
        final apps apps3 = (apps)ahct4.instance;
        f.getClass();
        apps3.f = f;
        apps3.b |= 0x2000;
        ((ahcr)ahct4).copyOnWrite();
        final apps apps4 = (apps)ahct4.instance;
        i2.getClass();
        apps4.i = i2;
        apps4.b |= 0x10000000;
        ((ahcr)ahct4).copyOnWrite();
        final apps apps5 = (apps)ahct4.instance;
        l.getClass();
        apps5.e = l;
        apps5.b |= 0x10;
        ((ahcr)ahct4).copyOnWrite();
        final apps apps6 = (apps)ahct4.instance;
        i.getClass();
        apps6.d = i;
        apps6.b |= 0x4;
        final ahcr builder4 = alqh.a.createBuilder();
        final String f2 = aacx.f();
        builder4.copyOnWrite();
        final alqh alqh = (alqh)builder4.instance;
        f2.getClass();
        alqh.b |= 0x1;
        alqh.c = f2;
        final ahcr builder5 = q((alqh)builder4.build()).toBuilder();
        alqa alqa;
        if ((alqa = ((alqb)builder5.instance).c) == null) {
            alqa = alqa.a;
        }
        final ahct ahct5 = (ahct)((ahcz)alqa).toBuilder();
        ((ahcr)ahct5).copyOnWrite();
        final alqa alqa2 = (alqa)ahct5.instance;
        k2.getClass();
        alqa2.j = k2;
        alqa2.b |= 0x100;
        ((ahcr)ahct5).copyOnWrite();
        final alqa alqa3 = (alqa)ahct5.instance;
        k4.getClass();
        alqa3.k = k4;
        alqa3.b |= 0x200;
        ((ahcr)ahct5).copyOnWrite();
        final alqa alqa4 = (alqa)ahct5.instance;
        m.getClass();
        alqa4.f = m;
        alqa4.b |= 0x8;
        ((ahcr)ahct5).copyOnWrite();
        final alqa alqa5 = (alqa)ahct5.instance;
        k3.getClass();
        alqa5.g = k3;
        alqa5.b |= 0x10;
        builder5.copyOnWrite();
        final alqb alqb = (alqb)builder5.instance;
        final alqa c2 = (alqa)((ahcr)ahct5).build();
        c2.getClass();
        alqb.c = c2;
        alqb.b |= 0x1;
        ((ahcr)ahct4).copyOnWrite();
        final apps apps7 = (apps)ahct4.instance;
        final alqb j2 = (alqb)builder5.build();
        j2.getClass();
        apps7.j = j2;
        apps7.c |= 0x1;
        final ahcr builder6 = ((ahcz)almh.a).createBuilder();
        builder6.copyOnWrite();
        final almh almh3 = (almh)builder6.instance;
        final apps i3 = (apps)((ahcr)ahct4).build();
        i3.getClass();
        almh3.I = i3;
        almh3.c |= 0x200;
        ahct.k((Iterable)afgh.s(almh2, builder6.build()));
        final alme j3 = (alme)((ahcr)ahct).build();
        builder.copyOnWrite();
        final aobf aobf = (aobf)builder.instance;
        j3.getClass();
        aobf.j = j3;
        aobf.b |= 0x10;
        return afgh.r(builder.build());
    }
    
    protected void f(final aacx aacx, final ahct ahct) {
    }
    
    @Override
    public final WatchNextResponseModel g(final WatchNextResponseModel watchNextResponseModel, final Context context, final aaco aaco, final List list, final int n, final PlaybackStartDescriptor playbackStartDescriptor, final ahzf ahzf) {
        return this.a(watchNextResponseModel, context, aaco, list, n, playbackStartDescriptor.x(), ahzf);
    }
    
    @Override
    public final WatchNextResponseModel h(final Context context, final aacx aacx, final PlaybackStartDescriptor playbackStartDescriptor) {
        return this.b(context, aacx, playbackStartDescriptor.x());
    }
    
    @Override
    public final WatchNextResponseModel i(final Context context, final aaco aaco, final List list, final int n, final PlaybackStartDescriptor playbackStartDescriptor, final ahzf ahzf) {
        return this.c(context, aaco, list, n, playbackStartDescriptor.x(), ahzf);
    }
    
    @Override
    public final aisc j(final String s, final String s2, final int n, final PlaybackStartDescriptor playbackStartDescriptor) {
        return aamn.C(s, s2, n, ahbt.x(playbackStartDescriptor.x()));
    }
    
    protected final algm l(final Context context, algm algm, final aaco aaco, final List list, final int j, final byte[] array, final ahzf c) {
        final algm algm2 = algm;
        algn algn;
        if ((algn = algm2.e) == null) {
            algn = algn.a;
        }
        algm algm3 = algm2;
        if (algn.b == 51779735) {
            algn algn2;
            if ((algn2 = algm2.e) == null) {
                algn2 = algn.a;
            }
            algd a;
            if (algn2.b == 51779735) {
                a = (algd)algn2.c;
            }
            else {
                a = algd.a;
            }
            final ahcr builder = a.toBuilder();
            final akeo f = this.a.f();
            boolean b = false;
            Label_0146: {
                if (f != null) {
                    alzw alzw;
                    if ((alzw = f.e) == null) {
                        alzw = alzw.a;
                    }
                    if (alzw.bd) {
                        b = true;
                        break Label_0146;
                    }
                }
                b = false;
            }
            int n;
            if (b) {
                n = aaco.f;
            }
            else {
                n = list.size();
            }
            final ahct ahct = (ahct)((ahcz)anli.a).createBuilder();
            final String a2 = aaco.a;
            ((ahcr)ahct).copyOnWrite();
            final anli anli = (anli)ahct.instance;
            anli.c |= 0x40;
            anli.m = a2;
            ((ahcr)ahct).copyOnWrite();
            final anli anli2 = (anli)ahct.instance;
            anli2.c |= 0x10;
            anli2.j = j;
            ((ahcr)ahct).copyOnWrite();
            final anli anli3 = (anli)ahct.instance;
            anli3.c |= 0x80;
            anli3.n = n;
            final ajws k = k(context.getResources().getQuantityString(2131886130, n, new Object[] { n }));
            ((ahcr)ahct).copyOnWrite();
            final anli anli4 = (anli)ahct.instance;
            k.getClass();
            anli4.o = k;
            anli4.c |= 0x100;
            final String b2 = aaco.b;
            if (b2 != null) {
                ((ahcr)ahct).copyOnWrite();
                final anli anli5 = (anli)ahct.instance;
                anli5.c |= 0x1;
                anli5.g = b2;
            }
            final String l = aaco.l;
            if (l != null) {
                final ajws h = acbu.h(l);
                ((ahcr)ahct).copyOnWrite();
                final anli anli6 = (anli)ahct.instance;
                h.getClass();
                anli6.p = h;
                anli6.c |= 0x1000;
            }
            final akfj m = aaco.m;
            if (m != null) {
                ((ahcr)ahct).copyOnWrite();
                final anli anli7 = (anli)ahct.instance;
                anli7.y = m;
                anli7.d |= 0x2;
            }
            if (!this.d().contains(aaco.a)) {
                final ahcr builder2 = alqh.a.createBuilder();
                final String a3 = aaco.a;
                builder2.copyOnWrite();
                final alqh alqh = (alqh)builder2.instance;
                alqh.b |= 0x2;
                alqh.d = a3;
                final alqb q = q((alqh)builder2.build());
                ((ahcr)ahct).copyOnWrite();
                final anli anli8 = (anli)ahct.instance;
                q.getClass();
                anli8.s = q;
                anli8.c |= 0x100000;
            }
            int n2;
            for (int i = 0; i < list.size(); i = n2) {
                final boolean m2 = i == j;
                final aacx aacx = list.get(i);
                final String a4 = aaco.a;
                final ahct ahct2 = (ahct)((ahcz)anlm.a).createBuilder();
                ((ahcr)ahct2).copyOnWrite();
                final anlm anlm = (anlm)ahct2.instance;
                anlm.b |= 0x80;
                anlm.m = m2;
                final String f2 = aacx.f();
                ((ahcr)ahct2).copyOnWrite();
                final anlm anlm2 = (anlm)ahct2.instance;
                f2.getClass();
                anlm2.b |= 0x1000;
                anlm2.p = f2;
                final ajws k2 = k(aacx.j());
                ((ahcr)ahct2).copyOnWrite();
                final anlm anlm3 = (anlm)ahct2.instance;
                k2.getClass();
                anlm3.d = k2;
                anlm3.b |= 0x1;
                final agr e = aacx.e;
                if (e != null) {
                    final ajws k3 = k((String)e.b);
                    ((ahcr)ahct2).copyOnWrite();
                    final anlm anlm4 = (anlm)ahct2.instance;
                    k3.getClass();
                    anlm4.f = k3;
                    anlm4.b |= 0x4;
                }
                final vig a5 = aacx.a;
                if (a5 != null) {
                    final ahct ahct3 = (ahct)((ahcz)a5.e()).toBuilder();
                    if ((((aowb)ahct3.instance).b & 0x400) == 0x0) {
                        final aowb d = aacx.d.d;
                        aowb a6;
                        if (d == null) {
                            a6 = aowb.a;
                        }
                        else {
                            a6 = d;
                        }
                        if ((a6.b & 0x400) != 0x0) {
                            aowb a7;
                            if ((a7 = d) == null) {
                                a7 = aowb.a;
                            }
                            alpx h2;
                            if ((h2 = a7.h) == null) {
                                h2 = alpx.a;
                            }
                            ((ahcr)ahct3).copyOnWrite();
                            final aowb aowb = (aowb)ahct3.instance;
                            h2.getClass();
                            aowb.h = h2;
                            aowb.b |= 0x400;
                        }
                    }
                    if ((((aowb)ahct3.instance).b & 0x800) == 0x0) {
                        final aowb d2 = aacx.d.d;
                        aowb a8;
                        if (d2 == null) {
                            a8 = aowb.a;
                        }
                        else {
                            a8 = d2;
                        }
                        if ((a8.b & 0x800) != 0x0) {
                            aowb a9;
                            if ((a9 = d2) == null) {
                                a9 = aowb.a;
                            }
                            alpx i2;
                            if ((i2 = a9.i) == null) {
                                i2 = alpx.a;
                            }
                            ((ahcr)ahct3).copyOnWrite();
                            final aowb aowb2 = (aowb)ahct3.instance;
                            i2.getClass();
                            aowb2.i = i2;
                            aowb2.b |= 0x800;
                        }
                    }
                    final aowb g = (aowb)((ahcr)ahct3).build();
                    ((ahcr)ahct2).copyOnWrite();
                    final anlm anlm5 = (anlm)ahct2.instance;
                    g.getClass();
                    anlm5.g = g;
                    anlm5.b |= 0x8;
                }
                n2 = i + 1;
                final ajws f3 = acbu.f((long)n2);
                ((ahcr)ahct2).copyOnWrite();
                final anlm anlm6 = (anlm)ahct2.instance;
                f3.getClass();
                anlm6.k = f3;
                anlm6.b |= 0x40;
                final ajws k4 = k(aacx.g());
                ((ahcr)ahct2).copyOnWrite();
                final anlm anlm7 = (anlm)ahct2.instance;
                k4.getClass();
                anlm7.h = k4;
                anlm7.b |= 0x10;
                final aisc b3 = aamn.B(a4, aacx, i, array);
                ((ahcr)ahct2).copyOnWrite();
                final anlm anlm8 = (anlm)ahct2.instance;
                b3.getClass();
                anlm8.n = b3;
                anlm8.b |= 0x100;
                this.f(aacx, ahct2);
                final anlm c2 = (anlm)((ahcr)ahct2).build();
                final ahcr builder3 = ((ahcz)anlh.a).createBuilder();
                builder3.copyOnWrite();
                final anlh anlh = (anlh)builder3.instance;
                c2.getClass();
                anlh.c = c2;
                anlh.b |= 0x1;
                final anlh anlh2 = (anlh)builder3.build();
                ((ahcr)ahct).copyOnWrite();
                final anli anli9 = (anli)ahct.instance;
                anlh2.getClass();
                anli9.a();
                anli9.i.add((Object)anlh2);
            }
            final ajws j2 = aaco.j;
            if (j2 != null && b) {
                final ahcr builder4 = ((ahcz)anlh.a).createBuilder();
                final ahcr builder5 = amjl.a.createBuilder();
                final ahcr builder6 = amjm.a.createBuilder();
                builder6.copyOnWrite();
                final amjm amjm = (amjm)builder6.instance;
                amjm.c = 2;
                amjm.b |= 0x1;
                builder5.copyOnWrite();
                final amjl amjl = (amjl)builder5.instance;
                final amjm g2 = (amjm)builder6.build();
                g2.getClass();
                amjl.g = g2;
                amjl.b |= 0x20;
                final ahcr builder7 = amjo.a.createBuilder();
                final ahcr builder8 = amjn.a.createBuilder();
                builder8.copyOnWrite();
                final amjn amjn = (amjn)builder8.instance;
                amjn.c = j2;
                amjn.b |= 0x1;
                builder7.copyOnWrite();
                final amjo amjo = (amjo)builder7.instance;
                final amjn c3 = (amjn)builder8.build();
                c3.getClass();
                amjo.c = c3;
                amjo.b |= 0x1;
                builder5.copyOnWrite();
                final amjl amjl2 = (amjl)builder5.instance;
                final amjo f4 = (amjo)builder7.build();
                f4.getClass();
                amjl2.f = f4;
                amjl2.b |= 0x2;
                final amjl g3 = (amjl)builder5.build();
                builder4.copyOnWrite();
                final anlh anlh3 = (anlh)builder4.instance;
                g3.getClass();
                anlh3.g = g3;
                anlh3.b |= 0x200;
                ahct.w(builder4);
            }
            final ahcr builder9 = algb.a.createBuilder();
            builder9.copyOnWrite();
            final algb algb = (algb)builder9.instance;
            final anli c4 = (anli)((ahcr)ahct).build();
            c4.getClass();
            algb.c = c4;
            algb.b = 50631000;
            final algb d3 = (algb)builder9.build();
            builder.copyOnWrite();
            final algd algd = (algd)builder.instance;
            d3.getClass();
            algd.d = d3;
            algd.b |= 0x2;
            if (c != null) {
                final ahcr builder10 = alfz.a.createBuilder();
                builder10.copyOnWrite();
                final alfz alfz = (alfz)builder10.instance;
                alfz.c = c;
                alfz.b = 46659098;
                builder.copyOnWrite();
                final algd algd2 = (algd)builder.instance;
                final alfz e2 = (alfz)builder10.build();
                e2.getClass();
                algd2.e = e2;
                algd2.b |= 0x4;
            }
            final ahct ahct4 = (ahct)((ahcz)algm).toBuilder();
            algn algn3;
            if ((algn3 = algm2.e) == null) {
                algn3 = algn.a;
            }
            final ahcr builder11 = algn3.toBuilder();
            builder11.copyOnWrite();
            final algn algn4 = (algn)builder11.instance;
            final algd c5 = (algd)builder.build();
            c5.getClass();
            algn4.c = c5;
            algn4.b = 51779735;
            ((ahcr)ahct4).copyOnWrite();
            algm = (algm)ahct4.instance;
            final algn e3 = (algn)builder11.build();
            e3.getClass();
            algm.e = e3;
            algm.b |= 0x2;
            algm3 = (algm)((ahcr)ahct4).build();
        }
        return algm3;
    }
    
    protected final algm m(final Context context, final aacx aacx, final byte[] array) {
        context.getClass();
        aacx.getClass();
        return this.p(context, aamn.B(null, aacx, -1, array), aacx);
    }
    
    protected final algm n(final Context context, final aaco aaco, final List list, int max, final byte[] array, final ahzf ahzf) {
        context.getClass();
        max = Math.max(0, Math.min(list.size() - 1, max));
        final aacx aacx = list.get(max);
        return this.l(context, this.p(context, aamn.B(aaco.a, aacx, max, array), aacx), aaco, list, max, array, ahzf);
    }
    
    @Override
    public final void o() {
    }
}
