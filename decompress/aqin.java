import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqin extends ahcz implements aheo
{
    public static final aqin a;
    public static final ahcx b;
    private static volatile ahev e;
    public aqhw c;
    public aqgj d;
    private int f;
    private byte g;
    
    static {
        final aqin a2 = new aqin();
        ahcz.registerDefaultInstance(aqin.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 206181248, ahgc.k, aqin.class);
    }
    
    private aqin() {
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
                final ahev e;
                if ((e = aqin.e) == null) {
                    synchronized (aqin.class) {
                        if (aqin.e == null) {
                            aqin.e = (ahev)new ahcs((ahcz)aqin.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqin.a;
            }
            case 4: {
                return new ahcr((ahcz)aqin.a);
            }
            case 3: {
                return new aqin();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqin.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "f", "c", "d" });
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
