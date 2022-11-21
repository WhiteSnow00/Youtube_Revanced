import android.view.ContentInfo;
import android.view.View;
import android.view.OnReceiveContentListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class amz implements OnReceiveContentListener
{
    private final aly a;
    
    public amz(final aly a) {
        this.a = a;
    }
    
    public final ContentInfo onReceiveContent(final View view, final ContentInfo contentInfo) {
        final alf d = alf.d(contentInfo);
        final alf a = this.a.a(view, d);
        if (a == null) {
            return null;
        }
        if (a == d) {
            return contentInfo;
        }
        return a.c();
    }
}
