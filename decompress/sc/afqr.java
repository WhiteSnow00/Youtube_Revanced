import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqr extends ahbh implements ahcw
{
    public static final int ALLOW_CASTING_FIELD_NUMBER = 1;
    public static final int ALLOW_SCREENSHOT_FIELD_NUMBER = 3;
    public static final int ALLOW_SCREEN_RECORD_FIELD_NUMBER = 2;
    public static final afqr DEFAULT_INSTANCE;
    private static volatile ahdd PARSER;
    private boolean allowCasting_;
    private boolean allowScreenRecord_;
    private boolean allowScreenshot_;
    private int bitField0_;
    
    static {
        ahbh.registerDefaultInstance((Class)afqr.class, (ahbh)(DEFAULT_INSTANCE = new afqr()));
    }
    
    private afqr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = afqr.PARSER) == null) {
                    synchronized (afqr.class) {
                        if (afqr.PARSER == null) {
                            afqr.PARSER = (ahdd)new ahba((ahbh)afqr.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return afqr.DEFAULT_INSTANCE;
            }
            case 4: {
                return new ahaz((ahbh)afqr.DEFAULT_INSTANCE);
            }
            case 3: {
                return new afqr();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqr.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "bitField0_", "allowCasting_", "allowScreenRecord_", "allowScreenshot_" });
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
