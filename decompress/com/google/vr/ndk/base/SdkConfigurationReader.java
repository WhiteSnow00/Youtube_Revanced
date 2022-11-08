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
    public static final afor DEFAULT_PARAMS;
    static final afor REQUESTED_PARAMS;
    static afor sParams;
    
    static {
        final agza builder = ((agzi)afor.DEFAULT_INSTANCE).createBuilder();
        builder.copyOnWrite();
        final afor afor = (afor)builder.instance;
        afor.bitField0_ |= 0x2;
        afor.useSystemClockForSensorTimestamps_ = true;
        builder.copyOnWrite();
        final afor afor2 = (afor)builder.instance;
        afor2.bitField0_ |= 0x4;
        afor2.useMagnetometerInSensorFusion_ = true;
        builder.copyOnWrite();
        final afor afor3 = (afor)builder.instance;
        afor3.bitField0_ |= 0x200;
        afor3.useStationaryBiasCorrection_ = true;
        builder.copyOnWrite();
        final afor afor4 = (afor)builder.instance;
        afor4.bitField0_ |= 0x8;
        afor4.allowDynamicLibraryLoading_ = true;
        builder.copyOnWrite();
        final afor afor5 = (afor)builder.instance;
        afor5.bitField0_ |= 0x10;
        afor5.cpuLateLatchingEnabled_ = true;
        final afoo disabled = afoo.DISABLED;
        builder.copyOnWrite();
        final afor afor6 = (afor)builder.instance;
        afor6.daydreamImageAlignment_ = disabled.value;
        afor6.bitField0_ |= 0x20;
        final afol default_INSTANCE = afol.DEFAULT_INSTANCE;
        builder.copyOnWrite();
        final afor afor7 = (afor)builder.instance;
        default_INSTANCE.getClass();
        afor7.asyncReprojectionConfig_ = default_INSTANCE;
        afor7.bitField0_ |= 0x40;
        builder.copyOnWrite();
        final afor afor8 = (afor)builder.instance;
        afor8.bitField0_ |= 0x80;
        afor8.useOnlineMagnetometerCalibration_ = true;
        builder.copyOnWrite();
        final afor afor9 = (afor)builder.instance;
        afor9.bitField0_ |= 0x100;
        afor9.useDeviceIdleDetection_ = true;
        builder.copyOnWrite();
        final afor afor10 = (afor)builder.instance;
        afor10.bitField0_ |= 0x400;
        afor10.allowDynamicJavaLibraryLoading_ = true;
        builder.copyOnWrite();
        final afor afor11 = (afor)builder.instance;
        afor11.bitField0_ |= 0x800;
        afor11.touchOverlayEnabled_ = true;
        builder.copyOnWrite();
        final afor afor12 = (afor)builder.instance;
        afor12.bitField0_ |= 0x8000;
        afor12.enableForcedTrackingCompat_ = true;
        builder.copyOnWrite();
        final afor afor13 = (afor)builder.instance;
        afor13.bitField0_ |= 0x1000;
        afor13.allowVrcoreHeadTracking_ = true;
        builder.copyOnWrite();
        final afor afor14 = (afor)builder.instance;
        afor14.bitField0_ |= 0x2000;
        afor14.allowVrcoreCompositing_ = true;
        final afoq default_INSTANCE2 = afoq.DEFAULT_INSTANCE;
        builder.copyOnWrite();
        final afor afor15 = (afor)builder.instance;
        default_INSTANCE2.getClass();
        afor15.screenCaptureConfig_ = default_INSTANCE2;
        afor15.bitField0_ |= 0x10000;
        builder.copyOnWrite();
        final afor afor16 = (afor)builder.instance;
        afor16.bitField0_ |= 0x40000;
        afor16.dimUiLayer_ = true;
        builder.copyOnWrite();
        final afor afor17 = (afor)builder.instance;
        afor17.bitField0_ |= 0x20000;
        afor17.disallowMultiview_ = true;
        builder.copyOnWrite();
        final afor afor18 = (afor)builder.instance;
        afor18.bitField0_ |= 0x80000;
        afor18.useDirectModeSensors_ = true;
        builder.copyOnWrite();
        final afor afor19 = (afor)builder.instance;
        afor19.bitField0_ |= 0x100000;
        afor19.allowPassthrough_ = true;
        builder.copyOnWrite();
        afor.a((afor)builder.instance);
        REQUESTED_PARAMS = (afor)builder.build();
        final agza builder2 = ((agzi)afor.DEFAULT_INSTANCE).createBuilder();
        builder2.copyOnWrite();
        final afor afor20 = (afor)builder2.instance;
        afor20.bitField0_ |= 0x2;
        afor20.useSystemClockForSensorTimestamps_ = false;
        builder2.copyOnWrite();
        final afor afor21 = (afor)builder2.instance;
        afor21.bitField0_ |= 0x4;
        afor21.useMagnetometerInSensorFusion_ = false;
        builder2.copyOnWrite();
        final afor afor22 = (afor)builder2.instance;
        afor22.bitField0_ |= 0x200;
        afor22.useStationaryBiasCorrection_ = false;
        builder2.copyOnWrite();
        final afor afor23 = (afor)builder2.instance;
        afor23.bitField0_ |= 0x8;
        afor23.allowDynamicLibraryLoading_ = false;
        builder2.copyOnWrite();
        final afor afor24 = (afor)builder2.instance;
        afor24.bitField0_ |= 0x10;
        afor24.cpuLateLatchingEnabled_ = false;
        final afoo enabled_WITH_MEDIAN_FILTER = afoo.ENABLED_WITH_MEDIAN_FILTER;
        builder2.copyOnWrite();
        final afor afor25 = (afor)builder2.instance;
        afor25.daydreamImageAlignment_ = enabled_WITH_MEDIAN_FILTER.value;
        afor25.bitField0_ |= 0x20;
        builder2.copyOnWrite();
        final afor afor26 = (afor)builder2.instance;
        afor26.bitField0_ |= 0x80;
        afor26.useOnlineMagnetometerCalibration_ = false;
        builder2.copyOnWrite();
        final afor afor27 = (afor)builder2.instance;
        afor27.bitField0_ |= 0x100;
        afor27.useDeviceIdleDetection_ = false;
        builder2.copyOnWrite();
        final afor afor28 = (afor)builder2.instance;
        afor28.bitField0_ |= 0x400;
        afor28.allowDynamicJavaLibraryLoading_ = false;
        builder2.copyOnWrite();
        final afor afor29 = (afor)builder2.instance;
        afor29.bitField0_ |= 0x800;
        afor29.touchOverlayEnabled_ = false;
        builder2.copyOnWrite();
        final afor afor30 = (afor)builder2.instance;
        afor30.bitField0_ |= 0x8000;
        afor30.enableForcedTrackingCompat_ = false;
        builder2.copyOnWrite();
        final afor afor31 = (afor)builder2.instance;
        afor31.bitField0_ |= 0x1000;
        afor31.allowVrcoreHeadTracking_ = false;
        builder2.copyOnWrite();
        final afor afor32 = (afor)builder2.instance;
        afor32.bitField0_ |= 0x2000;
        afor32.allowVrcoreCompositing_ = false;
        builder2.copyOnWrite();
        final afor afor33 = (afor)builder2.instance;
        afor33.bitField0_ |= 0x40000;
        afor33.dimUiLayer_ = false;
        builder2.copyOnWrite();
        final afor afor34 = (afor)builder2.instance;
        afor34.bitField0_ |= 0x20000;
        afor34.disallowMultiview_ = false;
        builder2.copyOnWrite();
        final afor afor35 = (afor)builder2.instance;
        afor35.bitField0_ |= 0x80000;
        afor35.useDirectModeSensors_ = false;
        builder2.copyOnWrite();
        final afor afor36 = (afor)builder2.instance;
        afor36.bitField0_ |= 0x100000;
        afor36.allowPassthrough_ = false;
        builder2.copyOnWrite();
        afor.a((afor)builder2.instance);
        DEFAULT_PARAMS = (afor)builder2.build();
    }
    
    public static afor getParams(final Context context) {
        synchronized (SdkConfigurationReader.class) {
            final afor sParams = SdkConfigurationReader.sParams;
            if (sParams != null) {
                return sParams;
            }
            monitorexit(SdkConfigurationReader.class);
            final aral o = aqql.o(context);
            final afor paramsFromProvider = readParamsFromProvider(o);
            synchronized (SdkConfigurationReader.class) {
                SdkConfigurationReader.sParams = paramsFromProvider;
                monitorexit(SdkConfigurationReader.class);
                o.f();
                return SdkConfigurationReader.sParams;
            }
        }
    }
    
    private static afor readParamsFromProvider(final aral aral) {
        final SdkConfiguration$SdkConfigurationRequest$Builder builder = SdkConfiguration$SdkConfigurationRequest.newBuilder();
        builder.setRequestedParams(SdkConfigurationReader.REQUESTED_PARAMS);
        builder.setSdkVersion("1.218.0");
        afor afor = aral.a((SdkConfiguration$SdkConfigurationRequest)((agza)builder).build());
        if (afor == null) {
            Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
            afor = SdkConfigurationReader.DEFAULT_PARAMS;
        }
        else {
            afor.toString();
        }
        return afor;
    }
}
