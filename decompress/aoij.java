import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoij extends ahbh implements ahcw
{
    public static final aoij a;
    private static volatile ahdd d;
    public int b;
    public aoig c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoij.class, (ahbh)(a = new aoij()));
    }
    
    private aoij() {
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
                if ((d = aoij.d) == null) {
                    synchronized (aoij.class) {
                        if (aoij.d == null) {
                            aoij.d = (ahdd)new ahba((ahbh)aoij.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoij.a;
            }
            case 4: {
                return new ahaz((ahbh)aoij.a);
            }
            case 3: {
                return new aoij();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoij.a, "\u0001\u0001\u0000\u0001\ue5e7\u38d3\ue5e7\u38d3\u0001\u0000\u0000\u0001\ue5e7\u38d3\u1409\u0000", new Object[] { "b", "c" });
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
