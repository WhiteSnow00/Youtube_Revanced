// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$DeveloperPrefs extends ahbh implements ahcw
{
    public static final int ALLOW_AR_SESSION_UPDATE_FIELD_NUMBER = 17;
    public static final int CAPTURE_ENABLED_FIELD_NUMBER = 9;
    private static final Preferences$DeveloperPrefs DEFAULT_INSTANCE;
    public static final int DEPRECATED_GVR_PLATFORM_LIBRARY_ENABLED_FIELD_NUMBER = 7;
    public static final int DEPRECATED_HEAD_TRACKING_SERVICE_ENABLED_FIELD_NUMBER = 8;
    public static final int DEPRECATED_MOTOPHO_PATCH_ENABLED_FIELD_NUMBER = 3;
    public static final int DEVELOPER_LOGGING_ENABLED_FIELD_NUMBER = 4;
    public static final int FORCE_UNDISTORTED_RENDERING_FIELD_NUMBER = 5;
    public static final int FRAME_TRACKER_ENABLED_FIELD_NUMBER = 11;
    public static final int MOTOPHO_PATCH_MODE_FIELD_NUMBER = 12;
    public static final int OPENGL_KHR_DEBUG_ENABLED_FIELD_NUMBER = 14;
    private static volatile ahdd PARSER;
    public static final int PERFORMANCE_HUD_ENABLED_FIELD_NUMBER = 6;
    public static final int PERFORMANCE_LOGGING_ACTIVATED_FIELD_NUMBER = 13;
    public static final int PERFORMANCE_MONITORING_ENABLED_FIELD_NUMBER = 1;
    public static final int PLAY_AREA_SETTINGS_FIELD_NUMBER = 16;
    public static final int SAFETY_CYLINDER_PARAMS_FIELD_NUMBER = 10;
    public static final int SENSOR_LOGGING_ENABLED_FIELD_NUMBER = 2;
    public static final int TRACKING_CONFIGURATION_PARAMS_FIELD_NUMBER = 15;
    private boolean allowArSessionUpdate_;
    private int bitField0_;
    private boolean captureEnabled_;
    private boolean dEPRECATEDGvrPlatformLibraryEnabled_;
    private boolean dEPRECATEDHeadTrackingServiceEnabled_;
    private boolean dEPRECATEDMotophoPatchEnabled_;
    private boolean developerLoggingEnabled_;
    private boolean forceUndistortedRendering_;
    private boolean frameTrackerEnabled_;
    private int motophoPatchMode_;
    private boolean openglKhrDebugEnabled_;
    private boolean performanceHudEnabled_;
    private boolean performanceLoggingActivated_;
    private boolean performanceMonitoringEnabled_;
    private Preferences$PlayAreaSettings playAreaSettings_;
    private Preferences$SafetyCylinderParams safetyCylinderParams_;
    private boolean sensorLoggingEnabled_;
    private Preferences$TrackingConfigurationParams trackingConfigurationParams_;
    
    static {
        ahbh.registerDefaultInstance((Class)Preferences$DeveloperPrefs.class, (ahbh)(DEFAULT_INSTANCE = new Preferences$DeveloperPrefs()));
    }
    
    private Preferences$DeveloperPrefs() {
    }
    
    static Preferences$DeveloperPrefs access$1300() {
        return Preferences$DeveloperPrefs.DEFAULT_INSTANCE;
    }
    
    public static Preferences$DeveloperPrefs getDefaultInstance() {
        return Preferences$DeveloperPrefs.DEFAULT_INSTANCE;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = Preferences$DeveloperPrefs.PARSER) == null) {
                    synchronized (Preferences$DeveloperPrefs.class) {
                        if (Preferences$DeveloperPrefs.PARSER == null) {
                            Preferences$DeveloperPrefs.PARSER = (ahdd)new ahba((ahbh)Preferences$DeveloperPrefs.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return Preferences$DeveloperPrefs.DEFAULT_INSTANCE;
            }
            case 4: {
                return new Preferences$DeveloperPrefs$Builder(null);
            }
            case 3: {
                return new Preferences$DeveloperPrefs();
            }
            case 2: {
                return newMessageInfo((MessageLite)Preferences$DeveloperPrefs.DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006\b\u1007\u0007\t\u1007\b\n\u1009\t\u000b\u1007\n\f\u100c\u000b\r\u1007\f\u000e\u1007\r\u000f\u1009\u000e\u0010\u1009\u000f\u0011\u1007\u0010", new Object[] { "bitField0_", "performanceMonitoringEnabled_", "sensorLoggingEnabled_", "dEPRECATEDMotophoPatchEnabled_", "developerLoggingEnabled_", "forceUndistortedRendering_", "performanceHudEnabled_", "dEPRECATEDGvrPlatformLibraryEnabled_", "dEPRECATEDHeadTrackingServiceEnabled_", "captureEnabled_", "safetyCylinderParams_", "frameTrackerEnabled_", "motophoPatchMode_", Preferences$DeveloperPrefs$MotophoPatchMode.internalGetVerifier(), "performanceLoggingActivated_", "openglKhrDebugEnabled_", "trackingConfigurationParams_", "playAreaSettings_", "allowArSessionUpdate_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public boolean getOpenglKhrDebugEnabled() {
        return this.openglKhrDebugEnabled_;
    }
}
