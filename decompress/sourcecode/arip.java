import android.app.Application;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arip implements arix
{
    private final Service a;
    private Object b;
    
    public arip(final Service a) {
        this.a = a;
    }
    
    public final Object aR() {
        if (this.b == null) {
            final Application application = this.a.getApplication();
            aqqn.l(application instanceof arix, "Sting service must be attached to an @Sting Application. Found: %s", new Object[] { application.getClass() });
            final hyq zq = ((ario)aqqm.k((Object)application, (Class)ario.class)).zq();
            aqzg.z(zq.a = this.a, (Class)Service.class);
            this.b = new esq((eqv)zq.b, (Service)zq.a);
        }
        return this.b;
    }
}
