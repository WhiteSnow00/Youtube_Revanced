import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mkl implements ccp
{
    public final mko a;
    public final Handler b;
    
    static {
        new mnb("MediaRouterOPTListener");
    }
    
    public mkl(final mko a) {
        this.a = a;
        this.b = new aeke(Looper.getMainLooper(), (byte[])null);
    }
}
