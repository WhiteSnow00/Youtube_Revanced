import android.app.Application;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arny implements arog
{
    private final Service a;
    private Object b;
    
    public arny(final Service a) {
        this.a = a;
    }
    
    @Override
    public final Object aR() {
        if (this.b == null) {
            final Application application = this.a.getApplication();
            areq.v(application instanceof arog, "Sting service must be attached to an @Sting Application. Found: %s", application.getClass());
            final hzv ae = ((arnx)aqvs.i((Object)application, (Class)arnx.class)).Ae();
            arxu.o(ae.a = this.a, Service.class);
            this.b = new esv((era)ae.b, (Service)ae.a);
        }
        return this.b;
    }
}
