import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnw extends agzi implements ahax
{
    public static final ahnw a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahnw.class, a = new ahnw());
    }
    
    private ahnw() {
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
                if ((b = ahnw.b) == null) {
                    synchronized (ahnw.class) {
                        if (ahnw.b == null) {
                            ahnw.b = (ahbe)new agzb((agzi)ahnw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnw.a;
            }
            case 4: {
                return new agza((agzi)ahnw.a);
            }
            case 3: {
                return new ahnw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnw.a, "\u0001\u0000", null);
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
