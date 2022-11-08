import java.io.Serializable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LastLocationRequest;
import android.location.Location;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.LocationReceiver;
import java.util.List;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.internal.ClientIdentity;
import android.os.IBinder;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestInternal;
import android.app.PendingIntent;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncResult;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.mobiledataplan.CellularInfo;
import android.os.Bundle;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.EventParcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nam implements Parcelable$Creator
{
    private final /* synthetic */ int a;
    
    public nam(final int a) {
        this.a = a;
    }
    
    public static void a(final EventParcel eventParcel, final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, eventParcel.a);
        kgk.ab(parcel, 3, (Parcelable)eventParcel.b, n);
        kgk.ac(parcel, 4, eventParcel.c);
        kgk.P(parcel, 5, eventParcel.d);
        kgk.J(parcel, i);
    }
    
    public static void b(final UserAttributeParcel userAttributeParcel, final Parcel parcel) {
        final int i = kgk.I(parcel);
        kgk.O(parcel, 1, userAttributeParcel.a);
        kgk.ac(parcel, 2, userAttributeParcel.b);
        kgk.P(parcel, 3, userAttributeParcel.c);
        kgk.aa(parcel, 4, userAttributeParcel.d);
        kgk.ac(parcel, 6, userAttributeParcel.e);
        kgk.ac(parcel, 7, userAttributeParcel.f);
        final Double g = userAttributeParcel.g;
        if (g != null) {
            kgk.N(parcel, 8, 8);
            parcel.writeDouble((double)g);
        }
        kgk.J(parcel, i);
    }
}
