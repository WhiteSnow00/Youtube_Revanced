import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akot extends ahbh implements ahcw
{
    public static final akot a;
    private static volatile ahdd h;
    public int b;
    public ahbx c;
    public int d;
    public anuv e;
    public aiqj f;
    public anuv g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)akot.class, (ahbh)(a = new akot()));
    }
    
    private akot() {
        this.i = 2;
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = akot.h) == null) {
                    synchronized (akot.class) {
                        if (akot.h == null) {
                            akot.h = (ahdd)new ahba((ahbh)akot.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akot.a;
            }
            case 4: {
                return new ahaz((ahbh)akot.a);
            }
            case 3: {
                return new akot();
            }
            case 2: {
                return newMessageInfo((MessageLite)akot.a, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0001\u0003\u0003\u001b\u0005\u1004\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006", new Object[] { "b", "c", akou.class, "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
