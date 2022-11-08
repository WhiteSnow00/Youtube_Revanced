import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aown extends agzi implements ahax
{
    public static final aown a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aown.class, a = new aown());
    }
    
    private aown() {
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
                if ((b = aown.b) == null) {
                    synchronized (aown.class) {
                        if (aown.b == null) {
                            aown.b = (ahbe)new agzb((agzi)aown.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aown.a;
            }
            case 4: {
                return new agza((agzi)aown.a);
            }
            case 3: {
                return new aown();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aown.a, "\u0001\u0000", null);
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
