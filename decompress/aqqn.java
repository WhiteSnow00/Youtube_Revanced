import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqn extends ahcu implements ahcv
{
    public static final aqqn a;
    public static final ahcx b;
    private static volatile ahev i;
    public int c;
    public aqiq d;
    public aqiq e;
    public ahdp f;
    public String g;
    public CommandOuterClass$Command h;
    private byte j;
    
    static {
        final aqqn a2 = new aqqn();
        ahcz.registerDefaultInstance(aqqn.class, (ahcz)(a = a2));
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 278463287, ahgc.k, aqqn.class);
    }
    
    private aqqn() {
        this.j = 2;
        this.f = emptyProtobufList();
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = aqqn.i) == null) {
                    synchronized (aqqn.class) {
                        if (aqqn.i == null) {
                            aqqn.i = (ahev)new ahcs((ahcz)aqqn.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqqn.a;
            }
            case 4: {
                return new ahct((ahcu)aqqn.a);
            }
            case 3: {
                return new aqqn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqqn.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u1008\u0002\u0005\u1409\u0003", new Object[] { "c", "d", "e", "f", aqiq.class, "g", "h" });
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
