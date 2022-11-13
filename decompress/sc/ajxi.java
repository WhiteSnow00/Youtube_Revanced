import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxi extends ahbh implements ahcw
{
    public static final ajxi a;
    public static final ahbf b;
    private static volatile ahdd e;
    public String c;
    public String d;
    private int f;
    
    static {
        final ajxi a2 = new ajxi();
        ahbh.registerDefaultInstance((Class)ajxi.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 421321174, ahek.k, (Class)ajxi.class);
    }
    
    private ajxi() {
        this.c = "";
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
                if ((e = ajxi.e) == null) {
                    synchronized (ajxi.class) {
                        if (ajxi.e == null) {
                            ajxi.e = (ahdd)new ahba((ahbh)ajxi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajxi.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxi.a);
            }
            case 3: {
                return new ajxi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxi.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0001", new Object[] { "f", "c", "d" });
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
