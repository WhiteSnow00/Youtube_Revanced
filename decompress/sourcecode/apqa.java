import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqa extends agzi implements ahax
{
    public static final apqa a;
    private static volatile ahbe d;
    public appz b;
    public appy c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)apqa.class, (agzi)(a = new apqa()));
    }
    
    private apqa() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apqa.d) == null) {
                    synchronized (apqa.class) {
                        if (apqa.d == null) {
                            apqa.d = (ahbe)new agzb((agzi)apqa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apqa.a;
            }
            case 4: {
                return new agza((agzi)apqa.a);
            }
            case 3: {
                return new apqa();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqa.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
