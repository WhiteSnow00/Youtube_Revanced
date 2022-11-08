import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izn extends akv
{
    private final String a;
    private final String b;
    
    public izn(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void c(final View view, final aol aol) {
        super.c(view, aol);
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(", ");
        sb.append(b);
        aol.u((CharSequence)sb.toString());
    }
}
