import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angn extends ahbh implements ahcw
{
    public static final angn a;
    private static volatile ahdd b;
    private int c;
    private amgs d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)angn.class, (ahbh)(a = new angn()));
    }
    
    private angn() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = angn.b) == null) {
                    synchronized (angn.class) {
                        if (angn.b == null) {
                            angn.b = (ahdd)new ahba((ahbh)angn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return angn.a;
            }
            case 4: {
                return new ahaz((ahbh)angn.a);
            }
            case 3: {
                return new angn();
            }
            case 2: {
                return newMessageInfo((MessageLite)angn.a, "\u0001\u0001\u0000\u0001\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
