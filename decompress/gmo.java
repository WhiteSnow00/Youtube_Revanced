import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class gmo extends adts
{
    final gmr a;
    
    public gmo(final gmr a, final Context context, final int n) {
        this.a = a;
        super(context, n);
    }
    
    public final void onBackPressed() {
        if (this.a.af == null) {
            super.onBackPressed();
        }
        if (this.a.af.canGoBack()) {
            this.a.af.goBack();
            return;
        }
        super.onBackPressed();
    }
}
