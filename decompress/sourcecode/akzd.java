import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzd extends agzi implements ahax
{
    public static final akzd a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance((Class)akzd.class, (agzi)(a = new akzd()));
    }
    
    private akzd() {
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = akzd.d) == null) {
                    synchronized (akzd.class) {
                        if (akzd.d == null) {
                            akzd.d = (ahbe)new agzb((agzi)akzd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzd.a;
            }
            case 4: {
                return new agza((int[])null, (byte[])null);
            }
            case 3: {
                return new akzd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzd.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[] { "b", akzc.class, "c", akzc.class });
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
