// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aeau implements Runnable
{
    public final nmo f;
    
    public aeau() {
        this.f = null;
    }
    
    public aeau(final nmo f, final byte[] array) {
        this.f = f;
    }
    
    protected abstract void a();
    
    public final void b(final Exception ex) {
        final nmo f = this.f;
        if (f != null) {
            f.d(ex);
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
