import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqh extends ahcz implements aheo
{
    public static final aqqh a;
    public static final ahcx b;
    private static volatile ahev d;
    public int c;
    private int e;
    
    static {
        final aqqh a2 = new aqqh();
        ahcz.registerDefaultInstance(aqqh.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 445532692, ahgc.k, aqqh.class);
    }
    
    private aqqh() {
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
                if ((d = aqqh.d) == null) {
                    synchronized (aqqh.class) {
                        if (aqqh.d == null) {
                            aqqh.d = (ahev)new ahcs((ahcz)aqqh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqqh.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqh.a);
            }
            case 3: {
                return new aqqh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "e", "c", aqnr.h });
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
