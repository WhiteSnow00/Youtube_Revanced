import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aamv extends Service implements aroh
{
    private volatile arny a;
    private final Object b;
    private boolean c;
    
    public aamv() {
        this.b = new Object();
        this.c = false;
    }
    
    public final arny a() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new arny(this);
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
            final esv esv = (esv)ar;
            backgroundPlayerService.a = (abqv)esv.b.ey.a();
            backgroundPlayerService.b = (abny)esv.b.oH.a();
            backgroundPlayerService.c = (abkq)esv.b.ed.a();
            backgroundPlayerService.d = (auna)esv.b.oX.a();
            backgroundPlayerService.e = (auna)esv.b.oY.a();
            final acyy ch = ((abqz)((adgg)esv.b.a.a.bh.a()).a).ch();
            ch.getClass();
            backgroundPlayerService.f = ch;
            final absv absv = (absv)esv.b.ef.a();
        }
    }
    
    public final /* bridge */ arog lC() {
        return this.a();
    }
    
    public void onCreate() {
        this.b();
        super.onCreate();
    }
}
