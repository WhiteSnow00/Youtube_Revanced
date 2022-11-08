// 
// Decompiled by Procyon v0.6.0
// 

public final class imz extends aagd
{
    private final aaha a;
    private final fml b;
    private final vcf c;
    private final zki d;
    private final uyi e;
    
    public imz(final aaam aaam, final atjj atjj, final fml b, final vcf c, final zki d, final aaha a, final uyi e) {
        super(aaam, (zzu)atjj.a(), a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
    }
    
    private final alxs f(String bw) {
        final fml b = this.b;
        bw = gkt.bw(bw);
        szc.e();
        if (!b.p(vek.i(bw))) {
            return null;
        }
        return (alxs)b.e.a(b.d.c()).f(bw).j((Class)alxs.class).af();
    }
    
    private final alyn g(final String s) {
        return (alyn)this.c.a(this.d.c()).f(gkt.bl(s)).j((Class)alyn.class).af();
    }
    
    protected final amsf a(final String s, final amuv amuv, final String s2, final byte[] array) {
        final agzc agzc = (agzc)((agzi)amsf.b).createBuilder();
        if (this.e.aj() || this.e.ar()) {
            final agzg b = alyj.b;
            final agza builder = ((agzi)alyj.a).createBuilder();
            builder.copyOnWrite();
            final alyj alyj = (alyj)builder.instance;
            alyj.k = 1;
            alyj.c |= 0x100;
            builder.copyOnWrite();
            final alyj alyj2 = (alyj)builder.instance;
            alyj2.d = amuv.k;
            alyj2.c |= 0x1;
            final agyc x = agyc.x(array);
            builder.copyOnWrite();
            final alyj alyj3 = (alyj)builder.instance;
            alyj3.c |= 0x40;
            alyj3.i = x;
            if (s2 != null) {
                builder.copyOnWrite();
                final alyj alyj4 = (alyj)builder.instance;
                alyj4.c |= 0x200;
                alyj4.l = s2;
            }
            if (this.e.aj()) {
                final alyn g = this.g(s);
                if (g != null) {
                    final alyo b2 = g.b;
                    builder.copyOnWrite();
                    final alyj alyj5 = (alyj)builder.instance;
                    b2.getClass();
                    alyj5.m = b2;
                    alyj5.c |= 0x400;
                    final apvz g2 = g.g();
                    if (g2 != null) {
                        final apwa b3 = g2.b;
                        builder.copyOnWrite();
                        final alyj alyj6 = (alyj)builder.instance;
                        b3.getClass();
                        alyj6.n = b3;
                        alyj6.c |= 0x800;
                    }
                }
            }
            else {
                final alxs f = this.f(s);
                if (f != null) {
                    final apxc c = f.c();
                    if (c != null) {
                        final agzc agzc2 = (agzc)((agzi)alyo.a).createBuilder();
                        final long longValue = c.getDislikeCount();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo = (alyo)agzc2.instance;
                        alyo.c |= 0x800;
                        alyo.o = longValue;
                        final ajsq formattedDescription = c.getFormattedDescription();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo2 = (alyo)agzc2.instance;
                        formattedDescription.getClass();
                        alyo2.k = formattedDescription;
                        alyo2.c |= 0x100;
                        final int intValue = c.getLengthSeconds();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo3 = (alyo)agzc2.instance;
                        alyo3.c |= 0x40;
                        alyo3.i = intValue;
                        final long longValue2 = c.getLikeCount();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo4 = (alyo)agzc2.instance;
                        alyo4.c |= 0x400;
                        alyo4.n = longValue2;
                        final apwz localizedStrings = c.getLocalizedStrings();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo5 = (alyo)agzc2.instance;
                        localizedStrings.getClass();
                        alyo5.p = localizedStrings;
                        alyo5.c |= 0x1000;
                        final long longValue3 = c.getPublishedTimestampMillis();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo6 = (alyo)agzc2.instance;
                        alyo6.c |= 0x20;
                        alyo6.h = longValue3;
                        final aorm thumbnail = c.getThumbnail();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo7 = (alyo)agzc2.instance;
                        thumbnail.getClass();
                        alyo7.j = thumbnail;
                        alyo7.c |= 0x80;
                        final String title = c.getTitle();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo8 = (alyo)agzc2.instance;
                        title.getClass();
                        alyo8.c |= 0x10;
                        alyo8.g = title;
                        final String videoId = c.getVideoId();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo9 = (alyo)agzc2.instance;
                        videoId.getClass();
                        alyo9.c |= 0x4;
                        alyo9.e = videoId;
                        final long longValue4 = c.getViewCount();
                        ((agza)agzc2).copyOnWrite();
                        final alyo alyo10 = (alyo)agzc2.instance;
                        alyo10.c |= 0x200;
                        alyo10.m = longValue4;
                        final alyo m = (alyo)((agza)agzc2).build();
                        builder.copyOnWrite();
                        final alyj alyj7 = (alyj)builder.instance;
                        m.getClass();
                        alyj7.m = m;
                        alyj7.c |= 0x400;
                        final apvz f2 = c.f();
                        if (f2 != null) {
                            final apwa b4 = f2.b;
                            builder.copyOnWrite();
                            final alyj alyj8 = (alyj)builder.instance;
                            b4.getClass();
                            alyj8.n = b4;
                            alyj8.c |= 0x800;
                        }
                    }
                }
            }
            agzc.e((agyr)b, (Object)builder.build());
        }
        if (!this.e.ar()) {
            final agzg b5 = apwf.b;
            final agza builder2 = ((agzi)apwf.a).createBuilder();
            builder2.copyOnWrite();
            final apwf apwf = (apwf)builder2.instance;
            apwf.e = amuv.k;
            apwf.c |= 0x2;
            final agyc x2 = agyc.x(array);
            builder2.copyOnWrite();
            final apwf apwf2 = (apwf)builder2.instance;
            apwf2.c |= 0x1;
            apwf2.d = x2;
            if (s2 != null) {
                builder2.copyOnWrite();
                final apwf apwf3 = (apwf)builder2.instance;
                apwf3.c |= 0x20;
                apwf3.h = s2;
            }
            if (this.e.aj()) {
                final alyn g3 = this.g(s);
                if (g3 != null) {
                    final agza builder3 = ((agzi)apxd.a).createBuilder();
                    final long longValue5 = g3.getDislikeCount();
                    builder3.copyOnWrite();
                    final apxd apxd = (apxd)builder3.instance;
                    apxd.c |= 0x1000;
                    apxd.o = longValue5;
                    final ajsq formattedDescription2 = g3.getFormattedDescription();
                    builder3.copyOnWrite();
                    final apxd apxd2 = (apxd)builder3.instance;
                    formattedDescription2.getClass();
                    apxd2.l = formattedDescription2;
                    apxd2.c |= 0x200;
                    final int intValue2 = g3.getLengthSeconds();
                    builder3.copyOnWrite();
                    final apxd apxd3 = (apxd)builder3.instance;
                    apxd3.c |= 0x40;
                    apxd3.i = intValue2;
                    final long longValue6 = g3.getLikeCount();
                    builder3.copyOnWrite();
                    final apxd apxd4 = (apxd)builder3.instance;
                    apxd4.c |= 0x800;
                    apxd4.n = longValue6;
                    final apwz localizedStrings2 = g3.getLocalizedStrings();
                    builder3.copyOnWrite();
                    final apxd apxd5 = (apxd)builder3.instance;
                    localizedStrings2.getClass();
                    apxd5.q = localizedStrings2;
                    apxd5.c |= 0x4000;
                    final long longValue7 = g3.getPublishedTimestampMillis();
                    builder3.copyOnWrite();
                    final apxd apxd6 = (apxd)builder3.instance;
                    apxd6.c |= 0x20;
                    apxd6.h = longValue7;
                    final aorm thumbnail2 = g3.getThumbnail();
                    builder3.copyOnWrite();
                    final apxd apxd7 = (apxd)builder3.instance;
                    thumbnail2.getClass();
                    apxd7.j = thumbnail2;
                    apxd7.c |= 0x80;
                    final String title2 = g3.getTitle();
                    builder3.copyOnWrite();
                    final apxd apxd8 = (apxd)builder3.instance;
                    title2.getClass();
                    apxd8.c |= 0x10;
                    apxd8.g = title2;
                    final String videoId2 = g3.getVideoId();
                    builder3.copyOnWrite();
                    final apxd apxd9 = (apxd)builder3.instance;
                    videoId2.getClass();
                    apxd9.c |= 0x4;
                    apxd9.e = videoId2;
                    final long longValue8 = g3.getViewCount();
                    builder3.copyOnWrite();
                    final apxd apxd10 = (apxd)builder3.instance;
                    apxd10.c |= 0x400;
                    apxd10.m = longValue8;
                    final apxd f3 = (apxd)builder3.build();
                    builder2.copyOnWrite();
                    final apwf apwf4 = (apwf)builder2.instance;
                    f3.getClass();
                    apwf4.f = f3;
                    apwf4.c |= 0x8;
                    final apvz g4 = g3.g();
                    if (g4 != null) {
                        final apwa b6 = g4.b;
                        builder2.copyOnWrite();
                        final apwf apwf5 = (apwf)builder2.instance;
                        b6.getClass();
                        apwf5.g = b6;
                        apwf5.c |= 0x10;
                    }
                }
            }
            else {
                final alxs f4 = this.f(s);
                if (f4 != null) {
                    final apxc c2 = f4.c();
                    if (c2 != null) {
                        final apxd b7 = c2.b;
                        builder2.copyOnWrite();
                        final apwf apwf6 = (apwf)builder2.instance;
                        b7.getClass();
                        apwf6.f = b7;
                        apwf6.c |= 0x8;
                        final apvz f5 = c2.f();
                        if (f5 != null) {
                            final apwa b8 = f5.b;
                            builder2.copyOnWrite();
                            final apwf apwf7 = (apwf)builder2.instance;
                            b8.getClass();
                            apwf7.g = b8;
                            apwf7.c |= 0x10;
                        }
                    }
                }
            }
            agzc.e((agyr)b5, (Object)builder2.build());
        }
        return (amsf)((agza)agzc).build();
    }
    
    public final int b(final String s, final amuv amuv, final String s2, final zzf zzf, final byte[] array, final int n) {
        if (this.b.p(s) && !this.a.o()) {
            return this.d(s, amuv, s2, array, n);
        }
        return super.b(s, amuv, s2, zzf, array, n);
    }
}
