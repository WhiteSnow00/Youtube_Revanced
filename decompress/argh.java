import com.google.vr.vrcore.controller.api.ControllerAccelEvent;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import com.google.vr.vrcore.controller.api.ControllerBatteryEvent;
import com.google.vr.vrcore.controller.api.ControllerButtonEvent;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerGyroEvent;
import com.google.vr.vrcore.controller.api.ControllerListenerOptions;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.ControllerPositionEvent;
import com.google.vr.vrcore.controller.api.ControllerRequest;
import com.google.vr.vrcore.controller.api.ControllerTouchEvent;
import com.google.vr.vrcore.controller.api.ControllerTrackingStatusEvent;
import com.google.vr.vrcore.logging.api.VREventParcelable;
import org.chromium.base.UnguessableToken;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argh implements Parcelable$Creator
{
    private final int a;
    
    public argh(final int a) {
        this.a = a;
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.a) {
            default: {
                final long long1 = parcel.readLong();
                final long long2 = parcel.readLong();
                if (long1 != 0L && long2 != 0L) {
                    return new UnguessableToken(long1, long2);
                }
                return null;
            }
            case 13: {
                return new VREventParcelable(parcel);
            }
            case 12: {
                return new ControllerTrackingStatusEvent(parcel);
            }
            case 11: {
                return new ControllerTouchEvent(parcel);
            }
            case 10: {
                return new ControllerRequest(parcel);
            }
            case 9: {
                return new ControllerPositionEvent(parcel);
            }
            case 8: {
                return new ControllerOrientationEvent(parcel);
            }
            case 7: {
                return new ControllerListenerOptions(parcel);
            }
            case 6: {
                return new ControllerGyroEvent(parcel);
            }
            case 5: {
                synchronized (ControllerEventPacket2.b) {
                    ControllerEventPacket2 controllerEventPacket2;
                    if (ControllerEventPacket2.a.isEmpty()) {
                        controllerEventPacket2 = new ControllerEventPacket2();
                    }
                    else {
                        controllerEventPacket2 = ControllerEventPacket2.a.remove();
                    }
                    monitorexit(ControllerEventPacket2.b);
                    ((ControllerEventPacket)controllerEventPacket2).c(parcel);
                    return controllerEventPacket2;
                }
            }
            case 4: {
                synchronized (ControllerEventPacket.k) {
                    ControllerEventPacket controllerEventPacket3;
                    if (ControllerEventPacket.j.isEmpty()) {
                        controllerEventPacket3 = new ControllerEventPacket();
                    }
                    else {
                        controllerEventPacket3 = ControllerEventPacket.j.remove();
                    }
                    monitorexit(ControllerEventPacket.k);
                    controllerEventPacket3.c(parcel);
                    return controllerEventPacket3;
                }
            }
            case 3: {
                return new ControllerButtonEvent(parcel);
            }
            case 2: {
                return new ControllerBatteryEvent(parcel);
            }
            case 1: {
                return new HeadTrackingState(parcel);
            }
            case 0: {
                return new ControllerAccelEvent(parcel);
            }
        }
    }
    
    public final Object[] newArray(final int n) {
        switch (this.a) {
            default: {
                return new UnguessableToken[n];
            }
            case 13: {
                return new VREventParcelable[n];
            }
            case 12: {
                return new ControllerTrackingStatusEvent[n];
            }
            case 11: {
                return new ControllerTouchEvent[n];
            }
            case 10: {
                return new ControllerRequest[n];
            }
            case 9: {
                return new ControllerPositionEvent[n];
            }
            case 8: {
                return new ControllerOrientationEvent[n];
            }
            case 7: {
                return new ControllerListenerOptions[n];
            }
            case 6: {
                return new ControllerGyroEvent[n];
            }
            case 5: {
                return new ControllerEventPacket2[n];
            }
            case 4: {
                return new ControllerEventPacket[n];
            }
            case 3: {
                return new ControllerButtonEvent[n];
            }
            case 2: {
                return new ControllerBatteryEvent[n];
            }
            case 1: {
                return new HeadTrackingState[n];
            }
            case 0: {
                return new ControllerAccelEvent[n];
            }
        }
    }
}
