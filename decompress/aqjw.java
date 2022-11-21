import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjw extends ahcz implements aheo
{
    public static final aqjw a;
    public static final ahcx b;
    private static volatile ahev d;
    public ahdp c;
    private byte e;
    
    static {
        final aqjw a2 = new aqjw();
        ahcz.registerDefaultInstance(aqjw.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 170382688, ahgc.k, aqjw.class);
    }
    
    private aqjw() {
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
                if ((d = aqjw.d) == null) {
                    synchronized (aqjw.class) {
                        if (aqjw.d == null) {
                            aqjw.d = (ahev)new ahcs((ahcz)aqjw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqjw.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjw.a);
            }
            case 3: {
                return new aqjw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjw.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "c", CommandOuterClass$Command.class });
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
