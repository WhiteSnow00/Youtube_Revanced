import android.content.SharedPreferences;
import android.content.Context;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxa implements Callable
{
    final /* synthetic */ String a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;
    
    public mxa(final Context b, final String a, final String c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public mxa(final SharedPreferences b, final String a, final Boolean c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public mxa(final SharedPreferences b, final String a, final Integer c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public mxa(final SharedPreferences b, final String a, final Long c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public mxa(final SharedPreferences b, final String a, final String c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
}
