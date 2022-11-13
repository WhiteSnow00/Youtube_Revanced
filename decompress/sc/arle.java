import android.app.Application;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arle implements arlm
{
    private final Service a;
    private Object b;
    
    public arle(final Service a) {
        this.a = a;
    }
    
    public final Object aR() {
        if (this.b == null) {
            final Application application = this.a.getApplication();
            aqsz.l(application instanceof arlm, "Sting service must be attached to an @Sting Application. Found: %s", new Object[] { application.getClass() });
            final hzm zv = ((arld)aqsy.k((Object)application, (Class)arld.class)).zv();
            arbu.y(zv.a = this.a, Service.class);
            this.b = new est((eqy)zv.b, (Service)zv.a);
        }
        return this.b;
    }
}
