import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class ascq extends OutputStream
{
    final /* synthetic */ ascs a;
    
    public ascq(final ascs a) {
        this.a = a;
    }
    
    @Override
    public final void write(final int n) {
        this.write(new byte[] { (byte)n }, 0, 1);
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        this.a.d(array, n, n2);
    }
}