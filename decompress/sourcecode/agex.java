import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agex extends agzi implements ahax
{
    public static final agex a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agex.class, a = new agex());
    }
    
    private agex() {
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
                if ((b = agex.b) == null) {
                    synchronized (agex.class) {
                        if (agex.b == null) {
                            agex.b = (ahbe)new agzb((agzi)agex.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agex.a;
            }
            case 4: {
                return new agza((agzi)agex.a);
            }
            case 3: {
                return new agex();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agex.a, "\u0001\u0000", null);
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
