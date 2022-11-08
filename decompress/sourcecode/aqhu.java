import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhu extends agzi implements ahax
{
    public static final aqhu a;
    private static volatile ahbe b;
    private int c;
    private CommandOuterClass$Command d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqhu.class, (agzi)(a = new aqhu()));
    }
    
    private aqhu() {
        this.e = 2;
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
                if ((b2 = aqhu.b) == null) {
                    synchronized (aqhu.class) {
                        if (aqhu.b == null) {
                            aqhu.b = (ahbe)new agzb((agzi)aqhu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhu.a;
            }
            case 4: {
                return new agza((agzi)aqhu.a);
            }
            case 3: {
                return new aqhu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhu.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
