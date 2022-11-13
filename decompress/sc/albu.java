import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albu extends ahbh implements ahcw
{
    public static final albu a;
    private static volatile ahdd h;
    public int b;
    public aklg c;
    public String d;
    public albq e;
    public albs f;
    public albt g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)albu.class, (ahbh)(a = new albu()));
    }
    
    private albu() {
        this.i = 2;
        this.d = "";
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
                if ((h = albu.h) == null) {
                    synchronized (albu.class) {
                        if (albu.h == null) {
                            albu.h = (ahdd)new ahba((ahbh)albu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return albu.a;
            }
            case 4: {
                return new ahaz((ahbh)albu.a);
            }
            case 3: {
                return new albu();
            }
            case 2: {
                return newMessageInfo((MessageLite)albu.a, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\t\u1009\b\f\u1009\u000b\u0010\u1009\u000e", new Object[] { "b", "c", "d", "e", "f", "g" });
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
