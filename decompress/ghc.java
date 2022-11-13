import android.app.Application$ActivityLifecycleCallbacks;
import java.util.Map;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghc implements tnd
{
    public final Object a;
    private final int b;
    
    public ghc(final Application a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghc(final aui a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghc(final cgi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghc(final ghb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Object o) {
        final int b = this.b;
        if (b == 0) {
            ((ghb)this.a).p((gha)o);
            return;
        }
        if (b == 1) {
            final Object a = this.a;
            final Map.Entry entry = (Map.Entry)o;
            ((cgi)a).c((String)entry.getKey(), (cgh)entry.getValue());
            return;
        }
        if (b != 2) {
            ((aui)this.a).b((aum)o);
            return;
        }
        ((Application)this.a).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)o);
    }
}
