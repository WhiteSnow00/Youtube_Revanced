import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admz implements Comparable
{
    public final znz a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final int f;
    
    public admz(final znz znz, final String s, final String s2, final long n, final String s3) {
        this(znz, s, s2, n, s3, 0);
    }
    
    public admz(final znz a, final String b, final String c, final long d, final String e, final int f) {
        final boolean empty = TextUtils.isEmpty((CharSequence)b);
        boolean b2 = true;
        if (empty) {
            b2 = (!TextUtils.isEmpty((CharSequence)c) && b2);
        }
        adme.K(b2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return lcmp(this.d, ((admz)o).d);
    }
}
