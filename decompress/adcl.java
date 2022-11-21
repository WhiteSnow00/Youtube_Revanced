import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcl extends acph implements adci, adet
{
    public final Context a;
    public final adcp b;
    public final acqv c;
    public final veh d;
    private final acmr e;
    private final List f;
    
    public adcl(final apco apco, final Context a, final adcp b, final acqv c, final veh d) {
        this.f = new ArrayList();
        final acmr e = new acmr();
        (this.e = e).nf((acma)new fvh(7));
        e.nf((acma)new fvh(8));
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        for (final anxb anxb : apco.b) {
            if (((ahcu)anxb).ry((ahci)ButtonRendererOuterClass.buttonRenderer)) {
                final aies aies = (aies)((ahcu)anxb).rx((ahci)ButtonRendererOuterClass.buttonRenderer);
                this.f.add(aies);
                this.e.add((Object)aies);
            }
        }
        b.i(true);
    }
    
    public final acla a() {
        return this.e;
    }
    
    @Override
    public final void d(final List list) {
    }
    
    @Override
    public final void e(final acmh acmh) {
        acmh.f(aies.class, (acmf)new hyd(this, 18));
    }
}
