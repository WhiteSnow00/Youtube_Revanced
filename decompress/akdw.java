import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdw extends ahcz implements aheo
{
    public static final akdw a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public ahbt e;
    
    static {
        ahcz.registerDefaultInstance(akdw.class, a = new akdw());
    }
    
    private akdw() {
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = akdw.f) == null) {
                    synchronized (akdw.class) {
                        if (akdw.f == null) {
                            akdw.f = (ahev)new ahcs((ahcz)akdw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akdw.a;
            }
            case 4: {
                return new ahcr((ahcz)akdw.a);
            }
            case 3: {
                return new akdw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdw.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u1004\u0002\u0004\u100a\u0003", new Object[] { "b", "c", akan.n, "d", "e" });
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
