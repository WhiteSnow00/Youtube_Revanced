import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jls implements adgh
{
    private final atke a;
    private final atke b;
    
    public jls(final atke a, final atke b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final vvh vvh) {
        final acyi acyi = (acyi)this.a.a();
        final SuggestVideoStateSubscriber suggestVideoStateSubscriber = (SuggestVideoStateSubscriber)this.b.a();
        if (acyi != null) {
            if (suggestVideoStateSubscriber != null) {
                vvh.d = (String)acyi.c;
                vvh.e = (int)acyi.a();
                vvh.g = suggestVideoStateSubscriber.b;
            }
        }
    }
}
