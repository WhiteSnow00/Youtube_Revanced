import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknk extends ahbh implements ahcw
{
    public static final aknk a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public Object d;
    public aklg e;
    public String f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aknk.class, (ahbh)(a = new aknk()));
    }
    
    private aknk() {
        this.c = 0;
        this.h = 2;
        this.f = "";
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
                final ahdd g;
                if ((g = aknk.g) == null) {
                    synchronized (aknk.class) {
                        if (aknk.g == null) {
                            aknk.g = (ahdd)new ahba((ahbh)aknk.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aknk.a;
            }
            case 4: {
                return new ahaz((ahbh)aknk.a);
            }
            case 3: {
                return new aknk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknk.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u1008\u0005\u0005\u103c\u0000", new Object[] { "d", "c", "b", "e", aknn.class, aknm.class, "f", akno.class });
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
