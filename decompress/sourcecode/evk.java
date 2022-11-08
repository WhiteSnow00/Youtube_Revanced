// 
// Decompiled by Procyon v0.6.0
// 

public class evk extends qlw implements ariy
{
    private volatile arif a;
    private final Object b;
    
    public evk() {
        this.b = new Object();
        ((qt)this).addOnContextAvailableListener((rc)new qn(this, 2));
    }
    
    public final arif a() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = this.b();
                }
            }
        }
        return this.a;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    protected arif b() {
        throw null;
    }
    
    public void d() {
        throw null;
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
}
