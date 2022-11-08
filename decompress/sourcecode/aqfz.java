import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfz extends agzi implements ahax
{
    public static final aqfz a;
    private static volatile ahbe b;
    private int c;
    private CommandOuterClass$Command d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqfz.class, (agzi)(a = new aqfz()));
    }
    
    private aqfz() {
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
                if ((b2 = aqfz.b) == null) {
                    synchronized (aqfz.class) {
                        if (aqfz.b == null) {
                            aqfz.b = (ahbe)new agzb((agzi)aqfz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqfz.a;
            }
            case 4: {
                return new agza((agzi)aqfz.a);
            }
            case 3: {
                return new aqfz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfz.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
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
