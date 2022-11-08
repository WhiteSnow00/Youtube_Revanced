import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsi extends agzi implements ahax
{
    public static final apsi a;
    private static volatile ahbe f;
    public int b;
    public apst c;
    public apta d;
    public apss e;
    
    static {
        agzi.registerDefaultInstance((Class)apsi.class, (agzi)(a = new apsi()));
    }
    
    private apsi() {
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apsi.f) == null) {
                    synchronized (apsi.class) {
                        if (apsi.f == null) {
                            apsi.f = (ahbe)new agzb((agzi)apsi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apsi.a;
            }
            case 4: {
                return new agza((agzi)apsi.a);
            }
            case 3: {
                return new apsi();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsi.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
