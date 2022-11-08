import android.content.Intent;
import android.content.Context;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.media.AudioManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbk implements fbj
{
    public final tku a;
    private final atjj b;
    private final fzo c;
    private final avt d;
    
    public fbk(final tku a, final avt d, final fzo c, final atjj b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    private static boolean g(final fbn fbn, final avt avt, final fbn fbn2) {
        final fbn a = fbn.a;
        final boolean b = false;
        agot.u(fbn2 != a);
        fbn fbn3 = fbn;
        if (fbn == fbn.a) {
            fbn3 = fbn2;
        }
        if (fbn3 != fbn.b) {
            final boolean b2 = b;
            if (fbn3 != fbn.c) {
                return b2;
            }
            if (!((AudioManager)avt.a).isWiredHeadsetOn() && !((AudioManager)avt.a).isBluetoothA2dpOn()) {
                if (!((AudioManager)avt.a).isBluetoothScoOn()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public final ListenableFuture a() {
        return afrp.f(this.a.a(), (afry)new fdr(this, 1), (Executor)afsl.a);
    }
    
    @Override
    public final ListenableFuture b() {
        fbn fbn;
        if ((fbn = fbn.a(((fbo)this.a.c()).c)) == null) {
            fbn = fbn.a;
        }
        if (fbn == fbn.a) {
            return aftm.a;
        }
        if (!g(fbn, this.d, (fbn)this.b.a())) {
            final fzo c = this.c;
            ((Context)c.b).stopService((Intent)((atjj)c.a).a());
        }
        return this.a();
    }
    
    @Override
    public final boolean c() {
        fbn fbn;
        if ((fbn = fbn.a(((fbo)this.a.c()).c)) == null) {
            fbn = fbn.a;
        }
        return fbn == fbn.b;
    }
    
    @Override
    public final boolean d() {
        fbn fbn;
        if ((fbn = fbn.a(((fbo)this.a.c()).c)) == null) {
            fbn = fbn.a;
        }
        return fbn == fbn.c;
    }
    
    @Override
    public final boolean e() {
        fbn fbn;
        if ((fbn = fbn.a(((fbo)this.a.c()).c)) == null) {
            fbn = fbn.a;
        }
        return g(fbn, this.d, (fbn)this.b.a());
    }
    
    @Override
    public final boolean f() {
        return !((fbo)this.a.c()).d;
    }
}
