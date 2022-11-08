import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import android.os.IBinder;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import android.os.IInterface;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesQuery;
import android.os.Parcel;
import android.os.StrictMode$ThreadPolicy;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class moz
{
    static final mox a;
    static final mox b;
    private static final Object c;
    private static Context d;
    private static volatile mtr e;
    
    static {
        new mos(mtn.c("0\u0082\u0005\u00c80\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed"));
        new mot(mtn.c("0\u0082\u0006\u00040\u0082\u0003\u00ec \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad\u00d7\u00e1r\u00cak\u00ec"));
        a = (mox)new mou(mtn.c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));
        b = (mox)new mov(mtn.c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085¸l}\u00d3N\u00f50"));
        c = new Object();
    }
    
    static void a(final Context context) {
        synchronized (moz.class) {
            if (moz.d != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                return;
            }
            if (context != null) {
                moz.d = context.getApplicationContext();
            }
        }
    }
    
    static boolean b() {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                e();
                final mtr e = moz.e;
                final Parcel qr = ((eny)e).qR(7, ((eny)e).qQ());
                final boolean k = eoa.k(qr);
                qr.recycle();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return k;
            }
            finally {}
        }
        catch (final RemoteException ex) {}
        catch (final mvx mvx) {}
        final RemoteException ex;
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return false;
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }
    
    static mpa c(final String s, final mtn mtn, final boolean b, final boolean b2) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        mpa b3;
        try {
            try {
                e();
                kgk.aL((Object)moz.d);
                final GoogleCertificatesQuery googleCertificatesQuery = new GoogleCertificatesQuery(s, mtn, b, b2);
                try {
                    final mtr e = moz.e;
                    final mvn a = mvm.a((Object)moz.d.getPackageManager());
                    final Parcel qq = ((eny)e).qQ();
                    eoa.h(qq, (Parcelable)googleCertificatesQuery);
                    eoa.j(qq, (IInterface)a);
                    final Parcel qr = ((eny)e).qR(5, qq);
                    final boolean k = eoa.k(qr);
                    qr.recycle();
                    if (k) {
                        final mpa a2 = mpa.a;
                    }
                    final mpa mpa = new mpa(false);
                }
                catch (final RemoteException ex) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                    mpa.b();
                }
            }
            finally {}
        }
        catch (final mvx mvx) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)mvx);
            mvx.getMessage();
            b3 = mpa.b();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return b3;
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }
    
    static mpa d(final String s, final boolean b) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            kgk.aL((Object)moz.d);
            mpa mpa;
            try {
                e();
                final GoogleCertificatesLookupQuery googleCertificatesLookupQuery = new GoogleCertificatesLookupQuery(s, b, false, (IBinder)mvm.a((Object)moz.d), false, true);
                try {
                    final mtr e = moz.e;
                    final Parcel qq = ((eny)e).qQ();
                    eoa.h(qq, (Parcelable)googleCertificatesLookupQuery);
                    final Parcel qr = ((eny)e).qR(6, qq);
                    final GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse)eoa.a(qr, GoogleCertificatesLookupResponse.CREATOR);
                    qr.recycle();
                    if (googleCertificatesLookupResponse.a) {
                        googleCertificatesLookupResponse.b();
                        mpa = new mpa(true);
                    }
                    else {
                        final String b2 = googleCertificatesLookupResponse.b;
                        if (googleCertificatesLookupResponse.a() == 4) {
                            new PackageManager$NameNotFoundException();
                        }
                        googleCertificatesLookupResponse.b();
                        googleCertificatesLookupResponse.a();
                        mpa = new mpa(false);
                    }
                }
                catch (final RemoteException ex) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                    mpa = mpa.b();
                }
            }
            catch (final mvx mvx) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)mvx);
                mvx.getMessage();
                mpa = mpa.b();
            }
            return mpa;
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    private static void e() {
        if (moz.e != null) {
            return;
        }
        kgk.aL((Object)moz.d);
        synchronized (moz.c) {
            if (moz.e == null) {
                final IBinder d = mwb.e(moz.d, mwb.c, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl");
                mtr e;
                if (d == null) {
                    e = null;
                }
                else {
                    final IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof mtr) {
                        e = (mtr)queryLocalInterface;
                    }
                    else {
                        e = new mtr(d);
                    }
                }
                moz.e = e;
            }
        }
    }
}
