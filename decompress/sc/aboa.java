// 
// Decompiled by Procyon v0.6.0
// 

final class aboa extends Thread
{
    final aboc a;
    
    public aboa(final aboc a) {
        this.a = a;
        super("playerProxyUnregister");
    }
    
    @Override
    public final void run() {
        while (true) {
            try {
                Thread.sleep(500L);
                final agoe agoe = this.a.a;
                agoe.E(0);
            }
            catch (final InterruptedException ex) {
                final agoe agoe = this.a.a;
                continue;
            }
            finally {
                this.a.a.E(0);
            }
            break;
        }
    }
}
