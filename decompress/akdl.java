import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdl extends ahcz implements aheo
{
    public static final akdl a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akdl.class, a = new akdl());
    }
    
    private akdl() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = akdl.c) == null) {
                    synchronized (akdl.class) {
                        if (akdl.c == null) {
                            akdl.c = (ahev)new ahcs((ahcz)akdl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akdl.a;
            }
            case 4: {
                return new ahcr((ahcz)akdl.a);
            }
            case 3: {
                return new akdl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", akan.k });
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
