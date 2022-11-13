import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardu extends enz implements ardw
{
    public ardu(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.library.api.IGvrUiLayout");
    }
    
    public final ardz getRootView() {
        throw null;
    }
    
    public final boolean isEnabled() {
        throw null;
    }
    
    public final void setCloseButtonListener(final ardz ardz) {
        final Parcel qw = this.qW();
        eob.j(qw, (IInterface)ardz);
        this.qY(5, qw);
    }
    
    public final void setEnabled(final boolean b) {
        throw null;
    }
    
    public final void setSettingsButtonEnabled(final boolean b) {
        throw null;
    }
    
    public final void setSettingsButtonListener(final ardz ardz) {
        throw null;
    }
    
    public final void setTransitionViewEnabled(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(6, qw);
    }
    
    public final void setTransitionViewListener(final ardz ardz) {
        throw null;
    }
    
    public final void setViewerName(final String s) {
        final Parcel qw = this.qW();
        qw.writeString(s);
        this.qY(10, qw);
    }
}
