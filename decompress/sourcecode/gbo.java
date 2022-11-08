import android.text.TextUtils;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbo extends acty
{
    public actk a;
    public byte b;
    private boolean c;
    private boolean d;
    private int e;
    private CharSequence f;
    private CharSequence g;
    private View$OnClickListener h;
    
    public final gbq a() {
        if ((this.b & 0x8) != 0x0) {
            if (this.e == -1 && !TextUtils.isEmpty(this.g)) {
                this.c(0);
            }
            if (this.b == 15) {
                final CharSequence f = this.f;
                if (f != null) {
                    return new gbq(this.c, this.d, this.e, f, this.g, this.h, this.a);
                }
            }
            final StringBuilder sb = new StringBuilder();
            if ((this.b & 0x1) == 0x0) {
                sb.append(" rateLimited");
            }
            if ((this.b & 0x2) == 0x0) {
                sb.append(" shownOnFullscreen");
            }
            if ((this.b & 0x4) == 0x0) {
                sb.append(" counterfactual");
            }
            if ((this.b & 0x8) == 0x0) {
                sb.append(" duration");
            }
            if (this.f == null) {
                sb.append(" text");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new IllegalStateException("Property \"duration\" has not been set");
    }
    
    public final void c(final int e) {
        this.e = e;
        this.b |= 0x8;
    }
    
    public final void d(final boolean c) {
        this.c = c;
        this.b |= 0x1;
    }
    
    public final void e(final boolean d) {
        this.d = d;
        this.b |= 0x2;
    }
}
