import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqv extends ahcz implements aheo
{
    public static final aqqv a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public aqiq d;
    public aqiq e;
    public ahdp f;
    public String g;
    private byte i;
    
    static {
        final aqqv a2 = new aqqv();
        ahcz.registerDefaultInstance(aqqv.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 352829283, ahgc.k, aqqv.class);
    }
    
    private aqqv() {
        this.i = 2;
        this.f = ahcz.emptyProtobufList();
        this.g = "";
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
                if ((h = aqqv.h) == null) {
                    synchronized (aqqv.class) {
                        if (aqqv.h == null) {
                            aqqv.h = (ahev)new ahcs((ahcz)aqqv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqqv.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqv.a);
            }
            case 3: {
                return new aqqv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqv.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u1008\u0002", new Object[] { "c", "d", "e", "f", aqiq.class, "g" });
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
