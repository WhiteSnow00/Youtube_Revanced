import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfs extends ahbh implements ahcw
{
    public static final anfs a;
    private static volatile ahdd e;
    public int b;
    public ahbp c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)anfs.class, (ahbh)(a = new anfs()));
    }
    
    private anfs() {
        this.c = emptyIntList();
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anfs.e) == null) {
                    synchronized (anfs.class) {
                        if (anfs.e == null) {
                            anfs.e = (ahdd)new ahba((ahbh)anfs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anfs.a;
            }
            case 4: {
                return new ahaz((boolean[])null, (short[][])null);
            }
            case 3: {
                return new anfs();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002\u1008\u0000", new Object[] { "b", "c", anci.m, "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
