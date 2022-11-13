import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aakz extends Service implements arln
{
    private volatile arle a;
    private final Object b;
    private boolean c;
    
    public aakz() {
        this.b = new Object();
        this.c = false;
    }
    
    public final arle a() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new arle((Service)this);
                }
            }
        }
        return this.a;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    public final void b() {
        if (!this.c) {
            this.c = true;
            final Object ar = this.aR();
            final BackgroundPlayerService backgroundPlayerService = (BackgroundPlayerService)this;
            final est est = (est)ar;
            backgroundPlayerService.a = (abpq)est.b.ex.a();
            backgroundPlayerService.b = (abms)est.b.pp.a();
            backgroundPlayerService.c = (abjj)est.b.eb.a();
            backgroundPlayerService.d = (aukf)est.b.pF.a();
            backgroundPlayerService.e = (aukf)est.b.pG.a();
            final acxl cf = ((abpu)((adet)est.b.a.a.be.a()).a).cf();
            cf.getClass();
            backgroundPlayerService.f = cf;
            final abrj abrj = (abrj)est.b.ed.a();
        }
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.a();
    }
    
    public void onCreate() {
        this.b();
        super.onCreate();
    }
}
