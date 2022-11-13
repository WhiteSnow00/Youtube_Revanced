import android.view.ViewGroup;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpm implements Callable
{
    public final hpo a;
    public final int b;
    public final ViewGroup c;
    public final int d;
    public final int e;
    public final int f;
    
    public hpm(final hpo a, final int b, final ViewGroup c, final int d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final Object call() {
        return this.a.ah.c().am((asjm)new hpn(this.b, this.c, this.d, this.e, this.f, 0));
    }
}
