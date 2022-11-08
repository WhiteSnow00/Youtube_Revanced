import android.os.Bundle;
import java.util.function.Function;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.AboutThisAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.AboutThisAdEndpointOuterClass$AboutThisAdEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbv implements vau
{
    public saz a;
    public skm b;
    private final tdz c;
    private final Executor d;
    private final bu e;
    private final wwu f;
    private final abno g;
    
    public fbv(final shw shw, final tdz c, final bu e, final wwu f, final abno g, final Executor d) {
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.d = d;
        shw.b((shu)new ghv(this, 1));
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (((agzd)aioe).rs((agyr)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.aboutThisAdEndpoint)) {
            anss anss;
            if ((anss = ((AboutThisAdEndpointOuterClass$AboutThisAdEndpoint)((agzd)aioe).rr((agyr)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.aboutThisAdEndpoint)).c) == null) {
                anss = anss.a;
            }
            if (((agzd)anss).rs((agyr)AboutThisAdRendererOuterClass.aboutThisAdRenderer)) {
                final AboutThisAdEndpointOuterClass$AboutThisAdEndpoint aboutThisAdEndpointOuterClass$AboutThisAdEndpoint = (AboutThisAdEndpointOuterClass$AboutThisAdEndpoint)((agzd)aioe).rr((agyr)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.aboutThisAdEndpoint);
                boolean b;
                if (this.g.f()) {
                    this.g.a();
                    b = false;
                }
                else {
                    b = true;
                }
                this.b = (skm)new skq(new skp(aboutThisAdEndpointOuterClass$AboutThisAdEndpoint, b, Optional.ofNullable(m).map((Function)fan.c)), this.a, this.c, this.d, this.g);
                anss anss2;
                if ((anss2 = aboutThisAdEndpointOuterClass$AboutThisAdEndpoint.c) == null) {
                    anss2 = anss.a;
                }
                final ahgh ahgh = (ahgh)((agzd)anss2).rr((agyr)AboutThisAdRendererOuterClass.aboutThisAdRenderer);
                final skm b2 = this.b;
                final wwv n = this.f.n();
                final Bundle bundle = new Bundle();
                final sko sko = new sko();
                bundle.putByteArray("about_this_ad_renderer", ahgh.toByteArray());
                sko.ag(bundle);
                sko.af = n;
                sko.ae = b2;
                sko.r(this.e.getSupportFragmentManager(), "AboutThisAdWebViewDialogFragment");
                return;
            }
        }
        zjp.b(zjo.b, zjn.a, "Rendering data missing for AboutThisAdCommand");
    }
}
