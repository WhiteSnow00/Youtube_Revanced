import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akng extends ahbh implements ahcw
{
    public static final akng a;
    private static volatile ahdd i;
    public akli b;
    public int c;
    public String d;
    public boolean e;
    public ahab f;
    public ahbx g;
    public boolean h;
    private int j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akng.class, (ahbh)(a = new akng()));
    }
    
    private akng() {
        this.k = 2;
        this.d = "";
        this.f = ahab.b;
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = akng.i) == null) {
                    synchronized (akng.class) {
                        if (akng.i == null) {
                            akng.i = (ahdd)new ahba((ahbh)akng.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akng.a;
            }
            case 4: {
                return new ahaz((ahbh)akng.a);
            }
            case 3: {
                return new akng();
            }
            case 2: {
                return newMessageInfo((MessageLite)akng.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0005\u100a\u0004\u0006\u001b\u000b\u1007\t", new Object[] { "j", "b", "c", ajqf.h, "d", "e", "f", "g", akne.class, "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
