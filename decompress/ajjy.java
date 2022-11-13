import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjy extends ahbh implements ahcw
{
    public static final ajjy a;
    public static final ahbf b;
    private static volatile ahdd j;
    public int c;
    public String d;
    public ahbx e;
    public long f;
    public long g;
    public String h;
    public ajjx i;
    
    static {
        final ajjy a2 = new ajjy();
        ahbh.registerDefaultInstance((Class)ajjy.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 146, ahek.k, (Class)ajjy.class);
    }
    
    private ajjy() {
        this.d = "";
        this.e = emptyProtobufList();
        this.h = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = ajjy.j) == null) {
                    synchronized (ajjy.class) {
                        if (ajjy.j == null) {
                            ajjy.j = (ahdd)new ahba((ahbh)ajjy.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajjy.a;
            }
            case 4: {
                return new ahaz((int[])null, (char[][][])null);
            }
            case 3: {
                return new ajjy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjy.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1008\u0003\u0006\u1009\u0004", new Object[] { "c", "d", "e", ajjz.class, "f", "g", "h", "i" });
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
