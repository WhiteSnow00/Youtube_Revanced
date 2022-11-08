import android.app.Dialog;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class bh extends bw
{
    final /* synthetic */ bw a;
    final /* synthetic */ bi b;
    
    public bh(final bi b, final bw a) {
        this.b = b;
        this.a = a;
    }
    
    public final View a(final int n) {
        final bw a = this.a;
        if (a.b()) {
            return a.a(n);
        }
        final Dialog d = this.b.d;
        if (d != null) {
            return d.findViewById(n);
        }
        return null;
    }
    
    public final boolean b() {
        return this.a.b() || this.b.e;
    }
}
