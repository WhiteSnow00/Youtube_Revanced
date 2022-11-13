// 
// Decompiled by Procyon v0.6.0
// 

public final class dfl
{
    private final dgv a;
    private volatile dgw b;
    
    public dfl(final dgv a) {
        this.a = a;
    }
    
    public final dgw a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.a();
                }
                if (this.b == null) {
                    this.b = new dgy();
                }
            }
        }
        return this.b;
    }
}
