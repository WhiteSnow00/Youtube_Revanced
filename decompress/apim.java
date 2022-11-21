import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apim extends ahcz implements aheo
{
    public static final apim a;
    public static final ahcx b;
    private static volatile ahev d;
    public aleb c;
    private int e;
    private byte f;
    
    static {
        final apim a2 = new apim();
        ahcz.registerDefaultInstance(apim.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 382524576, ahgc.k, apim.class);
    }
    
    private apim() {
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
                if ((d = apim.d) == null) {
                    synchronized (apim.class) {
                        if (apim.d == null) {
                            apim.d = (ahev)new ahcs((ahcz)apim.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apim.a;
            }
            case 4: {
                return new ahcr((ahcz)apim.a);
            }
            case 3: {
                return new apim();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apim.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
