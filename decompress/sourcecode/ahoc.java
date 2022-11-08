import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoc extends agzi implements ahax
{
    public static final ahoc a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public agzy d;
    public agzy e;
    public agzy f;
    public agzy g;
    
    static {
        agzi.registerDefaultInstance(ahoc.class, a = new ahoc());
    }
    
    private ahoc() {
        this.c = "";
        this.d = agzi.emptyProtobufList();
        this.e = agzi.emptyProtobufList();
        this.f = agzi.emptyProtobufList();
        emptyProtobufList();
        this.g = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ahoc.h) == null) {
                    synchronized (ahoc.class) {
                        if (ahoc.h == null) {
                            ahoc.h = (ahbe)new agzb((agzi)ahoc.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahoc.a;
            }
            case 4: {
                return new agza((char[][][])null, (short[][])null);
            }
            case 3: {
                return new ahoc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahoc.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0004\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0006\u001b", new Object[] { "b", "c", "d", ahon.class, "e", ahon.class, "f", ahon.class, "g", ahon.class });
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
