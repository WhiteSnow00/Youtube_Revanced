import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

final class bmh
{
    public final String a;
    public final boolean b;
    public final boolean c;
    
    public bmh(final String a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (o.getClass() == bmh.class) {
                final bmh bmh = (bmh)o;
                if (TextUtils.equals((CharSequence)this.a, (CharSequence)bmh.a) && this.b == bmh.b && this.c == bmh.c) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final boolean b = this.b;
        int n = 1237;
        int n2;
        if (!b) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.c) {
            n = 1231;
        }
        return ((hashCode + 31) * 31 + n2) * 31 + n;
    }
}
