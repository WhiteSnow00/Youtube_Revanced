// 
// Decompiled by Procyon v0.6.0
// 

public class arhl
{
    protected int a;
    protected double b;
    
    public arhl() {
        this.a = 0;
        this.b = 0.0;
    }
    
    public final double a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public int b() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public void c(final int n) {
    }
    
    public void d(final int a, final double b) {
        synchronized (this) {
            this.a = a;
            this.b = b;
        }
    }
}
