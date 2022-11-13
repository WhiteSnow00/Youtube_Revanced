import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzr extends ahbh implements ahcw
{
    public static final aqzr a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzr.class, (ahbh)(a = new aqzr()));
    }
    
    private aqzr() {
        this.c = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqzr.g) == null) {
                    synchronized (aqzr.class) {
                        if (aqzr.g == null) {
                            aqzr.g = (ahdd)new ahba((ahbh)aqzr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqzr.a;
            }
            case 4: {
                return new ahaz((ahbh)aqzr.a);
            }
            case 3: {
                return new aqzr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzr.a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u1007\f\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u1007\r\f\u103c\u0000\r\u103c\u0000\u000e\u103c\u0000", new Object[] { "d", "c", "b", arah.class, araf.class, aqzg.class, aqyd.class, "e", aqxz.class, aram.class, arai.class, aqyg.class, araq.class, "f", aqyh.class, aqze.class, aqym.class });
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
