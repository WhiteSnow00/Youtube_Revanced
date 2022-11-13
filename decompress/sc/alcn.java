import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcn extends ahbh implements ahcw
{
    public static final alcn a;
    private static volatile ahdd h;
    public int b;
    public aklg c;
    public String d;
    public String e;
    public apig f;
    public aimy g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)alcn.class, (ahbh)(a = new alcn()));
    }
    
    private alcn() {
        this.i = 2;
        this.d = "";
        this.e = "";
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
                if ((h = alcn.h) == null) {
                    synchronized (alcn.class) {
                        if (alcn.h == null) {
                            alcn.h = (ahdd)new ahba((ahbh)alcn.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alcn.a;
            }
            case 4: {
                return new ahaz((ahbh)alcn.a);
            }
            case 3: {
                return new alcn();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcn.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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
