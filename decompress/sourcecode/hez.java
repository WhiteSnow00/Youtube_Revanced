import com.google.android.apps.youtube.app.common.ui.bottomui.DefaultHatsController;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hez
{
    public final /* synthetic */ Object a = a;
    public final /* synthetic */ Object b = b;
    
    public hez(final abns a, final arhr b) {
        this.a = a;
        this.b = b;
    }
    
    public hez(final actk b, final Object a) {
        this.b = b;
        this.a = a;
    }
    
    public hez(final arhr a, final otd b) {
        this.a = a;
        this.b = b;
    }
    
    public hez(final DefaultHatsController b, final gbu a) {
        this.b = b;
        this.a = a;
    }
    
    public hez(final hcn a, final tzg b) {
        this.a = a;
        this.b = b;
    }
    
    public hez(final hfc b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    public hez(final String a, final fua b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        ((hfc)this.b).r.v(6, (Context)this.a);
        ((hfc)this.b).c();
    }
    
    public final void b(final Exception ex) {
        ((hfc)this.b).r.w(5, (Context)this.a, ex);
        ((hfc)this.b).c();
    }
    
    public final void c(final aioe aioe) {
        if (aioe == null) {
            return;
        }
        ((DefaultHatsController)this.b).t((gbu)this.a, aioe);
        final DefaultHatsController defaultHatsController = (DefaultHatsController)this.b;
        defaultHatsController.a.c(aioe, defaultHatsController.c);
    }
    
    public final void d(final int n) {
        ((actk)this.b).a(this.a, n);
    }
    
    public final void e() {
        ((actk)this.b).mv(this.a);
    }
}
