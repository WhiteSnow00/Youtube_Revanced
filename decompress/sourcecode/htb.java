import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class htb extends hth implements ariy
{
    public boolean N;
    private volatile arif g;
    private final Object h;
    
    public htb() {
        this.h = new Object();
        this.N = false;
        ((qt)this).addOnContextAvailableListener((rc)new hta(this));
    }
    
    public final Object aR() {
        return this.z().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final arif z() {
        if (this.g == null) {
            synchronized (this.h) {
                if (this.g == null) {
                    this.g = new arif((Activity)this);
                }
            }
        }
        return this.g;
    }
}
