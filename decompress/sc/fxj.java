import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxj implements acsw
{
    private final tgd a;
    private final wyw b;
    
    public fxj(final tgd a, final wyw b) {
        this.a = a;
        this.b = b;
    }
    
    public final void pY(final ahbb ahbb) {
        if (ahbb != null) {
            if ((((aicz)ahbb.instance).b & 0x4000) != 0x0) {
                this.a.d((Object)new fga());
                final wyw b = this.b;
                aiqj aiqj;
                if ((aiqj = ((aicz)ahbb.instance).n) == null) {
                    aiqj = aiqj.a;
                }
                b.J(3, (wzz)new wyt(aiqj.c), (alhi)null);
            }
            if (this.b != null) {
                aiqj aiqj2;
                if ((aiqj2 = ((aicz)ahbb.instance).o) == null) {
                    aiqj2 = aiqj.a;
                }
                if (((ahbc)aiqj2).ry((ahaq)YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
                    final wyw b2 = this.b;
                    aiqj aiqj3;
                    if ((aiqj3 = ((aicz)ahbb.instance).o) == null) {
                        aiqj3 = aiqj.a;
                    }
                    b2.J(3, (wzz)new wyt(aiqj3.c), (alhi)null);
                }
            }
        }
    }
}
