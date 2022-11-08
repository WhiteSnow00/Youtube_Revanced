import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agal extends agzi implements ahax
{
    public static final agal a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance(agal.class, a = new agal());
    }
    
    private agal() {
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
                if ((c = agal.c) == null) {
                    synchronized (agal.class) {
                        if (agal.c == null) {
                            agal.c = (ahbe)new agzb((agzi)agal.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agal.a;
            }
            case 4: {
                return new agza((agzi)agal.a);
            }
            case 3: {
                return new agal();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agal.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "b" });
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
