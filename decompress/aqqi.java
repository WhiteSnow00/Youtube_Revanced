import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqi extends ahcz implements aheo
{
    public static final aqqi a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    public boolean f;
    public boolean g;
    private CommandOuterClass$Command i;
    private byte j;
    
    static {
        final aqqi a2 = new aqqi();
        ahcz.registerDefaultInstance(aqqi.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 217374632, ahgc.k, aqqi.class);
    }
    
    private aqqi() {
        this.j = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aqqi.h) == null) {
                    synchronized (aqqi.class) {
                        if (aqqi.h == null) {
                            aqqi.h = (ahev)new ahcs((ahcz)aqqi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqqi.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqi.a);
            }
            case 3: {
                return new aqqi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqi.a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1007\u0003\u0005\u1409\u0002\u0006\u1007\u0004", new Object[] { "c", "d", "e", "f", "i", "g" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
