import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqm extends agzi implements ahax
{
    public static final agqm a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agqm.class, a = new agqm());
    }
    
    private agqm() {
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
                if ((b = agqm.b) == null) {
                    synchronized (agqm.class) {
                        if (agqm.b == null) {
                            agqm.b = (ahbe)new agzb((agzi)agqm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agqm.a;
            }
            case 4: {
                return new agza((agzi)agqm.a);
            }
            case 3: {
                return new agqm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqm.a, "\u0001\u0000", null);
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
