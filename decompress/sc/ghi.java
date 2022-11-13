import android.content.Context;
import android.os.Build$VERSION;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class ghi implements tpy
{
    public final Activity a;
    public final boolean b;
    int c;
    
    public ghi(final Activity a) {
        a.getClass();
        this.a = a;
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT <= 27) {
            b = (Build$VERSION.RELEASE.startsWith("P") && b);
        }
        this.b = b;
    }
    
    public final int a() {
        return ger.d(this.a);
    }
    
    public final void d(final int requestedOrientation) {
        this.a.setRequestedOrientation(requestedOrientation);
    }
    
    public final boolean e() {
        return ger.g((Context)this.a);
    }
    
    public final void mW(final boolean b, final int n) {
        this.mx(b, n);
    }
    
    public final void mx(final boolean b, int c) {
        c = 1;
        if (b) {
            c = 2;
        }
        this.c = c;
    }
}
