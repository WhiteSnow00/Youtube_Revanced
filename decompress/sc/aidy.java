import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidy extends ahbh implements ahcw
{
    public static final aidy a;
    private static volatile ahdd f;
    public int b;
    public boolean c;
    public apkn d;
    public String e;
    private ahrv g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aidy.class, (ahbh)(a = new aidy()));
    }
    
    private aidy() {
        this.h = 2;
        this.e = "";
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
                final ahdd f;
                if ((f = aidy.f) == null) {
                    synchronized (aidy.class) {
                        if (aidy.f == null) {
                            aidy.f = (ahdd)new ahba((ahbh)aidy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aidy.a;
            }
            case 4: {
                return new ahaz((ahbh)aidy.a);
            }
            case 3: {
                return new aidy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidy.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0001\u0002\u1007\u0001\u0003\u1009\u0002\u0004\u1409\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "g", "e" });
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
