import com.google.android.apps.youtube.app.extensions.mediabrowser.impl.MainAppMediaBrowserService;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gud extends axd implements arln
{
    private volatile arle f;
    private final Object g;
    private boolean h;
    
    public gud() {
        this.g = new Object();
        this.h = false;
    }
    
    public final Object aR() {
        return this.f().aR();
    }
    
    public final arle f() {
        if (this.f == null) {
            synchronized (this.g) {
                if (this.f == null) {
                    this.f = new arle((Service)this);
                }
            }
        }
        return this.f;
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.f();
    }
    
    public void onCreate() {
        if (!this.h) {
            this.h = true;
            final Object ar = this.aR();
            final MainAppMediaBrowserService mainAppMediaBrowserService = (MainAppMediaBrowserService)this;
            final est est = (est)ar;
            mainAppMediaBrowserService.f = (gue)est.b.iT.a();
            final eqy b = est.b;
            mainAppMediaBrowserService.g = b.bt;
            mainAppMediaBrowserService.h = b.pp;
        }
        super.onCreate();
    }
}
