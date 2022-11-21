import android.content.SharedPreferences;
import java.security.Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaiv implements aaja
{
    private final oco a;
    private final vku b;
    private final aajb c;
    private final Key d;
    private final zcj e;
    private final aacd f;
    private final zby g;
    private final aaks h;
    private final ykv i;
    private final abwe j;
    private final acjq k;
    private final aefs l;
    
    public aaiv(final oco a, final aefs l, final vku b, final aajb c, final mtf mtf, final SharedPreferences sharedPreferences, final aacd f, final zcj e, final acjq k, final zby g, final aaks h, final ykv i, final abwe j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.a = a;
        this.l = l;
        this.b = b;
        this.c = c;
        this.d = mtf.i(sharedPreferences);
        this.e = e;
        this.k = k;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final aahl a(final aadf aadf, final aahk aahk, final aaiq aaiq, final aage aage) {
        aaiq.b(this.d);
        aaiq.b = this.e;
        return new aaiw(aahk, aage, this.b, this.a, this.l, aadf, new adgg(aaiq), new adgg(new aaiq(aaiq)), this.c, this.k, this.f, this.g, this.h, this.i, this.j, null, null, null, null, null, null, null, null);
    }
}
