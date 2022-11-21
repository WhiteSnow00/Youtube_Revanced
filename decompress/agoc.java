import com.google.firebase.messaging.FirebaseMessaging;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoc implements nns
{
    public final String a;
    private final int b;
    
    public agoc(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final nnt a(final Object o) {
        if (this.b != 0) {
            final String a = this.a;
            final agoq agoq = (agoq)o;
            final int i = FirebaseMessaging.i;
            final nnt b = agoq.b(new agoo("U", a));
            agoq.f();
            return b;
        }
        final String a2 = this.a;
        final agoq agoq2 = (agoq)o;
        final int j = FirebaseMessaging.i;
        final nnt b2 = agoq2.b(new agoo("S", a2));
        agoq2.f();
        return b2;
    }
}
