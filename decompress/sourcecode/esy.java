import android.app.Activity;
import com.google.protos.youtube.api.innertube.AgeVerificationEndpointOuterClass$AgeVerificationEndpoint;
import java.util.Map;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.content.Intent;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esy implements vau, szw
{
    public final tdg a;
    private final vax b;
    private final bu c;
    private final Executor d;
    private final zki e;
    private final fai f;
    private final abni g;
    private final xlv h;
    private final ggs i;
    private aioe j;
    private boolean k;
    private final lzi l;
    
    public esy(final vax b, final bu c, final lzi l, final Executor d, final tdg a, final zki e, final fai f, final abni g, final xlv h, final ggs i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.l = l;
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void b(final int n, final int n2, final Intent intent) {
        if (n == 2300) {
            if (this.h.g() != null && this.h.g().a() == 1) {
                if (this.j != null) {
                    final abni g = this.g;
                    final abhx d = PlaybackStartDescriptor.d();
                    d.a = this.j;
                    g.d(d.a());
                }
                this.j = null;
                return;
            }
            this.f.f();
            if (this.k) {
                this.i.N();
                this.k = false;
            }
            final aioe j = this.j;
            if (j != null) {
                this.b.a(j);
            }
            this.j = null;
        }
    }
    
    public final void mE(aioe j, final Map map) {
        if (this.e.t() && j != null) {
            if (((agzd)j).rs((agyr)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.ageVerificationEndpoint)) {
                final AgeVerificationEndpointOuterClass$AgeVerificationEndpoint ageVerificationEndpointOuterClass$AgeVerificationEndpoint = (AgeVerificationEndpointOuterClass$AgeVerificationEndpoint)((agzd)j).rr((agyr)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.ageVerificationEndpoint);
                if ((j = ageVerificationEndpointOuterClass$AgeVerificationEndpoint.c) == null) {
                    j = aioe.a;
                }
                this.j = j;
                this.k = ageVerificationEndpointOuterClass$AgeVerificationEndpoint.d;
                try {
                    this.d.execute((Runnable)new zke((Activity)this.c, this.l.o(this.e.c()), ageVerificationEndpointOuterClass$AgeVerificationEndpoint.b, (trb)new exr(this, 1)));
                }
                catch (final Exception ex) {
                    this.f.f();
                }
            }
        }
    }
}
