import android.view.ContentInfo;
import android.view.View;
import android.view.OnReceiveContentListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class amy implements OnReceiveContentListener
{
    private final alx a;
    
    public amy(final alx a) {
        this.a = a;
    }
    
    public final ContentInfo onReceiveContent(final View view, final ContentInfo contentInfo) {
        final ale d = ale.d(contentInfo);
        final ale a = this.a.a(view, d);
        if (a == null) {
            return null;
        }
        if (a == d) {
            return contentInfo;
        }
        return a.c();
    }
}
