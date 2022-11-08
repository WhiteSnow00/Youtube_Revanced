import java.io.Serializable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import android.content.Intent;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.common.api.Status;
import android.app.PendingIntent;
import com.google.android.gms.common.data.BitmapTeleporter;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import android.database.CursorWindow;
import com.google.android.gms.common.images.WebImage;
import android.net.Uri;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.Feature;
import android.os.Bundle;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.IBinder;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.ConnectionResult;
import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mob implements Parcelable$Creator
{
    private final /* synthetic */ int a;
    
    public mob(final int a) {
        this.a = a;
    }
    
    public static void a(final GetServiceRequest getServiceRequest, final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.O(parcel, 1, getServiceRequest.c);
        kgk.O(parcel, 2, getServiceRequest.d);
        kgk.O(parcel, 3, getServiceRequest.e);
        kgk.ac(parcel, 4, getServiceRequest.f);
        kgk.U(parcel, 5, getServiceRequest.g);
        kgk.af(parcel, 6, (Parcelable[])getServiceRequest.h, n);
        kgk.R(parcel, 7, getServiceRequest.i);
        kgk.ab(parcel, 8, (Parcelable)getServiceRequest.j, n);
        kgk.af(parcel, 10, (Parcelable[])getServiceRequest.k, n);
        kgk.af(parcel, 11, (Parcelable[])getServiceRequest.l, n);
        kgk.K(parcel, 12, getServiceRequest.m);
        kgk.O(parcel, 13, getServiceRequest.n);
        kgk.K(parcel, 14, getServiceRequest.o);
        kgk.ac(parcel, 15, getServiceRequest.p);
        kgk.J(parcel, i);
    }
}
