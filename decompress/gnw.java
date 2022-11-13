import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnw extends sza
{
    private final afaq a;
    private final afaq b;
    
    public gnw(final Context context, final szk szk, final vcy vcy, final wyw wyw, final fzw fzw, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context, szk, vcy, wyw, aeea, (byte[])null, (byte[])null, (byte[])null);
        this.a = adyf.A((afaq)new bni(this, fzw, 4, null, null, null));
        this.b = adyf.A((afaq)new bni(this, fzw, 5, null, null, null));
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        apah apah;
        if ((apah = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint)((ahbc)aiqj).rx((ahaq)UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b) == null) {
            apah = apah.a;
        }
        final int b = apah.b;
        if (b == 127046814) {
            ((eyz)this.a.a()).mE(aiqj, map);
            return;
        }
        if (b == 127387931) {
            ((eyz)this.b.a()).mE(aiqj, map);
            return;
        }
        super.mE(aiqj, map);
    }
}
