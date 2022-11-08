import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class gmh extends adrq
{
    final /* synthetic */ gmk a;
    
    public gmh(final gmk a, final Context context, final int n) {
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
