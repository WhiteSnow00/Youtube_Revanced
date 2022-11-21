import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdq extends ahcz implements aheo
{
    public static final akdq a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(akdq.class, a = new akdq());
    }
    
    private akdq() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akdq.d) == null) {
                    synchronized (akdq.class) {
                        if (akdq.d == null) {
                            akdq.d = (ahev)new ahcs((ahcz)akdq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akdq.a;
            }
            case 4: {
                return new ahcr((ahcz)akdq.a);
            }
            case 3: {
                return new akdq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", akan.m });
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
