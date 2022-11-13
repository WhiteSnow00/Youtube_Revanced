import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apob extends ahbh implements ahcw
{
    public static final ahbq a;
    public static final apob b;
    private static volatile ahdd h;
    public ahbp c;
    public int d;
    public int e;
    public int f;
    public int g;
    private int i;
    
    static {
        a = (ahbq)new alvv(13);
        ahbh.registerDefaultInstance((Class)apob.class, (ahbh)(b = new apob()));
    }
    
    private apob() {
        this.c = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = apob.h) == null) {
                    synchronized (apob.class) {
                        if (apob.h == null) {
                            apob.h = (ahdd)new ahba((ahbh)apob.b);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apob.b;
            }
            case 4: {
                return new ahaz((ahbh)apob.b);
            }
            case 3: {
                return new apob();
            }
            case 2: {
                return newMessageInfo((MessageLite)apob.b, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001e\u0002\u100b\u0000\u0003\u100b\u0001\u0004\u100b\u0002\u0005\u100b\u0003", new Object[] { "i", "c", apoa.a(), "d", "e", "f", "g" });
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
