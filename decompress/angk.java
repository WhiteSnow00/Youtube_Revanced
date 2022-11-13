import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angk extends ahbh implements ahcw
{
    public static final angk a;
    private static volatile ahdd d;
    public int b;
    public amgs c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)angk.class, (ahbh)(a = new angk()));
    }
    
    private angk() {
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
                if ((d = angk.d) == null) {
                    synchronized (angk.class) {
                        if (angk.d == null) {
                            angk.d = (ahdd)new ahba((ahbh)angk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return angk.a;
            }
            case 4: {
                return new ahaz((ahbh)angk.a);
            }
            case 3: {
                return new angk();
            }
            case 2: {
                return newMessageInfo((MessageLite)angk.a, "\u0001\u0001\u0000\u0001\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u1409\u0000", new Object[] { "b", "c" });
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
