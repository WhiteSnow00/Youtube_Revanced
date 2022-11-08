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

public class aaav implements aabo
{
    private final arud a;
    
    public aaav(final arud a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    protected static ajsq k(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return abyh.g(new String[0]);
        }
        return abyh.g(new String[] { s });
    }
    
    private final alcj p(final Context context, final aioe o, final zzg zzg) {
        final agza builder = ((agzi)anws.a).createBuilder();
        builder.bz((Iterable)this.e(context, zzg));
        final anws c = (anws)builder.build();
        final agza builder2 = ((agzi)alca.a).createBuilder();
        final agza builder3 = ((agzi)albz.a).createBuilder();
        builder3.copyOnWrite();
        final albz albz = (albz)builder3.instance;
        c.getClass();
        albz.c = c;
        albz.b = 49399797;
        builder2.copyOnWrite();
        final alca alca = (alca)builder2.instance;
        final albz c2 = (albz)builder3.build();
        c2.getClass();
        alca.c = c2;
        alca.b |= 0x1;
        final alca c3 = (alca)builder2.build();
        final agzc agzc = (agzc)((agzi)alcj.a).createBuilder();
        agzc.copyOnWrite();
        final alcj alcj = (alcj)agzc.instance;
        o.getClass();
        alcj.o = o;
        alcj.b |= 0x1000;
        final agza builder4 = ((agzi)alck.a).createBuilder();
        builder4.copyOnWrite();
        final alck alck = (alck)builder4.instance;
        c3.getClass();
        alck.c = c3;
        alck.b = 51779735;
        agzc.copyOnWrite();
        final alcj alcj2 = (alcj)agzc.instance;
        final alck e = (alck)builder4.build();
        e.getClass();
        alcj2.e = e;
        alcj2.b |= 0x2;
        return (alcj)agzc.build();
    }
    
    private static ally q(final alme c) {
        final agzc agzc = (agzc)((agzi)allx.a).createBuilder();
        agzc.copyOnWrite();
        final allx allx = (allx)agzc.instance;
        c.getClass();
        allx.c = c;
        allx.b |= 0x1;
        final agyc b = agyc.b;
        agzc.copyOnWrite();
        final allx allx2 = (allx)agzc.instance;
        b.getClass();
        allx2.b |= 0x1000;
        allx2.n = b;
        agzc.copyOnWrite();
        final allx allx3 = (allx)agzc.instance;
        allx3.b |= 0x2000;
        allx3.o = true;
        final almd c2 = almd.c;
        agzc.copyOnWrite();
        final allx allx4 = (allx)agzc.instance;
        allx4.d = c2.e;
        allx4.b |= 0x2;
        final allx c3 = (allx)agzc.build();
        final agza builder = ((agzi)ally.a).createBuilder();
        builder.copyOnWrite();
        final ally ally = (ally)builder.instance;
        c3.getClass();
        ally.c = c3;
        ally.b |= 0x1;
        return (ally)builder.build();
    }
    
    public WatchNextResponseModel a(final WatchNextResponseModel watchNextResponseModel, final Context context, final zyx zyx, final List list, final int n, final byte[] array, final ahvo ahvo) {
        watchNextResponseModel.getClass();
        context.getClass();
        WatchNextResponseModel watchNextResponseModel2 = watchNextResponseModel;
        if (zyx != null) {
            final alcj a = watchNextResponseModel.a;
            aioe aioe;
            if ((aioe = a.o) == null) {
                aioe = aioe.a;
            }
            alcj alcj = a;
            if (((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                aioe aioe2;
                if ((aioe2 = a.o) == null) {
                    aioe2 = aioe.a;
                }
                final apqg apqg = (apqg)((agzd)aioe2).rr((agyr)WatchEndpointOuterClass.watchEndpoint);
                final agzc agzc = (agzc)((agzi)a).toBuilder();
                String e;
                if ((apqg.b & 0x2) != 0x0) {
                    e = apqg.e;
                }
                else {
                    e = null;
                }
                final String d = apqg.d;
                final int f = apqg.f;
                aioe aioe3;
                if ((aioe3 = a.o) == null) {
                    aioe3 = aioe.a;
                }
                final aioe c = aaiw.C(e, d, f, aioe3.c);
                agzc.copyOnWrite();
                final alcj alcj2 = (alcj)agzc.instance;
                c.getClass();
                alcj2.o = c;
                alcj2.b |= 0x1000;
                alcj = (alcj)agzc.build();
            }
            watchNextResponseModel2 = new WatchNextResponseModel(this.l(context, alcj, zyx, list, n, array, ahvo));
        }
        return watchNextResponseModel2;
    }
    
    public WatchNextResponseModel b(final Context context, final zzg zzg, final byte[] array) {
        return new WatchNextResponseModel(this.m(context, zzg, array));
    }
    
    public WatchNextResponseModel c(final Context context, final zyx zyx, final List list, final int n, final byte[] array, final ahvo ahvo) {
        return new WatchNextResponseModel(this.n(context, zyx, list, n, array, ahvo));
    }
    
    protected Collection d() {
        return (Collection)afdu.s((Object)"PPSV");
    }
    
    protected List e(final Context context, final zzg zzg) {
        final agza builder = ((agzi)anwv.a).createBuilder();
        final agzc agzc = (agzc)((agzi)alib.a).createBuilder();
        final agza builder2 = ((agzi)aplg.a).createBuilder();
        final agp e = zzg.e;
        if (e != null) {
            final ajsq k = k((String)e.b);
            builder2.copyOnWrite();
            final aplg aplg = (aplg)builder2.instance;
            k.getClass();
            aplg.d = k;
            aplg.b |= 0x2;
            final aorm e2 = ((vey)e.c).e();
            builder2.copyOnWrite();
            final aplg aplg2 = (aplg)builder2.instance;
            e2.getClass();
            aplg2.c = e2;
            aplg2.b |= 0x1;
        }
        final agza builder3 = ((agzi)alie.a).createBuilder();
        builder3.copyOnWrite();
        final alie alie = (alie)builder3.instance;
        final aplg j = (aplg)builder2.build();
        j.getClass();
        alie.J = j;
        alie.c |= 0x400;
        final alie alie2 = (alie)builder3.build();
        final ajsq i = k(zzg.j());
        final ajsq l = k(context.getString(2132020157, new Object[] { zzg.b() }));
        final ajsq m = k(zzg.h());
        final ajsq k2 = k(zzg.e());
        final ajsq k3 = k(zzg.h());
        final ajsq k4 = k(zzg.e());
        final agzc agzc2 = (agzc)((agzi)ajsq.a).createBuilder();
        final Date c = zzg.c;
        final agzc agzc3 = (agzc)((agzi)ajss.a).createBuilder();
        agzc3.copyOnWrite();
        final ajss ajss = (ajss)agzc3.instance;
        ajss.b |= 0x2;
        ajss.d = true;
        final String format = DateFormat.getLongDateFormat(context).format(zzg.c);
        agzc3.copyOnWrite();
        final ajss ajss2 = (ajss)agzc3.instance;
        format.getClass();
        ajss2.b |= 0x1;
        ajss2.c = format;
        agzc2.i((ajss)agzc3.build());
        final ajsq i2 = (ajsq)agzc2.build();
        final agzc agzc4 = (agzc)((agzi)aplc.a).createBuilder();
        agzc4.copyOnWrite();
        final aplc aplc = (aplc)agzc4.instance;
        aplc.b |= 0x8000000;
        aplc.h = false;
        agzc4.copyOnWrite();
        final aplc aplc2 = (aplc)agzc4.instance;
        aplc2.b |= 0x4000000;
        aplc2.g = false;
        ajsq f;
        if ((f = zzg.d.k) == null) {
            f = ajsq.a;
        }
        agzc4.copyOnWrite();
        final aplc aplc3 = (aplc)agzc4.instance;
        f.getClass();
        aplc3.f = f;
        aplc3.b |= 0x2000;
        agzc4.copyOnWrite();
        final aplc aplc4 = (aplc)agzc4.instance;
        i2.getClass();
        aplc4.i = i2;
        aplc4.b |= 0x10000000;
        agzc4.copyOnWrite();
        final aplc aplc5 = (aplc)agzc4.instance;
        l.getClass();
        aplc5.e = l;
        aplc5.b |= 0x10;
        agzc4.copyOnWrite();
        final aplc aplc6 = (aplc)agzc4.instance;
        i.getClass();
        aplc6.d = i;
        aplc6.b |= 0x4;
        final agza builder4 = ((agzi)alme.a).createBuilder();
        final String f2 = zzg.f();
        builder4.copyOnWrite();
        final alme alme = (alme)builder4.instance;
        f2.getClass();
        alme.b |= 0x1;
        alme.c = f2;
        final agza builder5 = ((agzi)q((alme)builder4.build())).toBuilder();
        allx allx;
        if ((allx = ((ally)builder5.instance).c) == null) {
            allx = allx.a;
        }
        final agzc agzc5 = (agzc)((agzi)allx).toBuilder();
        agzc5.copyOnWrite();
        final allx allx2 = (allx)agzc5.instance;
        k2.getClass();
        allx2.j = k2;
        allx2.b |= 0x100;
        agzc5.copyOnWrite();
        final allx allx3 = (allx)agzc5.instance;
        k4.getClass();
        allx3.k = k4;
        allx3.b |= 0x200;
        agzc5.copyOnWrite();
        final allx allx4 = (allx)agzc5.instance;
        m.getClass();
        allx4.f = m;
        allx4.b |= 0x8;
        agzc5.copyOnWrite();
        final allx allx5 = (allx)agzc5.instance;
        k3.getClass();
        allx5.g = k3;
        allx5.b |= 0x10;
        builder5.copyOnWrite();
        final ally ally = (ally)builder5.instance;
        final allx c2 = (allx)agzc5.build();
        c2.getClass();
        ally.c = c2;
        ally.b |= 0x1;
        agzc4.copyOnWrite();
        final aplc aplc7 = (aplc)agzc4.instance;
        final ally j2 = (ally)builder5.build();
        j2.getClass();
        aplc7.j = j2;
        aplc7.c |= 0x1;
        final agza builder6 = ((agzi)alie.a).createBuilder();
        builder6.copyOnWrite();
        final alie alie3 = (alie)builder6.instance;
        final aplc i3 = (aplc)agzc4.build();
        i3.getClass();
        alie3.I = i3;
        alie3.c |= 0x200;
        agzc.k((Iterable)afcr.s((Object)alie2, (Object)builder6.build()));
        final alib j3 = (alib)agzc.build();
        builder.copyOnWrite();
        final anwv anwv = (anwv)builder.instance;
        j3.getClass();
        anwv.j = j3;
        anwv.b |= 0x10;
        return (List)afcr.r((Object)builder.build());
    }
    
    protected void f(final zzg zzg, final agzc agzc) {
    }
    
    protected final alcj l(final Context context, alcj alcj, final zyx zyx, final List list, final int j, final byte[] array, final ahvo c) {
        final alcj alcj2 = alcj;
        alck alck;
        if ((alck = alcj2.e) == null) {
            alck = alck.a;
        }
        alcj alcj3 = alcj2;
        if (alck.b == 51779735) {
            alck alck2;
            if ((alck2 = alcj2.e) == null) {
                alck2 = alck.a;
            }
            alca a;
            if (alck2.b == 51779735) {
                a = (alca)alck2.c;
            }
            else {
                a = alca.a;
            }
            final agza builder = ((agzi)a).toBuilder();
            final akak f = this.a.f();
            boolean b = false;
            Label_0146: {
                if (f != null) {
                    alvs alvs;
                    if ((alvs = f.e) == null) {
                        alvs = alvs.a;
                    }
                    if (alvs.bd) {
                        b = true;
                        break Label_0146;
                    }
                }
                b = false;
            }
            int n;
            if (b) {
                n = zyx.f;
            }
            else {
                n = list.size();
            }
            final agzc agzc = (agzc)((agzi)angx.a).createBuilder();
            final String a2 = zyx.a;
            agzc.copyOnWrite();
            final angx angx = (angx)agzc.instance;
            angx.c |= 0x40;
            angx.m = a2;
            agzc.copyOnWrite();
            final angx angx2 = (angx)agzc.instance;
            angx2.c |= 0x10;
            angx2.j = j;
            agzc.copyOnWrite();
            final angx angx3 = (angx)agzc.instance;
            angx3.c |= 0x80;
            angx3.n = n;
            final ajsq k = k(context.getResources().getQuantityString(2131886130, n, new Object[] { n }));
            agzc.copyOnWrite();
            final angx angx4 = (angx)agzc.instance;
            k.getClass();
            angx4.o = k;
            angx4.c |= 0x100;
            final String b2 = zyx.b;
            if (b2 != null) {
                agzc.copyOnWrite();
                final angx angx5 = (angx)agzc.instance;
                angx5.c |= 0x1;
                angx5.g = b2;
            }
            final String l = zyx.l;
            if (l != null) {
                final ajsq h = abyh.h(l);
                agzc.copyOnWrite();
                final angx angx6 = (angx)agzc.instance;
                h.getClass();
                angx6.p = h;
                angx6.c |= 0x1000;
            }
            final akbf m = zyx.m;
            if (m != null) {
                agzc.copyOnWrite();
                final angx angx7 = (angx)agzc.instance;
                angx7.y = m;
                angx7.d |= 0x2;
            }
            if (!this.d().contains(zyx.a)) {
                final agza builder2 = ((agzi)alme.a).createBuilder();
                final String a3 = zyx.a;
                builder2.copyOnWrite();
                final alme alme = (alme)builder2.instance;
                alme.b |= 0x2;
                alme.d = a3;
                final ally q = q((alme)builder2.build());
                agzc.copyOnWrite();
                final angx angx8 = (angx)agzc.instance;
                q.getClass();
                angx8.s = q;
                angx8.c |= 0x100000;
            }
            int n2;
            for (int i = 0; i < list.size(); i = n2) {
                final boolean m2 = i == j;
                final zzg zzg = list.get(i);
                final String a4 = zyx.a;
                final agzc agzc2 = (agzc)((agzi)anhb.a).createBuilder();
                agzc2.copyOnWrite();
                final anhb anhb = (anhb)agzc2.instance;
                anhb.b |= 0x80;
                anhb.m = m2;
                final String f2 = zzg.f();
                agzc2.copyOnWrite();
                final anhb anhb2 = (anhb)agzc2.instance;
                f2.getClass();
                anhb2.b |= 0x1000;
                anhb2.p = f2;
                final ajsq k2 = k(zzg.j());
                agzc2.copyOnWrite();
                final anhb anhb3 = (anhb)agzc2.instance;
                k2.getClass();
                anhb3.d = k2;
                anhb3.b |= 0x1;
                final agp e = zzg.e;
                if (e != null) {
                    final ajsq k3 = k((String)e.b);
                    agzc2.copyOnWrite();
                    final anhb anhb4 = (anhb)agzc2.instance;
                    k3.getClass();
                    anhb4.f = k3;
                    anhb4.b |= 0x4;
                }
                final vey a5 = zzg.a;
                if (a5 != null) {
                    final agzc agzc3 = (agzc)((agzi)a5.e()).toBuilder();
                    if ((((aorm)agzc3.instance).b & 0x400) == 0x0) {
                        final aorm d = zzg.d.d;
                        aorm a6;
                        if (d == null) {
                            a6 = aorm.a;
                        }
                        else {
                            a6 = d;
                        }
                        if ((a6.b & 0x400) != 0x0) {
                            aorm a7;
                            if ((a7 = d) == null) {
                                a7 = aorm.a;
                            }
                            allu h2;
                            if ((h2 = a7.h) == null) {
                                h2 = allu.a;
                            }
                            agzc3.copyOnWrite();
                            final aorm aorm = (aorm)agzc3.instance;
                            h2.getClass();
                            aorm.h = h2;
                            aorm.b |= 0x400;
                        }
                    }
                    if ((((aorm)agzc3.instance).b & 0x800) == 0x0) {
                        final aorm d2 = zzg.d.d;
                        aorm a8;
                        if (d2 == null) {
                            a8 = aorm.a;
                        }
                        else {
                            a8 = d2;
                        }
                        if ((a8.b & 0x800) != 0x0) {
                            aorm a9;
                            if ((a9 = d2) == null) {
                                a9 = aorm.a;
                            }
                            allu i2;
                            if ((i2 = a9.i) == null) {
                                i2 = allu.a;
                            }
                            agzc3.copyOnWrite();
                            final aorm aorm2 = (aorm)agzc3.instance;
                            i2.getClass();
                            aorm2.i = i2;
                            aorm2.b |= 0x800;
                        }
                    }
                    final aorm g = (aorm)agzc3.build();
                    agzc2.copyOnWrite();
                    final anhb anhb5 = (anhb)agzc2.instance;
                    g.getClass();
                    anhb5.g = g;
                    anhb5.b |= 0x8;
                }
                n2 = i + 1;
                final ajsq f3 = abyh.f((long)n2);
                agzc2.copyOnWrite();
                final anhb anhb6 = (anhb)agzc2.instance;
                f3.getClass();
                anhb6.k = f3;
                anhb6.b |= 0x40;
                final ajsq k4 = k(zzg.g());
                agzc2.copyOnWrite();
                final anhb anhb7 = (anhb)agzc2.instance;
                k4.getClass();
                anhb7.h = k4;
                anhb7.b |= 0x10;
                final aioe b3 = aaiw.B(a4, zzg, i, array);
                agzc2.copyOnWrite();
                final anhb anhb8 = (anhb)agzc2.instance;
                b3.getClass();
                anhb8.n = b3;
                anhb8.b |= 0x100;
                this.f(zzg, agzc2);
                final anhb c2 = (anhb)agzc2.build();
                final agza builder3 = ((agzi)angw.a).createBuilder();
                builder3.copyOnWrite();
                final angw angw = (angw)builder3.instance;
                c2.getClass();
                angw.c = c2;
                angw.b |= 0x1;
                final angw angw2 = (angw)builder3.build();
                agzc.copyOnWrite();
                final angx angx9 = (angx)agzc.instance;
                angw2.getClass();
                angx9.a();
                angx9.i.add(angw2);
            }
            final ajsq j2 = zyx.j;
            if (j2 != null && b) {
                final agza builder4 = ((agzi)angw.a).createBuilder();
                final agza builder5 = amfe.a.createBuilder();
                final agza builder6 = amff.a.createBuilder();
                builder6.copyOnWrite();
                final amff amff = (amff)builder6.instance;
                amff.c = 2;
                amff.b |= 0x1;
                builder5.copyOnWrite();
                final amfe amfe = (amfe)builder5.instance;
                final amff g2 = (amff)builder6.build();
                g2.getClass();
                amfe.g = g2;
                amfe.b |= 0x20;
                final agza builder7 = amfh.a.createBuilder();
                final agza builder8 = amfg.a.createBuilder();
                builder8.copyOnWrite();
                final amfg amfg = (amfg)builder8.instance;
                amfg.c = j2;
                amfg.b |= 0x1;
                builder7.copyOnWrite();
                final amfh amfh = (amfh)builder7.instance;
                final amfg c3 = (amfg)builder8.build();
                c3.getClass();
                amfh.c = c3;
                amfh.b |= 0x1;
                builder5.copyOnWrite();
                final amfe amfe2 = (amfe)builder5.instance;
                final amfh f4 = (amfh)builder7.build();
                f4.getClass();
                amfe2.f = f4;
                amfe2.b |= 0x2;
                final amfe g3 = (amfe)builder5.build();
                builder4.copyOnWrite();
                final angw angw3 = (angw)builder4.instance;
                g3.getClass();
                angw3.g = g3;
                angw3.b |= 0x200;
                agzc.w(builder4);
            }
            final agza builder9 = ((agzi)alby.a).createBuilder();
            builder9.copyOnWrite();
            final alby alby = (alby)builder9.instance;
            final angx c4 = (angx)agzc.build();
            c4.getClass();
            alby.c = c4;
            alby.b = 50631000;
            final alby d3 = (alby)builder9.build();
            builder.copyOnWrite();
            final alca alca = (alca)builder.instance;
            d3.getClass();
            alca.d = d3;
            alca.b |= 0x2;
            if (c != null) {
                final agza builder10 = albw.a.createBuilder();
                builder10.copyOnWrite();
                final albw albw = (albw)builder10.instance;
                albw.c = c;
                albw.b = 46659098;
                builder.copyOnWrite();
                final alca alca2 = (alca)builder.instance;
                final albw e2 = (albw)builder10.build();
                e2.getClass();
                alca2.e = e2;
                alca2.b |= 0x4;
            }
            final agzc agzc4 = (agzc)((agzi)alcj).toBuilder();
            alck alck3;
            if ((alck3 = alcj2.e) == null) {
                alck3 = alck.a;
            }
            final agza builder11 = ((agzi)alck3).toBuilder();
            builder11.copyOnWrite();
            final alck alck4 = (alck)builder11.instance;
            final alca c5 = (alca)builder.build();
            c5.getClass();
            alck4.c = c5;
            alck4.b = 51779735;
            agzc4.copyOnWrite();
            alcj = (alcj)agzc4.instance;
            final alck e3 = (alck)builder11.build();
            e3.getClass();
            alcj.e = e3;
            alcj.b |= 0x2;
            alcj3 = (alcj)agzc4.build();
        }
        return alcj3;
    }
    
    protected final alcj m(final Context context, final zzg zzg, final byte[] array) {
        context.getClass();
        zzg.getClass();
        return this.p(context, aaiw.B((String)null, zzg, -1, array), zzg);
    }
    
    protected final alcj n(final Context context, final zyx zyx, final List list, int max, final byte[] array, final ahvo ahvo) {
        context.getClass();
        max = Math.max(0, Math.min(list.size() - 1, max));
        final zzg zzg = list.get(max);
        return this.l(context, this.p(context, aaiw.B(zyx.a, zzg, max, array), zzg), zyx, list, max, array, ahvo);
    }
    
    public final void o() {
    }
}
