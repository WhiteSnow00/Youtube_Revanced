import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angc extends ahbh implements ahcw
{
    public static final angc a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)angc.class, (ahbh)(a = new angc()));
    }
    
    private angc() {
        this.b = 0;
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
                final ahdd d;
                if ((d = angc.d) == null) {
                    synchronized (angc.class) {
                        if (angc.d == null) {
                            angc.d = (ahdd)new ahba((ahbh)angc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return angc.a;
            }
            case 4: {
                return new ahaz((ahbh)angc.a);
            }
            case 3: {
                return new angc();
            }
            case 2: {
                return newMessageInfo((MessageLite)angc.a, "\u0001\u0002\u0001\u0000\ueb11\u1f11\ueaaa\u1fae\u0002\u0000\u0000\u0002\ueb11\u1f11\u143c\u0000\ueaaa\u1fae\u143c\u0000", new Object[] { "c", "b", aicz.class, amgs.class });
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
