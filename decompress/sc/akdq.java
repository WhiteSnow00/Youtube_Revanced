import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdq extends ahbh implements ahcw
{
    public static final akdq a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akdq.class, (ahbh)(a = new akdq()));
    }
    
    private akdq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akdq.b) == null) {
                    synchronized (akdq.class) {
                        if (akdq.b == null) {
                            akdq.b = (ahdd)new ahba((ahbh)akdq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akdq.a;
            }
            case 4: {
                return new ahaz((ahbh)akdq.a);
            }
            case 3: {
                return new akdq();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdq.a, "\u0001\u0000", (Object[])null);
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
