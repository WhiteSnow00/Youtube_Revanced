import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imp extends iln
{
    private final Context a;
    
    public imp(final Context a) {
        super((Class)aivx.class);
        this.a = a;
    }
    
    private final ajut f(final int n) {
        return acak.h(this.a.getString(n));
    }
    
    public final /* bridge */ Object a(final afev afev) {
        final ahbb ahbb = (ahbb)((ahbh)aivx.a).createBuilder();
        final ajut f = this.f(2132018139);
        ((ahaz)ahbb).copyOnWrite();
        final aivx aivx = (aivx)ahbb.instance;
        f.getClass();
        aivx.e = f;
        aivx.b |= 0x4;
        final ajut f2 = this.f(2132018138);
        ((ahaz)ahbb).copyOnWrite();
        final aivx aivx2 = (aivx)ahbb.instance;
        f2.getClass();
        aivx2.f = f2;
        aivx2.b |= 0x8;
        final ahbb ahbb2 = (ahbb)((ahbh)akdi.a).createBuilder();
        final akdh z = akdh.z;
        ((ahaz)ahbb2).copyOnWrite();
        final akdi akdi = (akdi)ahbb2.instance;
        akdi.c = z.sy;
        akdi.b |= 0x1;
        ((ahaz)ahbb).copyOnWrite();
        final aivx aivx3 = (aivx)ahbb.instance;
        final akdi d = (akdi)((ahaz)ahbb2).build();
        d.getClass();
        aivx3.d = d;
        aivx3.c = 13;
        final ahaz builder = ((ahbh)aida.a).createBuilder();
        final ahbb ahbb3 = (ahbb)((ahbh)aicz.a).createBuilder();
        final ajut f3 = this.f(2132018136);
        ((ahaz)ahbb3).copyOnWrite();
        final aicz aicz = (aicz)ahbb3.instance;
        f3.getClass();
        aicz.i = f3;
        aicz.b |= 0x200;
        ((ahaz)ahbb3).copyOnWrite();
        final aicz aicz2 = (aicz)ahbb3.instance;
        aicz2.d = 13;
        aicz2.c = 1;
        final ahbb ahbb4 = (ahbb)((ahbh)aiqj.a).createBuilder();
        final ahbf browseEndpoint = BrowseEndpointOuterClass.browseEndpoint;
        final ahaz builder2 = ((ahbh)aicj.a).createBuilder();
        builder2.copyOnWrite();
        final aicj aicj = (aicj)builder2.instance;
        aicj.b |= 0x1;
        aicj.c = "FEcommute_onboarding_recs";
        ahbb4.e((ahaq)browseEndpoint, (Object)builder2.build());
        ((ahaz)ahbb3).copyOnWrite();
        final aicz aicz3 = (aicz)ahbb3.instance;
        final aiqj p = (aiqj)((ahaz)ahbb4).build();
        p.getClass();
        aicz3.p = p;
        aicz3.b |= 0x10000;
        builder.copyOnWrite();
        final aida aida = (aida)builder.instance;
        final aicz c = (aicz)((ahaz)ahbb3).build();
        c.getClass();
        aida.c = c;
        aida.b |= 0x1;
        ((ahaz)ahbb).copyOnWrite();
        final aivx aivx4 = (aivx)ahbb.instance;
        final aida i = (aida)builder.build();
        i.getClass();
        aivx4.i = i;
        aivx4.b |= 0x40;
        ((ahaz)ahbb).copyOnWrite();
        final aivx aivx5 = (aivx)ahbb.instance;
        aivx5.b |= 0x400;
        aivx5.m = true;
        return ((ahaz)ahbb).build();
    }
}
