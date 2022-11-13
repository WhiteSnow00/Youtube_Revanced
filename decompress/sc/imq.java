import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imq extends iln
{
    private final Context a;
    
    public imq(final Context a) {
        super((Class)apao.class);
        this.a = a;
    }
    
    private final ajut f(final int n) {
        return acak.h(this.a.getString(n));
    }
    
    public final /* bridge */ Object a(final afev afev) {
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        final ahbf urlEndpoint = UrlEndpointOuterClass.urlEndpoint;
        final ahaz builder = ((ahbh)apis.a).createBuilder();
        builder.copyOnWrite();
        final apis apis = (apis)builder.instance;
        apis.b |= 0x1;
        apis.c = "https://support.google.com/youtube/answer/6307365";
        builder.copyOnWrite();
        final apis apis2 = (apis)builder.instance;
        apis2.d = 1;
        apis2.b |= 0x2;
        ahbb.e((ahaq)urlEndpoint, (Object)builder.build());
        final Boolean value = false;
        final boolean b = afev != null && (boolean)afev.getOrDefault("is_travel_message", value);
        final boolean b2 = afev != null && (boolean)afev.getOrDefault("is_texit_message", value);
        final ahaz builder2 = apao.a.createBuilder();
        if (b) {
            builder2.bN(this.f(2132019992));
        }
        else if (b2) {
            final ahbf urlEndpoint2 = UrlEndpointOuterClass.urlEndpoint;
            final ahaz builder3 = ((ahbh)apis.a).createBuilder();
            builder3.copyOnWrite();
            final apis apis3 = (apis)builder3.instance;
            apis3.b |= 0x1;
            apis3.c = "https://support.google.com/youtube/answer/6141269";
            builder3.copyOnWrite();
            final apis apis4 = (apis)builder3.instance;
            apis4.d = 1;
            apis4.b |= 0x2;
            ahbb.e((ahaq)urlEndpoint2, (Object)builder3.build());
            builder2.bN(acak.h(jgk.A(this.a, (long)(int)e(afev, "unplayable_in_secs"), false)));
        }
        final aose j = aose.J;
        builder2.copyOnWrite();
        final apao apao = (apao)builder2.instance;
        apao.d = j.aj;
        apao.c = 8;
        final aose h = aose.h;
        builder2.copyOnWrite();
        final apao apao2 = (apao)builder2.instance;
        apao2.i = h.aj;
        apao2.b |= 0x20;
        final ahaz builder4 = ((ahbh)aida.a).createBuilder();
        final ahbb ahbb2 = (ahbb)((ahbh)aicz.a).createBuilder();
        final ajut f = this.f(2132018353);
        ((ahaz)ahbb2).copyOnWrite();
        final aicz aicz = (aicz)ahbb2.instance;
        f.getClass();
        aicz.i = f;
        aicz.b |= 0x200;
        ((ahaz)ahbb2).copyOnWrite();
        final aicz aicz2 = (aicz)ahbb2.instance;
        aicz2.d = 13;
        aicz2.c = 1;
        ((ahaz)ahbb2).copyOnWrite();
        final aicz aicz3 = (aicz)ahbb2.instance;
        final aiqj p = (aiqj)((ahaz)ahbb).build();
        p.getClass();
        aicz3.p = p;
        aicz3.b |= 0x10000;
        builder4.copyOnWrite();
        final aida aida = (aida)builder4.instance;
        final aicz c = (aicz)((ahaz)ahbb2).build();
        c.getClass();
        aida.c = c;
        aida.b |= 0x1;
        builder2.copyOnWrite();
        final apao apao3 = (apao)builder2.instance;
        final aida g = (aida)builder4.build();
        g.getClass();
        apao3.g = g;
        apao3.b |= 0x2;
        return builder2.build();
    }
}
