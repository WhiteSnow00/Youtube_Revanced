import android.content.SharedPreferences;
import java.security.Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaey implements aafh
{
    private final oas a;
    private final aafi b;
    private final Key c;
    private final yyv d;
    private final acga e;
    private final avt f;
    
    public aaey(final oas a, final avt f, final aafi b, final avt avt, final SharedPreferences sharedPreferences, final yyv d, final acga e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = avt.ab(sharedPreferences);
        this.d = d;
        this.e = e;
    }
    
    public final aads a(final zzo zzo, final aadr aadr, final aaex aaex, final aack aack) {
        aaex.b(this.c);
        aaex.b = this.d;
        return (aads)new aaew(aadr, this.a, this.f, zzo, aaex, this.b, aack, this.e, null, null, null, null, null);
    }
}
