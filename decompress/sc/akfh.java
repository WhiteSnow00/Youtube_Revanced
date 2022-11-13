import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfh extends ahbh implements ahcw
{
    public static final akfh a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahab d;
    private ahhu f;
    private aiqj g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akfh.class, (ahbh)(a = new akfh()));
    }
    
    private akfh() {
        this.h = 2;
        this.c = "";
        this.d = ahab.b;
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
                if ((e = akfh.e) == null) {
                    synchronized (akfh.class) {
                        if (akfh.e == null) {
                            akfh.e = (ahdd)new ahba((ahbh)akfh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akfh.a;
            }
            case 4: {
                return new ahaz((ahbh)akfh.a);
            }
            case 3: {
                return new akfh();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfh.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1008\u0000\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u1409\u0003", new Object[] { "b", "c", "f", "d", "g" });
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
