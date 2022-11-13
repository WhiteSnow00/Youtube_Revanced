import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwf extends ahbh implements ahcw
{
    public static final akwf a;
    private static volatile ahdd g;
    public int b;
    public akli c;
    public ahbx d;
    public akwg e;
    public int f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akwf.class, (ahbh)(a = new akwf()));
    }
    
    private akwf() {
        this.h = 2;
        this.d = emptyProtobufList();
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
                if ((g = akwf.g) == null) {
                    synchronized (akwf.class) {
                        if (akwf.g == null) {
                            akwf.g = (ahdd)new ahba((ahbh)akwf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akwf.a;
            }
            case 4: {
                return new ahaz((ahbh)akwf.a);
            }
            case 3: {
                return new akwf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwf.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b\u0003\u1009\u0001\u0005\u100b\u0002", new Object[] { "b", "c", "d", akwm.class, "e", "f" });
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
