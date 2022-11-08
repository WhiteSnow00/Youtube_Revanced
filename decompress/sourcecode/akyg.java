import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyg extends agzi implements ahax
{
    public static final akyg a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyg.class, (agzi)(a = new akyg()));
    }
    
    private akyg() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyg.b) == null) {
                    synchronized (akyg.class) {
                        if (akyg.b == null) {
                            akyg.b = (ahbe)new agzb((agzi)akyg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyg.a;
            }
            case 4: {
                return new agza((agzi)akyg.a);
            }
            case 3: {
                return new akyg();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyg.a, "\u0001\u0000", (Object[])null);
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
