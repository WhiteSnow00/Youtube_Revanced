import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfl implements dno
{
    private final ahqj a;
    private final atjj b;
    private final boolean c;
    
    public acfl(final ahqj a, final atjj b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean a(final dft dft, final Object o, final doc doc, final boolean b) {
        if (this.c) {
            ((adfy)this.b.a()).e("GLIDE", "UNKNOWN", true);
        }
        if (this.a.d && o instanceof aorm) {
            doc.e((dob)new acfk(dft, b, (aorm)o));
        }
        return false;
    }
}
