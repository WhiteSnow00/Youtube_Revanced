import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtt extends agzi implements ahax
{
    public static final agtt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agtt.class, a = new agtt());
    }
    
    private agtt() {
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
                if ((b = agtt.b) == null) {
                    synchronized (agtt.class) {
                        if (agtt.b == null) {
                            agtt.b = (ahbe)new agzb((agzi)agtt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agtt.a;
            }
            case 4: {
                return new agza((agzi)agtt.a);
            }
            case 3: {
                return new agtt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtt.a, "\u0001\u0000", null);
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
