import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afor extends agzi implements ahax
{
    public static final int ALLOW_DYNAMIC_JAVA_LIBRARY_LOADING_FIELD_NUMBER = 11;
    public static final int ALLOW_DYNAMIC_LIBRARY_LOADING_FIELD_NUMBER = 4;
    public static final int ALLOW_HIGH_PRIORITY_APP_RENDER_THREAD_FIELD_NUMBER = 22;
    public static final int ALLOW_PASSTHROUGH_FIELD_NUMBER = 21;
    public static final int ALLOW_VRCORE_COMPOSITING_FIELD_NUMBER = 14;
    public static final int ALLOW_VRCORE_HEAD_TRACKING_FIELD_NUMBER = 13;
    public static final int ASYNC_REPROJECTION_CONFIG_FIELD_NUMBER = 7;
    public static final int CPU_LATE_LATCHING_ENABLED_FIELD_NUMBER = 5;
    public static final int DAYDREAM_IMAGE_ALIGNMENT_ENABLED_FIELD_NUMBER = 1;
    public static final int DAYDREAM_IMAGE_ALIGNMENT_FIELD_NUMBER = 6;
    public static final afor DEFAULT_INSTANCE;
    public static final int DIM_UI_LAYER_FIELD_NUMBER = 19;
    public static final int DISALLOW_MULTIVIEW_FIELD_NUMBER = 18;
    public static final int ENABLE_FORCED_TRACKING_COMPAT_FIELD_NUMBER = 16;
    private static volatile ahbe PARSER;
    public static final int PERFORMANCE_OVERLAY_INFO_FIELD_NUMBER = 15;
    public static final int SCREEN_CAPTURE_CONFIG_FIELD_NUMBER = 17;
    public static final int TOUCH_OVERLAY_ENABLED_FIELD_NUMBER = 12;
    public static final int USE_DEVICE_IDLE_DETECTION_FIELD_NUMBER = 9;
    public static final int USE_DIRECT_MODE_SENSORS_FIELD_NUMBER = 20;
    public static final int USE_MAGNETOMETER_IN_SENSOR_FUSION_FIELD_NUMBER = 3;
    public static final int USE_ONLINE_MAGNETOMETER_CALIBRATION_FIELD_NUMBER = 8;
    public static final int USE_STATIONARY_BIAS_CORRECTION_FIELD_NUMBER = 10;
    public static final int USE_SYSTEM_CLOCK_FOR_SENSOR_TIMESTAMPS_FIELD_NUMBER = 2;
    public boolean allowDynamicJavaLibraryLoading_;
    public boolean allowDynamicLibraryLoading_;
    private boolean allowHighPriorityAppRenderThread_;
    public boolean allowPassthrough_;
    public boolean allowVrcoreCompositing_;
    public boolean allowVrcoreHeadTracking_;
    public afol asyncReprojectionConfig_;
    public int bitField0_;
    public boolean cpuLateLatchingEnabled_;
    private boolean daydreamImageAlignmentEnabled_;
    public int daydreamImageAlignment_;
    public boolean dimUiLayer_;
    public boolean disallowMultiview_;
    public boolean enableForcedTrackingCompat_;
    private afop performanceOverlayInfo_;
    public afoq screenCaptureConfig_;
    public boolean touchOverlayEnabled_;
    public boolean useDeviceIdleDetection_;
    public boolean useDirectModeSensors_;
    public boolean useMagnetometerInSensorFusion_;
    public boolean useOnlineMagnetometerCalibration_;
    public boolean useStationaryBiasCorrection_;
    public boolean useSystemClockForSensorTimestamps_;
    
    static {
        agzi.registerDefaultInstance(afor.class, DEFAULT_INSTANCE = new afor());
    }
    
    private afor() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe parser;
                if ((parser = afor.PARSER) == null) {
                    synchronized (afor.class) {
                        if (afor.PARSER == null) {
                            afor.PARSER = (ahbe)new agzb((agzi)afor.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return afor.DEFAULT_INSTANCE;
            }
            case 4: {
                return new agza((agzi)afor.DEFAULT_INSTANCE);
            }
            case 3: {
                return new afor();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afor.DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u100c\u0005\u0007\u1009\u0006\b\u1007\u0007\t\u1007\b\n\u1007\t\u000b\u1007\n\f\u1007\u000b\r\u1007\f\u000e\u1007\r\u000f\u1009\u000e\u0010\u1007\u000f\u0011\u1009\u0010\u0012\u1007\u0011\u0013\u1007\u0012\u0014\u1007\u0013\u0015\u1007\u0014\u0016\u1007\u0015", new Object[] { "bitField0_", "daydreamImageAlignmentEnabled_", "useSystemClockForSensorTimestamps_", "useMagnetometerInSensorFusion_", "allowDynamicLibraryLoading_", "cpuLateLatchingEnabled_", "daydreamImageAlignment_", afoo.b(), "asyncReprojectionConfig_", "useOnlineMagnetometerCalibration_", "useDeviceIdleDetection_", "useStationaryBiasCorrection_", "allowDynamicJavaLibraryLoading_", "touchOverlayEnabled_", "allowVrcoreHeadTracking_", "allowVrcoreCompositing_", "performanceOverlayInfo_", "enableForcedTrackingCompat_", "screenCaptureConfig_", "disallowMultiview_", "dimUiLayer_", "useDirectModeSensors_", "allowPassthrough_", "allowHighPriorityAppRenderThread_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
