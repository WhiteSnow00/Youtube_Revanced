import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agaj extends agzi implements ahax
{
    public static final agaj a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance(agaj.class, a = new agaj());
    }
    
    private agaj() {
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
                if ((c = agaj.c) == null) {
                    synchronized (agaj.class) {
                        if (agaj.c == null) {
                            agaj.c = (ahbe)new agzb((agzi)agaj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agaj.a;
            }
            case 4: {
                return new agza((agzi)agaj.a);
            }
            case 3: {
                return new agaj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agaj.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[] { "b" });
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
