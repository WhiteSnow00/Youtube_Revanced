import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class aeii extends bu implements aroh
{
    public boolean a;
    private volatile arno b;
    private final Object c;
    
    public aeii() {
        this.c = new Object();
        this.a = false;
        ((qu)this).addOnContextAvailableListener((rd)new xhj(this, 8));
    }
    
    public final Object aR() {
        return this.d().aR();
    }
    
    public final arno d() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new arno((Activity)this);
                }
            }
        }
        return this.b;
    }
    
    public final avs getDefaultViewModelProviderFactory() {
        return areq.z((qu)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arog lC() {
        return this.d();
    }
}
