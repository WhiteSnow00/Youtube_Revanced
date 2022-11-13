import android.os.Bundle;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.research.xeno.effect.RemoteAssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtv
{
    public final Object a;
    public final Object b;
    public final Object c;
    
    public aqtv() {
    }
    
    public aqtv(final aezp b, final ahdc a, final aeqe c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aqtv(final afev a, final afft b, final RemoteAssetManager c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aqtv(final aqtw a, final aqtz b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aqtv(final FirebaseMessaging a, final String b, final agmt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aqtv(final String c, final aslr b, final aeea a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aqtv(final AtomicBoolean a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aqtv(final nxu b, final nyb a, final nxw c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aqtv(final qrc a, final Object[] c, final String b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aqtv(final sqv c, final squ b, final View a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aqtv(final stv a, final ahab c, final ahab b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aqtv(final wjf a, final aiqj b, final anky c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aqtv(final xqs a, final xrh b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final String s, final int n) {
        if (((aslr)this.b).tA()) {
            return;
        }
        final Object b = this.b;
        final StringBuilder sb = new StringBuilder("Progress failed on ID: ");
        sb.append(s);
        sb.append(" with error code: ");
        sb.append(n);
        ((aslr)b).b(new Throwable(sb.toString()));
    }
    
    public final void b(final obv obv) {
        final Object a = this.a;
        final Object b = this.b;
        final Object c = this.c;
        if (((AtomicBoolean)a).getAndSet(false) && obv.b.y(5)) {
            final Bundle a2 = obv.a();
            a2.putBoolean((String)b, false);
            obv.b.z((String)c, a2);
        }
    }
    
    public final nzs c() {
        return (nzs)((nxu)this.b).d;
    }
    
    public final nzw d() {
        return (nzw)((nxu)this.b).e;
    }
    
    public final nzx e() {
        return (nzx)((nxu)this.b).f;
    }
    
    public final nzy f() {
        return (nzy)((nxu)this.b).g;
    }
}
