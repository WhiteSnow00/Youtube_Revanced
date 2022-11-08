import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcr extends agzi implements ahax
{
    public static final apcr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apcr.class, a = new apcr());
    }
    
    private apcr() {
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
                if ((b = apcr.b) == null) {
                    synchronized (apcr.class) {
                        if (apcr.b == null) {
                            apcr.b = (ahbe)new agzb((agzi)apcr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apcr.a;
            }
            case 4: {
                return new agza((agzi)apcr.a);
            }
            case 3: {
                return new apcr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcr.a, "\u0001\u0000", null);
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
