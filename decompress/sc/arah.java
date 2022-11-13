import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arah extends ahbh implements ahcw
{
    public static final arah a;
    private static volatile ahdd m;
    public int b;
    public String c;
    public String d;
    public ahfs e;
    public ahfs f;
    public aqxx g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public ahbx l;
    
    static {
        ahbh.registerDefaultInstance((Class)arah.class, (ahbh)(a = new arah()));
    }
    
    private arah() {
        this.c = "";
        this.d = "";
        final ahab b = ahab.b;
        this.l = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = arah.m) == null) {
                    synchronized (arah.class) {
                        if (arah.m == null) {
                            arah.m = (ahdd)new ahba((ahbh)arah.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return arah.a;
            }
            case 4: {
                return new ahaz((short[][])null, (char[])null);
            }
            case 3: {
                return new arah();
            }
            case 2: {
                return newMessageInfo((MessageLite)arah.a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0000\u0001\u1008\u0000\u0005\u1008\u0002\u0006\u1009\u0003\u0007\u1009\u0004\b\u1009\u0007\t\u100c\b\n\u100c\t\u000b\u1001\n\u000f\u1007\u000e\u0011\u001b", new Object[] { "b", "c", "d", "e", "f", "g", "h", aqxt.a(), "i", aqyq.a(), "j", "k", "l", arag.class });
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
