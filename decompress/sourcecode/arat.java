import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arat extends enz implements arau
{
    public arat() {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }
    
    protected boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            this.onTransitionComplete();
            return true;
        }
        return false;
    }
}
