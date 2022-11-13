import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class jau extends oj
{
    public jau(final Context context) {
        super(context);
    }
    
    protected final int b(final int n) {
        return super.b(n) * 3;
    }
    
    public final int g(final int n, int n2, final int n3, final int n4, final int n5) {
        n2 = (n2 - n) / 2;
        return n3 + (n4 - n3) / 2 - (n + n2);
    }
}
