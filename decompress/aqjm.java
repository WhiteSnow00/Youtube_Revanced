import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjm extends ahcz implements aheo
{
    public static final aqjm a;
    public static final ahcx b;
    private static volatile ahev d;
    public ahdp c;
    private byte e;
    
    static {
        final aqjm a2 = new aqjm();
        ahcz.registerDefaultInstance(aqjm.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 170382656, ahgc.k, aqjm.class);
    }
    
    private aqjm() {
        this.e = 2;
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aqjm.d) == null) {
                    synchronized (aqjm.class) {
                        if (aqjm.d == null) {
                            aqjm.d = (ahev)new ahcs((ahcz)aqjm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqjm.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjm.a);
            }
            case 3: {
                return new aqjm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjm.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "c", CommandOuterClass$Command.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
