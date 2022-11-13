import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqel extends ahbh implements ahcw
{
    public static final aqel a;
    public static final ahbf b;
    private static volatile ahdd j;
    public String c;
    public int d;
    public String e;
    public int f;
    public int g;
    public int h;
    public aipi i;
    private int k;
    
    static {
        final aqel a2 = new aqel();
        ahbh.registerDefaultInstance((Class)aqel.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqhl.a, (Object)a2, (MessageLite)a2, (ahbm)null, 258602976, ahek.k, (Class)aqel.class);
    }
    
    private aqel() {
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = aqel.j) == null) {
                    synchronized (aqel.class) {
                        if (aqel.j == null) {
                            aqel.j = (ahdd)new ahba((ahbh)aqel.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqel.a;
            }
            case 4: {
                return new ahaz((ahbh)aqel.a);
            }
            case 3: {
                return new aqel();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqel.a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u1008\u0002\u0004\u1009\u0006\n\u100b\u0003\u000b\u100b\u0004\f\u100b\u0005", new Object[] { "k", "c", "d", "e", "i", "f", "g", "h" });
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
