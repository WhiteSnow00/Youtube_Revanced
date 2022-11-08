import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkq extends agzi implements ahax
{
    public static final ahkq a;
    private static volatile ahbe f;
    public agzy b;
    public agzy c;
    public ahlb d;
    public String e;
    private int g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)ahkq.class, (agzi)(a = new ahkq()));
    }
    
    private ahkq() {
        this.h = 2;
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
        this.e = "";
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
                final ahbe f;
                if ((f = ahkq.f) == null) {
                    synchronized (ahkq.class) {
                        if (ahkq.f == null) {
                            ahkq.f = (ahbe)new agzb((agzi)ahkq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahkq.a;
            }
            case 4: {
                return new agza((agzi)ahkq.a);
            }
            case 3: {
                return new ahkq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkq.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0002\u0001\u041b\u0002\u041b\u0003\u1009\u0000\u0004\u1008\u0001", new Object[] { "g", "b", aioe.class, "c", aioe.class, "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
