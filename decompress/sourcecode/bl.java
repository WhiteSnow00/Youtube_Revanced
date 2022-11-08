import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class bl extends bw
{
    final /* synthetic */ br a;
    
    public bl(final br a) {
        this.a = a;
    }
    
    public final View a(final int n) {
        final View o = this.a.O;
        if (o != null) {
            return o.findViewById(n);
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this.a);
        sb.append(" does not have a view");
        throw new IllegalStateException(sb.toString());
    }
    
    public final boolean b() {
        return this.a.O != null;
    }
}
