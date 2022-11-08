import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkr implements adef
{
    private final atjj a;
    private final atjj b;
    
    public jkr(final atjj a, final atjj b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final vtg vtg) {
        final acwg acwg = (acwg)this.a.a();
        final SuggestVideoStateSubscriber suggestVideoStateSubscriber = (SuggestVideoStateSubscriber)this.b.a();
        if (acwg != null) {
            if (suggestVideoStateSubscriber != null) {
                vtg.d = (String)acwg.c;
                vtg.e = (int)acwg.a();
                vtg.g = suggestVideoStateSubscriber.b;
            }
        }
    }
}
