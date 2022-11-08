import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class gqf extends fa implements ariy
{
    private volatile arif a;
    private final Object b;
    public boolean d;
    
    public gqf() {
        this.b = new Object();
        this.d = false;
        this.addOnContextAvailableListener((rc)new qn(this, 12));
    }
    
    public final Object aR() {
        return this.b().aR();
    }
    
    public final arif b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new arif((Activity)this);
                }
            }
        }
        return this.a;
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
}
