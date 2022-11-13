// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$UserPrefs extends ahbh implements ahcw
{
    public static final int CONTROLLER_HANDEDNESS_FIELD_NUMBER = 1;
    private static final Preferences$UserPrefs DEFAULT_INSTANCE;
    public static final int DEVELOPER_PREFS_FIELD_NUMBER = 2;
    private static volatile ahdd PARSER;
    public static final int RUNTIME_FEATURES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int controllerHandedness_;
    private Preferences$DeveloperPrefs developerPrefs_;
    private ahbx runtimeFeatures_;
    
    static {
        ahbh.registerDefaultInstance((Class)Preferences$UserPrefs.class, (ahbh)(DEFAULT_INSTANCE = new Preferences$UserPrefs()));
    }
    
    private Preferences$UserPrefs() {
        this.runtimeFeatures_ = emptyProtobufList();
    }
    
    static Preferences$UserPrefs access$000() {
        return Preferences$UserPrefs.DEFAULT_INSTANCE;
    }
    
    public static Preferences$UserPrefs$Builder newBuilder() {
        return (Preferences$UserPrefs$Builder)Preferences$UserPrefs.DEFAULT_INSTANCE.createBuilder();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = Preferences$UserPrefs.PARSER) == null) {
                    synchronized (Preferences$UserPrefs.class) {
                        if (Preferences$UserPrefs.PARSER == null) {
                            Preferences$UserPrefs.PARSER = (ahdd)new ahba((ahbh)Preferences$UserPrefs.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return Preferences$UserPrefs.DEFAULT_INSTANCE;
            }
            case 4: {
                return new Preferences$UserPrefs$Builder(null);
            }
            case 3: {
                return new Preferences$UserPrefs();
            }
            case 2: {
                return newMessageInfo((MessageLite)Preferences$UserPrefs.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u001b", new Object[] { "bitField0_", "controllerHandedness_", Preferences$UserPrefs$Handedness.internalGetVerifier(), "developerPrefs_", "runtimeFeatures_", Preferences$RuntimeFeature.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public Preferences$DeveloperPrefs getDeveloperPrefs() {
        Preferences$DeveloperPrefs preferences$DeveloperPrefs;
        if ((preferences$DeveloperPrefs = this.developerPrefs_) == null) {
            preferences$DeveloperPrefs = Preferences$DeveloperPrefs.getDefaultInstance();
        }
        return preferences$DeveloperPrefs;
    }
    
    public boolean hasDeveloperPrefs() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
}
