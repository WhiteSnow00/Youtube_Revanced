import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjn extends ahcz implements aheo
{
    public static final aqjn a;
    public static final ahcx b;
    private static volatile ahev e;
    public String c;
    public CommandOuterClass$Command d;
    private int f;
    private byte g;
    
    static {
        final aqjn a2 = new aqjn();
        ahcz.registerDefaultInstance(aqjn.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 325347951, ahgc.k, aqjn.class);
    }
    
    private aqjn() {
        this.g = 2;
        this.c = "";
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
                final ahev e;
                if ((e = aqjn.e) == null) {
                    synchronized (aqjn.class) {
                        if (aqjn.e == null) {
                            aqjn.e = (ahev)new ahcs((ahcz)aqjn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqjn.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjn.a);
            }
            case 3: {
                return new aqjn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "f", "c", "d" });
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
