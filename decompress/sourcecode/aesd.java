// 
// Decompiled by Procyon v0.6.0
// 

final class aesd extends aerq
{
    final /* synthetic */ aerr b;
    
    public aesd(final aere aere, final aerr b) {
        this.b = b;
        super(aere);
    }
    
    @Override
    public final void close() {
        super.a.close();
        final aerr b = this.b;
        if (b != null) {
            aesw.n(b);
        }
    }
}
