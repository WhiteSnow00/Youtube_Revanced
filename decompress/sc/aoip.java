import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoip extends ahbh implements ahcw
{
    public static final aoip a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoip.class, (ahbh)(a = new aoip()));
    }
    
    private aoip() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aoip.f) == null) {
                    synchronized (aoip.class) {
                        if (aoip.f == null) {
                            aoip.f = (ahdd)new ahba((ahbh)aoip.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoip.a;
            }
            case 4: {
                return new ahaz((ahbh)aoip.a);
            }
            case 3: {
                return new aoip();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoip.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002", new Object[] { "b", "c", aoet.p, "d", akdh.a(), "e" });
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
