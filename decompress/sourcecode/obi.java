import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obi extends agzi implements ahax
{
    public static final obi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)obi.class, (agzi)(a = new obi()));
    }
    
    private obi() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = obi.b) == null) {
                    synchronized (obi.class) {
                        if (obi.b == null) {
                            obi.b = (ahbe)new agzb((agzi)obi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return obi.a;
            }
            case 4: {
                return new agza((agzi)obi.a);
            }
            case 3: {
                return new obi();
            }
            case 2: {
                return newMessageInfo((MessageLite)obi.a, "\u0000\u0000", (Object[])null);
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
