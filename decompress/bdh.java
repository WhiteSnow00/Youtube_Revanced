// 
// Decompiled by Procyon v0.6.0
// 

final class bdh extends Thread
{
    final bdi a;
    
    public bdh(final bdi a) {
        this.a = a;
        super("ExoPlayer:SimpleDecoder");
    }
    
    @Override
    public final void run() {
        final bdi a = this.a;
        try {
            while (a.m()) {}
        }
        catch (final InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
