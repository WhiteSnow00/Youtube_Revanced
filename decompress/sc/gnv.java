import com.google.protobuf.MessageLite;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnv implements fcm
{
    public static final gnv a;
    public static final gnv b;
    public static final gnv c;
    public static final gnv d;
    private final int e;
    
    static {
        d = new gnv(5);
        c = new gnv(4);
        b = new gnv(3);
        a = new gnv(2);
    }
    
    public gnv(final int e) {
        this.e = e;
    }
    
    public final bi a(final aiqj aiqj) {
        final int e = this.e;
        if (e == 0) {
            apah apah;
            if ((apah = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint)((ahbc)aiqj).rx((ahaq)UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b) == null) {
                apah = apah.a;
            }
            apai a;
            if (apah.b == 127387931) {
                a = (apai)apah.c;
            }
            else {
                a = apai.a;
            }
            return tbh.u(a);
        }
        if (e == 1) {
            apah apah2;
            if ((apah2 = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint)((ahbc)aiqj).rx((ahaq)UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b) == null) {
                apah2 = apah.a;
            }
            apaj a2;
            if (apah2.b == 127046814) {
                a2 = (apaj)apah2.c;
            }
            else {
                a2 = apaj.a;
            }
            a2.getClass();
            final szt szt = new szt();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("UnlimitedFamilyProfileInterstitialRenderer", ((agzk)a2).toByteArray());
            szt.ag(bundle);
            return (bi)szt;
        }
        if (e == 2) {
            final int a3 = jsg.a;
            return (bi)new jsk();
        }
        if (e == 3) {
            return (bi)new tbk();
        }
        if (e != 4) {
            return (bi)adbx.aK(aiqj);
        }
        final adch adch = new adch();
        final Bundle bundle2 = new Bundle();
        adyf.aA(bundle2, "scan_code_endpoint", (MessageLite)aiqj);
        adch.ag(bundle2);
        return (bi)adch;
    }
}
