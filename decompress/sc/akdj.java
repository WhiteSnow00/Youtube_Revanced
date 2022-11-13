import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdj extends ahbh implements ahcw
{
    public static final akdj a;
    private static volatile ahdd f;
    public int b;
    public akdi c;
    public ajut d;
    public int e;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akdj.class, (ahbh)(a = new akdj()));
    }
    
    private akdj() {
        this.h = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akdj.f) == null) {
                    synchronized (akdj.class) {
                        if (akdj.f == null) {
                            akdj.f = (ahdd)new ahba((ahbh)akdj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akdj.a;
            }
            case 4: {
                return new ahaz((ahbh)akdj.a);
            }
            case 3: {
                return new akdj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdj.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100b\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
