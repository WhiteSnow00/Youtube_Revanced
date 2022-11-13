import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anim extends ahbh implements ahcw
{
    public static final anim a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anim.class, (ahbh)(a = new anim()));
    }
    
    private anim() {
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
                if ((d = anim.d) == null) {
                    synchronized (anim.class) {
                        if (anim.d == null) {
                            anim.d = (ahdd)new ahba((ahbh)anim.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anim.a;
            }
            case 4: {
                return new ahaz((ahbh)anim.a);
            }
            case 3: {
                return new anim();
            }
            case 2: {
                return newMessageInfo((MessageLite)anim.a, "\u0001\u0001\u0001\u0000\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u143c\u0000", new Object[] { "c", "b", amgs.class });
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
