import android.content.res.Resources;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adml
{
    public final Context a;
    public Bitmap b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    public byte[] g;
    
    public adml(final Context a) {
        this.g = null;
        this.a = a;
        this.f = -1;
    }
    
    final boolean a(final afq afq, int n) {
        final String string = this.a.getResources().getString(2132020074);
        boolean b;
        if (!TextUtils.equals((CharSequence)string, this.c)) {
            afq.j(this.c = string);
            b = true;
        }
        else {
            b = false;
        }
        String string2;
        if (n != 0) {
            final Resources resources = this.a.getResources();
            if (n == 1) {
                n = 2132020076;
            }
            else {
                n = 2132020075;
            }
            string2 = resources.getString(n);
        }
        else {
            string2 = "";
        }
        if (!TextUtils.equals((CharSequence)string2, this.d)) {
            afq.i(this.d = string2);
            b = true;
        }
        if (this.f != -2) {
            this.f = -2;
            afq.p(0, 0, true);
            b = true;
        }
        if (!TextUtils.equals(this.e, (CharSequence)"")) {
            afq.h(this.e = "");
            return true;
        }
        return b;
    }
}
