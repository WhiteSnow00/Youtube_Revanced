import com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks;
import android.os.Parcelable;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import java.lang.ref.WeakReference;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argi extends eod implements IInterface
{
    private final int a;
    private final Object b;
    
    public argi(final aevn aevn, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        super("com.google.vr.vrcore.controller.api.IControllerListener");
        this.b = new WeakReference(aevn);
    }
    
    public argi(final ControllerServiceBridge controllerServiceBridge, final int a) {
        this.a = a;
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
        this.b = new WeakReference(controllerServiceBridge);
    }
    
    public argi(final noj b, final int a, final byte[] array) {
        this.a = a;
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.b = b;
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int n2) {
        n2 = this.a;
        boolean b = false;
        final boolean b2 = false;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n != 1) {
                    boolean b3;
                    if (n != 2) {
                        b3 = b2;
                    }
                    else {
                        n = parcel.readInt();
                        this.enforceNoDataAvail(parcel);
                        final ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge)((WeakReference)this.b).get();
                        if (controllerServiceBridge != null && n == 1) {
                            controllerServiceBridge.b.post((Runnable)new arfq(controllerServiceBridge, 4));
                            return true;
                        }
                        b3 = true;
                    }
                    return b3;
                }
                parcel2.writeNoException();
                parcel2.writeInt(25);
                return true;
            }
            else {
                switch (n) {
                    default: {
                        return false;
                    }
                    case 16: {
                        final Status status = (Status)eoe.a(parcel, Status.CREATOR);
                        final long long1 = parcel.readLong();
                        this.enforceNoDataAvail(parcel);
                        kht.bf(status, (Object)long1, (noj)this.b);
                        return true;
                    }
                    case 15: {
                        final Status status2 = (Status)eoe.a(parcel, Status.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.be(status2, (noj)this.b);
                        return true;
                    }
                    case 14: {
                        final Status status3 = (Status)eoe.a(parcel, Status.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.be(status3, (noj)this.b);
                        return true;
                    }
                    case 13: {
                        final Status status4 = (Status)eoe.a(parcel, Status.CREATOR);
                        final FlagOverrides flagOverrides = (FlagOverrides)eoe.a(parcel, FlagOverrides.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.bf(status4, (Object)flagOverrides, (noj)this.b);
                        return true;
                    }
                    case 12: {
                        final Status status5 = (Status)eoe.a(parcel, Status.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.be(status5, (noj)this.b);
                        return true;
                    }
                    case 11: {
                        final Status status6 = (Status)eoe.a(parcel, Status.CREATOR);
                        final long long2 = parcel.readLong();
                        this.enforceNoDataAvail(parcel);
                        kht.bf(status6, (Object)long2, (noj)this.b);
                        return true;
                    }
                    case 10: {
                        final Status status7 = (Status)eoe.a(parcel, Status.CREATOR);
                        final Configurations configurations = (Configurations)eoe.a(parcel, Configurations.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.bf(status7, (Object)configurations, (noj)this.b);
                        return true;
                    }
                    case 9: {
                        final Status status8 = (Status)eoe.a(parcel, Status.CREATOR);
                        final Flag flag = (Flag)eoe.a(parcel, Flag.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.bf(status8, (Object)flag, (noj)this.b);
                        return true;
                    }
                    case 8: {
                        final Status status9 = (Status)eoe.a(parcel, Status.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.be(status9, (noj)this.b);
                        return true;
                    }
                    case 7: {
                        final Status status10 = (Status)eoe.a(parcel, Status.CREATOR);
                        final DogfoodsToken dogfoodsToken = (DogfoodsToken)eoe.a(parcel, DogfoodsToken.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.bf(status10, (Object)dogfoodsToken, (noj)this.b);
                        return true;
                    }
                    case 6: {
                        final Status status11 = (Status)eoe.a(parcel, Status.CREATOR);
                        final ExperimentTokens experimentTokens = (ExperimentTokens)eoe.a(parcel, ExperimentTokens.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.bf(status11, (Object)experimentTokens, (noj)this.b);
                        return true;
                    }
                    case 5: {
                        final Status status12 = (Status)eoe.a(parcel, Status.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.be(status12, (noj)this.b);
                        return true;
                    }
                    case 4: {
                        final Status status13 = (Status)eoe.a(parcel, Status.CREATOR);
                        final Configurations configurations2 = (Configurations)eoe.a(parcel, Configurations.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.bf(status13, (Object)configurations2, (noj)this.b);
                        return true;
                    }
                    case 3: {
                        final Status status14 = (Status)eoe.a(parcel, Status.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.be(status14, (noj)this.b);
                        return true;
                    }
                    case 2: {
                        final Status status15 = (Status)eoe.a(parcel, Status.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.be(status15, (noj)this.b);
                        return true;
                    }
                    case 1: {
                        final Status status16 = (Status)eoe.a(parcel, Status.CREATOR);
                        this.enforceNoDataAvail(parcel);
                        kht.be(status16, (noj)this.b);
                        return true;
                    }
                }
            }
        }
        else {
            if (n != 1) {
                if (n != 2) {
                    switch (n) {
                        default: {
                            return b;
                        }
                        case 12: {
                            final ControllerEventPacket2 controllerEventPacket2 = (ControllerEventPacket2)eoe.a(parcel, ControllerEventPacket2.CREATOR);
                            this.enforceNoDataAvail(parcel);
                            final aevn aevn = (aevn)((WeakReference)this.b).get();
                            if (aevn == null) {
                                break;
                            }
                            n = ControllerServiceBridge.h;
                            if (controllerEventPacket2.g != 0L) {
                                final long n3 = ControllerEventPacket2.a() - controllerEventPacket2.g;
                                if (n3 > 300L) {
                                    final StringBuilder sb = new StringBuilder("Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: ");
                                    sb.append(n3);
                                    Log.w("VrCtl.ServiceBridge", sb.toString());
                                }
                            }
                            ((ControllerEventPacket)controllerEventPacket2).e(aevn.a);
                            ((ControllerServiceBridge$Callbacks)aevn.b).onControllerEventPacket2(controllerEventPacket2);
                            ((ControllerEventPacket)controllerEventPacket2).d();
                            break;
                        }
                        case 11: {
                            final ControllerOrientationEvent controllerOrientationEvent = (ControllerOrientationEvent)eoe.a(parcel, ControllerOrientationEvent.CREATOR);
                            this.enforceNoDataAvail(parcel);
                            final aevn aevn2 = (aevn)((WeakReference)this.b).get();
                            if (aevn2 == null) {
                                break;
                            }
                            controllerOrientationEvent.e = aevn2.a;
                            ((ControllerServiceBridge$Callbacks)aevn2.b).onControllerRecentered(controllerOrientationEvent);
                            return true;
                        }
                        case 10: {
                            final ControllerEventPacket controllerEventPacket3 = (ControllerEventPacket)eoe.a(parcel, ControllerEventPacket.CREATOR);
                            this.enforceNoDataAvail(parcel);
                            final aevn aevn3 = (aevn)((WeakReference)this.b).get();
                            if (aevn3 == null) {
                                break;
                            }
                            controllerEventPacket3.e(aevn3.a);
                            ((ControllerServiceBridge$Callbacks)aevn3.b).onControllerEventPacket(controllerEventPacket3);
                            controllerEventPacket3.d();
                            return true;
                        }
                        case 9: {
                            final aevn aevn4 = (aevn)((WeakReference)this.b).get();
                            Object c;
                            if (aevn4 == null) {
                                c = null;
                            }
                            else {
                                c = aevn4.c;
                            }
                            parcel2.writeNoException();
                            eoe.i(parcel2, (Parcelable)c);
                            break;
                        }
                    }
                }
                else {
                    n = parcel.readInt();
                    n2 = parcel.readInt();
                    this.enforceNoDataAvail(parcel);
                    final aevn aevn5 = (aevn)((WeakReference)this.b).get();
                    if (aevn5 != null) {
                        ((ControllerServiceBridge$Callbacks)aevn5.b).onControllerStateChanged(n, n2);
                        return true;
                    }
                }
                b = true;
                return b;
            }
            parcel2.writeNoException();
            parcel2.writeInt(25);
            return true;
        }
    }
}
