import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpb extends ahbh implements ahcw
{
    public static final akpb a;
    private static volatile ahdd e;
    public akli b;
    public akoz c;
    public ahab d;
    private int f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akpb.class, (ahbh)(a = new akpb()));
    }
    
    private akpb() {
        this.h = 2;
        this.d = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akpb.e) == null) {
                    synchronized (akpb.class) {
                        if (akpb.e == null) {
                            akpb.e = (ahdd)new ahba((ahbh)akpb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpb.a;
            }
            case 4: {
                return new ahaz((ahbh)akpb.a);
            }
            case 3: {
                return new akpb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpb.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003", new Object[] { "f", "b", "c", "g", "d" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
