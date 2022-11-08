// 
// Decompiled by Procyon v0.6.0
// 

final class adgp extends Thread
{
    final /* synthetic */ adgq a;
    
    public adgp(final adgq a) {
        this.a = a;
        super("ANRGuard-Thread");
    }
    
    @Override
    public final void run() {
        this.a.a(-999);
    }
}
