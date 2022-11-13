import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhz extends ahbh implements ahcw
{
    public static final ahhz a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhz.class, (ahbh)(a = new ahhz()));
    }
    
    private ahhz() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ahhz.e) == null) {
                    synchronized (ahhz.class) {
                        if (ahhz.e == null) {
                            ahhz.e = (ahdd)new ahba((ahbh)ahhz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahhz.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhz.a);
            }
            case 3: {
                return new ahhz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
