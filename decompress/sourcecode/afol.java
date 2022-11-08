import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afol extends agzi implements ahax
{
    public static final int ADDITIONAL_AHARDWAREBUFFER_USAGE_FIELD_NUMBER = 6;
    public static final int BACK_RGB16_WITH_BGR16_FIELD_NUMBER = 7;
    public static final int BLACK_BOOST_FIELD_NUMBER = 3;
    public static final int COMPOSITOR_DRAWS_FLANGE_FIELD_NUMBER = 8;
    public static final afol DEFAULT_INSTANCE;
    public static final int DISPLAY_LATENCY_MICROS_FIELD_NUMBER = 2;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile ahbe PARSER;
    public static final int SCANOUT_OFFSET_MICROS_FIELD_NUMBER = 9;
    public static final int SCHEDULING_SLACK_MICROS_FIELD_NUMBER = 10;
    public static final int STRIPS_PER_FRAME_FIELD_NUMBER = 5;
    public static final int VSYNC_GRACE_PERIOD_MICROS_FIELD_NUMBER = 4;
    private long additionalAhardwarebufferUsage_;
    private boolean backRgb16WithBgr16_;
    public int bitField0_;
    private long blackBoost_;
    private boolean compositorDrawsFlange_;
    private long displayLatencyMicros_;
    public long flags_;
    private long scanoutOffsetMicros_;
    private long schedulingSlackMicros_;
    private long stripsPerFrame_;
    private long vsyncGracePeriodMicros_;
    
    static {
        agzi.registerDefaultInstance(afol.class, DEFAULT_INSTANCE = new afol());
    }
    
    private afol() {
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
                if ((parser = afol.PARSER) == null) {
                    synchronized (afol.class) {
                        if (afol.PARSER == null) {
                            afol.PARSER = (ahbe)new agzb((agzi)afol.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return afol.DEFAULT_INSTANCE;
            }
            case 4: {
                return new agza((agzi)afol.DEFAULT_INSTANCE);
            }
            case 3: {
                return new afol();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afol.DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1007\u0006\b\u1007\u0007\t\u1002\b\n\u1002\t", new Object[] { "bitField0_", "flags_", "displayLatencyMicros_", "blackBoost_", "vsyncGracePeriodMicros_", "stripsPerFrame_", "additionalAhardwarebufferUsage_", "backRgb16WithBgr16_", "compositorDrawsFlange_", "scanoutOffsetMicros_", "schedulingSlackMicros_" });
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
