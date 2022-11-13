import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdz extends ahbh implements ahcw
{
    public static final akdz a;
    private static volatile ahdd d;
    public int b;
    public anuv c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akdz.class, (ahbh)(a = new akdz()));
    }
    
    private akdz() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akdz.d) == null) {
                    synchronized (akdz.class) {
                        if (akdz.d == null) {
                            akdz.d = (ahdd)new ahba((ahbh)akdz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akdz.a;
            }
            case 4: {
                return new ahaz((ahbh)akdz.a);
            }
            case 3: {
                return new akdz();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
