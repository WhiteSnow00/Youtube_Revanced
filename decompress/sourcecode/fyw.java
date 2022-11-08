import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyw extends fxu
{
    public final int b;
    public final int c;
    
    public fyw(final int b, final int c) {
        super((Drawable)new ColorDrawable(b));
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final fxu fxu) {
        if (!(fxu instanceof fyw)) {
            return false;
        }
        final fyw fyw = (fyw)fxu;
        return this.b(fyw.b, fyw.c) || this.a == fxu.a;
    }
    
    public final boolean b(int n, int n2) {
        if (n != -1 && n == this.b) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n2 != -1 && n2 == this.c) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        return n != 0 && n2 != 0;
    }
    
    public final String toString() {
        final String hexString = Integer.toHexString(0);
        final String hexString2 = Integer.toHexString(this.b);
        final String hexString3 = Integer.toHexString(this.c);
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("resId 0x");
        sb.append(hexString);
        sb.append(" abColor 0x");
        sb.append(hexString2);
        sb.append(" sbColor 0x");
        sb.append(hexString3);
        sb.append(" drawable ");
        sb.append(string);
        return sb.toString();
    }
}
