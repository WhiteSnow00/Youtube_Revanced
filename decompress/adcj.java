import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcj extends acph implements adci
{
    public final veh a;
    public final apck b;
    public final acmr c;
    private final Context d;
    
    public adcj(final apck b, final Context d, final veh a) {
        this.d = d;
        this.a = a;
        this.b = b;
        (this.c = new acmr()).add((Object)b);
    }
    
    @Override
    public final acla a() {
        return this.c;
    }
    
    @Override
    public final void d(final List list) {
    }
    
    @Override
    public final void e(final acmh acmh) {
        acmh.f(apck.class, (acmf)new ete(this.d, this, 17));
    }
}
