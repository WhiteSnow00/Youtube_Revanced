import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqks extends ahbh implements ahcw
{
    public static final aqks a;
    private static volatile ahdd b;
    private int c;
    private CommandOuterClass$Command d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqks.class, (ahbh)(a = new aqks()));
    }
    
    private aqks() {
        this.f = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqks.b) == null) {
                    synchronized (aqks.class) {
                        if (aqks.b == null) {
                            aqks.b = (ahdd)new ahba((ahbh)aqks.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqks.a;
            }
            case 4: {
                return new ahaz((ahbh)aqks.a);
            }
            case 3: {
                return new aqks();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqks.a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0005\u1409\u0007", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
