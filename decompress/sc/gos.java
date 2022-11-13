import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

final class gos implements aezs
{
    private boolean a;
    private final bx b;
    
    public gos(final bx b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = true;
        this.b = b;
    }
    
    public final /* bridge */ boolean a(final Object o) {
        final PaneDescriptor paneDescriptor = (PaneDescriptor)o;
        final boolean b = this.a && this.b.V(paneDescriptor);
        this.a = false;
        return b;
    }
}
