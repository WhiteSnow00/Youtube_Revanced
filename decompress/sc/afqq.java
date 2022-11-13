import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqq extends ahbh implements ahcw
{
    public static final afqq DEFAULT_INSTANCE;
    private static volatile ahdd PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private String version_;
    
    static {
        ahbh.registerDefaultInstance((Class)afqq.class, (ahbh)(DEFAULT_INSTANCE = new afqq()));
    }
    
    private afqq() {
        this.version_ = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = afqq.PARSER) == null) {
                    synchronized (afqq.class) {
                        if (afqq.PARSER == null) {
                            afqq.PARSER = (ahdd)new ahba((ahbh)afqq.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return afqq.DEFAULT_INSTANCE;
            }
            case 4: {
                return new ahaz((ahbh)afqq.DEFAULT_INSTANCE);
            }
            case 3: {
                return new afqq();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqq.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "bitField0_", "version_" });
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
