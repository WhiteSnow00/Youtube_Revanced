import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acoi implements accg
{
    final aizd a;
    final anaf b;
    final Map c;
    final agmq d;
    
    public acoi(final agmq d, final aizd a, final anaf b, final Map c, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void m() {
    }
    
    public final void o(final boolean b) {
    }
    
    public final void oN() {
        final aies q = aamp.q(this.a);
        Label_0069: {
            if (q != null) {
                aisc aisc;
                if ((aisc = q.n) == null) {
                    aisc = aisc.a;
                }
                if (!((ahcu)aisc).ry((ahci)FlagEndpointOuterClass$FlagEndpoint.flagEndpoint)) {
                    break Label_0069;
                }
            }
            else {
                aisc aisc2;
                if ((aisc2 = this.a.s) == null) {
                    aisc2 = aisc.a;
                }
                if (!((ahcu)aisc2).ry((ahci)FlagEndpointOuterClass$FlagEndpoint.flagEndpoint)) {
                    break Label_0069;
                }
            }
            return;
        }
        this.d.c(this.b, this.c);
    }
}
