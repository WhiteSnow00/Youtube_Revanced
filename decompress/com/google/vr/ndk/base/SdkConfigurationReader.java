// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest$Builder;
import android.util.Log;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
import android.content.Context;

public class SdkConfigurationReader
{
    public static final afqs DEFAULT_PARAMS;
    static final afqs REQUESTED_PARAMS;
    static afqs sParams;
    
    static {
        final ahaz builder = ((ahbh)afqs.DEFAULT_INSTANCE).createBuilder();
        builder.copyOnWrite();
        final afqs afqs = (afqs)builder.instance;
        afqs.bitField0_ |= 0x2;
        afqs.useSystemClockForSensorTimestamps_ = true;
        builder.copyOnWrite();
        final afqs afqs2 = (afqs)builder.instance;
        afqs2.bitField0_ |= 0x4;
        afqs2.useMagnetometerInSensorFusion_ = true;
        builder.copyOnWrite();
        final afqs afqs3 = (afqs)builder.instance;
        afqs3.bitField0_ |= 0x200;
        afqs3.useStationaryBiasCorrection_ = true;
        builder.copyOnWrite();
        final afqs afqs4 = (afqs)builder.instance;
        afqs4.bitField0_ |= 0x8;
        afqs4.allowDynamicLibraryLoading_ = true;
        builder.copyOnWrite();
        final afqs afqs5 = (afqs)builder.instance;
        afqs5.bitField0_ |= 0x10;
        afqs5.cpuLateLatchingEnabled_ = true;
        final afqp disabled = afqp.DISABLED;
        builder.copyOnWrite();
        final afqs afqs6 = (afqs)builder.instance;
        afqs6.daydreamImageAlignment_ = disabled.value;
        afqs6.bitField0_ |= 0x20;
        final afqm default_INSTANCE = afqm.DEFAULT_INSTANCE;
        builder.copyOnWrite();
        final afqs afqs7 = (afqs)builder.instance;
        default_INSTANCE.getClass();
        afqs7.asyncReprojectionConfig_ = default_INSTANCE;
        afqs7.bitField0_ |= 0x40;
        builder.copyOnWrite();
        final afqs afqs8 = (afqs)builder.instance;
        afqs8.bitField0_ |= 0x80;
        afqs8.useOnlineMagnetometerCalibration_ = true;
        builder.copyOnWrite();
        final afqs afqs9 = (afqs)builder.instance;
        afqs9.bitField0_ |= 0x100;
        afqs9.useDeviceIdleDetection_ = true;
        builder.copyOnWrite();
        final afqs afqs10 = (afqs)builder.instance;
        afqs10.bitField0_ |= 0x400;
        afqs10.allowDynamicJavaLibraryLoading_ = true;
        builder.copyOnWrite();
        final afqs afqs11 = (afqs)builder.instance;
        afqs11.bitField0_ |= 0x800;
        afqs11.touchOverlayEnabled_ = true;
        builder.copyOnWrite();
        final afqs afqs12 = (afqs)builder.instance;
        afqs12.bitField0_ |= 0x8000;
        afqs12.enableForcedTrackingCompat_ = true;
        builder.copyOnWrite();
        final afqs afqs13 = (afqs)builder.instance;
        afqs13.bitField0_ |= 0x1000;
        afqs13.allowVrcoreHeadTracking_ = true;
        builder.copyOnWrite();
        final afqs afqs14 = (afqs)builder.instance;
        afqs14.bitField0_ |= 0x2000;
        afqs14.allowVrcoreCompositing_ = true;
        final afqr default_INSTANCE2 = afqr.DEFAULT_INSTANCE;
        builder.copyOnWrite();
        final afqs afqs15 = (afqs)builder.instance;
        default_INSTANCE2.getClass();
        afqs15.screenCaptureConfig_ = default_INSTANCE2;
        afqs15.bitField0_ |= 0x10000;
        builder.copyOnWrite();
        final afqs afqs16 = (afqs)builder.instance;
        afqs16.bitField0_ |= 0x40000;
        afqs16.dimUiLayer_ = true;
        builder.copyOnWrite();
        final afqs afqs17 = (afqs)builder.instance;
        afqs17.bitField0_ |= 0x20000;
        afqs17.disallowMultiview_ = true;
        builder.copyOnWrite();
        final afqs afqs18 = (afqs)builder.instance;
        afqs18.bitField0_ |= 0x80000;
        afqs18.useDirectModeSensors_ = true;
        builder.copyOnWrite();
        final afqs afqs19 = (afqs)builder.instance;
        afqs19.bitField0_ |= 0x100000;
        afqs19.allowPassthrough_ = true;
        builder.copyOnWrite();
        afqs.a((afqs)builder.instance);
        REQUESTED_PARAMS = (afqs)builder.build();
        final ahaz builder2 = ((ahbh)afqs.DEFAULT_INSTANCE).createBuilder();
        builder2.copyOnWrite();
        final afqs afqs20 = (afqs)builder2.instance;
        afqs20.bitField0_ |= 0x2;
        afqs20.useSystemClockForSensorTimestamps_ = false;
        builder2.copyOnWrite();
        final afqs afqs21 = (afqs)builder2.instance;
        afqs21.bitField0_ |= 0x4;
        afqs21.useMagnetometerInSensorFusion_ = false;
        builder2.copyOnWrite();
        final afqs afqs22 = (afqs)builder2.instance;
        afqs22.bitField0_ |= 0x200;
        afqs22.useStationaryBiasCorrection_ = false;
        builder2.copyOnWrite();
        final afqs afqs23 = (afqs)builder2.instance;
        afqs23.bitField0_ |= 0x8;
        afqs23.allowDynamicLibraryLoading_ = false;
        builder2.copyOnWrite();
        final afqs afqs24 = (afqs)builder2.instance;
        afqs24.bitField0_ |= 0x10;
        afqs24.cpuLateLatchingEnabled_ = false;
        final afqp enabled_WITH_MEDIAN_FILTER = afqp.ENABLED_WITH_MEDIAN_FILTER;
        builder2.copyOnWrite();
        final afqs afqs25 = (afqs)builder2.instance;
        afqs25.daydreamImageAlignment_ = enabled_WITH_MEDIAN_FILTER.value;
        afqs25.bitField0_ |= 0x20;
        builder2.copyOnWrite();
        final afqs afqs26 = (afqs)builder2.instance;
        afqs26.bitField0_ |= 0x80;
        afqs26.useOnlineMagnetometerCalibration_ = false;
        builder2.copyOnWrite();
        final afqs afqs27 = (afqs)builder2.instance;
        afqs27.bitField0_ |= 0x100;
        afqs27.useDeviceIdleDetection_ = false;
        builder2.copyOnWrite();
        final afqs afqs28 = (afqs)builder2.instance;
        afqs28.bitField0_ |= 0x400;
        afqs28.allowDynamicJavaLibraryLoading_ = false;
        builder2.copyOnWrite();
        final afqs afqs29 = (afqs)builder2.instance;
        afqs29.bitField0_ |= 0x800;
        afqs29.touchOverlayEnabled_ = false;
        builder2.copyOnWrite();
        final afqs afqs30 = (afqs)builder2.instance;
        afqs30.bitField0_ |= 0x8000;
        afqs30.enableForcedTrackingCompat_ = false;
        builder2.copyOnWrite();
        final afqs afqs31 = (afqs)builder2.instance;
        afqs31.bitField0_ |= 0x1000;
        afqs31.allowVrcoreHeadTracking_ = false;
        builder2.copyOnWrite();
        final afqs afqs32 = (afqs)builder2.instance;
        afqs32.bitField0_ |= 0x2000;
        afqs32.allowVrcoreCompositing_ = false;
        builder2.copyOnWrite();
        final afqs afqs33 = (afqs)builder2.instance;
        afqs33.bitField0_ |= 0x40000;
        afqs33.dimUiLayer_ = false;
        builder2.copyOnWrite();
        final afqs afqs34 = (afqs)builder2.instance;
        afqs34.bitField0_ |= 0x20000;
        afqs34.disallowMultiview_ = false;
        builder2.copyOnWrite();
        final afqs afqs35 = (afqs)builder2.instance;
        afqs35.bitField0_ |= 0x80000;
        afqs35.useDirectModeSensors_ = false;
        builder2.copyOnWrite();
        final afqs afqs36 = (afqs)builder2.instance;
        afqs36.bitField0_ |= 0x100000;
        afqs36.allowPassthrough_ = false;
        builder2.copyOnWrite();
        afqs.a((afqs)builder2.instance);
        DEFAULT_PARAMS = (afqs)builder2.build();
    }
    
    public static afqs getParams(final Context context) {
        synchronized (SdkConfigurationReader.class) {
            final afqs sParams = SdkConfigurationReader.sParams;
            if (sParams != null) {
                return sParams;
            }
            monitorexit(SdkConfigurationReader.class);
            final arda p = aqsx.p(context);
            final afqs paramsFromProvider = readParamsFromProvider(p);
            synchronized (SdkConfigurationReader.class) {
                SdkConfigurationReader.sParams = paramsFromProvider;
                monitorexit(SdkConfigurationReader.class);
                p.f();
                return SdkConfigurationReader.sParams;
            }
        }
    }
    
    private static afqs readParamsFromProvider(final arda arda) {
        final SdkConfiguration$SdkConfigurationRequest$Builder builder = SdkConfiguration$SdkConfigurationRequest.newBuilder();
        builder.setRequestedParams(SdkConfigurationReader.REQUESTED_PARAMS);
        builder.setSdkVersion("1.219.0");
        afqs afqs = arda.a((SdkConfiguration$SdkConfigurationRequest)((ahaz)builder).build());
        if (afqs == null) {
            Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
            afqs = SdkConfigurationReader.DEFAULT_PARAMS;
        }
        else {
            afqs.toString();
        }
        return afqs;
    }
}
