import java.util.List;
import java.util.Map;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CreateTimeDelayedEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpc implements Runnable
{
    final TimeDelayedEndpoint$CreateTimeDelayedEndpoint a;
    final Map b;
    final String c;
    final /* synthetic */ eyv d;
    
    public gpc(final eyv d, final TimeDelayedEndpoint$CreateTimeDelayedEndpoint a, final Map b, final String c, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        vem.f((vax)this.d.a, (List)this.a.e, this.b);
        vem.f((vax)this.d.a, (List)this.a.g, this.b);
        final Object a = this.d.a;
        aioe aioe;
        if ((aioe = this.a.f) == null) {
            aioe = aioe.a;
        }
        ((vax)a).c(aioe, this.b);
        ((Map<Object, Object>)this.d.b).remove(this.c);
    }
}
