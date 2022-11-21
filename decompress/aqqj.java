import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqj extends ahcz implements aheo
{
    public static final aqqj a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public String d;
    public int e;
    
    static {
        final aqqj a2 = new aqqj();
        ahcz.registerDefaultInstance(aqqj.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 432983888, ahgc.k, aqqj.class);
    }
    
    private aqqj() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqqj.f) == null) {
                    synchronized (aqqj.class) {
                        if (aqqj.f == null) {
                            aqqj.f = (ahev)new ahcs((ahcz)aqqj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqqj.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqj.a);
            }
            case 3: {
                return new aqqj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "c", "d", "e", aqnr.i });
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
