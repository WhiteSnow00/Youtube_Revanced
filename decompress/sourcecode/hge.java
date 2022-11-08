import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class hge extends fa implements ariy
{
    public boolean a;
    private volatile arif b;
    private final Object c;
    
    public hge() {
        this.c = new Object();
        this.a = false;
        this.addOnContextAvailableListener((rc)new qn(this, 17));
    }
    
    public final arif a() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new arif((Activity)this);
                }
            }
        }
        return this.b;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
}
