import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class frz implements tcc
{
    private final fsd a;
    private final oum b;
    private final int c;
    
    public frz(final fsd a, final oum b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        final byte[] s = (byte[])o2;
        final fsd a = this.a;
        a.t = this.c;
        a.s = s;
        a.b();
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final Uri uri = (Uri)o;
        this.b.b(28, "Image zoom bytes load error");
    }
}
