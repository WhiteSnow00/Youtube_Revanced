import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvh extends ahbh implements ahcw
{
    public static final anvh a;
    private static volatile ahdd e;
    public int b;
    public alkc c;
    public String d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anvh.class, (ahbh)(a = new anvh()));
    }
    
    private anvh() {
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
                if ((e = anvh.e) == null) {
                    synchronized (anvh.class) {
                        if (anvh.e == null) {
                            anvh.e = (ahdd)new ahba((ahbh)anvh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anvh.a;
            }
            case 4: {
                return new ahaz((ahbh)anvh.a);
            }
            case 3: {
                return new anvh();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
