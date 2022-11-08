import j$.util.Optional;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfi implements arjd
{
    private final atjj a;
    private final atjj b;
    private final atjj c;
    private final atjj d;
    private final atjj e;
    private final atjj f;
    private final /* synthetic */ int g;
    
    public acfi(final atjj a, final atjj b, final atjj c, final atjj d, final atjj e, final atjj f, final int g) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public acfi(final atjj e, final atjj d, final atjj f, final atjj b, final atjj c, final atjj a, final int g, final byte[] array) {
        this.g = g;
        this.e = e;
        this.d = d;
        this.f = f;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public acfi(final atjj f, final atjj a, final atjj c, final atjj b, final atjj e, final atjj d, final int g, final char[] array) {
        this.g = g;
        this.f = f;
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
    }
    
    public acfi(final atjj a, final atjj c, final atjj e, final atjj f, final atjj d, final atjj b, final int g, final short[] array) {
        this.g = g;
        this.a = a;
        this.c = c;
        this.e = e;
        this.f = f;
        this.d = d;
        this.b = b;
    }
    
    public static acfi b(final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4, final atjj atjj5, final atjj atjj6) {
        return new acfi(atjj, atjj2, atjj3, atjj4, atjj5, atjj6, 0);
    }
    
    public static adew c(final atjj atjj, final atjj atjj2, final atjj atjj3, final oas oas, final atjj atjj4) {
        return new adew(atjj, atjj2, atjj3, oas, atjj4);
    }
    
    public static acfi d(final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4, final atjj atjj5, final atjj atjj6) {
        return new acfi(atjj, atjj2, atjj3, atjj4, atjj5, atjj6, 1, (byte[])null);
    }
    
    public static acfi e(final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4, final atjj atjj5, final atjj atjj6) {
        return new acfi(atjj, atjj2, atjj3, atjj4, atjj5, atjj6, 2, (char[])null);
    }
    
    public static acfi f(final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4, final atjj atjj5, final atjj atjj6) {
        return new acfi(atjj, atjj2, atjj3, atjj4, atjj5, atjj6, 3, (short[])null);
    }
    
    public static abwr g(final adbl adbl, final Executor executor, final atjj atjj, final atjj atjj2, final wvu wvu, final abpj abpj) {
        return new abwr(adbl, executor, atjj, atjj2, wvu, abpj, (byte[])null, (byte[])null);
    }
}
