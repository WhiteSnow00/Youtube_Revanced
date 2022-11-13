import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acho implements dnp
{
    private final ahsh a;
    private final atke b;
    private final boolean c;
    
    public acho(final ahsh a, final atke b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final dfu dfu, final Object o, final dod dod, final boolean b) {
        if (this.c) {
            ((adia)this.b.a()).e("GLIDE", "UNKNOWN", true);
        }
        if (this.a.d && o instanceof aotp) {
            dod.e((doc)new achn(dfu, b, (aotp)o));
        }
        return false;
    }
    
    public final /* bridge */ boolean lr(final Object o, final Object o2, final int n) {
        final Drawable drawable = (Drawable)o;
        if (this.c) {
            final adia adia = (adia)this.b.a();
            final int n2 = n - 1;
            if (n == 0) {
                throw null;
            }
            String s;
            if (n2 != 1) {
                if (n2 != 2 && n2 != 3) {
                    if (n2 != 4) {
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
            adia.e("GLIDE", s, false);
        }
        return false;
    }
}
