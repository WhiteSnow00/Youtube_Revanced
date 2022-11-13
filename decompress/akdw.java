import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdw extends ahbh implements ahcw
{
    public static final akdw a;
    private static volatile ahdd g;
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;
    
    static {
        ahbh.registerDefaultInstance((Class)akdw.class, (ahbh)(a = new akdw()));
    }
    
    private akdw() {
        this.e = 1.0;
        this.f = 1.0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = akdw.g) == null) {
                    synchronized (akdw.class) {
                        if (akdw.g == null) {
                            akdw.g = (ahdd)new ahba((ahbh)akdw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akdw.a;
            }
            case 4: {
                return new ahaz((ahbh)akdw.a);
            }
            case 3: {
                return new akdw();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u1000\u0002\u0004\u1000\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
