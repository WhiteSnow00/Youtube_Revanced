import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class aawm extends fa implements arln
{
    public boolean a;
    private volatile arku b;
    private final Object c;
    
    public aawm() {
        this.c = new Object();
        this.a = false;
        ((qt)this).addOnContextAvailableListener((rc)new xga(this, 7));
    }
    
    public final arku a() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new arku((Activity)this);
                }
            }
        }
        return this.b;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
    
    @Override
    public final /* bridge */ arlm lC() {
        return (arlm)this.a();
    }
}
