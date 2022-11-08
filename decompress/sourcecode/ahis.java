import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahis extends agzi implements ahax
{
    public static final ahis a;
    public static final agzg b;
    private static volatile ahbe g;
    public CommandOuterClass$Command c;
    public CommandOuterClass$Command d;
    public ahlb e;
    public String f;
    private int h;
    private byte i;
    
    static {
        final ahis a2 = new ahis();
        agzi.registerDefaultInstance((Class)ahis.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqez.a, (Object)a2, (MessageLite)a2, (agzn)null, 201264127, ahcm.k, (Class)ahis.class);
    }
    
    private ahis() {
        this.i = 2;
        this.f = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahis.g) == null) {
                    synchronized (ahis.class) {
                        if (ahis.g == null) {
                            ahis.g = (ahbe)new agzb((agzi)ahis.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahis.a;
            }
            case 4: {
                return new agza((agzi)ahis.a);
            }
            case 3: {
                return new ahis();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahis.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002\u0004\u1008\u0003", new Object[] { "h", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
