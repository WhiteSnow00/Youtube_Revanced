import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.iid.FirebaseInstanceId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agob implements nns
{
    public final String a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public agob(final FirebaseInstanceId b, final String c, final String a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public agob(final FirebaseMessaging b, final String a, final agol c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final nnt a(final Object o) {
        if (this.d != 0) {
            final Object b = this.b;
            final Object c = this.c;
            final String a = this.a;
            final String s = (String)o;
            final aapu i = FirebaseInstanceId.i;
            final FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId)b;
            i.br(firebaseInstanceId.d(), (String)c, a, s, firebaseInstanceId.d.c());
            return nom.e((Object)new agpb(s));
        }
        final Object b2 = this.b;
        final String a2 = this.a;
        final Object c2 = this.c;
        final String s2 = (String)o;
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging)b2;
        FirebaseMessaging.l(firebaseMessaging.d).c(firebaseMessaging.d(), a2, s2, firebaseMessaging.h.c());
        if (c2 == null || !s2.equals(((agol)c2).b)) {
            firebaseMessaging.e(s2);
        }
        return nom.e((Object)s2);
    }
}
