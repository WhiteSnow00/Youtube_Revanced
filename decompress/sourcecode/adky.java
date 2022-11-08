import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adky extends agzi implements ahax
{
    public static final adky a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public int e;
    public agzy f;
    public adkw g;
    
    static {
        agzi.registerDefaultInstance(adky.class, a = new adky());
    }
    
    private adky() {
        this.c = "";
        this.d = "";
        this.f = agzi.emptyProtobufList();
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
                if ((h = adky.h) == null) {
                    synchronized (adky.class) {
                        if (adky.h == null) {
                            adky.h = (ahbe)new agzb((agzi)adky.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return adky.a;
            }
            case 4: {
                return new agza((agzi)adky.a);
            }
            case 3: {
                return new adky();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adky.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u001a\u0005\u1009\u0003", new Object[] { "b", "c", "d", "e", adkx.b(), "f", "g" });
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
