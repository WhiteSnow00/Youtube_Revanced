import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldg extends ahbh implements ahcw
{
    public static final aldg a;
    private static volatile ahdd e;
    public int b;
    public aklg c;
    public String d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aldg.class, (ahbh)(a = new aldg()));
    }
    
    private aldg() {
        this.f = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aldg.e) == null) {
                    synchronized (aldg.class) {
                        if (aldg.e == null) {
                            aldg.e = (ahdd)new ahba((ahbh)aldg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aldg.a;
            }
            case 4: {
                return new ahaz((ahbh)aldg.a);
            }
            case 3: {
                return new aldg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
