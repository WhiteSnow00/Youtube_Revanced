// 
// Decompiled by Procyon v0.6.0
// 

public final class afxu implements Runnable
{
    final Runnable a;
    private final int b;
    
    public afxu(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (this.b != 0) {
            this.a.run();
            return;
        }
        this.a.run();
    }
    
    @Override
    public final String toString() {
        if (this.b != 0) {
            return this.a.toString();
        }
        return this.a.toString();
    }
}
