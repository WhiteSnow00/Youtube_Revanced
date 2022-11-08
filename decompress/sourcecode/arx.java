import android.net.Uri;
import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class arx extends ContentObserver
{
    final /* synthetic */ ary a;
    
    public arx(final ary a, final Handler handler) {
        this.a = a;
        super(handler);
    }
    
    public final void onChange(final boolean b, final Uri uri) {
        this.a.a();
    }
}
