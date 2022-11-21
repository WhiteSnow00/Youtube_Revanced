import android.content.Context;
import org.chromium.net.CronetEngine$Builder$LibraryLoader;

// 
// Decompiled by Procyon v0.6.0
// 

final class adrx extends CronetEngine$Builder$LibraryLoader
{
    final adfa a;
    
    public adrx(final adfa a, final byte[] array) {
        this.a = a;
    }
    
    public final void loadLibrary(final String s) {
        tqf.am((Context)this.a.a, s);
    }
}
