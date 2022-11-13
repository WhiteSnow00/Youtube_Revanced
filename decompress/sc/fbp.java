import android.content.Intent;
import android.content.Context;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.media.AudioManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbp implements fbo
{
    public final tmx a;
    private final atke b;
    private final fzw c;
    private final avu d;
    
    public fbp(final tmx a, final avu d, final fzw c, final atke b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    private static boolean g(fbs fbs, final avu avu, final fbs fbs2) {
        final fbs a = fbs.a;
        final boolean b = false;
        adkp.H(fbs2 != a);
        if (fbs == fbs.a) {
            fbs = fbs2;
        }
        if (fbs != fbs.b) {
            final boolean b2 = b;
            if (fbs != fbs.c) {
                return b2;
            }
            if (!((AudioManager)avu.a).isWiredHeadsetOn() && !((AudioManager)avu.a).isBluetoothA2dpOn()) {
                if (!((AudioManager)avu.a).isBluetoothScoOn()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final ListenableFuture a() {
        return aftq.f(this.a.a(), (aftz)new fdy(this, 1), (Executor)afum.a);
    }
    
    public final ListenableFuture b() {
        fbs fbs;
        if ((fbs = fbs.a(((fbt)this.a.c()).c)) == null) {
            fbs = fbs.a;
        }
        if (fbs == fbs.a) {
            return afvn.a;
        }
        if (!g(fbs, this.d, (fbs)this.b.a())) {
            final fzw c = this.c;
            ((Context)c.b).stopService((Intent)((atke)c.a).a());
        }
        return this.a();
    }
    
    public final boolean c() {
        fbs fbs;
        if ((fbs = fbs.a(((fbt)this.a.c()).c)) == null) {
            fbs = fbs.a;
        }
        return fbs == fbs.b;
    }
    
    public final boolean d() {
        fbs fbs;
        if ((fbs = fbs.a(((fbt)this.a.c()).c)) == null) {
            fbs = fbs.a;
        }
        return fbs == fbs.c;
    }
    
    public final boolean e() {
        fbs fbs;
        if ((fbs = fbs.a(((fbt)this.a.c()).c)) == null) {
            fbs = fbs.a;
        }
        return g(fbs, this.d, (fbs)this.b.a());
    }
    
    public final boolean f() {
        return !((fbt)this.a.c()).d;
    }
}
