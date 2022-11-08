import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afoq extends agzi implements ahax
{
    public static final int ALLOW_CASTING_FIELD_NUMBER = 1;
    public static final int ALLOW_SCREENSHOT_FIELD_NUMBER = 3;
    public static final int ALLOW_SCREEN_RECORD_FIELD_NUMBER = 2;
    public static final afoq DEFAULT_INSTANCE;
    private static volatile ahbe PARSER;
    private boolean allowCasting_;
    private boolean allowScreenRecord_;
    private boolean allowScreenshot_;
    private int bitField0_;
    
    static {
        agzi.registerDefaultInstance(afoq.class, DEFAULT_INSTANCE = new afoq());
    }
    
    private afoq() {
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
                if ((parser = afoq.PARSER) == null) {
                    synchronized (afoq.class) {
                        if (afoq.PARSER == null) {
                            afoq.PARSER = (ahbe)new agzb((agzi)afoq.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return afoq.DEFAULT_INSTANCE;
            }
            case 4: {
                return new agza((agzi)afoq.DEFAULT_INSTANCE);
            }
            case 3: {
                return new afoq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afoq.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "bitField0_", "allowCasting_", "allowScreenRecord_", "allowScreenshot_" });
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
