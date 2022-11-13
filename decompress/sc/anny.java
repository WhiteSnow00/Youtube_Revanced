import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anny extends ahbh implements ahcw
{
    public static final anny a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public String d;
    public ahbx e;
    public double f;
    public int g;
    
    static {
        ahbh.registerDefaultInstance((Class)anny.class, (ahbh)(a = new anny()));
    }
    
    private anny() {
        this.c = "";
        this.d = "";
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = anny.h) == null) {
                    synchronized (anny.class) {
                        if (anny.h == null) {
                            anny.h = (ahdd)new ahba((ahbh)anny.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anny.a;
            }
            case 4: {
                return new ahaz((short[][])null, (short[][][])null);
            }
            case 3: {
                return new anny();
            }
            case 2: {
                return newMessageInfo((MessageLite)anny.a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0001\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u001b\u0005\u1000\u0003\u0006\u100c\u0004", new Object[] { "b", "c", "d", "e", annx.class, "f", "g", anic.n });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
