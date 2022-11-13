import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.Effect$NativeLoadCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtu implements Effect$NativeLoadCallback
{
    final aqtv a;
    
    public aqtu(final aqtv a) {
        this.a = a;
    }
    
    public final void onCompletion(final long n, final String s) {
        Effect effect;
        if (n != 0L) {
            effect = new Effect(n);
        }
        else {
            effect = null;
        }
        Effect.b((aqtw)this.a.a, effect, s);
    }
}
