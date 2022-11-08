import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfp extends agzi implements ahax
{
    public static final aqfp a;
    private static volatile ahbe b;
    private int c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)aqfp.class, (agzi)(a = new aqfp()));
    }
    
    private aqfp() {
        this.h = 2;
        final agyc b = agyc.b;
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
                final ahbe b2;
                if ((b2 = aqfp.b) == null) {
                    synchronized (aqfp.class) {
                        if (aqfp.b == null) {
                            aqfp.b = (ahbe)new agzb((agzi)aqfp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqfp.a;
            }
            case 4: {
                return new agza((agzi)aqfp.a);
            }
            case 3: {
                return new aqfp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfp.a, "\u0001\u0004\u0000\u0001\u0004\u001a\u0004\u0000\u0000\u0004\u0004\u1409\u0002\u0006\u1409\u0018\f\u1409\u0003\u001a\u1409\u0004", new Object[] { "c", "d", "g", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
