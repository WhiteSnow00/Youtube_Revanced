import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqig extends ahcz implements aheo
{
    public static final aqig a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public float d;
    public CommandOuterClass$Command e;
    private byte g;
    
    static {
        final aqig a2 = new aqig();
        ahcz.registerDefaultInstance(aqig.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 182590845, ahgc.k, aqig.class);
    }
    
    private aqig() {
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
                if ((f = aqig.f) == null) {
                    synchronized (aqig.class) {
                        if (aqig.f == null) {
                            aqig.f = (ahev)new ahcs((ahcz)aqig.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqig.a;
            }
            case 4: {
                return new ahcr((ahcz)aqig.a);
            }
            case 3: {
                return new aqig();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqig.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1001\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
