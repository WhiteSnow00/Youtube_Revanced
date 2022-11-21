import android.content.res.Resources;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnz
{
    public final Context a;
    public Bitmap b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    public byte[] g;
    
    public adnz(final Context a) {
        this.g = null;
        this.a = a;
        this.f = -1;
    }
    
    final boolean a(final afr afr, int n) {
        final String string = this.a.getResources().getString(2132020077);
        boolean b;
        if (!TextUtils.equals((CharSequence)string, this.c)) {
            afr.j(this.c = string);
            b = true;
        }
        else {
            b = false;
        }
        String string2;
        if (n != 0) {
            final Resources resources = this.a.getResources();
            if (n == 1) {
                n = 2132020079;
            }
            else {
                n = 2132020078;
            }
            string2 = resources.getString(n);
        }
        else {
            string2 = "";
        }
        if (!TextUtils.equals((CharSequence)string2, this.d)) {
            afr.i(this.d = string2);
            b = true;
        }
        if (this.f != -2) {
            this.f = -2;
            afr.p(0, 0, true);
            b = true;
        }
        if (!TextUtils.equals(this.e, (CharSequence)"")) {
            afr.h(this.e = "");
            return true;
        }
        return b;
    }
}
