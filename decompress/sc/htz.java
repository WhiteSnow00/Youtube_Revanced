import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class htz extends huc implements arln
{
    public boolean g;
    private volatile arku h;
    private final Object i;
    
    public htz() {
        this.i = new Object();
        this.g = false;
        ((qt)this).addOnContextAvailableListener((rc)new hty(this));
    }
    
    public final Object aR() {
        return this.p().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
    
    @Override
    public final /* bridge */ arlm lC() {
        return (arlm)this.p();
    }
    
    public final arku p() {
        if (this.h == null) {
            synchronized (this.i) {
                if (this.h == null) {
                    this.h = new arku((Activity)this);
                }
            }
        }
        return this.h;
    }
}
