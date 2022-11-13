import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class geg implements gdz
{
    private final akav a;
    
    public geg(final String d, final String c, final String c2) {
        final ahaz builder = ((ahbh)akav.a).createBuilder();
        final ahbb ahbb = (ahbb)((ahbh)akdi.a).createBuilder();
        final akdh hd = akdh.hd;
        ((ahaz)ahbb).copyOnWrite();
        final akdi akdi = (akdi)ahbb.instance;
        akdi.c = hd.sy;
        akdi.b |= 0x1;
        builder.copyOnWrite();
        final akav akav = (akav)builder.instance;
        final akdi e = (akdi)((ahaz)ahbb).build();
        e.getClass();
        akav.e = e;
        akav.b |= 0x1;
        final ahaz builder2 = ((ahbh)ahik.a).createBuilder();
        tvb.n(c2);
        builder2.copyOnWrite();
        final ahik ahik = (ahik)builder2.instance;
        ahik.b |= 0x2;
        ahik.c = c2;
        builder.copyOnWrite();
        final akav akav2 = (akav)builder.instance;
        final ahik f = (ahik)builder2.build();
        f.getClass();
        akav2.f = f;
        akav2.b |= 0x8;
        final ahaz builder3 = ((ahbh)amwo.a).createBuilder();
        builder3.copyOnWrite();
        final amwo amwo = (amwo)builder3.instance;
        amwo.b |= 0x1;
        amwo.c = c;
        tvb.n(d);
        builder3.copyOnWrite();
        final amwo amwo2 = (amwo)builder3.instance;
        amwo2.b |= 0x2;
        amwo2.d = d;
        builder3.copyOnWrite();
        final amwo amwo3 = (amwo)builder3.instance;
        amwo3.b |= 0x4;
        amwo3.e = 0;
        final amwo amwo4 = (amwo)builder3.build();
        final ahbb ahbb2 = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb2.e((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)amwo4);
        builder.copyOnWrite();
        final akav akav3 = (akav)builder.instance;
        final aiqj d2 = (aiqj)((ahaz)ahbb2).build();
        d2.getClass();
        akav3.d = d2;
        akav3.c = 3;
        this.a = (akav)builder.build();
    }
    
    public final aiqj a() {
        final akav a = this.a;
        if (a.c == 3) {
            return (aiqj)a.d;
        }
        return null;
    }
    
    public final aiqj b() {
        final akav a = this.a;
        if (a.c == 2) {
            return (aiqj)a.d;
        }
        return null;
    }
    
    public final akdi c() {
        final akav a = this.a;
        if ((a.b & 0x1) != 0x0) {
            akdi akdi;
            if ((akdi = a.e) == null) {
                akdi = akdi.a;
            }
            return akdi;
        }
        return null;
    }
    
    public final Object d() {
        return this.a;
    }
    
    public final String e() {
        final akav a = this.a;
        if ((a.b & 0x8) != 0x0) {
            ahik ahik;
            if ((ahik = a.f) == null) {
                ahik = ahik.a;
            }
            return ahik.c;
        }
        return null;
    }
}
