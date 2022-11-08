import com.google.android.apps.youtube.app.ui.inline.DefaultInlinePlayerControls;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kab extends fnh
{
    public boolean a;
    final /* synthetic */ DefaultInlinePlayerControls b;
    
    public kab(final DefaultInlinePlayerControls b, final qv qv, final byte[] array, final byte[] array2) {
        this.b = b;
        super(qv, (byte[])null, (byte[])null);
    }
    
    public final void lV() {
        this.a = false;
        final DefaultInlinePlayerControls b = this.b;
        if (b.c != null && b.a == 0) {
            ((gec)b).k();
        }
    }
    
    public final void qB() {
        this.a = true;
    }
}
