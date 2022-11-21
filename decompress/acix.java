import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acix implements dns
{
    private final adjq a;
    
    public acix(final adjq a) {
        this.a = a;
    }
    
    public final boolean a(final dfy dfy, final Object o, final dog dog, final boolean b) {
        this.a.e("GLIDE", "UNKNOWN", true);
        return false;
    }
    
    public final /* bridge */ boolean lr(final Object o, final Object o2, int n) {
        final Bitmap bitmap = (Bitmap)o;
        final adjq a = this.a;
        if (n != 0) {
            String s;
            if (--n != 1) {
                if (n != 2) {
                    if (n != 4) {
                        s = "UNKNOWN";
                    }
                    else {
                        s = "MEMORY";
                    }
                }
                else {
                    s = "DISK";
                }
            }
            else {
                s = "NOT_CACHED";
            }
            a.e("GLIDE", s, false);
            return false;
        }
        throw null;
    }
}
