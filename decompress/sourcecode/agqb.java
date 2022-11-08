import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqb extends agzi implements ahax
{
    public static final agqb a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agqb.class, a = new agqb());
    }
    
    private agqb() {
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
                if ((b = agqb.b) == null) {
                    synchronized (agqb.class) {
                        if (agqb.b == null) {
                            agqb.b = (ahbe)new agzb((agzi)agqb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agqb.a;
            }
            case 4: {
                return new agza((agzi)agqb.a);
            }
            case 3: {
                return new agqb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqb.a, "\u0001\u0000", null);
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
