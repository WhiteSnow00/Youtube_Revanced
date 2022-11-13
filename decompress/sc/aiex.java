import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiex extends ahbh implements ahcw
{
    public static final aiex a;
    private static volatile ahdd h;
    public int b;
    public int c;
    public Object d;
    public aotp e;
    public int f;
    public int g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aiex.class, (ahbh)(a = new aiex()));
    }
    
    private aiex() {
        this.c = 0;
        this.i = 2;
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
                if ((h = aiex.h) == null) {
                    synchronized (aiex.class) {
                        if (aiex.h == null) {
                            aiex.h = (ahdd)new ahba((ahbh)aiex.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aiex.a;
            }
            case 4: {
                return new ahaz((ahbh)aiex.a);
            }
            case 3: {
                return new aiex();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiex.a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001\u143c\u0000\u0002\u1409\u0002\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u143c\u0000", new Object[] { "d", "c", "b", aotp.class, "e", "f", "g", aiet.class });
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
