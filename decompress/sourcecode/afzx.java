import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzx extends agzi implements ahax
{
    public static final afzx a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance(afzx.class, a = new afzx());
    }
    
    private afzx() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = afzx.c) == null) {
                    synchronized (afzx.class) {
                        if (afzx.c == null) {
                            afzx.c = (ahbe)new agzb((agzi)afzx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return afzx.a;
            }
            case 4: {
                return new agza((agzi)afzx.a);
            }
            case 3: {
                return new afzx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afzx.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "b" });
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
