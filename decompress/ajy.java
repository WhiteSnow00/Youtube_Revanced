import android.content.Context;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajy implements Callable
{
    final String a;
    final Context b;
    final ajx c;
    final int d;
    
    public ajy(final String a, final Context b, final ajx c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final arjd a() {
        try {
            return aka.b(this.a, this.b, this.c, this.d);
        }
        finally {
            return new arjd(-3, null, null, null);
        }
    }
    
    @Override
    public final /* bridge */ Object call() {
        return this.a();
    }
}
