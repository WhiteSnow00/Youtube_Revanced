import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoge extends ahbh implements ahcw
{
    public static final aoge a;
    public static final ahbf b;
    private static volatile ahdd i;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public long h;
    
    static {
        final aoge a2 = new aoge();
        ahbh.registerDefaultInstance((Class)aoge.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 262904603, ahek.k, (Class)aoge.class);
    }
    
    private aoge() {
        this.d = "";
        this.e = "";
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aoge.i) == null) {
                    synchronized (aoge.class) {
                        if (aoge.i == null) {
                            aoge.i = (ahdd)new ahba((ahbh)aoge.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoge.a;
            }
            case 4: {
                return new ahaz((ahbh)aoge.a);
            }
            case 3: {
                return new aoge();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoge.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0004\u1007\u0003\u0005\u1008\u0004\u0006\u1003\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
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
