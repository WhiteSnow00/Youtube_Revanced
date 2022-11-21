import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqp extends ahcz implements aheo
{
    public static final aqqp a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public Object d;
    
    static {
        final aqqp a2 = new aqqp();
        ahcz.registerDefaultInstance(aqqp.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 272531091, ahgc.k, aqqp.class);
    }
    
    private aqqp() {
        this.c = 0;
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
                if ((e = aqqp.e) == null) {
                    synchronized (aqqp.class) {
                        if (aqqp.e == null) {
                            aqqp.e = (ahev)new ahcs((ahcz)aqqp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqqp.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqp.a);
            }
            case 3: {
                return new aqqp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqp.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1037\u0000\u0002\u1034\u0000", new Object[] { "d", "c" });
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
