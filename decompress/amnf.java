import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnf extends ahcz implements aheo
{
    public static final amnf a;
    public static final ahcx b;
    private static volatile ahev d;
    public ahdp c;
    
    static {
        final amnf a2 = new amnf();
        ahcz.registerDefaultInstance(amnf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 290993185, ahgc.k, amnf.class);
    }
    
    private amnf() {
        this.c = ahcz.emptyProtobufList();
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
                if ((d = amnf.d) == null) {
                    synchronized (amnf.class) {
                        if (amnf.d == null) {
                            amnf.d = (ahev)new ahcs((ahcz)amnf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amnf.a;
            }
            case 4: {
                return new ahcr((ahcz)amnf.a);
            }
            case 3: {
                return new amnf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnf.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "c" });
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
