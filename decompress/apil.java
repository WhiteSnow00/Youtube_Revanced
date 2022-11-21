import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apil extends ahcz implements aheo
{
    public static final apil a;
    public static final ahcx b;
    private static volatile ahev d;
    public aldz c;
    private int e;
    private byte f;
    
    static {
        final apil a2 = new apil();
        ahcz.registerDefaultInstance(apil.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 466908575, ahgc.k, apil.class);
    }
    
    private apil() {
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
                if ((d = apil.d) == null) {
                    synchronized (apil.class) {
                        if (apil.d == null) {
                            apil.d = (ahev)new ahcs((ahcz)apil.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apil.a;
            }
            case 4: {
                return new ahcr((ahcz)apil.a);
            }
            case 3: {
                return new apil();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apil.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
