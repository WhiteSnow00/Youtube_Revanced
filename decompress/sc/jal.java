import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jal extends akw
{
    private final String a;
    private final String b;
    
    public jal(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(", ");
        sb.append(b);
        aom.u(sb.toString());
    }
}
