import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdm extends ahbh implements ahcw
{
    public static final akdm a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akdm.class, (ahbh)(a = new akdm()));
    }
    
    private akdm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akdm.b) == null) {
                    synchronized (akdm.class) {
                        if (akdm.b == null) {
                            akdm.b = (ahdd)new ahba((ahbh)akdm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akdm.a;
            }
            case 4: {
                return new ahaz((ahbh)akdm.a);
            }
            case 3: {
                return new akdm();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdm.a, "\u0001\u0000", (Object[])null);
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
