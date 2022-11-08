import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfg extends agzi implements ahax
{
    public static final aqfg a;
    private static volatile ahbe b;
    private int c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private ahlb f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aqfg.class, (agzi)(a = new aqfg()));
    }
    
    private aqfg() {
        this.g = 2;
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
                if ((b2 = aqfg.b) == null) {
                    synchronized (aqfg.class) {
                        if (aqfg.b == null) {
                            aqfg.b = (ahbe)new agzb((agzi)aqfg.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqfg.a;
            }
            case 4: {
                return new agza((agzi)aqfg.a);
            }
            case 3: {
                return new aqfg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002", new Object[] { "c", "d", "e", "f" });
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
