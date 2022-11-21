// 
// Decompiled by Procyon v0.6.0
// 

public final class asad implements Runnable
{
    final Runnable a;
    public boolean b;
    public boolean c;
    
    public asad(final Runnable a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (!this.b) {
            this.c = true;
            this.a.run();
        }
    }
}
