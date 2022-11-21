import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apik extends ahcz implements aheo
{
    public static final apik a;
    public static final ahcx b;
    private static volatile ahev d;
    public aldx c;
    private int e;
    private byte f;
    
    static {
        final apik a2 = new apik();
        ahcz.registerDefaultInstance(apik.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 359752495, ahgc.k, apik.class);
    }
    
    private apik() {
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
                if ((d = apik.d) == null) {
                    synchronized (apik.class) {
                        if (apik.d == null) {
                            apik.d = (ahev)new ahcs((ahcz)apik.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apik.a;
            }
            case 4: {
                return new ahcr((ahcz)apik.a);
            }
            case 3: {
                return new apik();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apik.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
