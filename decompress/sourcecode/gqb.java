import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqb
{
    public final zki a;
    public final Executor b;
    public SettableFuture c;
    public boolean d;
    public final lzi e;
    
    public gqb(final zki a, final lzi e, final Executor b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.e = e;
        this.b = b;
    }
    
    public final void a(final GalFlowActivity galFlowActivity, final gqa gqa) {
        if (gqa == gqa.b) {
            return;
        }
        galFlowActivity.finish();
        this.c.set((Object)gqa);
        this.c = null;
        this.d = false;
    }
}
