import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqio extends ahcz implements aheo
{
    public static final aqio a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public aqgs d;
    public int e;
    public boolean f;
    public int g;
    private byte i;
    
    static {
        final aqio a2 = new aqio();
        ahcz.registerDefaultInstance(aqio.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 194116769, ahgc.k, aqio.class);
    }
    
    private aqio() {
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aqio.h) == null) {
                    synchronized (aqio.class) {
                        if (aqio.h == null) {
                            aqio.h = (ahev)new ahcs((ahcz)aqio.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqio.a;
            }
            case 4: {
                return new ahcr((ahcz)aqio.a);
            }
            case 3: {
                return new aqio();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqio.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0004\u1007\u0003\u0005\u1004\u0004", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
