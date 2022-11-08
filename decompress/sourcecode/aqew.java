import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqew extends agzd implements agze
{
    public static final aqew a;
    public static final agzg b;
    private static volatile ahbe e;
    public String c;
    public aqex d;
    private int f;
    private byte g;
    
    static {
        final aqew a2 = new aqew();
        agzi.registerDefaultInstance((Class)aqew.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 194114827, ahcm.k, (Class)aqew.class);
    }
    
    private aqew() {
        this.g = 2;
        this.c = "";
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
                final ahbe e;
                if ((e = aqew.e) == null) {
                    synchronized (aqew.class) {
                        if (aqew.e == null) {
                            aqew.e = (ahbe)new agzb((agzi)aqew.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqew.a;
            }
            case 4: {
                return new agzc(aqew.a);
            }
            case 3: {
                return new aqew();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqew.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0001", new Object[] { "f", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
