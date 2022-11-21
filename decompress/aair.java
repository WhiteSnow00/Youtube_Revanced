import android.content.SharedPreferences;
import java.security.Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aair implements aaja
{
    private final oco a;
    private final aajb b;
    private final Key c;
    private final zcj d;
    private final acjq e;
    private final aefs f;
    
    public aair(final oco a, final aefs f, final aajb b, final mtf mtf, final SharedPreferences sharedPreferences, final zcj d, final acjq e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = mtf.i(sharedPreferences);
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final aahl a(final aadf aadf, final aahk aahk, final aaiq aaiq, final aage aage) {
        aaiq.b(this.c);
        aaiq.b = this.d;
        return new aaip(aahk, this.a, this.f, aadf, aaiq, this.b, aage, this.e, null, null, null, null, null, null, null, null);
    }
}
