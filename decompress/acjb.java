import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjb implements dns
{
    private final ahua a;
    private final atnb b;
    private final boolean c;
    
    public acjb(final ahua a, final atnb b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final dfy dfy, final Object o, final dog dog, final boolean b) {
        if (this.c) {
            ((adjq)this.b.a()).e("GLIDE", "UNKNOWN", true);
        }
        if (this.a.d && o instanceof aowb) {
            dog.e((dof)new acja(dfy, b, (aowb)o));
        }
        return false;
    }
    
    public final /* bridge */ boolean lr(final Object o, final Object o2, final int n) {
        final Drawable drawable = (Drawable)o;
        if (this.c) {
            final adjq adjq = (adjq)this.b.a();
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
            adjq.e("GLIDE", s, false);
        }
        return false;
    }
}
