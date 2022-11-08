import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbg extends eny implements arbi
{
    public arbg(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.library.api.IGvrUiLayout");
    }
    
    public final arbl getRootView() {
        throw null;
    }
    
    public final boolean isEnabled() {
        throw null;
    }
    
    public final void setCloseButtonListener(final arbl arbl) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)arbl);
        this.qS(5, qq);
    }
    
    public final void setEnabled(final boolean b) {
        throw null;
    }
    
    public final void setSettingsButtonEnabled(final boolean b) {
        throw null;
    }
    
    public final void setSettingsButtonListener(final arbl arbl) {
        throw null;
    }
    
    public final void setTransitionViewEnabled(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(6, qq);
    }
    
    public final void setTransitionViewListener(final arbl arbl) {
        throw null;
    }
    
    public final void setViewerName(final String s) {
        final Parcel qq = this.qQ();
        qq.writeString(s);
        this.qS(10, qq);
    }
}
