import android.app.Activity;
import com.google.protos.youtube.api.innertube.AgeVerificationEndpointOuterClass$AgeVerificationEndpoint;
import java.util.Map;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.content.Intent;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etb implements vcv, tcb
{
    public final vwa a;
    private final vcy b;
    private final bu c;
    private final Executor d;
    private final zmf e;
    private final fam f;
    private final abpl g;
    private final xnt h;
    private final ghb i;
    private aiqj j;
    private boolean k;
    private final man l;
    
    public etb(final vcy b, final bu c, final man l, final Executor d, final vwa a, final zmf e, final fam f, final abpl g, final xnt h, final ghb i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
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
                    final abpl g = this.g;
                    final abjp d = PlaybackStartDescriptor.d();
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
            final aiqj j = this.j;
            if (j != null) {
                this.b.a(j);
            }
            this.j = null;
        }
    }
    
    public final void mE(aiqj j, final Map map) {
        if (this.e.t() && j != null) {
            if (((ahbc)j).ry((ahaq)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.ageVerificationEndpoint)) {
                final AgeVerificationEndpointOuterClass$AgeVerificationEndpoint ageVerificationEndpointOuterClass$AgeVerificationEndpoint = (AgeVerificationEndpointOuterClass$AgeVerificationEndpoint)((ahbc)j).rx((ahaq)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.ageVerificationEndpoint);
                if ((j = ageVerificationEndpointOuterClass$AgeVerificationEndpoint.c) == null) {
                    j = aiqj.a;
                }
                this.j = j;
                this.k = ageVerificationEndpointOuterClass$AgeVerificationEndpoint.d;
                try {
                    this.d.execute((Runnable)new zmb((Activity)this.c, this.l.F(this.e.c()), ageVerificationEndpointOuterClass$AgeVerificationEndpoint.b, (ttg)new exv(this, 1)));
                }
                catch (final Exception ex) {
                    this.f.f();
                }
            }
        }
    }
}
