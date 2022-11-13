import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdv extends ahbh implements ahcw
{
    public static final akdv a;
    private static volatile ahdd h;
    public int b;
    public aiqj c;
    public aiqj d;
    public anuv e;
    public anuv f;
    public anuv g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)akdv.class, (ahbh)(a = new akdv()));
    }
    
    private akdv() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = akdv.h) == null) {
                    synchronized (akdv.class) {
                        if (akdv.h == null) {
                            akdv.h = (ahdd)new ahba((ahbh)akdv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akdv.a;
            }
            case 4: {
                return new ahaz((ahbh)akdv.a);
            }
            case 3: {
                return new akdv();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdv.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
