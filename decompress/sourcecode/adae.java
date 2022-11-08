import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import android.support.v7.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class adae extends LinearLayoutManager
{
    final /* synthetic */ adam a;
    
    public adae(final adam a) {
        this.a = a;
    }
    
    public final boolean af() {
        final AnchorableTopPeekingScrollView ai = this.a.ai;
        return ai.n || ai.getScrollY() == ((TopPeekingScrollView)ai).k;
    }
}
