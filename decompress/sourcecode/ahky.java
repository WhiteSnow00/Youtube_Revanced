import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahky extends agzi implements ahax
{
    public static final ahky a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public int d;
    public agzy e;
    public boolean f;
    public agyc g;
    
    static {
        agzi.registerDefaultInstance((Class)ahky.class, (agzi)(a = new ahky()));
    }
    
    private ahky() {
        this.c = "";
        this.e = emptyProtobufList();
        this.g = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ahky.h) == null) {
                    synchronized (ahky.class) {
                        if (ahky.h == null) {
                            ahky.h = (ahbe)new agzb((agzi)ahky.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahky.a;
            }
            case 4: {
                return new agza((agzi)ahky.a);
            }
            case 3: {
                return new ahky();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahky.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u100a\u0003", new Object[] { "b", "c", "d", "e", aluc.class, "f", "g" });
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
