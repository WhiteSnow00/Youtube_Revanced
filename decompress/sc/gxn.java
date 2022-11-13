import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand;
import j$.time.Duration;
import com.google.protos.youtube.api.innertube.ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand;
import com.google.protos.youtube.api.innertube.CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand;
import java.util.Map;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxn implements vcv
{
    private final vcy a;
    private final abpq b;
    private final aujg c;
    
    public gxn(final vcy a, final abpq b, final aujg c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected static aezp b(final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint) {
        for (int i = 0; i < shortsCreationEndpointOuterClass$ShortsCreationEndpoint.c.size(); ++i) {
            final anuv anuv = (anuv)shortsCreationEndpointOuterClass$ShortsCreationEndpoint.c.get(i);
            if (anuv.ry((ahaq)aoeq.a)) {
                return aezp.k((Object)aezq.a((Object)anuv.rx((ahaq)aoeq.a), (Object)i));
            }
        }
        return (aezp)aeyo.a;
    }
    
    public final void mE(aiqj aiqj, final Map map) {
        adkp.H(((ahbc)aiqj).ry((ahaq)CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.createShortFromSourceCommand));
        final CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand = (CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand)((ahbc)aiqj).rx((ahaq)CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.createShortFromSourceCommand);
        if ((aiqj = createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.b) == null) {
            aiqj = aiqj.a;
        }
        adkp.H(((ahbc)aiqj).ry((ahaq)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint));
        if ((aiqj = createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.b) == null) {
            aiqj = aiqj.a;
        }
        final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)((ahbc)aiqj).rx((ahaq)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint);
        final long c = this.b.q().c();
        ajao ajao;
        if ((ajao = createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.c) == null) {
            ajao = ajao.a;
        }
        final long j = this.b.j();
        Object o = null;
        Label_0358: {
            if (c != j && (!ajao.c || !((List)ajao.b).isEmpty())) {
                if (ajao.c) {
                    final long n = this.c.bo();
                    adkp.H(ajao.c);
                    adkp.H(((List)ajao.b).isEmpty() ^ true);
                    final Iterator<Object> iterator = ((List<Object>)ajao.b).iterator();
                    long n2 = 0L;
                    long d = 0L;
                    while (true) {
                        while (iterator.hasNext()) {
                            final ajan ajan = iterator.next();
                            d = ajan.d;
                            final long b = ajan.b;
                            final long c2 = ajan.c;
                            long n3;
                            if (b <= c && c < b + d) {
                                n3 = c2 + (c - b);
                            }
                            else {
                                n2 = c2;
                                if (c >= b) {
                                    continue;
                                }
                                n3 = c2;
                            }
                            o = aezp.k((Object)Math.min(Math.max(0L, ajao.d - n), n3));
                            break Label_0358;
                        }
                        long n3 = n2 + d;
                        continue;
                    }
                }
                o = aezp.k((Object)Math.min(Math.max(0L, j - this.c.bo()), c));
            }
            else {
                o = aeyo.a;
            }
        }
        Object o2 = shortsCreationEndpointOuterClass$ShortsCreationEndpoint;
        if (((aezp)o).h()) {
            final long longValue = (long)((aezp)o).c();
            final aezp b2 = b(shortsCreationEndpointOuterClass$ShortsCreationEndpoint);
            if (!b2.h()) {
                ttr.b("There is no ShortsCreationAudioRenderer in ShortsCreationEndpoint, returning original endpoint.");
                o2 = shortsCreationEndpointOuterClass$ShortsCreationEndpoint;
            }
            else if (!((aoep)((aezq)b2.c()).a).i) {
                o2 = shortsCreationEndpointOuterClass$ShortsCreationEndpoint;
            }
            else {
                final aoep aoep = (aoep)((aezq)b2.c()).a;
                aoeo aoeo;
                if ((aoeo = aoep.f) == null) {
                    aoeo = aoeo.a;
                }
                final ahaz builder = ((ahbh)aoeo).toBuilder();
                builder.copyOnWrite();
                final aoeo aoeo2 = (aoeo)builder.instance;
                aoeo2.b |= 0x1;
                aoeo2.c = longValue;
                final aoeo f = (aoeo)builder.build();
                final ahaz builder2 = ((ahbh)aoep).toBuilder();
                builder2.copyOnWrite();
                final aoep aoep2 = (aoep)builder2.instance;
                f.getClass();
                aoep2.f = f;
                aoep2.b |= 0x10;
                final aoep aoep3 = (aoep)builder2.build();
                final ahbb ahbb = (ahbb)((ahbh)anuv.a).createBuilder();
                ahbb.e((ahaq)aoeq.a, (Object)aoep3);
                final anuv anuv = (anuv)((ahaz)ahbb).build();
                final ahaz builder3 = ((ahbh)shortsCreationEndpointOuterClass$ShortsCreationEndpoint).toBuilder();
                builder3.bG((int)((aezq)b2.c()).b, anuv);
                o2 = builder3.build();
            }
        }
        if ((aiqj = ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)o2).f) == null) {
            aiqj = aiqj.a;
        }
        ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint3;
        if (((ahbc)aiqj).ry((ahaq)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand)) {
            final long n4 = this.c.bo();
            if ((aiqj = ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)o2).f) == null) {
                aiqj = aiqj.a;
            }
            final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)((ahbc)aiqj).rx((ahaq)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand);
            aofa aofa2;
            if (shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.f.size() > 0) {
                final ahaz builder4 = ((ahbh)shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.f.get(0)).toBuilder();
                builder4.copyOnWrite();
                final aofa aofa = (aofa)builder4.instance;
                aofa.b |= 0x1;
                aofa.c = c;
                aofa2 = (aofa)builder4.build();
            }
            else {
                long seconds;
                final long n5 = seconds = Duration.ofMillis(n4).getSeconds();
                if ((shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.b & 0x1) != 0x0) {
                    final long n6 = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.c;
                    seconds = n5;
                    if (n6 < n5) {
                        seconds = n6;
                    }
                }
                final ahaz builder5 = ((ahbh)aofa.a).createBuilder();
                builder5.copyOnWrite();
                final aofa aofa3 = (aofa)builder5.instance;
                aofa3.b |= 0x1;
                aofa3.c = c;
                final ahan d2 = ahey.d(seconds);
                builder5.copyOnWrite();
                final aofa aofa4 = (aofa)builder5.instance;
                d2.getClass();
                aofa4.d = d2;
                aofa4.b |= 0x2;
                aofa2 = (aofa)builder5.build();
            }
            final ahaz builder6 = ((ahbh)shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand).toBuilder();
            builder6.copyOnWrite();
            final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2 = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)builder6.instance;
            aofa2.getClass();
            final ahbx f2 = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.f;
            if (!f2.c()) {
                shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.f = ahbh.mutableCopy(f2);
            }
            shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.f.add((Object)aofa2);
            final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand3 = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)builder6.build();
            final ahbb ahbb2 = (ahbb)((ahbh)aiqj.a).createBuilder();
            ahbb2.e((ahaq)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand, (Object)shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand3);
            aiqj = (aiqj)((ahaz)ahbb2).build();
            final ahaz builder7 = ((ahbh)o2).toBuilder();
            builder7.copyOnWrite();
            final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint2 = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)builder7.instance;
            aiqj.getClass();
            shortsCreationEndpointOuterClass$ShortsCreationEndpoint2.f = aiqj;
            shortsCreationEndpointOuterClass$ShortsCreationEndpoint2.b |= 0x8;
            shortsCreationEndpointOuterClass$ShortsCreationEndpoint3 = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)builder7.build();
        }
        else if (((ahbc)aiqj).ry((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand)) {
            if ((aiqj = ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)o2).f) == null) {
                aiqj = aiqj.a;
            }
            final GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand = (GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand)((ahbc)aiqj).rx((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand);
            final ahaz builder8 = ((ahbh)aofv.a).createBuilder();
            builder8.copyOnWrite();
            final aofv aofv = (aofv)builder8.instance;
            aofv.b |= 0x1;
            aofv.c = c;
            final aofv aofv2 = (aofv)builder8.build();
            final ahaz builder9 = ((ahbh)getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand).toBuilder();
            builder9.aP(aofv2);
            final GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand2 = (GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand)builder9.build();
            final ahbb ahbb3 = (ahbb)((ahbh)aiqj.a).createBuilder();
            ahbb3.e((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand, (Object)getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand2);
            aiqj = (aiqj)((ahaz)ahbb3).build();
            final ahaz builder10 = ((ahbh)o2).toBuilder();
            builder10.copyOnWrite();
            final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint4 = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)builder10.instance;
            aiqj.getClass();
            shortsCreationEndpointOuterClass$ShortsCreationEndpoint4.f = aiqj;
            shortsCreationEndpointOuterClass$ShortsCreationEndpoint4.b |= 0x8;
            shortsCreationEndpointOuterClass$ShortsCreationEndpoint3 = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)builder10.build();
        }
        else {
            final ahaz builder11 = ((ahbh)aofv.a).createBuilder();
            builder11.copyOnWrite();
            final aofv aofv3 = (aofv)builder11.instance;
            aofv3.b |= 0x1;
            aofv3.c = c;
            final aofv aofv4 = (aofv)builder11.build();
            final aezp b3 = b((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)o2);
            shortsCreationEndpointOuterClass$ShortsCreationEndpoint3 = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)o2;
            if (b3.h()) {
                final aoep aoep4 = (aoep)((aezq)b3.c()).a;
                aiqj = aoep4.h;
                aiqj a;
                if ((a = aiqj) == null) {
                    a = aiqj.a;
                }
                aoep aoep5 = aoep4;
                if (((ahbc)a).ry((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand)) {
                    final GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand3 = (GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand)((ahbc)a).rx((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand);
                    final ahaz builder12 = ((ahbh)aoep4).toBuilder();
                    final ahbb ahbb4 = (ahbb)((ahbh)aiqj.a).createBuilder();
                    final ahbf getShortsSourceVideoCommand = GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand;
                    final ahaz builder13 = ((ahbh)getShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand3).toBuilder();
                    builder13.aP(aofv4);
                    ahbb4.e((ahaq)getShortsSourceVideoCommand, (Object)builder13.build());
                    builder12.copyOnWrite();
                    final aoep aoep6 = (aoep)builder12.instance;
                    final aiqj h = (aiqj)((ahaz)ahbb4).build();
                    h.getClass();
                    aoep6.h = h;
                    aoep6.b |= 0x40;
                    aoep5 = (aoep)builder12.build();
                }
                final ahaz builder14 = ((ahbh)o2).toBuilder();
                final int intValue = (int)((aezq)b3.c()).b;
                final ahbb ahbb5 = (ahbb)((ahbh)anuv.a).createBuilder();
                ahbb5.e((ahaq)aoeq.a, (Object)aoep5);
                builder14.bG(intValue, (anuv)((ahaz)ahbb5).build());
                shortsCreationEndpointOuterClass$ShortsCreationEndpoint3 = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)builder14.build();
            }
        }
        final vcy a2 = this.a;
        aiqj aiqj2;
        if ((aiqj2 = createShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.b) == null) {
            aiqj2 = aiqj.a;
        }
        final ahbb ahbb6 = (ahbb)((ahbh)aiqj2).toBuilder();
        ahbb6.e((ahaq)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint, (Object)shortsCreationEndpointOuterClass$ShortsCreationEndpoint3);
        a2.a((aiqj)((ahaz)ahbb6).build());
    }
}
