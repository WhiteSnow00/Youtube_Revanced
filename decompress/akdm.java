import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdm extends ahcz implements aheo
{
    public static final akdm a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akdm.class, a = new akdm());
    }
    
    private akdm() {
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
                if ((d = akdm.d) == null) {
                    synchronized (akdm.class) {
                        if (akdm.d == null) {
                            akdm.d = (ahev)new ahcs((ahcz)akdm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akdm.a;
            }
            case 4: {
                return new ahcr((ahcz)akdm.a);
            }
            case 3: {
                return new akdm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdm.a, "\u0001\u0001\u0001\u0000\ue9d4\u32ca\ue9d4\u32ca\u0001\u0000\u0000\u0001\ue9d4\u32ca\u143c\u0000", new Object[] { "c", "b", akdi.class });
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
