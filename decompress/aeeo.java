// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aeeo implements Runnable
{
    public final noj f;
    
    public aeeo() {
        this.f = null;
    }
    
    public aeeo(final noj f, final byte[] array) {
        this.f = f;
    }
    
    protected abstract void a();
    
    public final void b(final Exception ex) {
        final noj f = this.f;
        if (f != null) {
            f.c(ex);
        }
    }
    
    @Override
    public final void run() {
        try {
            this.a();
        }
        catch (final Exception ex) {
            this.b(ex);
        }
    }
}
