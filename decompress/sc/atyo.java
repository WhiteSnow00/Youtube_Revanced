import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyo extends ahbh implements ahcw
{
    public static final atyo a;
    private static volatile ahdd l;
    public int b;
    public boolean c;
    public atyk d;
    public String e;
    public String f;
    public int g;
    public String h;
    public afrl i;
    public ahgv j;
    public atyq k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)atyo.class, (ahbh)(a = new atyo()));
    }
    
    private atyo() {
        this.m = 2;
        this.e = "";
        this.f = "";
        this.h = "";
    }
    
    public static void a(final atyo atyo) {
        atyo.b |= 0x1;
        atyo.c = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = atyo.l) == null) {
                    synchronized (atyo.class) {
                        if (atyo.l == null) {
                            atyo.l = (ahdd)new ahba((ahbh)atyo.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return atyo.a;
            }
            case 4: {
                return new ahaz((ahbh)atyo.a);
            }
            case 3: {
                return new atyo();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyo.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u100c\u0004\u0007\u1008\u0007\t\u1409\b\n\u1009\t\u000b\u1009\n", new Object[] { "b", "c", "d", "e", "f", "g", areg.r, "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
