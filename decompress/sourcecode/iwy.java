import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwy implements abnq
{
    public final abzk a;
    public final acae b;
    public final acij c;
    public final wwv d;
    public FrameLayout e;
    private final asho f;
    
    public iwy(final abzk a, final acae b, final asho f, final wwv d) {
        final acij c = new acij();
        this.c = c;
        this.a = a;
        this.b = b;
        this.f = f;
        ((wwx)c).a(this.d = d);
    }
    
    public final void a() {
        final FrameLayout e = this.e;
        if (e != null) {
            e.removeAllViews();
            this.e.setVisibility(8);
        }
        this.a.c((acir)null);
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { abns.Q().P(this.f).am((asix)new iws(this, 4), (asix)iwn.e), ((asgt)abns.q().c).am((asix)new iws(this, 5), (asix)iwn.e) };
    }
}
