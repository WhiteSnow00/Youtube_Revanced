import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlg extends ahbh implements ahcw
{
    public static final aqlg a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public String d;
    
    static {
        final aqlg a2 = new aqlg();
        ahbh.registerDefaultInstance((Class)aqlg.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqgw.a, (Object)a2, (MessageLite)a2, (ahbm)null, 284051629, ahek.k, (Class)aqlg.class);
    }
    
    private aqlg() {
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
                if ((e = aqlg.e) == null) {
                    synchronized (aqlg.class) {
                        if (aqlg.e == null) {
                            aqlg.e = (ahdd)new ahba((ahbh)aqlg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqlg.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlg.a);
            }
            case 3: {
                return new aqlg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlg.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "c", "d" });
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
