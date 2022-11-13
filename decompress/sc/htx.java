import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class htx extends huc implements arln
{
    public boolean N;
    private volatile arku g;
    private final Object h;
    
    public htx() {
        this.h = new Object();
        this.N = false;
        ((qt)this).addOnContextAvailableListener((rc)new htw(this));
    }
    
    public final Object aR() {
        return this.z().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
    
    @Override
    public final /* bridge */ arlm lC() {
        return (arlm)this.z();
    }
    
    public final arku z() {
        if (this.g == null) {
            synchronized (this.h) {
                if (this.g == null) {
                    this.g = new arku((Activity)this);
                }
            }
        }
        return this.g;
    }
}
