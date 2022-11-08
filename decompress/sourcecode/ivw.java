import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivw implements abcj
{
    public final atir a;
    public final atir b;
    public final atir c;
    
    public ivw() {
        this.a = atir.e();
        this.b = atir.e();
        this.c = atir.e();
    }
    
    @Override
    public final void a(final View$OnClickListener view$OnClickListener) {
        this.c.tr((Object)view$OnClickListener);
    }
    
    @Override
    public final void b(final CharSequence charSequence) {
        this.b.tr((Object)charSequence);
    }
    
    @Override
    public final void c(final int n) {
        this.a.tr((Object)n);
    }
}
