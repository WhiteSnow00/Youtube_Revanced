// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.cardboard;

import android.os.IBinder;
import android.os.Parcel;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import android.os.RemoteException;
import android.os.IInterface;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import android.util.Log;
import com.google.vr.ndk.base.Version;
import android.content.Context;

public class VrCoreLibraryLoader
{
    public static long loadNativeDlsymMethod(final Context context) {
        return 0L;
    }
    
    public static long loadNativeGvrLibrary(final Context context) {
        return loadNativeGvrLibrary(context, Version.MIN, Version.CURRENT);
    }
    
    public static long loadNativeGvrLibrary(final Context ex, final Version version, final Version version2) {
        try {
            try {
                final ApplicationInfo applicationInfo = ((Context)ex).getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
                if (applicationInfo == null) {
                    throw new aran(8);
                }
                if (!applicationInfo.enabled) {
                    throw new aran(2);
                }
                if (applicationInfo.metaData == null) {
                    throw new aran(4);
                }
                final String string = applicationInfo.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                if (string.isEmpty()) {
                    throw new aran(4);
                }
                final String substring = string.substring(1);
                final Version parse = Version.parse(substring);
                if (parse == null) {
                    throw new aran(4);
                }
                if (!parse.isAtLeast(version)) {
                    Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", substring, version.toString()));
                    throw new aran(4);
                }
                final Context k = aqql.k((Context)ex);
                aqql.k((Context)ex);
                final int a = aqql.a;
                final arbm l = aqql.l((Context)ex);
                final arbl a2 = ObjectWrapper.a((Object)k);
                final arbl a3 = ObjectWrapper.a((Object)ex);
                final Parcel qq = ((eny)l).qQ();
                eoa.j(qq, (IInterface)a2);
                eoa.j(qq, (IInterface)a3);
                final Parcel qr = ((eny)l).qR(4, qq);
                final IBinder strongBinder = qr.readStrongBinder();
                Object o;
                if (strongBinder == null) {
                    o = null;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
                    if (queryLocalInterface instanceof arbn) {
                        o = queryLocalInterface;
                    }
                    else {
                        o = new arbn(strongBinder);
                    }
                }
                qr.recycle();
                if (o == null) {
                    Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                    return 0L;
                }
                if (a < 19) {
                    final int majorVersion = version2.majorVersion;
                    final int minorVersion = version2.minorVersion;
                    final int patchVersion = version2.patchVersion;
                    final Parcel qq2 = ((eny)o).qQ();
                    qq2.writeInt(majorVersion);
                    qq2.writeInt(minorVersion);
                    qq2.writeInt(patchVersion);
                    final Parcel qr2 = ((eny)o).qR(2, qq2);
                    final long long1 = qr2.readLong();
                    qr2.recycle();
                    return long1;
                }
                final String string2 = version.toString();
                final String string3 = version2.toString();
                final Parcel qq3 = ((eny)o).qQ();
                qq3.writeString(string2);
                qq3.writeString(string3);
                final Parcel qr3 = ((eny)o).qR(5, qq3);
                final long long2 = qr3.readLong();
                qr3.recycle();
                return long2;
            }
            catch (final RemoteException ex) {}
            catch (final UnsatisfiedLinkError ex) {}
            catch (final SecurityException ex) {}
            catch (final IllegalStateException ex) {}
            catch (final IllegalArgumentException ex) {}
            catch (final aran ex) {}
        }
        catch (final PackageManager$NameNotFoundException ex2) {
            throw new aran(VrCoreUtils.a((Context)ex));
        }
        Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(ex.toString()));
        return 0L;
    }
}
