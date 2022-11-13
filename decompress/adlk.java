import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adlk implements Comparable
{
    public final zme a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final int f;
    
    public adlk(final zme zme, final String s, final String s2, final long n, final String s3) {
        this(zme, s, s2, n, s3, 0);
    }
    
    public adlk(final zme a, final String b, final String c, final long d, final String e, final int f) {
        final boolean empty = TextUtils.isEmpty((CharSequence)b);
        boolean b2 = true;
        if (empty) {
            b2 = (!TextUtils.isEmpty((CharSequence)c) && b2);
        }
        adkp.H(b2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return lcmp(this.d, ((adlk)o).d);
    }
}
