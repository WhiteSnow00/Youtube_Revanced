import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class gzy extends akw
{
    final gzz a;
    
    public gzy(final gzz a) {
        this.a = a;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        if (view == this.a.b) {
            aom.N();
            String s;
            if (this.a.a.ah()) {
                s = this.a.d;
            }
            else {
                s = this.a.c;
            }
            aom.u((CharSequence)s);
        }
    }
}
