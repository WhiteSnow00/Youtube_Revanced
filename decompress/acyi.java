import android.content.Context;
import android.webkit.WebView;

// 
// Decompiled by Procyon v0.6.0
// 

final class acyi extends WebView
{
    public acyi(final Context context) {
        super(context);
    }
    
    public final boolean onCheckIsTextEditor() {
        return true;
    }
}
