import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmg extends agzi implements ahax
{
    public static final ahmg a;
    private static volatile ahbe e;
    public int b;
    public ahme c;
    public ahmf d;
    
    static {
        agzi.registerDefaultInstance((Class)ahmg.class, (agzi)(a = new ahmg()));
    }
    
    private ahmg() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahmg.e) == null) {
                    synchronized (ahmg.class) {
                        if (ahmg.e == null) {
                            ahmg.e = (ahbe)new agzb((agzi)ahmg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahmg.a;
            }
            case 4: {
                return new agza((agzi)ahmg.a);
            }
            case 3: {
                return new ahmg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmg.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
