import com.google.android.apps.youtube.embeddedplayer.service.model.AutoValue_VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetailsExpanded;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetailsCollapsed;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpp
{
    public Object a;
    public Object b;
    
    public final mpq a() {
        if (this.a == null) {
            this.a = new aggc(1);
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new mpq((msa)this.a, (Looper)this.b);
    }
    
    public final void b(final msa a) {
        kgk.aX((Object)a, (Object)"StatusExceptionMapper must not be null.");
        this.a = a;
    }
    
    public final VideoDetails c() {
        if (this.b != null && this.a != null) {
            return (VideoDetails)new AutoValue_VideoDetails((VideoDetailsCollapsed)this.b, (VideoDetailsExpanded)this.a);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" videoDetailsCollapsed");
        }
        if (this.a == null) {
            sb.append(" videoDetailsExpanded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void d(final VideoDetailsCollapsed b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null videoDetailsCollapsed");
    }
    
    public final void e(final VideoDetailsExpanded a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null videoDetailsExpanded");
    }
    
    public final void f(final aheg b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null apiAccess");
    }
}
