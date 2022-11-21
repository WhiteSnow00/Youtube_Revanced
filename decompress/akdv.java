import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdv extends ahcz implements aheo
{
    public static final akdv a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(akdv.class, a = new akdv());
    }
    
    private akdv() {
        this.c = "";
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
                if ((d = akdv.d) == null) {
                    synchronized (akdv.class) {
                        if (akdv.d == null) {
                            akdv.d = (ahev)new ahcs((ahcz)akdv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akdv.a;
            }
            case 4: {
                return new ahcr((ahcz)akdv.a);
            }
            case 3: {
                return new akdv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
