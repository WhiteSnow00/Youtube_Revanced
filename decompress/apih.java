import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apih extends ahcz implements aheo
{
    public static final apih a;
    public static final ahcx b;
    private static volatile ahev d;
    public aldu c;
    private int e;
    private byte f;
    
    static {
        final apih a2 = new apih();
        ahcz.registerDefaultInstance(apih.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 432746749, ahgc.k, apih.class);
    }
    
    private apih() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = apih.d) == null) {
                    synchronized (apih.class) {
                        if (apih.d == null) {
                            apih.d = (ahev)new ahcs((ahcz)apih.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apih.a;
            }
            case 4: {
                return new ahcr((ahcz)apih.a);
            }
            case 3: {
                return new apih();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apih.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
