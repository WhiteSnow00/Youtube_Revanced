import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczg implements znj
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;
    
    public aczg(final aczj a, final aioe b, final List c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aczg(final fcz c, final aczh a, final aczi b, final int d, final byte[] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aczg(final vwq a, final apec b, final aslc c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final dbi dbi) {
        final int d = this.d;
        if (d == 0) {
            ((tny)((fcz)this.c).e).e((Throwable)dbi);
            final Object b = this.b;
            if (b != null) {
                ((aczi)b).c();
            }
            return;
        }
        if (d != 1) {
            final Object a = this.a;
            if (a != null) {
                ((aczj)a).b(((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint)((agzd)this.b).rr((agyr)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint)).b);
            }
            return;
        }
        final Object c = ((vwq)this.a).c;
        aioe aioe;
        if ((aioe = ((apec)this.b).f) == null) {
            aioe = aioe.a;
        }
        ((vax)c).a(aioe);
        ((aslc)this.c).b((Throwable)dbi);
    }
}
