import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alci extends ahbh implements ahcw
{
    public static final alci a;
    private static volatile ahdd k;
    public int b;
    public aklg c;
    public apig d;
    public String e;
    public int f;
    public aimy g;
    public alcm h;
    public apos i;
    public String j;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)alci.class, (ahbh)(a = new alci()));
    }
    
    private alci() {
        this.l = 2;
        this.e = "";
        this.f = 1;
        this.j = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = alci.k) == null) {
                    synchronized (alci.class) {
                        if (alci.k == null) {
                            alci.k = (ahdd)new ahba((ahbh)alci.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return alci.a;
            }
            case 4: {
                return new ahaz((ahbh)alci.a);
            }
            case 3: {
                return new alci();
            }
            case 2: {
                return newMessageInfo((MessageLite)alci.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1009\u0004\b\u1009\u0007\u000b\u1009\t\r\u1008\f", new Object[] { "b", "c", "d", "e", "f", akwi.o, "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
