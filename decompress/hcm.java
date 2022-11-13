import java.util.List;
import java.util.concurrent.ExecutionException;
import com.google.android.libraries.youtube.creation.music.AutoValue_ShortsCreationSelectedTrack;
import j$.time.Duration;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcm implements Callable
{
    public final hcq a;
    public final ListenableFuture b;
    public final ListenableFuture c;
    
    public hcm(final hcq a, final ListenableFuture b, final ListenableFuture c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object call() {
        final hcq a = this.a;
        final ListenableFuture b = this.b;
        final ListenableFuture c = this.c;
        try {
            final akrb akrb = (akrb)afwm.u((Future)b);
            if (a.j) {
                final int b2 = akrb.b;
                final long n = 15000L;
                long min;
                if ((b2 & 0x400) != 0x0) {
                    min = Math.min(a.f, Duration.ofSeconds(akrb.j).toMillis());
                }
                else {
                    min = 15000L;
                }
                long min2 = min;
                if (!((List)akrb.f).isEmpty()) {
                    min2 = Math.min(min, Duration.ofSeconds(((aoei)akrb.f.get(0)).d).toMillis());
                }
                long n2 = min2;
                if (min2 <= 0L) {
                    zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Music]GSSV response resolved into a invalid maxAudioRemixDuration.");
                    n2 = 15000L;
                }
                if (a.i) {
                    a.k.f(n2);
                }
                else if (a.a() != null) {
                    final ativ b3 = a.b;
                    final ubk e = a.a().e();
                    e.f(n2);
                    b3.tu((Object)aezp.k((Object)e.a()));
                }
                if (a.j) {
                    aoej aoej;
                    if ((aoej = akrb.k) == null) {
                        aoej = aoej.a;
                    }
                    long n3;
                    if ((aoej.b & 0x2) != 0x0) {
                        aoej aoej2;
                        if ((aoej2 = akrb.k) == null) {
                            aoej2 = aoej.a;
                        }
                        ahan ahan;
                        if ((ahan = aoej2.d) == null) {
                            ahan = ahan.a;
                        }
                        n3 = adyf.ar(ahan).toMillis();
                    }
                    else {
                        final ucd b4 = a.e.b();
                        long d;
                        if (ucd.ae(b4)) {
                            if (!(b4 instanceof uby)) {
                                zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Music]A wrongly-typed projectState encountered.");
                                d = n;
                            }
                            else {
                                int n4;
                                if ((n4 = ((uby)b4).h) <= 0) {
                                    n4 = a.m.bo();
                                }
                                d = n4;
                            }
                        }
                        else {
                            d = ucb.d(b4);
                        }
                        aoek aoek;
                        if ((aoek = akrb.d) == null) {
                            aoek = aoek.a;
                        }
                        aoej aoej3;
                        if ((aoej3 = aoek.c) == null) {
                            aoej3 = aoej.a;
                        }
                        long n5;
                        if ((aoej3.b & 0x2) != 0x0) {
                            aoek aoek2;
                            if ((aoek2 = akrb.d) == null) {
                                aoek2 = aoek.a;
                            }
                            aoej aoej4;
                            if ((aoej4 = aoek2.c) == null) {
                                aoej4 = aoej.a;
                            }
                            ahan ahan2;
                            if ((ahan2 = aoej4.d) == null) {
                                ahan2 = ahan.a;
                            }
                            n5 = adyf.ar(ahan2).toMillis();
                        }
                        else {
                            n5 = a.f;
                        }
                        n3 = Math.min(d, n5);
                    }
                    if (a.i) {
                        final ubk k = a.k;
                        k.g(Math.min(((AutoValue_ShortsCreationSelectedTrack)k.a()).n, n3));
                    }
                    else if (a.a() != null) {
                        final ativ b5 = a.b;
                        final ubk e2 = a.a().e();
                        e2.g(Math.min(n3, a.a().a()));
                        b5.tu((Object)aezp.k((Object)e2.a()));
                    }
                }
            }
            if (a.i) {
                if (a.k != null) {
                    if (a.m.bs() || (boolean)a.l.cf().aM()) {
                        final ahbx f = akrb.f;
                        if (((List)f).isEmpty()) {
                            zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Music]No audio remix source found.");
                        }
                        else if ((((aoei)((List)f).get(0)).b & 0x1) != 0x0) {
                            aofw aofw;
                            if ((aofw = ((aoei)((List)f).get(0)).c) == null) {
                                aofw = aofw.a;
                            }
                            final ubk i = a.k;
                            aoek e3;
                            if ((e3 = akrb.d) == null) {
                                e3 = aoek.a;
                            }
                            i.e = e3;
                            aotp d2;
                            if ((d2 = aofw.b) == null) {
                                d2 = aotp.a;
                            }
                            i.d = d2;
                            ajut ajut;
                            if ((ajut = aofw.c) == null) {
                                ajut = ajut.a;
                            }
                            i.f = ((ajuv)ajut.c.get(0)).c;
                            i.e(true);
                            if (!a.h) {
                                final ubk j = a.k;
                                aoek aoek3;
                                if ((aoek3 = akrb.d) == null) {
                                    aoek3 = aoek.a;
                                }
                                j.h(tpe.bM(aoek3));
                            }
                        }
                        else {
                            zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Music]No audio remix source metadata found.");
                        }
                    }
                    aoek e4;
                    if ((akrb.b & 0x2) != 0x0) {
                        if ((e4 = akrb.d) == null) {
                            e4 = aoek.a;
                        }
                    }
                    else {
                        final ahaz builder = ((ahbh)aoek.a).createBuilder();
                        final ahaz builder2 = ((ahbh)aoej.a).createBuilder();
                        builder2.copyOnWrite();
                        final aoej aoej5 = (aoej)builder2.instance;
                        aoej5.b |= 0x1;
                        aoej5.c = 0L;
                        final aoej c2 = (aoej)builder2.build();
                        builder.copyOnWrite();
                        final aoek aoek4 = (aoek)builder.instance;
                        c2.getClass();
                        aoek4.c = c2;
                        aoek4.b |= 0x1;
                        e4 = (aoek)builder.build();
                    }
                    final ubk l = a.k;
                    l.e(true);
                    l.e = e4;
                    if (!a.h) {
                        long n6;
                        if (a.j && (akrb.b & 0x800) != 0x0) {
                            aoej aoej6;
                            if ((aoej6 = akrb.k) == null) {
                                aoej6 = aoej.a;
                            }
                            n6 = aoej6.c;
                        }
                        else {
                            aoej aoej7;
                            if ((aoej7 = e4.c) == null) {
                                aoej7 = aoej.a;
                            }
                            n6 = aoej7.c;
                        }
                        a.k.h(n6);
                        a.f(n6);
                    }
                    if ((akrb.b & 0x20) != 0x0) {
                        final ubk m = a.k;
                        aiqj c3;
                        if ((c3 = akrb.e) == null) {
                            c3 = aiqj.a;
                        }
                        m.c = c3;
                    }
                }
            }
            else {
                if (a.m.bs() || (boolean)a.l.cf().aM()) {
                    final ahbx f2 = akrb.f;
                    if (((List)f2).isEmpty()) {
                        zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Music]No audio remix source found.");
                    }
                    else if ((((aoei)((List)f2).get(0)).b & 0x1) != 0x0) {
                        aofw aofw2;
                        if ((aofw2 = ((aoei)((List)f2).get(0)).c) == null) {
                            aofw2 = aofw.a;
                        }
                        final ubk e5 = a.a().e();
                        aoek e6;
                        if ((e6 = akrb.d) == null) {
                            e6 = aoek.a;
                        }
                        e5.e = e6;
                        aotp d3;
                        if ((d3 = aofw2.b) == null) {
                            d3 = aotp.a;
                        }
                        e5.d = d3;
                        ajut ajut2;
                        if ((ajut2 = aofw2.c) == null) {
                            ajut2 = ajut.a;
                        }
                        e5.f = ((ajuv)ajut2.c.get(0)).c;
                        e5.e(true);
                        if (!a.h) {
                            aoek aoek5;
                            if ((aoek5 = akrb.d) == null) {
                                aoek5 = aoek.a;
                            }
                            e5.h(tpe.bM(aoek5));
                        }
                        a.b.tu((Object)aezp.k((Object)e5.a()));
                    }
                    else {
                        zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Music]No audio remix source metadata found.");
                    }
                }
                aoek e7;
                if ((akrb.b & 0x2) != 0x0) {
                    if ((e7 = akrb.d) == null) {
                        e7 = aoek.a;
                    }
                }
                else {
                    final ahaz builder3 = ((ahbh)aoek.a).createBuilder();
                    final ahaz builder4 = ((ahbh)aoej.a).createBuilder();
                    builder4.copyOnWrite();
                    final aoej aoej8 = (aoej)builder4.instance;
                    aoej8.b |= 0x1;
                    aoej8.c = 0L;
                    final aoej c4 = (aoej)builder4.build();
                    builder3.copyOnWrite();
                    final aoek aoek6 = (aoek)builder3.instance;
                    c4.getClass();
                    aoek6.c = c4;
                    aoek6.b |= 0x1;
                    e7 = (aoek)builder3.build();
                }
                final ubk e8 = a.a().e();
                e8.e(true);
                e8.e = e7;
                if (!a.h) {
                    long n7;
                    if (a.j && (akrb.b & 0x800) != 0x0) {
                        aoej aoej9;
                        if ((aoej9 = akrb.k) == null) {
                            aoej9 = aoej.a;
                        }
                        n7 = aoej9.c;
                    }
                    else {
                        aoej aoej10;
                        if ((aoej10 = e7.c) == null) {
                            aoej10 = aoej.a;
                        }
                        n7 = aoej10.c;
                    }
                    e8.h(n7);
                    a.f(n7);
                }
                a.b.tu((Object)aezp.k((Object)e8.a()));
                if ((akrb.b & 0x20) != 0x0) {
                    final ativ b6 = a.b;
                    final ubk e9 = a.a().e();
                    aiqj c5;
                    if ((c5 = akrb.e) == null) {
                        c5 = aiqj.a;
                    }
                    e9.c = c5;
                    e9.e(true);
                    b6.tu((Object)aezp.k((Object)e9.a()));
                }
            }
            return afwm.u((Future)c);
        }
        catch (final ExecutionException ex) {
            return afwm.u((Future)c);
        }
    }
}
