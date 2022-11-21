import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpi extends ahcz implements aheo
{
    public static final aqpi a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    private byte g;
    
    static {
        final aqpi a2 = new aqpi();
        ahcz.registerDefaultInstance(aqpi.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 323854738, ahgc.k, aqpi.class);
    }
    
    private aqpi() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqpi.f) == null) {
                    synchronized (aqpi.class) {
                        if (aqpi.f == null) {
                            aqpi.f = (ahev)new ahcs((ahcz)aqpi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqpi.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpi.a);
            }
            case 3: {
                return new aqpi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
