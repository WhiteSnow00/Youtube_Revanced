import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnp extends swu
{
    private final aeyr a;
    private final aeyr b;
    
    public gnp(final Context context, final sxe sxe, final vax vax, final wwv wwv, final fzo fzo, final aeby aeby, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context, sxe, vax, wwv, aeby, (byte[])null, (byte[])null, (byte[])null);
        this.a = agnj.E((aeyr)new bnh(this, fzo, 4, (byte[])null, (byte[])null, (byte[])null));
        this.b = agnj.E((aeyr)new bnh(this, fzo, 5, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void mE(final aioe aioe, final Map map) {
        aoyd aoyd;
        if ((aoyd = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint)((agzd)aioe).rr((agyr)UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b) == null) {
            aoyd = aoyd.a;
        }
        final int b = aoyd.b;
        if (b == 127046814) {
            ((eyv)this.a.a()).mE(aioe, map);
            return;
        }
        if (b == 127387931) {
            ((eyv)this.b.a()).mE(aioe, map);
            return;
        }
        super.mE(aioe, map);
    }
}
