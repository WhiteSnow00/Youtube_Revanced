import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.iid.FirebaseInstanceId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmj implements nnb
{
    public final String a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public agmj(final FirebaseInstanceId b, final String c, final String a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public agmj(final FirebaseMessaging b, final String a, final agmt c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final nnc a(final Object o) {
        if (this.d != 0) {
            final Object b = this.b;
            final Object c = this.c;
            final String a = this.a;
            final String s = (String)o;
            final aujg h = FirebaseInstanceId.h;
            final FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId)b;
            h.d(firebaseInstanceId.d(), (String)c, a, s, firebaseInstanceId.d.c());
            return nnv.c((Object)new agnj(s));
        }
        final Object b2 = this.b;
        final String a2 = this.a;
        final Object c2 = this.c;
        final String s2 = (String)o;
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging)b2;
        FirebaseMessaging.l(firebaseMessaging.d).C(firebaseMessaging.d(), a2, s2, firebaseMessaging.h.c());
        if (c2 == null || !s2.equals(((agmt)c2).b)) {
            firebaseMessaging.e(s2);
        }
        return nnv.c((Object)s2);
    }
}
