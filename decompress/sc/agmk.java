import com.google.firebase.messaging.FirebaseMessaging;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmk implements nnb
{
    public final String a;
    private final int b;
    
    public agmk(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final nnc a(final Object o) {
        if (this.b != 0) {
            final String a = this.a;
            final agmy agmy = (agmy)o;
            final int i = FirebaseMessaging.i;
            final nnc b = agmy.b(new agmw("U", a));
            agmy.f();
            return b;
        }
        final String a2 = this.a;
        final agmy agmy2 = (agmy)o;
        final int j = FirebaseMessaging.i;
        final nnc b2 = agmy2.b(new agmw("S", a2));
        agmy2.f();
        return b2;
    }
}
