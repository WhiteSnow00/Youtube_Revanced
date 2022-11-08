import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class htd extends hth implements ariy
{
    public boolean g;
    private volatile arif h;
    private final Object i;
    
    public htd() {
        this.i = new Object();
        this.g = false;
        ((qt)this).addOnContextAvailableListener((rc)new htc(this));
    }
    
    public final Object aR() {
        return this.p().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final arif p() {
        if (this.h == null) {
            synchronized (this.i) {
                if (this.h == null) {
                    this.h = new arif((Activity)this);
                }
            }
        }
        return this.h;
    }
}
