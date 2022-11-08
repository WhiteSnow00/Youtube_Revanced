import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsm extends agzi implements ahax
{
    public static final apsm a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apsm.class, (agzi)(a = new apsm()));
    }
    
    private apsm() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apsm.b) == null) {
                    synchronized (apsm.class) {
                        if (apsm.b == null) {
                            apsm.b = (ahbe)new agzb((agzi)apsm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsm.a;
            }
            case 4: {
                return new agza((agzi)apsm.a);
            }
            case 3: {
                return new apsm();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsm.a, "\u0001\u0000", (Object[])null);
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
