import com.google.android.apps.youtube.app.extensions.mediabrowser.impl.MainAppMediaBrowserService;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gtu extends axc implements ariy
{
    private volatile arip f;
    private final Object g;
    private boolean h;
    
    public gtu() {
        this.g = new Object();
        this.h = false;
    }
    
    public final Object aR() {
        return this.f().aR();
    }
    
    public final arip f() {
        if (this.f == null) {
            synchronized (this.g) {
                if (this.f == null) {
                    this.f = new arip((Service)this);
                }
            }
        }
        return this.f;
    }
    
    public void onCreate() {
        if (!this.h) {
            this.h = true;
            final Object ar = this.aR();
            final MainAppMediaBrowserService mainAppMediaBrowserService = (MainAppMediaBrowserService)this;
            final esq esq = (esq)ar;
            mainAppMediaBrowserService.f = (gtv)esq.b.iP.a();
            final eqv b = esq.b;
            mainAppMediaBrowserService.g = b.bt;
            mainAppMediaBrowserService.h = b.po;
        }
        super.onCreate();
    }
}
