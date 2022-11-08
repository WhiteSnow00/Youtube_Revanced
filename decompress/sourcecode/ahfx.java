import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfx extends agzi implements ahax
{
    public static final ahfx a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public String e;
    public ahtz f;
    public ajww g;
    
    static {
        agzi.registerDefaultInstance(ahfx.class, a = new ahfx());
    }
    
    private ahfx() {
        this.c = "";
        this.d = "";
        this.e = "";
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
                if ((h = ahfx.h) == null) {
                    synchronized (ahfx.class) {
                        if (ahfx.h == null) {
                            ahfx.h = (ahbe)new agzb((agzi)ahfx.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahfx.a;
            }
            case 4: {
                return new agza((agzi)ahfx.a);
            }
            case 3: {
                return new ahfx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfx.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003\u0005\u1009\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
