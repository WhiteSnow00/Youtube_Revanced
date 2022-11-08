import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsu extends agzi implements ahax
{
    public static final apsu a;
    private static volatile ahbe c;
    public int b;
    private apsm d;
    
    static {
        agzi.registerDefaultInstance((Class)apsu.class, (agzi)(a = new apsu()));
    }
    
    private apsu() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apsu.c) == null) {
                    synchronized (apsu.class) {
                        if (apsu.c == null) {
                            apsu.c = (ahbe)new agzb((agzi)apsu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apsu.a;
            }
            case 4: {
                return new agza((agzi)apsu.a);
            }
            case 3: {
                return new apsu();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "d" });
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
