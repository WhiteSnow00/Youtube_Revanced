import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afop extends agzi implements ahax
{
    public static final afop DEFAULT_INSTANCE;
    private static volatile ahbe PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private String version_;
    
    static {
        agzi.registerDefaultInstance(afop.class, DEFAULT_INSTANCE = new afop());
    }
    
    private afop() {
        this.version_ = "";
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
                if ((parser = afop.PARSER) == null) {
                    synchronized (afop.class) {
                        if (afop.PARSER == null) {
                            afop.PARSER = (ahbe)new agzb((agzi)afop.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return afop.DEFAULT_INSTANCE;
            }
            case 4: {
                return new agza((agzi)afop.DEFAULT_INSTANCE);
            }
            case 3: {
                return new afop();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afop.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "bitField0_", "version_" });
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
