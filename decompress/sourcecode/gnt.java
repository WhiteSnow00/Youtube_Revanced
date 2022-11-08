import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnt extends suq
{
    private final YpcOffersListDialogFragmentController e;
    
    public gnt(final bu bu, final xgc xgc, final zki zki, final wwu wwu, final tny tny, final vax vax, final YpcOffersListDialogFragmentController e, final Executor executor, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(bu, xgc, zki, wwu, tny, vax, executor, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
    }
    
    public final void b(final aioe aioe) {
        this.e.g(aioe);
        ((DialogFragmentController)this.e).n();
    }
}
