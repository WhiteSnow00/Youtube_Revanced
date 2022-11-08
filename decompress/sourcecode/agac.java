import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agac extends agzi implements ahax
{
    public static final agac a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance(agac.class, a = new agac());
    }
    
    private agac() {
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
                if ((c = agac.c) == null) {
                    synchronized (agac.class) {
                        if (agac.c == null) {
                            agac.c = (ahbe)new agzb((agzi)agac.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agac.a;
            }
            case 4: {
                return new agza((agzi)agac.a);
            }
            case 3: {
                return new agac();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agac.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "b" });
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
