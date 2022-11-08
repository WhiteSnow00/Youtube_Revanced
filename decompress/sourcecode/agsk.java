import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsk extends agzi implements ahax
{
    public static final agsk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agsk.class, a = new agsk());
    }
    
    private agsk() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = agsk.b) == null) {
                    synchronized (agsk.class) {
                        if (agsk.b == null) {
                            agsk.b = (ahbe)new agzb((agzi)agsk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agsk.a;
            }
            case 4: {
                return new agza((agzi)agsk.a);
            }
            case 3: {
                return new agsk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsk.a, "\u0000\u0000", null);
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
