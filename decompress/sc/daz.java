import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class daz
{
    public final String a;
    public final String b;
    
    public daz(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final daz daz = (daz)o;
                if (TextUtils.equals((CharSequence)this.a, (CharSequence)daz.a) && TextUtils.equals((CharSequence)this.b, (CharSequence)daz.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(a);
        sb.append(",value=");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
