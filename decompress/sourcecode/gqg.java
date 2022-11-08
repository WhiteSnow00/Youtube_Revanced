// 
// Decompiled by Procyon v0.6.0
// 

public class gqg extends qlw implements ariy
{
    public boolean a;
    private volatile arif b;
    private final Object c;
    
    public gqg() {
        this.c = new Object();
        this.a = false;
        ((qt)this).addOnContextAvailableListener((rc)new qn(this, 13));
    }
    
    public final arif a() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = this.b();
                }
            }
        }
        return this.b;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    protected arif b() {
        throw null;
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
}
