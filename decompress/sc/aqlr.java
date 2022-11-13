import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlr extends ahbh implements ahcw
{
    public static final aqlr a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public ahdy d;
    public int e;
    public String f;
    public aqlt g;
    private ahcr i;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlr.class, (ahbh)(a = new aqlr()));
    }
    
    private aqlr() {
        this.i = ahcr.a;
        this.c = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aqlr.h) == null) {
                    synchronized (aqlr.class) {
                        if (aqlr.h == null) {
                            aqlr.h = (ahdd)new ahba((ahbh)aqlr.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqlr.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlr.a);
            }
            case 3: {
                return new aqlr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlr.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1008\u0003\u00052\u0006\u1009\u0004", new Object[] { "b", "c", "d", "e", aqls.a, "f", "i", aqlq.a, "g" });
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
