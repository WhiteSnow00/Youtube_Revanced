import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdp extends ahbh implements ahcw
{
    public static final akdp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akdp.class, (ahbh)(a = new akdp()));
    }
    
    private akdp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akdp.b) == null) {
                    synchronized (akdp.class) {
                        if (akdp.b == null) {
                            akdp.b = (ahdd)new ahba((ahbh)akdp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akdp.a;
            }
            case 4: {
                return new ahaz((ahbh)akdp.a);
            }
            case 3: {
                return new akdp();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdp.a, "\u0001\u0000", (Object[])null);
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
