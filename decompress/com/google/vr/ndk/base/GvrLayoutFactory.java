// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.Parcel;
import android.util.Log;
import android.os.IInterface;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import android.content.Context;

public class GvrLayoutFactory
{
    public static arbf create(final Context context) {
        arbf arbf;
        if ((arbf = tryCreateFromVrCorePackage(context)) == null) {
            if (GvrApi.usingShimLibrary()) {
                throw new IllegalStateException("Client shim failed to load GvrLayout from VrCore.");
            }
            arbf = createFromCurrentPackage(context);
        }
        return arbf;
    }
    
    private static arbf createFromCurrentPackage(final Context context) {
        return (arbf)new GvrLayoutImplWrapper(new GvrLayoutImpl(context));
    }
    
    private static arbf tryCreateFromVrCorePackage(final Context context) {
        if ("com.google.vr.vrcore".equalsIgnoreCase(context.getPackageName())) {
            return createFromCurrentPackage(context);
        }
        Label_0163: {
            if (context instanceof arak) {
                break Label_0163;
            }
            if (!GvrApi.usingDynamicLibrary(context)) {
                return null;
            }
            final afor params = SdkConfigurationReader.getParams(context);
            Label_0161: {
                if ((params.bitField0_ & 0x400) == 0x0 || !params.allowDynamicJavaLibraryLoading_) {
                    if (!GvrApi.usingShimLibrary()) {
                        break Label_0161;
                    }
                }
                try {
                    if (VrCoreUtils.getVrCoreClientApiVersion(context) < 17) {
                        return null;
                    }
                    try {
                        final Context k = aqql.k(context);
                        final arbm l = aqql.l(context);
                        final arbl a = ObjectWrapper.a((Object)k);
                        final arbl a2 = ObjectWrapper.a((Object)context);
                        final Parcel qq = ((eny)l).qQ();
                        eoa.j(qq, (IInterface)a);
                        eoa.j(qq, (IInterface)a2);
                        final Parcel qr = ((eny)l).qR(5, qq);
                        final arbf interface1 = arbe.asInterface(qr.readStrongBinder());
                        qr.recycle();
                        if (interface1 == null) {
                            Log.w("GvrLayoutFactory", "GvrLayout creation from VrCore failed.");
                        }
                        return interface1;
                    }
                    catch (final Exception ex) {
                        Log.e("GvrLayoutFactory", "Failed to load GvrLayout from VrCore:\n  ".concat(ex.toString()));
                    }
                    return null;
                    throw new IllegalArgumentException("VrContextWrapper only supported within VrCore.");
                }
                catch (final aran aran) {
                    return null;
                }
            }
        }
    }
}
