import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

final class lrh
{
    public final String a;
    
    public lrh(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (o.getClass() == lrh.class) {
                if (TextUtils.equals((CharSequence)this.a, (CharSequence)((lrh)o).a)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return (hashCode + 31) * 31 + 1237;
    }
}
