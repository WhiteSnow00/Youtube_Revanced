import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahze extends agzi implements ahax
{
    public static final ahze a;
    private static volatile ahbe c;
    public anjb b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahze.class, a = new ahze());
    }
    
    private ahze() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahze.c) == null) {
                    synchronized (ahze.class) {
                        if (ahze.c == null) {
                            ahze.c = (ahbe)new agzb((agzi)ahze.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahze.a;
            }
            case 4: {
                return new agza((agzi)ahze.a);
            }
            case 3: {
                return new ahze();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahze.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
