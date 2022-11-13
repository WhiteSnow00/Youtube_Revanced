import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbx extends ahbh implements ahcw
{
    public static final anbx a;
    private static volatile ahdd b;
    private int c;
    private CommandOuterClass$Command d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anbx.class, (ahbh)(a = new anbx()));
    }
    
    private anbx() {
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
                if ((b = anbx.b) == null) {
                    synchronized (anbx.class) {
                        if (anbx.b == null) {
                            anbx.b = (ahdd)new ahba((ahbh)anbx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anbx.a;
            }
            case 4: {
                return new ahaz((ahbh)anbx.a);
            }
            case 3: {
                return new anbx();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbx.a, "\u0001\u0002\u0000\u0001\b\t\u0002\u0000\u0000\u0002\b\u1409\u0007\t\u1409\t", new Object[] { "c", "d", "e" });
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
