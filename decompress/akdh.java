import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdh extends ahcz implements aheo
{
    public static final akdh a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akdh.class, a = new akdh());
    }
    
    private akdh() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akdh.d) == null) {
                    synchronized (akdh.class) {
                        if (akdh.d == null) {
                            akdh.d = (ahev)new ahcs((ahcz)akdh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akdh.a;
            }
            case 4: {
                return new ahcr((ahcz)akdh.a);
            }
            case 3: {
                return new akdh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdh.a, "\u0001\u0001\u0001\u0000\ue46c\u1687\ue46c\u1687\u0001\u0000\u0000\u0001\ue46c\u1687\u143c\u0000", new Object[] { "c", "b", akdj.class });
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
