import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzd implements arjd
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public adzd(final adcr b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public adzd(final aeby b, final int a, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public adzd(final php b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public static Context c(final php php) {
        final Object a = php.a;
        a.getClass();
        return (Context)a;
    }
    
    public final Context b() {
        final int a = this.a;
        if (a == 0) {
            final Object a2 = ((adcr)this.b).a;
            a2.getClass();
            return (Context)a2;
        }
        if (a != 1) {
            final Object a3 = ((aeby)this.b).a;
            a3.getClass();
            return (Context)a3;
        }
        return c((php)this.b);
    }
}
