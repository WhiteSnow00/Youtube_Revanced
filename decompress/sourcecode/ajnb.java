import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnb extends agzi implements ahax
{
    public static final ajnb a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ajnb.class, (agzi)(a = new ajnb()));
    }
    
    private ajnb() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajnb.b) == null) {
                    synchronized (ajnb.class) {
                        if (ajnb.b == null) {
                            ajnb.b = (ahbe)new agzb((agzi)ajnb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajnb.a;
            }
            case 4: {
                return new agza((agzi)ajnb.a);
            }
            case 3: {
                return new ajnb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnb.a, "\u0001\u0000", (Object[])null);
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
