import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airf extends ahcz implements aheo
{
    public static final airf a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public int d;
    
    static {
        final airf a2 = new airf();
        ahcz.registerDefaultInstance(airf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 273756508, ahgc.k, airf.class);
    }
    
    private airf() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = airf.e) == null) {
                    synchronized (airf.class) {
                        if (airf.e == null) {
                            airf.e = (ahev)new ahcs((ahcz)airf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return airf.a;
            }
            case 4: {
                return new ahcr((ahcz)airf.a);
            }
            case 3: {
                return new airf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", anpf.a() });
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
