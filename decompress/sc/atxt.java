import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxt extends ahbc implements ahbd
{
    public static final atxt a;
    private static volatile ahdd h;
    public int b;
    public atxs c;
    public atyk d;
    public int e;
    public atxr f;
    public String g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)atxt.class, (ahbh)(a = new atxt()));
    }
    
    private atxt() {
        this.i = 2;
        this.g = "";
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
                if ((h = atxt.h) == null) {
                    synchronized (atxt.class) {
                        if (atxt.h == null) {
                            atxt.h = (ahdd)new ahba((ahbh)atxt.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return atxt.a;
            }
            case 4: {
                return new ahbb((ahbc)atxt.a);
            }
            case 3: {
                return new atxt();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxt.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1009\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", areg.h, "f", "g" });
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
