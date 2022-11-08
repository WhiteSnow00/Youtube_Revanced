import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoed extends agzi implements ahax
{
    public static final aoed a;
    public static final agzg b;
    private static volatile ahbe h;
    public int c;
    public aqdk d;
    public int e;
    public int f;
    public int g;
    private byte i;
    
    static {
        final aoed a2 = new aoed();
        agzi.registerDefaultInstance(aoed.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 234871417, ahcm.k, aoed.class);
    }
    
    private aoed() {
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = aoed.h) == null) {
                    synchronized (aoed.class) {
                        if (aoed.h == null) {
                            aoed.h = (ahbe)new agzb((agzi)aoed.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoed.a;
            }
            case 4: {
                return new agza((agzi)aoed.a);
            }
            case 3: {
                return new aoed();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoed.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100b\u0002\u0004\u100b\u0003\u0005\u100b\u0004", new Object[] { "c", "d", "e", "f", "g" });
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
