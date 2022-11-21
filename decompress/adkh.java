// 
// Decompiled by Procyon v0.6.0
// 

final class adkh extends Thread
{
    final adki a;
    
    public adkh(final adki a) {
        this.a = a;
        super("ANRGuard-Thread");
    }
    
    @Override
    public final void run() {
        this.a.a(-999);
    }
}
