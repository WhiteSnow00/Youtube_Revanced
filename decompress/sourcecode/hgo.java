import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hgo
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private final int e;
    
    public hgo(final Context context) {
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168884);
        this.e = dimensionPixelSize;
        this.c = context.getResources().getDimensionPixelSize(2131168885);
        this.a = context.getResources().getDimensionPixelSize(2131168890) - dimensionPixelSize;
        this.b = context.getResources().getDimensionPixelSize(2131168888) - dimensionPixelSize;
        this.d = tmy.cn(context, 2130970864);
    }
    
    protected int a(final Object o) {
        throw null;
    }
    
    protected abstract hgq b(final Object p0, final int p1);
    
    protected aexq c(final Object o) {
        throw null;
    }
}
