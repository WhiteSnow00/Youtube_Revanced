import android.content.SharedPreferences;
import java.security.Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafc implements aafh
{
    private final oas a;
    private final vhm b;
    private final aafi c;
    private final Key d;
    private final yyv e;
    private final zym f;
    private final yyh g;
    private final aaha h;
    private final yha i;
    private final aamd j;
    private final acga k;
    private final avt l;
    
    public aafc(final oas a, final avt l, final vhm b, final aafi c, final avt avt, final SharedPreferences sharedPreferences, final zym f, final yyv e, final acga k, final yyh g, final aaha h, final yha i, final aamd j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.l = l;
        this.b = b;
        this.c = c;
        this.d = avt.ab(sharedPreferences);
        this.e = e;
        this.k = k;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final aads a(final zzo zzo, final aadr aadr, final aaex aaex, final aack aack) {
        aaex.b(this.d);
        aaex.b = this.e;
        return (aads)new aafd(aadr, aack, this.b, this.a, this.l, zzo, new aeby(aaex), new aeby(new aaex(aaex)), this.c, this.k, this.f, this.g, this.h, this.i, this.j, null, null, null, null, null, null);
    }
}
