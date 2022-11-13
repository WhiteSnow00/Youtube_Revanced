import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goa extends swv
{
    private final YpcOffersListDialogFragmentController e;
    
    public goa(final bu bu, final xib xib, final zmf zmf, final wyv wyv, final tqd tqd, final vcy vcy, final YpcOffersListDialogFragmentController e, final Executor executor, final byte[] array, final byte[] array2, final byte[] array3) {
        super(bu, xib, zmf, wyv, tqd, vcy, executor, (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
    }
    
    public final void b(final aiqj aiqj) {
        this.e.g(aiqj);
        ((DialogFragmentController)this.e).n();
    }
}
