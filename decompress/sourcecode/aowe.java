import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowe extends agzi implements ahax
{
    public static final aowe a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowe.class, a = new aowe());
    }
    
    private aowe() {
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
                if ((b = aowe.b) == null) {
                    synchronized (aowe.class) {
                        if (aowe.b == null) {
                            aowe.b = (ahbe)new agzb((agzi)aowe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowe.a;
            }
            case 4: {
                return new agza((agzi)aowe.a);
            }
            case 3: {
                return new aowe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowe.a, "\u0001\u0000", null);
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
