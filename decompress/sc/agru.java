import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agru extends ahbh implements ahcw
{
    public static final agru a;
    private static volatile ahdd j;
    public int b;
    public ahbx c;
    public int d;
    public String e;
    public agrw f;
    public agrx g;
    public String h;
    public boolean i;
    
    static {
        ahbh.registerDefaultInstance((Class)agru.class, (ahbh)(a = new agru()));
    }
    
    private agru() {
        this.c = emptyProtobufList();
        this.e = "";
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
                if ((j = agru.j) == null) {
                    synchronized (agru.class) {
                        if (agru.j == null) {
                            agru.j = (ahdd)new ahba((ahbh)agru.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agru.a;
            }
            case 4: {
                return new ahaz((ahbh)agru.a);
            }
            case 3: {
                return new agru();
            }
            case 2: {
                return newMessageInfo((MessageLite)agru.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u100c\u0000\u0003\u1008\u0001\u0004\u1009\u0002\u0005\u1009\u0003\u0006\u1008\u0004\u0007\u1007\u0005", new Object[] { "b", "c", agrv.class, "d", afqo.j, "e", "f", "g", "h", "i" });
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
