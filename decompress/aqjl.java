import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjl extends ahcz implements aheo
{
    public static final aqjl a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    public CommandOuterClass$Command g;
    private byte i;
    
    static {
        final aqjl a2 = new aqjl();
        ahcz.registerDefaultInstance(aqjl.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 170382629, ahgc.k, aqjl.class);
    }
    
    private aqjl() {
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
                if ((h = aqjl.h) == null) {
                    synchronized (aqjl.class) {
                        if (aqjl.h == null) {
                            aqjl.h = (ahev)new ahcs((ahcz)aqjl.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqjl.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjl.a);
            }
            case 3: {
                return new aqjl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjl.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
