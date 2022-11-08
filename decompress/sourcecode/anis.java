import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anis extends agzi implements ahax
{
    public static final anis a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(anis.class, a = new anis());
    }
    
    private anis() {
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
                if ((b = anis.b) == null) {
                    synchronized (anis.class) {
                        if (anis.b == null) {
                            anis.b = (ahbe)new agzb((agzi)anis.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anis.a;
            }
            case 4: {
                return new agza((agzi)anis.a);
            }
            case 3: {
                return new anis();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anis.a, "\u0001\u0000", null);
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
