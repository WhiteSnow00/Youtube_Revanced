// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jmz extends jnk implements ariy
{
    public boolean a;
    private volatile arif b;
    private final Object c;
    
    public jmz() {
        this.c = new Object();
        this.a = false;
        ((qt)this).addOnContextAvailableListener((rc)new jln(this, 2));
    }
    
    public final Object aR() {
        return this.d().aR();
    }
    
    public final arif d() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = this.e();
                }
            }
        }
        return this.b;
    }
    
    protected arif e() {
        throw null;
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.p((qt)this, super.getDefaultViewModelProviderFactory());
    }
}
