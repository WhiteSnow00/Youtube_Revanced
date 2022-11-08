import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomm extends agzi implements ahax
{
    public static final aomm a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public agzy d;
    public ahlc e;
    public agzy f;
    private int h;
    
    static {
        agzi.registerDefaultInstance((Class)aomm.class, (agzi)(a = new aomm()));
    }
    
    private aomm() {
        this.d = emptyProtobufList();
        this.f = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aomm.g) == null) {
                    synchronized (aomm.class) {
                        if (aomm.g == null) {
                            aomm.g = (ahbe)new agzb((agzi)aomm.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aomm.a;
            }
            case 4: {
                return new agza((agzi)aomm.a);
            }
            case 3: {
                return new aomm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomm.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0004\u001b\u0005\u1009\u0002\u0007\u001b", new Object[] { "h", "b", "c", "d", ahky.class, "e", "f", ahky.class });
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
