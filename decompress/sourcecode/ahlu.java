import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlu extends agzi implements ahax
{
    public static final ahlu a;
    private static volatile ahbe e;
    public agzy b;
    public agzy c;
    public agzy d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ahlu.class, (agzi)(a = new ahlu()));
    }
    
    private ahlu() {
        this.f = 2;
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahlu.e) == null) {
                    synchronized (ahlu.class) {
                        if (ahlu.e == null) {
                            ahlu.e = (ahbe)new agzb((agzi)ahlu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahlu.a;
            }
            case 4: {
                return new agza((agzi)ahlu.a);
            }
            case 3: {
                return new ahlu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlu.a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0003\u0001\u041b\u0002\u041b\u0003\u041b", new Object[] { "b", aioe.class, "c", aioe.class, "d", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
