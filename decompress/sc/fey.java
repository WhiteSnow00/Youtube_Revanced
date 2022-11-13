import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fey extends fyu
{
    final fez a;
    
    public fey(final fez a) {
        this.a = a;
    }
    
    public final void onActivityStarted(final Activity activity) {
        final fez a = this.a;
        if (a.e == -1L) {
            a.a();
        }
    }
}
