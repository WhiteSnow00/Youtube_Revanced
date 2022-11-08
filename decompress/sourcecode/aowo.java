import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowo extends agzi implements ahax
{
    public static final aowo a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowo.class, a = new aowo());
    }
    
    private aowo() {
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
                if ((b = aowo.b) == null) {
                    synchronized (aowo.class) {
                        if (aowo.b == null) {
                            aowo.b = (ahbe)new agzb((agzi)aowo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowo.a;
            }
            case 4: {
                return new agza((agzi)aowo.a);
            }
            case 3: {
                return new aowo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowo.a, "\u0001\u0000", null);
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
