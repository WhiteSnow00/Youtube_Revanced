import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class anjd extends agzi implements ahax
{
    public static final anjd a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public aqdk d;
    private byte f;
    
    static {
        final anjd a2 = new anjd();
        agzi.registerDefaultInstance(anjd.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 202698262, ahcm.k, anjd.class);
    }
    
    private anjd() {
        this.f = 2;
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
                final ahbe e;
                if ((e = anjd.e) == null) {
                    synchronized (anjd.class) {
                        if (anjd.e == null) {
                            anjd.e = (ahbe)new agzb((agzi)anjd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anjd.a;
            }
            case 4: {
                return new agza((agzi)anjd.a);
            }
            case 3: {
                return new anjd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
