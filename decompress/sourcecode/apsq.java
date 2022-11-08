import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsq extends agzi implements ahax
{
    public static final apsq a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apsq.class, (agzi)(a = new apsq()));
    }
    
    private apsq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apsq.b) == null) {
                    synchronized (apsq.class) {
                        if (apsq.b == null) {
                            apsq.b = (ahbe)new agzb((agzi)apsq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsq.a;
            }
            case 4: {
                return new agza((agzi)apsq.a);
            }
            case 3: {
                return new apsq();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsq.a, "\u0001\u0000", (Object[])null);
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
