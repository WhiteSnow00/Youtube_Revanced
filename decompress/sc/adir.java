// 
// Decompiled by Procyon v0.6.0
// 

final class adir extends Thread
{
    final adis a;
    
    public adir(final adis a) {
        this.a = a;
        super("ANRGuard-Thread");
    }
    
    @Override
    public final void run() {
        this.a.a(-999);
    }
}
