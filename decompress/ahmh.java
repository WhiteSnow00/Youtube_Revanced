import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmh extends ahcz implements aheo
{
    public static final ahmh a;
    public static final ahcx b;
    private static volatile ahev g;
    public CommandOuterClass$Command c;
    public CommandOuterClass$Command d;
    public ahoq e;
    public String f;
    private int h;
    private byte i;
    
    static {
        final ahmh a2 = new ahmh();
        ahcz.registerDefaultInstance(ahmh.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 201264127, ahgc.k, ahmh.class);
    }
    
    private ahmh() {
        this.i = 2;
        this.f = "";
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
                final ahev g;
                if ((g = ahmh.g) == null) {
                    synchronized (ahmh.class) {
                        if (ahmh.g == null) {
                            ahmh.g = (ahev)new ahcs((ahcz)ahmh.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahmh.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmh.a);
            }
            case 3: {
                return new ahmh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmh.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002\u0004\u1008\u0003", new Object[] { "h", "c", "d", "e", "f" });
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
