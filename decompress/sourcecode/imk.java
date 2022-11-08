import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imk implements aaci
{
    private final zki a;
    private final vcf b;
    private final Context c;
    
    public imk(final Context c, final zki a, final vcf b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final akve a(akve akve, final String s) {
        final agzc agzc = (agzc)((agzi)akve).toBuilder();
        szc.e();
        final ajhr ajhr = (ajhr)this.b.a(this.a.c()).f(gkt.bg(s)).j((Class)ajhr.class).af();
        if (ajhr != null && ((ajhr.b.c & 0x2) == 0x0 || ajhr.getPlaybackStartSeconds() == 0L) && !ajhr.getLicenses().isEmpty() && !((ajhv)ajhr.getLicenses().get(0)).f) {
            akuv akuv;
            if ((akuv = akve.f) == null) {
                akuv = akuv.a;
            }
            final int n = (int)(ajhr.getLicenses().get(0).e / 3600L);
            final String quantityString = this.c.getResources().getQuantityString(2131886138, n, new Object[] { n });
            final agza builder = ((agzi)apvc.a).createBuilder();
            final agzc agzc2 = (agzc)((agzi)ajsq.a).createBuilder();
            ((agza)agzc2).copyOnWrite();
            final ajsq ajsq = (ajsq)agzc2.instance;
            quantityString.getClass();
            ajsq.b |= 0x1;
            ajsq.d = quantityString;
            final ajsq c = (ajsq)((agza)agzc2).build();
            builder.copyOnWrite();
            final apvc apvc = (apvc)builder.instance;
            c.getClass();
            apvc.c = c;
            apvc.b |= 0x4;
            final apvc c2 = (apvc)builder.build();
            akvm akvm;
            if ((akvm = akuv.n) == null) {
                akvm = akvm.a;
            }
            final agza builder2 = ((agzi)akvm).toBuilder();
            builder2.copyOnWrite();
            final akvm akvm2 = (akvm)builder2.instance;
            c2.getClass();
            akvm2.c = c2;
            akvm2.b = 86428467;
            final akvm n2 = (akvm)builder2.build();
            final agza builder3 = ((agzi)akuv).toBuilder();
            builder3.copyOnWrite();
            final akuv akuv2 = (akuv)builder3.instance;
            n2.getClass();
            akuv2.n = n2;
            akuv2.b |= 0x40000;
            final akuv f = (akuv)builder3.build();
            ((agza)agzc).copyOnWrite();
            final akve akve2 = (akve)agzc.instance;
            f.getClass();
            akve2.f = f;
            akve2.b |= 0x4;
            ancd ancd;
            if ((ancd = akve.e) == null) {
                ancd = ancd.a;
            }
            anbn anbn;
            if ((anbn = ancd.g) == null) {
                anbn = anbn.a;
            }
            final agza builder4 = ((agzi)anbn).toBuilder();
            builder4.copyOnWrite();
            final anbn anbn2 = (anbn)builder4.instance;
            anbn2.b |= 0x20;
            anbn2.g = true;
            final anbn g = (anbn)builder4.build();
            final agza builder5 = ((agzi)ancd).toBuilder();
            builder5.copyOnWrite();
            final ancd ancd2 = (ancd)builder5.instance;
            g.getClass();
            ancd2.g = g;
            ancd2.b |= 0x80;
            final ancd e = (ancd)builder5.build();
            ((agza)agzc).copyOnWrite();
            akve = (akve)agzc.instance;
            e.getClass();
            akve.e = e;
            akve.b |= 0x2;
        }
        return (akve)((agza)agzc).build();
    }
}
