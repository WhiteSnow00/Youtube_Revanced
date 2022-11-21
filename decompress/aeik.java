import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.youtube.api.service.YouTubeService;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aeik extends Service implements aroh
{
    private volatile arny a;
    private final Object b;
    private boolean c;
    
    public aeik() {
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
    
    public final /* bridge */ arog lC() {
        return this.a();
    }
    
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            final Object ar = this.aR();
            final YouTubeService youTubeService = (YouTubeService)this;
            final esv esv = (esv)ar;
            youTubeService.b = (c)esv.ai.a();
            youTubeService.a = esv.aj;
        }
        super.onCreate();
    }
}
