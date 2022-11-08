import com.google.android.libraries.glide.fife.FifeUrl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owu
{
    public final FifeUrl a;
    public final oxb b;
    private final owt c;
    
    static {
        final int f = oxb.f;
    }
    
    public owu(final FifeUrl a, final oxb b, final int n) {
        final owt c = new owt(n);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Deprecated
    public final int a() {
        return (int)((aexw)this.c.a).a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof owu) {
            final owu owu = (owu)o;
            if (this.a.equals(owu.a) && this.b.equals(owu.b) && this.c.equals(owu.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return dpg.g(this.a, dpg.g(this.b, this.c.hashCode()));
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final String string3 = this.c.toString();
        final StringBuilder sb = new StringBuilder("FifeModel{fifeUrl='");
        sb.append(string);
        sb.append("', fifeUrlOptions='");
        sb.append(string2);
        sb.append("', accountInfo='");
        sb.append(string3);
        sb.append("'}");
        return sb.toString();
    }
}
