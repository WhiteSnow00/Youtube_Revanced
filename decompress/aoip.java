import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoip extends ahcz implements aheo
{
    public static final aoip a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public aqiq d;
    public int e;
    public int f;
    public int g;
    private byte i;
    
    static {
        final aoip a2 = new aoip();
        ahcz.registerDefaultInstance(aoip.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 234871417, ahgc.k, aoip.class);
    }
    
    private aoip() {
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
                if ((h = aoip.h) == null) {
                    synchronized (aoip.class) {
                        if (aoip.h == null) {
                            aoip.h = (ahev)new ahcs((ahcz)aoip.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoip.a;
            }
            case 4: {
                return new ahcr((ahcz)aoip.a);
            }
            case 3: {
                return new aoip();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoip.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100b\u0002\u0004\u100b\u0003\u0005\u100b\u0004", new Object[] { "c", "d", "e", "f", "g" });
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
