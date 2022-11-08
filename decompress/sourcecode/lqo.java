import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqo
{
    private static volatile lqo a;
    private final Context b;
    
    private lqo(final Context b) {
        this.b = b;
    }
    
    public static lqo a() {
        final lqo a = lqo.a;
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Not initialized!");
    }
    
    public static void b(final Context context) {
        if (lqo.a == null) {
            synchronized (lqo.class) {
                if (lqo.a == null) {
                    lqo.a = new lqo(context);
                }
            }
        }
    }
    
    public final lql c() {
        return (lql)new lqn(this.b);
    }
}
