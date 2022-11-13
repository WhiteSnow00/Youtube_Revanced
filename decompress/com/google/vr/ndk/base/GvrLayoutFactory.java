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
    public static ardt create(final Context context) {
        ardt ardt;
        if ((ardt = tryCreateFromVrCorePackage(context)) == null) {
            if (GvrApi.usingShimLibrary()) {
                throw new IllegalStateException("Client shim failed to load GvrLayout from VrCore.");
            }
            ardt = createFromCurrentPackage(context);
        }
        return ardt;
    }
    
    private static ardt createFromCurrentPackage(final Context context) {
        return (ardt)new GvrLayoutImplWrapper(new GvrLayoutImpl(context));
    }
    
    private static ardt tryCreateFromVrCorePackage(final Context context) {
        if ("com.google.vr.vrcore".equalsIgnoreCase(context.getPackageName())) {
            return createFromCurrentPackage(context);
        }
        Label_0165: {
            if (context instanceof arcz) {
                break Label_0165;
            }
            if (!GvrApi.usingDynamicLibrary(context)) {
                return null;
            }
            final afqs params = SdkConfigurationReader.getParams(context);
            Label_0163: {
                if ((params.bitField0_ & 0x400) == 0x0 || !params.allowDynamicJavaLibraryLoading_) {
                    if (!GvrApi.usingShimLibrary()) {
                        break Label_0163;
                    }
                }
                try {
                    if (VrCoreUtils.getVrCoreClientApiVersion(context) < 17) {
                        return null;
                    }
                    try {
                        final Context l = aqsx.l(context);
                        final area m = aqsx.m(context);
                        final ardz a = ObjectWrapper.a((Object)l);
                        final ardz a2 = ObjectWrapper.a((Object)context);
                        final Parcel qw = ((enz)m).qW();
                        eob.j(qw, (IInterface)a);
                        eob.j(qw, (IInterface)a2);
                        final Parcel qx = ((enz)m).qX(5, qw);
                        final ardt interface1 = ards.asInterface(qx.readStrongBinder());
                        qx.recycle();
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
                catch (final ardc ardc) {
                    return null;
                }
            }
        }
    }
}
