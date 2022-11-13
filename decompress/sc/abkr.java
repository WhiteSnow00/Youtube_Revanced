import java.util.Map;
import java.util.List;
import java.util.Iterator;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import j$.time.temporal.Temporal;
import j$.time.Instant;
import j$.time.Duration;
import j$.util.Optional;
import android.content.Intent;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import android.util.Pair;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkr implements aezf
{
    public final Object a;
    private final int b;
    
    public abkr(final abku a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final abpq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final abqs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final ackb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final acsd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final acsy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final adge a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final adrh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final adry a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final aejh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final AccountId a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final ValidationResult a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final vaf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abkr(final String[] a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object apply(Object a) {
        final int b = this.b;
        final boolean b2 = true;
        final Object o = null;
        boolean booleanValue = false;
        switch (b) {
            default: {
                return Pair.create(this.a, a);
            }
            case 19: {
                final Object a2 = this.a;
                final aejy aejy = (aejy)a;
                final AccountId a3 = aejy.a;
                final aejz b3 = aejy.b;
                final ValidationResult validationResult = (ValidationResult)a2;
                adkp.R(validationResult.c(), (Object)"Trying to propagate AccountInfo for invalid account.");
                return new AccountActionResult(a3, b3, validationResult, (Intent)null);
            }
            case 18: {
                a = this.a;
                return new AccountActionResult((AccountId)a, aejz.a, (ValidationResult)null, (Intent)null);
            }
            case 17: {
                final Object a4 = this.a;
                final Optional optional = (Optional)a;
                if (optional.isPresent()) {
                    try {
                        adds.aa((adqm)optional.get());
                    }
                    catch (final IllegalStateException ex) {
                        c.i(((afkg)adrm.a).g(), "Invalid heartbeat state. Sending anyway.", "com/google/android/livesharing/internal/LiveSharingSessionFactory", "maybeValidateHeartbeatCoWatchingState", '\u0092', "LiveSharingSessionFactory.java", (Throwable)ex);
                    }
                }
                Duration duration;
                if (optional.isPresent()) {
                    duration = ((adqm)optional.get()).b;
                }
                else {
                    duration = Duration.ZERO;
                }
                Object d = ((adry)a4).b;
                synchronized (d) {
                    final aguc a5 = ((adry)a4).a();
                    final adrw a6 = ((adry)a4).a;
                    final Object a7 = ((adrz)a4).d().a;
                    final Instant d2 = a6.d;
                    Duration duration2;
                    if (d2 == null) {
                        ((afki)((afki)((afkg)adrw.a).h()).j("com/google/android/livesharing/internal/state/DesiredPositionTracker", "getDesiredPosition", 67, "DesiredPositionTracker.java")).r("Did not expect markBaselineDesiredPosition to not be called.");
                        ahan ahan;
                        if ((ahan = ((aguh)a7).c) == null) {
                            ahan = ahan.a;
                        }
                        duration2 = adyf.ar(ahan);
                    }
                    else {
                        final afss b4 = a6.b;
                        final Duration between = Duration.between((Temporal)d2, (Temporal)Instant.now());
                        int c;
                        if ((c = agpi.c(((aguh)a7).e)) == 0) {
                            c = 1;
                        }
                        if (c != 5 && c != 6) {
                            double f;
                            if ((f = ((aguh)a7).f) == 0.0) {
                                ((afki)((afki)((afkg)adrw.a).h()).j("com/google/android/livesharing/internal/state/DesiredPositionTracker", "getDesiredPosition", 86, "DesiredPositionTracker.java")).r("Did not expect playoutRate to ever be zero, yet here we are.");
                                f = 1.0;
                            }
                            duration2 = a6.c.plus(afsp.b(between, f));
                        }
                        else {
                            ahan ahan2;
                            if ((ahan2 = ((aguh)a7).c) == null) {
                                ahan2 = ahan.a;
                            }
                            duration2 = adyf.ar(ahan2);
                        }
                    }
                    final ahan ao = adyf.ao(duration2);
                    monitorexit(d);
                    d = adyf.ao(duration);
                    final ahaz builder = ((ahbh)agul.a).createBuilder();
                    final ahaz builder2 = ((ahbh)aguh.a).createBuilder();
                    builder2.copyOnWrite();
                    final aguh aguh = (aguh)builder2.instance;
                    ao.getClass();
                    aguh.c = ao;
                    builder2.copyOnWrite();
                    final aguh aguh2 = (aguh)builder2.instance;
                    d.getClass();
                    aguh2.d = (ahan)d;
                    builder.copyOnWrite();
                    final agul agul = (agul)builder.instance;
                    final aguh b5 = (aguh)builder2.build();
                    b5.getClass();
                    agul.b = b5;
                    final agul agul2 = (agul)builder.buildPartial();
                    final ahaz builder3 = ((ahbh)a5).toBuilder();
                    builder3.copyOnWrite();
                    ((aguc)builder3.instance).f = true;
                    builder3.ap(agul2);
                    return builder3.build();
                }
            }
            case 16: {
                final Object a8 = this.a;
                final adqj adqj = (adqj)a;
                ((adrh)a8).n();
                return null;
            }
            case 15: {
                final Object a9 = this.a;
                final ocg ocg = (ocg)a;
                final adqt b6 = adsd.b(ocg);
                final adrh adrh = (adrh)a9;
                adrh.s = b6;
                final afki afki = (afki)((afki)((afkg)adrh.c).d()).j("com/google/android/livesharing/internal/LiveSharingClientImpl", "lambda$handleConnectMeeting$5", 266, "LiveSharingClientImpl.java");
                ocn ocn;
                if ((ocn = ocn.a(ocg.d)) == null) {
                    ocn = ocn.i;
                }
                afki.t("Received meetingInfo with status : %s", (Object)ocn);
                final ocd b7 = ((adri)adrh.l.get()).a.b();
                final adqw a10 = adqx.a();
                adqx t;
                if (b7 == null) {
                    ((afki)((afki)((afkg)adqx.a).h()).j("com/google/android/livesharing/internal/ClientConfigInfo", "fromProto", 47, "ClientConfigInfo.java")).r("Received null config info from Meet.");
                    t = a10.a();
                }
                else {
                    a10.c(b7.b);
                    a10.b(b7.e);
                    final ahan c2 = b7.c;
                    if (c2 != null) {
                        a10.d(adyf.ar(c2));
                    }
                    final ahan d3 = b7.d;
                    if (d3 != null) {
                        a10.e(adyf.ar(d3));
                    }
                    t = a10.a();
                }
                adrh.t = t;
                return adrh.s;
            }
            case 14: {
                final Object a11 = this.a;
                final akyu akyu = (akyu)a;
                final adge adge = (adge)a11;
                final int n = (int)((oby)adge.c).d();
                final agoe agoe = new agoe((String)adge.b, akyu);
                agoe.b = n - adge.a;
                final afkf d4 = ((afeq)adge.d).D();
                while (((Iterator)d4).hasNext()) {
                    ((adfx)((Iterator)d4).next()).b((String)adge.b, agoe);
                }
                return agoe;
            }
            case 13: {
                final Object a12 = this.a;
                final ahgl ahgl = (ahgl)a;
                final HashSet set = new HashSet<Object>((Collection<?>)ahgl.b);
                Collections.addAll((Collection<? super Object>)set, (Object[])a12);
                final ahaz builder4 = ((ahbh)ahgl).toBuilder();
                builder4.copyOnWrite();
                ((ahgl)builder4.instance).b = ahbh.emptyProtobufList();
                builder4.aA((Iterable)set);
                return builder4.build();
            }
            case 12: {
                return tpe.aZ(((acsy)this.a).f.getContext().getResources().getDisplayMetrics(), (int)a);
            }
            case 11: {
                return Optional.ofNullable((Object)((acsd)this.a).aL((amgp)a).f());
            }
            case 10: {
                return (int)tpe.aX(((ackb)this.a).b, (float)a);
            }
            case 9: {
                return (int)tpe.aX(((ackb)this.a).b, (float)a);
            }
            case 8: {
                return tpe.aZ(((ackb)this.a).b, (int)a);
            }
            case 7: {
                final Object a13 = this.a;
                final Integer n2 = (Integer)a;
                final int a14 = acdh.a;
                anuz anuz;
                if ((anuz = ((vaf)a13).b().j) == null) {
                    anuz = anuz.a;
                }
                anuw anuw;
                if ((anuw = anuz.x) == null) {
                    anuw = anuw.a;
                }
                final Iterator<Object> iterator = ((List<Object>)anuw.b).iterator();
                anux anux;
                do {
                    final Object o2 = o;
                    if (!iterator.hasNext()) {
                        return o2;
                    }
                    anux = iterator.next();
                } while (anux.b != n2);
                Object o2;
                if ((o2 = anux.c) == null) {
                    o2 = aqfa.a;
                    return o2;
                }
                return o2;
            }
            case 6: {
                final Object a15 = this.a;
                final ahaz builder5 = ((ahbh)a).toBuilder();
                final abqs abqs = (abqs)a15;
                if (abqs.a.h()) {
                    final boolean booleanValue2 = (boolean)abqs.a.c();
                    builder5.copyOnWrite();
                    final aqrg aqrg = (aqrg)builder5.instance;
                    aqrg.b |= 0x1;
                    aqrg.c = booleanValue2;
                }
                else {
                    builder5.copyOnWrite();
                    final aqrg aqrg2 = (aqrg)builder5.instance;
                    aqrg2.b &= 0xFFFFFFFE;
                    aqrg2.c = false;
                }
                final String b8 = abqs.b;
                if (b8 != null) {
                    if (b8.isEmpty()) {
                        builder5.copyOnWrite();
                        final aqrg aqrg3 = (aqrg)builder5.instance;
                        aqrg3.b &= 0xFFFFFFFD;
                        aqrg3.d = aqrg.a.d;
                    }
                    else {
                        final String b9 = abqs.b;
                        builder5.copyOnWrite();
                        final aqrg aqrg4 = (aqrg)builder5.instance;
                        b9.getClass();
                        aqrg4.b |= 0x2;
                        aqrg4.d = b9;
                    }
                }
                return builder5.build();
            }
            case 5: {
                final Object a16 = this.a;
                final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)a;
                final Object a17 = ((abpq)a16).u.a;
                return a17 != null && ((abvb)a17).ah(abke.c) && !((abvb)a17).ag(abke.j) && TextUtils.equals((CharSequence)playbackStartDescriptor.k(), (CharSequence)((abvb)a17).v()) && b2;
            }
            case 4: {
                final Object a18 = this.a;
                final ahcr d5 = ((aqrj)a).d;
                if (((Map)d5).containsKey(a18)) {
                    booleanValue = (boolean)((Map)d5).get(a18);
                }
                return booleanValue;
            }
            case 3: {
                final Object a19 = this.a;
                final ablp ablp = (ablp)a;
                return ((abku)a19).e.M(ablp.a, ablp.b);
            }
            case 2: {
                final Object a20 = this.a;
                final ablp ablp2 = (ablp)a;
                return ((abku)a20).e.M(ablp2.a, ablp2.b);
            }
            case 1: {
                final Object a21 = this.a;
                final ablp ablp3 = (ablp)a;
                return ((abku)a21).d(ablp3.a, ablp3.b);
            }
            case 0: {
                final Object a22 = this.a;
                final ablp ablp4 = (ablp)a;
                return ((abku)a22).e.M(ablp4.a, ablp4.b);
            }
        }
    }
}
