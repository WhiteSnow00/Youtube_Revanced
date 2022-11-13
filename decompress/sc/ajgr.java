import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgr extends ahbh implements ahcw
{
    public static final ajgr a;
    public static final ahbf b;
    private static volatile ahdd o;
    public int c;
    public String d;
    public int e;
    public float f;
    public float g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public amuc l;
    public long m;
    public amub n;
    
    static {
        final ajgr a2 = new ajgr();
        ahbh.registerDefaultInstance((Class)ajgr.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 141, ahek.k, (Class)ajgr.class);
    }
    
    private ajgr() {
        this.d = "";
        this.h = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = ajgr.o) == null) {
                    synchronized (ajgr.class) {
                        if (ajgr.o == null) {
                            ajgr.o = (ahdd)new ahba((ahbh)ajgr.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajgr.a;
            }
            case 4: {
                return new ahaz((ahbh)ajgr.a);
            }
            case 3: {
                return new ajgr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgr.a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1001\u0002\u0004\u1008\u0004\u0005\u1001\u0003\u0006\u1007\u0005\u0007\u1007\u0006\t\u1007\u0007\n\u1009\b\u000b\u1002\t\f\u1009\n", new Object[] { "c", "d", "e", apme.a(), "f", "h", "g", "i", "j", "k", "l", "m", "n" });
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
