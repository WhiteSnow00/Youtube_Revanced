import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.SegmentProcessingService;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hdn extends Service implements ariy
{
    private volatile arip a;
    private final Object b;
    private boolean c;
    
    public hdn() {
        this.b = new Object();
        this.c = false;
    }
    
    public final arip a() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new arip(this);
                }
            }
        }
        return this.a;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            this.aR();
            final SegmentProcessingService segmentProcessingService = (SegmentProcessingService)this;
        }
        super.onCreate();
    }
}
