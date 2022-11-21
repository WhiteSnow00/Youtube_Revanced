import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class acwe extends acwf
{
    final bu a;
    
    public acwe(final bu a) {
        this.a = a;
    }
    
    public final Activity a() {
        return (Activity)this.a;
    }
    
    public final cl b() {
        return this.a.getSupportFragmentManager();
    }
    
    public final void c(final String[] array, final int n) {
        this.a.requestPermissions(array, n);
    }
}
