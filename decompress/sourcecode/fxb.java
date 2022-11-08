import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxb implements acqs
{
    private final tdz a;
    private final wwv b;
    
    public fxb(final tdz a, final wwv b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void pT(final agzc agzc) {
        if (agzc != null) {
            if ((((aibb)agzc.instance).b & 0x4000) != 0x0) {
                this.a.d((Object)new ffu());
                final wwv b = this.b;
                aioe aioe;
                if ((aioe = ((aibb)agzc.instance).n) == null) {
                    aioe = aioe.a;
                }
                b.J(3, (wxz)new wws(aioe.c), (alff)null);
            }
            if (this.b != null) {
                aioe aioe2;
                if ((aioe2 = ((aibb)agzc.instance).o) == null) {
                    aioe2 = aioe.a;
                }
                if (((agzd)aioe2).rs((agyr)YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
                    final wwv b2 = this.b;
                    aioe aioe3;
                    if ((aioe3 = ((aibb)agzc.instance).o) == null) {
                        aioe3 = aioe.a;
                    }
                    b2.J(3, (wxz)new wws(aioe3.c), (alff)null);
                }
            }
        }
    }
}
