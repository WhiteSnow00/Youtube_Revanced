import android.os.Parcelable;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ardd extends eoa implements arde
{
    public ardd() {
        super("com.google.vr.vrcore.common.api.IDaydreamListener");
    }
    
    protected boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int int1) {
        switch (n) {
            default: {
                return false;
            }
            case 10: {
                int1 = parcel.readInt();
                final long long1 = parcel.readLong();
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.applyColorfulFade(int1, long1, n);
                break;
            }
            case 9: {
                final float float1 = parcel.readFloat();
                final float float2 = parcel.readFloat();
                final float float3 = parcel.readFloat();
                this.enforceNoDataAvail(parcel);
                this.setLensOffset(float1, float2, float3);
                break;
            }
            case 8: {
                final float float4 = parcel.readFloat();
                final float float5 = parcel.readFloat();
                final float float6 = parcel.readFloat();
                final float float7 = parcel.readFloat();
                this.enforceNoDataAvail(parcel);
                this.deprecated_setLensOffsets(float4, float5, float6, float7);
                break;
            }
            case 7: {
                this.invokeCloseAction();
                break;
            }
            case 6: {
                final HeadTrackingState headTrackingState = (HeadTrackingState)eob.a(parcel, HeadTrackingState.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.resumeHeadTracking(headTrackingState);
                break;
            }
            case 5: {
                this.dumpDebugData();
                break;
            }
            case 4: {
                this.recenterHeadTracking();
                break;
            }
            case 3: {
                n = parcel.readInt();
                final long long2 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.applyFade(n, long2);
                break;
            }
            case 2: {
                final HeadTrackingState requestStopTracking = this.requestStopTracking();
                parcel2.writeNoException();
                eob.i(parcel2, (Parcelable)requestStopTracking);
                break;
            }
            case 1: {
                parcel2.writeNoException();
                parcel2.writeInt(25);
                break;
            }
        }
        return true;
    }
}
