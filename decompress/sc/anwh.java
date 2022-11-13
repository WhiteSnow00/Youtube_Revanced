import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwh extends ahbh implements ahcw
{
    public static final anwh a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)anwh.class, (ahbh)(a = new anwh()));
    }
    
    private anwh() {
        this.c = "";
        final ahab b = ahab.b;
        this.d = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anwh.e) == null) {
                    synchronized (anwh.class) {
                        if (anwh.e == null) {
                            anwh.e = (ahdd)new ahba((ahbh)anwh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anwh.a;
            }
            case 4: {
                return new ahaz((boolean[][])null);
            }
            case 3: {
                return new anwh();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwh.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0003\u001a", new Object[] { "b", "c", "d" });
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
