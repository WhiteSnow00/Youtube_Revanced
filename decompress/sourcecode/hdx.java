import com.google.android.libraries.youtube.edit.camera.CameraView;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdx implements tzv
{
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public hdx(final gwg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hdx(final hea a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final int n, final aqyw aqyw) {
        if (this.b != 0) {
            final gzy bp = ((gwg)this.a).bp;
            if (bp != null) {
                bp.e(n, aqyw);
            }
        }
    }
    
    public final void b(final afcr afcr) {
        if (this.b == 0) {
            final Executor az = ((hea)this.a).az;
            if (az != null) {
                az.execute(aesm.h((Runnable)new hdw(this)));
            }
            return;
        }
        final CameraView l = ((gwg)this.a).L;
        l.getClass();
        if (l.L()) {
            return;
        }
        ((gwg)this.a).x((Runnable)new gvx(this, afcr, (byte[])null));
    }
    
    public final void c(final int n) {
        if (this.b != 0) {
            ((gwg)this.a).x((Runnable)new ccl(this, n, 7, (byte[])null));
        }
    }
    
    public final void d(final boolean b) {
        if (this.b != 0) {
            ((gwg)this.a).x((Runnable)new dmu(this, b, 9, (byte[])null));
        }
    }
    
    public final void e(final boolean b) {
        if (this.b != 0) {
            ((gwg)this.a).x((Runnable)new dmu(this, b, 8, (byte[])null));
        }
    }
}
