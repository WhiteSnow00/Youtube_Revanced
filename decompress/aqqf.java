import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqf extends ahcz implements aheo
{
    public static final aqqf a;
    public static final ahcx b;
    private static volatile ahev c;
    
    static {
        final aqqf a2 = new aqqf();
        ahcz.registerDefaultInstance(aqqf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 225399221, ahgc.k, aqqf.class);
    }
    
    private aqqf() {
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
                if ((c = aqqf.c) == null) {
                    synchronized (aqqf.class) {
                        if (aqqf.c == null) {
                            aqqf.c = (ahev)new ahcs((ahcz)aqqf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqqf.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqf.a);
            }
            case 3: {
                return new aqqf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqf.a, "\u0001\u0000", null);
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
