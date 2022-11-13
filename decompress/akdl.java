import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdl extends ahbh implements ahcw
{
    public static final akdl a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akdl.class, (ahbh)(a = new akdl()));
    }
    
    private akdl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akdl.b) == null) {
                    synchronized (akdl.class) {
                        if (akdl.b == null) {
                            akdl.b = (ahdd)new ahba((ahbh)akdl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akdl.a;
            }
            case 4: {
                return new ahaz((ahbh)akdl.a);
            }
            case 3: {
                return new akdl();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdl.a, "\u0001\u0000", (Object[])null);
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
