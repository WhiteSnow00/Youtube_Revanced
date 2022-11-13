import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaov extends abey
{
    private final aaos d;
    
    public aaov(final tgd tgd, final Executor executor, final atke atke, final atke atke2, final atke atke3, final atke atke4, final WillAutonavInformer willAutonavInformer, final aaos d, final vaf vaf, final aezp aezp, final Map map, final abpl abpl, final abqb abqb, final xam xam, final abrj abrj, final byte[] array) {
        super(tgd, executor, atke, atke2, atke3, atke4, willAutonavInformer, vaf, aezp, map, abpl, abqb, xam, abrj, (byte[])null);
        d.getClass();
        this.d = d;
    }
    
    protected final affr b(final aiqj aiqj, andl andl) {
        final ahaz builder = andl.toBuilder();
        final int e = ((andl)builder.instance).e;
        aaou aaou2;
        final aaou aaou = aaou2 = null;
        aiqj aiqj2 = aiqj;
        Label_0331: {
            if (e != 0) {
                if (this.d.a()) {
                    final int e2 = ((andl)builder.instance).e;
                    builder.copyOnWrite();
                    andl = (andl)builder.instance;
                    andl.b |= 0x4;
                    andl.d = e2;
                    if (builder != null && aiqj != null) {
                        if (((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
                            final ahaz builder2 = ((apsk)((ahbc)aiqj).rx((ahaq)WatchEndpointOuterClass.watchEndpoint)).toBuilder();
                            final apsk apsk = (apsk)builder2.instance;
                            if ((apsk.b & 0x4000) != 0x0) {
                                apsl apsl;
                                if ((apsl = apsk.o) == null) {
                                    apsl = apsl.a;
                                }
                                final ahaz builder3 = apsl.toBuilder();
                                builder3.copyOnWrite();
                                final apsl apsl2 = (apsl)builder3.instance;
                                final andl c = (andl)builder.build();
                                c.getClass();
                                apsl2.c = c;
                                apsl2.b |= 0x1;
                                builder2.copyOnWrite();
                                final apsk apsk2 = (apsk)builder2.instance;
                                final apsl o = (apsl)builder3.build();
                                o.getClass();
                                apsk2.o = o;
                                apsk2.b |= 0x4000;
                                final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
                                ahbb.e((ahaq)WatchEndpointOuterClass.watchEndpoint, (Object)builder2.build());
                                aiqj2 = (aiqj)((ahaz)ahbb).build();
                                aaou2 = aaou;
                                break Label_0331;
                            }
                        }
                    }
                    aiqj2 = null;
                    aaou2 = aaou;
                }
                else {
                    aaou2 = new aaou(this.a, ((andl)builder.instance).e);
                    aiqj2 = aiqj;
                }
            }
        }
        final affr b = super.b(aiqj2, (andl)builder.build());
        if (aaou2 != null) {
            aaou2.d.g((Object)aaou2);
            b.h(aaou2);
        }
        return b;
    }
}
