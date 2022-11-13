import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import android.support.v7.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class adci extends LinearLayoutManager
{
    final adcp a;
    
    public adci(final adcp a) {
        this.a = a;
    }
    
    public final boolean af() {
        final AnchorableTopPeekingScrollView ai = this.a.ai;
        return ai.n || ai.getScrollY() == ai.k;
    }
}
