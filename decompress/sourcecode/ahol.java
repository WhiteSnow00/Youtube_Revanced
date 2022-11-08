import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahol extends agzi implements ahax
{
    public static final ahol a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public boolean d;
    public ahon e;
    public agzy f;
    public agzy g;
    
    static {
        agzi.registerDefaultInstance(ahol.class, a = new ahol());
    }
    
    private ahol() {
        this.c = "";
        emptyIntList();
        emptyProtobufList();
        this.f = agzi.emptyProtobufList();
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
                if ((h = ahol.h) == null) {
                    synchronized (ahol.class) {
                        if (ahol.h == null) {
                            ahol.h = (ahbe)new agzb((agzi)ahol.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahol.a;
            }
            case 4: {
                return new agza((float[][][])null, (byte[][])null);
            }
            case 3: {
                return new ahol();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahol.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\u1008\u0000\u0003\u1007\u0001\u0005\u001b\u0006\u001b\u0007\u1009\u0002", new Object[] { "b", "c", "d", "f", ahon.class, "g", ahon.class, "e" });
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
