// 
// Decompiled by Procyon v0.6.0
// 

final class bde extends Thread
{
    final /* synthetic */ bdf a;
    
    public bde(final bdf a) {
        this.a = a;
        super("ExoPlayer:SimpleDecoder");
    }
    
    @Override
    public final void run() {
        final bdf a = this.a;
        try {
            while (a.m()) {}
        }
        catch (final InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
