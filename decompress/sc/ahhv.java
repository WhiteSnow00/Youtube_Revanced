import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhv extends ahbh implements ahcw
{
    public static final ahhv a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public String d;
    public String e;
    public ahvx f;
    public ajyz g;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhv.class, (ahbh)(a = new ahhv()));
    }
    
    private ahhv() {
        this.c = "";
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ahhv.h) == null) {
                    synchronized (ahhv.class) {
                        if (ahhv.h == null) {
                            ahhv.h = (ahdd)new ahba((ahbh)ahhv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahhv.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhv.a);
            }
            case 3: {
                return new ahhv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhv.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003\u0005\u1009\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
