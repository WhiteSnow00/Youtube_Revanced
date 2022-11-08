import android.net.Uri;
import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class ofm extends ContentObserver
{
    final /* synthetic */ ofn a;
    
    public ofm(final ofn a, final Handler handler) {
        this.a = a;
        super(handler);
    }
    
    public final void onChange(final boolean b, final Uri uri) {
        this.a.b();
    }
}
